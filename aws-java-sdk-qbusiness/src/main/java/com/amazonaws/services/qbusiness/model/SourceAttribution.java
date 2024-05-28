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
 * The documents used to generate an Amazon Q Business web experience response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/SourceAttribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceAttribution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the document which is the source for the Amazon Q Business generated response.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The content extract from the document on which the generated response is based.
     * </p>
     */
    private String snippet;
    /**
     * <p>
     * The URL of the document which is the source for the Amazon Q Business generated response.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The number attached to a citation in an Amazon Q Business generated response.
     * </p>
     */
    private Integer citationNumber;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * A text extract from a source document that is used for source attribution.
     * </p>
     */
    private java.util.List<TextSegment> textMessageSegments;

    /**
     * <p>
     * The title of the document which is the source for the Amazon Q Business generated response.
     * </p>
     * 
     * @param title
     *        The title of the document which is the source for the Amazon Q Business generated response.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the document which is the source for the Amazon Q Business generated response.
     * </p>
     * 
     * @return The title of the document which is the source for the Amazon Q Business generated response.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the document which is the source for the Amazon Q Business generated response.
     * </p>
     * 
     * @param title
     *        The title of the document which is the source for the Amazon Q Business generated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAttribution withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The content extract from the document on which the generated response is based.
     * </p>
     * 
     * @param snippet
     *        The content extract from the document on which the generated response is based.
     */

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    /**
     * <p>
     * The content extract from the document on which the generated response is based.
     * </p>
     * 
     * @return The content extract from the document on which the generated response is based.
     */

    public String getSnippet() {
        return this.snippet;
    }

    /**
     * <p>
     * The content extract from the document on which the generated response is based.
     * </p>
     * 
     * @param snippet
     *        The content extract from the document on which the generated response is based.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAttribution withSnippet(String snippet) {
        setSnippet(snippet);
        return this;
    }

    /**
     * <p>
     * The URL of the document which is the source for the Amazon Q Business generated response.
     * </p>
     * 
     * @param url
     *        The URL of the document which is the source for the Amazon Q Business generated response.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the document which is the source for the Amazon Q Business generated response.
     * </p>
     * 
     * @return The URL of the document which is the source for the Amazon Q Business generated response.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the document which is the source for the Amazon Q Business generated response.
     * </p>
     * 
     * @param url
     *        The URL of the document which is the source for the Amazon Q Business generated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAttribution withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The number attached to a citation in an Amazon Q Business generated response.
     * </p>
     * 
     * @param citationNumber
     *        The number attached to a citation in an Amazon Q Business generated response.
     */

    public void setCitationNumber(Integer citationNumber) {
        this.citationNumber = citationNumber;
    }

    /**
     * <p>
     * The number attached to a citation in an Amazon Q Business generated response.
     * </p>
     * 
     * @return The number attached to a citation in an Amazon Q Business generated response.
     */

    public Integer getCitationNumber() {
        return this.citationNumber;
    }

    /**
     * <p>
     * The number attached to a citation in an Amazon Q Business generated response.
     * </p>
     * 
     * @param citationNumber
     *        The number attached to a citation in an Amazon Q Business generated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAttribution withCitationNumber(Integer citationNumber) {
        setCitationNumber(citationNumber);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAttribution withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * A text extract from a source document that is used for source attribution.
     * </p>
     * 
     * @return A text extract from a source document that is used for source attribution.
     */

    public java.util.List<TextSegment> getTextMessageSegments() {
        return textMessageSegments;
    }

    /**
     * <p>
     * A text extract from a source document that is used for source attribution.
     * </p>
     * 
     * @param textMessageSegments
     *        A text extract from a source document that is used for source attribution.
     */

    public void setTextMessageSegments(java.util.Collection<TextSegment> textMessageSegments) {
        if (textMessageSegments == null) {
            this.textMessageSegments = null;
            return;
        }

        this.textMessageSegments = new java.util.ArrayList<TextSegment>(textMessageSegments);
    }

    /**
     * <p>
     * A text extract from a source document that is used for source attribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextMessageSegments(java.util.Collection)} or {@link #withTextMessageSegments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param textMessageSegments
     *        A text extract from a source document that is used for source attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAttribution withTextMessageSegments(TextSegment... textMessageSegments) {
        if (this.textMessageSegments == null) {
            setTextMessageSegments(new java.util.ArrayList<TextSegment>(textMessageSegments.length));
        }
        for (TextSegment ele : textMessageSegments) {
            this.textMessageSegments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A text extract from a source document that is used for source attribution.
     * </p>
     * 
     * @param textMessageSegments
     *        A text extract from a source document that is used for source attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAttribution withTextMessageSegments(java.util.Collection<TextSegment> textMessageSegments) {
        setTextMessageSegments(textMessageSegments);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSnippet() != null)
            sb.append("Snippet: ").append(getSnippet()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getCitationNumber() != null)
            sb.append("CitationNumber: ").append(getCitationNumber()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getTextMessageSegments() != null)
            sb.append("TextMessageSegments: ").append(getTextMessageSegments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAttribution == false)
            return false;
        SourceAttribution other = (SourceAttribution) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSnippet() == null ^ this.getSnippet() == null)
            return false;
        if (other.getSnippet() != null && other.getSnippet().equals(this.getSnippet()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getCitationNumber() == null ^ this.getCitationNumber() == null)
            return false;
        if (other.getCitationNumber() != null && other.getCitationNumber().equals(this.getCitationNumber()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getTextMessageSegments() == null ^ this.getTextMessageSegments() == null)
            return false;
        if (other.getTextMessageSegments() != null && other.getTextMessageSegments().equals(this.getTextMessageSegments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSnippet() == null) ? 0 : getSnippet().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getCitationNumber() == null) ? 0 : getCitationNumber().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTextMessageSegments() == null) ? 0 : getTextMessageSegments().hashCode());
        return hashCode;
    }

    @Override
    public SourceAttribution clone() {
        try {
            return (SourceAttribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.SourceAttributionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
