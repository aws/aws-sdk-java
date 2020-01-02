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
public class DeleteTransitGatewayMulticastDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the deleted transit gateway multicast domain.
     * </p>
     */
    private TransitGatewayMulticastDomain transitGatewayMulticastDomain;

    /**
     * <p>
     * Information about the deleted transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomain
     *        Information about the deleted transit gateway multicast domain.
     */

    public void setTransitGatewayMulticastDomain(TransitGatewayMulticastDomain transitGatewayMulticastDomain) {
        this.transitGatewayMulticastDomain = transitGatewayMulticastDomain;
    }

    /**
     * <p>
     * Information about the deleted transit gateway multicast domain.
     * </p>
     * 
     * @return Information about the deleted transit gateway multicast domain.
     */

    public TransitGatewayMulticastDomain getTransitGatewayMulticastDomain() {
        return this.transitGatewayMulticastDomain;
    }

    /**
     * <p>
     * Information about the deleted transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomain
     *        Information about the deleted transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTransitGatewayMulticastDomainResult withTransitGatewayMulticastDomain(TransitGatewayMulticastDomain transitGatewayMulticastDomain) {
        setTransitGatewayMulticastDomain(transitGatewayMulticastDomain);
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
        if (getTransitGatewayMulticastDomain() != null)
            sb.append("TransitGatewayMulticastDomain: ").append(getTransitGatewayMulticastDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTransitGatewayMulticastDomainResult == false)
            return false;
        DeleteTransitGatewayMulticastDomainResult other = (DeleteTransitGatewayMulticastDomainResult) obj;
        if (other.getTransitGatewayMulticastDomain() == null ^ this.getTransitGatewayMulticastDomain() == null)
            return false;
        if (other.getTransitGatewayMulticastDomain() != null
                && other.getTransitGatewayMulticastDomain().equals(this.getTransitGatewayMulticastDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomain() == null) ? 0 : getTransitGatewayMulticastDomain().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTransitGatewayMulticastDomainResult clone() {
        try {
            return (DeleteTransitGatewayMulticastDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
