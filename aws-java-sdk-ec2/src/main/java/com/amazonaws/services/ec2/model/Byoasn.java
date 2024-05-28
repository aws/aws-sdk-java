/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Autonomous System Number (ASN) and BYOIP CIDR association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Byoasn" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Byoasn implements Serializable, Cloneable {

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     */
    private String asn;
    /**
     * <p>
     * An IPAM ID.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The provisioning state of the BYOASN.
     * </p>
     */
    private String state;

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     * 
     * @param asn
     *        A public 2-byte or 4-byte ASN.
     */

    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     * 
     * @return A public 2-byte or 4-byte ASN.
     */

    public String getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     * 
     * @param asn
     *        A public 2-byte or 4-byte ASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Byoasn withAsn(String asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        An IPAM ID.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @return An IPAM ID.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        An IPAM ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Byoasn withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Byoasn withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The provisioning state of the BYOASN.
     * </p>
     * 
     * @param state
     *        The provisioning state of the BYOASN.
     * @see AsnState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The provisioning state of the BYOASN.
     * </p>
     * 
     * @return The provisioning state of the BYOASN.
     * @see AsnState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The provisioning state of the BYOASN.
     * </p>
     * 
     * @param state
     *        The provisioning state of the BYOASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AsnState
     */

    public Byoasn withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The provisioning state of the BYOASN.
     * </p>
     * 
     * @param state
     *        The provisioning state of the BYOASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AsnState
     */

    public Byoasn withState(AsnState state) {
        this.state = state.toString();
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
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Byoasn == false)
            return false;
        Byoasn other = (Byoasn) obj;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Byoasn clone() {
        try {
            return (Byoasn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
