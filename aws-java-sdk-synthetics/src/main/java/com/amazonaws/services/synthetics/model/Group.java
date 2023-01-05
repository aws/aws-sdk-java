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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about one group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/Group" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Group implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The date and time that the group was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The date and time that the group was most recently updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The unique ID of the group.
     * </p>
     * 
     * @param id
     *        The unique ID of the group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the group.
     * </p>
     * 
     * @return The unique ID of the group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the group.
     * </p>
     * 
     * @param id
     *        The unique ID of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the group.
     * </p>
     * 
     * @param arn
     *        The ARN of the group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the group.
     * </p>
     * 
     * @return The ARN of the group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the group.
     * </p>
     * 
     * @param arn
     *        The ARN of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * 
     * @return The list of key-value pairs that are associated with the canary.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs that are associated with the canary.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs that are associated with the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Group#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Group addTagsEntry(String key, String value) {
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

    public Group clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The date and time that the group was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the group was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the group was created.
     * </p>
     * 
     * @return The date and time that the group was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the group was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the group was most recently updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the group was most recently updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the group was most recently updated.
     * </p>
     * 
     * @return The date and time that the group was most recently updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the group was most recently updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the group was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public Group clone() {
        try {
            return (Group) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.GroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
