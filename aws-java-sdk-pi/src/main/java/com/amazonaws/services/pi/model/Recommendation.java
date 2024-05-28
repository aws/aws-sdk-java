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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of recommendations for the insight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The recommendation details to help resolve the performance issue. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * </p>
     */
    private String recommendationDescription;

    /**
     * <p>
     * The unique identifier for the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The unique identifier for the recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The unique identifier for the recommendation.
     * </p>
     * 
     * @return The unique identifier for the recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The unique identifier for the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The unique identifier for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The recommendation details to help resolve the performance issue. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * </p>
     * 
     * @param recommendationDescription
     *        The recommendation details to help resolve the performance issue. For example,
     *        <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     */

    public void setRecommendationDescription(String recommendationDescription) {
        this.recommendationDescription = recommendationDescription;
    }

    /**
     * <p>
     * The recommendation details to help resolve the performance issue. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * </p>
     * 
     * @return The recommendation details to help resolve the performance issue. For example,
     *         <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     */

    public String getRecommendationDescription() {
        return this.recommendationDescription;
    }

    /**
     * <p>
     * The recommendation details to help resolve the performance issue. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * </p>
     * 
     * @param recommendationDescription
     *        The recommendation details to help resolve the performance issue. For example,
     *        <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendationDescription(String recommendationDescription) {
        setRecommendationDescription(recommendationDescription);
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
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getRecommendationDescription() != null)
            sb.append("RecommendationDescription: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getRecommendationDescription() == null ^ this.getRecommendationDescription() == null)
            return false;
        if (other.getRecommendationDescription() != null && other.getRecommendationDescription().equals(this.getRecommendationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getRecommendationDescription() == null) ? 0 : getRecommendationDescription().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
