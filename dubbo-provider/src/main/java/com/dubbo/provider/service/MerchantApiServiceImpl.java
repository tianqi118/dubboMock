package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.mock.facade.MerchantApiService;
import com.dubbo.provider.constant.MockDataConstant;
import com.dubbo.mock.model.MerchantInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商户信息服务接口-实现
 *
 * @author zhenbl
 */
@Slf4j
@Service
@Component
public class MerchantApiServiceImpl implements MerchantApiService {

    /**
     * 获取人员列表
     */
    @Override
    public List<MerchantInfoVO> listMerchantInfo() {
        log.info("【生产者服务】>> 获取人员列表 >> 请求时间戳={}", System.currentTimeMillis());
        return MockDataConstant.merchantMockList;
    }
}