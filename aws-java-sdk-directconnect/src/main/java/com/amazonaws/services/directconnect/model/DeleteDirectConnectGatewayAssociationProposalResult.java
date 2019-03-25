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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociationProposal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDirectConnectGatewayAssociationProposalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal;

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param directConnectGatewayAssociationProposal
     *        The ID of the virtual private gateway.
     */

    public void setDirectConnectGatewayAssociationProposal(DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal) {
        this.directConnectGatewayAssociationProposal = directConnectGatewayAssociationProposal;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public DirectConnectGatewayAssociationProposal getDirectConnectGatewayAssociationProposal() {
        return this.directConnectGatewayAssociationProposal;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param directConnectGatewayAssociationProposal
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDirectConnectGatewayAssociationProposalResult withDirectConnectGatewayAssociationProposal(
            DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal) {
        setDirectConnectGatewayAssociationProposal(directConnectGatewayAssociationProposal);
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
        if (getDirectConnectGatewayAssociationProposal() != null)
            sb.append("DirectConnectGatewayAssociationProposal: ").append(getDirectConnectGatewayAssociationProposal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDirectConnectGatewayAssociationProposalResult == false)
            return false;
        DeleteDirectConnectGatewayAssociationProposalResult other = (DeleteDirectConnectGatewayAssociationProposalResult) obj;
        if (other.getDirectConnectGatewayAssociationProposal() == null ^ this.getDirectConnectGatewayAssociationProposal() == null)
            return false;
        if (other.getDirectConnectGatewayAssociationProposal() != null
                && other.getDirectConnectGatewayAssociationProposal().equals(this.getDirectConnectGatewayAssociationProposal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayAssociationProposal() == null) ? 0 : getDirectConnectGatewayAssociationProposal().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDirectConnectGatewayAssociationProposalResult clone() {
        try {
            return (DeleteDirectConnectGatewayAssociationProposalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
