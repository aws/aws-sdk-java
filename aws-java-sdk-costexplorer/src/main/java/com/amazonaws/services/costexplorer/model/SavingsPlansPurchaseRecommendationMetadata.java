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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata about your Savings Plans Purchase Recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansPurchaseRecommendationMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPurchaseRecommendationMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the recommendation set.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The timestamp showing when the recommendations were generated.
     * </p>
     */
    private String generationTimestamp;

    /**
     * <p>
     * The unique identifier for the recommendation set.
     * </p>
     * 
     * @param recommendationId
     *        The unique identifier for the recommendation set.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The unique identifier for the recommendation set.
     * </p>
     * 
     * @return The unique identifier for the recommendation set.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The unique identifier for the recommendation set.
     * </p>
     * 
     * @param recommendationId
     *        The unique identifier for the recommendation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationMetadata withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The timestamp showing when the recommendations were generated.
     * </p>
     * 
     * @param generationTimestamp
     *        The timestamp showing when the recommendations were generated.
     */

    public void setGenerationTimestamp(String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    /**
     * <p>
     * The timestamp showing when the recommendations were generated.
     * </p>
     * 
     * @return The timestamp showing when the recommendations were generated.
     */

    public String getGenerationTimestamp() {
        return this.generationTimestamp;
    }

    /**
     * <p>
     * The timestamp showing when the recommendations were generated.
     * </p>
     * 
     * @param generationTimestamp
     *        The timestamp showing when the recommendations were generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationMetadata withGenerationTimestamp(String generationTimestamp) {
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

        if (obj instanceof SavingsPlansPurchaseRecommendationMetadata == false)
            return false;
        SavingsPlansPurchaseRecommendationMetadata other = (SavingsPlansPurchaseRecommendationMetadata) obj;
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
    public SavingsPlansPurchaseRecommendationMetadata clone() {
        try {
            return (SavingsPlansPurchaseRecommendationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansPurchaseRecommendationMetadataMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
