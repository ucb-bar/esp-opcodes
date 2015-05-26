SHELL := /bin/sh

ISASIM_H := ../esp-isa-sim/riscv/encoding.h
ISASIM_HWACHA_H := ../esp-isa-sim/hwacha/opcodes_hwacha.h
ISASIM_HWACHA_UT_H := ../esp-isa-sim/hwacha/opcodes_hwacha_ut.h
PK_H := ../riscv-pk/pk/encoding.h
FESVR_H := ../riscv-fesvr/fesvr/encoding.h
ENV_H := ../esp-tests/env/encoding.h
GAS_H := ../esp-gnu-toolchain/binutils/include/opcode/riscv-opc.h
XCC_H := ../esp-gnu-toolchain/gcc/gcc/config/riscv/riscv-opc.h

ALL_OPCODES := opcodes opcodes-pseudo opcodes-rvc opcodes-hwacha opcodes-hwacha-pseudo opcodes-hwacha-ut opcodes-hwacha-ut-pseudo opcodes-custom

install: $(ISASIM_H) $(ISASIM_HWACHA_H) $(ISASIM_HWACHA_UT_H) $(PK_H) $(FESVR_H) $(ENV_H) $(GAS_H) $(XCC_H) inst.chisel inst-hwacha.scala instr-table.tex priv-instr-table.tex instr-hwacha-table.tex

$(ISASIM_H) $(PK_H) $(FESVR_H) $(ENV_H): $(ALL_OPCODES) parse-opcodes encoding.h
	cp encoding.h $@
	cat opcodes opcodes-rvc | ./parse-opcodes -c >> $@

$(GAS_H) $(XCC_H): $(ALL_OPCODES) parse-opcodes
	cat $(ALL_OPCODES) | ./parse-opcodes -c > $@

$(ISASIM_HWACHA_H): $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha opcodes-hwacha-pseudo | ./parse-opcodes -c | \
	cpp -P -D DECLARE_INSN=DECLARE_INSN | sort -o $@

$(ISASIM_HWACHA_UT_H): $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha-ut | ./parse-opcodes -c | \
	cpp -P -D DECLARE_INSN=DECLARE_INSN | sort -o $@

inst.chisel: $(ALL_OPCODES) parse-opcodes
	cat opcodes opcodes-custom | ./parse-opcodes -chisel > $@

inst-hwacha.scala: $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha opcodes-hwacha-ut opcodes-hwacha-ut-pseudo | ./parse-opcodes -hchisel > $@

instr-table.tex: $(ALL_OPCODES) parse-opcodes
	cat opcodes opcodes-pseudo | ./parse-opcodes -tex > $@

instr-hwacha-table.tex: $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha opcodes-hwacha-pseudo opcodes-hwacha-ut opcodes-hwacha-ut-pseudo | ./parse-opcodes -htex > $@

priv-instr-table.tex: $(ALL_OPCODES) parse-opcodes
	cat opcodes opcodes-pseudo | ./parse-opcodes -privtex > $@

.PHONY : install
