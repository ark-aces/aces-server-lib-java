package com.arkaces.aces_server.aces_service.server_info;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "serverInfo")
public class ServerInfoSettings {
    private String name;
    private String description;
    private String version;
    private String websiteUrl;
    private String instructions;
    private List<Capacity> capacities;
    private String flatFee;
    private String percentFee;
    private String inputSchema;
    private String outputSchema;
    private List<String> interfaces;
}