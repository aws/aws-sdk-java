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
 * Contains the response to a <code>DescribeAgentVersions</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeAgentVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAgentVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The agent versions for the specified stack or configuration manager. Note that this value is the complete version
     * number, not the abbreviated number used by the console.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AgentVersion> agentVersions;

    /**
     * <p>
     * The agent versions for the specified stack or configuration manager. Note that this value is the complete version
     * number, not the abbreviated number used by the console.
     * </p>
     * 
     * @return The agent versions for the specified stack or configuration manager. Note that this value is the complete
     *         version number, not the abbreviated number used by the console.
     */

    public java.util.List<AgentVersion> getAgentVersions() {
        if (agentVersions == null) {
            agentVersions = new com.amazonaws.internal.SdkInternalList<AgentVersion>();
        }
        return agentVersions;
    }

    /**
     * <p>
     * The agent versions for the specified stack or configuration manager. Note that this value is the complete version
     * number, not the abbreviated number used by the console.
     * </p>
     * 
     * @param agentVersions
     *        The agent versions for the specified stack or configuration manager. Note that this value is the complete
     *        version number, not the abbreviated number used by the console.
     */

    public void setAgentVersions(java.util.Collection<AgentVersion> agentVersions) {
        if (agentVersions == null) {
            this.agentVersions = null;
            return;
        }

        this.agentVersions = new com.amazonaws.internal.SdkInternalList<AgentVersion>(agentVersions);
    }

    /**
     * <p>
     * The agent versions for the specified stack or configuration manager. Note that this value is the complete version
     * number, not the abbreviated number used by the console.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentVersions(java.util.Collection)} or {@link #withAgentVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param agentVersions
     *        The agent versions for the specified stack or configuration manager. Note that this value is the complete
     *        version number, not the abbreviated number used by the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentVersionsResult withAgentVersions(AgentVersion... agentVersions) {
        if (this.agentVersions == null) {
            setAgentVersions(new com.amazonaws.internal.SdkInternalList<AgentVersion>(agentVersions.length));
        }
        for (AgentVersion ele : agentVersions) {
            this.agentVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The agent versions for the specified stack or configuration manager. Note that this value is the complete version
     * number, not the abbreviated number used by the console.
     * </p>
     * 
     * @param agentVersions
     *        The agent versions for the specified stack or configuration manager. Note that this value is the complete
     *        version number, not the abbreviated number used by the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentVersionsResult withAgentVersions(java.util.Collection<AgentVersion> agentVersions) {
        setAgentVersions(agentVersions);
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
        if (getAgentVersions() != null)
            sb.append("AgentVersions: ").append(getAgentVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAgentVersionsResult == false)
            return false;
        DescribeAgentVersionsResult other = (DescribeAgentVersionsResult) obj;
        if (other.getAgentVersions() == null ^ this.getAgentVersions() == null)
            return false;
        if (other.getAgentVersions() != null && other.getAgentVersions().equals(this.getAgentVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentVersions() == null) ? 0 : getAgentVersions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAgentVersionsResult clone() {
        try {
            return (DescribeAgentVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
