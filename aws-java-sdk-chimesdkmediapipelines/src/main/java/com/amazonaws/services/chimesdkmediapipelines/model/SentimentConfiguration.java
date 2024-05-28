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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration settings for a sentiment analysis task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/SentimentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SentimentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule in the sentiment configuration.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * </p>
     */
    private String sentimentType;
    /**
     * <p>
     * Specifies the analysis interval.
     * </p>
     */
    private Integer timePeriod;

    /**
     * <p>
     * The name of the rule in the sentiment configuration.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule in the sentiment configuration.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule in the sentiment configuration.
     * </p>
     * 
     * @return The name of the rule in the sentiment configuration.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule in the sentiment configuration.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule in the sentiment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentConfiguration withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * </p>
     * 
     * @param sentimentType
     *        The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * @see SentimentType
     */

    public void setSentimentType(String sentimentType) {
        this.sentimentType = sentimentType;
    }

    /**
     * <p>
     * The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * </p>
     * 
     * @return The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * @see SentimentType
     */

    public String getSentimentType() {
        return this.sentimentType;
    }

    /**
     * <p>
     * The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * </p>
     * 
     * @param sentimentType
     *        The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public SentimentConfiguration withSentimentType(String sentimentType) {
        setSentimentType(sentimentType);
        return this;
    }

    /**
     * <p>
     * The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * </p>
     * 
     * @param sentimentType
     *        The type of sentiment, <code>POSITIVE</code>, <code>NEGATIVE</code>, or <code>NEUTRAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentType
     */

    public SentimentConfiguration withSentimentType(SentimentType sentimentType) {
        this.sentimentType = sentimentType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the analysis interval.
     * </p>
     * 
     * @param timePeriod
     *        Specifies the analysis interval.
     */

    public void setTimePeriod(Integer timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * Specifies the analysis interval.
     * </p>
     * 
     * @return Specifies the analysis interval.
     */

    public Integer getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * Specifies the analysis interval.
     * </p>
     * 
     * @param timePeriod
     *        Specifies the analysis interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentConfiguration withTimePeriod(Integer timePeriod) {
        setTimePeriod(timePeriod);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getSentimentType() != null)
            sb.append("SentimentType: ").append(getSentimentType()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SentimentConfiguration == false)
            return false;
        SentimentConfiguration other = (SentimentConfiguration) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getSentimentType() == null ^ this.getSentimentType() == null)
            return false;
        if (other.getSentimentType() != null && other.getSentimentType().equals(this.getSentimentType()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getSentimentType() == null) ? 0 : getSentimentType().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        return hashCode;
    }

    @Override
    public SentimentConfiguration clone() {
        try {
            return (SentimentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.SentimentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
