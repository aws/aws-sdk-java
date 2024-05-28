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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the source content ranking data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/RankingData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RankingData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The relevance score of the content.
     * </p>
     */
    private String relevanceLevel;
    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     */
    private Double relevanceScore;

    /**
     * <p>
     * The relevance score of the content.
     * </p>
     * 
     * @param relevanceLevel
     *        The relevance score of the content.
     * @see RelevanceLevel
     */

    public void setRelevanceLevel(String relevanceLevel) {
        this.relevanceLevel = relevanceLevel;
    }

    /**
     * <p>
     * The relevance score of the content.
     * </p>
     * 
     * @return The relevance score of the content.
     * @see RelevanceLevel
     */

    public String getRelevanceLevel() {
        return this.relevanceLevel;
    }

    /**
     * <p>
     * The relevance score of the content.
     * </p>
     * 
     * @param relevanceLevel
     *        The relevance score of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelevanceLevel
     */

    public RankingData withRelevanceLevel(String relevanceLevel) {
        setRelevanceLevel(relevanceLevel);
        return this;
    }

    /**
     * <p>
     * The relevance score of the content.
     * </p>
     * 
     * @param relevanceLevel
     *        The relevance score of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelevanceLevel
     */

    public RankingData withRelevanceLevel(RelevanceLevel relevanceLevel) {
        this.relevanceLevel = relevanceLevel.toString();
        return this;
    }

    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     * 
     * @param relevanceScore
     *        The relevance level of the recommendation.
     */

    public void setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     * 
     * @return The relevance level of the recommendation.
     */

    public Double getRelevanceScore() {
        return this.relevanceScore;
    }

    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     * 
     * @param relevanceScore
     *        The relevance level of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RankingData withRelevanceScore(Double relevanceScore) {
        setRelevanceScore(relevanceScore);
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
        if (getRelevanceLevel() != null)
            sb.append("RelevanceLevel: ").append(getRelevanceLevel()).append(",");
        if (getRelevanceScore() != null)
            sb.append("RelevanceScore: ").append(getRelevanceScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RankingData == false)
            return false;
        RankingData other = (RankingData) obj;
        if (other.getRelevanceLevel() == null ^ this.getRelevanceLevel() == null)
            return false;
        if (other.getRelevanceLevel() != null && other.getRelevanceLevel().equals(this.getRelevanceLevel()) == false)
            return false;
        if (other.getRelevanceScore() == null ^ this.getRelevanceScore() == null)
            return false;
        if (other.getRelevanceScore() != null && other.getRelevanceScore().equals(this.getRelevanceScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelevanceLevel() == null) ? 0 : getRelevanceLevel().hashCode());
        hashCode = prime * hashCode + ((getRelevanceScore() == null) ? 0 : getRelevanceScore().hashCode());
        return hashCode;
    }

    @Override
    public RankingData clone() {
        try {
            return (RankingData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.RankingDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
