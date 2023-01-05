/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an agent status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AgentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     */
    private String agentStatusARN;
    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     */
    private String agentStatusId;
    /**
     * <p>
     * The name of the agent status.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the agent status.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of agent status.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The display order of the agent status.
     * </p>
     */
    private Integer displayOrder;
    /**
     * <p>
     * The state of the agent status.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     * 
     * @param agentStatusARN
     *        The Amazon Resource Name (ARN) of the agent status.
     */

    public void setAgentStatusARN(String agentStatusARN) {
        this.agentStatusARN = agentStatusARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent status.
     */

    public String getAgentStatusARN() {
        return this.agentStatusARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     * 
     * @param agentStatusARN
     *        The Amazon Resource Name (ARN) of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus withAgentStatusARN(String agentStatusARN) {
        setAgentStatusARN(agentStatusARN);
        return this;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @param agentStatusId
     *        The identifier of the agent status.
     */

    public void setAgentStatusId(String agentStatusId) {
        this.agentStatusId = agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @return The identifier of the agent status.
     */

    public String getAgentStatusId() {
        return this.agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @param agentStatusId
     *        The identifier of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus withAgentStatusId(String agentStatusId) {
        setAgentStatusId(agentStatusId);
        return this;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @param name
     *        The name of the agent status.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @return The name of the agent status.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @param name
     *        The name of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * 
     * @param description
     *        The description of the agent status.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * 
     * @return The description of the agent status.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * 
     * @param description
     *        The description of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * 
     * @param type
     *        The type of agent status.
     * @see AgentStatusType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * 
     * @return The type of agent status.
     * @see AgentStatusType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * 
     * @param type
     *        The type of agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusType
     */

    public AgentStatus withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * 
     * @param type
     *        The type of agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusType
     */

    public AgentStatus withType(AgentStatusType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * 
     * @param displayOrder
     *        The display order of the agent status.
     */

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * 
     * @return The display order of the agent status.
     */

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * 
     * @param displayOrder
     *        The display order of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus withDisplayOrder(Integer displayOrder) {
        setDisplayOrder(displayOrder);
        return this;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @param state
     *        The state of the agent status.
     * @see AgentStatusState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @return The state of the agent status.
     * @see AgentStatusState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @param state
     *        The state of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusState
     */

    public AgentStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @param state
     *        The state of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusState
     */

    public AgentStatus withState(AgentStatusState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AgentStatus#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatus clearTagsEntries() {
        this.tags = null;
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
        if (getAgentStatusARN() != null)
            sb.append("AgentStatusARN: ").append(getAgentStatusARN()).append(",");
        if (getAgentStatusId() != null)
            sb.append("AgentStatusId: ").append(getAgentStatusId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDisplayOrder() != null)
            sb.append("DisplayOrder: ").append(getDisplayOrder()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentStatus == false)
            return false;
        AgentStatus other = (AgentStatus) obj;
        if (other.getAgentStatusARN() == null ^ this.getAgentStatusARN() == null)
            return false;
        if (other.getAgentStatusARN() != null && other.getAgentStatusARN().equals(this.getAgentStatusARN()) == false)
            return false;
        if (other.getAgentStatusId() == null ^ this.getAgentStatusId() == null)
            return false;
        if (other.getAgentStatusId() != null && other.getAgentStatusId().equals(this.getAgentStatusId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDisplayOrder() == null ^ this.getDisplayOrder() == null)
            return false;
        if (other.getDisplayOrder() != null && other.getDisplayOrder().equals(this.getDisplayOrder()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentStatusARN() == null) ? 0 : getAgentStatusARN().hashCode());
        hashCode = prime * hashCode + ((getAgentStatusId() == null) ? 0 : getAgentStatusId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDisplayOrder() == null) ? 0 : getDisplayOrder().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AgentStatus clone() {
        try {
            return (AgentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AgentStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
