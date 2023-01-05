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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of the <code>ResolveCustomer</code> operation. Contains the <code>CustomerIdentifier</code> along with the
 * <code>CustomerAWSAccountId</code> and <code>ProductCode</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/ResolveCustomer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveCustomerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>CustomerIdentifier</code> is used to identify an individual customer in your application. Calls to
     * <code>BatchMeterUsage</code> require <code>CustomerIdentifiers</code> for each <code>UsageRecord</code>.
     * </p>
     */
    private String customerIdentifier;
    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * <code>BatchMeterUsage</code> calls should be made using this product code.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * The <code>CustomerAWSAccountId</code> provides the AWS account ID associated with the
     * <code>CustomerIdentifier</code> for the individual customer.
     * </p>
     */
    private String customerAWSAccountId;

    /**
     * <p>
     * The <code>CustomerIdentifier</code> is used to identify an individual customer in your application. Calls to
     * <code>BatchMeterUsage</code> require <code>CustomerIdentifiers</code> for each <code>UsageRecord</code>.
     * </p>
     * 
     * @param customerIdentifier
     *        The <code>CustomerIdentifier</code> is used to identify an individual customer in your application. Calls
     *        to <code>BatchMeterUsage</code> require <code>CustomerIdentifiers</code> for each <code>UsageRecord</code>
     *        .
     */

    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    /**
     * <p>
     * The <code>CustomerIdentifier</code> is used to identify an individual customer in your application. Calls to
     * <code>BatchMeterUsage</code> require <code>CustomerIdentifiers</code> for each <code>UsageRecord</code>.
     * </p>
     * 
     * @return The <code>CustomerIdentifier</code> is used to identify an individual customer in your application. Calls
     *         to <code>BatchMeterUsage</code> require <code>CustomerIdentifiers</code> for each
     *         <code>UsageRecord</code>.
     */

    public String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    /**
     * <p>
     * The <code>CustomerIdentifier</code> is used to identify an individual customer in your application. Calls to
     * <code>BatchMeterUsage</code> require <code>CustomerIdentifiers</code> for each <code>UsageRecord</code>.
     * </p>
     * 
     * @param customerIdentifier
     *        The <code>CustomerIdentifier</code> is used to identify an individual customer in your application. Calls
     *        to <code>BatchMeterUsage</code> require <code>CustomerIdentifiers</code> for each <code>UsageRecord</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCustomerResult withCustomerIdentifier(String customerIdentifier) {
        setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * <code>BatchMeterUsage</code> calls should be made using this product code.
     * </p>
     * 
     * @param productCode
     *        The product code is returned to confirm that the buyer is registering for your product. Subsequent
     *        <code>BatchMeterUsage</code> calls should be made using this product code.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * <code>BatchMeterUsage</code> calls should be made using this product code.
     * </p>
     * 
     * @return The product code is returned to confirm that the buyer is registering for your product. Subsequent
     *         <code>BatchMeterUsage</code> calls should be made using this product code.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * <code>BatchMeterUsage</code> calls should be made using this product code.
     * </p>
     * 
     * @param productCode
     *        The product code is returned to confirm that the buyer is registering for your product. Subsequent
     *        <code>BatchMeterUsage</code> calls should be made using this product code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCustomerResult withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * The <code>CustomerAWSAccountId</code> provides the AWS account ID associated with the
     * <code>CustomerIdentifier</code> for the individual customer.
     * </p>
     * 
     * @param customerAWSAccountId
     *        The <code>CustomerAWSAccountId</code> provides the AWS account ID associated with the
     *        <code>CustomerIdentifier</code> for the individual customer.
     */

    public void setCustomerAWSAccountId(String customerAWSAccountId) {
        this.customerAWSAccountId = customerAWSAccountId;
    }

    /**
     * <p>
     * The <code>CustomerAWSAccountId</code> provides the AWS account ID associated with the
     * <code>CustomerIdentifier</code> for the individual customer.
     * </p>
     * 
     * @return The <code>CustomerAWSAccountId</code> provides the AWS account ID associated with the
     *         <code>CustomerIdentifier</code> for the individual customer.
     */

    public String getCustomerAWSAccountId() {
        return this.customerAWSAccountId;
    }

    /**
     * <p>
     * The <code>CustomerAWSAccountId</code> provides the AWS account ID associated with the
     * <code>CustomerIdentifier</code> for the individual customer.
     * </p>
     * 
     * @param customerAWSAccountId
     *        The <code>CustomerAWSAccountId</code> provides the AWS account ID associated with the
     *        <code>CustomerIdentifier</code> for the individual customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCustomerResult withCustomerAWSAccountId(String customerAWSAccountId) {
        setCustomerAWSAccountId(customerAWSAccountId);
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
        if (getCustomerIdentifier() != null)
            sb.append("CustomerIdentifier: ").append(getCustomerIdentifier()).append(",");
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getCustomerAWSAccountId() != null)
            sb.append("CustomerAWSAccountId: ").append(getCustomerAWSAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveCustomerResult == false)
            return false;
        ResolveCustomerResult other = (ResolveCustomerResult) obj;
        if (other.getCustomerIdentifier() == null ^ this.getCustomerIdentifier() == null)
            return false;
        if (other.getCustomerIdentifier() != null && other.getCustomerIdentifier().equals(this.getCustomerIdentifier()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getCustomerAWSAccountId() == null ^ this.getCustomerAWSAccountId() == null)
            return false;
        if (other.getCustomerAWSAccountId() != null && other.getCustomerAWSAccountId().equals(this.getCustomerAWSAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerIdentifier() == null) ? 0 : getCustomerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getCustomerAWSAccountId() == null) ? 0 : getCustomerAWSAccountId().hashCode());
        return hashCode;
    }

    @Override
    public ResolveCustomerResult clone() {
        try {
            return (ResolveCustomerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
