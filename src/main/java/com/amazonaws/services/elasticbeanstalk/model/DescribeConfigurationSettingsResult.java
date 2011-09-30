/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * <p>
 * The results from a request to change the configuration settings of an
 * environment.
 * </p>
 */
public class DescribeConfigurationSettingsResult {

    /**
     * A list of <a>ConfigurationSettingsDescription</a>.
     */
    private java.util.List<ConfigurationSettingsDescription> configurationSettings;

    /**
     * A list of <a>ConfigurationSettingsDescription</a>.
     *
     * @return A list of <a>ConfigurationSettingsDescription</a>.
     */
    public java.util.List<ConfigurationSettingsDescription> getConfigurationSettings() {
        
        if (configurationSettings == null) {
            configurationSettings = new java.util.ArrayList<ConfigurationSettingsDescription>();
        }
        return configurationSettings;
    }
    
    /**
     * A list of <a>ConfigurationSettingsDescription</a>.
     *
     * @param configurationSettings A list of <a>ConfigurationSettingsDescription</a>.
     */
    public void setConfigurationSettings(java.util.Collection<ConfigurationSettingsDescription> configurationSettings) {
        java.util.List<ConfigurationSettingsDescription> configurationSettingsCopy = new java.util.ArrayList<ConfigurationSettingsDescription>();
        if (configurationSettings != null) {
            configurationSettingsCopy.addAll(configurationSettings);
        }
        this.configurationSettings = configurationSettingsCopy;
    }
    
    /**
     * A list of <a>ConfigurationSettingsDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationSettings A list of <a>ConfigurationSettingsDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationSettingsResult withConfigurationSettings(ConfigurationSettingsDescription... configurationSettings) {
        if (getConfigurationSettings() == null) setConfigurationSettings(new java.util.ArrayList<ConfigurationSettingsDescription>());
        for (ConfigurationSettingsDescription value : configurationSettings) {
            getConfigurationSettings().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ConfigurationSettingsDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationSettings A list of <a>ConfigurationSettingsDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeConfigurationSettingsResult withConfigurationSettings(java.util.Collection<ConfigurationSettingsDescription> configurationSettings) {
        java.util.List<ConfigurationSettingsDescription> configurationSettingsCopy = new java.util.ArrayList<ConfigurationSettingsDescription>();
        if (configurationSettings != null) {
            configurationSettingsCopy.addAll(configurationSettings);
        }
        this.configurationSettings = configurationSettingsCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("ConfigurationSettings: " + configurationSettings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    