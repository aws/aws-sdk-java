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
 * A single retrieved relevant passage result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/RetrieveResultItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the relevant passage result.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the document.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The title of the document.
     * </p>
     */
    private String documentTitle;
    /**
     * <p>
     * The contents of the relevant passage.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     */
    private String documentURI;
    /**
     * <p>
     * An array of document fields/attributes assigned to a document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     */
    private java.util.List<DocumentAttribute> documentAttributes;
    /**
     * <p>
     * The confidence score bucket for a retrieved passage result. The confidence bucket provides a relative ranking
     * that indicates how confident Amazon Kendra is that the response is relevant to the query.
     * </p>
     */
    private ScoreAttributes scoreAttributes;

    /**
     * <p>
     * The identifier of the relevant passage result.
     * </p>
     * 
     * @param id
     *        The identifier of the relevant passage result.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the relevant passage result.
     * </p>
     * 
     * @return The identifier of the relevant passage result.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the relevant passage result.
     * </p>
     * 
     * @param id
     *        The identifier of the relevant passage result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResultItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @return The identifier of the document.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResultItem withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param documentTitle
     *        The title of the document.
     */

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @return The title of the document.
     */

    public String getDocumentTitle() {
        return this.documentTitle;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param documentTitle
     *        The title of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResultItem withDocumentTitle(String documentTitle) {
        setDocumentTitle(documentTitle);
        return this;
    }

    /**
     * <p>
     * The contents of the relevant passage.
     * </p>
     * 
     * @param content
     *        The contents of the relevant passage.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The contents of the relevant passage.
     * </p>
     * 
     * @return The contents of the relevant passage.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The contents of the relevant passage.
     * </p>
     * 
     * @param content
     *        The contents of the relevant passage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResultItem withContent(String content) {
        setContent(content);
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

    public RetrieveResultItem withDocumentURI(String documentURI) {
        setDocumentURI(documentURI);
        return this;
    }

    /**
     * <p>
     * An array of document fields/attributes assigned to a document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * 
     * @return An array of document fields/attributes assigned to a document in the search results. For example, the
     *         document author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     */

    public java.util.List<DocumentAttribute> getDocumentAttributes() {
        return documentAttributes;
    }

    /**
     * <p>
     * An array of document fields/attributes assigned to a document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document fields/attributes assigned to a document in the search results. For example, the
     *        document author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
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
     * An array of document fields/attributes assigned to a document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentAttributes(java.util.Collection)} or {@link #withDocumentAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document fields/attributes assigned to a document in the search results. For example, the
     *        document author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResultItem withDocumentAttributes(DocumentAttribute... documentAttributes) {
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
     * An array of document fields/attributes assigned to a document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document fields/attributes assigned to a document in the search results. For example, the
     *        document author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResultItem withDocumentAttributes(java.util.Collection<DocumentAttribute> documentAttributes) {
        setDocumentAttributes(documentAttributes);
        return this;
    }

    /**
     * <p>
     * The confidence score bucket for a retrieved passage result. The confidence bucket provides a relative ranking
     * that indicates how confident Amazon Kendra is that the response is relevant to the query.
     * </p>
     * 
     * @param scoreAttributes
     *        The confidence score bucket for a retrieved passage result. The confidence bucket provides a relative
     *        ranking that indicates how confident Amazon Kendra is that the response is relevant to the query.
     */

    public void setScoreAttributes(ScoreAttributes scoreAttributes) {
        this.scoreAttributes = scoreAttributes;
    }

    /**
     * <p>
     * The confidence score bucket for a retrieved passage result. The confidence bucket provides a relative ranking
     * that indicates how confident Amazon Kendra is that the response is relevant to the query.
     * </p>
     * 
     * @return The confidence score bucket for a retrieved passage result. The confidence bucket provides a relative
     *         ranking that indicates how confident Amazon Kendra is that the response is relevant to the query.
     */

    public ScoreAttributes getScoreAttributes() {
        return this.scoreAttributes;
    }

    /**
     * <p>
     * The confidence score bucket for a retrieved passage result. The confidence bucket provides a relative ranking
     * that indicates how confident Amazon Kendra is that the response is relevant to the query.
     * </p>
     * 
     * @param scoreAttributes
     *        The confidence score bucket for a retrieved passage result. The confidence bucket provides a relative
     *        ranking that indicates how confident Amazon Kendra is that the response is relevant to the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResultItem withScoreAttributes(ScoreAttributes scoreAttributes) {
        setScoreAttributes(scoreAttributes);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDocumentURI() != null)
            sb.append("DocumentURI: ").append(getDocumentURI()).append(",");
        if (getDocumentAttributes() != null)
            sb.append("DocumentAttributes: ").append(getDocumentAttributes()).append(",");
        if (getScoreAttributes() != null)
            sb.append("ScoreAttributes: ").append(getScoreAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveResultItem == false)
            return false;
        RetrieveResultItem other = (RetrieveResultItem) obj;
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
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDocumentURI() == null ^ this.getDocumentURI() == null)
            return false;
        if (other.getDocumentURI() != null && other.getDocumentURI().equals(this.getDocumentURI()) == false)
            return false;
        if (other.getDocumentAttributes() == null ^ this.getDocumentAttributes() == null)
            return false;
        if (other.getDocumentAttributes() != null && other.getDocumentAttributes().equals(this.getDocumentAttributes()) == false)
            return false;
        if (other.getScoreAttributes() == null ^ this.getScoreAttributes() == null)
            return false;
        if (other.getScoreAttributes() != null && other.getScoreAttributes().equals(this.getScoreAttributes()) == false)
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
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDocumentURI() == null) ? 0 : getDocumentURI().hashCode());
        hashCode = prime * hashCode + ((getDocumentAttributes() == null) ? 0 : getDocumentAttributes().hashCode());
        hashCode = prime * hashCode + ((getScoreAttributes() == null) ? 0 : getScoreAttributes().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveResultItem clone() {
        try {
            return (RetrieveResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.RetrieveResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
