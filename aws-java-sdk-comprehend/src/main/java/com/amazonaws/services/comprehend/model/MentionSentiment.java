/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the sentiment and sentiment score for one mention of an entity.
 * </p>
 * <p>
 * For more information about targeted sentiment, see <a
 * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/MentionSentiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MentionSentiment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     */
    private String sentiment;

    private SentimentScore sentimentScore;

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * 
     * @param sentiment
     *        The sentiment of the mention.
     * @see SentimentType
     */

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * 
     * @return The sentiment of the mention.
     * @see SentimentType
     */

    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * 
     * @param sentiment
     *        The sentiment of the mention.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public MentionSentiment withSentiment(String sentiment) {
        setSentiment(sentiment);
        return this;
    }

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * 
     * @param sentiment
     *        The sentiment of the mention.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public MentionSentiment withSentiment(SentimentType sentiment) {
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

    public MentionSentiment withSentimentScore(SentimentScore sentimentScore) {
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

        if (obj instanceof MentionSentiment == false)
            return false;
        MentionSentiment other = (MentionSentiment) obj;
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
    public MentionSentiment clone() {
        try {
            return (MentionSentiment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.MentionSentimentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
