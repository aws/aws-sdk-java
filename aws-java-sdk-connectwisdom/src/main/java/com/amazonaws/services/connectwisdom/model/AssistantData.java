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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The assistant data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/AssistantData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssistantData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     */
    private String assistantArn;
    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     */
    private String assistantId;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * The status of the assistant.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of assistant.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public void setAssistantArn(String assistantArn) {
        this.assistantArn = assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public String getAssistantArn() {
        return this.assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantData withAssistantArn(String assistantArn) {
        setAssistantArn(assistantArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantData withAssistantId(String assistantId) {
        setAssistantId(assistantId);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantData withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @return The name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The KMS key used for encryption.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     * 
     * @return The KMS key used for encryption.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The KMS key used for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantData withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The status of the assistant.
     * </p>
     * 
     * @param status
     *        The status of the assistant.
     * @see AssistantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the assistant.
     * </p>
     * 
     * @return The status of the assistant.
     * @see AssistantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the assistant.
     * </p>
     * 
     * @param status
     *        The status of the assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssistantStatus
     */

    public AssistantData withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the assistant.
     * </p>
     * 
     * @param status
     *        The status of the assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssistantStatus
     */

    public AssistantData withStatus(AssistantStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantData withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AssistantData#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AssistantData addTagsEntry(String key, String value) {
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

    public AssistantData clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of assistant.
     * </p>
     * 
     * @param type
     *        The type of assistant.
     * @see AssistantType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of assistant.
     * </p>
     * 
     * @return The type of assistant.
     * @see AssistantType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of assistant.
     * </p>
     * 
     * @param type
     *        The type of assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssistantType
     */

    public AssistantData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of assistant.
     * </p>
     * 
     * @param type
     *        The type of assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssistantType
     */

    public AssistantData withType(AssistantType type) {
        this.type = type.toString();
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
        if (getAssistantArn() != null)
            sb.append("AssistantArn: ").append(getAssistantArn()).append(",");
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssistantData == false)
            return false;
        AssistantData other = (AssistantData) obj;
        if (other.getAssistantArn() == null ^ this.getAssistantArn() == null)
            return false;
        if (other.getAssistantArn() != null && other.getAssistantArn().equals(this.getAssistantArn()) == false)
            return false;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantArn() == null) ? 0 : getAssistantArn().hashCode());
        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AssistantData clone() {
        try {
            return (AssistantData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.AssistantDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
