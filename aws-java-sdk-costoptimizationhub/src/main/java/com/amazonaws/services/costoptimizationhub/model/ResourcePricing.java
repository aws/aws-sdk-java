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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains pricing information about the specified resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ResourcePricing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePricing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The savings estimate incorporating all discounts with Amazon Web Services, such as Reserved Instances and Savings
     * Plans.
     * </p>
     */
    private Double estimatedCostAfterDiscounts;
    /**
     * <p>
     * The savings estimate using Amazon Web Services public pricing without incorporating any discounts.
     * </p>
     */
    private Double estimatedCostBeforeDiscounts;
    /**
     * <p>
     * The estimated discounts for a recommendation.
     * </p>
     */
    private EstimatedDiscounts estimatedDiscounts;
    /**
     * <p>
     * The estimated net unused amortized commitment for the recommendation.
     * </p>
     */
    private Double estimatedNetUnusedAmortizedCommitments;

    /**
     * <p>
     * The savings estimate incorporating all discounts with Amazon Web Services, such as Reserved Instances and Savings
     * Plans.
     * </p>
     * 
     * @param estimatedCostAfterDiscounts
     *        The savings estimate incorporating all discounts with Amazon Web Services, such as Reserved Instances and
     *        Savings Plans.
     */

    public void setEstimatedCostAfterDiscounts(Double estimatedCostAfterDiscounts) {
        this.estimatedCostAfterDiscounts = estimatedCostAfterDiscounts;
    }

    /**
     * <p>
     * The savings estimate incorporating all discounts with Amazon Web Services, such as Reserved Instances and Savings
     * Plans.
     * </p>
     * 
     * @return The savings estimate incorporating all discounts with Amazon Web Services, such as Reserved Instances and
     *         Savings Plans.
     */

    public Double getEstimatedCostAfterDiscounts() {
        return this.estimatedCostAfterDiscounts;
    }

    /**
     * <p>
     * The savings estimate incorporating all discounts with Amazon Web Services, such as Reserved Instances and Savings
     * Plans.
     * </p>
     * 
     * @param estimatedCostAfterDiscounts
     *        The savings estimate incorporating all discounts with Amazon Web Services, such as Reserved Instances and
     *        Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePricing withEstimatedCostAfterDiscounts(Double estimatedCostAfterDiscounts) {
        setEstimatedCostAfterDiscounts(estimatedCostAfterDiscounts);
        return this;
    }

    /**
     * <p>
     * The savings estimate using Amazon Web Services public pricing without incorporating any discounts.
     * </p>
     * 
     * @param estimatedCostBeforeDiscounts
     *        The savings estimate using Amazon Web Services public pricing without incorporating any discounts.
     */

    public void setEstimatedCostBeforeDiscounts(Double estimatedCostBeforeDiscounts) {
        this.estimatedCostBeforeDiscounts = estimatedCostBeforeDiscounts;
    }

    /**
     * <p>
     * The savings estimate using Amazon Web Services public pricing without incorporating any discounts.
     * </p>
     * 
     * @return The savings estimate using Amazon Web Services public pricing without incorporating any discounts.
     */

    public Double getEstimatedCostBeforeDiscounts() {
        return this.estimatedCostBeforeDiscounts;
    }

    /**
     * <p>
     * The savings estimate using Amazon Web Services public pricing without incorporating any discounts.
     * </p>
     * 
     * @param estimatedCostBeforeDiscounts
     *        The savings estimate using Amazon Web Services public pricing without incorporating any discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePricing withEstimatedCostBeforeDiscounts(Double estimatedCostBeforeDiscounts) {
        setEstimatedCostBeforeDiscounts(estimatedCostBeforeDiscounts);
        return this;
    }

    /**
     * <p>
     * The estimated discounts for a recommendation.
     * </p>
     * 
     * @param estimatedDiscounts
     *        The estimated discounts for a recommendation.
     */

    public void setEstimatedDiscounts(EstimatedDiscounts estimatedDiscounts) {
        this.estimatedDiscounts = estimatedDiscounts;
    }

    /**
     * <p>
     * The estimated discounts for a recommendation.
     * </p>
     * 
     * @return The estimated discounts for a recommendation.
     */

    public EstimatedDiscounts getEstimatedDiscounts() {
        return this.estimatedDiscounts;
    }

    /**
     * <p>
     * The estimated discounts for a recommendation.
     * </p>
     * 
     * @param estimatedDiscounts
     *        The estimated discounts for a recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePricing withEstimatedDiscounts(EstimatedDiscounts estimatedDiscounts) {
        setEstimatedDiscounts(estimatedDiscounts);
        return this;
    }

    /**
     * <p>
     * The estimated net unused amortized commitment for the recommendation.
     * </p>
     * 
     * @param estimatedNetUnusedAmortizedCommitments
     *        The estimated net unused amortized commitment for the recommendation.
     */

    public void setEstimatedNetUnusedAmortizedCommitments(Double estimatedNetUnusedAmortizedCommitments) {
        this.estimatedNetUnusedAmortizedCommitments = estimatedNetUnusedAmortizedCommitments;
    }

    /**
     * <p>
     * The estimated net unused amortized commitment for the recommendation.
     * </p>
     * 
     * @return The estimated net unused amortized commitment for the recommendation.
     */

    public Double getEstimatedNetUnusedAmortizedCommitments() {
        return this.estimatedNetUnusedAmortizedCommitments;
    }

    /**
     * <p>
     * The estimated net unused amortized commitment for the recommendation.
     * </p>
     * 
     * @param estimatedNetUnusedAmortizedCommitments
     *        The estimated net unused amortized commitment for the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePricing withEstimatedNetUnusedAmortizedCommitments(Double estimatedNetUnusedAmortizedCommitments) {
        setEstimatedNetUnusedAmortizedCommitments(estimatedNetUnusedAmortizedCommitments);
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
        if (getEstimatedCostAfterDiscounts() != null)
            sb.append("EstimatedCostAfterDiscounts: ").append(getEstimatedCostAfterDiscounts()).append(",");
        if (getEstimatedCostBeforeDiscounts() != null)
            sb.append("EstimatedCostBeforeDiscounts: ").append(getEstimatedCostBeforeDiscounts()).append(",");
        if (getEstimatedDiscounts() != null)
            sb.append("EstimatedDiscounts: ").append(getEstimatedDiscounts()).append(",");
        if (getEstimatedNetUnusedAmortizedCommitments() != null)
            sb.append("EstimatedNetUnusedAmortizedCommitments: ").append(getEstimatedNetUnusedAmortizedCommitments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePricing == false)
            return false;
        ResourcePricing other = (ResourcePricing) obj;
        if (other.getEstimatedCostAfterDiscounts() == null ^ this.getEstimatedCostAfterDiscounts() == null)
            return false;
        if (other.getEstimatedCostAfterDiscounts() != null && other.getEstimatedCostAfterDiscounts().equals(this.getEstimatedCostAfterDiscounts()) == false)
            return false;
        if (other.getEstimatedCostBeforeDiscounts() == null ^ this.getEstimatedCostBeforeDiscounts() == null)
            return false;
        if (other.getEstimatedCostBeforeDiscounts() != null && other.getEstimatedCostBeforeDiscounts().equals(this.getEstimatedCostBeforeDiscounts()) == false)
            return false;
        if (other.getEstimatedDiscounts() == null ^ this.getEstimatedDiscounts() == null)
            return false;
        if (other.getEstimatedDiscounts() != null && other.getEstimatedDiscounts().equals(this.getEstimatedDiscounts()) == false)
            return false;
        if (other.getEstimatedNetUnusedAmortizedCommitments() == null ^ this.getEstimatedNetUnusedAmortizedCommitments() == null)
            return false;
        if (other.getEstimatedNetUnusedAmortizedCommitments() != null
                && other.getEstimatedNetUnusedAmortizedCommitments().equals(this.getEstimatedNetUnusedAmortizedCommitments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedCostAfterDiscounts() == null) ? 0 : getEstimatedCostAfterDiscounts().hashCode());
        hashCode = prime * hashCode + ((getEstimatedCostBeforeDiscounts() == null) ? 0 : getEstimatedCostBeforeDiscounts().hashCode());
        hashCode = prime * hashCode + ((getEstimatedDiscounts() == null) ? 0 : getEstimatedDiscounts().hashCode());
        hashCode = prime * hashCode + ((getEstimatedNetUnusedAmortizedCommitments() == null) ? 0 : getEstimatedNetUnusedAmortizedCommitments().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePricing clone() {
        try {
            return (ResourcePricing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.ResourcePricingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
