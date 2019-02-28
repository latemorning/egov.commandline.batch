package egovframework.example.bat.domain.callty;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OB_CALL_TY")
public class CallTy {

    public CallTy() {
    }


    private String callTyCode = "";
    private String callTySe = "";
    private String callTyNm = "";
    private String useAt = "";
    private String sortOrdr = "";
    private String othsysCode = "";
    private String absnceCallAt = "";
    private String smsSndngAt = "";
    private String sysCodeAt = "";
    private String exclCodeAt = "";
    private String frstRegistPnttm = "";
    private String frstRegisterId = "";
    private String lastUpdtPnttm = "";
    private String lastUpdusrId = "";


    public CallTy(String callTyCode, String callTySe, String callTyNm, String useAt, String sortOrdr, String othsysCode, String absnceCallAt, String smsSndngAt,
            String sysCodeAt, String exclCodeAt, String frstRegistPnttm, String frstRegisterId, String lastUpdtPnttm, String lastUpdusrId) {
        super();
        this.callTyCode = callTyCode;
        this.callTySe = callTySe;
        this.callTyNm = callTyNm;
        this.useAt = useAt;
        this.sortOrdr = sortOrdr;
        this.othsysCode = othsysCode;
        this.absnceCallAt = absnceCallAt;
        this.smsSndngAt = smsSndngAt;
        this.sysCodeAt = sysCodeAt;
        this.exclCodeAt = exclCodeAt;
        this.frstRegistPnttm = frstRegistPnttm;
        this.frstRegisterId = frstRegisterId;
        this.lastUpdtPnttm = lastUpdtPnttm;
        this.lastUpdusrId = lastUpdusrId;
    }


    @Override
    public String toString() {

        return "CallTy [callTyCode=" + callTyCode + ", callTySe=" + callTySe + ", callTyNm=" + callTyNm + ", useAt=" + useAt + ", sortOrdr=" + sortOrdr
                + ", othsysCode=" + othsysCode + ", absnceCallAt=" + absnceCallAt + ", smsSndngAt=" + smsSndngAt + ", sysCodeAt=" + sysCodeAt + ", exclCodeAt="
                + exclCodeAt + ", frstRegistPnttm=" + frstRegistPnttm + ", frstRegisterId=" + frstRegisterId + ", lastUpdtPnttm=" + lastUpdtPnttm
                + ", lastUpdusrId=" + lastUpdusrId + "]";
    }


    public String getCallTyCode() {

        return callTyCode;
    }


    public void setCallTyCode(String callTyCode) {

        this.callTyCode = callTyCode;
    }


    public String getCallTySe() {

        return callTySe;
    }


    public void setCallTySe(String callTySe) {

        this.callTySe = callTySe;
    }


    public String getCallTyNm() {

        return callTyNm;
    }


    public void setCallTyNm(String callTyNm) {

        this.callTyNm = callTyNm;
    }


    public String getUseAt() {

        return useAt;
    }


    public void setUseAt(String useAt) {

        this.useAt = useAt;
    }


    public String getSortOrdr() {

        return sortOrdr;
    }


    public void setSortOrdr(String sortOrdr) {

        this.sortOrdr = sortOrdr;
    }


    public String getOthsysCode() {

        return othsysCode;
    }


    public void setOthsysCode(String othsysCode) {

        this.othsysCode = othsysCode;
    }


    public String getAbsnceCallAt() {

        return absnceCallAt;
    }


    public void setAbsnceCallAt(String absnceCallAt) {

        this.absnceCallAt = absnceCallAt;
    }


    public String getSmsSndngAt() {

        return smsSndngAt;
    }


    public void setSmsSndngAt(String smsSndngAt) {

        this.smsSndngAt = smsSndngAt;
    }


    public String getSysCodeAt() {

        return sysCodeAt;
    }


    public void setSysCodeAt(String sysCodeAt) {

        this.sysCodeAt = sysCodeAt;
    }


    public String getExclCodeAt() {

        return exclCodeAt;
    }


    public void setExclCodeAt(String exclCodeAt) {

        this.exclCodeAt = exclCodeAt;
    }


    public String getFrstRegistPnttm() {

        return frstRegistPnttm;
    }


    public void setFrstRegistPnttm(String frstRegistPnttm) {

        this.frstRegistPnttm = frstRegistPnttm;
    }


    public String getFrstRegisterId() {

        return frstRegisterId;
    }


    public void setFrstRegisterId(String frstRegisterId) {

        this.frstRegisterId = frstRegisterId;
    }


    public String getLastUpdtPnttm() {

        return lastUpdtPnttm;
    }


    public void setLastUpdtPnttm(String lastUpdtPnttm) {

        this.lastUpdtPnttm = lastUpdtPnttm;
    }


    public String getLastUpdusrId() {

        return lastUpdusrId;
    }


    public void setLastUpdusrId(String lastUpdusrId) {

        this.lastUpdusrId = lastUpdusrId;
    }

}
