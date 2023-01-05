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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomLineItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the custom line item to be updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The new name for the custom line item.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new line item description of the custom line item.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the new charge details for the custom line item.
     * </p>
     */
    private UpdateCustomLineItemChargeDetails chargeDetails;

    private CustomLineItemBillingPeriodRange billingPeriodRange;

    /**
     * <p>
     * The ARN of the custom line item to be updated.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom line item to be updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the custom line item to be updated.
     * </p>
     * 
     * @return The ARN of the custom line item to be updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the custom line item to be updated.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom line item to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The new name for the custom line item.
     * </p>
     * 
     * @param name
     *        The new name for the custom line item.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name for the custom line item.
     * </p>
     * 
     * @return The new name for the custom line item.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name for the custom line item.
     * </p>
     * 
     * @param name
     *        The new name for the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new line item description of the custom line item.
     * </p>
     * 
     * @param description
     *        The new line item description of the custom line item.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new line item description of the custom line item.
     * </p>
     * 
     * @return The new line item description of the custom line item.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new line item description of the custom line item.
     * </p>
     * 
     * @param description
     *        The new line item description of the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the new charge details for the custom line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>ListCustomLineItemChargeDetails</code> containing the new charge details for the custom line item.
     */

    public void setChargeDetails(UpdateCustomLineItemChargeDetails chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the new charge details for the custom line item.
     * </p>
     * 
     * @return A <code>ListCustomLineItemChargeDetails</code> containing the new charge details for the custom line
     *         item.
     */

    public UpdateCustomLineItemChargeDetails getChargeDetails() {
        return this.chargeDetails;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the new charge details for the custom line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>ListCustomLineItemChargeDetails</code> containing the new charge details for the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemRequest withChargeDetails(UpdateCustomLineItemChargeDetails chargeDetails) {
        setChargeDetails(chargeDetails);
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

    public UpdateCustomLineItemRequest withBillingPeriodRange(CustomLineItemBillingPeriodRange billingPeriodRange) {
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getChargeDetails() != null)
            sb.append("ChargeDetails: ").append(getChargeDetails()).append(",");
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

        if (obj instanceof UpdateCustomLineItemRequest == false)
            return false;
        UpdateCustomLineItemRequest other = (UpdateCustomLineItemRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getChargeDetails() == null ^ this.getChargeDetails() == null)
            return false;
        if (other.getChargeDetails() != null && other.getChargeDetails().equals(this.getChargeDetails()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChargeDetails() == null) ? 0 : getChargeDetails().hashCode());
        hashCode = prime * hashCode + ((getBillingPeriodRange() == null) ? 0 : getBillingPeriodRange().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomLineItemRequest clone() {
        return (UpdateCustomLineItemRequest) super.clone();
    }

}
