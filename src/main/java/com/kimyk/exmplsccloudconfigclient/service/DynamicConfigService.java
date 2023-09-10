package com.kimyk.exmplsccloudconfigclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope  // 여기가 다름
public class DynamicConfigService {

    @Value("${youngkim.profile}")
    private String profile;
    @Value("${youngkim.comment}")
    private String comment;

    public Map<String, String> getConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("profile", profile);
        map.put("comment", comment);
        return map;
    }
}
