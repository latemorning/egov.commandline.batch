package egovframework.example.bat.domain.replc;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OB_REPLC")
public class Replc {

    private String replcCode = "";
    private String replcTy = "";
    private String replcNm = "";
    private String replcGdcc = "";
    private String replcExcpGdcc = "";
    private String smsDsptchNo = "";
    private String replcEmail = "";
    private String useAt = "";
    private String scdCallUseAt = "";
    private String hdqrtrsCode = "";
    private String remark = "";
    private String frstRegistPnttm = "";
    private String frstRegisterId = "";
    private String lastUpdtPnttm = "";
    private String lastUpdusrId = "";


    public Replc() {

    }


    public Replc(String replcCode, String replcTy, String replcNm, String replcGdcc, String replcExcpGdcc, String smsDsptchNo, String replcEmail, String useAt,
            String scdCallUseAt, String hdqrtrsCode, String remark, String frstRegistPnttm, String frstRegisterId, String lastUpdtPnttm, String lastUpdusrId) {
        super();
        this.replcCode = replcCode;
        this.replcTy = replcTy;
        this.replcNm = replcNm;
        this.replcGdcc = replcGdcc;
        this.replcExcpGdcc = replcExcpGdcc;
        this.smsDsptchNo = smsDsptchNo;
        this.replcEmail = replcEmail;
        this.useAt = useAt;
        this.scdCallUseAt = scdCallUseAt;
        this.hdqrtrsCode = hdqrtrsCode;
        this.remark = remark;
        this.frstRegistPnttm = frstRegistPnttm;
        this.frstRegisterId = frstRegisterId;
        this.lastUpdtPnttm = lastUpdtPnttm;
        this.lastUpdusrId = lastUpdusrId;
    }


    @Override
    public String toString() {

        return "Replc [replcCode=" + replcCode + ", replcTy=" + replcTy + ", replcNm=" + replcNm + ", replcGdcc=" + replcGdcc + ", replcExcpGdcc="
                + replcExcpGdcc + ", smsDsptchNo=" + smsDsptchNo + ", replcEmail=" + replcEmail + ", useAt=" + useAt + ", scdCallUseAt=" + scdCallUseAt
                + ", hdqrtrsCode=" + hdqrtrsCode + ", remark=" + remark + ", frstRegistPnttm=" + frstRegistPnttm + ", frstRegisterId=" + frstRegisterId
                + ", lastUpdtPnttm=" + lastUpdtPnttm + ", lastUpdusrId=" + lastUpdusrId + "]";
    }


    public String getReplcCode() {

        return replcCode;
    }


    public void setReplcCode(String replcCode) {

        this.replcCode = replcCode;
    }


    public String getReplcTy() {

        return replcTy;
    }


    public void setReplcTy(String replcTy) {

        this.replcTy = replcTy;
    }


    public String getReplcNm() {

        return replcNm;
    }


    public void setReplcNm(String replcNm) {

        this.replcNm = replcNm;
    }


    public String getReplcGdcc() {

        return replcGdcc;
    }


    public void setReplcGdcc(String replcGdcc) {

        this.replcGdcc = replcGdcc;
    }


    public String getReplcExcpGdcc() {

        return replcExcpGdcc;
    }


    public void setReplcExcpGdcc(String replcExcpGdcc) {

        this.replcExcpGdcc = replcExcpGdcc;
    }


    public String getSmsDsptchNo() {

        return smsDsptchNo;
    }


    public void setSmsDsptchNo(String smsDsptchNo) {

        this.smsDsptchNo = smsDsptchNo;
    }


    public String getReplcEmail() {

        return replcEmail;
    }


    public void setReplcEmail(String replcEmail) {

        this.replcEmail = replcEmail;
    }


    public String getUseAt() {

        return useAt;
    }


    public void setUseAt(String useAt) {

        this.useAt = useAt;
    }


    public String getScdCallUseAt() {

        return scdCallUseAt;
    }


    public void setScdCallUseAt(String scdCallUseAt) {

        this.scdCallUseAt = scdCallUseAt;
    }


    public String getHdqrtrsCode() {

        return hdqrtrsCode;
    }


    public void setHdqrtrsCode(String hdqrtrsCode) {

        this.hdqrtrsCode = hdqrtrsCode;
    }


    public String getRemark() {

        return remark;
    }


    public void setRemark(String remark) {

        this.remark = remark;
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
