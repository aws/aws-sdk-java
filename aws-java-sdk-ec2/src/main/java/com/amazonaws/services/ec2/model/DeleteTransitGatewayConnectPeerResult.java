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
public class DeleteTransitGatewayConnectPeerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     */
    private TransitGatewayConnectPeer transitGatewayConnectPeer;

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeer
     *        Information about the deleted Connect peer.
     */

    public void setTransitGatewayConnectPeer(TransitGatewayConnectPeer transitGatewayConnectPeer) {
        this.transitGatewayConnectPeer = transitGatewayConnectPeer;
    }

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     * 
     * @return Information about the deleted Connect peer.
     */

    public TransitGatewayConnectPeer getTransitGatewayConnectPeer() {
        return this.transitGatewayConnectPeer;
    }

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeer
     *        Information about the deleted Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTransitGatewayConnectPeerResult withTransitGatewayConnectPeer(TransitGatewayConnectPeer transitGatewayConnectPeer) {
        setTransitGatewayConnectPeer(transitGatewayConnectPeer);
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
        if (getTransitGatewayConnectPeer() != null)
            sb.append("TransitGatewayConnectPeer: ").append(getTransitGatewayConnectPeer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTransitGatewayConnectPeerResult == false)
            return false;
        DeleteTransitGatewayConnectPeerResult other = (DeleteTransitGatewayConnectPeerResult) obj;
        if (other.getTransitGatewayConnectPeer() == null ^ this.getTransitGatewayConnectPeer() == null)
            return false;
        if (other.getTransitGatewayConnectPeer() != null && other.getTransitGatewayConnectPeer().equals(this.getTransitGatewayConnectPeer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayConnectPeer() == null) ? 0 : getTransitGatewayConnectPeer().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTransitGatewayConnectPeerResult clone() {
        try {
            return (DeleteTransitGatewayConnectPeerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
