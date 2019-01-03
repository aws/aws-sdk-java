/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/BatchMeterUsage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchMeterUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     * </p>
     */
    private java.util.List<UsageRecord> usageRecords;
    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     */
    private String productCode;

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     * </p>
     * 
     * @return The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     */

    public java.util.List<UsageRecord> getUsageRecords() {
        return usageRecords;
    }

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     * </p>
     * 
     * @param usageRecords
     *        The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     */

    public void setUsageRecords(java.util.Collection<UsageRecord> usageRecords) {
        if (usageRecords == null) {
            this.usageRecords = null;
            return;
        }

        this.usageRecords = new java.util.ArrayList<UsageRecord>(usageRecords);
    }

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageRecords(java.util.Collection)} or {@link #withUsageRecords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param usageRecords
     *        The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchMeterUsageRequest withUsageRecords(UsageRecord... usageRecords) {
        if (this.usageRecords == null) {
            setUsageRecords(new java.util.ArrayList<UsageRecord>(usageRecords.length));
        }
        for (UsageRecord ele : usageRecords) {
            this.usageRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     * </p>
     * 
     * @param usageRecords
     *        The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchMeterUsageRequest withUsageRecords(java.util.Collection<UsageRecord> usageRecords) {
        setUsageRecords(usageRecords);
        return this;
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

    public BatchMeterUsageRequest withProductCode(String productCode) {
        setProductCode(productCode);
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
        if (getUsageRecords() != null)
            sb.append("UsageRecords: ").append(getUsageRecords()).append(",");
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchMeterUsageRequest == false)
            return false;
        BatchMeterUsageRequest other = (BatchMeterUsageRequest) obj;
        if (other.getUsageRecords() == null ^ this.getUsageRecords() == null)
            return false;
        if (other.getUsageRecords() != null && other.getUsageRecords().equals(this.getUsageRecords()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageRecords() == null) ? 0 : getUsageRecords().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        return hashCode;
    }

    @Override
    public BatchMeterUsageRequest clone() {
        return (BatchMeterUsageRequest) super.clone();
    }

}
