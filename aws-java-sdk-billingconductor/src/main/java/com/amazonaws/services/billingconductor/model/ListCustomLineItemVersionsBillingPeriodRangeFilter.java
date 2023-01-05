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
 * A billing period filter that specifies the custom line item versions to retrieve.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemVersionsBillingPeriodRangeFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomLineItemVersionsBillingPeriodRangeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line item version is
     * applied.
     * </p>
     */
    private String startBillingPeriod;
    /**
     * <p>
     * The exclusive end billing period that defines a billing period range where a custom line item version is applied.
     * </p>
     */
    private String endBillingPeriod;

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line item version is
     * applied.
     * </p>
     * 
     * @param startBillingPeriod
     *        The inclusive start billing period that defines a billing period range where a custom line item version is
     *        applied.
     */

    public void setStartBillingPeriod(String startBillingPeriod) {
        this.startBillingPeriod = startBillingPeriod;
    }

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line item version is
     * applied.
     * </p>
     * 
     * @return The inclusive start billing period that defines a billing period range where a custom line item version
     *         is applied.
     */

    public String getStartBillingPeriod() {
        return this.startBillingPeriod;
    }

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line item version is
     * applied.
     * </p>
     * 
     * @param startBillingPeriod
     *        The inclusive start billing period that defines a billing period range where a custom line item version is
     *        applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemVersionsBillingPeriodRangeFilter withStartBillingPeriod(String startBillingPeriod) {
        setStartBillingPeriod(startBillingPeriod);
        return this;
    }

    /**
     * <p>
     * The exclusive end billing period that defines a billing period range where a custom line item version is applied.
     * </p>
     * 
     * @param endBillingPeriod
     *        The exclusive end billing period that defines a billing period range where a custom line item version is
     *        applied.
     */

    public void setEndBillingPeriod(String endBillingPeriod) {
        this.endBillingPeriod = endBillingPeriod;
    }

    /**
     * <p>
     * The exclusive end billing period that defines a billing period range where a custom line item version is applied.
     * </p>
     * 
     * @return The exclusive end billing period that defines a billing period range where a custom line item version is
     *         applied.
     */

    public String getEndBillingPeriod() {
        return this.endBillingPeriod;
    }

    /**
     * <p>
     * The exclusive end billing period that defines a billing period range where a custom line item version is applied.
     * </p>
     * 
     * @param endBillingPeriod
     *        The exclusive end billing period that defines a billing period range where a custom line item version is
     *        applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemVersionsBillingPeriodRangeFilter withEndBillingPeriod(String endBillingPeriod) {
        setEndBillingPeriod(endBillingPeriod);
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
        if (getStartBillingPeriod() != null)
            sb.append("StartBillingPeriod: ").append(getStartBillingPeriod()).append(",");
        if (getEndBillingPeriod() != null)
            sb.append("EndBillingPeriod: ").append(getEndBillingPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomLineItemVersionsBillingPeriodRangeFilter == false)
            return false;
        ListCustomLineItemVersionsBillingPeriodRangeFilter other = (ListCustomLineItemVersionsBillingPeriodRangeFilter) obj;
        if (other.getStartBillingPeriod() == null ^ this.getStartBillingPeriod() == null)
            return false;
        if (other.getStartBillingPeriod() != null && other.getStartBillingPeriod().equals(this.getStartBillingPeriod()) == false)
            return false;
        if (other.getEndBillingPeriod() == null ^ this.getEndBillingPeriod() == null)
            return false;
        if (other.getEndBillingPeriod() != null && other.getEndBillingPeriod().equals(this.getEndBillingPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartBillingPeriod() == null) ? 0 : getStartBillingPeriod().hashCode());
        hashCode = prime * hashCode + ((getEndBillingPeriod() == null) ? 0 : getEndBillingPeriod().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomLineItemVersionsBillingPeriodRangeFilter clone() {
        try {
            return (ListCustomLineItemVersionsBillingPeriodRangeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListCustomLineItemVersionsBillingPeriodRangeFilterMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
