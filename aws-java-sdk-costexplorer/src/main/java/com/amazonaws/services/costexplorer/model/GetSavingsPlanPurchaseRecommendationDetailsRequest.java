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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlanPurchaseRecommendationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlanPurchaseRecommendationDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that is associated with the Savings Plan recommendation.
     * </p>
     */
    private String recommendationDetailId;

    /**
     * <p>
     * The ID that is associated with the Savings Plan recommendation.
     * </p>
     * 
     * @param recommendationDetailId
     *        The ID that is associated with the Savings Plan recommendation.
     */

    public void setRecommendationDetailId(String recommendationDetailId) {
        this.recommendationDetailId = recommendationDetailId;
    }

    /**
     * <p>
     * The ID that is associated with the Savings Plan recommendation.
     * </p>
     * 
     * @return The ID that is associated with the Savings Plan recommendation.
     */

    public String getRecommendationDetailId() {
        return this.recommendationDetailId;
    }

    /**
     * <p>
     * The ID that is associated with the Savings Plan recommendation.
     * </p>
     * 
     * @param recommendationDetailId
     *        The ID that is associated with the Savings Plan recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlanPurchaseRecommendationDetailsRequest withRecommendationDetailId(String recommendationDetailId) {
        setRecommendationDetailId(recommendationDetailId);
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
        if (getRecommendationDetailId() != null)
            sb.append("RecommendationDetailId: ").append(getRecommendationDetailId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlanPurchaseRecommendationDetailsRequest == false)
            return false;
        GetSavingsPlanPurchaseRecommendationDetailsRequest other = (GetSavingsPlanPurchaseRecommendationDetailsRequest) obj;
        if (other.getRecommendationDetailId() == null ^ this.getRecommendationDetailId() == null)
            return false;
        if (other.getRecommendationDetailId() != null && other.getRecommendationDetailId().equals(this.getRecommendationDetailId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationDetailId() == null) ? 0 : getRecommendationDetailId().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlanPurchaseRecommendationDetailsRequest clone() {
        return (GetSavingsPlanPurchaseRecommendationDetailsRequest) super.clone();
    }

}
