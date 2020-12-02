/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that defines the Key element of a ProfileObject. A Key is a special element that can be used to search for
 * a customer profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ObjectTypeKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectTypeKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple
     * PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be
     * used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
     * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not
     * persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already
     * exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * </p>
     */
    private java.util.List<String> standardIdentifiers;
    /**
     * <p>
     * The reference for the key name of the fields map.
     * </p>
     */
    private java.util.List<String> fieldNames;

    /**
     * <p>
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple
     * PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be
     * used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
     * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not
     * persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already
     * exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * </p>
     * 
     * @return The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but
     *         multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE
     *         means that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be
     *         used to search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only
     *         used to match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is
     *         only used if the profile does not already exist before the object is ingested, otherwise it is only used
     *         for matching objects to profiles.
     * @see StandardIdentifier
     */

    public java.util.List<String> getStandardIdentifiers() {
        return standardIdentifiers;
    }

    /**
     * <p>
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple
     * PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be
     * used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
     * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not
     * persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already
     * exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * </p>
     * 
     * @param standardIdentifiers
     *        The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but
     *        multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means
     *        that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to
     *        search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
     *        match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used
     *        if the profile does not already exist before the object is ingested, otherwise it is only used for
     *        matching objects to profiles.
     * @see StandardIdentifier
     */

    public void setStandardIdentifiers(java.util.Collection<String> standardIdentifiers) {
        if (standardIdentifiers == null) {
            this.standardIdentifiers = null;
            return;
        }

        this.standardIdentifiers = new java.util.ArrayList<String>(standardIdentifiers);
    }

    /**
     * <p>
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple
     * PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be
     * used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
     * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not
     * persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already
     * exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardIdentifiers(java.util.Collection)} or {@link #withStandardIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param standardIdentifiers
     *        The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but
     *        multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means
     *        that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to
     *        search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
     *        match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used
     *        if the profile does not already exist before the object is ingested, otherwise it is only used for
     *        matching objects to profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardIdentifier
     */

    public ObjectTypeKey withStandardIdentifiers(String... standardIdentifiers) {
        if (this.standardIdentifiers == null) {
            setStandardIdentifiers(new java.util.ArrayList<String>(standardIdentifiers.length));
        }
        for (String ele : standardIdentifiers) {
            this.standardIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple
     * PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be
     * used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
     * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not
     * persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already
     * exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * </p>
     * 
     * @param standardIdentifiers
     *        The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but
     *        multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means
     *        that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to
     *        search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
     *        match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used
     *        if the profile does not already exist before the object is ingested, otherwise it is only used for
     *        matching objects to profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardIdentifier
     */

    public ObjectTypeKey withStandardIdentifiers(java.util.Collection<String> standardIdentifiers) {
        setStandardIdentifiers(standardIdentifiers);
        return this;
    }

    /**
     * <p>
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple
     * PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be
     * used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
     * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not
     * persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already
     * exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * </p>
     * 
     * @param standardIdentifiers
     *        The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but
     *        multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means
     *        that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to
     *        search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
     *        match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used
     *        if the profile does not already exist before the object is ingested, otherwise it is only used for
     *        matching objects to profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardIdentifier
     */

    public ObjectTypeKey withStandardIdentifiers(StandardIdentifier... standardIdentifiers) {
        java.util.ArrayList<String> standardIdentifiersCopy = new java.util.ArrayList<String>(standardIdentifiers.length);
        for (StandardIdentifier value : standardIdentifiers) {
            standardIdentifiersCopy.add(value.toString());
        }
        if (getStandardIdentifiers() == null) {
            setStandardIdentifiers(standardIdentifiersCopy);
        } else {
            getStandardIdentifiers().addAll(standardIdentifiersCopy);
        }
        return this;
    }

    /**
     * <p>
     * The reference for the key name of the fields map.
     * </p>
     * 
     * @return The reference for the key name of the fields map.
     */

    public java.util.List<String> getFieldNames() {
        return fieldNames;
    }

    /**
     * <p>
     * The reference for the key name of the fields map.
     * </p>
     * 
     * @param fieldNames
     *        The reference for the key name of the fields map.
     */

    public void setFieldNames(java.util.Collection<String> fieldNames) {
        if (fieldNames == null) {
            this.fieldNames = null;
            return;
        }

        this.fieldNames = new java.util.ArrayList<String>(fieldNames);
    }

    /**
     * <p>
     * The reference for the key name of the fields map.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldNames(java.util.Collection)} or {@link #withFieldNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldNames
     *        The reference for the key name of the fields map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectTypeKey withFieldNames(String... fieldNames) {
        if (this.fieldNames == null) {
            setFieldNames(new java.util.ArrayList<String>(fieldNames.length));
        }
        for (String ele : fieldNames) {
            this.fieldNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reference for the key name of the fields map.
     * </p>
     * 
     * @param fieldNames
     *        The reference for the key name of the fields map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectTypeKey withFieldNames(java.util.Collection<String> fieldNames) {
        setFieldNames(fieldNames);
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
        if (getStandardIdentifiers() != null)
            sb.append("StandardIdentifiers: ").append(getStandardIdentifiers()).append(",");
        if (getFieldNames() != null)
            sb.append("FieldNames: ").append(getFieldNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectTypeKey == false)
            return false;
        ObjectTypeKey other = (ObjectTypeKey) obj;
        if (other.getStandardIdentifiers() == null ^ this.getStandardIdentifiers() == null)
            return false;
        if (other.getStandardIdentifiers() != null && other.getStandardIdentifiers().equals(this.getStandardIdentifiers()) == false)
            return false;
        if (other.getFieldNames() == null ^ this.getFieldNames() == null)
            return false;
        if (other.getFieldNames() != null && other.getFieldNames().equals(this.getFieldNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardIdentifiers() == null) ? 0 : getStandardIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getFieldNames() == null) ? 0 : getFieldNames().hashCode());
        return hashCode;
    }

    @Override
    public ObjectTypeKey clone() {
        try {
            return (ObjectTypeKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ObjectTypeKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
