/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeAgentVersions(DescribeAgentVersionsRequest) DescribeAgentVersions operation}.
 * <p>
 * Describes the available AWS OpsWorks agent versions. You must specify
 * a stack ID or a configuration manager.
 * <code>DescribeAgentVersions</code> returns a list of available agent
 * versions for the specified stack or configuration manager.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeAgentVersions(DescribeAgentVersionsRequest)
 */
public class DescribeAgentVersionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The configuration manager.
     */
    private StackConfigurationManager configurationManager;

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAgentVersionsRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The configuration manager.
     *
     * @return The configuration manager.
     */
    public StackConfigurationManager getConfigurationManager() {
        return configurationManager;
    }
    
    /**
     * The configuration manager.
     *
     * @param configurationManager The configuration manager.
     */
    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }
    
    /**
     * The configuration manager.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationManager The configuration manager.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAgentVersionsRequest withConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getConfigurationManager() != null) sb.append("ConfigurationManager: " + getConfigurationManager() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationManager() == null) ? 0 : getConfigurationManager().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAgentVersionsRequest == false) return false;
        DescribeAgentVersionsRequest other = (DescribeAgentVersionsRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getConfigurationManager() == null ^ this.getConfigurationManager() == null) return false;
        if (other.getConfigurationManager() != null && other.getConfigurationManager().equals(this.getConfigurationManager()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAgentVersionsRequest clone() {
        
            return (DescribeAgentVersionsRequest) super.clone();
    }

}
    