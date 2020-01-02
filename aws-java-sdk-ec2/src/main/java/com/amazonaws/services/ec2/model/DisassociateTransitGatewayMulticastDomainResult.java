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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateTransitGatewayMulticastDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the association.
     * </p>
     */
    private TransitGatewayMulticastDomainAssociations associations;

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param associations
     *        Information about the association.
     */

    public void setAssociations(TransitGatewayMulticastDomainAssociations associations) {
        this.associations = associations;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @return Information about the association.
     */

    public TransitGatewayMulticastDomainAssociations getAssociations() {
        return this.associations;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param associations
     *        Information about the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTransitGatewayMulticastDomainResult withAssociations(TransitGatewayMulticastDomainAssociations associations) {
        setAssociations(associations);
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
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateTransitGatewayMulticastDomainResult == false)
            return false;
        DisassociateTransitGatewayMulticastDomainResult other = (DisassociateTransitGatewayMulticastDomainResult) obj;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateTransitGatewayMulticastDomainResult clone() {
        try {
            return (DisassociateTransitGatewayMulticastDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
