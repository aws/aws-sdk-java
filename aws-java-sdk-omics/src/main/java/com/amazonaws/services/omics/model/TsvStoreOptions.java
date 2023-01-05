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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * File settings for a TSV store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/TsvStoreOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TsvStoreOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The store's annotation type.
     * </p>
     */
    private String annotationType;
    /**
     * <p>
     * The store's header key to column name mapping.
     * </p>
     */
    private java.util.Map<String, String> formatToHeader;
    /**
     * <p>
     * The store's schema.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> schema;

    /**
     * <p>
     * The store's annotation type.
     * </p>
     * 
     * @param annotationType
     *        The store's annotation type.
     * @see AnnotationType
     */

    public void setAnnotationType(String annotationType) {
        this.annotationType = annotationType;
    }

    /**
     * <p>
     * The store's annotation type.
     * </p>
     * 
     * @return The store's annotation type.
     * @see AnnotationType
     */

    public String getAnnotationType() {
        return this.annotationType;
    }

    /**
     * <p>
     * The store's annotation type.
     * </p>
     * 
     * @param annotationType
     *        The store's annotation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnnotationType
     */

    public TsvStoreOptions withAnnotationType(String annotationType) {
        setAnnotationType(annotationType);
        return this;
    }

    /**
     * <p>
     * The store's annotation type.
     * </p>
     * 
     * @param annotationType
     *        The store's annotation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnnotationType
     */

    public TsvStoreOptions withAnnotationType(AnnotationType annotationType) {
        this.annotationType = annotationType.toString();
        return this;
    }

    /**
     * <p>
     * The store's header key to column name mapping.
     * </p>
     * 
     * @return The store's header key to column name mapping.
     */

    public java.util.Map<String, String> getFormatToHeader() {
        return formatToHeader;
    }

    /**
     * <p>
     * The store's header key to column name mapping.
     * </p>
     * 
     * @param formatToHeader
     *        The store's header key to column name mapping.
     */

    public void setFormatToHeader(java.util.Map<String, String> formatToHeader) {
        this.formatToHeader = formatToHeader;
    }

    /**
     * <p>
     * The store's header key to column name mapping.
     * </p>
     * 
     * @param formatToHeader
     *        The store's header key to column name mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TsvStoreOptions withFormatToHeader(java.util.Map<String, String> formatToHeader) {
        setFormatToHeader(formatToHeader);
        return this;
    }

    /**
     * Add a single FormatToHeader entry
     *
     * @see TsvStoreOptions#withFormatToHeader
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TsvStoreOptions addFormatToHeaderEntry(String key, String value) {
        if (null == this.formatToHeader) {
            this.formatToHeader = new java.util.HashMap<String, String>();
        }
        if (this.formatToHeader.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.formatToHeader.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FormatToHeader.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TsvStoreOptions clearFormatToHeaderEntries() {
        this.formatToHeader = null;
        return this;
    }

    /**
     * <p>
     * The store's schema.
     * </p>
     * 
     * @return The store's schema.
     */

    public java.util.List<java.util.Map<String, String>> getSchema() {
        return schema;
    }

    /**
     * <p>
     * The store's schema.
     * </p>
     * 
     * @param schema
     *        The store's schema.
     */

    public void setSchema(java.util.Collection<java.util.Map<String, String>> schema) {
        if (schema == null) {
            this.schema = null;
            return;
        }

        this.schema = new java.util.ArrayList<java.util.Map<String, String>>(schema);
    }

    /**
     * <p>
     * The store's schema.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchema(java.util.Collection)} or {@link #withSchema(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param schema
     *        The store's schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TsvStoreOptions withSchema(java.util.Map<String, String>... schema) {
        if (this.schema == null) {
            setSchema(new java.util.ArrayList<java.util.Map<String, String>>(schema.length));
        }
        for (java.util.Map<String, String> ele : schema) {
            this.schema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The store's schema.
     * </p>
     * 
     * @param schema
     *        The store's schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TsvStoreOptions withSchema(java.util.Collection<java.util.Map<String, String>> schema) {
        setSchema(schema);
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
        if (getAnnotationType() != null)
            sb.append("AnnotationType: ").append(getAnnotationType()).append(",");
        if (getFormatToHeader() != null)
            sb.append("FormatToHeader: ").append(getFormatToHeader()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TsvStoreOptions == false)
            return false;
        TsvStoreOptions other = (TsvStoreOptions) obj;
        if (other.getAnnotationType() == null ^ this.getAnnotationType() == null)
            return false;
        if (other.getAnnotationType() != null && other.getAnnotationType().equals(this.getAnnotationType()) == false)
            return false;
        if (other.getFormatToHeader() == null ^ this.getFormatToHeader() == null)
            return false;
        if (other.getFormatToHeader() != null && other.getFormatToHeader().equals(this.getFormatToHeader()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnnotationType() == null) ? 0 : getAnnotationType().hashCode());
        hashCode = prime * hashCode + ((getFormatToHeader() == null) ? 0 : getFormatToHeader().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public TsvStoreOptions clone() {
        try {
            return (TsvStoreOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.TsvStoreOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
