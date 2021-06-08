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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateTransitGatewayConnectPeer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateTransitGatewayConnectPeerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The transit gateway Connect peer association.
     * </p>
     */
    private TransitGatewayConnectPeerAssociation transitGatewayConnectPeerAssociation;

    /**
     * <p>
     * The transit gateway Connect peer association.
     * </p>
     * 
     * @param transitGatewayConnectPeerAssociation
     *        The transit gateway Connect peer association.
     */

    public void setTransitGatewayConnectPeerAssociation(TransitGatewayConnectPeerAssociation transitGatewayConnectPeerAssociation) {
        this.transitGatewayConnectPeerAssociation = transitGatewayConnectPeerAssociation;
    }

    /**
     * <p>
     * The transit gateway Connect peer association.
     * </p>
     * 
     * @return The transit gateway Connect peer association.
     */

    public TransitGatewayConnectPeerAssociation getTransitGatewayConnectPeerAssociation() {
        return this.transitGatewayConnectPeerAssociation;
    }

    /**
     * <p>
     * The transit gateway Connect peer association.
     * </p>
     * 
     * @param transitGatewayConnectPeerAssociation
     *        The transit gateway Connect peer association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTransitGatewayConnectPeerResult withTransitGatewayConnectPeerAssociation(
            TransitGatewayConnectPeerAssociation transitGatewayConnectPeerAssociation) {
        setTransitGatewayConnectPeerAssociation(transitGatewayConnectPeerAssociation);
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
        if (getTransitGatewayConnectPeerAssociation() != null)
            sb.append("TransitGatewayConnectPeerAssociation: ").append(getTransitGatewayConnectPeerAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTransitGatewayConnectPeerResult == false)
            return false;
        AssociateTransitGatewayConnectPeerResult other = (AssociateTransitGatewayConnectPeerResult) obj;
        if (other.getTransitGatewayConnectPeerAssociation() == null ^ this.getTransitGatewayConnectPeerAssociation() == null)
            return false;
        if (other.getTransitGatewayConnectPeerAssociation() != null
                && other.getTransitGatewayConnectPeerAssociation().equals(this.getTransitGatewayConnectPeerAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayConnectPeerAssociation() == null) ? 0 : getTransitGatewayConnectPeerAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateTransitGatewayConnectPeerResult clone() {
        try {
            return (AssociateTransitGatewayConnectPeerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
