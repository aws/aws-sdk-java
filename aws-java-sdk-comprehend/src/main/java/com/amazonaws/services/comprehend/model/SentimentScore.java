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
 * Describes the level of confidence that Amazon Comprehend has in the accuracy of its detection of sentiments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/SentimentScore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SentimentScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>POSITIVE</code>
     * sentiment.
     * </p>
     */
    private Float positive;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEGATIVE</code>
     * sentiment.
     * </p>
     */
    private Float negative;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEUTRAL</code>
     * sentiment.
     * </p>
     */
    private Float neutral;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>MIXED</code>
     * sentiment.
     * </p>
     */
    private Float mixed;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>POSITIVE</code>
     * sentiment.
     * </p>
     * 
     * @param positive
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>POSITIVE</code> sentiment.
     */

    public void setPositive(Float positive) {
        this.positive = positive;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>POSITIVE</code>
     * sentiment.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *         <code>POSITIVE</code> sentiment.
     */

    public Float getPositive() {
        return this.positive;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>POSITIVE</code>
     * sentiment.
     * </p>
     * 
     * @param positive
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>POSITIVE</code> sentiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentScore withPositive(Float positive) {
        setPositive(positive);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEGATIVE</code>
     * sentiment.
     * </p>
     * 
     * @param negative
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>NEGATIVE</code> sentiment.
     */

    public void setNegative(Float negative) {
        this.negative = negative;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEGATIVE</code>
     * sentiment.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *         <code>NEGATIVE</code> sentiment.
     */

    public Float getNegative() {
        return this.negative;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEGATIVE</code>
     * sentiment.
     * </p>
     * 
     * @param negative
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>NEGATIVE</code> sentiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentScore withNegative(Float negative) {
        setNegative(negative);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEUTRAL</code>
     * sentiment.
     * </p>
     * 
     * @param neutral
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>NEUTRAL</code> sentiment.
     */

    public void setNeutral(Float neutral) {
        this.neutral = neutral;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEUTRAL</code>
     * sentiment.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *         <code>NEUTRAL</code> sentiment.
     */

    public Float getNeutral() {
        return this.neutral;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>NEUTRAL</code>
     * sentiment.
     * </p>
     * 
     * @param neutral
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>NEUTRAL</code> sentiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentScore withNeutral(Float neutral) {
        setNeutral(neutral);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>MIXED</code>
     * sentiment.
     * </p>
     * 
     * @param mixed
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>MIXED</code> sentiment.
     */

    public void setMixed(Float mixed) {
        this.mixed = mixed;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>MIXED</code>
     * sentiment.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *         <code>MIXED</code> sentiment.
     */

    public Float getMixed() {
        return this.mixed;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the <code>MIXED</code>
     * sentiment.
     * </p>
     * 
     * @param mixed
     *        The level of confidence that Amazon Comprehend has in the accuracy of its detection of the
     *        <code>MIXED</code> sentiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentScore withMixed(Float mixed) {
        setMixed(mixed);
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
        if (getPositive() != null)
            sb.append("Positive: ").append(getPositive()).append(",");
        if (getNegative() != null)
            sb.append("Negative: ").append(getNegative()).append(",");
        if (getNeutral() != null)
            sb.append("Neutral: ").append(getNeutral()).append(",");
        if (getMixed() != null)
            sb.append("Mixed: ").append(getMixed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SentimentScore == false)
            return false;
        SentimentScore other = (SentimentScore) obj;
        if (other.getPositive() == null ^ this.getPositive() == null)
            return false;
        if (other.getPositive() != null && other.getPositive().equals(this.getPositive()) == false)
            return false;
        if (other.getNegative() == null ^ this.getNegative() == null)
            return false;
        if (other.getNegative() != null && other.getNegative().equals(this.getNegative()) == false)
            return false;
        if (other.getNeutral() == null ^ this.getNeutral() == null)
            return false;
        if (other.getNeutral() != null && other.getNeutral().equals(this.getNeutral()) == false)
            return false;
        if (other.getMixed() == null ^ this.getMixed() == null)
            return false;
        if (other.getMixed() != null && other.getMixed().equals(this.getMixed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPositive() == null) ? 0 : getPositive().hashCode());
        hashCode = prime * hashCode + ((getNegative() == null) ? 0 : getNegative().hashCode());
        hashCode = prime * hashCode + ((getNeutral() == null) ? 0 : getNeutral().hashCode());
        hashCode = prime * hashCode + ((getMixed() == null) ? 0 : getMixed().hashCode());
        return hashCode;
    }

    @Override
    public SentimentScore clone() {
        try {
            return (SentimentScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.SentimentScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
