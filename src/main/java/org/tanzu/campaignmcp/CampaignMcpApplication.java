package org.tanzu.campaignmcp;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tanzu.campaignmcp.campaign.CampaignService;

import java.util.List;

@SpringBootApplication
public class CampaignMcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampaignMcpApplication.class, args);
    }

    @Bean
    public List<ToolCallback> registerTools(CampaignService campaignService) {
        return List.of(ToolCallbacks.from(campaignService));
    }

}
