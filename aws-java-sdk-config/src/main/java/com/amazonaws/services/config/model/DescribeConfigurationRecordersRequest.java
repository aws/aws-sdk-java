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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#describeConfigurationRecorders(DescribeConfigurationRecordersRequest) DescribeConfigurationRecorders operation}.
 * <p>
 * Returns the name of one or more specified configuration recorders. If
 * the recorder name is not specified, this action returns the names of
 * all the configuration recorders associated with the account.
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, you can specify only one configuration
 * recorder per account.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#describeConfigurationRecorders(DescribeConfigurationRecordersRequest)
 */
public class DescribeConfigurationRecordersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of configuration recorder names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> configurationRecorderNames;

    /**
     * A list of configuration recorder names.
     *
     * @return A list of configuration recorder names.
     */
    public java.util.List<String> getConfigurationRecorderNames() {
        if (configurationRecorderNames == null) {
              configurationRecorderNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              configurationRecorderNames.setAutoConstruct(true);
        }
        return configurationRecorderNames;
    }
    
    /**
     * A list of configuration recorder names.
     *
     * @param configurationRecorderNames A list of configuration recorder names.
     */
    public void setConfigurationRecorderNames(java.util.Collection<String> configurationRecorderNames) {
        if (configurationRecorderNames == null) {
            this.configurationRecorderNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> configurationRecorderNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configurationRecorderNames.size());
        configurationRecorderNamesCopy.addAll(configurationRecorderNames);
        this.configurationRecorderNames = configurationRecorderNamesCopy;
    }
    
    /**
     * A list of configuration recorder names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecorderNames A list of configuration recorder names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecordersRequest withConfigurationRecorderNames(String... configurationRecorderNames) {
        if (getConfigurationRecorderNames() == null) setConfigurationRecorderNames(new java.util.ArrayList<String>(configurationRecorderNames.length));
        for (String value : configurationRecorderNames) {
            getConfigurationRecorderNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of configuration recorder names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecorderNames A list of configuration recorder names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecordersRequest withConfigurationRecorderNames(java.util.Collection<String> configurationRecorderNames) {
        if (configurationRecorderNames == null) {
            this.configurationRecorderNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> configurationRecorderNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configurationRecorderNames.size());
            configurationRecorderNamesCopy.addAll(configurationRecorderNames);
            this.configurationRecorderNames = configurationRecorderNamesCopy;
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
        if (getConfigurationRecorderNames() != null) sb.append("ConfigurationRecorderNames: " + getConfigurationRecorderNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigurationRecorderNames() == null) ? 0 : getConfigurationRecorderNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConfigurationRecordersRequest == false) return false;
        DescribeConfigurationRecordersRequest other = (DescribeConfigurationRecordersRequest)obj;
        
        if (other.getConfigurationRecorderNames() == null ^ this.getConfigurationRecorderNames() == null) return false;
        if (other.getConfigurationRecorderNames() != null && other.getConfigurationRecorderNames().equals(this.getConfigurationRecorderNames()) == false) return false; 
        return true;
    }
    
}
    