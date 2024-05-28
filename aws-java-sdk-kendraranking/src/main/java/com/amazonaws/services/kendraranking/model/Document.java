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
package com.amazonaws.services.kendraranking.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a document from a search service such as OpenSearch (self managed). Amazon Kendra Intelligent
 * Ranking uses this information to rank and score on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/Document" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Document implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The optional group identifier of the document from the search service. Documents with the same group identifier
     * are grouped together and processed as one document within the service.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The title of the search service's document.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The body text of the search service's document.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The title of the search service's document represented as a list of tokens or words. You must choose to provide
     * <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     * </p>
     */
    private java.util.List<String> tokenizedTitle;
    /**
     * <p>
     * The body text of the search service's document represented as a list of tokens or words. You must choose to
     * provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     * </p>
     */
    private java.util.List<String> tokenizedBody;
    /**
     * <p>
     * The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the document
     * a new score or rank based on its intelligent search algorithms.
     * </p>
     */
    private Float originalScore;

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     * 
     * @param id
     *        The identifier of the document from the search service.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     * 
     * @return The identifier of the document from the search service.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     * 
     * @param id
     *        The identifier of the document from the search service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The optional group identifier of the document from the search service. Documents with the same group identifier
     * are grouped together and processed as one document within the service.
     * </p>
     * 
     * @param groupId
     *        The optional group identifier of the document from the search service. Documents with the same group
     *        identifier are grouped together and processed as one document within the service.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The optional group identifier of the document from the search service. Documents with the same group identifier
     * are grouped together and processed as one document within the service.
     * </p>
     * 
     * @return The optional group identifier of the document from the search service. Documents with the same group
     *         identifier are grouped together and processed as one document within the service.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The optional group identifier of the document from the search service. Documents with the same group identifier
     * are grouped together and processed as one document within the service.
     * </p>
     * 
     * @param groupId
     *        The optional group identifier of the document from the search service. Documents with the same group
     *        identifier are grouped together and processed as one document within the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The title of the search service's document.
     * </p>
     * 
     * @param title
     *        The title of the search service's document.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the search service's document.
     * </p>
     * 
     * @return The title of the search service's document.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the search service's document.
     * </p>
     * 
     * @param title
     *        The title of the search service's document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The body text of the search service's document.
     * </p>
     * 
     * @param body
     *        The body text of the search service's document.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body text of the search service's document.
     * </p>
     * 
     * @return The body text of the search service's document.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body text of the search service's document.
     * </p>
     * 
     * @param body
     *        The body text of the search service's document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The title of the search service's document represented as a list of tokens or words. You must choose to provide
     * <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     * </p>
     * 
     * @return The title of the search service's document represented as a list of tokens or words. You must choose to
     *         provide <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     */

    public java.util.List<String> getTokenizedTitle() {
        return tokenizedTitle;
    }

    /**
     * <p>
     * The title of the search service's document represented as a list of tokens or words. You must choose to provide
     * <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     * </p>
     * 
     * @param tokenizedTitle
     *        The title of the search service's document represented as a list of tokens or words. You must choose to
     *        provide <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     */

    public void setTokenizedTitle(java.util.Collection<String> tokenizedTitle) {
        if (tokenizedTitle == null) {
            this.tokenizedTitle = null;
            return;
        }

        this.tokenizedTitle = new java.util.ArrayList<String>(tokenizedTitle);
    }

    /**
     * <p>
     * The title of the search service's document represented as a list of tokens or words. You must choose to provide
     * <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenizedTitle(java.util.Collection)} or {@link #withTokenizedTitle(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tokenizedTitle
     *        The title of the search service's document represented as a list of tokens or words. You must choose to
     *        provide <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withTokenizedTitle(String... tokenizedTitle) {
        if (this.tokenizedTitle == null) {
            setTokenizedTitle(new java.util.ArrayList<String>(tokenizedTitle.length));
        }
        for (String ele : tokenizedTitle) {
            this.tokenizedTitle.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The title of the search service's document represented as a list of tokens or words. You must choose to provide
     * <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     * </p>
     * 
     * @param tokenizedTitle
     *        The title of the search service's document represented as a list of tokens or words. You must choose to
     *        provide <code>Title</code> or <code>TokenizedTitle</code>. You cannot provide both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withTokenizedTitle(java.util.Collection<String> tokenizedTitle) {
        setTokenizedTitle(tokenizedTitle);
        return this;
    }

    /**
     * <p>
     * The body text of the search service's document represented as a list of tokens or words. You must choose to
     * provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     * </p>
     * 
     * @return The body text of the search service's document represented as a list of tokens or words. You must choose
     *         to provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     */

    public java.util.List<String> getTokenizedBody() {
        return tokenizedBody;
    }

    /**
     * <p>
     * The body text of the search service's document represented as a list of tokens or words. You must choose to
     * provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     * </p>
     * 
     * @param tokenizedBody
     *        The body text of the search service's document represented as a list of tokens or words. You must choose
     *        to provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     */

    public void setTokenizedBody(java.util.Collection<String> tokenizedBody) {
        if (tokenizedBody == null) {
            this.tokenizedBody = null;
            return;
        }

        this.tokenizedBody = new java.util.ArrayList<String>(tokenizedBody);
    }

    /**
     * <p>
     * The body text of the search service's document represented as a list of tokens or words. You must choose to
     * provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenizedBody(java.util.Collection)} or {@link #withTokenizedBody(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tokenizedBody
     *        The body text of the search service's document represented as a list of tokens or words. You must choose
     *        to provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withTokenizedBody(String... tokenizedBody) {
        if (this.tokenizedBody == null) {
            setTokenizedBody(new java.util.ArrayList<String>(tokenizedBody.length));
        }
        for (String ele : tokenizedBody) {
            this.tokenizedBody.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The body text of the search service's document represented as a list of tokens or words. You must choose to
     * provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     * </p>
     * 
     * @param tokenizedBody
     *        The body text of the search service's document represented as a list of tokens or words. You must choose
     *        to provide <code>Body</code> or <code>TokenizedBody</code>. You cannot provide both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withTokenizedBody(java.util.Collection<String> tokenizedBody) {
        setTokenizedBody(tokenizedBody);
        return this;
    }

    /**
     * <p>
     * The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the document
     * a new score or rank based on its intelligent search algorithms.
     * </p>
     * 
     * @param originalScore
     *        The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the
     *        document a new score or rank based on its intelligent search algorithms.
     */

    public void setOriginalScore(Float originalScore) {
        this.originalScore = originalScore;
    }

    /**
     * <p>
     * The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the document
     * a new score or rank based on its intelligent search algorithms.
     * </p>
     * 
     * @return The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the
     *         document a new score or rank based on its intelligent search algorithms.
     */

    public Float getOriginalScore() {
        return this.originalScore;
    }

    /**
     * <p>
     * The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the document
     * a new score or rank based on its intelligent search algorithms.
     * </p>
     * 
     * @param originalScore
     *        The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the
     *        document a new score or rank based on its intelligent search algorithms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withOriginalScore(Float originalScore) {
        setOriginalScore(originalScore);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getTokenizedTitle() != null)
            sb.append("TokenizedTitle: ").append(getTokenizedTitle()).append(",");
        if (getTokenizedBody() != null)
            sb.append("TokenizedBody: ").append(getTokenizedBody()).append(",");
        if (getOriginalScore() != null)
            sb.append("OriginalScore: ").append(getOriginalScore());
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
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getTokenizedTitle() == null ^ this.getTokenizedTitle() == null)
            return false;
        if (other.getTokenizedTitle() != null && other.getTokenizedTitle().equals(this.getTokenizedTitle()) == false)
            return false;
        if (other.getTokenizedBody() == null ^ this.getTokenizedBody() == null)
            return false;
        if (other.getTokenizedBody() != null && other.getTokenizedBody().equals(this.getTokenizedBody()) == false)
            return false;
        if (other.getOriginalScore() == null ^ this.getOriginalScore() == null)
            return false;
        if (other.getOriginalScore() != null && other.getOriginalScore().equals(this.getOriginalScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getTokenizedTitle() == null) ? 0 : getTokenizedTitle().hashCode());
        hashCode = prime * hashCode + ((getTokenizedBody() == null) ? 0 : getTokenizedBody().hashCode());
        hashCode = prime * hashCode + ((getOriginalScore() == null) ? 0 : getOriginalScore().hashCode());
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
        com.amazonaws.services.kendraranking.model.transform.DocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
