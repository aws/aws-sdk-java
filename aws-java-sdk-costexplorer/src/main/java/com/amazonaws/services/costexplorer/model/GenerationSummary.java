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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the Savings Plans recommendation generation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GenerationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the ID for this specific recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * Indicates whether the recommendation generation succeeded, is processing, or failed.
     * </p>
     */
    private String generationStatus;
    /**
     * <p>
     * Indicates the start time of the recommendation generation.
     * </p>
     */
    private String generationStartedTime;
    /**
     * <p>
     * Indicates the completion time of the recommendation generation.
     * </p>
     */
    private String generationCompletionTime;
    /**
     * <p>
     * Indicates the estimated time for when the recommendation generation will complete.
     * </p>
     */
    private String estimatedCompletionTime;

    /**
     * <p>
     * Indicates the ID for this specific recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Indicates the ID for this specific recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * Indicates the ID for this specific recommendation.
     * </p>
     * 
     * @return Indicates the ID for this specific recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * Indicates the ID for this specific recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Indicates the ID for this specific recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationSummary withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the recommendation generation succeeded, is processing, or failed.
     * </p>
     * 
     * @param generationStatus
     *        Indicates whether the recommendation generation succeeded, is processing, or failed.
     * @see GenerationStatus
     */

    public void setGenerationStatus(String generationStatus) {
        this.generationStatus = generationStatus;
    }

    /**
     * <p>
     * Indicates whether the recommendation generation succeeded, is processing, or failed.
     * </p>
     * 
     * @return Indicates whether the recommendation generation succeeded, is processing, or failed.
     * @see GenerationStatus
     */

    public String getGenerationStatus() {
        return this.generationStatus;
    }

    /**
     * <p>
     * Indicates whether the recommendation generation succeeded, is processing, or failed.
     * </p>
     * 
     * @param generationStatus
     *        Indicates whether the recommendation generation succeeded, is processing, or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public GenerationSummary withGenerationStatus(String generationStatus) {
        setGenerationStatus(generationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the recommendation generation succeeded, is processing, or failed.
     * </p>
     * 
     * @param generationStatus
     *        Indicates whether the recommendation generation succeeded, is processing, or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public GenerationSummary withGenerationStatus(GenerationStatus generationStatus) {
        this.generationStatus = generationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the start time of the recommendation generation.
     * </p>
     * 
     * @param generationStartedTime
     *        Indicates the start time of the recommendation generation.
     */

    public void setGenerationStartedTime(String generationStartedTime) {
        this.generationStartedTime = generationStartedTime;
    }

    /**
     * <p>
     * Indicates the start time of the recommendation generation.
     * </p>
     * 
     * @return Indicates the start time of the recommendation generation.
     */

    public String getGenerationStartedTime() {
        return this.generationStartedTime;
    }

    /**
     * <p>
     * Indicates the start time of the recommendation generation.
     * </p>
     * 
     * @param generationStartedTime
     *        Indicates the start time of the recommendation generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationSummary withGenerationStartedTime(String generationStartedTime) {
        setGenerationStartedTime(generationStartedTime);
        return this;
    }

    /**
     * <p>
     * Indicates the completion time of the recommendation generation.
     * </p>
     * 
     * @param generationCompletionTime
     *        Indicates the completion time of the recommendation generation.
     */

    public void setGenerationCompletionTime(String generationCompletionTime) {
        this.generationCompletionTime = generationCompletionTime;
    }

    /**
     * <p>
     * Indicates the completion time of the recommendation generation.
     * </p>
     * 
     * @return Indicates the completion time of the recommendation generation.
     */

    public String getGenerationCompletionTime() {
        return this.generationCompletionTime;
    }

    /**
     * <p>
     * Indicates the completion time of the recommendation generation.
     * </p>
     * 
     * @param generationCompletionTime
     *        Indicates the completion time of the recommendation generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationSummary withGenerationCompletionTime(String generationCompletionTime) {
        setGenerationCompletionTime(generationCompletionTime);
        return this;
    }

    /**
     * <p>
     * Indicates the estimated time for when the recommendation generation will complete.
     * </p>
     * 
     * @param estimatedCompletionTime
     *        Indicates the estimated time for when the recommendation generation will complete.
     */

    public void setEstimatedCompletionTime(String estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime;
    }

    /**
     * <p>
     * Indicates the estimated time for when the recommendation generation will complete.
     * </p>
     * 
     * @return Indicates the estimated time for when the recommendation generation will complete.
     */

    public String getEstimatedCompletionTime() {
        return this.estimatedCompletionTime;
    }

    /**
     * <p>
     * Indicates the estimated time for when the recommendation generation will complete.
     * </p>
     * 
     * @param estimatedCompletionTime
     *        Indicates the estimated time for when the recommendation generation will complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationSummary withEstimatedCompletionTime(String estimatedCompletionTime) {
        setEstimatedCompletionTime(estimatedCompletionTime);
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
        if (getGenerationStatus() != null)
            sb.append("GenerationStatus: ").append(getGenerationStatus()).append(",");
        if (getGenerationStartedTime() != null)
            sb.append("GenerationStartedTime: ").append(getGenerationStartedTime()).append(",");
        if (getGenerationCompletionTime() != null)
            sb.append("GenerationCompletionTime: ").append(getGenerationCompletionTime()).append(",");
        if (getEstimatedCompletionTime() != null)
            sb.append("EstimatedCompletionTime: ").append(getEstimatedCompletionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerationSummary == false)
            return false;
        GenerationSummary other = (GenerationSummary) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getGenerationStatus() == null ^ this.getGenerationStatus() == null)
            return false;
        if (other.getGenerationStatus() != null && other.getGenerationStatus().equals(this.getGenerationStatus()) == false)
            return false;
        if (other.getGenerationStartedTime() == null ^ this.getGenerationStartedTime() == null)
            return false;
        if (other.getGenerationStartedTime() != null && other.getGenerationStartedTime().equals(this.getGenerationStartedTime()) == false)
            return false;
        if (other.getGenerationCompletionTime() == null ^ this.getGenerationCompletionTime() == null)
            return false;
        if (other.getGenerationCompletionTime() != null && other.getGenerationCompletionTime().equals(this.getGenerationCompletionTime()) == false)
            return false;
        if (other.getEstimatedCompletionTime() == null ^ this.getEstimatedCompletionTime() == null)
            return false;
        if (other.getEstimatedCompletionTime() != null && other.getEstimatedCompletionTime().equals(this.getEstimatedCompletionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getGenerationStatus() == null) ? 0 : getGenerationStatus().hashCode());
        hashCode = prime * hashCode + ((getGenerationStartedTime() == null) ? 0 : getGenerationStartedTime().hashCode());
        hashCode = prime * hashCode + ((getGenerationCompletionTime() == null) ? 0 : getGenerationCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getEstimatedCompletionTime() == null) ? 0 : getEstimatedCompletionTime().hashCode());
        return hashCode;
    }

    @Override
    public GenerationSummary clone() {
        try {
            return (GenerationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.GenerationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
