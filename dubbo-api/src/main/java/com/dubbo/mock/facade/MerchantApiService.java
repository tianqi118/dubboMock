package com.dubbo.mock.facade;


import com.dubbo.mock.model.MerchantInfoVO;

import java.util.List;

/**
 * 公共对外接口 - 商户信息API服务接口
 *
 * @author zhenbl
 */
public interface MerchantApiService {

    /**
     * 获取商户信息列表
     */
    List<MerchantInfoVO> listMerchantInfo();
}
