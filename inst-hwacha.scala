/* Automatically generated by parse-opcodes */
package hwacha

import Chisel._

object HwachaInstructions {
  def VSETCFG            = BitPat("b?????????????????010000000001011")
  def VSETVL             = BitPat("b000000000000?????110?????0001011")
  def VGETCFG            = BitPat("b00000000000000000100?????0001011")
  def VGETVL             = BitPat("b00000010000000000100?????0001011")
  def VSETXRM            = BitPat("b000000000000?????111?????0001011")
  def VSETXSAT           = BitPat("b000000000000?????101?????0001011")
  def VGETXRM            = BitPat("b00000000000000000001?????0001011")
  def VGETXSAT           = BitPat("b00000010000000000001?????0001011")
  def VUNCFG             = BitPat("b00000100000000000000000000001011")
  def VMCS               = BitPat("b000001000????????010?????0101011")
  def VMCA               = BitPat("b000001100000?????010?????0101011")
  def VF                 = BitPat("b???????10000?????010?????0101011")
  def VFT                = BitPat("b???????10001?????010?????0101011")
  def VXCPTCAUSE         = BitPat("b00000000000000000100?????0101011")
  def VXCPTAUX           = BitPat("b00000010000000000100?????0101011")
  def VXCPTSAVE          = BitPat("b000000000000?????011000000101011")
  def VXCPTRESTORE       = BitPat("b000000100000?????011000000101011")
  def VXCPTKILL          = BitPat("b00000100000000000011000000101011")
  def VXCPTEVAC          = BitPat("b000001100000?????011000000101011")
  def VXCPTHOLD          = BitPat("b000010000000?????011000000101011")
  def VENQCMD            = BitPat("b0000101??????????011000000101011")
  def VENQIMM1           = BitPat("b0000110??????????011000000101011")
  def VENQIMM2           = BitPat("b0000111??????????011000000101011")
  def VENQCNT            = BitPat("b0001000??????????011000000101011")
}
object HwachaElementInstructions {
  def VEIDX              = BitPat("b1?00000001011000000000000000000?????????????????????011000111111")
  def VFIRST             = BitPat("b0100000001111000000000000000000?????????????????????011000111111")
  def VSTOP              = BitPat("b0000000000000000000000000000000000000000000000000000110000111111")
  def VFENCE             = BitPat("b0000000000100000000000000000000000000000????????0000110000111111")
  def VCJAL              = BitPat("b????????????????????????????????00000000????????????110110111111")
  def VCJALR             = BitPat("b????????????????????????????????????????????????????110010111111")
  def VLUI               = BitPat("b????????????????????????????????00000000????????0000011010111111")
  def VAUIPC             = BitPat("b????????????????????????????????00000000????????0000001010111111")
  def VADDI              = BitPat("b????????????????????????????????????????????????0000001000111111")
  def VSLTI              = BitPat("b????????????????????????????????????????????????0010001000111111")
  def VSLTIU             = BitPat("b????????????????????????????????????????????????0011001000111111")
  def VANDI              = BitPat("b????????????????????????????????????????????????0111001000111111")
  def VORI               = BitPat("b????????????????????????????????????????????????0110001000111111")
  def VXORI              = BitPat("b????????????????????????????????????????????????0100001000111111")
  def VSLLI              = BitPat("b00000000000000000000000000??????????????????????0001001000111111")
  def VSRLI              = BitPat("b00000000000000000000000000??????????????????????0101001000111111")
  def VSRAI              = BitPat("b00000100000000000000000000??????????????????????0101001000111111")
  def VADDIW             = BitPat("b????????????????????????????????????????????????0000001100111111")
  def VSLLIW             = BitPat("b000000000000000000000000000?????????????????????0001001100111111")
  def VSRLIW             = BitPat("b000000000000000000000000000?????????????????????0101001100111111")
  def VSRAIW             = BitPat("b000001000000000000000000000?????????????????????0101001100111111")
  def VPL                = BitPat("b10000000000000100000000000000000000?????0000????0000101100111111")
  def VPS                = BitPat("b100000000000001000000000000????0000?????000000000000111100111111")
  def VCMPEQ             = BitPat("b1??00000000000100000000?????????????????0000????????011000111111")
  def VCMPLT             = BitPat("b1??00000000100100000000?????????????????0000????????011000111111")
  def VCMPLTU            = BitPat("b1??00000000110100000000?????????????????0000????????011000111111")
  def VCMPFLE_D          = BitPat("b1??00000101000000010100?????????????????0000????????011000111111")
  def VCMPFLT_D          = BitPat("b1??00000101001000010100?????????????????0000????????011000111111")
  def VCMPFEQ_D          = BitPat("b1??00000101010000010100?????????????????0000????????011000111111")
  def VCMPFLE_S          = BitPat("b1??00000000000000010100?????????????????0000????????011000111111")
  def VCMPFLT_S          = BitPat("b1??00000000001000010100?????????????????0000????????011000111111")
  def VCMPFEQ_S          = BitPat("b1??00000000010000010100?????????????????0000????????011000111111")
  def VCMPFLE_H          = BitPat("b1??00001010000000010100?????????????????0000????????011000111111")
  def VCMPFLT_H          = BitPat("b1??00001010001000010100?????????????????0000????????011000111111")
  def VCMPFEQ_H          = BitPat("b1??00001010010000010100?????????????????0000????????011000111111")
  def VPOP               = BitPat("b100001????????10000????0000????00000????0000????0000011000111111")
  def VLSEGD             = BitPat("b1000000000000000???011000000000?000?????????????????101100111111")
  def VLSEGW             = BitPat("b1000000000000000???010000000000?000?????????????????101100111111")
  def VLSEGWU            = BitPat("b1000000000000000???110000000000?000?????????????????101100111111")
  def VLSEGH             = BitPat("b1000000000000000???001000000000?000?????????????????101100111111")
  def VLSEGHU            = BitPat("b1000000000000000???101000000000?000?????????????????101100111111")
  def VLSEGB             = BitPat("b1000000000000000???000000000000?000?????????????????101100111111")
  def VLSEGBU            = BitPat("b1000000000000000???100000000000?000?????????????????101100111111")
  def VLSEGSTD           = BitPat("b1000000000000000???0111000??????000?????????????????101100111111")
  def VLSEGSTW           = BitPat("b1000000000000000???0101000??????000?????????????????101100111111")
  def VLSEGSTWU          = BitPat("b1000000000000000???1101000??????000?????????????????101100111111")
  def VLSEGSTH           = BitPat("b1000000000000000???0011000??????000?????????????????101100111111")
  def VLSEGSTHU          = BitPat("b1000000000000000???1011000??????000?????????????????101100111111")
  def VLSEGSTB           = BitPat("b1000000000000000???0001000??????000?????????????????101100111111")
  def VLSEGSTBU          = BitPat("b1000000000000000???1001000??????000?????????????????101100111111")
  def VSSEGD             = BitPat("b1000000000000000???011000000000?000?????????????????111100111111")
  def VSSEGW             = BitPat("b1000000000000000???010000000000?000?????????????????111100111111")
  def VSSEGH             = BitPat("b1000000000000000???001000000000?000?????????????????111100111111")
  def VSSEGB             = BitPat("b1000000000000000???000000000000?000?????????????????111100111111")
  def VSSEGSTD           = BitPat("b1000000000000000???0111000??????000?????????????????111100111111")
  def VSSEGSTW           = BitPat("b1000000000000000???0101000??????000?????????????????111100111111")
  def VSSEGSTH           = BitPat("b1000000000000000???0011000??????000?????????????????111100111111")
  def VSSEGSTB           = BitPat("b1000000000000000???0001000??????000?????????????????111100111111")
  def VLSEGXD            = BitPat("b1010000000000000???0110?????????????????????????????101100111111")
  def VLSEGXW            = BitPat("b1010000000000000???0100?????????????????????????????101100111111")
  def VLSEGXWU           = BitPat("b1010000000000000???1100?????????????????????????????101100111111")
  def VLSEGXH            = BitPat("b1010000000000000???0010?????????????????????????????101100111111")
  def VLSEGXHU           = BitPat("b1010000000000000???1010?????????????????????????????101100111111")
  def VLSEGXB            = BitPat("b1010000000000000???0000?????????????????????????????101100111111")
  def VLSEGXBU           = BitPat("b1010000000000000???1000?????????????????????????????101100111111")
  def VSSEGXD            = BitPat("b1010000000000000???0110?????????????????????????????111100111111")
  def VSSEGXW            = BitPat("b1010000000000000???0100?????????????????????????????111100111111")
  def VSSEGXH            = BitPat("b1010000000000000???0010?????????????????????????????111100111111")
  def VSSEGXB            = BitPat("b1010000000000000???0000?????????????????????????????111100111111")
  def VLSSEGD            = BitPat("b0000000000000000???0110000000000????????????????0000101100111111")
  def VLSSEGW            = BitPat("b0000000000000000???0100000000000????????????????0000101100111111")
  def VLSSEGWU           = BitPat("b0000000000000000???1100000000000????????????????0000101100111111")
  def VLSSEGH            = BitPat("b0000000000000000???0010000000000????????????????0000101100111111")
  def VLSSEGHU           = BitPat("b0000000000000000???1010000000000????????????????0000101100111111")
  def VLSSEGB            = BitPat("b0000000000000000???0000000000000????????????????0000101100111111")
  def VLSSEGBU           = BitPat("b0000000000000000???1000000000000????????????????0000101100111111")
  def VSSSEGD            = BitPat("b0000000000000000???0110????????0????????000000000000111100111111")
  def VSSSEGW            = BitPat("b0000000000000000???0100????????0????????000000000000111100111111")
  def VSSSEGH            = BitPat("b0000000000000000???0010????????0????????000000000000111100111111")
  def VSSSEGB            = BitPat("b0000000000000000???0000????????0????????000000000000111100111111")
  def VLASEGD            = BitPat("b0000000000000001???0110000000000000?????????????0000101100111111")
  def VLASEGW            = BitPat("b0000000000000001???0100000000000000?????????????0000101100111111")
  def VLASEGWU           = BitPat("b0000000000000001???1100000000000000?????????????0000101100111111")
  def VLASEGH            = BitPat("b0000000000000001???0010000000000000?????????????0000101100111111")
  def VLASEGHU           = BitPat("b0000000000000001???1010000000000000?????????????0000101100111111")
  def VLASEGB            = BitPat("b0000000000000001???0000000000000000?????????????0000101100111111")
  def VLASEGBU           = BitPat("b0000000000000001???1000000000000000?????????????0000101100111111")
  def VSASEGD            = BitPat("b0000000000000001???0110????????0000?????000000000000111100111111")
  def VSASEGW            = BitPat("b0000000000000001???0100????????0000?????000000000000111100111111")
  def VSASEGH            = BitPat("b0000000000000001???0010????????0000?????000000000000111100111111")
  def VSASEGB            = BitPat("b0000000000000001???0000????????0000?????000000000000111100111111")
  def VADD               = BitPat("b???00000000000000000000?????????????????????????????011000111111")
  def VADDU              = BitPat("b???01000000000000000000?????????????????????????????011000111111")
  def VSUB               = BitPat("b???00100000000000000000?????????????????????????????011000111111")
  def VSLL               = BitPat("b???00000000001000000000?????????????????????????????011000111111")
  def VSLT               = BitPat("b???00000000010000000000?????????????????????????????011000111111")
  def VSLTU              = BitPat("b???00000000011000000000?????????????????????????????011000111111")
  def VXOR               = BitPat("b???00000000100000000000?????????????????????????????011000111111")
  def VSRL               = BitPat("b???00000000101000000000?????????????????????????????011000111111")
  def VSRA               = BitPat("b???00100000101000000000?????????????????????????????011000111111")
  def VOR                = BitPat("b???00000000110000000000?????????????????????????????011000111111")
  def VAND               = BitPat("b???00000000111000000000?????????????????????????????011000111111")
  def VMERGE             = BitPat("b???0000001000000000?????????????????????????????????011000111111")
  def VMIN               = BitPat("b???00000000000000000010?????????????????????????????011000111111")
  def VMINU              = BitPat("b???00000000000000000111?????????????????????????????011000111111")
  def VMAX               = BitPat("b???00000000000000000011?????????????????????????????011000111111")
  def VMAXU              = BitPat("b???00000000000000001000?????????????????????????????011000111111")
  def VCLIPW             = BitPat("b???00000000000000000100?????????????????????????????011000111111")
  def VCLIPH             = BitPat("b???00000000000000000101?????????????????????????????011000111111")
  def VCLIPB             = BitPat("b???00000000000000000110?????????????????????????????011000111111")
  def VADDW              = BitPat("b???00000000000000000000?????????????????????????????011100111111")
  def VSUBW              = BitPat("b???00100000000000000000?????????????????????????????011100111111")
  def VSLLW              = BitPat("b???00000000001000000000?????????????????????????????011100111111")
  def VSRLW              = BitPat("b???00000000101000000000?????????????????????????????011100111111")
  def VSRAW              = BitPat("b???00100000101000000000?????????????????????????????011100111111")
  def VMUL               = BitPat("b???00000001000000000000?????????????????????????????011000111111")
  def VMULH              = BitPat("b???00000001001000000000?????????????????????????????011000111111")
  def VMULHSU            = BitPat("b???00000001010000000000?????????????????????????????011000111111")
  def VMULHU             = BitPat("b???00000001011000000000?????????????????????????????011000111111")
  def VDIV               = BitPat("b???00000001100000000000?????????????????????????????011000111111")
  def VDIVU              = BitPat("b???00000001101000000000?????????????????????????????011000111111")
  def VREM               = BitPat("b???00000001110000000000?????????????????????????????011000111111")
  def VREMU              = BitPat("b???00000001111000000000?????????????????????????????011000111111")
  def VMADD              = BitPat("b????00011101110?????????????????????????????????????011000111111")
  def VMSUB              = BitPat("b????00011111110?????????????????????????????????????011000111111")
  def VMULW              = BitPat("b???00000001000000000000?????????????????????????????011100111111")
  def VDIVW              = BitPat("b???00000001100000000000?????????????????????????????011100111111")
  def VDIVUW             = BitPat("b???00000001101000000000?????????????????????????????011100111111")
  def VREMW              = BitPat("b???00000001110000000000?????????????????????????????011100111111")
  def VREMUW             = BitPat("b???00000001111000000000?????????????????????????????011100111111")
  def VAMOADD_W          = BitPat("b???000000??010000000000?????????????????????????????010110111111")
  def VAMOXOR_W          = BitPat("b???000100??010000000000?????????????????????????????010110111111")
  def VAMOOR_W           = BitPat("b???001000??010000000000?????????????????????????????010110111111")
  def VAMOAND_W          = BitPat("b???001100??010000000000?????????????????????????????010110111111")
  def VAMOMIN_W          = BitPat("b???010000??010000000000?????????????????????????????010110111111")
  def VAMOMAX_W          = BitPat("b???010100??010000000000?????????????????????????????010110111111")
  def VAMOMINU_W         = BitPat("b???011000??010000000000?????????????????????????????010110111111")
  def VAMOMAXU_W         = BitPat("b???011100??010000000000?????????????????????????????010110111111")
  def VAMOSWAP_W         = BitPat("b???000001??010000000000?????????????????????????????010110111111")
  def VAMOADD_D          = BitPat("b???000000??011000000000?????????????????????????????010110111111")
  def VAMOXOR_D          = BitPat("b???000100??011000000000?????????????????????????????010110111111")
  def VAMOOR_D           = BitPat("b???001000??011000000000?????????????????????????????010110111111")
  def VAMOAND_D          = BitPat("b???001100??011000000000?????????????????????????????010110111111")
  def VAMOMIN_D          = BitPat("b???010000??011000000000?????????????????????????????010110111111")
  def VAMOMAX_D          = BitPat("b???010100??011000000000?????????????????????????????010110111111")
  def VAMOMINU_D         = BitPat("b???011000??011000000000?????????????????????????????010110111111")
  def VAMOMAXU_D         = BitPat("b???011100??011000000000?????????????????????????????010110111111")
  def VAMOSWAP_D         = BitPat("b???000001??011000000000?????????????????????????????010110111111")
  def VREDSUM            = BitPat("b???00000001000000000000?????????????????????????????110110111111")
  def VFADD_S            = BitPat("b???00000000???000000000?????????????????????????????101000111111")
  def VFSUB_S            = BitPat("b???00000000???000000001?????????????????????????????101000111111")
  def VFMUL_S            = BitPat("b???00000000???000000010?????????????????????????????101000111111")
  def VFDIV_S            = BitPat("b???00000000???000000011?????????????????????????????101000111111")
  def VFSGNJ_S           = BitPat("b???00000000000000000100?????????????????????????????101000111111")
  def VFSGNJN_S          = BitPat("b???00000000001000000100?????????????????????????????101000111111")
  def VFSGNJX_S          = BitPat("b???00000000010000000100?????????????????????????????101000111111")
  def VFMIN_S            = BitPat("b???00000000000000000101?????????????????????????????101000111111")
  def VFMAX_S            = BitPat("b???00000000001000000101?????????????????????????????101000111111")
  def VFSQRT_S           = BitPat("b??000000000???00000101100000000?????????????????????101000111111")
  def VFCVT_W_S          = BitPat("b??000000000???00001100000000000?????????????????????101000111111")
  def VFCVT_WU_S         = BitPat("b??000000100???00001100000000000?????????????????????101000111111")
  def VFCVT_L_S          = BitPat("b??000001000???00001100000000000?????????????????????101000111111")
  def VFCVT_LU_S         = BitPat("b??000001100???00001100000000000?????????????????????101000111111")
  def VFCVT_S_W          = BitPat("b??000000000???00001101000000000?????????????????????101000111111")
  def VFCVT_S_WU         = BitPat("b??000000100???00001101000000000?????????????????????101000111111")
  def VFCVT_S_L          = BitPat("b??000001000???00001101000000000?????????????????????101000111111")
  def VFCVT_S_LU         = BitPat("b??000001100???00001101000000000?????????????????????101000111111")
  def VFCLASS_S          = BitPat("b??00000000000100001110000000000?????????????????????101000111111")
  def VFMADD_S           = BitPat("b????0000000???0?????????????????????????????????????100000111111")
  def VFMSUB_S           = BitPat("b????0000000???0?????????????????????????????????????100010111111")
  def VFNMSUB_S          = BitPat("b????0000000???0?????????????????????????????????????100100111111")
  def VFNMADD_S          = BitPat("b????0000000???0?????????????????????????????????????100110111111")
  def VFADD_D            = BitPat("b???00000101???000000000?????????????????????????????101000111111")
  def VFSUB_D            = BitPat("b???00000101???000000001?????????????????????????????101000111111")
  def VFMUL_D            = BitPat("b???00000101???000000010?????????????????????????????101000111111")
  def VFDIV_D            = BitPat("b???00000101???000000011?????????????????????????????101000111111")
  def VFSGNJ_D           = BitPat("b???00000101000000000100?????????????????????????????101000111111")
  def VFSGNJN_D          = BitPat("b???00000101001000000100?????????????????????????????101000111111")
  def VFSGNJX_D          = BitPat("b???00000101010000000100?????????????????????????????101000111111")
  def VFMIN_D            = BitPat("b???00000101000000000101?????????????????????????????101000111111")
  def VFMAX_D            = BitPat("b???00000101001000000101?????????????????????????????101000111111")
  def VFSQRT_D           = BitPat("b??000000101???00000101100000000?????????????????????101000111111")
  def VFCVT_S_D          = BitPat("b??000000001???00000100000000000?????????????????????101000111111")
  def VFCVT_D_S          = BitPat("b??000000100???00000100000000000?????????????????????101000111111")
  def VFCVT_W_D          = BitPat("b??000000001???00001100000000000?????????????????????101000111111")
  def VFCVT_WU_D         = BitPat("b??000000101???00001100000000000?????????????????????101000111111")
  def VFCVT_L_D          = BitPat("b??000001001???00001100000000000?????????????????????101000111111")
  def VFCVT_LU_D         = BitPat("b??000001101???00001100000000000?????????????????????101000111111")
  def VFCVT_D_W          = BitPat("b??000000001???00001101000000000?????????????????????101000111111")
  def VFCVT_D_WU         = BitPat("b??000000101???00001101000000000?????????????????????101000111111")
  def VFCVT_D_L          = BitPat("b??000001001???00001101000000000?????????????????????101000111111")
  def VFCVT_D_LU         = BitPat("b??000001101???00001101000000000?????????????????????101000111111")
  def VFCLASS_D          = BitPat("b??00000010100100001110000000000?????????????????????101000111111")
  def VFMADD_D           = BitPat("b????0000101???0?????????????????????????????????????100000111111")
  def VFMSUB_D           = BitPat("b????0000101???0?????????????????????????????????????100010111111")
  def VFNMSUB_D          = BitPat("b????0000101???0?????????????????????????????????????100100111111")
  def VFNMADD_D          = BitPat("b????0000101???0?????????????????????????????????????100110111111")
  def VFADD_H            = BitPat("b???00001010???000000000?????????????????????????????101000111111")
  def VFSUB_H            = BitPat("b???00001010???000000001?????????????????????????????101000111111")
  def VFMUL_H            = BitPat("b???00001010???000000010?????????????????????????????101000111111")
  def VFDIV_H            = BitPat("b???00001010???000000011?????????????????????????????101000111111")
  def VFSGNJ_H           = BitPat("b???00001010000000000100?????????????????????????????101000111111")
  def VFSGNJN_H          = BitPat("b???00001010001000000100?????????????????????????????101000111111")
  def VFSGNJX_H          = BitPat("b???00001010010000000100?????????????????????????????101000111111")
  def VFMIN_H            = BitPat("b???00001010000000000101?????????????????????????????101000111111")
  def VFMAX_H            = BitPat("b???00001010001000000101?????????????????????????????101000111111")
  def VFSQRT_H           = BitPat("b??000001010???00000101100000000?????????????????????101000111111")
  def VFCVT_D_H          = BitPat("b??000000110???00000100000000000?????????????????????101000111111")
  def VFCVT_H_D          = BitPat("b??000001001???00000100000000000?????????????????????101000111111")
  def VFCVT_S_H          = BitPat("b??000000010???00000100000000000?????????????????????101000111111")
  def VFCVT_H_S          = BitPat("b??000001000???00000100000000000?????????????????????101000111111")
  def VFCVT_W_H          = BitPat("b??000000010???00001100000000000?????????????????????101000111111")
  def VFCVT_WU_H         = BitPat("b??000000110???00001100000000000?????????????????????101000111111")
  def VFCVT_L_H          = BitPat("b??000001010???00001100000000000?????????????????????101000111111")
  def VFCVT_LU_H         = BitPat("b??000001110???00001100000000000?????????????????????101000111111")
  def VFCVT_H_W          = BitPat("b??000000010???00001101000000000?????????????????????101000111111")
  def VFCVT_H_WU         = BitPat("b??000000110???00001101000000000?????????????????????101000111111")
  def VFCVT_H_L          = BitPat("b??000001010???00001101000000000?????????????????????101000111111")
  def VFCVT_H_LU         = BitPat("b??000001110???00001101000000000?????????????????????101000111111")
  def VFCLASS_H          = BitPat("b??00000101000100001110000000000?????????????????????101000111111")
  def VFMADD_H           = BitPat("b????0001010???0?????????????????????????????????????100000111111")
  def VFMSUB_H           = BitPat("b????0001010???0?????????????????????????????????????100010111111")
  def VFNMSUB_H          = BitPat("b????0001010???0?????????????????????????????????????100100111111")
  def VFNMADD_H          = BitPat("b????0001010???0?????????????????????????????????????100110111111")
  def VFADD_S_H          = BitPat("b???00000110???000000000?????????????????????????????101000111111")
  def VFSUB_S_H          = BitPat("b???00000110???000000001?????????????????????????????101000111111")
  def VFMUL_S_H          = BitPat("b???00000110???000000010?????????????????????????????101000111111")
  def VFADD_D_H          = BitPat("b???00000010???000000000?????????????????????????????101000111111")
  def VFSUB_D_H          = BitPat("b???00000010???000000001?????????????????????????????101000111111")
  def VFMUL_D_H          = BitPat("b???00000010???000000010?????????????????????????????101000111111")
  def VFMADD_D_H         = BitPat("b????0000010???0?????????????????????????????????????100000111111")
  def VFMSUB_D_H         = BitPat("b????0000010???0?????????????????????????????????????100010111111")
  def VFNMSUB_D_H        = BitPat("b????0000010???0?????????????????????????????????????100100111111")
  def VFNMADD_D_H        = BitPat("b????0000010???0?????????????????????????????????????100110111111")
  def VFADD_D_S          = BitPat("b???00000001???000000000?????????????????????????????101000111111")
  def VFSUB_D_S          = BitPat("b???00000001???000000001?????????????????????????????101000111111")
  def VFMUL_D_S          = BitPat("b???00000001???000000010?????????????????????????????101000111111")
  def VLD                = BitPat("b1000000000000000000011000000000?000?????????????????101100111111")
  def VLW                = BitPat("b1000000000000000000010000000000?000?????????????????101100111111")
  def VLWU               = BitPat("b1000000000000000000110000000000?000?????????????????101100111111")
  def VLH                = BitPat("b1000000000000000000001000000000?000?????????????????101100111111")
  def VLHU               = BitPat("b1000000000000000000101000000000?000?????????????????101100111111")
  def VLB                = BitPat("b1000000000000000000000000000000?000?????????????????101100111111")
  def VLBU               = BitPat("b1000000000000000000100000000000?000?????????????????101100111111")
  def VLSTD              = BitPat("b10000000000000000000111000??????000?????????????????101100111111")
  def VLSTW              = BitPat("b10000000000000000000101000??????000?????????????????101100111111")
  def VLSTWU             = BitPat("b10000000000000000001101000??????000?????????????????101100111111")
  def VLSTH              = BitPat("b10000000000000000000011000??????000?????????????????101100111111")
  def VLSTHU             = BitPat("b10000000000000000001011000??????000?????????????????101100111111")
  def VLSTB              = BitPat("b10000000000000000000001000??????000?????????????????101100111111")
  def VLSTBU             = BitPat("b10000000000000000001001000??????000?????????????????101100111111")
  def VSD                = BitPat("b1000000000000000000011000000000?000?????????????????111100111111")
  def VSW                = BitPat("b1000000000000000000010000000000?000?????????????????111100111111")
  def VSH                = BitPat("b1000000000000000000001000000000?000?????????????????111100111111")
  def VSB                = BitPat("b1000000000000000000000000000000?000?????????????????111100111111")
  def VSSTD              = BitPat("b10000000000000000000111000??????000?????????????????111100111111")
  def VSSTW              = BitPat("b10000000000000000000101000??????000?????????????????111100111111")
  def VSSTH              = BitPat("b10000000000000000000011000??????000?????????????????111100111111")
  def VSSTB              = BitPat("b10000000000000000000001000??????000?????????????????111100111111")
  def VLXD               = BitPat("b10100000000000000000110?????????????????????????????101100111111")
  def VLXW               = BitPat("b10100000000000000000100?????????????????????????????101100111111")
  def VLXWU              = BitPat("b10100000000000000001100?????????????????????????????101100111111")
  def VLXH               = BitPat("b10100000000000000000010?????????????????????????????101100111111")
  def VLXHU              = BitPat("b10100000000000000001010?????????????????????????????101100111111")
  def VLXB               = BitPat("b10100000000000000000000?????????????????????????????101100111111")
  def VLXBU              = BitPat("b10100000000000000001000?????????????????????????????101100111111")
  def VSXD               = BitPat("b10100000000000000000110?????????????????????????????111100111111")
  def VSXW               = BitPat("b10100000000000000000100?????????????????????????????111100111111")
  def VSXH               = BitPat("b10100000000000000000010?????????????????????????????111100111111")
  def VSXB               = BitPat("b10100000000000000000000?????????????????????????????111100111111")
  def VLSD               = BitPat("b00000000000000000000110000000000????????????????0000101100111111")
  def VLSW               = BitPat("b00000000000000000000100000000000????????????????0000101100111111")
  def VLSWU              = BitPat("b00000000000000000001100000000000????????????????0000101100111111")
  def VLSH               = BitPat("b00000000000000000000010000000000????????????????0000101100111111")
  def VLSHU              = BitPat("b00000000000000000001010000000000????????????????0000101100111111")
  def VLSB               = BitPat("b00000000000000000000000000000000????????????????0000101100111111")
  def VLSBU              = BitPat("b00000000000000000001000000000000????????????????0000101100111111")
  def VSSD               = BitPat("b00000000000000000000110????????0????????000000000000111100111111")
  def VSSW               = BitPat("b00000000000000000000100????????0????????000000000000111100111111")
  def VSSH               = BitPat("b00000000000000000000010????????0????????000000000000111100111111")
  def VSSB               = BitPat("b00000000000000000000000????????0????????000000000000111100111111")
  def VLAD               = BitPat("b00000000000000010000110000000000000?????????????0000101100111111")
  def VLAW               = BitPat("b00000000000000010000100000000000000?????????????0000101100111111")
  def VLAWU              = BitPat("b00000000000000010001100000000000000?????????????0000101100111111")
  def VLAH               = BitPat("b00000000000000010000010000000000000?????????????0000101100111111")
  def VLAHU              = BitPat("b00000000000000010001010000000000000?????????????0000101100111111")
  def VLAB               = BitPat("b00000000000000010000000000000000000?????????????0000101100111111")
  def VLABU              = BitPat("b00000000000000010001000000000000000?????????????0000101100111111")
  def VSAD               = BitPat("b00000000000000010000110????????0000?????000000000000111100111111")
  def VSAW               = BitPat("b00000000000000010000100????????0000?????000000000000111100111111")
  def VSAH               = BitPat("b00000000000000010000010????????0000?????000000000000111100111111")
  def VSAB               = BitPat("b00000000000000010000000????????0000?????000000000000111100111111")
  def VPCLEAR            = BitPat("b10000100000000100000000000000000000000000000????0000011000111111")
  def VPSET              = BitPat("b10000111111111100000000000000000000000000000????0000011000111111")
  def VPXORXOR           = BitPat("b1000010110100110000????0000????00000????0000????0000011000111111")
  def VPXOROR            = BitPat("b1000010111110110000????0000????00000????0000????0000011000111111")
  def VPXORAND           = BitPat("b1000010001010010000????0000????00000????0000????0000011000111111")
  def VPORXOR            = BitPat("b1000010110101010000????0000????00000????0000????0000011000111111")
  def VPOROR             = BitPat("b1000010111111110000????0000????00000????0000????0000011000111111")
  def VPORAND            = BitPat("b1000010001010110000????0000????00000????0000????0000011000111111")
  def VPANDXOR           = BitPat("b1000010101011010000????0000????00000????0000????0000011000111111")
  def VPANDOR            = BitPat("b1000010101011110000????0000????00000????0000????0000011000111111")
  def VPANDAND           = BitPat("b1000010000000110000????0000????00000????0000????0000011000111111")
}
