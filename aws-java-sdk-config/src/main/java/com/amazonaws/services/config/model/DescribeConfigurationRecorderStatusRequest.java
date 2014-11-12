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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest) DescribeConfigurationRecorderStatus operation}.
 * <p>
 * Returns the current status of the specified configuration recorder. If
 * a configuration recorder is not specified, this action returns the
 * status of all configuration recorder associated with the account.
 * </p>
 * <p>
 * <b>NOTE:</b>Currently, you can specify only one configuration recorder
 * per account.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest)
 */
public class DescribeConfigurationRecorderStatusRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name(s) of the configuration recorder. If the name is not
     * specified, the action returns the current status of all the
     * configuration recorders associated with the account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> configurationRecorderNames;

    /**
     * The name(s) of the configuration recorder. If the name is not
     * specified, the action returns the current status of all the
     * configuration recorders associated with the account.
     *
     * @return The name(s) of the configuration recorder. If the name is not
     *         specified, the action returns the current status of all the
     *         configuration recorders associated with the account.
     */
    public java.util.List<String> getConfigurationRecorderNames() {
        if (configurationRecorderNames == null) {
              configurationRecorderNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              configurationRecorderNames.setAutoConstruct(true);
        }
        return configurationRecorderNames;
    }
    
    /**
     * The name(s) of the configuration recorder. If the name is not
     * specified, the action returns the current status of all the
     * configuration recorders associated with the account.
     *
     * @param configurationRecorderNames The name(s) of the configuration recorder. If the name is not
     *         specified, the action returns the current status of all the
     *         configuration recorders associated with the account.
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
     * The name(s) of the configuration recorder. If the name is not
     * specified, the action returns the current status of all the
     * configuration recorders associated with the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecorderNames The name(s) of the configuration recorder. If the name is not
     *         specified, the action returns the current status of all the
     *         configuration recorders associated with the account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecorderStatusRequest withConfigurationRecorderNames(String... configurationRecorderNames) {
        if (getConfigurationRecorderNames() == null) setConfigurationRecorderNames(new java.util.ArrayList<String>(configurationRecorderNames.length));
        for (String value : configurationRecorderNames) {
            getConfigurationRecorderNames().add(value);
        }
        return this;
    }
    
    /**
     * The name(s) of the configuration recorder. If the name is not
     * specified, the action returns the current status of all the
     * configuration recorders associated with the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecorderNames The name(s) of the configuration recorder. If the name is not
     *         specified, the action returns the current status of all the
     *         configuration recorders associated with the account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigurationRecorderStatusRequest withConfigurationRecorderNames(java.util.Collection<String> configurationRecorderNames) {
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

        if (obj instanceof DescribeConfigurationRecorderStatusRequest == false) return false;
        DescribeConfigurationRecorderStatusRequest other = (DescribeConfigurationRecorderStatusRequest)obj;
        
        if (other.getConfigurationRecorderNames() == null ^ this.getConfigurationRecorderNames() == null) return false;
        if (other.getConfigurationRecorderNames() != null && other.getConfigurationRecorderNames().equals(this.getConfigurationRecorderNames()) == false) return false; 
        return true;
    }
    
}
    