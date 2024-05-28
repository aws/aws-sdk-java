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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date expireTime;
    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across all
     * Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     */
    private String keyArn;
    /**
     * <p>
     * The name of the API key resource.
     * </p>
     */
    private String keyName;

    private ApiKeyRestrictions restrictions;
    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the API key resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the API key resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the API key resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     * 
     * @param description
     *        The optional description for the API key resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     * 
     * @return The optional description for the API key resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     * 
     * @param description
     *        The optional description for the API key resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param expireTime
     *        The timestamp for when the API key resource will expire in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the API key resource will expire in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getExpireTime() {
        return this.expireTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param expireTime
     *        The timestamp for when the API key resource will expire in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withExpireTime(java.util.Date expireTime) {
        setExpireTime(expireTime);
        return this;
    }

    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     * 
     * @param key
     *        The key value/string of an API key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     * 
     * @return The key value/string of an API key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     * 
     * @param key
     *        The key value/string of an API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across all
     * Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyArn
     *        The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across
     *        all Amazon Web Services.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *        </p>
     *        </li>
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across all
     * Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across
     *         all Amazon Web Services.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *         </p>
     *         </li>
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across all
     * Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyArn
     *        The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across
     *        all Amazon Web Services.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * 
     * @param keyName
     *        The name of the API key resource.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * 
     * @return The name of the API key resource.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * 
     * @param keyName
     *        The name of the API key resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * @param restrictions
     */

    public void setRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * @return
     */

    public ApiKeyRestrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * @param restrictions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withRestrictions(ApiKeyRestrictions restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     * 
     * @return Tags associated with the API key resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the API key resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the API key resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeKeyResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult addTagsEntry(String key, String value) {
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

    public DescribeKeyResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the API key resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the API key resource was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the API key resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExpireTime() != null)
            sb.append("ExpireTime: ").append(getExpireTime()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyResult == false)
            return false;
        DescribeKeyResult other = (DescribeKeyResult) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpireTime() == null ^ this.getExpireTime() == null)
            return false;
        if (other.getExpireTime() != null && other.getExpireTime().equals(this.getExpireTime()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyResult clone() {
        try {
            return (DescribeKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
