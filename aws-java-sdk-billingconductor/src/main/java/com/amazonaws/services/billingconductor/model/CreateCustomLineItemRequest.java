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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomLineItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the custom line item.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the custom line item. This is shown on the Bills page in association with the charge value.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     */
    private String billingGroupArn;
    /**
     * <p>
     * A time range for which the custom line item is effective.
     * </p>
     */
    private CustomLineItemBillingPeriodRange billingPeriodRange;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a custom line item.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A <code>CustomLineItemChargeDetails</code> that describes the charge details for a custom line item.
     * </p>
     */
    private CustomLineItemChargeDetails chargeDetails;

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @return The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *         implemented in a future update.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the custom line item.
     * </p>
     * 
     * @param name
     *        The name of the custom line item.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom line item.
     * </p>
     * 
     * @return The name of the custom line item.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom line item.
     * </p>
     * 
     * @param name
     *        The name of the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the custom line item. This is shown on the Bills page in association with the charge value.
     * </p>
     * 
     * @param description
     *        The description of the custom line item. This is shown on the Bills page in association with the charge
     *        value.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the custom line item. This is shown on the Bills page in association with the charge value.
     * </p>
     * 
     * @return The description of the custom line item. This is shown on the Bills page in association with the charge
     *         value.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the custom line item. This is shown on the Bills page in association with the charge value.
     * </p>
     * 
     * @param description
     *        The description of the custom line item. This is shown on the Bills page in association with the charge
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     */

    public void setBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     */

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest withBillingGroupArn(String billingGroupArn) {
        setBillingGroupArn(billingGroupArn);
        return this;
    }

    /**
     * <p>
     * A time range for which the custom line item is effective.
     * </p>
     * 
     * @param billingPeriodRange
     *        A time range for which the custom line item is effective.
     */

    public void setBillingPeriodRange(CustomLineItemBillingPeriodRange billingPeriodRange) {
        this.billingPeriodRange = billingPeriodRange;
    }

    /**
     * <p>
     * A time range for which the custom line item is effective.
     * </p>
     * 
     * @return A time range for which the custom line item is effective.
     */

    public CustomLineItemBillingPeriodRange getBillingPeriodRange() {
        return this.billingPeriodRange;
    }

    /**
     * <p>
     * A time range for which the custom line item is effective.
     * </p>
     * 
     * @param billingPeriodRange
     *        A time range for which the custom line item is effective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest withBillingPeriodRange(CustomLineItemBillingPeriodRange billingPeriodRange) {
        setBillingPeriodRange(billingPeriodRange);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a custom line item.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to a custom line item.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a custom line item.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a custom line item.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a custom line item.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCustomLineItemRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A <code>CustomLineItemChargeDetails</code> that describes the charge details for a custom line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>CustomLineItemChargeDetails</code> that describes the charge details for a custom line item.
     */

    public void setChargeDetails(CustomLineItemChargeDetails chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    /**
     * <p>
     * A <code>CustomLineItemChargeDetails</code> that describes the charge details for a custom line item.
     * </p>
     * 
     * @return A <code>CustomLineItemChargeDetails</code> that describes the charge details for a custom line item.
     */

    public CustomLineItemChargeDetails getChargeDetails() {
        return this.chargeDetails;
    }

    /**
     * <p>
     * A <code>CustomLineItemChargeDetails</code> that describes the charge details for a custom line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>CustomLineItemChargeDetails</code> that describes the charge details for a custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLineItemRequest withChargeDetails(CustomLineItemChargeDetails chargeDetails) {
        setChargeDetails(chargeDetails);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getBillingGroupArn() != null)
            sb.append("BillingGroupArn: ").append(getBillingGroupArn()).append(",");
        if (getBillingPeriodRange() != null)
            sb.append("BillingPeriodRange: ").append(getBillingPeriodRange()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getChargeDetails() != null)
            sb.append("ChargeDetails: ").append(getChargeDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomLineItemRequest == false)
            return false;
        CreateCustomLineItemRequest other = (CreateCustomLineItemRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBillingGroupArn() == null ^ this.getBillingGroupArn() == null)
            return false;
        if (other.getBillingGroupArn() != null && other.getBillingGroupArn().equals(this.getBillingGroupArn()) == false)
            return false;
        if (other.getBillingPeriodRange() == null ^ this.getBillingPeriodRange() == null)
            return false;
        if (other.getBillingPeriodRange() != null && other.getBillingPeriodRange().equals(this.getBillingPeriodRange()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getChargeDetails() == null ^ this.getChargeDetails() == null)
            return false;
        if (other.getChargeDetails() != null && other.getChargeDetails().equals(this.getChargeDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupArn() == null) ? 0 : getBillingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getBillingPeriodRange() == null) ? 0 : getBillingPeriodRange().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getChargeDetails() == null) ? 0 : getChargeDetails().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomLineItemRequest clone() {
        return (CreateCustomLineItemRequest) super.clone();
    }

}
