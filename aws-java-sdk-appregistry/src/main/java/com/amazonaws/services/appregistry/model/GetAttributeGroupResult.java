/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetAttributeGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttributeGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the attribute group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group across services.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the attribute group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     */
    private String attributes;
    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same as the
     * creationTime for a newly created attribute group.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * Key-value pairs associated with the attribute group.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the attribute group.
     * </p>
     * 
     * @param id
     *        The identifier of the attribute group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the attribute group.
     * </p>
     * 
     * @return The identifier of the attribute group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the attribute group.
     * </p>
     * 
     * @param id
     *        The identifier of the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group across services.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the attribute group across services.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group across services.
     * </p>
     * 
     * @return The Amazon resource name (ARN) that specifies the attribute group across services.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group across services.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the attribute group across services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the attribute group.
     * </p>
     * 
     * @param name
     *        The name of the attribute group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute group.
     * </p>
     * 
     * @return The name of the attribute group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute group.
     * </p>
     * 
     * @param name
     *        The name of the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     * 
     * @param description
     *        The description of the attribute group that the user provides.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     * 
     * @return The description of the attribute group that the user provides.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     * 
     * @param description
     *        The description of the attribute group that the user provides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     * 
     * @param attributes
     *        A JSON string in the form of nested key-value pairs that represent the attributes in the group and
     *        describes an application and its components.
     */

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     * 
     * @return A JSON string in the form of nested key-value pairs that represent the attributes in the group and
     *         describes an application and its components.
     */

    public String getAttributes() {
        return this.attributes;
    }

    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     * 
     * @param attributes
     *        A JSON string in the form of nested key-value pairs that represent the attributes in the group and
     *        describes an application and its components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withAttributes(String attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was created.
     * </p>
     * 
     * @param creationTime
     *        The ISO-8601 formatted timestamp of the moment the attribute group was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was created.
     * </p>
     * 
     * @return The ISO-8601 formatted timestamp of the moment the attribute group was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was created.
     * </p>
     * 
     * @param creationTime
     *        The ISO-8601 formatted timestamp of the moment the attribute group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same as the
     * creationTime for a newly created attribute group.
     * </p>
     * 
     * @param lastUpdateTime
     *        The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same
     *        as the creationTime for a newly created attribute group.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same as the
     * creationTime for a newly created attribute group.
     * </p>
     * 
     * @return The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the
     *         same as the creationTime for a newly created attribute group.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same as the
     * creationTime for a newly created attribute group.
     * </p>
     * 
     * @param lastUpdateTime
     *        The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same
     *        as the creationTime for a newly created attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * Key-value pairs associated with the attribute group.
     * </p>
     * 
     * @return Key-value pairs associated with the attribute group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs associated with the attribute group.
     * </p>
     * 
     * @param tags
     *        Key-value pairs associated with the attribute group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Key-value pairs associated with the attribute group.
     * </p>
     * 
     * @param tags
     *        Key-value pairs associated with the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAttributeGroupResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeGroupResult addTagsEntry(String key, String value) {
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

    public GetAttributeGroupResult clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
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

        if (obj instanceof GetAttributeGroupResult == false)
            return false;
        GetAttributeGroupResult other = (GetAttributeGroupResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetAttributeGroupResult clone() {
        try {
            return (GetAttributeGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
