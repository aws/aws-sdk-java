/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the DescribeConfigurationRecorderStatus action in JSON
 * format.
 * </p>
 */
public class DescribeConfigurationRecorderStatusResult implements Serializable {

    /**
     * A list that contains status of the specified recorders.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorderStatus> configurationRecordersStatus;

    /**
     * A list that contains status of the specified recorders.
     *
     * @return A list that contains status of the specified recorders.
     */
    public java.util.List<ConfigurationRecorderStatus> getConfigurationRecordersStatus() {
        if (configurationRecordersStatus == null) {
              configurationRecordersStatus = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorderStatus>();
              configurationRecordersStatus.setAutoConstruct(true);
        }
        return configurationRecordersStatus;
    }
    
    /**
     * A list that contains status of the specified recorders.
     *
     * @param configurationRecordersStatus A list that contains status of the specified recorders.
     */
    public void setConfigurationRecordersStatus(java.util.Collection<ConfigurationRecorderStatus> configurationRecordersStatus) {
        if (configurationRecordersStatus == null) {
            this.configurationRecordersStatus = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorderStatus> configurationRecordersStatusCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorderStatus>(configurationRecordersStatus.size());
        configurationRecordersStatusCopy.addAll(configurationRecordersStatus);
        this.configurationRecordersStatus = configurationRecordersStatusCopy;
    }
    
    /**
     * A list that contains status of the specified recorders.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecordersStatus A list that contains status of the specified recorders.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecorderStatusResult withConfigurationRecordersStatus(ConfigurationRecorderStatus... configurationRecordersStatus) {
        if (getConfigurationRecordersStatus() == null) setConfigurationRecordersStatus(new java.util.ArrayList<ConfigurationRecorderStatus>(configurationRecordersStatus.length));
        for (ConfigurationRecorderStatus value : configurationRecordersStatus) {
            getConfigurationRecordersStatus().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains status of the specified recorders.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecordersStatus A list that contains status of the specified recorders.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecorderStatusResult withConfigurationRecordersStatus(java.util.Collection<ConfigurationRecorderStatus> configurationRecordersStatus) {
        if (configurationRecordersStatus == null) {
            this.configurationRecordersStatus = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorderStatus> configurationRecordersStatusCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorderStatus>(configurationRecordersStatus.size());
            configurationRecordersStatusCopy.addAll(configurationRecordersStatus);
            this.configurationRecordersStatus = configurationRecordersStatusCopy;
        }

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
        if (getConfigurationRecordersStatus() != null) sb.append("ConfigurationRecordersStatus: " + getConfigurationRecordersStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigurationRecordersStatus() == null) ? 0 : getConfigurationRecordersStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConfigurationRecorderStatusResult == false) return false;
        DescribeConfigurationRecorderStatusResult other = (DescribeConfigurationRecorderStatusResult)obj;
        
        if (other.getConfigurationRecordersStatus() == null ^ this.getConfigurationRecordersStatus() == null) return false;
        if (other.getConfigurationRecordersStatus() != null && other.getConfigurationRecordersStatus().equals(this.getConfigurationRecordersStatus()) == false) return false; 
        return true;
    }
    
}
    