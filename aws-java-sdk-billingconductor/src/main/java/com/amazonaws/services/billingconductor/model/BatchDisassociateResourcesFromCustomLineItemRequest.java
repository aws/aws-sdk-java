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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchDisassociateResourcesFromCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateResourcesFromCustomLineItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A percentage custom line item ARN to disassociate the resources from.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * A list containing the ARNs of resources to be disassociated.
     * </p>
     */
    private java.util.List<String> resourceArns;

    private CustomLineItemBillingPeriodRange billingPeriodRange;

    /**
     * <p>
     * A percentage custom line item ARN to disassociate the resources from.
     * </p>
     * 
     * @param targetArn
     *        A percentage custom line item ARN to disassociate the resources from.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * A percentage custom line item ARN to disassociate the resources from.
     * </p>
     * 
     * @return A percentage custom line item ARN to disassociate the resources from.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * A percentage custom line item ARN to disassociate the resources from.
     * </p>
     * 
     * @param targetArn
     *        A percentage custom line item ARN to disassociate the resources from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourcesFromCustomLineItemRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * A list containing the ARNs of resources to be disassociated.
     * </p>
     * 
     * @return A list containing the ARNs of resources to be disassociated.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * A list containing the ARNs of resources to be disassociated.
     * </p>
     * 
     * @param resourceArns
     *        A list containing the ARNs of resources to be disassociated.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * A list containing the ARNs of resources to be disassociated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        A list containing the ARNs of resources to be disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourcesFromCustomLineItemRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the ARNs of resources to be disassociated.
     * </p>
     * 
     * @param resourceArns
     *        A list containing the ARNs of resources to be disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourcesFromCustomLineItemRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
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

    public BatchDisassociateResourcesFromCustomLineItemRequest withBillingPeriodRange(CustomLineItemBillingPeriodRange billingPeriodRange) {
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
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

        if (obj instanceof BatchDisassociateResourcesFromCustomLineItemRequest == false)
            return false;
        BatchDisassociateResourcesFromCustomLineItemRequest other = (BatchDisassociateResourcesFromCustomLineItemRequest) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
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

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getBillingPeriodRange() == null) ? 0 : getBillingPeriodRange().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateResourcesFromCustomLineItemRequest clone() {
        return (BatchDisassociateResourcesFromCustomLineItemRequest) super.clone();
    }

}
