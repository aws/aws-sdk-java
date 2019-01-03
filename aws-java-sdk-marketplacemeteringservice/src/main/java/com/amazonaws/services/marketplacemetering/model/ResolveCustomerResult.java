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

/**
 * <p>
 * The result of the ResolveCustomer operation. Contains the CustomerIdentifier and product code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/ResolveCustomer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveCustomerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage
     * require CustomerIdentifiers for each UsageRecord.
     * </p>
     */
    private String customerIdentifier;
    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * BatchMeterUsage calls should be made using this product code.
     * </p>
     */
    private String productCode;

    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage
     * require CustomerIdentifiers for each UsageRecord.
     * </p>
     * 
     * @param customerIdentifier
     *        The CustomerIdentifier is used to identify an individual customer in your application. Calls to
     *        BatchMeterUsage require CustomerIdentifiers for each UsageRecord.
     */

    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage
     * require CustomerIdentifiers for each UsageRecord.
     * </p>
     * 
     * @return The CustomerIdentifier is used to identify an individual customer in your application. Calls to
     *         BatchMeterUsage require CustomerIdentifiers for each UsageRecord.
     */

    public String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage
     * require CustomerIdentifiers for each UsageRecord.
     * </p>
     * 
     * @param customerIdentifier
     *        The CustomerIdentifier is used to identify an individual customer in your application. Calls to
     *        BatchMeterUsage require CustomerIdentifiers for each UsageRecord.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCustomerResult withCustomerIdentifier(String customerIdentifier) {
        setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * BatchMeterUsage calls should be made using this product code.
     * </p>
     * 
     * @param productCode
     *        The product code is returned to confirm that the buyer is registering for your product. Subsequent
     *        BatchMeterUsage calls should be made using this product code.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * BatchMeterUsage calls should be made using this product code.
     * </p>
     * 
     * @return The product code is returned to confirm that the buyer is registering for your product. Subsequent
     *         BatchMeterUsage calls should be made using this product code.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for your product. Subsequent
     * BatchMeterUsage calls should be made using this product code.
     * </p>
     * 
     * @param productCode
     *        The product code is returned to confirm that the buyer is registering for your product. Subsequent
     *        BatchMeterUsage calls should be made using this product code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCustomerResult withProductCode(String productCode) {
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
        if (getCustomerIdentifier() != null)
            sb.append("CustomerIdentifier: ").append(getCustomerIdentifier()).append(",");
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerIdentifier() == null) ? 0 : getCustomerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
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
