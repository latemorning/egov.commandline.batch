package egovframework.example.bat.domain.replc;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SHOP_INFO")
public class ShopInfo {

    private String shopCode = "";
    private String shopType = "";
    private String shopName = "";
    private String usrId = "";
    private String shopCalSct = "";
    private String shopSmsSct = "";
    private String shopSmsMk = "";
    private String shopSmsAbsSct = "";
    private String shopSmsAbsMk = "";
    private String shopSmsSedno = "";
    private String shopExc = "";
    private String shopEmail = "";
    private String shopDelMk = "";
    private String shopRemark = "";
    private String regId = "";
    private String regDt = "";
    private String chgId = "";
    private String chgDt = "";
    private String shopOtSeq = "";
    private String regnFg = "";
    private String shopSmsResSct = "";
    private String shopSmsResMk = "";
    private String shopSmsResbSct = "";
    private String shopSmsResbMk = "";
    private String cal2UsrMk = "";


    public ShopInfo() {
    }


    public ShopInfo(String shopCode, String shopType, String shopName, String usrId, String shopCalSct, String shopSmsSct, String shopSmsMk,
            String shopSmsAbsSct, String shopSmsAbsMk, String shopSmsSedno, String shopExc, String shopEmail, String shopDelMk, String shopRemark, String regId,
            String regDt, String chgId, String chgDt, String shopOtSeq, String regnFg, String shopSmsResSct, String shopSmsResMk, String shopSmsResbSct,
            String shopSmsResbMk, String cal2UsrMk) {
        super();
        this.shopCode = shopCode;
        this.shopType = shopType;
        this.shopName = shopName;
        this.usrId = usrId;
        this.shopCalSct = shopCalSct;
        this.shopSmsSct = shopSmsSct;
        this.shopSmsMk = shopSmsMk;
        this.shopSmsAbsSct = shopSmsAbsSct;
        this.shopSmsAbsMk = shopSmsAbsMk;
        this.shopSmsSedno = shopSmsSedno;
        this.shopExc = shopExc;
        this.shopEmail = shopEmail;
        this.shopDelMk = shopDelMk;
        this.shopRemark = shopRemark;
        this.regId = regId;
        this.regDt = regDt;
        this.chgId = chgId;
        this.chgDt = chgDt;
        this.shopOtSeq = shopOtSeq;
        this.regnFg = regnFg;
        this.shopSmsResSct = shopSmsResSct;
        this.shopSmsResMk = shopSmsResMk;
        this.shopSmsResbSct = shopSmsResbSct;
        this.shopSmsResbMk = shopSmsResbMk;
        this.cal2UsrMk = cal2UsrMk;
    }


    @Override
    public String toString() {

        return "ShopInfo [shopCode=" + shopCode + ", shopType=" + shopType + ", shopName=" + shopName + ", usrId=" + usrId + ", shopCalSct=" + shopCalSct
                + ", shopSmsSct=" + shopSmsSct + ", shopSmsMk=" + shopSmsMk + ", shopSmsAbsSct=" + shopSmsAbsSct + ", shopSmsAbsMk=" + shopSmsAbsMk
                + ", shopSmsSedno=" + shopSmsSedno + ", shopExc=" + shopExc + ", shopEmail=" + shopEmail + ", shopDelMk=" + shopDelMk + ", shopRemark="
                + shopRemark + ", regId=" + regId + ", regDt=" + regDt + ", chgId=" + chgId + ", chgDt=" + chgDt + ", shopOtSeq=" + shopOtSeq + ", regnFg="
                + regnFg + ", shopSmsResSct=" + shopSmsResSct + ", shopSmsResMk=" + shopSmsResMk + ", shopSmsResbSct=" + shopSmsResbSct + ", shopSmsResbMk="
                + shopSmsResbMk + ", cal2UsrMk=" + cal2UsrMk + "]";
    }


    public String getShopCode() {

        return shopCode;
    }


    public void setShopCode(String shopCode) {

        this.shopCode = shopCode;
    }


    public String getShopType() {

        return shopType;
    }


    public void setShopType(String shopType) {

        this.shopType = shopType;
    }


    public String getShopName() {

        return shopName;
    }


    public void setShopName(String shopName) {

        this.shopName = shopName;
    }


    public String getUsrId() {

        return usrId;
    }


    public void setUsrId(String usrId) {

        this.usrId = usrId;
    }


    public String getShopCalSct() {

        return shopCalSct;
    }


    public void setShopCalSct(String shopCalSct) {

        this.shopCalSct = shopCalSct;
    }


    public String getShopSmsSct() {

        return shopSmsSct;
    }


    public void setShopSmsSct(String shopSmsSct) {

        this.shopSmsSct = shopSmsSct;
    }


    public String getShopSmsMk() {

        return shopSmsMk;
    }


    public void setShopSmsMk(String shopSmsMk) {

        this.shopSmsMk = shopSmsMk;
    }


    public String getShopSmsAbsSct() {

        return shopSmsAbsSct;
    }


    public void setShopSmsAbsSct(String shopSmsAbsSct) {

        this.shopSmsAbsSct = shopSmsAbsSct;
    }


    public String getShopSmsAbsMk() {

        return shopSmsAbsMk;
    }


    public void setShopSmsAbsMk(String shopSmsAbsMk) {

        this.shopSmsAbsMk = shopSmsAbsMk;
    }


    public String getShopSmsSedno() {

        return shopSmsSedno;
    }


    public void setShopSmsSedno(String shopSmsSedno) {

        this.shopSmsSedno = shopSmsSedno;
    }


    public String getShopExc() {

        return shopExc;
    }


    public void setShopExc(String shopExc) {

        this.shopExc = shopExc;
    }


    public String getShopEmail() {

        return shopEmail;
    }


    public void setShopEmail(String shopEmail) {

        this.shopEmail = shopEmail;
    }


    public String getShopDelMk() {

        return shopDelMk;
    }


    public void setShopDelMk(String shopDelMk) {

        this.shopDelMk = shopDelMk;
    }


    public String getShopRemark() {

        return shopRemark;
    }


    public void setShopRemark(String shopRemark) {

        this.shopRemark = shopRemark;
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


    public String getShopOtSeq() {

        return shopOtSeq;
    }


    public void setShopOtSeq(String shopOtSeq) {

        this.shopOtSeq = shopOtSeq;
    }


    public String getRegnFg() {

        return regnFg;
    }


    public void setRegnFg(String regnFg) {

        this.regnFg = regnFg;
    }


    public String getShopSmsResSct() {

        return shopSmsResSct;
    }


    public void setShopSmsResSct(String shopSmsResSct) {

        this.shopSmsResSct = shopSmsResSct;
    }


    public String getShopSmsResMk() {

        return shopSmsResMk;
    }


    public void setShopSmsResMk(String shopSmsResMk) {

        this.shopSmsResMk = shopSmsResMk;
    }


    public String getShopSmsResbSct() {

        return shopSmsResbSct;
    }


    public void setShopSmsResbSct(String shopSmsResbSct) {

        this.shopSmsResbSct = shopSmsResbSct;
    }


    public String getShopSmsResbMk() {

        return shopSmsResbMk;
    }


    public void setShopSmsResbMk(String shopSmsResbMk) {

        this.shopSmsResbMk = shopSmsResbMk;
    }


    public String getCal2UsrMk() {

        return cal2UsrMk;
    }


    public void setCal2UsrMk(String cal2UsrMk) {

        this.cal2UsrMk = cal2UsrMk;
    }

}
