package com.dubbo.mock.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhenbaolei
 * @Date 2020/8/1 14:48
 * @Version 1.0
 */
@Setter
@Getter
@ToString
public class StoreInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    //商户ID
    private String merchantId;
    //门店ID
    private String storeId;
    //门店名称
    private String storeName;
    //门店状态
    private String storeSts;

    public StoreInfoVO() {
    }

    public StoreInfoVO(String merchantId, String storeId, String storeName, String storeSts) {
        this.merchantId = merchantId;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeSts = storeSts;
    }
}
