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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RegisterTransitGateway"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTransitGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the transit gateway registration.
     * </p>
     */
    private TransitGatewayRegistration transitGatewayRegistration;

    /**
     * <p>
     * Information about the transit gateway registration.
     * </p>
     * 
     * @param transitGatewayRegistration
     *        Information about the transit gateway registration.
     */

    public void setTransitGatewayRegistration(TransitGatewayRegistration transitGatewayRegistration) {
        this.transitGatewayRegistration = transitGatewayRegistration;
    }

    /**
     * <p>
     * Information about the transit gateway registration.
     * </p>
     * 
     * @return Information about the transit gateway registration.
     */

    public TransitGatewayRegistration getTransitGatewayRegistration() {
        return this.transitGatewayRegistration;
    }

    /**
     * <p>
     * Information about the transit gateway registration.
     * </p>
     * 
     * @param transitGatewayRegistration
     *        Information about the transit gateway registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTransitGatewayResult withTransitGatewayRegistration(TransitGatewayRegistration transitGatewayRegistration) {
        setTransitGatewayRegistration(transitGatewayRegistration);
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
        if (getTransitGatewayRegistration() != null)
            sb.append("TransitGatewayRegistration: ").append(getTransitGatewayRegistration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTransitGatewayResult == false)
            return false;
        RegisterTransitGatewayResult other = (RegisterTransitGatewayResult) obj;
        if (other.getTransitGatewayRegistration() == null ^ this.getTransitGatewayRegistration() == null)
            return false;
        if (other.getTransitGatewayRegistration() != null && other.getTransitGatewayRegistration().equals(this.getTransitGatewayRegistration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayRegistration() == null) ? 0 : getTransitGatewayRegistration().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTransitGatewayResult clone() {
        try {
            return (RegisterTransitGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
