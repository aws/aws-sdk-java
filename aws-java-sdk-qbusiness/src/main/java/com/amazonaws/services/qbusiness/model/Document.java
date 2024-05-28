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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A document in an Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Document" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Document implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     * </p>
     */
    private java.util.List<DocumentAttribute> attributes;
    /**
     * <p>
     * The contents of the document.
     * </p>
     */
    private DocumentContent content;
    /**
     * <p>
     * The file type of the document in the Blob field.
     * </p>
     * <p>
     * If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents, you add
     * the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>) around the content.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The title of the document.
     * </p>
     */
    private String title;
    /**
     * <p>
     * Configuration information for access permission to a document.
     * </p>
     */
    private AccessConfiguration accessConfiguration;
    /**
     * <p>
     * The configuration information for altering document metadata and content during the document ingestion process.
     * </p>
     */
    private DocumentEnrichmentConfiguration documentEnrichmentConfiguration;

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @param id
     *        The identifier of the document.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @return The identifier of the document.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @param id
     *        The identifier of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     * </p>
     * 
     * @return Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     */

    public java.util.List<DocumentAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     * </p>
     * 
     * @param attributes
     *        Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     */

    public void setAttributes(java.util.Collection<DocumentAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<DocumentAttribute>(attributes);
    }

    /**
     * <p>
     * Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withAttributes(DocumentAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<DocumentAttribute>(attributes.length));
        }
        for (DocumentAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     * </p>
     * 
     * @param attributes
     *        Custom attributes to apply to the document for refining Amazon Q Business web experience responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withAttributes(java.util.Collection<DocumentAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The contents of the document.
     * </p>
     * 
     * @param content
     *        The contents of the document.
     */

    public void setContent(DocumentContent content) {
        this.content = content;
    }

    /**
     * <p>
     * The contents of the document.
     * </p>
     * 
     * @return The contents of the document.
     */

    public DocumentContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * The contents of the document.
     * </p>
     * 
     * @param content
     *        The contents of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withContent(DocumentContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The file type of the document in the Blob field.
     * </p>
     * <p>
     * If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents, you add
     * the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>) around the content.
     * </p>
     * 
     * @param contentType
     *        The file type of the document in the Blob field.</p>
     *        <p>
     *        If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents,
     *        you add the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>)
     *        around the content.
     * @see ContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The file type of the document in the Blob field.
     * </p>
     * <p>
     * If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents, you add
     * the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>) around the content.
     * </p>
     * 
     * @return The file type of the document in the Blob field.</p>
     *         <p>
     *         If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents,
     *         you add the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>)
     *         around the content.
     * @see ContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The file type of the document in the Blob field.
     * </p>
     * <p>
     * If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents, you add
     * the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>) around the content.
     * </p>
     * 
     * @param contentType
     *        The file type of the document in the Blob field.</p>
     *        <p>
     *        If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents,
     *        you add the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>)
     *        around the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public Document withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The file type of the document in the Blob field.
     * </p>
     * <p>
     * If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents, you add
     * the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>) around the content.
     * </p>
     * 
     * @param contentType
     *        The file type of the document in the Blob field.</p>
     *        <p>
     *        If you want to index snippets or subsets of HTML documents instead of the entirety of the HTML documents,
     *        you add the <code>HTML</code> start and closing tags (<code>&lt;HTML&gt;content&lt;/HTML&gt;</code>)
     *        around the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public Document withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param title
     *        The title of the document.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @return The title of the document.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param title
     *        The title of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * Configuration information for access permission to a document.
     * </p>
     * 
     * @param accessConfiguration
     *        Configuration information for access permission to a document.
     */

    public void setAccessConfiguration(AccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
    }

    /**
     * <p>
     * Configuration information for access permission to a document.
     * </p>
     * 
     * @return Configuration information for access permission to a document.
     */

    public AccessConfiguration getAccessConfiguration() {
        return this.accessConfiguration;
    }

    /**
     * <p>
     * Configuration information for access permission to a document.
     * </p>
     * 
     * @param accessConfiguration
     *        Configuration information for access permission to a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withAccessConfiguration(AccessConfiguration accessConfiguration) {
        setAccessConfiguration(accessConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration information for altering document metadata and content during the document ingestion process.
     * </p>
     * 
     * @param documentEnrichmentConfiguration
     *        The configuration information for altering document metadata and content during the document ingestion
     *        process.
     */

    public void setDocumentEnrichmentConfiguration(DocumentEnrichmentConfiguration documentEnrichmentConfiguration) {
        this.documentEnrichmentConfiguration = documentEnrichmentConfiguration;
    }

    /**
     * <p>
     * The configuration information for altering document metadata and content during the document ingestion process.
     * </p>
     * 
     * @return The configuration information for altering document metadata and content during the document ingestion
     *         process.
     */

    public DocumentEnrichmentConfiguration getDocumentEnrichmentConfiguration() {
        return this.documentEnrichmentConfiguration;
    }

    /**
     * <p>
     * The configuration information for altering document metadata and content during the document ingestion process.
     * </p>
     * 
     * @param documentEnrichmentConfiguration
     *        The configuration information for altering document metadata and content during the document ingestion
     *        process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withDocumentEnrichmentConfiguration(DocumentEnrichmentConfiguration documentEnrichmentConfiguration) {
        setDocumentEnrichmentConfiguration(documentEnrichmentConfiguration);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getAccessConfiguration() != null)
            sb.append("AccessConfiguration: ").append(getAccessConfiguration()).append(",");
        if (getDocumentEnrichmentConfiguration() != null)
            sb.append("DocumentEnrichmentConfiguration: ").append(getDocumentEnrichmentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Document == false)
            return false;
        Document other = (Document) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getAccessConfiguration() == null ^ this.getAccessConfiguration() == null)
            return false;
        if (other.getAccessConfiguration() != null && other.getAccessConfiguration().equals(this.getAccessConfiguration()) == false)
            return false;
        if (other.getDocumentEnrichmentConfiguration() == null ^ this.getDocumentEnrichmentConfiguration() == null)
            return false;
        if (other.getDocumentEnrichmentConfiguration() != null
                && other.getDocumentEnrichmentConfiguration().equals(this.getDocumentEnrichmentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getAccessConfiguration() == null) ? 0 : getAccessConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDocumentEnrichmentConfiguration() == null) ? 0 : getDocumentEnrichmentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
