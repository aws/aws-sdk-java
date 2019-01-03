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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectSentimentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * </p>
     */
    private String sentiment;
    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence levels.
     * </p>
     */
    private SentimentScore sentimentScore;

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * </p>
     * 
     * @param sentiment
     *        The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * @see SentimentType
     */

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * </p>
     * 
     * @return The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * @see SentimentType
     */

    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * </p>
     * 
     * @param sentiment
     *        The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public DetectSentimentResult withSentiment(String sentiment) {
        setSentiment(sentiment);
        return this;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * </p>
     * 
     * @param sentiment
     *        The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public DetectSentimentResult withSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
        return this;
    }

    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence levels.
     * </p>
     * 
     * @param sentimentScore
     *        An object that lists the sentiments, and their corresponding confidence levels.
     */

    public void setSentimentScore(SentimentScore sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence levels.
     * </p>
     * 
     * @return An object that lists the sentiments, and their corresponding confidence levels.
     */

    public SentimentScore getSentimentScore() {
        return this.sentimentScore;
    }

    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence levels.
     * </p>
     * 
     * @param sentimentScore
     *        An object that lists the sentiments, and their corresponding confidence levels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectSentimentResult withSentimentScore(SentimentScore sentimentScore) {
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

        if (obj instanceof DetectSentimentResult == false)
            return false;
        DetectSentimentResult other = (DetectSentimentResult) obj;
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

        hashCode = prime * hashCode + ((getSentiment() == null) ? 0 : getSentiment().hashCode());
        hashCode = prime * hashCode + ((getSentimentScore() == null) ? 0 : getSentimentScore().hashCode());
        return hashCode;
    }

    @Override
    public DetectSentimentResult clone() {
        try {
            return (DetectSentimentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
