/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of calling the operation. The operation returns one object for each document that is successfully
 * processed by the operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentimentItemResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectSentimentItemResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     */
    private String sentiment;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
     * </p>
     */
    private SentimentScore sentimentScore;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @return The zero-based index of the document in the input list.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectSentimentItemResult withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * 
     * @param sentiment
     *        The sentiment detected in the document.
     * @see SentimentType
     */

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * 
     * @return The sentiment detected in the document.
     * @see SentimentType
     */

    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * 
     * @param sentiment
     *        The sentiment detected in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public BatchDetectSentimentItemResult withSentiment(String sentiment) {
        setSentiment(sentiment);
        return this;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * 
     * @param sentiment
     *        The sentiment detected in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public BatchDetectSentimentItemResult withSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
     * </p>
     * 
     * @param sentimentScore
     *        The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
     */

    public void setSentimentScore(SentimentScore sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
     */

    public SentimentScore getSentimentScore() {
        return this.sentimentScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
     * </p>
     * 
     * @param sentimentScore
     *        The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectSentimentItemResult withSentimentScore(SentimentScore sentimentScore) {
        setSentimentScore(sentimentScore);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getSentiment() != null)
            sb.append("Sentiment: ").append(getSentiment()).append(",");
        if (getSentimentScore() != null)
            sb.append("SentimentScore: ").append(getSentimentScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectSentimentItemResult == false)
            return false;
        BatchDetectSentimentItemResult other = (BatchDetectSentimentItemResult) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getSentiment() == null ^ this.getSentiment() == null)
            return false;
        if (other.getSentiment() != null && other.getSentiment().equals(this.getSentiment()) == false)
            return false;
        if (other.getSentimentScore() == null ^ this.getSentimentScore() == null)
            return false;
        if (other.getSentimentScore() != null && other.getSentimentScore().equals(this.getSentimentScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getSentiment() == null) ? 0 : getSentiment().hashCode());
        hashCode = prime * hashCode + ((getSentimentScore() == null) ? 0 : getSentimentScore().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetectSentimentItemResult clone() {
        try {
            return (BatchDetectSentimentItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BatchDetectSentimentItemResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
