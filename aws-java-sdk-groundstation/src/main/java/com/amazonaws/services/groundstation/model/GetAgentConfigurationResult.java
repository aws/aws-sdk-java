/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetAgentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgentConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * UUID of agent.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Tasking document for agent.
     * </p>
     */
    private String taskingDocument;

    /**
     * <p>
     * UUID of agent.
     * </p>
     * 
     * @param agentId
     *        UUID of agent.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * UUID of agent.
     * </p>
     * 
     * @return UUID of agent.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * UUID of agent.
     * </p>
     * 
     * @param agentId
     *        UUID of agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentConfigurationResult withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Tasking document for agent.
     * </p>
     * 
     * @param taskingDocument
     *        Tasking document for agent.
     */

    public void setTaskingDocument(String taskingDocument) {
        this.taskingDocument = taskingDocument;
    }

    /**
     * <p>
     * Tasking document for agent.
     * </p>
     * 
     * @return Tasking document for agent.
     */

    public String getTaskingDocument() {
        return this.taskingDocument;
    }

    /**
     * <p>
     * Tasking document for agent.
     * </p>
     * 
     * @param taskingDocument
     *        Tasking document for agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentConfigurationResult withTaskingDocument(String taskingDocument) {
        setTaskingDocument(taskingDocument);
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getTaskingDocument() != null)
            sb.append("TaskingDocument: ").append(getTaskingDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAgentConfigurationResult == false)
            return false;
        GetAgentConfigurationResult other = (GetAgentConfigurationResult) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getTaskingDocument() == null ^ this.getTaskingDocument() == null)
            return false;
        if (other.getTaskingDocument() != null && other.getTaskingDocument().equals(this.getTaskingDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getTaskingDocument() == null) ? 0 : getTaskingDocument().hashCode());
        return hashCode;
    }

    @Override
    public GetAgentConfigurationResult clone() {
        try {
            return (GetAgentConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
