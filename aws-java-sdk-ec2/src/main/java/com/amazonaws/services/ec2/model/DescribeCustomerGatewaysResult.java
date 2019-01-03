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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeCustomerGateways.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomerGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more customer gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomerGateway> customerGateways;

    /**
     * <p>
     * Information about one or more customer gateways.
     * </p>
     * 
     * @return Information about one or more customer gateways.
     */

    public java.util.List<CustomerGateway> getCustomerGateways() {
        if (customerGateways == null) {
            customerGateways = new com.amazonaws.internal.SdkInternalList<CustomerGateway>();
        }
        return customerGateways;
    }

    /**
     * <p>
     * Information about one or more customer gateways.
     * </p>
     * 
     * @param customerGateways
     *        Information about one or more customer gateways.
     */

    public void setCustomerGateways(java.util.Collection<CustomerGateway> customerGateways) {
        if (customerGateways == null) {
            this.customerGateways = null;
            return;
        }

        this.customerGateways = new com.amazonaws.internal.SdkInternalList<CustomerGateway>(customerGateways);
    }

    /**
     * <p>
     * Information about one or more customer gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerGateways(java.util.Collection)} or {@link #withCustomerGateways(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customerGateways
     *        Information about one or more customer gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomerGatewaysResult withCustomerGateways(CustomerGateway... customerGateways) {
        if (this.customerGateways == null) {
            setCustomerGateways(new com.amazonaws.internal.SdkInternalList<CustomerGateway>(customerGateways.length));
        }
        for (CustomerGateway ele : customerGateways) {
            this.customerGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more customer gateways.
     * </p>
     * 
     * @param customerGateways
     *        Information about one or more customer gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomerGatewaysResult withCustomerGateways(java.util.Collection<CustomerGateway> customerGateways) {
        setCustomerGateways(customerGateways);
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
        if (getCustomerGateways() != null)
            sb.append("CustomerGateways: ").append(getCustomerGateways());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomerGatewaysResult == false)
            return false;
        DescribeCustomerGatewaysResult other = (DescribeCustomerGatewaysResult) obj;
        if (other.getCustomerGateways() == null ^ this.getCustomerGateways() == null)
            return false;
        if (other.getCustomerGateways() != null && other.getCustomerGateways().equals(this.getCustomerGateways()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerGateways() == null) ? 0 : getCustomerGateways().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomerGatewaysResult clone() {
        try {
            return (DescribeCustomerGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
