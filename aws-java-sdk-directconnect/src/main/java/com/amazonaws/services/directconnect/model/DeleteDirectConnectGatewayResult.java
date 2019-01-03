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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGateway"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDirectConnectGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     */
    private DirectConnectGateway directConnectGateway;

    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGateway
     *        The Direct Connect gateway.
     */

    public void setDirectConnectGateway(DirectConnectGateway directConnectGateway) {
        this.directConnectGateway = directConnectGateway;
    }

    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     * 
     * @return The Direct Connect gateway.
     */

    public DirectConnectGateway getDirectConnectGateway() {
        return this.directConnectGateway;
    }

    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGateway
     *        The Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDirectConnectGatewayResult withDirectConnectGateway(DirectConnectGateway directConnectGateway) {
        setDirectConnectGateway(directConnectGateway);
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
        if (getDirectConnectGateway() != null)
            sb.append("DirectConnectGateway: ").append(getDirectConnectGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDirectConnectGatewayResult == false)
            return false;
        DeleteDirectConnectGatewayResult other = (DeleteDirectConnectGatewayResult) obj;
        if (other.getDirectConnectGateway() == null ^ this.getDirectConnectGateway() == null)
            return false;
        if (other.getDirectConnectGateway() != null && other.getDirectConnectGateway().equals(this.getDirectConnectGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGateway() == null) ? 0 : getDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDirectConnectGatewayResult clone() {
        try {
            return (DeleteDirectConnectGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
