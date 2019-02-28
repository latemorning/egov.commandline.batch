package egovframework.example.bat.domain.cntrct;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author harry SELECT 대상, 콜계약
 */
@Entity
@Table(name = "SHOP_CONTRACT_INFO")
public class Cntrct {

    private String shopCode = "";
    private String scrDate = "";
    private String cgdCd = "";
    private String scrMngNm = "";
    private String scrMngTel = "";
    private String scrMngEmail = "";
    private String scrEndDt = "";
    private String scrRemark = "";
    private String regId = "";
    private String regDt = "";
    private String chgId = "";
    private String chgDt = "";
    private String scrDelMk = "";


    public Cntrct() {

    }


    public Cntrct(String shopCode, String scrDate, String cgdCd, String scrMngNm, String scrMngTel, String scrMngEmail, String scrEndDt, String scrRemark,
            String regId, String regDt, String chgId, String chgDt, String scrDelMk) {
        super();
        this.shopCode = shopCode;
        this.scrDate = scrDate;
        this.cgdCd = cgdCd;
        this.scrMngNm = scrMngNm;
        this.scrMngTel = scrMngTel;
        this.scrMngEmail = scrMngEmail;
        this.scrEndDt = scrEndDt;
        this.scrRemark = scrRemark;
        this.regId = regId;
        this.regDt = regDt;
        this.chgId = chgId;
        this.chgDt = chgDt;
        this.scrDelMk = scrDelMk;
    }


    @Override
    public String toString() {

        return "Cntrct [shopCode=" + shopCode + ", scrDate=" + scrDate + ", cgdCd=" + cgdCd + ", scrMngNm=" + scrMngNm + ", scrMngTel=" + scrMngTel
                + ", scrMngEmail=" + scrMngEmail + ", scrEndDt=" + scrEndDt + ", scrRemark=" + scrRemark + ", regId=" + regId + ", regDt=" + regDt + ", chgId="
                + chgId + ", chgDt=" + chgDt + ", scrDelMk=" + scrDelMk + "]";
    }


    public String getShopCode() {

        return shopCode;
    }


    public void setShopCode(String shopCode) {

        this.shopCode = shopCode;
    }


    public String getScrDate() {

        return scrDate;
    }


    public void setScrDate(String scrDate) {

        this.scrDate = scrDate;
    }


    public String getCgdCd() {

        return cgdCd;
    }


    public void setCgdCd(String cgdCd) {

        this.cgdCd = cgdCd;
    }


    public String getScrMngNm() {

        return scrMngNm;
    }


    public void setScrMngNm(String scrMngNm) {

        this.scrMngNm = scrMngNm;
    }


    public String getScrMngTel() {

        return scrMngTel;
    }


    public void setScrMngTel(String scrMngTel) {

        this.scrMngTel = scrMngTel;
    }


    public String getScrMngEmail() {

        return scrMngEmail;
    }


    public void setScrMngEmail(String scrMngEmail) {

        this.scrMngEmail = scrMngEmail;
    }


    public String getScrEndDt() {

        return scrEndDt;
    }


    public void setScrEndDt(String scrEndDt) {

        this.scrEndDt = scrEndDt;
    }


    public String getScrRemark() {

        return scrRemark;
    }


    public void setScrRemark(String scrRemark) {

        this.scrRemark = scrRemark;
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


    public String getScrDelMk() {

        return scrDelMk;
    }


    public void setScrDelMk(String scrDelMk) {

        this.scrDelMk = scrDelMk;
    }

}
