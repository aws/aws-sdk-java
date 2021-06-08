/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the sentiment expressed in a user's response in a conversation. Sentiments are determined
 * using Amazon Comprehend. Sentiments are only returned if they are enabled for the bot.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-sentiment.html"> Determine
 * Sentiment </a> in the <i>Amazon Comprehend developer guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/SentimentResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SentimentResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the user
     * based on the analysis by Amazon Comprehend.
     * </p>
     */
    private String sentiment;

    private SentimentScore sentimentScore;

    /**
     * <p>
     * The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the user
     * based on the analysis by Amazon Comprehend.
     * </p>
     * 
     * @param sentiment
     *        The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the
     *        user based on the analysis by Amazon Comprehend.
     * @see SentimentType
     */

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the user
     * based on the analysis by Amazon Comprehend.
     * </p>
     * 
     * @return The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by
     *         the user based on the analysis by Amazon Comprehend.
     * @see SentimentType
     */

    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * <p>
     * The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the user
     * based on the analysis by Amazon Comprehend.
     * </p>
     * 
     * @param sentiment
     *        The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the
     *        user based on the analysis by Amazon Comprehend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public SentimentResponse withSentiment(String sentiment) {
        setSentiment(sentiment);
        return this;
    }

    /**
     * <p>
     * The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the user
     * based on the analysis by Amazon Comprehend.
     * </p>
     * 
     * @param sentiment
     *        The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the
     *        user based on the analysis by Amazon Comprehend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public SentimentResponse withSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
        return this;
    }

    /**
     * @param sentimentScore
     */

    public void setSentimentScore(SentimentScore sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * @return
     */

    public SentimentScore getSentimentScore() {
        return this.sentimentScore;
    }

    /**
     * @param sentimentScore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentResponse withSentimentScore(SentimentScore sentimentScore) {
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

        if (obj instanceof SentimentResponse == false)
            return false;
        SentimentResponse other = (SentimentResponse) obj;
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
    public SentimentResponse clone() {
        try {
            return (SentimentResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.SentimentResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
