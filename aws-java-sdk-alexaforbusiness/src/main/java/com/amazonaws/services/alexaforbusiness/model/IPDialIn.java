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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The IP endpoint and protocol for calling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/IPDialIn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IPDialIn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     */
    private String commsProtocol;

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param endpoint
     *        The IP address.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param endpoint
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPDialIn withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * 
     * @param commsProtocol
     *        The protocol, including SIP, SIPS, and H323.
     * @see CommsProtocol
     */

    public void setCommsProtocol(String commsProtocol) {
        this.commsProtocol = commsProtocol;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * 
     * @return The protocol, including SIP, SIPS, and H323.
     * @see CommsProtocol
     */

    public String getCommsProtocol() {
        return this.commsProtocol;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * 
     * @param commsProtocol
     *        The protocol, including SIP, SIPS, and H323.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommsProtocol
     */

    public IPDialIn withCommsProtocol(String commsProtocol) {
        setCommsProtocol(commsProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * 
     * @param commsProtocol
     *        The protocol, including SIP, SIPS, and H323.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommsProtocol
     */

    public IPDialIn withCommsProtocol(CommsProtocol commsProtocol) {
        this.commsProtocol = commsProtocol.toString();
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getCommsProtocol() != null)
            sb.append("CommsProtocol: ").append(getCommsProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPDialIn == false)
            return false;
        IPDialIn other = (IPDialIn) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getCommsProtocol() == null ^ this.getCommsProtocol() == null)
            return false;
        if (other.getCommsProtocol() != null && other.getCommsProtocol().equals(this.getCommsProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCommsProtocol() == null) ? 0 : getCommsProtocol().hashCode());
        return hashCode;
    }

    @Override
    public IPDialIn clone() {
        try {
            return (IPDialIn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.IPDialInMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
