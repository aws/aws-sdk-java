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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCarrierGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the carrier gateway.
     * </p>
     */
    private CarrierGateway carrierGateway;

    /**
     * <p>
     * Information about the carrier gateway.
     * </p>
     * 
     * @param carrierGateway
     *        Information about the carrier gateway.
     */

    public void setCarrierGateway(CarrierGateway carrierGateway) {
        this.carrierGateway = carrierGateway;
    }

    /**
     * <p>
     * Information about the carrier gateway.
     * </p>
     * 
     * @return Information about the carrier gateway.
     */

    public CarrierGateway getCarrierGateway() {
        return this.carrierGateway;
    }

    /**
     * <p>
     * Information about the carrier gateway.
     * </p>
     * 
     * @param carrierGateway
     *        Information about the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCarrierGatewayResult withCarrierGateway(CarrierGateway carrierGateway) {
        setCarrierGateway(carrierGateway);
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
        if (getCarrierGateway() != null)
            sb.append("CarrierGateway: ").append(getCarrierGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCarrierGatewayResult == false)
            return false;
        DeleteCarrierGatewayResult other = (DeleteCarrierGatewayResult) obj;
        if (other.getCarrierGateway() == null ^ this.getCarrierGateway() == null)
            return false;
        if (other.getCarrierGateway() != null && other.getCarrierGateway().equals(this.getCarrierGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCarrierGateway() == null) ? 0 : getCarrierGateway().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCarrierGatewayResult clone() {
        try {
            return (DeleteCarrierGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
