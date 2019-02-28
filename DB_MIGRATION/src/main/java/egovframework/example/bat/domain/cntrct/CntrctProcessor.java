package egovframework.example.bat.domain.cntrct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemProcessor;

public class CntrctProcessor implements ItemProcessor<Cntrct, CallGoodsMapng> {

    public CntrctProcessor() {
    }


    @Override
    public CallGoodsMapng process(Cntrct item) throws Exception {

        CallGoodsMapng callGoodsMapng = new CallGoodsMapng();

        callGoodsMapng.setReplcCode(StringUtils.trim(item.getShopCode()));
        callGoodsMapng.setGoodsCode(StringUtils.trim(item.getCgdCd()));
        callGoodsMapng.setCntrctEndde(StringUtils.trim(item.getScrDate()));
        callGoodsMapng.setChargerNm(new String((StringUtils.trim(StringUtils.defaultString(item.getScrMngNm()))).getBytes("ISO8859_1"), "KSC5601"));
        callGoodsMapng.setChargerTelno(StringUtils.replace(StringUtils.replace(StringUtils.trim(item.getScrMngTel()), "-", ""), ")", ""));
        callGoodsMapng.setChargerEmail(new String((StringUtils.trim(StringUtils.defaultString(item.getScrMngEmail()))).getBytes("ISO8859_1"), "KSC5601"));
        callGoodsMapng.setRemark(new String((StringUtils.trim(StringUtils.defaultString(item.getScrRemark()))).getBytes("ISO8859_1"), "KSC5601"));
        callGoodsMapng.setFrstRegistPnttm(StringUtils.trim(item.getRegDt()));
        callGoodsMapng.setFrstRegisterId(StringUtils.trim(item.getRegId()));
        callGoodsMapng.setLastUpdtPnttm(StringUtils.trim(item.getChgDt()));
        callGoodsMapng.setLastUpdusrId(StringUtils.trim(item.getChgId()));

        return callGoodsMapng;
    }

}
