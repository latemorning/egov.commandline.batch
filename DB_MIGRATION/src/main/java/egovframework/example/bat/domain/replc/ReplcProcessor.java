package egovframework.example.bat.domain.replc;

import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemProcessor;

public class ReplcProcessor implements ItemProcessor<ShopInfo, Replc> {

    public ReplcProcessor() {
    }


    @Override
    public Replc process(ShopInfo item) throws Exception {

        Replc replc = new Replc();

        replc.setReplcCode(StringUtils.trim(item.getShopCode()));
        replc.setReplcTy(StringUtils.trim(item.getShopType()));
        replc.setReplcNm(new String((StringUtils.trim(StringUtils.defaultString(item.getShopName()))).getBytes("ISO8859_1"), "KSC5601"));
        replc.setReplcGdcc(new String((StringUtils.trim(StringUtils.defaultString(item.getShopCalSct()))).getBytes("ISO8859_1"), "KSC5601"));
        replc.setSmsDsptchNo(StringUtils.replace(StringUtils.trim(item.getShopSmsSedno()), "-", ""));
        replc.setReplcExcpGdcc(new String((StringUtils.trim(StringUtils.defaultString(item.getShopExc()))).getBytes("ISO8859_1"), "KSC5601"));
        replc.setReplcEmail(StringUtils.trim(item.getShopEmail()));
        replc.setUseAt(StringUtils.trim(item.getShopDelMk()));
        replc.setRemark(new String((StringUtils.trim(StringUtils.defaultString(item.getShopRemark()))).getBytes("ISO8859_1"), "KSC5601"));
        replc.setFrstRegisterId(StringUtils.trim(item.getRegId()));
        replc.setFrstRegistPnttm(StringUtils.trim(item.getRegDt()));
        replc.setLastUpdusrId(StringUtils.trim(item.getChgId()));
        replc.setLastUpdtPnttm(StringUtils.trim(item.getChgDt()));
        replc.setHdqrtrsCode(StringUtils.trim(item.getRegnFg()));
        replc.setScdCallUseAt(StringUtils.trim(item.getCal2UsrMk()));

        return replc;
    }

}
