package org.wso2.carbon.identity.gateway.common.model.sp;

import java.util.ArrayList;
import java.util.List;

public class MultiOptionHandlerConfig{
    List<OptionConfig> optionConfigs = new ArrayList<>();

    public List<OptionConfig> getOptionConfigs() {
        return optionConfigs;
    }

    public void setOptionConfigs(List<OptionConfig> optionConfigs) {
        this.optionConfigs = optionConfigs;
    }
}