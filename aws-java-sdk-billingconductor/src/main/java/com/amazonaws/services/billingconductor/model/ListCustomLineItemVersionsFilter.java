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
 * A filter that specifies the billing period range where the custom line item versions reside.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemVersionsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomLineItemVersionsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The billing period range in which the custom line item version is applied.
     * </p>
     */
    private ListCustomLineItemVersionsBillingPeriodRangeFilter billingPeriodRange;

    /**
     * <p>
     * The billing period range in which the custom line item version is applied.
     * </p>
     * 
     * @param billingPeriodRange
     *        The billing period range in which the custom line item version is applied.
     */

    public void setBillingPeriodRange(ListCustomLineItemVersionsBillingPeriodRangeFilter billingPeriodRange) {
        this.billingPeriodRange = billingPeriodRange;
    }

    /**
     * <p>
     * The billing period range in which the custom line item version is applied.
     * </p>
     * 
     * @return The billing period range in which the custom line item version is applied.
     */

    public ListCustomLineItemVersionsBillingPeriodRangeFilter getBillingPeriodRange() {
        return this.billingPeriodRange;
    }

    /**
     * <p>
     * The billing period range in which the custom line item version is applied.
     * </p>
     * 
     * @param billingPeriodRange
     *        The billing period range in which the custom line item version is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemVersionsFilter withBillingPeriodRange(ListCustomLineItemVersionsBillingPeriodRangeFilter billingPeriodRange) {
        setBillingPeriodRange(billingPeriodRange);
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
        if (getBillingPeriodRange() != null)
            sb.append("BillingPeriodRange: ").append(getBillingPeriodRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomLineItemVersionsFilter == false)
            return false;
        ListCustomLineItemVersionsFilter other = (ListCustomLineItemVersionsFilter) obj;
        if (other.getBillingPeriodRange() == null ^ this.getBillingPeriodRange() == null)
            return false;
        if (other.getBillingPeriodRange() != null && other.getBillingPeriodRange().equals(this.getBillingPeriodRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingPeriodRange() == null) ? 0 : getBillingPeriodRange().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomLineItemVersionsFilter clone() {
        try {
            return (ListCustomLineItemVersionsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListCustomLineItemVersionsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
