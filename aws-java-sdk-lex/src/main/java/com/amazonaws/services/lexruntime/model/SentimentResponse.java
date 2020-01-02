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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The sentiment expressed in an utterance.
 * </p>
 * <p>
 * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field structure
 * contains the result of the analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/SentimentResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SentimentResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence in.
     * </p>
     */
    private String sentimentLabel;
    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     */
    private String sentimentScore;

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence in.
     * </p>
     * 
     * @param sentimentLabel
     *        The inferred sentiment that Amazon Comprehend has the highest confidence in.
     */

    public void setSentimentLabel(String sentimentLabel) {
        this.sentimentLabel = sentimentLabel;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence in.
     * </p>
     * 
     * @return The inferred sentiment that Amazon Comprehend has the highest confidence in.
     */

    public String getSentimentLabel() {
        return this.sentimentLabel;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence in.
     * </p>
     * 
     * @param sentimentLabel
     *        The inferred sentiment that Amazon Comprehend has the highest confidence in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentResponse withSentimentLabel(String sentimentLabel) {
        setSentimentLabel(sentimentLabel);
        return this;
    }

    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     * 
     * @param sentimentScore
     *        The likelihood that the sentiment was correctly inferred.
     */

    public void setSentimentScore(String sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     * 
     * @return The likelihood that the sentiment was correctly inferred.
     */

    public String getSentimentScore() {
        return this.sentimentScore;
    }

    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     * 
     * @param sentimentScore
     *        The likelihood that the sentiment was correctly inferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentResponse withSentimentScore(String sentimentScore) {
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
        if (getSentimentLabel() != null)
            sb.append("SentimentLabel: ").append(getSentimentLabel()).append(",");
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
        if (other.getSentimentLabel() == null ^ this.getSentimentLabel() == null)
            return false;
        if (other.getSentimentLabel() != null && other.getSentimentLabel().equals(this.getSentimentLabel()) == false)
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

        hashCode = prime * hashCode + ((getSentimentLabel() == null) ? 0 : getSentimentLabel().hashCode());
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
        com.amazonaws.services.lexruntime.model.transform.SentimentResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
