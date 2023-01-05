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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateBillingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBillingGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that was updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the billing group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     */
    private String primaryAccountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing group.
     * </p>
     */
    private String pricingPlanArn;
    /**
     * <p>
     * The number of accounts in the particular billing group.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The most recent time when the billing group was modified.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason why the billing group is in its current status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that was updated.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the billing group that was updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that was updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the billing group that was updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that was updated.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the billing group that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     * 
     * @param name
     *        The name of the billing group. The names must be unique to each billing group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     * 
     * @return The name of the billing group. The names must be unique to each billing group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     * 
     * @param name
     *        The name of the billing group. The names must be unique to each billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the billing group.
     * </p>
     * 
     * @param description
     *        A description of the billing group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the billing group.
     * </p>
     * 
     * @return A description of the billing group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the billing group.
     * </p>
     * 
     * @param description
     *        A description of the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     * 
     * @param primaryAccountId
     *        The account ID that serves as the main account in a billing group.
     */

    public void setPrimaryAccountId(String primaryAccountId) {
        this.primaryAccountId = primaryAccountId;
    }

    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     * 
     * @return The account ID that serves as the main account in a billing group.
     */

    public String getPrimaryAccountId() {
        return this.primaryAccountId;
    }

    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     * 
     * @param primaryAccountId
     *        The account ID that serves as the main account in a billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withPrimaryAccountId(String primaryAccountId) {
        setPrimaryAccountId(primaryAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing group.
     * </p>
     * 
     * @param pricingPlanArn
     *        The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing
     *        group.
     */

    public void setPricingPlanArn(String pricingPlanArn) {
        this.pricingPlanArn = pricingPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing
     *         group.
     */

    public String getPricingPlanArn() {
        return this.pricingPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing group.
     * </p>
     * 
     * @param pricingPlanArn
     *        The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withPricingPlanArn(String pricingPlanArn) {
        setPricingPlanArn(pricingPlanArn);
        return this;
    }

    /**
     * <p>
     * The number of accounts in the particular billing group.
     * </p>
     * 
     * @param size
     *        The number of accounts in the particular billing group.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The number of accounts in the particular billing group.
     * </p>
     * 
     * @return The number of accounts in the particular billing group.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The number of accounts in the particular billing group.
     * </p>
     * 
     * @param size
     *        The number of accounts in the particular billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The most recent time when the billing group was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the billing group was modified.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the billing group was modified.
     * </p>
     * 
     * @return The most recent time when the billing group was modified.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the billing group was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the billing group was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @param status
     *        The status of the billing group. Only one of the valid values can be used.
     * @see BillingGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @return The status of the billing group. Only one of the valid values can be used.
     * @see BillingGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @param status
     *        The status of the billing group. Only one of the valid values can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingGroupStatus
     */

    public UpdateBillingGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @param status
     *        The status of the billing group. Only one of the valid values can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingGroupStatus
     */

    public UpdateBillingGroupResult withStatus(BillingGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the billing group is in its current status.
     * </p>
     * 
     * @param statusReason
     *        The reason why the billing group is in its current status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason why the billing group is in its current status.
     * </p>
     * 
     * @return The reason why the billing group is in its current status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason why the billing group is in its current status.
     * </p>
     * 
     * @param statusReason
     *        The reason why the billing group is in its current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getPrimaryAccountId() != null)
            sb.append("PrimaryAccountId: ").append(getPrimaryAccountId()).append(",");
        if (getPricingPlanArn() != null)
            sb.append("PricingPlanArn: ").append(getPricingPlanArn()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBillingGroupResult == false)
            return false;
        UpdateBillingGroupResult other = (UpdateBillingGroupResult) obj;
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
        if (other.getPrimaryAccountId() == null ^ this.getPrimaryAccountId() == null)
            return false;
        if (other.getPrimaryAccountId() != null && other.getPrimaryAccountId().equals(this.getPrimaryAccountId()) == false)
            return false;
        if (other.getPricingPlanArn() == null ^ this.getPricingPlanArn() == null)
            return false;
        if (other.getPricingPlanArn() != null && other.getPricingPlanArn().equals(this.getPricingPlanArn()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
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
        hashCode = prime * hashCode + ((getPrimaryAccountId() == null) ? 0 : getPrimaryAccountId().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanArn() == null) ? 0 : getPricingPlanArn().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBillingGroupResult clone() {
        try {
            return (UpdateBillingGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
