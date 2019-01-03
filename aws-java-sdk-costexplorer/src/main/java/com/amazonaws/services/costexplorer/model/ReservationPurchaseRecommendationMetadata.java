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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about this specific recommendation, such as the time stamp for when AWS made a specific recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationPurchaseRecommendationMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPurchaseRecommendationMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The time stamp for when AWS made this recommendation.
     * </p>
     */
    private String generationTimestamp;

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The ID for this specific recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     * 
     * @return The ID for this specific recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The ID for this specific recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationMetadata withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The time stamp for when AWS made this recommendation.
     * </p>
     * 
     * @param generationTimestamp
     *        The time stamp for when AWS made this recommendation.
     */

    public void setGenerationTimestamp(String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    /**
     * <p>
     * The time stamp for when AWS made this recommendation.
     * </p>
     * 
     * @return The time stamp for when AWS made this recommendation.
     */

    public String getGenerationTimestamp() {
        return this.generationTimestamp;
    }

    /**
     * <p>
     * The time stamp for when AWS made this recommendation.
     * </p>
     * 
     * @param generationTimestamp
     *        The time stamp for when AWS made this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationMetadata withGenerationTimestamp(String generationTimestamp) {
        setGenerationTimestamp(generationTimestamp);
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
        if (getGenerationTimestamp() != null)
            sb.append("GenerationTimestamp: ").append(getGenerationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPurchaseRecommendationMetadata == false)
            return false;
        ReservationPurchaseRecommendationMetadata other = (ReservationPurchaseRecommendationMetadata) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getGenerationTimestamp() == null ^ this.getGenerationTimestamp() == null)
            return false;
        if (other.getGenerationTimestamp() != null && other.getGenerationTimestamp().equals(this.getGenerationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getGenerationTimestamp() == null) ? 0 : getGenerationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ReservationPurchaseRecommendationMetadata clone() {
        try {
            return (ReservationPurchaseRecommendationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationPurchaseRecommendationMetadataMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
