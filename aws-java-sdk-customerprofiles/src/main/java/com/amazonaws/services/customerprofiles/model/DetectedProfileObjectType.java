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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains <code>ProfileObjectType</code> mapping information from the model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DetectedProfileObjectType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedProfileObjectType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of <code>sourceLastUpdatedTimestamp</code> that was detected in fields.
     * </p>
     */
    private String sourceLastUpdatedTimestampFormat;
    /**
     * <p>
     * A map of the name and the <code>ObjectType</code> field.
     * </p>
     */
    private java.util.Map<String, ObjectTypeField> fields;
    /**
     * <p>
     * A list of unique keys that can be used to map data to a profile.
     * </p>
     */
    private java.util.Map<String, java.util.List<ObjectTypeKey>> keys;

    /**
     * <p>
     * The format of <code>sourceLastUpdatedTimestamp</code> that was detected in fields.
     * </p>
     * 
     * @param sourceLastUpdatedTimestampFormat
     *        The format of <code>sourceLastUpdatedTimestamp</code> that was detected in fields.
     */

    public void setSourceLastUpdatedTimestampFormat(String sourceLastUpdatedTimestampFormat) {
        this.sourceLastUpdatedTimestampFormat = sourceLastUpdatedTimestampFormat;
    }

    /**
     * <p>
     * The format of <code>sourceLastUpdatedTimestamp</code> that was detected in fields.
     * </p>
     * 
     * @return The format of <code>sourceLastUpdatedTimestamp</code> that was detected in fields.
     */

    public String getSourceLastUpdatedTimestampFormat() {
        return this.sourceLastUpdatedTimestampFormat;
    }

    /**
     * <p>
     * The format of <code>sourceLastUpdatedTimestamp</code> that was detected in fields.
     * </p>
     * 
     * @param sourceLastUpdatedTimestampFormat
     *        The format of <code>sourceLastUpdatedTimestamp</code> that was detected in fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProfileObjectType withSourceLastUpdatedTimestampFormat(String sourceLastUpdatedTimestampFormat) {
        setSourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat);
        return this;
    }

    /**
     * <p>
     * A map of the name and the <code>ObjectType</code> field.
     * </p>
     * 
     * @return A map of the name and the <code>ObjectType</code> field.
     */

    public java.util.Map<String, ObjectTypeField> getFields() {
        return fields;
    }

    /**
     * <p>
     * A map of the name and the <code>ObjectType</code> field.
     * </p>
     * 
     * @param fields
     *        A map of the name and the <code>ObjectType</code> field.
     */

    public void setFields(java.util.Map<String, ObjectTypeField> fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * A map of the name and the <code>ObjectType</code> field.
     * </p>
     * 
     * @param fields
     *        A map of the name and the <code>ObjectType</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProfileObjectType withFields(java.util.Map<String, ObjectTypeField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * Add a single Fields entry
     *
     * @see DetectedProfileObjectType#withFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProfileObjectType addFieldsEntry(String key, ObjectTypeField value) {
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

    public DetectedProfileObjectType clearFieldsEntries() {
        this.fields = null;
        return this;
    }

    /**
     * <p>
     * A list of unique keys that can be used to map data to a profile.
     * </p>
     * 
     * @return A list of unique keys that can be used to map data to a profile.
     */

    public java.util.Map<String, java.util.List<ObjectTypeKey>> getKeys() {
        return keys;
    }

    /**
     * <p>
     * A list of unique keys that can be used to map data to a profile.
     * </p>
     * 
     * @param keys
     *        A list of unique keys that can be used to map data to a profile.
     */

    public void setKeys(java.util.Map<String, java.util.List<ObjectTypeKey>> keys) {
        this.keys = keys;
    }

    /**
     * <p>
     * A list of unique keys that can be used to map data to a profile.
     * </p>
     * 
     * @param keys
     *        A list of unique keys that can be used to map data to a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProfileObjectType withKeys(java.util.Map<String, java.util.List<ObjectTypeKey>> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * Add a single Keys entry
     *
     * @see DetectedProfileObjectType#withKeys
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProfileObjectType addKeysEntry(String key, java.util.List<ObjectTypeKey> value) {
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

    public DetectedProfileObjectType clearKeysEntries() {
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
        if (getSourceLastUpdatedTimestampFormat() != null)
            sb.append("SourceLastUpdatedTimestampFormat: ").append(getSourceLastUpdatedTimestampFormat()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append("***Sensitive Data Redacted***").append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectedProfileObjectType == false)
            return false;
        DetectedProfileObjectType other = (DetectedProfileObjectType) obj;
        if (other.getSourceLastUpdatedTimestampFormat() == null ^ this.getSourceLastUpdatedTimestampFormat() == null)
            return false;
        if (other.getSourceLastUpdatedTimestampFormat() != null
                && other.getSourceLastUpdatedTimestampFormat().equals(this.getSourceLastUpdatedTimestampFormat()) == false)
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

        hashCode = prime * hashCode + ((getSourceLastUpdatedTimestampFormat() == null) ? 0 : getSourceLastUpdatedTimestampFormat().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public DetectedProfileObjectType clone() {
        try {
            return (DetectedProfileObjectType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.DetectedProfileObjectTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
