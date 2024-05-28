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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateRecommendationLifecycle"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecommendationLifecycleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new lifecycle stage
     * </p>
     */
    private String lifecycleStage;
    /**
     * <p>
     * The Recommendation identifier for AWS Trusted Advisor Priority recommendations
     * </p>
     */
    private String recommendationIdentifier;
    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     */
    private String updateReason;
    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     */
    private String updateReasonCode;

    /**
     * <p>
     * The new lifecycle stage
     * </p>
     * 
     * @param lifecycleStage
     *        The new lifecycle stage
     * @see UpdateRecommendationLifecycleStage
     */

    public void setLifecycleStage(String lifecycleStage) {
        this.lifecycleStage = lifecycleStage;
    }

    /**
     * <p>
     * The new lifecycle stage
     * </p>
     * 
     * @return The new lifecycle stage
     * @see UpdateRecommendationLifecycleStage
     */

    public String getLifecycleStage() {
        return this.lifecycleStage;
    }

    /**
     * <p>
     * The new lifecycle stage
     * </p>
     * 
     * @param lifecycleStage
     *        The new lifecycle stage
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRecommendationLifecycleStage
     */

    public UpdateRecommendationLifecycleRequest withLifecycleStage(String lifecycleStage) {
        setLifecycleStage(lifecycleStage);
        return this;
    }

    /**
     * <p>
     * The new lifecycle stage
     * </p>
     * 
     * @param lifecycleStage
     *        The new lifecycle stage
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRecommendationLifecycleStage
     */

    public UpdateRecommendationLifecycleRequest withLifecycleStage(UpdateRecommendationLifecycleStage lifecycleStage) {
        this.lifecycleStage = lifecycleStage.toString();
        return this;
    }

    /**
     * <p>
     * The Recommendation identifier for AWS Trusted Advisor Priority recommendations
     * </p>
     * 
     * @param recommendationIdentifier
     *        The Recommendation identifier for AWS Trusted Advisor Priority recommendations
     */

    public void setRecommendationIdentifier(String recommendationIdentifier) {
        this.recommendationIdentifier = recommendationIdentifier;
    }

    /**
     * <p>
     * The Recommendation identifier for AWS Trusted Advisor Priority recommendations
     * </p>
     * 
     * @return The Recommendation identifier for AWS Trusted Advisor Priority recommendations
     */

    public String getRecommendationIdentifier() {
        return this.recommendationIdentifier;
    }

    /**
     * <p>
     * The Recommendation identifier for AWS Trusted Advisor Priority recommendations
     * </p>
     * 
     * @param recommendationIdentifier
     *        The Recommendation identifier for AWS Trusted Advisor Priority recommendations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationLifecycleRequest withRecommendationIdentifier(String recommendationIdentifier) {
        setRecommendationIdentifier(recommendationIdentifier);
        return this;
    }

    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     * 
     * @param updateReason
     *        Reason for the lifecycle stage change
     */

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     * 
     * @return Reason for the lifecycle stage change
     */

    public String getUpdateReason() {
        return this.updateReason;
    }

    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     * 
     * @param updateReason
     *        Reason for the lifecycle stage change
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationLifecycleRequest withUpdateReason(String updateReason) {
        setUpdateReason(updateReason);
        return this;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @param updateReasonCode
     *        Reason code for the lifecycle state change
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public void setUpdateReasonCode(String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @return Reason code for the lifecycle state change
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public String getUpdateReasonCode() {
        return this.updateReasonCode;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @param updateReasonCode
     *        Reason code for the lifecycle state change
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public UpdateRecommendationLifecycleRequest withUpdateReasonCode(String updateReasonCode) {
        setUpdateReasonCode(updateReasonCode);
        return this;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @param updateReasonCode
     *        Reason code for the lifecycle state change
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public UpdateRecommendationLifecycleRequest withUpdateReasonCode(UpdateRecommendationLifecycleStageReasonCode updateReasonCode) {
        this.updateReasonCode = updateReasonCode.toString();
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
        if (getLifecycleStage() != null)
            sb.append("LifecycleStage: ").append(getLifecycleStage()).append(",");
        if (getRecommendationIdentifier() != null)
            sb.append("RecommendationIdentifier: ").append(getRecommendationIdentifier()).append(",");
        if (getUpdateReason() != null)
            sb.append("UpdateReason: ").append("***Sensitive Data Redacted***").append(",");
        if (getUpdateReasonCode() != null)
            sb.append("UpdateReasonCode: ").append(getUpdateReasonCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecommendationLifecycleRequest == false)
            return false;
        UpdateRecommendationLifecycleRequest other = (UpdateRecommendationLifecycleRequest) obj;
        if (other.getLifecycleStage() == null ^ this.getLifecycleStage() == null)
            return false;
        if (other.getLifecycleStage() != null && other.getLifecycleStage().equals(this.getLifecycleStage()) == false)
            return false;
        if (other.getRecommendationIdentifier() == null ^ this.getRecommendationIdentifier() == null)
            return false;
        if (other.getRecommendationIdentifier() != null && other.getRecommendationIdentifier().equals(this.getRecommendationIdentifier()) == false)
            return false;
        if (other.getUpdateReason() == null ^ this.getUpdateReason() == null)
            return false;
        if (other.getUpdateReason() != null && other.getUpdateReason().equals(this.getUpdateReason()) == false)
            return false;
        if (other.getUpdateReasonCode() == null ^ this.getUpdateReasonCode() == null)
            return false;
        if (other.getUpdateReasonCode() != null && other.getUpdateReasonCode().equals(this.getUpdateReasonCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleStage() == null) ? 0 : getLifecycleStage().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIdentifier() == null) ? 0 : getRecommendationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUpdateReason() == null) ? 0 : getUpdateReason().hashCode());
        hashCode = prime * hashCode + ((getUpdateReasonCode() == null) ? 0 : getUpdateReasonCode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRecommendationLifecycleRequest clone() {
        return (UpdateRecommendationLifecycleRequest) super.clone();
    }

}
