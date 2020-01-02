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
 * Metadata for this recommendation set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RightsizingRecommendationMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RightsizingRecommendationMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The time stamp for when Amazon Web Services made this recommendation.
     * </p>
     */
    private String generationTimestamp;
    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     */
    private String lookbackPeriodInDays;

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

    public RightsizingRecommendationMetadata withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The time stamp for when Amazon Web Services made this recommendation.
     * </p>
     * 
     * @param generationTimestamp
     *        The time stamp for when Amazon Web Services made this recommendation.
     */

    public void setGenerationTimestamp(String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    /**
     * <p>
     * The time stamp for when Amazon Web Services made this recommendation.
     * </p>
     * 
     * @return The time stamp for when Amazon Web Services made this recommendation.
     */

    public String getGenerationTimestamp() {
        return this.generationTimestamp;
    }

    /**
     * <p>
     * The time stamp for when Amazon Web Services made this recommendation.
     * </p>
     * 
     * @param generationTimestamp
     *        The time stamp for when Amazon Web Services made this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendationMetadata withGenerationTimestamp(String generationTimestamp) {
        setGenerationTimestamp(generationTimestamp);
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @see LookbackPeriodInDays
     */

    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @return How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @see LookbackPeriodInDays
     */

    public String getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public RightsizingRecommendationMetadata withLookbackPeriodInDays(String lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public RightsizingRecommendationMetadata withLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
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
            sb.append("GenerationTimestamp: ").append(getGenerationTimestamp()).append(",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendationMetadata == false)
            return false;
        RightsizingRecommendationMetadata other = (RightsizingRecommendationMetadata) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getGenerationTimestamp() == null ^ this.getGenerationTimestamp() == null)
            return false;
        if (other.getGenerationTimestamp() != null && other.getGenerationTimestamp().equals(this.getGenerationTimestamp()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getGenerationTimestamp() == null) ? 0 : getGenerationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public RightsizingRecommendationMetadata clone() {
        try {
            return (RightsizingRecommendationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RightsizingRecommendationMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
