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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a
 * <code>DescribeStackProvisioningParameters</code> request.
 * </p>
 */
public class DescribeStackProvisioningParametersResult implements Serializable {

    /**
     * The AWS OpsWorks agent installer's URL.
     */
    private String agentInstallerUrl;

    /**
     * An embedded object that contains the provisioning parameters.
     */
    private java.util.Map<String,String> parameters;

    /**
     * The AWS OpsWorks agent installer's URL.
     *
     * @return The AWS OpsWorks agent installer's URL.
     */
    public String getAgentInstallerUrl() {
        return agentInstallerUrl;
    }
    
    /**
     * The AWS OpsWorks agent installer's URL.
     *
     * @param agentInstallerUrl The AWS OpsWorks agent installer's URL.
     */
    public void setAgentInstallerUrl(String agentInstallerUrl) {
        this.agentInstallerUrl = agentInstallerUrl;
    }
    
    /**
     * The AWS OpsWorks agent installer's URL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentInstallerUrl The AWS OpsWorks agent installer's URL.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStackProvisioningParametersResult withAgentInstallerUrl(String agentInstallerUrl) {
        this.agentInstallerUrl = agentInstallerUrl;
        return this;
    }

    /**
     * An embedded object that contains the provisioning parameters.
     *
     * @return An embedded object that contains the provisioning parameters.
     */
    public java.util.Map<String,String> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.HashMap<String,String>();
        }
        return parameters;
    }
    
    /**
     * An embedded object that contains the provisioning parameters.
     *
     * @param parameters An embedded object that contains the provisioning parameters.
     */
    public void setParameters(java.util.Map<String,String> parameters) {
        this.parameters = parameters;
    }
    
    /**
     * An embedded object that contains the provisioning parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An embedded object that contains the provisioning parameters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStackProvisioningParametersResult withParameters(java.util.Map<String,String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * An embedded object that contains the provisioning parameters.
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into Parameters.
     */
    public DescribeStackProvisioningParametersResult addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String,String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public DescribeStackProvisioningParametersResult clearParametersEntries() {
        this.parameters = null;
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
        if (getAgentInstallerUrl() != null) sb.append("AgentInstallerUrl: " + getAgentInstallerUrl() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAgentInstallerUrl() == null) ? 0 : getAgentInstallerUrl().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStackProvisioningParametersResult == false) return false;
        DescribeStackProvisioningParametersResult other = (DescribeStackProvisioningParametersResult)obj;
        
        if (other.getAgentInstallerUrl() == null ^ this.getAgentInstallerUrl() == null) return false;
        if (other.getAgentInstallerUrl() != null && other.getAgentInstallerUrl().equals(this.getAgentInstallerUrl()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        return true;
    }
    
}
    