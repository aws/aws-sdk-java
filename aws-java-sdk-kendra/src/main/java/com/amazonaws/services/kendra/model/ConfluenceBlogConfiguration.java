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
 * Specifies the blog settings for the Confluence data source. Blogs are always indexed unless filtered from the index
 * by the <code>ExclusionPatterns</code> or <code>InclusionPatterns</code> fields in the
 * <code>ConfluenceConfiguration</code> type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConfluenceBlogConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluenceBlogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     */
    private java.util.List<ConfluenceBlogToIndexFieldMapping> blogFieldMappings;

    /**
     * <p>
     * Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @return Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must
     *         first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *         operation.</p>
     *         <p>
     *         If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     */

    public java.util.List<ConfluenceBlogToIndexFieldMapping> getBlogFieldMappings() {
        return blogFieldMappings;
    }

    /**
     * <p>
     * Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param blogFieldMappings
     *        Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     */

    public void setBlogFieldMappings(java.util.Collection<ConfluenceBlogToIndexFieldMapping> blogFieldMappings) {
        if (blogFieldMappings == null) {
            this.blogFieldMappings = null;
            return;
        }

        this.blogFieldMappings = new java.util.ArrayList<ConfluenceBlogToIndexFieldMapping>(blogFieldMappings);
    }

    /**
     * <p>
     * Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlogFieldMappings(java.util.Collection)} or {@link #withBlogFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param blogFieldMappings
     *        Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceBlogConfiguration withBlogFieldMappings(ConfluenceBlogToIndexFieldMapping... blogFieldMappings) {
        if (this.blogFieldMappings == null) {
            setBlogFieldMappings(new java.util.ArrayList<ConfluenceBlogToIndexFieldMapping>(blogFieldMappings.length));
        }
        for (ConfluenceBlogToIndexFieldMapping ele : blogFieldMappings) {
            this.blogFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param blogFieldMappings
     *        Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>BlogFieldMappings</code> parameter, you must specify at least one field mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceBlogConfiguration withBlogFieldMappings(java.util.Collection<ConfluenceBlogToIndexFieldMapping> blogFieldMappings) {
        setBlogFieldMappings(blogFieldMappings);
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
        if (getBlogFieldMappings() != null)
            sb.append("BlogFieldMappings: ").append(getBlogFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfluenceBlogConfiguration == false)
            return false;
        ConfluenceBlogConfiguration other = (ConfluenceBlogConfiguration) obj;
        if (other.getBlogFieldMappings() == null ^ this.getBlogFieldMappings() == null)
            return false;
        if (other.getBlogFieldMappings() != null && other.getBlogFieldMappings().equals(this.getBlogFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlogFieldMappings() == null) ? 0 : getBlogFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public ConfluenceBlogConfiguration clone() {
        try {
            return (ConfluenceBlogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConfluenceBlogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
