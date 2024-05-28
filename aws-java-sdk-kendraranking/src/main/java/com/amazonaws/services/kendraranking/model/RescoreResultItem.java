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
 * A result item for a document with a new relevancy score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/RescoreResultItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RescoreResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document from the search service.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     * 
     * @return The identifier of the document from the search service.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The identifier of the document from the search service.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document from the search service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreResultItem withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
     * </p>
     * 
     * @param score
     *        The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
     * </p>
     * 
     * @return The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
     * </p>
     * 
     * @param score
     *        The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreResultItem withScore(Float score) {
        setScore(score);
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
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RescoreResultItem == false)
            return false;
        RescoreResultItem other = (RescoreResultItem) obj;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public RescoreResultItem clone() {
        try {
            return (RescoreResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendraranking.model.transform.RescoreResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
