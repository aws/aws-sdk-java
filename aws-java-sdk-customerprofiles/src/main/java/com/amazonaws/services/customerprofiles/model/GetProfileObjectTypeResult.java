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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileObjectTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     */
    private String objectTypeName;
    /**
     * <p>
     * The description of the profile object type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The number of days until the data in the object expires.
     * </p>
     */
    private Integer expirationDays;
    /**
     * <p>
     * The customer-provided key to encrypt the profile object that will be created in this profile object type.
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * Indicates whether a profile should be created when data is received if one doesn’t exist for an object of this
     * type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to <code>FALSE</code>, then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is set to
     * <code>TRUE</code>, and if no match is found, then the service creates a new standard profile.
     * </p>
     */
    private Boolean allowProfileCreation;
    /**
     * <p>
     * A map of the name and ObjectType field.
     * </p>
     */
    private java.util.Map<String, ObjectTypeField> fields;
    /**
     * <p>
     * A list of unique keys that can be used to map data to the profile.
     * </p>
     */
    private java.util.Map<String, java.util.List<ObjectTypeKey>> keys;
    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @return The name of the profile object type.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
        return this;
    }

    /**
     * <p>
     * The description of the profile object type.
     * </p>
     * 
     * @param description
     *        The description of the profile object type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the profile object type.
     * </p>
     * 
     * @return The description of the profile object type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the profile object type.
     * </p>
     * 
     * @param description
     *        The description of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier for the object template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     * 
     * @return A unique identifier for the object template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier for the object template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The number of days until the data in the object expires.
     * </p>
     * 
     * @param expirationDays
     *        The number of days until the data in the object expires.
     */

    public void setExpirationDays(Integer expirationDays) {
        this.expirationDays = expirationDays;
    }

    /**
     * <p>
     * The number of days until the data in the object expires.
     * </p>
     * 
     * @return The number of days until the data in the object expires.
     */

    public Integer getExpirationDays() {
        return this.expirationDays;
    }

    /**
     * <p>
     * The number of days until the data in the object expires.
     * </p>
     * 
     * @param expirationDays
     *        The number of days until the data in the object expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withExpirationDays(Integer expirationDays) {
        setExpirationDays(expirationDays);
        return this;
    }

    /**
     * <p>
     * The customer-provided key to encrypt the profile object that will be created in this profile object type.
     * </p>
     * 
     * @param encryptionKey
     *        The customer-provided key to encrypt the profile object that will be created in this profile object type.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The customer-provided key to encrypt the profile object that will be created in this profile object type.
     * </p>
     * 
     * @return The customer-provided key to encrypt the profile object that will be created in this profile object type.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The customer-provided key to encrypt the profile object that will be created in this profile object type.
     * </p>
     * 
     * @param encryptionKey
     *        The customer-provided key to encrypt the profile object that will be created in this profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * Indicates whether a profile should be created when data is received if one doesn’t exist for an object of this
     * type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to <code>FALSE</code>, then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is set to
     * <code>TRUE</code>, and if no match is found, then the service creates a new standard profile.
     * </p>
     * 
     * @param allowProfileCreation
     *        Indicates whether a profile should be created when data is received if one doesn’t exist for an object of
     *        this type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to
     *        <code>FALSE</code>, then the service tries to fetch a standard profile and associate this object with the
     *        profile. If it is set to <code>TRUE</code>, and if no match is found, then the service creates a new
     *        standard profile.
     */

    public void setAllowProfileCreation(Boolean allowProfileCreation) {
        this.allowProfileCreation = allowProfileCreation;
    }

    /**
     * <p>
     * Indicates whether a profile should be created when data is received if one doesn’t exist for an object of this
     * type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to <code>FALSE</code>, then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is set to
     * <code>TRUE</code>, and if no match is found, then the service creates a new standard profile.
     * </p>
     * 
     * @return Indicates whether a profile should be created when data is received if one doesn’t exist for an object of
     *         this type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to
     *         <code>FALSE</code>, then the service tries to fetch a standard profile and associate this object with the
     *         profile. If it is set to <code>TRUE</code>, and if no match is found, then the service creates a new
     *         standard profile.
     */

    public Boolean getAllowProfileCreation() {
        return this.allowProfileCreation;
    }

    /**
     * <p>
     * Indicates whether a profile should be created when data is received if one doesn’t exist for an object of this
     * type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to <code>FALSE</code>, then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is set to
     * <code>TRUE</code>, and if no match is found, then the service creates a new standard profile.
     * </p>
     * 
     * @param allowProfileCreation
     *        Indicates whether a profile should be created when data is received if one doesn’t exist for an object of
     *        this type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to
     *        <code>FALSE</code>, then the service tries to fetch a standard profile and associate this object with the
     *        profile. If it is set to <code>TRUE</code>, and if no match is found, then the service creates a new
     *        standard profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withAllowProfileCreation(Boolean allowProfileCreation) {
        setAllowProfileCreation(allowProfileCreation);
        return this;
    }

    /**
     * <p>
     * Indicates whether a profile should be created when data is received if one doesn’t exist for an object of this
     * type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to <code>FALSE</code>, then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is set to
     * <code>TRUE</code>, and if no match is found, then the service creates a new standard profile.
     * </p>
     * 
     * @return Indicates whether a profile should be created when data is received if one doesn’t exist for an object of
     *         this type. The default is <code>FALSE</code>. If the AllowProfileCreation flag is set to
     *         <code>FALSE</code>, then the service tries to fetch a standard profile and associate this object with the
     *         profile. If it is set to <code>TRUE</code>, and if no match is found, then the service creates a new
     *         standard profile.
     */

    public Boolean isAllowProfileCreation() {
        return this.allowProfileCreation;
    }

    /**
     * <p>
     * A map of the name and ObjectType field.
     * </p>
     * 
     * @return A map of the name and ObjectType field.
     */

    public java.util.Map<String, ObjectTypeField> getFields() {
        return fields;
    }

    /**
     * <p>
     * A map of the name and ObjectType field.
     * </p>
     * 
     * @param fields
     *        A map of the name and ObjectType field.
     */

    public void setFields(java.util.Map<String, ObjectTypeField> fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * A map of the name and ObjectType field.
     * </p>
     * 
     * @param fields
     *        A map of the name and ObjectType field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withFields(java.util.Map<String, ObjectTypeField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * Add a single Fields entry
     *
     * @see GetProfileObjectTypeResult#withFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult addFieldsEntry(String key, ObjectTypeField value) {
        if (null == this.fields) {
            this.fields = new java.util.HashMap<String, ObjectTypeField>();
        }
        if (this.fields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Fields.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult clearFieldsEntries() {
        this.fields = null;
        return this;
    }

    /**
     * <p>
     * A list of unique keys that can be used to map data to the profile.
     * </p>
     * 
     * @return A list of unique keys that can be used to map data to the profile.
     */

    public java.util.Map<String, java.util.List<ObjectTypeKey>> getKeys() {
        return keys;
    }

    /**
     * <p>
     * A list of unique keys that can be used to map data to the profile.
     * </p>
     * 
     * @param keys
     *        A list of unique keys that can be used to map data to the profile.
     */

    public void setKeys(java.util.Map<String, java.util.List<ObjectTypeKey>> keys) {
        this.keys = keys;
    }

    /**
     * <p>
     * A list of unique keys that can be used to map data to the profile.
     * </p>
     * 
     * @param keys
     *        A list of unique keys that can be used to map data to the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withKeys(java.util.Map<String, java.util.List<ObjectTypeKey>> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * Add a single Keys entry
     *
     * @see GetProfileObjectTypeResult#withKeys
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult addKeysEntry(String key, java.util.List<ObjectTypeKey> value) {
        if (null == this.keys) {
            this.keys = new java.util.HashMap<String, java.util.List<ObjectTypeKey>>();
        }
        if (this.keys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Keys.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult clearKeysEntries() {
        this.keys = null;
        return this;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the domain was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @return The timestamp of when the domain was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the domain was most recently edited.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @return The timestamp of when the domain was most recently edited.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the domain was most recently edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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

    public GetProfileObjectTypeResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetProfileObjectTypeResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeResult addTagsEntry(String key, String value) {
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

    public GetProfileObjectTypeResult clearTagsEntries() {
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
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getExpirationDays() != null)
            sb.append("ExpirationDays: ").append(getExpirationDays()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getAllowProfileCreation() != null)
            sb.append("AllowProfileCreation: ").append(getAllowProfileCreation()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
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

        if (obj instanceof GetProfileObjectTypeResult == false)
            return false;
        GetProfileObjectTypeResult other = (GetProfileObjectTypeResult) obj;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getExpirationDays() == null ^ this.getExpirationDays() == null)
            return false;
        if (other.getExpirationDays() != null && other.getExpirationDays().equals(this.getExpirationDays()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getAllowProfileCreation() == null ^ this.getAllowProfileCreation() == null)
            return false;
        if (other.getAllowProfileCreation() != null && other.getAllowProfileCreation().equals(this.getAllowProfileCreation()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getExpirationDays() == null) ? 0 : getExpirationDays().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getAllowProfileCreation() == null) ? 0 : getAllowProfileCreation().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetProfileObjectTypeResult clone() {
        try {
            return (GetProfileObjectTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
