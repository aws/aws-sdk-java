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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains a summary of a recommended intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/RecommendedIntentSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendedIntentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a recommended intent associated with the bot recommendation.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * The name of a recommended intent associated with the bot recommendation.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The count of sample utterances of a recommended intent that is associated with a bot recommendation.
     * </p>
     */
    private Integer sampleUtterancesCount;

    /**
     * <p>
     * The unique identifier of a recommended intent associated with the bot recommendation.
     * </p>
     * 
     * @param intentId
     *        The unique identifier of a recommended intent associated with the bot recommendation.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The unique identifier of a recommended intent associated with the bot recommendation.
     * </p>
     * 
     * @return The unique identifier of a recommended intent associated with the bot recommendation.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The unique identifier of a recommended intent associated with the bot recommendation.
     * </p>
     * 
     * @param intentId
     *        The unique identifier of a recommended intent associated with the bot recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedIntentSummary withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * The name of a recommended intent associated with the bot recommendation.
     * </p>
     * 
     * @param intentName
     *        The name of a recommended intent associated with the bot recommendation.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of a recommended intent associated with the bot recommendation.
     * </p>
     * 
     * @return The name of a recommended intent associated with the bot recommendation.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of a recommended intent associated with the bot recommendation.
     * </p>
     * 
     * @param intentName
     *        The name of a recommended intent associated with the bot recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedIntentSummary withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The count of sample utterances of a recommended intent that is associated with a bot recommendation.
     * </p>
     * 
     * @param sampleUtterancesCount
     *        The count of sample utterances of a recommended intent that is associated with a bot recommendation.
     */

    public void setSampleUtterancesCount(Integer sampleUtterancesCount) {
        this.sampleUtterancesCount = sampleUtterancesCount;
    }

    /**
     * <p>
     * The count of sample utterances of a recommended intent that is associated with a bot recommendation.
     * </p>
     * 
     * @return The count of sample utterances of a recommended intent that is associated with a bot recommendation.
     */

    public Integer getSampleUtterancesCount() {
        return this.sampleUtterancesCount;
    }

    /**
     * <p>
     * The count of sample utterances of a recommended intent that is associated with a bot recommendation.
     * </p>
     * 
     * @param sampleUtterancesCount
     *        The count of sample utterances of a recommended intent that is associated with a bot recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedIntentSummary withSampleUtterancesCount(Integer sampleUtterancesCount) {
        setSampleUtterancesCount(sampleUtterancesCount);
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
        if (getIntentId() != null)
            sb.append("IntentId: ").append(getIntentId()).append(",");
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getSampleUtterancesCount() != null)
            sb.append("SampleUtterancesCount: ").append(getSampleUtterancesCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendedIntentSummary == false)
            return false;
        RecommendedIntentSummary other = (RecommendedIntentSummary) obj;
        if (other.getIntentId() == null ^ this.getIntentId() == null)
            return false;
        if (other.getIntentId() != null && other.getIntentId().equals(this.getIntentId()) == false)
            return false;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getSampleUtterancesCount() == null ^ this.getSampleUtterancesCount() == null)
            return false;
        if (other.getSampleUtterancesCount() != null && other.getSampleUtterancesCount().equals(this.getSampleUtterancesCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentId() == null) ? 0 : getIntentId().hashCode());
        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterancesCount() == null) ? 0 : getSampleUtterancesCount().hashCode());
        return hashCode;
    }

    @Override
    public RecommendedIntentSummary clone() {
        try {
            return (RecommendedIntentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.RecommendedIntentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
