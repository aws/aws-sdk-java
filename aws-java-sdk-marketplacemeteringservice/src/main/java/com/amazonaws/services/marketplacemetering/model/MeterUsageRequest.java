/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/MeterUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeterUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in
     * the past. Make sure the timestamp value is not before the start of the software usage.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing of the product.
     * </p>
     */
    private String usageDimension;
    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not specified.
     * </p>
     */
    private Integer usageQuantity;
    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does not make the request. If you have the
     * permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * The set of UsageAllocations to submit.
     * </p>
     * <p>
     * The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     * UsageAllocation must have a unique set of tags (include no tags).
     * </p>
     */
    private java.util.List<UsageAllocation> usageAllocations;

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the
     *        same as the one used during the publishing of a new product.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     * 
     * @return Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the
     *         same as the one used during the publishing of a new product.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the
     *        same as the one used during the publishing of a new product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeterUsageRequest withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in
     * the past. Make sure the timestamp value is not before the start of the software usage.
     * </p>
     * 
     * @param timestamp
     *        Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one
     *        hour in the past. Make sure the timestamp value is not before the start of the software usage.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in
     * the past. Make sure the timestamp value is not before the start of the software usage.
     * </p>
     * 
     * @return Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one
     *         hour in the past. Make sure the timestamp value is not before the start of the software usage.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in
     * the past. Make sure the timestamp value is not before the start of the software usage.
     * </p>
     * 
     * @param timestamp
     *        Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one
     *        hour in the past. Make sure the timestamp value is not before the start of the software usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeterUsageRequest withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing of the product.
     * </p>
     * 
     * @param usageDimension
     *        It will be one of the fcp dimension name provided during the publishing of the product.
     */

    public void setUsageDimension(String usageDimension) {
        this.usageDimension = usageDimension;
    }

    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing of the product.
     * </p>
     * 
     * @return It will be one of the fcp dimension name provided during the publishing of the product.
     */

    public String getUsageDimension() {
        return this.usageDimension;
    }

    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing of the product.
     * </p>
     * 
     * @param usageDimension
     *        It will be one of the fcp dimension name provided during the publishing of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeterUsageRequest withUsageDimension(String usageDimension) {
        setUsageDimension(usageDimension);
        return this;
    }

    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not specified.
     * </p>
     * 
     * @param usageQuantity
     *        Consumption value for the hour. Defaults to <code>0</code> if not specified.
     */

    public void setUsageQuantity(Integer usageQuantity) {
        this.usageQuantity = usageQuantity;
    }

    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not specified.
     * </p>
     * 
     * @return Consumption value for the hour. Defaults to <code>0</code> if not specified.
     */

    public Integer getUsageQuantity() {
        return this.usageQuantity;
    }

    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not specified.
     * </p>
     * 
     * @param usageQuantity
     *        Consumption value for the hour. Defaults to <code>0</code> if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeterUsageRequest withUsageQuantity(Integer usageQuantity) {
        setUsageQuantity(usageQuantity);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does not make the request. If you have the
     * permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the permissions required for the action, but does not make the request. If you
     *        have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException.
     *        Defaults to <code>false</code> if not specified.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does not make the request. If you have the
     * permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     * 
     * @return Checks whether you have the permissions required for the action, but does not make the request. If you
     *         have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException.
     *         Defaults to <code>false</code> if not specified.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does not make the request. If you have the
     * permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the permissions required for the action, but does not make the request. If you
     *        have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException.
     *        Defaults to <code>false</code> if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeterUsageRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does not make the request. If you have the
     * permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     * 
     * @return Checks whether you have the permissions required for the action, but does not make the request. If you
     *         have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException.
     *         Defaults to <code>false</code> if not specified.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * The set of UsageAllocations to submit.
     * </p>
     * <p>
     * The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     * UsageAllocation must have a unique set of tags (include no tags).
     * </p>
     * 
     * @return The set of UsageAllocations to submit.</p>
     *         <p>
     *         The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and
     *         each UsageAllocation must have a unique set of tags (include no tags).
     */

    public java.util.List<UsageAllocation> getUsageAllocations() {
        return usageAllocations;
    }

    /**
     * <p>
     * The set of UsageAllocations to submit.
     * </p>
     * <p>
     * The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     * UsageAllocation must have a unique set of tags (include no tags).
     * </p>
     * 
     * @param usageAllocations
     *        The set of UsageAllocations to submit.</p>
     *        <p>
     *        The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     *        UsageAllocation must have a unique set of tags (include no tags).
     */

    public void setUsageAllocations(java.util.Collection<UsageAllocation> usageAllocations) {
        if (usageAllocations == null) {
            this.usageAllocations = null;
            return;
        }

        this.usageAllocations = new java.util.ArrayList<UsageAllocation>(usageAllocations);
    }

    /**
     * <p>
     * The set of UsageAllocations to submit.
     * </p>
     * <p>
     * The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     * UsageAllocation must have a unique set of tags (include no tags).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageAllocations(java.util.Collection)} or {@link #withUsageAllocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param usageAllocations
     *        The set of UsageAllocations to submit.</p>
     *        <p>
     *        The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     *        UsageAllocation must have a unique set of tags (include no tags).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeterUsageRequest withUsageAllocations(UsageAllocation... usageAllocations) {
        if (this.usageAllocations == null) {
            setUsageAllocations(new java.util.ArrayList<UsageAllocation>(usageAllocations.length));
        }
        for (UsageAllocation ele : usageAllocations) {
            this.usageAllocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of UsageAllocations to submit.
     * </p>
     * <p>
     * The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     * UsageAllocation must have a unique set of tags (include no tags).
     * </p>
     * 
     * @param usageAllocations
     *        The set of UsageAllocations to submit.</p>
     *        <p>
     *        The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each
     *        UsageAllocation must have a unique set of tags (include no tags).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeterUsageRequest withUsageAllocations(java.util.Collection<UsageAllocation> usageAllocations) {
        setUsageAllocations(usageAllocations);
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
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getUsageDimension() != null)
            sb.append("UsageDimension: ").append(getUsageDimension()).append(",");
        if (getUsageQuantity() != null)
            sb.append("UsageQuantity: ").append(getUsageQuantity()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getUsageAllocations() != null)
            sb.append("UsageAllocations: ").append(getUsageAllocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeterUsageRequest == false)
            return false;
        MeterUsageRequest other = (MeterUsageRequest) obj;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getUsageDimension() == null ^ this.getUsageDimension() == null)
            return false;
        if (other.getUsageDimension() != null && other.getUsageDimension().equals(this.getUsageDimension()) == false)
            return false;
        if (other.getUsageQuantity() == null ^ this.getUsageQuantity() == null)
            return false;
        if (other.getUsageQuantity() != null && other.getUsageQuantity().equals(this.getUsageQuantity()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getUsageAllocations() == null ^ this.getUsageAllocations() == null)
            return false;
        if (other.getUsageAllocations() != null && other.getUsageAllocations().equals(this.getUsageAllocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUsageDimension() == null) ? 0 : getUsageDimension().hashCode());
        hashCode = prime * hashCode + ((getUsageQuantity() == null) ? 0 : getUsageQuantity().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getUsageAllocations() == null) ? 0 : getUsageAllocations().hashCode());
        return hashCode;
    }

    @Override
    public MeterUsageRequest clone() {
        return (MeterUsageRequest) super.clone();
    }

}
