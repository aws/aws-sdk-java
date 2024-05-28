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
 * Cost impact of the resource recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ResourceCostCalculation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceCostCalculation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Pricing details of the resource recommendation.
     * </p>
     */
    private ResourcePricing pricing;
    /**
     * <p>
     * Usage details of the resource recommendation.
     * </p>
     */
    private java.util.List<Usage> usages;

    /**
     * <p>
     * Pricing details of the resource recommendation.
     * </p>
     * 
     * @param pricing
     *        Pricing details of the resource recommendation.
     */

    public void setPricing(ResourcePricing pricing) {
        this.pricing = pricing;
    }

    /**
     * <p>
     * Pricing details of the resource recommendation.
     * </p>
     * 
     * @return Pricing details of the resource recommendation.
     */

    public ResourcePricing getPricing() {
        return this.pricing;
    }

    /**
     * <p>
     * Pricing details of the resource recommendation.
     * </p>
     * 
     * @param pricing
     *        Pricing details of the resource recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCostCalculation withPricing(ResourcePricing pricing) {
        setPricing(pricing);
        return this;
    }

    /**
     * <p>
     * Usage details of the resource recommendation.
     * </p>
     * 
     * @return Usage details of the resource recommendation.
     */

    public java.util.List<Usage> getUsages() {
        return usages;
    }

    /**
     * <p>
     * Usage details of the resource recommendation.
     * </p>
     * 
     * @param usages
     *        Usage details of the resource recommendation.
     */

    public void setUsages(java.util.Collection<Usage> usages) {
        if (usages == null) {
            this.usages = null;
            return;
        }

        this.usages = new java.util.ArrayList<Usage>(usages);
    }

    /**
     * <p>
     * Usage details of the resource recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsages(java.util.Collection)} or {@link #withUsages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param usages
     *        Usage details of the resource recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCostCalculation withUsages(Usage... usages) {
        if (this.usages == null) {
            setUsages(new java.util.ArrayList<Usage>(usages.length));
        }
        for (Usage ele : usages) {
            this.usages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Usage details of the resource recommendation.
     * </p>
     * 
     * @param usages
     *        Usage details of the resource recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCostCalculation withUsages(java.util.Collection<Usage> usages) {
        setUsages(usages);
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
        if (getPricing() != null)
            sb.append("Pricing: ").append(getPricing()).append(",");
        if (getUsages() != null)
            sb.append("Usages: ").append(getUsages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceCostCalculation == false)
            return false;
        ResourceCostCalculation other = (ResourceCostCalculation) obj;
        if (other.getPricing() == null ^ this.getPricing() == null)
            return false;
        if (other.getPricing() != null && other.getPricing().equals(this.getPricing()) == false)
            return false;
        if (other.getUsages() == null ^ this.getUsages() == null)
            return false;
        if (other.getUsages() != null && other.getUsages().equals(this.getUsages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPricing() == null) ? 0 : getPricing().hashCode());
        hashCode = prime * hashCode + ((getUsages() == null) ? 0 : getUsages().hashCode());
        return hashCode;
    }

    @Override
    public ResourceCostCalculation clone() {
        try {
            return (ResourceCostCalculation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.ResourceCostCalculationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
