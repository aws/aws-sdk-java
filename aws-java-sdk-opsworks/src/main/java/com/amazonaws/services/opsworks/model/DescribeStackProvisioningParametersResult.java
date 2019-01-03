/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeStackProvisioningParameters</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStackProvisioningParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackProvisioningParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The AWS OpsWorks Stacks agent installer's URL.
     * </p>
     */
    private String agentInstallerUrl;
    /**
     * <p>
     * An embedded object that contains the provisioning parameters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> parameters;

    /**
     * <p>
     * The AWS OpsWorks Stacks agent installer's URL.
     * </p>
     * 
     * @param agentInstallerUrl
     *        The AWS OpsWorks Stacks agent installer's URL.
     */

    public void setAgentInstallerUrl(String agentInstallerUrl) {
        this.agentInstallerUrl = agentInstallerUrl;
    }

    /**
     * <p>
     * The AWS OpsWorks Stacks agent installer's URL.
     * </p>
     * 
     * @return The AWS OpsWorks Stacks agent installer's URL.
     */

    public String getAgentInstallerUrl() {
        return this.agentInstallerUrl;
    }

    /**
     * <p>
     * The AWS OpsWorks Stacks agent installer's URL.
     * </p>
     * 
     * @param agentInstallerUrl
     *        The AWS OpsWorks Stacks agent installer's URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackProvisioningParametersResult withAgentInstallerUrl(String agentInstallerUrl) {
        setAgentInstallerUrl(agentInstallerUrl);
        return this;
    }

    /**
     * <p>
     * An embedded object that contains the provisioning parameters.
     * </p>
     * 
     * @return An embedded object that contains the provisioning parameters.
     */

    public java.util.Map<String, String> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return parameters;
    }

    /**
     * <p>
     * An embedded object that contains the provisioning parameters.
     * </p>
     * 
     * @param parameters
     *        An embedded object that contains the provisioning parameters.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(parameters);
    }

    /**
     * <p>
     * An embedded object that contains the provisioning parameters.
     * </p>
     * 
     * @param parameters
     *        An embedded object that contains the provisioning parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackProvisioningParametersResult withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public DescribeStackProvisioningParametersResult addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackProvisioningParametersResult clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAgentInstallerUrl() != null)
            sb.append("AgentInstallerUrl: ").append(getAgentInstallerUrl()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackProvisioningParametersResult == false)
            return false;
        DescribeStackProvisioningParametersResult other = (DescribeStackProvisioningParametersResult) obj;
        if (other.getAgentInstallerUrl() == null ^ this.getAgentInstallerUrl() == null)
            return false;
        if (other.getAgentInstallerUrl() != null && other.getAgentInstallerUrl().equals(this.getAgentInstallerUrl()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
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
    public DescribeStackProvisioningParametersResult clone() {
        try {
            return (DescribeStackProvisioningParametersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
