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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a prompt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Prompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Prompt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     */
    private String promptARN;
    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     */
    private String promptId;
    /**
     * <p>
     * The name of the prompt.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the prompt.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @param promptARN
     *        The Amazon Resource Name (ARN) of the prompt.
     */

    public void setPromptARN(String promptARN) {
        this.promptARN = promptARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the prompt.
     */

    public String getPromptARN() {
        return this.promptARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @param promptARN
     *        The Amazon Resource Name (ARN) of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withPromptARN(String promptARN) {
        setPromptARN(promptARN);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * 
     * @param promptId
     *        A unique identifier for the prompt.
     */

    public void setPromptId(String promptId) {
        this.promptId = promptId;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * 
     * @return A unique identifier for the prompt.
     */

    public String getPromptId() {
        return this.promptId;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * 
     * @param promptId
     *        A unique identifier for the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withPromptId(String promptId) {
        setPromptId(promptId);
        return this;
    }

    /**
     * <p>
     * The name of the prompt.
     * </p>
     * 
     * @param name
     *        The name of the prompt.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the prompt.
     * </p>
     * 
     * @return The name of the prompt.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the prompt.
     * </p>
     * 
     * @param name
     *        The name of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the prompt.
     * </p>
     * 
     * @param description
     *        The description of the prompt.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the prompt.
     * </p>
     * 
     * @return The description of the prompt.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the prompt.
     * </p>
     * 
     * @param description
     *        The description of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Prompt#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Prompt addTagsEntry(String key, String value) {
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

    public Prompt clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when this resource was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @return The timestamp when this resource was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when this resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where this resource was last modified.
     */

    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @return The Amazon Web Services Region where this resource was last modified.
     */

    public String getLastModifiedRegion() {
        return this.lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where this resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withLastModifiedRegion(String lastModifiedRegion) {
        setLastModifiedRegion(lastModifiedRegion);
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
        if (getPromptARN() != null)
            sb.append("PromptARN: ").append(getPromptARN()).append(",");
        if (getPromptId() != null)
            sb.append("PromptId: ").append(getPromptId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: ").append(getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Prompt == false)
            return false;
        Prompt other = (Prompt) obj;
        if (other.getPromptARN() == null ^ this.getPromptARN() == null)
            return false;
        if (other.getPromptARN() != null && other.getPromptARN().equals(this.getPromptARN()) == false)
            return false;
        if (other.getPromptId() == null ^ this.getPromptId() == null)
            return false;
        if (other.getPromptId() != null && other.getPromptId().equals(this.getPromptId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptARN() == null) ? 0 : getPromptARN().hashCode());
        hashCode = prime * hashCode + ((getPromptId() == null) ? 0 : getPromptId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public Prompt clone() {
        try {
            return (Prompt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.PromptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
