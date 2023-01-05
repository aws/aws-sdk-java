/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a core network BGP configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ConnectPeerBgpConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectPeerBgpConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ASN of the Coret Network.
     * </p>
     */
    private Long coreNetworkAsn;
    /**
     * <p>
     * The ASN of the Connect peer.
     * </p>
     */
    private Long peerAsn;
    /**
     * <p>
     * The address of a core network.
     * </p>
     */
    private String coreNetworkAddress;
    /**
     * <p>
     * The address of a core network Connect peer.
     * </p>
     */
    private String peerAddress;

    /**
     * <p>
     * The ASN of the Coret Network.
     * </p>
     * 
     * @param coreNetworkAsn
     *        The ASN of the Coret Network.
     */

    public void setCoreNetworkAsn(Long coreNetworkAsn) {
        this.coreNetworkAsn = coreNetworkAsn;
    }

    /**
     * <p>
     * The ASN of the Coret Network.
     * </p>
     * 
     * @return The ASN of the Coret Network.
     */

    public Long getCoreNetworkAsn() {
        return this.coreNetworkAsn;
    }

    /**
     * <p>
     * The ASN of the Coret Network.
     * </p>
     * 
     * @param coreNetworkAsn
     *        The ASN of the Coret Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerBgpConfiguration withCoreNetworkAsn(Long coreNetworkAsn) {
        setCoreNetworkAsn(coreNetworkAsn);
        return this;
    }

    /**
     * <p>
     * The ASN of the Connect peer.
     * </p>
     * 
     * @param peerAsn
     *        The ASN of the Connect peer.
     */

    public void setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
    }

    /**
     * <p>
     * The ASN of the Connect peer.
     * </p>
     * 
     * @return The ASN of the Connect peer.
     */

    public Long getPeerAsn() {
        return this.peerAsn;
    }

    /**
     * <p>
     * The ASN of the Connect peer.
     * </p>
     * 
     * @param peerAsn
     *        The ASN of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerBgpConfiguration withPeerAsn(Long peerAsn) {
        setPeerAsn(peerAsn);
        return this;
    }

    /**
     * <p>
     * The address of a core network.
     * </p>
     * 
     * @param coreNetworkAddress
     *        The address of a core network.
     */

    public void setCoreNetworkAddress(String coreNetworkAddress) {
        this.coreNetworkAddress = coreNetworkAddress;
    }

    /**
     * <p>
     * The address of a core network.
     * </p>
     * 
     * @return The address of a core network.
     */

    public String getCoreNetworkAddress() {
        return this.coreNetworkAddress;
    }

    /**
     * <p>
     * The address of a core network.
     * </p>
     * 
     * @param coreNetworkAddress
     *        The address of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerBgpConfiguration withCoreNetworkAddress(String coreNetworkAddress) {
        setCoreNetworkAddress(coreNetworkAddress);
        return this;
    }

    /**
     * <p>
     * The address of a core network Connect peer.
     * </p>
     * 
     * @param peerAddress
     *        The address of a core network Connect peer.
     */

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The address of a core network Connect peer.
     * </p>
     * 
     * @return The address of a core network Connect peer.
     */

    public String getPeerAddress() {
        return this.peerAddress;
    }

    /**
     * <p>
     * The address of a core network Connect peer.
     * </p>
     * 
     * @param peerAddress
     *        The address of a core network Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerBgpConfiguration withPeerAddress(String peerAddress) {
        setPeerAddress(peerAddress);
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
        if (getCoreNetworkAsn() != null)
            sb.append("CoreNetworkAsn: ").append(getCoreNetworkAsn()).append(",");
        if (getPeerAsn() != null)
            sb.append("PeerAsn: ").append(getPeerAsn()).append(",");
        if (getCoreNetworkAddress() != null)
            sb.append("CoreNetworkAddress: ").append(getCoreNetworkAddress()).append(",");
        if (getPeerAddress() != null)
            sb.append("PeerAddress: ").append(getPeerAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectPeerBgpConfiguration == false)
            return false;
        ConnectPeerBgpConfiguration other = (ConnectPeerBgpConfiguration) obj;
        if (other.getCoreNetworkAsn() == null ^ this.getCoreNetworkAsn() == null)
            return false;
        if (other.getCoreNetworkAsn() != null && other.getCoreNetworkAsn().equals(this.getCoreNetworkAsn()) == false)
            return false;
        if (other.getPeerAsn() == null ^ this.getPeerAsn() == null)
            return false;
        if (other.getPeerAsn() != null && other.getPeerAsn().equals(this.getPeerAsn()) == false)
            return false;
        if (other.getCoreNetworkAddress() == null ^ this.getCoreNetworkAddress() == null)
            return false;
        if (other.getCoreNetworkAddress() != null && other.getCoreNetworkAddress().equals(this.getCoreNetworkAddress()) == false)
            return false;
        if (other.getPeerAddress() == null ^ this.getPeerAddress() == null)
            return false;
        if (other.getPeerAddress() != null && other.getPeerAddress().equals(this.getPeerAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkAsn() == null) ? 0 : getCoreNetworkAsn().hashCode());
        hashCode = prime * hashCode + ((getPeerAsn() == null) ? 0 : getPeerAsn().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkAddress() == null) ? 0 : getCoreNetworkAddress().hashCode());
        hashCode = prime * hashCode + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        return hashCode;
    }

    @Override
    public ConnectPeerBgpConfiguration clone() {
        try {
            return (ConnectPeerBgpConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ConnectPeerBgpConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
