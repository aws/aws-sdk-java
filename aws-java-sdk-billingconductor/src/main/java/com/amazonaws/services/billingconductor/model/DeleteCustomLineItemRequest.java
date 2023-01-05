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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomLineItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the custom line item to be deleted.
     * </p>
     */
    private String arn;

    private CustomLineItemBillingPeriodRange billingPeriodRange;

    /**
     * <p>
     * The ARN of the custom line item to be deleted.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom line item to be deleted.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the custom line item to be deleted.
     * </p>
     * 
     * @return The ARN of the custom line item to be deleted.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the custom line item to be deleted.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom line item to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomLineItemRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param billingPeriodRange
     */

    public void setBillingPeriodRange(CustomLineItemBillingPeriodRange billingPeriodRange) {
        this.billingPeriodRange = billingPeriodRange;
    }

    /**
     * @return
     */

    public CustomLineItemBillingPeriodRange getBillingPeriodRange() {
        return this.billingPeriodRange;
    }

    /**
     * @param billingPeriodRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomLineItemRequest withBillingPeriodRange(CustomLineItemBillingPeriodRange billingPeriodRange) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof DeleteCustomLineItemRequest == false)
            return false;
        DeleteCustomLineItemRequest other = (DeleteCustomLineItemRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBillingPeriodRange() == null) ? 0 : getBillingPeriodRange().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomLineItemRequest clone() {
        return (DeleteCustomLineItemRequest) super.clone();
    }

}
