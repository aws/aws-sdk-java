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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDirectConnectGatewayAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The association to be created.
     * </p>
     */
    private DirectConnectGatewayAssociation directConnectGatewayAssociation;

    /**
     * <p>
     * The association to be created.
     * </p>
     * 
     * @param directConnectGatewayAssociation
     *        The association to be created.
     */

    public void setDirectConnectGatewayAssociation(DirectConnectGatewayAssociation directConnectGatewayAssociation) {
        this.directConnectGatewayAssociation = directConnectGatewayAssociation;
    }

    /**
     * <p>
     * The association to be created.
     * </p>
     * 
     * @return The association to be created.
     */

    public DirectConnectGatewayAssociation getDirectConnectGatewayAssociation() {
        return this.directConnectGatewayAssociation;
    }

    /**
     * <p>
     * The association to be created.
     * </p>
     * 
     * @param directConnectGatewayAssociation
     *        The association to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayAssociationResult withDirectConnectGatewayAssociation(DirectConnectGatewayAssociation directConnectGatewayAssociation) {
        setDirectConnectGatewayAssociation(directConnectGatewayAssociation);
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
        if (getDirectConnectGatewayAssociation() != null)
            sb.append("DirectConnectGatewayAssociation: ").append(getDirectConnectGatewayAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectConnectGatewayAssociationResult == false)
            return false;
        CreateDirectConnectGatewayAssociationResult other = (CreateDirectConnectGatewayAssociationResult) obj;
        if (other.getDirectConnectGatewayAssociation() == null ^ this.getDirectConnectGatewayAssociation() == null)
            return false;
        if (other.getDirectConnectGatewayAssociation() != null
                && other.getDirectConnectGatewayAssociation().equals(this.getDirectConnectGatewayAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayAssociation() == null) ? 0 : getDirectConnectGatewayAssociation().hashCode());
        return hashCode;
    }

    @Override
    public CreateDirectConnectGatewayAssociationResult clone() {
        try {
            return (CreateDirectConnectGatewayAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
