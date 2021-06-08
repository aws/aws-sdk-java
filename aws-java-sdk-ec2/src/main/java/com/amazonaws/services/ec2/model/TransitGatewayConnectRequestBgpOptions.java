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

/**
 * <p>
 * The BGP options for the Connect attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayConnectRequestBgpOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConnectRequestBgpOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     */
    private Long peerAsn;

    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     * 
     * @param peerAsn
     *        The peer Autonomous System Number (ASN).
     */

    public void setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
    }

    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     * 
     * @return The peer Autonomous System Number (ASN).
     */

    public Long getPeerAsn() {
        return this.peerAsn;
    }

    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     * 
     * @param peerAsn
     *        The peer Autonomous System Number (ASN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectRequestBgpOptions withPeerAsn(Long peerAsn) {
        setPeerAsn(peerAsn);
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
        if (getPeerAsn() != null)
            sb.append("PeerAsn: ").append(getPeerAsn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayConnectRequestBgpOptions == false)
            return false;
        TransitGatewayConnectRequestBgpOptions other = (TransitGatewayConnectRequestBgpOptions) obj;
        if (other.getPeerAsn() == null ^ this.getPeerAsn() == null)
            return false;
        if (other.getPeerAsn() != null && other.getPeerAsn().equals(this.getPeerAsn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeerAsn() == null) ? 0 : getPeerAsn().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayConnectRequestBgpOptions clone() {
        try {
            return (TransitGatewayConnectRequestBgpOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
