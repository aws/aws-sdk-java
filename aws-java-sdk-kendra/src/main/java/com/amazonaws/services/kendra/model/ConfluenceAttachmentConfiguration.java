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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration of attachment settings for the Confluence data source. Attachment settings are optional, if you don't
 * specify settings attachments, Amazon Kendra won't index them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConfluenceAttachmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluenceAttachmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     * </p>
     */
    private Boolean crawlAttachments;
    /**
     * <p>
     * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * Confluence data source field names must exist in your Confluence custom metadata.
     * </p>
     * <p>
     * If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     */
    private java.util.List<ConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings;

    /**
     * <p>
     * <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     */

    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     * </p>
     * 
     * @return <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     */

    public Boolean getCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceAttachmentConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        setCrawlAttachments(crawlAttachments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     * </p>
     * 
     * @return <code>TRUE</code> to index attachments of pages and blogs in Confluence.
     */

    public Boolean isCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * Confluence data source field names must exist in your Confluence custom metadata.
     * </p>
     * <p>
     * If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @return Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create
     *         custom fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more
     *         information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *         source fields</a>. The Confluence data source field names must exist in your Confluence custom
     *         metadata.</p>
     *         <p>
     *         If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field
     *         mapping.
     */

    public java.util.List<ConfluenceAttachmentToIndexFieldMapping> getAttachmentFieldMappings() {
        return attachmentFieldMappings;
    }

    /**
     * <p>
     * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * Confluence data source field names must exist in your Confluence custom metadata.
     * </p>
     * <p>
     * If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create
     *        custom fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *        source fields</a>. The Confluence data source field names must exist in your Confluence custom
     *        metadata.</p>
     *        <p>
     *        If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field
     *        mapping.
     */

    public void setAttachmentFieldMappings(java.util.Collection<ConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings) {
        if (attachmentFieldMappings == null) {
            this.attachmentFieldMappings = null;
            return;
        }

        this.attachmentFieldMappings = new java.util.ArrayList<ConfluenceAttachmentToIndexFieldMapping>(attachmentFieldMappings);
    }

    /**
     * <p>
     * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * Confluence data source field names must exist in your Confluence custom metadata.
     * </p>
     * <p>
     * If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachmentFieldMappings(java.util.Collection)} or
     * {@link #withAttachmentFieldMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create
     *        custom fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *        source fields</a>. The Confluence data source field names must exist in your Confluence custom
     *        metadata.</p>
     *        <p>
     *        If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field
     *        mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceAttachmentConfiguration withAttachmentFieldMappings(ConfluenceAttachmentToIndexFieldMapping... attachmentFieldMappings) {
        if (this.attachmentFieldMappings == null) {
            setAttachmentFieldMappings(new java.util.ArrayList<ConfluenceAttachmentToIndexFieldMapping>(attachmentFieldMappings.length));
        }
        for (ConfluenceAttachmentToIndexFieldMapping ele : attachmentFieldMappings) {
            this.attachmentFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create custom
     * fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * Confluence data source field names must exist in your Confluence custom metadata.
     * </p>
     * <p>
     * If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field mapping.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create
     *        custom fields, use the <code>UpdateIndex</code> API before you map to Confluence fields. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data
     *        source fields</a>. The Confluence data source field names must exist in your Confluence custom
     *        metadata.</p>
     *        <p>
     *        If you specify the <code>AttachentFieldMappings</code> parameter, you must specify at least one field
     *        mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceAttachmentConfiguration withAttachmentFieldMappings(java.util.Collection<ConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings) {
        setAttachmentFieldMappings(attachmentFieldMappings);
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
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: ").append(getCrawlAttachments()).append(",");
        if (getAttachmentFieldMappings() != null)
            sb.append("AttachmentFieldMappings: ").append(getAttachmentFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfluenceAttachmentConfiguration == false)
            return false;
        ConfluenceAttachmentConfiguration other = (ConfluenceAttachmentConfiguration) obj;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getAttachmentFieldMappings() == null ^ this.getAttachmentFieldMappings() == null)
            return false;
        if (other.getAttachmentFieldMappings() != null && other.getAttachmentFieldMappings().equals(this.getAttachmentFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime * hashCode + ((getAttachmentFieldMappings() == null) ? 0 : getAttachmentFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public ConfluenceAttachmentConfiguration clone() {
        try {
            return (ConfluenceAttachmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConfluenceAttachmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
