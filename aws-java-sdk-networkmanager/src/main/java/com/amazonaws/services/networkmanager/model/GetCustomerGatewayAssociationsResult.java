/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCustomerGatewayAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomerGatewayAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The customer gateway associations.
     * </p>
     */
    private java.util.List<CustomerGatewayAssociation> customerGatewayAssociations;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The customer gateway associations.
     * </p>
     * 
     * @return The customer gateway associations.
     */

    public java.util.List<CustomerGatewayAssociation> getCustomerGatewayAssociations() {
        return customerGatewayAssociations;
    }

    /**
     * <p>
     * The customer gateway associations.
     * </p>
     * 
     * @param customerGatewayAssociations
     *        The customer gateway associations.
     */

    public void setCustomerGatewayAssociations(java.util.Collection<CustomerGatewayAssociation> customerGatewayAssociations) {
        if (customerGatewayAssociations == null) {
            this.customerGatewayAssociations = null;
            return;
        }

        this.customerGatewayAssociations = new java.util.ArrayList<CustomerGatewayAssociation>(customerGatewayAssociations);
    }

    /**
     * <p>
     * The customer gateway associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerGatewayAssociations(java.util.Collection)} or
     * {@link #withCustomerGatewayAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customerGatewayAssociations
     *        The customer gateway associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsResult withCustomerGatewayAssociations(CustomerGatewayAssociation... customerGatewayAssociations) {
        if (this.customerGatewayAssociations == null) {
            setCustomerGatewayAssociations(new java.util.ArrayList<CustomerGatewayAssociation>(customerGatewayAssociations.length));
        }
        for (CustomerGatewayAssociation ele : customerGatewayAssociations) {
            this.customerGatewayAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The customer gateway associations.
     * </p>
     * 
     * @param customerGatewayAssociations
     *        The customer gateway associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsResult withCustomerGatewayAssociations(java.util.Collection<CustomerGatewayAssociation> customerGatewayAssociations) {
        setCustomerGatewayAssociations(customerGatewayAssociations);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCustomerGatewayAssociations() != null)
            sb.append("CustomerGatewayAssociations: ").append(getCustomerGatewayAssociations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCustomerGatewayAssociationsResult == false)
            return false;
        GetCustomerGatewayAssociationsResult other = (GetCustomerGatewayAssociationsResult) obj;
        if (other.getCustomerGatewayAssociations() == null ^ this.getCustomerGatewayAssociations() == null)
            return false;
        if (other.getCustomerGatewayAssociations() != null && other.getCustomerGatewayAssociations().equals(this.getCustomerGatewayAssociations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerGatewayAssociations() == null) ? 0 : getCustomerGatewayAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCustomerGatewayAssociationsResult clone() {
        try {
            return (GetCustomerGatewayAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
