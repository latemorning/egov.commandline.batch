package egovframework.example.bat.domain.callty;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CALL_TYPE_INFO")
public class CallTypeInfo {

    public CallTypeInfo() {
    }


    private String ctfCd = "";
    private String ctfTp = "";
    private String ctfNm = "";
    private String ctfDelMk = "";
    private String ctfOtSeq = "";
    private String ctfSysCd = "";
    private String regId = "";
    private String regDt = "";
    private String chgId = "";
    private String chgDt = "";
    private String ctfAbsMk = "";
    private String ctfSmsMk = "";
    private String ctfSysMk = "";
    private String ctfExcMk = "";


    public CallTypeInfo(String ctfCd, String ctfTp, String ctfNm, String ctfDelMk, String ctfOtSeq, String ctfSysCd, String regId, String regDt, String chgId,
            String chgDt, String ctfAbsMk, String ctfSmsMk, String ctfSysMk, String ctfExcMk) {
        super();
        this.ctfCd = ctfCd;
        this.ctfTp = ctfTp;
        this.ctfNm = ctfNm;
        this.ctfDelMk = ctfDelMk;
        this.ctfOtSeq = ctfOtSeq;
        this.ctfSysCd = ctfSysCd;
        this.regId = regId;
        this.regDt = regDt;
        this.chgId = chgId;
        this.chgDt = chgDt;
        this.ctfAbsMk = ctfAbsMk;
        this.ctfSmsMk = ctfSmsMk;
        this.ctfSysMk = ctfSysMk;
        this.ctfExcMk = ctfExcMk;
    }


    @Override
    public String toString() {

        return "CallTypeInfo [ctfCd=" + ctfCd + ", ctfTp=" + ctfTp + ", ctfNm=" + ctfNm + ", ctfDelMk=" + ctfDelMk + ", ctfOtSeq=" + ctfOtSeq + ", ctfSysCd="
                + ctfSysCd + ", regId=" + regId + ", regDt=" + regDt + ", chgId=" + chgId + ", chgDt=" + chgDt + ", ctfAbsMk=" + ctfAbsMk + ", ctfSmsMk="
                + ctfSmsMk + ", ctfSysMk=" + ctfSysMk + ", ctfExcMk=" + ctfExcMk + "]";
    }


    public String getCtfCd() {

        return ctfCd;
    }


    public void setCtfCd(String ctfCd) {

        this.ctfCd = ctfCd;
    }


    public String getCtfTp() {

        return ctfTp;
    }


    public void setCtfTp(String ctfTp) {

        this.ctfTp = ctfTp;
    }


    public String getCtfNm() {

        return ctfNm;
    }


    public void setCtfNm(String ctfNm) {

        this.ctfNm = ctfNm;
    }


    public String getCtfDelMk() {

        return ctfDelMk;
    }


    public void setCtfDelMk(String ctfDelMk) {

        this.ctfDelMk = ctfDelMk;
    }


    public String getCtfOtSeq() {

        return ctfOtSeq;
    }


    public void setCtfOtSeq(String ctfOtSeq) {

        this.ctfOtSeq = ctfOtSeq;
    }


    public String getCtfSysCd() {

        return ctfSysCd;
    }


    public void setCtfSysCd(String ctfSysCd) {

        this.ctfSysCd = ctfSysCd;
    }


    public String getRegId() {

        return regId;
    }


    public void setRegId(String regId) {

        this.regId = regId;
    }


    public String getRegDt() {

        return regDt;
    }


    public void setRegDt(String regDt) {

        this.regDt = regDt;
    }


    public String getChgId() {

        return chgId;
    }


    public void setChgId(String chgId) {

        this.chgId = chgId;
    }


    public String getChgDt() {

        return chgDt;
    }


    public void setChgDt(String chgDt) {

        this.chgDt = chgDt;
    }


    public String getCtfAbsMk() {

        return ctfAbsMk;
    }


    public void setCtfAbsMk(String ctfAbsMk) {

        this.ctfAbsMk = ctfAbsMk;
    }


    public String getCtfSmsMk() {

        return ctfSmsMk;
    }


    public void setCtfSmsMk(String ctfSmsMk) {

        this.ctfSmsMk = ctfSmsMk;
    }


    public String getCtfSysMk() {

        return ctfSysMk;
    }


    public void setCtfSysMk(String ctfSysMk) {

        this.ctfSysMk = ctfSysMk;
    }


    public String getCtfExcMk() {

        return ctfExcMk;
    }


    public void setCtfExcMk(String ctfExcMk) {

        this.ctfExcMk = ctfExcMk;
    }

}