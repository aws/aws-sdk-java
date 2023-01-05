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
 * The billing period range in which the custom line item request will be applied.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CustomLineItemBillingPeriodRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLineItemBillingPeriodRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line is applied.
     * </p>
     */
    private String inclusiveStartBillingPeriod;
    /**
     * <p>
     * The inclusive end billing period that defines a billing period range where a custom line is applied.
     * </p>
     */
    private String exclusiveEndBillingPeriod;

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line is applied.
     * </p>
     * 
     * @param inclusiveStartBillingPeriod
     *        The inclusive start billing period that defines a billing period range where a custom line is applied.
     */

    public void setInclusiveStartBillingPeriod(String inclusiveStartBillingPeriod) {
        this.inclusiveStartBillingPeriod = inclusiveStartBillingPeriod;
    }

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line is applied.
     * </p>
     * 
     * @return The inclusive start billing period that defines a billing period range where a custom line is applied.
     */

    public String getInclusiveStartBillingPeriod() {
        return this.inclusiveStartBillingPeriod;
    }

    /**
     * <p>
     * The inclusive start billing period that defines a billing period range where a custom line is applied.
     * </p>
     * 
     * @param inclusiveStartBillingPeriod
     *        The inclusive start billing period that defines a billing period range where a custom line is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemBillingPeriodRange withInclusiveStartBillingPeriod(String inclusiveStartBillingPeriod) {
        setInclusiveStartBillingPeriod(inclusiveStartBillingPeriod);
        return this;
    }

    /**
     * <p>
     * The inclusive end billing period that defines a billing period range where a custom line is applied.
     * </p>
     * 
     * @param exclusiveEndBillingPeriod
     *        The inclusive end billing period that defines a billing period range where a custom line is applied.
     */

    public void setExclusiveEndBillingPeriod(String exclusiveEndBillingPeriod) {
        this.exclusiveEndBillingPeriod = exclusiveEndBillingPeriod;
    }

    /**
     * <p>
     * The inclusive end billing period that defines a billing period range where a custom line is applied.
     * </p>
     * 
     * @return The inclusive end billing period that defines a billing period range where a custom line is applied.
     */

    public String getExclusiveEndBillingPeriod() {
        return this.exclusiveEndBillingPeriod;
    }

    /**
     * <p>
     * The inclusive end billing period that defines a billing period range where a custom line is applied.
     * </p>
     * 
     * @param exclusiveEndBillingPeriod
     *        The inclusive end billing period that defines a billing period range where a custom line is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemBillingPeriodRange withExclusiveEndBillingPeriod(String exclusiveEndBillingPeriod) {
        setExclusiveEndBillingPeriod(exclusiveEndBillingPeriod);
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
        if (getInclusiveStartBillingPeriod() != null)
            sb.append("InclusiveStartBillingPeriod: ").append(getInclusiveStartBillingPeriod()).append(",");
        if (getExclusiveEndBillingPeriod() != null)
            sb.append("ExclusiveEndBillingPeriod: ").append(getExclusiveEndBillingPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomLineItemBillingPeriodRange == false)
            return false;
        CustomLineItemBillingPeriodRange other = (CustomLineItemBillingPeriodRange) obj;
        if (other.getInclusiveStartBillingPeriod() == null ^ this.getInclusiveStartBillingPeriod() == null)
            return false;
        if (other.getInclusiveStartBillingPeriod() != null && other.getInclusiveStartBillingPeriod().equals(this.getInclusiveStartBillingPeriod()) == false)
            return false;
        if (other.getExclusiveEndBillingPeriod() == null ^ this.getExclusiveEndBillingPeriod() == null)
            return false;
        if (other.getExclusiveEndBillingPeriod() != null && other.getExclusiveEndBillingPeriod().equals(this.getExclusiveEndBillingPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInclusiveStartBillingPeriod() == null) ? 0 : getInclusiveStartBillingPeriod().hashCode());
        hashCode = prime * hashCode + ((getExclusiveEndBillingPeriod() == null) ? 0 : getExclusiveEndBillingPeriod().hashCode());
        return hashCode;
    }

    @Override
    public CustomLineItemBillingPeriodRange clone() {
        try {
            return (CustomLineItemBillingPeriodRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.CustomLineItemBillingPeriodRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
