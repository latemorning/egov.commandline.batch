package egovframework.example.bat.domain.callty;

import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemProcessor;

public class CallTyProcessor implements ItemProcessor<CallTypeInfo, CallTy> {

    public CallTyProcessor() {
    }


    @Override
    public CallTy process(CallTypeInfo item) throws Exception {

        CallTy callTy = new CallTy();

        callTy.setCallTyCode(StringUtils.trim(item.getCtfCd()));
        callTy.setCallTySe(StringUtils.trim(item.getCtfTp()));
        callTy.setCallTyNm(new String(StringUtils.trim(item.getCtfNm()).getBytes("ISO8859_1"), "KSC5601"));
        callTy.setUseAt(StringUtils.trim(item.getCtfDelMk()));
        callTy.setSortOrdr(StringUtils.trim(item.getCtfOtSeq()));
        callTy.setOthsysCode(StringUtils.trim(item.getCtfSysCd()));
        callTy.setAbsnceCallAt(StringUtils.trim(item.getCtfAbsMk()));
        callTy.setSmsSndngAt(StringUtils.trim(item.getCtfSmsMk()));
        callTy.setSysCodeAt(StringUtils.trim(item.getCtfSysMk()));
        callTy.setExclCodeAt(StringUtils.trim(item.getCtfExcMk()));
        callTy.setFrstRegistPnttm(StringUtils.trim(item.getRegDt()));
        callTy.setFrstRegisterId(StringUtils.trim(item.getRegId()));
        callTy.setLastUpdtPnttm(StringUtils.trim(item.getChgDt()));
        callTy.setLastUpdusrId(StringUtils.trim(item.getChgId()));

        return callTy;
    }

}