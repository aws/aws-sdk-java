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
 * Specifies the configuration for indexing Confluence spaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConfluenceSpaceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluenceSpaceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in personal
     * spaces. If personal spaces are indexed, queries without user context information may return restricted items from
     * a personal space in their results. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     */
    private Boolean crawlPersonalSpaces;
    /**
     * <p>
     * Specifies whether Amazon Kendra should index archived spaces.
     * </p>
     */
    private Boolean crawlArchivedSpaces;
    /**
     * <p>
     * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
     * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     * <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     * </p>
     */
    private java.util.List<String> includeSpaces;
    /**
     * <p>
     * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the <code>IncludeSpaces</code>
     * list, the space is excluded.
     * </p>
     */
    private java.util.List<String> excludeSpaces;
    /**
     * <p>
     * Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     */
    private java.util.List<ConfluenceSpaceToIndexFieldMapping> spaceFieldMappings;

    /**
     * <p>
     * Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in personal
     * spaces. If personal spaces are indexed, queries without user context information may return restricted items from
     * a personal space in their results. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * 
     * @param crawlPersonalSpaces
     *        Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in
     *        personal spaces. If personal spaces are indexed, queries without user context information may return
     *        restricted items from a personal space in their results. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user
     *        context</a>.
     */

    public void setCrawlPersonalSpaces(Boolean crawlPersonalSpaces) {
        this.crawlPersonalSpaces = crawlPersonalSpaces;
    }

    /**
     * <p>
     * Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in personal
     * spaces. If personal spaces are indexed, queries without user context information may return restricted items from
     * a personal space in their results. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * 
     * @return Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in
     *         personal spaces. If personal spaces are indexed, queries without user context information may return
     *         restricted items from a personal space in their results. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user
     *         context</a>.
     */

    public Boolean getCrawlPersonalSpaces() {
        return this.crawlPersonalSpaces;
    }

    /**
     * <p>
     * Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in personal
     * spaces. If personal spaces are indexed, queries without user context information may return restricted items from
     * a personal space in their results. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * 
     * @param crawlPersonalSpaces
     *        Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in
     *        personal spaces. If personal spaces are indexed, queries without user context information may return
     *        restricted items from a personal space in their results. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user
     *        context</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withCrawlPersonalSpaces(Boolean crawlPersonalSpaces) {
        setCrawlPersonalSpaces(crawlPersonalSpaces);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in personal
     * spaces. If personal spaces are indexed, queries without user context information may return restricted items from
     * a personal space in their results. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * 
     * @return Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in
     *         personal spaces. If personal spaces are indexed, queries without user context information may return
     *         restricted items from a personal space in their results. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user
     *         context</a>.
     */

    public Boolean isCrawlPersonalSpaces() {
        return this.crawlPersonalSpaces;
    }

    /**
     * <p>
     * Specifies whether Amazon Kendra should index archived spaces.
     * </p>
     * 
     * @param crawlArchivedSpaces
     *        Specifies whether Amazon Kendra should index archived spaces.
     */

    public void setCrawlArchivedSpaces(Boolean crawlArchivedSpaces) {
        this.crawlArchivedSpaces = crawlArchivedSpaces;
    }

    /**
     * <p>
     * Specifies whether Amazon Kendra should index archived spaces.
     * </p>
     * 
     * @return Specifies whether Amazon Kendra should index archived spaces.
     */

    public Boolean getCrawlArchivedSpaces() {
        return this.crawlArchivedSpaces;
    }

    /**
     * <p>
     * Specifies whether Amazon Kendra should index archived spaces.
     * </p>
     * 
     * @param crawlArchivedSpaces
     *        Specifies whether Amazon Kendra should index archived spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withCrawlArchivedSpaces(Boolean crawlArchivedSpaces) {
        setCrawlArchivedSpaces(crawlArchivedSpaces);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Kendra should index archived spaces.
     * </p>
     * 
     * @return Specifies whether Amazon Kendra should index archived spaces.
     */

    public Boolean isCrawlArchivedSpaces() {
        return this.crawlArchivedSpaces;
    }

    /**
     * <p>
     * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
     * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     * <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     * </p>
     * 
     * @return A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments
     *         in the space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist.
     *         Otherwise, Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     *         <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     */

    public java.util.List<String> getIncludeSpaces() {
        return includeSpaces;
    }

    /**
     * <p>
     * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
     * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     * <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     * </p>
     * 
     * @param includeSpaces
     *        A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in
     *        the space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist.
     *        Otherwise, Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     *        <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     */

    public void setIncludeSpaces(java.util.Collection<String> includeSpaces) {
        if (includeSpaces == null) {
            this.includeSpaces = null;
            return;
        }

        this.includeSpaces = new java.util.ArrayList<String>(includeSpaces);
    }

    /**
     * <p>
     * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
     * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     * <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeSpaces(java.util.Collection)} or {@link #withIncludeSpaces(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includeSpaces
     *        A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in
     *        the space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist.
     *        Otherwise, Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     *        <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withIncludeSpaces(String... includeSpaces) {
        if (this.includeSpaces == null) {
            setIncludeSpaces(new java.util.ArrayList<String>(includeSpaces.length));
        }
        for (String ele : includeSpaces) {
            this.includeSpaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
     * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     * <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     * </p>
     * 
     * @param includeSpaces
     *        A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in
     *        the space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist.
     *        Otherwise, Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
     *        <code>IncludeSpaces</code> and the <code>ExcludeSpaces</code> list, the space is excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withIncludeSpaces(java.util.Collection<String> includeSpaces) {
        setIncludeSpaces(includeSpaces);
        return this;
    }

    /**
     * <p>
     * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the <code>IncludeSpaces</code>
     * list, the space is excluded.
     * </p>
     * 
     * @return A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in
     *         the space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the
     *         <code>IncludeSpaces</code> list, the space is excluded.
     */

    public java.util.List<String> getExcludeSpaces() {
        return excludeSpaces;
    }

    /**
     * <p>
     * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the <code>IncludeSpaces</code>
     * list, the space is excluded.
     * </p>
     * 
     * @param excludeSpaces
     *        A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in
     *        the space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the
     *        <code>IncludeSpaces</code> list, the space is excluded.
     */

    public void setExcludeSpaces(java.util.Collection<String> excludeSpaces) {
        if (excludeSpaces == null) {
            this.excludeSpaces = null;
            return;
        }

        this.excludeSpaces = new java.util.ArrayList<String>(excludeSpaces);
    }

    /**
     * <p>
     * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the <code>IncludeSpaces</code>
     * list, the space is excluded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeSpaces(java.util.Collection)} or {@link #withExcludeSpaces(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludeSpaces
     *        A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in
     *        the space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the
     *        <code>IncludeSpaces</code> list, the space is excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withExcludeSpaces(String... excludeSpaces) {
        if (this.excludeSpaces == null) {
            setExcludeSpaces(new java.util.ArrayList<String>(excludeSpaces.length));
        }
        for (String ele : excludeSpaces) {
            this.excludeSpaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the
     * space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the <code>IncludeSpaces</code>
     * list, the space is excluded.
     * </p>
     * 
     * @param excludeSpaces
     *        A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in
     *        the space are not indexed. If a space is in both the <code>ExcludeSpaces</code> and the
     *        <code>IncludeSpaces</code> list, the space is excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withExcludeSpaces(java.util.Collection<String> excludeSpaces) {
        setExcludeSpaces(excludeSpaces);
        return this;
    }

    /**
     * <p>
     * Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @return Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must
     *         first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *         operation.</p>
     *         <p>
     *         If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field
     *         mapping.
     */

    public java.util.List<ConfluenceSpaceToIndexFieldMapping> getSpaceFieldMappings() {
        return spaceFieldMappings;
    }

    /**
     * <p>
     * Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param spaceFieldMappings
     *        Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     */

    public void setSpaceFieldMappings(java.util.Collection<ConfluenceSpaceToIndexFieldMapping> spaceFieldMappings) {
        if (spaceFieldMappings == null) {
            this.spaceFieldMappings = null;
            return;
        }

        this.spaceFieldMappings = new java.util.ArrayList<ConfluenceSpaceToIndexFieldMapping>(spaceFieldMappings);
    }

    /**
     * <p>
     * Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpaceFieldMappings(java.util.Collection)} or {@link #withSpaceFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param spaceFieldMappings
     *        Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withSpaceFieldMappings(ConfluenceSpaceToIndexFieldMapping... spaceFieldMappings) {
        if (this.spaceFieldMappings == null) {
            setSpaceFieldMappings(new java.util.ArrayList<ConfluenceSpaceToIndexFieldMapping>(spaceFieldMappings.length));
        }
        for (ConfluenceSpaceToIndexFieldMapping ele : spaceFieldMappings) {
            this.spaceFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must first
     * create an index field with a matching type using the console or the <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param spaceFieldMappings
     *        Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must
     *        first create an index field with a matching type using the console or the <code>UpdateIndex</code>
     *        operation.</p>
     *        <p>
     *        If you specify the <code>SpaceFieldMappings</code> parameter, you must specify at least one field mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSpaceConfiguration withSpaceFieldMappings(java.util.Collection<ConfluenceSpaceToIndexFieldMapping> spaceFieldMappings) {
        setSpaceFieldMappings(spaceFieldMappings);
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
        if (getCrawlPersonalSpaces() != null)
            sb.append("CrawlPersonalSpaces: ").append(getCrawlPersonalSpaces()).append(",");
        if (getCrawlArchivedSpaces() != null)
            sb.append("CrawlArchivedSpaces: ").append(getCrawlArchivedSpaces()).append(",");
        if (getIncludeSpaces() != null)
            sb.append("IncludeSpaces: ").append(getIncludeSpaces()).append(",");
        if (getExcludeSpaces() != null)
            sb.append("ExcludeSpaces: ").append(getExcludeSpaces()).append(",");
        if (getSpaceFieldMappings() != null)
            sb.append("SpaceFieldMappings: ").append(getSpaceFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfluenceSpaceConfiguration == false)
            return false;
        ConfluenceSpaceConfiguration other = (ConfluenceSpaceConfiguration) obj;
        if (other.getCrawlPersonalSpaces() == null ^ this.getCrawlPersonalSpaces() == null)
            return false;
        if (other.getCrawlPersonalSpaces() != null && other.getCrawlPersonalSpaces().equals(this.getCrawlPersonalSpaces()) == false)
            return false;
        if (other.getCrawlArchivedSpaces() == null ^ this.getCrawlArchivedSpaces() == null)
            return false;
        if (other.getCrawlArchivedSpaces() != null && other.getCrawlArchivedSpaces().equals(this.getCrawlArchivedSpaces()) == false)
            return false;
        if (other.getIncludeSpaces() == null ^ this.getIncludeSpaces() == null)
            return false;
        if (other.getIncludeSpaces() != null && other.getIncludeSpaces().equals(this.getIncludeSpaces()) == false)
            return false;
        if (other.getExcludeSpaces() == null ^ this.getExcludeSpaces() == null)
            return false;
        if (other.getExcludeSpaces() != null && other.getExcludeSpaces().equals(this.getExcludeSpaces()) == false)
            return false;
        if (other.getSpaceFieldMappings() == null ^ this.getSpaceFieldMappings() == null)
            return false;
        if (other.getSpaceFieldMappings() != null && other.getSpaceFieldMappings().equals(this.getSpaceFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlPersonalSpaces() == null) ? 0 : getCrawlPersonalSpaces().hashCode());
        hashCode = prime * hashCode + ((getCrawlArchivedSpaces() == null) ? 0 : getCrawlArchivedSpaces().hashCode());
        hashCode = prime * hashCode + ((getIncludeSpaces() == null) ? 0 : getIncludeSpaces().hashCode());
        hashCode = prime * hashCode + ((getExcludeSpaces() == null) ? 0 : getExcludeSpaces().hashCode());
        hashCode = prime * hashCode + ((getSpaceFieldMappings() == null) ? 0 : getSpaceFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public ConfluenceSpaceConfiguration clone() {
        try {
            return (ConfluenceSpaceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConfluenceSpaceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
