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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single expanded result in a collapsed group of search results.
 * </p>
 * <p>
 * An expanded result item contains information about an expanded result document within a collapsed group of search
 * results. This includes the original location of the document, a list of attributes assigned to the document, and
 * relevant text from the document that satisfies the query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ExpandedResultItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpandedResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the expanded result.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The idenitifier of the document.
     * </p>
     */
    private String documentId;

    private TextWithHighlights documentTitle;

    private TextWithHighlights documentExcerpt;
    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     */
    private String documentURI;
    /**
     * <p>
     * An array of document attributes assigned to a document in the search results. For example, the document author
     * ("_author") or the source URI ("_source_uri") of the document.
     * </p>
     */
    private java.util.List<DocumentAttribute> documentAttributes;

    /**
     * <p>
     * The identifier for the expanded result.
     * </p>
     * 
     * @param id
     *        The identifier for the expanded result.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the expanded result.
     * </p>
     * 
     * @return The identifier for the expanded result.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the expanded result.
     * </p>
     * 
     * @param id
     *        The identifier for the expanded result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandedResultItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The idenitifier of the document.
     * </p>
     * 
     * @param documentId
     *        The idenitifier of the document.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The idenitifier of the document.
     * </p>
     * 
     * @return The idenitifier of the document.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The idenitifier of the document.
     * </p>
     * 
     * @param documentId
     *        The idenitifier of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandedResultItem withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * @param documentTitle
     */

    public void setDocumentTitle(TextWithHighlights documentTitle) {
        this.documentTitle = documentTitle;
    }

    /**
     * @return
     */

    public TextWithHighlights getDocumentTitle() {
        return this.documentTitle;
    }

    /**
     * @param documentTitle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandedResultItem withDocumentTitle(TextWithHighlights documentTitle) {
        setDocumentTitle(documentTitle);
        return this;
    }

    /**
     * @param documentExcerpt
     */

    public void setDocumentExcerpt(TextWithHighlights documentExcerpt) {
        this.documentExcerpt = documentExcerpt;
    }

    /**
     * @return
     */

    public TextWithHighlights getDocumentExcerpt() {
        return this.documentExcerpt;
    }

    /**
     * @param documentExcerpt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandedResultItem withDocumentExcerpt(TextWithHighlights documentExcerpt) {
        setDocumentExcerpt(documentExcerpt);
        return this;
    }

    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     * 
     * @param documentURI
     *        The URI of the original location of the document.
     */

    public void setDocumentURI(String documentURI) {
        this.documentURI = documentURI;
    }

    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     * 
     * @return The URI of the original location of the document.
     */

    public String getDocumentURI() {
        return this.documentURI;
    }

    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     * 
     * @param documentURI
     *        The URI of the original location of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandedResultItem withDocumentURI(String documentURI) {
        setDocumentURI(documentURI);
        return this;
    }

    /**
     * <p>
     * An array of document attributes assigned to a document in the search results. For example, the document author
     * ("_author") or the source URI ("_source_uri") of the document.
     * </p>
     * 
     * @return An array of document attributes assigned to a document in the search results. For example, the document
     *         author ("_author") or the source URI ("_source_uri") of the document.
     */

    public java.util.List<DocumentAttribute> getDocumentAttributes() {
        return documentAttributes;
    }

    /**
     * <p>
     * An array of document attributes assigned to a document in the search results. For example, the document author
     * ("_author") or the source URI ("_source_uri") of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes assigned to a document in the search results. For example, the document
     *        author ("_author") or the source URI ("_source_uri") of the document.
     */

    public void setDocumentAttributes(java.util.Collection<DocumentAttribute> documentAttributes) {
        if (documentAttributes == null) {
            this.documentAttributes = null;
            return;
        }

        this.documentAttributes = new java.util.ArrayList<DocumentAttribute>(documentAttributes);
    }

    /**
     * <p>
     * An array of document attributes assigned to a document in the search results. For example, the document author
     * ("_author") or the source URI ("_source_uri") of the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentAttributes(java.util.Collection)} or {@link #withDocumentAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes assigned to a document in the search results. For example, the document
     *        author ("_author") or the source URI ("_source_uri") of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandedResultItem withDocumentAttributes(DocumentAttribute... documentAttributes) {
        if (this.documentAttributes == null) {
            setDocumentAttributes(new java.util.ArrayList<DocumentAttribute>(documentAttributes.length));
        }
        for (DocumentAttribute ele : documentAttributes) {
            this.documentAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of document attributes assigned to a document in the search results. For example, the document author
     * ("_author") or the source URI ("_source_uri") of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes assigned to a document in the search results. For example, the document
     *        author ("_author") or the source URI ("_source_uri") of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandedResultItem withDocumentAttributes(java.util.Collection<DocumentAttribute> documentAttributes) {
        setDocumentAttributes(documentAttributes);
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
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getDocumentTitle() != null)
            sb.append("DocumentTitle: ").append(getDocumentTitle()).append(",");
        if (getDocumentExcerpt() != null)
            sb.append("DocumentExcerpt: ").append(getDocumentExcerpt()).append(",");
        if (getDocumentURI() != null)
            sb.append("DocumentURI: ").append(getDocumentURI()).append(",");
        if (getDocumentAttributes() != null)
            sb.append("DocumentAttributes: ").append(getDocumentAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpandedResultItem == false)
            return false;
        ExpandedResultItem other = (ExpandedResultItem) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getDocumentTitle() == null ^ this.getDocumentTitle() == null)
            return false;
        if (other.getDocumentTitle() != null && other.getDocumentTitle().equals(this.getDocumentTitle()) == false)
            return false;
        if (other.getDocumentExcerpt() == null ^ this.getDocumentExcerpt() == null)
            return false;
        if (other.getDocumentExcerpt() != null && other.getDocumentExcerpt().equals(this.getDocumentExcerpt()) == false)
            return false;
        if (other.getDocumentURI() == null ^ this.getDocumentURI() == null)
            return false;
        if (other.getDocumentURI() != null && other.getDocumentURI().equals(this.getDocumentURI()) == false)
            return false;
        if (other.getDocumentAttributes() == null ^ this.getDocumentAttributes() == null)
            return false;
        if (other.getDocumentAttributes() != null && other.getDocumentAttributes().equals(this.getDocumentAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getDocumentTitle() == null) ? 0 : getDocumentTitle().hashCode());
        hashCode = prime * hashCode + ((getDocumentExcerpt() == null) ? 0 : getDocumentExcerpt().hashCode());
        hashCode = prime * hashCode + ((getDocumentURI() == null) ? 0 : getDocumentURI().hashCode());
        hashCode = prime * hashCode + ((getDocumentAttributes() == null) ? 0 : getDocumentAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ExpandedResultItem clone() {
        try {
            return (ExpandedResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ExpandedResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
