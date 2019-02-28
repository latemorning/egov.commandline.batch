package egovframework.example.bat.domain.cntrct;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author harry INSERT 대상, 콜계약
 */
@Entity
@Table(name = "OB_REPLC_CALLGOODS_MAPNG")
public class CallGoodsMapng {

    private String replcCode = "";
    private String goodsCode = "";
    private String cntrctEndde = "";
    private String chargerNm = "";
    private String chargerTelno = "";
    private String chargerEmail = "";
    private String remark = "";
    private String frstRegistPnttm = "";
    private String frstRegisterId = "";
    private String lastUpdtPnttm = "";
    private String lastUpdusrId = "";


    public CallGoodsMapng() {
    }


    public CallGoodsMapng(String replcCode, String goodsCode, String cntrctEndde, String chargerNm, String chargerTelno, String chargerEmail, String remark,
            String frstRegistPnttm, String frstRegisterId, String lastUpdtPnttm, String lastUpdusrId) {
        super();
        this.replcCode = replcCode;
        this.goodsCode = goodsCode;
        this.cntrctEndde = cntrctEndde;
        this.chargerNm = chargerNm;
        this.chargerTelno = chargerTelno;
        this.chargerEmail = chargerEmail;
        this.remark = remark;
        this.frstRegistPnttm = frstRegistPnttm;
        this.frstRegisterId = frstRegisterId;
        this.lastUpdtPnttm = lastUpdtPnttm;
        this.lastUpdusrId = lastUpdusrId;
    }


    @Override
    public String toString() {

        return "CallGoodsMapng [replcCode=" + replcCode + ", goodsCode=" + goodsCode + ", cntrctEndde=" + cntrctEndde + ", chargerNm=" + chargerNm
                + ", chargerTelno=" + chargerTelno + ", chargerEmail=" + chargerEmail + ", remark=" + remark + ", frstRegistPnttm=" + frstRegistPnttm
                + ", frstRegisterId=" + frstRegisterId + ", lastUpdtPnttm=" + lastUpdtPnttm + ", lastUpdusrId=" + lastUpdusrId + "]";
    }


    public String getReplcCode() {

        return replcCode;
    }


    public void setReplcCode(String replcCode) {

        this.replcCode = replcCode;
    }


    public String getGoodsCode() {

        return goodsCode;
    }


    public void setGoodsCode(String goodsCode) {

        this.goodsCode = goodsCode;
    }


    public String getCntrctEndde() {

        return cntrctEndde;
    }


    public void setCntrctEndde(String cntrctEndde) {

        this.cntrctEndde = cntrctEndde;
    }


    public String getChargerNm() {

        return chargerNm;
    }


    public void setChargerNm(String chargerNm) {

        this.chargerNm = chargerNm;
    }


    public String getChargerTelno() {

        return chargerTelno;
    }


    public void setChargerTelno(String chargerTelno) {

        this.chargerTelno = chargerTelno;
    }


    public String getChargerEmail() {

        return chargerEmail;
    }


    public void setChargerEmail(String chargerEmail) {

        this.chargerEmail = chargerEmail;
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
