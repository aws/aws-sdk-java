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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectTypeTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileObjectTypeTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The source of the object template.
     * </p>
     */
    private String sourceObject;
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

    public GetProfileObjectTypeTemplateResult withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     * 
     * @param sourceName
     *        The name of the source of the object template.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     * 
     * @return The name of the source of the object template.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     * 
     * @param sourceName
     *        The name of the source of the object template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeTemplateResult withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The source of the object template.
     * </p>
     * 
     * @param sourceObject
     *        The source of the object template.
     */

    public void setSourceObject(String sourceObject) {
        this.sourceObject = sourceObject;
    }

    /**
     * <p>
     * The source of the object template.
     * </p>
     * 
     * @return The source of the object template.
     */

    public String getSourceObject() {
        return this.sourceObject;
    }

    /**
     * <p>
     * The source of the object template.
     * </p>
     * 
     * @param sourceObject
     *        The source of the object template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeTemplateResult withSourceObject(String sourceObject) {
        setSourceObject(sourceObject);
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

    public GetProfileObjectTypeTemplateResult withAllowProfileCreation(Boolean allowProfileCreation) {
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

    public GetProfileObjectTypeTemplateResult withFields(java.util.Map<String, ObjectTypeField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * Add a single Fields entry
     *
     * @see GetProfileObjectTypeTemplateResult#withFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeTemplateResult addFieldsEntry(String key, ObjectTypeField value) {
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

    public GetProfileObjectTypeTemplateResult clearFieldsEntries() {
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

    public GetProfileObjectTypeTemplateResult withKeys(java.util.Map<String, java.util.List<ObjectTypeKey>> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * Add a single Keys entry
     *
     * @see GetProfileObjectTypeTemplateResult#withKeys
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileObjectTypeTemplateResult addKeysEntry(String key, java.util.List<ObjectTypeKey> value) {
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

    public GetProfileObjectTypeTemplateResult clearKeysEntries() {
        this.keys = null;
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
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceObject() != null)
            sb.append("SourceObject: ").append(getSourceObject()).append(",");
        if (getAllowProfileCreation() != null)
            sb.append("AllowProfileCreation: ").append(getAllowProfileCreation()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProfileObjectTypeTemplateResult == false)
            return false;
        GetProfileObjectTypeTemplateResult other = (GetProfileObjectTypeTemplateResult) obj;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceObject() == null ^ this.getSourceObject() == null)
            return false;
        if (other.getSourceObject() != null && other.getSourceObject().equals(this.getSourceObject()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceObject() == null) ? 0 : getSourceObject().hashCode());
        hashCode = prime * hashCode + ((getAllowProfileCreation() == null) ? 0 : getAllowProfileCreation().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public GetProfileObjectTypeTemplateResult clone() {
        try {
            return (GetProfileObjectTypeTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
