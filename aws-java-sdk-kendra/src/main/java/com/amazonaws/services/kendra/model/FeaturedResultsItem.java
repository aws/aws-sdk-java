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
 * A single featured result item. A featured result is displayed at the top of the search results page, placed above all
 * other results for certain queries. If there's an exact match of a query, then certain documents are featured in the
 * search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FeaturedResultsItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeaturedResultsItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the featured result.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of document within the featured result response. For example, a response could include a question-answer
     * type that's relevant to the query.
     * </p>
     */
    private String type;
    /**
     * <p>
     * One or more additional attributes associated with the featured result.
     * </p>
     */
    private java.util.List<AdditionalResultAttribute> additionalAttributes;
    /**
     * <p>
     * The identifier of the featured document.
     * </p>
     */
    private String documentId;

    private TextWithHighlights documentTitle;

    private TextWithHighlights documentExcerpt;
    /**
     * <p>
     * The source URI location of the featured document.
     * </p>
     */
    private String documentURI;
    /**
     * <p>
     * An array of document attributes assigned to a featured document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     */
    private java.util.List<DocumentAttribute> documentAttributes;
    /**
     * <p>
     * A token that identifies a particular featured result from a particular query. Use this token to provide
     * click-through feedback for the result. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/submitting-feedback.html">Submitting feedback</a>.
     * </p>
     */
    private String feedbackToken;

    /**
     * <p>
     * The identifier of the featured result.
     * </p>
     * 
     * @param id
     *        The identifier of the featured result.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the featured result.
     * </p>
     * 
     * @return The identifier of the featured result.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the featured result.
     * </p>
     * 
     * @param id
     *        The identifier of the featured result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of document within the featured result response. For example, a response could include a question-answer
     * type that's relevant to the query.
     * </p>
     * 
     * @param type
     *        The type of document within the featured result response. For example, a response could include a
     *        question-answer type that's relevant to the query.
     * @see QueryResultType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document within the featured result response. For example, a response could include a question-answer
     * type that's relevant to the query.
     * </p>
     * 
     * @return The type of document within the featured result response. For example, a response could include a
     *         question-answer type that's relevant to the query.
     * @see QueryResultType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of document within the featured result response. For example, a response could include a question-answer
     * type that's relevant to the query.
     * </p>
     * 
     * @param type
     *        The type of document within the featured result response. For example, a response could include a
     *        question-answer type that's relevant to the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public FeaturedResultsItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of document within the featured result response. For example, a response could include a question-answer
     * type that's relevant to the query.
     * </p>
     * 
     * @param type
     *        The type of document within the featured result response. For example, a response could include a
     *        question-answer type that's relevant to the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public FeaturedResultsItem withType(QueryResultType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * One or more additional attributes associated with the featured result.
     * </p>
     * 
     * @return One or more additional attributes associated with the featured result.
     */

    public java.util.List<AdditionalResultAttribute> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * <p>
     * One or more additional attributes associated with the featured result.
     * </p>
     * 
     * @param additionalAttributes
     *        One or more additional attributes associated with the featured result.
     */

    public void setAdditionalAttributes(java.util.Collection<AdditionalResultAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }

        this.additionalAttributes = new java.util.ArrayList<AdditionalResultAttribute>(additionalAttributes);
    }

    /**
     * <p>
     * One or more additional attributes associated with the featured result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAttributes(java.util.Collection)} or {@link #withAdditionalAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalAttributes
     *        One or more additional attributes associated with the featured result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withAdditionalAttributes(AdditionalResultAttribute... additionalAttributes) {
        if (this.additionalAttributes == null) {
            setAdditionalAttributes(new java.util.ArrayList<AdditionalResultAttribute>(additionalAttributes.length));
        }
        for (AdditionalResultAttribute ele : additionalAttributes) {
            this.additionalAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more additional attributes associated with the featured result.
     * </p>
     * 
     * @param additionalAttributes
     *        One or more additional attributes associated with the featured result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withAdditionalAttributes(java.util.Collection<AdditionalResultAttribute> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
        return this;
    }

    /**
     * <p>
     * The identifier of the featured document.
     * </p>
     * 
     * @param documentId
     *        The identifier of the featured document.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The identifier of the featured document.
     * </p>
     * 
     * @return The identifier of the featured document.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The identifier of the featured document.
     * </p>
     * 
     * @param documentId
     *        The identifier of the featured document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withDocumentId(String documentId) {
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

    public FeaturedResultsItem withDocumentTitle(TextWithHighlights documentTitle) {
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

    public FeaturedResultsItem withDocumentExcerpt(TextWithHighlights documentExcerpt) {
        setDocumentExcerpt(documentExcerpt);
        return this;
    }

    /**
     * <p>
     * The source URI location of the featured document.
     * </p>
     * 
     * @param documentURI
     *        The source URI location of the featured document.
     */

    public void setDocumentURI(String documentURI) {
        this.documentURI = documentURI;
    }

    /**
     * <p>
     * The source URI location of the featured document.
     * </p>
     * 
     * @return The source URI location of the featured document.
     */

    public String getDocumentURI() {
        return this.documentURI;
    }

    /**
     * <p>
     * The source URI location of the featured document.
     * </p>
     * 
     * @param documentURI
     *        The source URI location of the featured document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withDocumentURI(String documentURI) {
        setDocumentURI(documentURI);
        return this;
    }

    /**
     * <p>
     * An array of document attributes assigned to a featured document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * 
     * @return An array of document attributes assigned to a featured document in the search results. For example, the
     *         document author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     */

    public java.util.List<DocumentAttribute> getDocumentAttributes() {
        return documentAttributes;
    }

    /**
     * <p>
     * An array of document attributes assigned to a featured document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes assigned to a featured document in the search results. For example, the
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
     * An array of document attributes assigned to a featured document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentAttributes(java.util.Collection)} or {@link #withDocumentAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes assigned to a featured document in the search results. For example, the
     *        document author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withDocumentAttributes(DocumentAttribute... documentAttributes) {
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
     * An array of document attributes assigned to a featured document in the search results. For example, the document
     * author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * </p>
     * 
     * @param documentAttributes
     *        An array of document attributes assigned to a featured document in the search results. For example, the
     *        document author (<code>_author</code>) or the source URI (<code>_source_uri</code>) of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withDocumentAttributes(java.util.Collection<DocumentAttribute> documentAttributes) {
        setDocumentAttributes(documentAttributes);
        return this;
    }

    /**
     * <p>
     * A token that identifies a particular featured result from a particular query. Use this token to provide
     * click-through feedback for the result. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/submitting-feedback.html">Submitting feedback</a>.
     * </p>
     * 
     * @param feedbackToken
     *        A token that identifies a particular featured result from a particular query. Use this token to provide
     *        click-through feedback for the result. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/submitting-feedback.html">Submitting feedback</a>.
     */

    public void setFeedbackToken(String feedbackToken) {
        this.feedbackToken = feedbackToken;
    }

    /**
     * <p>
     * A token that identifies a particular featured result from a particular query. Use this token to provide
     * click-through feedback for the result. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/submitting-feedback.html">Submitting feedback</a>.
     * </p>
     * 
     * @return A token that identifies a particular featured result from a particular query. Use this token to provide
     *         click-through feedback for the result. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/submitting-feedback.html">Submitting feedback</a>.
     */

    public String getFeedbackToken() {
        return this.feedbackToken;
    }

    /**
     * <p>
     * A token that identifies a particular featured result from a particular query. Use this token to provide
     * click-through feedback for the result. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/submitting-feedback.html">Submitting feedback</a>.
     * </p>
     * 
     * @param feedbackToken
     *        A token that identifies a particular featured result from a particular query. Use this token to provide
     *        click-through feedback for the result. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/submitting-feedback.html">Submitting feedback</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsItem withFeedbackToken(String feedbackToken) {
        setFeedbackToken(feedbackToken);
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
            sb.append("DocumentAttributes: ").append(getDocumentAttributes()).append(",");
        if (getFeedbackToken() != null)
            sb.append("FeedbackToken: ").append(getFeedbackToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeaturedResultsItem == false)
            return false;
        FeaturedResultsItem other = (FeaturedResultsItem) obj;
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
        if (other.getFeedbackToken() == null ^ this.getFeedbackToken() == null)
            return false;
        if (other.getFeedbackToken() != null && other.getFeedbackToken().equals(this.getFeedbackToken()) == false)
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
        hashCode = prime * hashCode + ((getFeedbackToken() == null) ? 0 : getFeedbackToken().hashCode());
        return hashCode;
    }

    @Override
    public FeaturedResultsItem clone() {
        try {
            return (FeaturedResultsItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FeaturedResultsItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
