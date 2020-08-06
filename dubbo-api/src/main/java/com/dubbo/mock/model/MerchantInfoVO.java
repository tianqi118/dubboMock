package com.dubbo.mock.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 商户信息Vo
 *
 * @author zhenbl
 */
@Data
public class MerchantInfoVO implements Serializable {
    private String merchantId;
    private String merchantName;
    private String merchantSts;
    private String country;
    private String city;
    private String timeZoneOffset;

    public MerchantInfoVO(String merchantId, String merchantName, String merchantSts, String country, String city, String timeZoneOffset) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantSts = merchantSts;
        this.country = country;
        this.city = city;
        this.timeZoneOffset = timeZoneOffset;
    }

    public MerchantInfoVO() {
    }

    @Override
    public String toString() {
        return "MerchantInfoVO{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantSts='" + merchantSts + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", timeZoneOffset='" + timeZoneOffset + '\'' +
                '}';
    }
}
