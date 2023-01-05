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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ComputationPreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputationPreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that's used to compute the Amazon Web Services charges for a
     * billing group.
     * </p>
     */
    private String pricingPlanArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that's used to compute the Amazon Web Services charges for a
     * billing group.
     * </p>
     * 
     * @param pricingPlanArn
     *        The Amazon Resource Name (ARN) of the pricing plan that's used to compute the Amazon Web Services charges
     *        for a billing group.
     */

    public void setPricingPlanArn(String pricingPlanArn) {
        this.pricingPlanArn = pricingPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that's used to compute the Amazon Web Services charges for a
     * billing group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pricing plan that's used to compute the Amazon Web Services charges
     *         for a billing group.
     */

    public String getPricingPlanArn() {
        return this.pricingPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that's used to compute the Amazon Web Services charges for a
     * billing group.
     * </p>
     * 
     * @param pricingPlanArn
     *        The Amazon Resource Name (ARN) of the pricing plan that's used to compute the Amazon Web Services charges
     *        for a billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputationPreference withPricingPlanArn(String pricingPlanArn) {
        setPricingPlanArn(pricingPlanArn);
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
        if (getPricingPlanArn() != null)
            sb.append("PricingPlanArn: ").append(getPricingPlanArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputationPreference == false)
            return false;
        ComputationPreference other = (ComputationPreference) obj;
        if (other.getPricingPlanArn() == null ^ this.getPricingPlanArn() == null)
            return false;
        if (other.getPricingPlanArn() != null && other.getPricingPlanArn().equals(this.getPricingPlanArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPricingPlanArn() == null) ? 0 : getPricingPlanArn().hashCode());
        return hashCode;
    }

    @Override
    public ComputationPreference clone() {
        try {
            return (ComputationPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ComputationPreferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
