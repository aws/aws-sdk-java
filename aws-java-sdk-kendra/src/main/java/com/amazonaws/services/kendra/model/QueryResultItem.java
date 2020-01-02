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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single query result.
 * </p>
 * <p>
 * A query result contains information about a document returned by the query. This includes the original location of
 * the document, a list of attributes assigned to the document, and relevant text from the document that satisfies the
 * query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/QueryResultItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of document.
     * </p>
     */
    private String type;
    /** <p/> */
    private java.util.List<AdditionalResultAttribute> additionalAttributes;
    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The title of the document. Contains the text of the title and information for highlighting the relevant terms in
     * the title.
     * </p>
     */
    private TextWithHighlights documentTitle;
    /**
     * <p>
     * An extract of the text in the document. Contains information about highlighting the relevant terms in the
     * excerpt.
     * </p>
     */
    private TextWithHighlights documentExcerpt;
    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     */
    private String documentURI;
    /**
     * <p>
     * An array of document attributes for the document that the query result maps to. For example, the document author
     * (Author) or the source URI (SourceUri) of the document.
     * </p>
     */
    private java.util.List<DocumentAttribute> documentAttributes;

    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     * 
     * @param id
     *        The unique identifier for the query result.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     * 
     * @return The unique identifier for the query result.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     * 
     * @param id
     *        The unique identifier for the query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @param type
     *        The type of document.
     * @see QueryResultType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @return The type of document.
     * @see QueryResultType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @param type
     *        The type of document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public QueryResultItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @param type
     *        The type of document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public QueryResultItem withType(QueryResultType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<AdditionalResultAttribute> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * <p/>
     * 
     * @param additionalAttributes
     */

    public void setAdditionalAttributes(java.util.Collection<AdditionalResultAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }

        this.additionalAttributes = new java.util.ArrayList<AdditionalResultAttribute>(additionalAttributes);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAttributes(java.util.Collection)} or {@link #withAdditionalAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withAdditionalAttributes(AdditionalResultAttribute... additionalAttributes) {
        if (this.additionalAttributes == null) {
            setAdditionalAttributes(new java.util.ArrayList<AdditionalResultAttribute>(additionalAttributes.length));
        }
        for (AdditionalResultAttribute ele : additionalAttributes) {
            this.additionalAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param additionalAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withAdditionalAttributes(java.util.Collection<AdditionalResultAttribute> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     * 
     * @param documentId
     *        The unique identifier for the document.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     * 
     * @return The unique identifier for the document.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     * 
     * @param documentId
     *        The unique identifier for the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The title of the document. Contains the text of the title and information for highlighting the relevant terms in
     * the title.
     * </p>
     * 
     * @param documentTitle
     *        The title of the document. Contains the text of the title and information for highlighting the relevant
     *        terms in the title.
     */

    public void setDocumentTitle(TextWithHighlights documentTitle) {
        this.documentTitle = documentTitle;
    }

    /**
     * <p>
     * The title of the document. Contains the text of the title and information for highlighting the relevant terms in
     * the title.
     * </p>
     * 
     * @return The title of the document. Contains the text of the title and information for highlighting the relevant
     *         terms in the title.
     */

    public TextWithHighlights getDocumentTitle() {
        return this.documentTitle;
    }

    /**
     * <p>
     * The title of the document. Contains the text of the title and information for highlighting the relevant terms in
     * the title.
     * </p>
     * 
     * @param documentTitle
     *        The title of the document. Contains the text of the title and information for highlighting the relevant
     *        terms in the title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withDocumentTitle(TextWithHighlights documentTitle) {
        setDocumentTitle(documentTitle);
        return this;
    }

    /**
     * <p>
     * An extract of the text in the document. Contains information about highlighting the relevant terms in the
     * excerpt.
     * </p>
     * 
     * @param documentExcerpt
     *        An extract of the text in the document. Contains information about highlighting the relevant terms in the
     *        excerpt.
     */

    public void setDocumentExcerpt(TextWithHighlights documentExcerpt) {
        this.documentExcerpt = documentExcerpt;
    }

    /**
     * <p>
     * An extract of the text in the document. Contains information about highlighting the relevant terms in the
     * excerpt.
     * </p>
     * 
     * @return An extract of the text in the document. Contains information about highlighting the relevant terms in the
     *         excerpt.
     */

    public TextWithHighlights getDocumentExcerpt() {
        return this.documentExcerpt;
    }

    /**
     * <p>
     * An extract of the text in the document. Contains information about highlighting the relevant terms in the
     * excerpt.
     * </p>
     * 
     * @param documentExcerpt
     *        An extract of the text in the document. Contains information about highlighting the relevant terms in the
     *        excerpt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withDocumentExcerpt(TextWithHighlights documentExcerpt) {
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

    public QueryResultItem withDocumentURI(String documentURI) {
        setDocumentURI(documentURI);
        return this;
    }

    /**
     * <p>
     * An array of document attributes for the document that the query result maps to. For example, the document author
     * (Author) or the source URI (SourceUri) of the document.
     * </p>
     * 
     * @return An array of document attributes for the document that the query result maps to. For example, the document
     *         author (Author) or the source URI (SourceUri) of the document.
     */

    public java.util.List<DocumentAttribute> getDocumentAttributes() {
        return documentAttributes;
    }

    /**
     * <p>
     * An array of document attributes for the document that the query result maps to. For example, the document author
     * (Author) or the source URI (SourceUri) of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes for the document that the query result maps to. For example, the document
     *        author (Author) or the source URI (SourceUri) of the document.
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
     * An array of document attributes for the document that the query result maps to. For example, the document author
     * (Author) or the source URI (SourceUri) of the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentAttributes(java.util.Collection)} or {@link #withDocumentAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes for the document that the query result maps to. For example, the document
     *        author (Author) or the source URI (SourceUri) of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withDocumentAttributes(DocumentAttribute... documentAttributes) {
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
     * An array of document attributes for the document that the query result maps to. For example, the document author
     * (Author) or the source URI (SourceUri) of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes for the document that the query result maps to. For example, the document
     *        author (Author) or the source URI (SourceUri) of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultItem withDocumentAttributes(java.util.Collection<DocumentAttribute> documentAttributes) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: ").append(getAdditionalAttributes()).append(",");
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

        if (obj instanceof QueryResultItem == false)
            return false;
        QueryResultItem other = (QueryResultItem) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getDocumentTitle() == null) ? 0 : getDocumentTitle().hashCode());
        hashCode = prime * hashCode + ((getDocumentExcerpt() == null) ? 0 : getDocumentExcerpt().hashCode());
        hashCode = prime * hashCode + ((getDocumentURI() == null) ? 0 : getDocumentURI().hashCode());
        hashCode = prime * hashCode + ((getDocumentAttributes() == null) ? 0 : getDocumentAttributes().hashCode());
        return hashCode;
    }

    @Override
    public QueryResultItem clone() {
        try {
            return (QueryResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.QueryResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
