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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomLineItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the successfully updated custom line item.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of the billing group that the custom line item is applied to.
     * </p>
     */
    private String billingGroupArn;
    /**
     * <p>
     * The name of the successfully updated custom line item.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the successfully updated custom line item.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the charge details of the successfully updated custom
     * line item.
     * </p>
     */
    private ListCustomLineItemChargeDetails chargeDetails;
    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     */
    private Long associationSize;

    /**
     * <p>
     * The ARN of the successfully updated custom line item.
     * </p>
     * 
     * @param arn
     *        The ARN of the successfully updated custom line item.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the successfully updated custom line item.
     * </p>
     * 
     * @return The ARN of the successfully updated custom line item.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the successfully updated custom line item.
     * </p>
     * 
     * @param arn
     *        The ARN of the successfully updated custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of the billing group that the custom line item is applied to.
     * </p>
     * 
     * @param billingGroupArn
     *        The ARN of the billing group that the custom line item is applied to.
     */

    public void setBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
    }

    /**
     * <p>
     * The ARN of the billing group that the custom line item is applied to.
     * </p>
     * 
     * @return The ARN of the billing group that the custom line item is applied to.
     */

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    /**
     * <p>
     * The ARN of the billing group that the custom line item is applied to.
     * </p>
     * 
     * @param billingGroupArn
     *        The ARN of the billing group that the custom line item is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemResult withBillingGroupArn(String billingGroupArn) {
        setBillingGroupArn(billingGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the successfully updated custom line item.
     * </p>
     * 
     * @param name
     *        The name of the successfully updated custom line item.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the successfully updated custom line item.
     * </p>
     * 
     * @return The name of the successfully updated custom line item.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the successfully updated custom line item.
     * </p>
     * 
     * @param name
     *        The name of the successfully updated custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the successfully updated custom line item.
     * </p>
     * 
     * @param description
     *        The description of the successfully updated custom line item.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the successfully updated custom line item.
     * </p>
     * 
     * @return The description of the successfully updated custom line item.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the successfully updated custom line item.
     * </p>
     * 
     * @param description
     *        The description of the successfully updated custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the charge details of the successfully updated custom
     * line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>ListCustomLineItemChargeDetails</code> containing the charge details of the successfully updated
     *        custom line item.
     */

    public void setChargeDetails(ListCustomLineItemChargeDetails chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the charge details of the successfully updated custom
     * line item.
     * </p>
     * 
     * @return A <code>ListCustomLineItemChargeDetails</code> containing the charge details of the successfully updated
     *         custom line item.
     */

    public ListCustomLineItemChargeDetails getChargeDetails() {
        return this.chargeDetails;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> containing the charge details of the successfully updated custom
     * line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>ListCustomLineItemChargeDetails</code> containing the charge details of the successfully updated
     *        custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemResult withChargeDetails(ListCustomLineItemChargeDetails chargeDetails) {
        setChargeDetails(chargeDetails);
        return this;
    }

    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the custom line item was modified.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     * 
     * @return The most recent time when the custom line item was modified.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the custom line item was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemResult withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     * 
     * @param associationSize
     *        The number of resources that are associated to the custom line item.
     */

    public void setAssociationSize(Long associationSize) {
        this.associationSize = associationSize;
    }

    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     * 
     * @return The number of resources that are associated to the custom line item.
     */

    public Long getAssociationSize() {
        return this.associationSize;
    }

    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     * 
     * @param associationSize
     *        The number of resources that are associated to the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemResult withAssociationSize(Long associationSize) {
        setAssociationSize(associationSize);
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
        if (getBillingGroupArn() != null)
            sb.append("BillingGroupArn: ").append(getBillingGroupArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getChargeDetails() != null)
            sb.append("ChargeDetails: ").append(getChargeDetails()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getAssociationSize() != null)
            sb.append("AssociationSize: ").append(getAssociationSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomLineItemResult == false)
            return false;
        UpdateCustomLineItemResult other = (UpdateCustomLineItemResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBillingGroupArn() == null ^ this.getBillingGroupArn() == null)
            return false;
        if (other.getBillingGroupArn() != null && other.getBillingGroupArn().equals(this.getBillingGroupArn()) == false)
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
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getAssociationSize() == null ^ this.getAssociationSize() == null)
            return false;
        if (other.getAssociationSize() != null && other.getAssociationSize().equals(this.getAssociationSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupArn() == null) ? 0 : getBillingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChargeDetails() == null) ? 0 : getChargeDetails().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getAssociationSize() == null) ? 0 : getAssociationSize().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomLineItemResult clone() {
        try {
            return (UpdateCustomLineItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
