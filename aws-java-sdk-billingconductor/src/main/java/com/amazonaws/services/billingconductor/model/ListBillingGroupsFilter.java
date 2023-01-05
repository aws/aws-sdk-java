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
 * The filter that specifies the billing groups and pricing plans to retrieve billing group information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroupsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBillingGroupsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     */
    private java.util.List<String> arns;
    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     */
    private String pricingPlan;

    /**
     * <p>
     * The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @return The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     */

    public java.util.List<String> getArns() {
        return arns;
    }

    /**
     * <p>
     * The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @param arns
     *        The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     */

    public void setArns(java.util.Collection<String> arns) {
        if (arns == null) {
            this.arns = null;
            return;
        }

        this.arns = new java.util.ArrayList<String>(arns);
    }

    /**
     * <p>
     * The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArns(java.util.Collection)} or {@link #withArns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param arns
     *        The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsFilter withArns(String... arns) {
        if (this.arns == null) {
            setArns(new java.util.ArrayList<String>(arns.length));
        }
        for (String ele : arns) {
            this.arns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @param arns
     *        The list of billing group Amazon Resource Names (ARNs) to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsFilter withArns(java.util.Collection<String> arns) {
        setArns(arns);
        return this;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan Amazon Resource Names (ARNs) to retrieve information.
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @return The pricing plan Amazon Resource Names (ARNs) to retrieve information.
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan Amazon Resource Names (ARNs) to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsFilter withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
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
        if (getArns() != null)
            sb.append("Arns: ").append(getArns()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBillingGroupsFilter == false)
            return false;
        ListBillingGroupsFilter other = (ListBillingGroupsFilter) obj;
        if (other.getArns() == null ^ this.getArns() == null)
            return false;
        if (other.getArns() != null && other.getArns().equals(this.getArns()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArns() == null) ? 0 : getArns().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        return hashCode;
    }

    @Override
    public ListBillingGroupsFilter clone() {
        try {
            return (ListBillingGroupsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListBillingGroupsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
