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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     */
    private java.util.Date expireTime;
    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String keyName;
    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API key. One of <code>NoExpiry</code> or
     * <code>ExpireTime</code> must be set.
     * </p>
     */
    private Boolean noExpiry;
    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     */
    private ApiKeyRestrictions restrictions;
    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     * 
     * @param description
     *        An optional description for the API key resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     * 
     * @return An optional description for the API key resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     * 
     * @param description
     *        An optional description for the API key resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     * 
     * @param expireTime
     *        The optional timestamp for when the API key resource will expire in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be
     *        set.
     */

    public void setExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     * 
     * @return The optional timestamp for when the API key resource will expire in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be
     *         set.
     */

    public java.util.Date getExpireTime() {
        return this.expireTime;
    }

    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     * 
     * @param expireTime
     *        The optional timestamp for when the API key resource will expire in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withExpireTime(java.util.Date expireTime) {
        setExpireTime(expireTime);
        return this;
    }

    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyName
     *        A custom name for the API key resource.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique API key name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleAPIKey</code>.
     *        </p>
     *        </li>
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A custom name for the API key resource.</p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique API key name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleAPIKey</code>.
     *         </p>
     *         </li>
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyName
     *        A custom name for the API key resource.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique API key name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleAPIKey</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API key. One of <code>NoExpiry</code> or
     * <code>ExpireTime</code> must be set.
     * </p>
     * 
     * @param noExpiry
     *        Optionally set to <code>true</code> to set no expiration time for the API key. One of
     *        <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     */

    public void setNoExpiry(Boolean noExpiry) {
        this.noExpiry = noExpiry;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API key. One of <code>NoExpiry</code> or
     * <code>ExpireTime</code> must be set.
     * </p>
     * 
     * @return Optionally set to <code>true</code> to set no expiration time for the API key. One of
     *         <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     */

    public Boolean getNoExpiry() {
        return this.noExpiry;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API key. One of <code>NoExpiry</code> or
     * <code>ExpireTime</code> must be set.
     * </p>
     * 
     * @param noExpiry
     *        Optionally set to <code>true</code> to set no expiration time for the API key. One of
     *        <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withNoExpiry(Boolean noExpiry) {
        setNoExpiry(noExpiry);
        return this;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API key. One of <code>NoExpiry</code> or
     * <code>ExpireTime</code> must be set.
     * </p>
     * 
     * @return Optionally set to <code>true</code> to set no expiration time for the API key. One of
     *         <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     */

    public Boolean isNoExpiry() {
        return this.noExpiry;
    }

    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     * 
     * @param restrictions
     *        The API key restrictions for the API key resource.
     */

    public void setRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     * 
     * @return The API key restrictions for the API key resource.
     */

    public ApiKeyRestrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     * 
     * @param restrictions
     *        The API key restrictions for the API key resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withRestrictions(ApiKeyRestrictions restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify,
     *         search, and filter your resources by labelling them.</p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each resource tag must be unique with a maximum of one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot use "aws:" as a prefix for a key.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify,
     *        search, and filter your resources by labelling them.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource tag must be unique with a maximum of one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot use "aws:" as a prefix for a key.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify,
     *        search, and filter your resources by labelling them.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource tag must be unique with a maximum of one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot use "aws:" as a prefix for a key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateKeyRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest addTagsEntry(String key, String value) {
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

    public CreateKeyRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExpireTime() != null)
            sb.append("ExpireTime: ").append(getExpireTime()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getNoExpiry() != null)
            sb.append("NoExpiry: ").append(getNoExpiry()).append(",");
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions()).append(",");
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

        if (obj instanceof CreateKeyRequest == false)
            return false;
        CreateKeyRequest other = (CreateKeyRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpireTime() == null ^ this.getExpireTime() == null)
            return false;
        if (other.getExpireTime() != null && other.getExpireTime().equals(this.getExpireTime()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getNoExpiry() == null ^ this.getNoExpiry() == null)
            return false;
        if (other.getNoExpiry() != null && other.getNoExpiry().equals(this.getNoExpiry()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getNoExpiry() == null) ? 0 : getNoExpiry().hashCode());
        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyRequest clone() {
        return (CreateKeyRequest) super.clone();
    }

}
