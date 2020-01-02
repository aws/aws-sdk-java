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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateCustomerGateway"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateCustomerGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The customer gateway association.
     * </p>
     */
    private CustomerGatewayAssociation customerGatewayAssociation;

    /**
     * <p>
     * The customer gateway association.
     * </p>
     * 
     * @param customerGatewayAssociation
     *        The customer gateway association.
     */

    public void setCustomerGatewayAssociation(CustomerGatewayAssociation customerGatewayAssociation) {
        this.customerGatewayAssociation = customerGatewayAssociation;
    }

    /**
     * <p>
     * The customer gateway association.
     * </p>
     * 
     * @return The customer gateway association.
     */

    public CustomerGatewayAssociation getCustomerGatewayAssociation() {
        return this.customerGatewayAssociation;
    }

    /**
     * <p>
     * The customer gateway association.
     * </p>
     * 
     * @param customerGatewayAssociation
     *        The customer gateway association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateCustomerGatewayResult withCustomerGatewayAssociation(CustomerGatewayAssociation customerGatewayAssociation) {
        setCustomerGatewayAssociation(customerGatewayAssociation);
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
        if (getCustomerGatewayAssociation() != null)
            sb.append("CustomerGatewayAssociation: ").append(getCustomerGatewayAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateCustomerGatewayResult == false)
            return false;
        AssociateCustomerGatewayResult other = (AssociateCustomerGatewayResult) obj;
        if (other.getCustomerGatewayAssociation() == null ^ this.getCustomerGatewayAssociation() == null)
            return false;
        if (other.getCustomerGatewayAssociation() != null && other.getCustomerGatewayAssociation().equals(this.getCustomerGatewayAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerGatewayAssociation() == null) ? 0 : getCustomerGatewayAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateCustomerGatewayResult clone() {
        try {
            return (AssociateCustomerGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
