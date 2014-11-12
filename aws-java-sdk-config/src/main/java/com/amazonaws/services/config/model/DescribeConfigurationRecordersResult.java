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
 * The output for the DescribeConfigurationRecorders action.
 * </p>
 */
public class DescribeConfigurationRecordersResult implements Serializable {

    /**
     * A list that contains the descriptions of the specified configuration
     * recorders.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorder> configurationRecorders;

    /**
     * A list that contains the descriptions of the specified configuration
     * recorders.
     *
     * @return A list that contains the descriptions of the specified configuration
     *         recorders.
     */
    public java.util.List<ConfigurationRecorder> getConfigurationRecorders() {
        if (configurationRecorders == null) {
              configurationRecorders = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorder>();
              configurationRecorders.setAutoConstruct(true);
        }
        return configurationRecorders;
    }
    
    /**
     * A list that contains the descriptions of the specified configuration
     * recorders.
     *
     * @param configurationRecorders A list that contains the descriptions of the specified configuration
     *         recorders.
     */
    public void setConfigurationRecorders(java.util.Collection<ConfigurationRecorder> configurationRecorders) {
        if (configurationRecorders == null) {
            this.configurationRecorders = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorder> configurationRecordersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorder>(configurationRecorders.size());
        configurationRecordersCopy.addAll(configurationRecorders);
        this.configurationRecorders = configurationRecordersCopy;
    }
    
    /**
     * A list that contains the descriptions of the specified configuration
     * recorders.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecorders A list that contains the descriptions of the specified configuration
     *         recorders.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecordersResult withConfigurationRecorders(ConfigurationRecorder... configurationRecorders) {
        if (getConfigurationRecorders() == null) setConfigurationRecorders(new java.util.ArrayList<ConfigurationRecorder>(configurationRecorders.length));
        for (ConfigurationRecorder value : configurationRecorders) {
            getConfigurationRecorders().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains the descriptions of the specified configuration
     * recorders.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecorders A list that contains the descriptions of the specified configuration
     *         recorders.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecordersResult withConfigurationRecorders(java.util.Collection<ConfigurationRecorder> configurationRecorders) {
        if (configurationRecorders == null) {
            this.configurationRecorders = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorder> configurationRecordersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationRecorder>(configurationRecorders.size());
            configurationRecordersCopy.addAll(configurationRecorders);
            this.configurationRecorders = configurationRecordersCopy;
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
        if (getConfigurationRecorders() != null) sb.append("ConfigurationRecorders: " + getConfigurationRecorders() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigurationRecorders() == null) ? 0 : getConfigurationRecorders().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConfigurationRecordersResult == false) return false;
        DescribeConfigurationRecordersResult other = (DescribeConfigurationRecordersResult)obj;
        
        if (other.getConfigurationRecorders() == null ^ this.getConfigurationRecorders() == null) return false;
        if (other.getConfigurationRecorders() != null && other.getConfigurationRecorders().equals(this.getConfigurationRecorders()) == false) return false; 
        return true;
    }
    
}
    