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
 * Contains information about a flow module.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ContactFlowModule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactFlowModule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the flow module.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The content of the flow module.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The description of the flow module.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of flow module.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status of the flow module.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowModule withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @param id
     *        The identifier of the flow module.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @return The identifier of the flow module.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @param id
     *        The identifier of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowModule withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the flow module.
     * </p>
     * 
     * @param name
     *        The name of the flow module.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the flow module.
     * </p>
     * 
     * @return The name of the flow module.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the flow module.
     * </p>
     * 
     * @param name
     *        The name of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowModule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The content of the flow module.
     * </p>
     * 
     * @param content
     *        The content of the flow module.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the flow module.
     * </p>
     * 
     * @return The content of the flow module.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the flow module.
     * </p>
     * 
     * @param content
     *        The content of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowModule withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The description of the flow module.
     * </p>
     * 
     * @param description
     *        The description of the flow module.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the flow module.
     * </p>
     * 
     * @return The description of the flow module.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the flow module.
     * </p>
     * 
     * @param description
     *        The description of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowModule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of flow module.
     * </p>
     * 
     * @param state
     *        The type of flow module.
     * @see ContactFlowModuleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The type of flow module.
     * </p>
     * 
     * @return The type of flow module.
     * @see ContactFlowModuleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The type of flow module.
     * </p>
     * 
     * @param state
     *        The type of flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowModuleState
     */

    public ContactFlowModule withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The type of flow module.
     * </p>
     * 
     * @param state
     *        The type of flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowModuleState
     */

    public ContactFlowModule withState(ContactFlowModuleState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status of the flow module.
     * </p>
     * 
     * @param status
     *        The status of the flow module.
     * @see ContactFlowModuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flow module.
     * </p>
     * 
     * @return The status of the flow module.
     * @see ContactFlowModuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the flow module.
     * </p>
     * 
     * @param status
     *        The status of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowModuleStatus
     */

    public ContactFlowModule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the flow module.
     * </p>
     * 
     * @param status
     *        The status of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowModuleStatus
     */

    public ContactFlowModule withStatus(ContactFlowModuleStatus status) {
        this.status = status.toString();
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

    public ContactFlowModule withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ContactFlowModule#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowModule addTagsEntry(String key, String value) {
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

    public ContactFlowModule clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ContactFlowModule == false)
            return false;
        ContactFlowModule other = (ContactFlowModule) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ContactFlowModule clone() {
        try {
            return (ContactFlowModule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ContactFlowModuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
