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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the page settings for the Confluence data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConfluencePageConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluencePageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     */
    private java.util.List<ConfluencePageToIndexFieldMapping> pageFieldMappings;

    /**
     * <p>
     * Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @return Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must
     *         first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *         operation.</p>
     *         <p>
     *         If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     */

    public java.util.List<ConfluencePageToIndexFieldMapping> getPageFieldMappings() {
        return pageFieldMappings;
    }

    /**
     * <p>
     * Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param pageFieldMappings
     *        Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     */

    public void setPageFieldMappings(java.util.Collection<ConfluencePageToIndexFieldMapping> pageFieldMappings) {
        if (pageFieldMappings == null) {
            this.pageFieldMappings = null;
            return;
        }

        this.pageFieldMappings = new java.util.ArrayList<ConfluencePageToIndexFieldMapping>(pageFieldMappings);
    }

    /**
     * <p>
     * Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPageFieldMappings(java.util.Collection)} or {@link #withPageFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pageFieldMappings
     *        Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluencePageConfiguration withPageFieldMappings(ConfluencePageToIndexFieldMapping... pageFieldMappings) {
        if (this.pageFieldMappings == null) {
            setPageFieldMappings(new java.util.ArrayList<ConfluencePageToIndexFieldMapping>(pageFieldMappings.length));
        }
        for (ConfluencePageToIndexFieldMapping ele : pageFieldMappings) {
            this.pageFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param pageFieldMappings
     *        Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>PageFieldMappings</code> parameter, you must specify at least one field mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluencePageConfiguration withPageFieldMappings(java.util.Collection<ConfluencePageToIndexFieldMapping> pageFieldMappings) {
        setPageFieldMappings(pageFieldMappings);
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
        if (getPageFieldMappings() != null)
            sb.append("PageFieldMappings: ").append(getPageFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfluencePageConfiguration == false)
            return false;
        ConfluencePageConfiguration other = (ConfluencePageConfiguration) obj;
        if (other.getPageFieldMappings() == null ^ this.getPageFieldMappings() == null)
            return false;
        if (other.getPageFieldMappings() != null && other.getPageFieldMappings().equals(this.getPageFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageFieldMappings() == null) ? 0 : getPageFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public ConfluencePageConfiguration clone() {
        try {
            return (ConfluencePageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConfluencePageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
