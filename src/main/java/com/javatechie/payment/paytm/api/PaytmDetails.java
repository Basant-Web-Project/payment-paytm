package com.javatechie.payment.paytm.api;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Component
@ConfigurationProperties("paytm.payment.sandbox")
public class PaytmDetails {

    private String merchantId;

    private String merchantKey;

    private String channelId;

    private String website;

    private String industryTypeId;

    private String paytmUrl;

    private Map<String, String> details;


}
