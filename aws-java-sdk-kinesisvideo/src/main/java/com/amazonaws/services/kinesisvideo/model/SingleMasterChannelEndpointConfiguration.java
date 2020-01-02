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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/SingleMasterChannelEndpointConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SingleMasterChannelEndpointConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code> signaling
     * channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If <code>HTTPS</code> is
     * specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     */
    private java.util.List<String> protocols;
    /**
     * <p>
     * This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling channel. If
     * <code>MASTER</code> is specified, this API returns an endpoint that a client can use to receive offers from and
     * send answers to any of the viewers on this signaling channel. If <code>VIEWER</code> is specified, this API
     * returns an endpoint that a client can use only to send offers to another <code>MASTER</code> client on this
     * signaling channel.
     * </p>
     */
    private String role;

    /**
     * <p>
     * This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code> signaling
     * channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If <code>HTTPS</code> is
     * specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     * 
     * @return This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code>
     *         signaling channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If
     *         <code>HTTPS</code> is specified, this API returns an <code>HTTPS</code> endpoint.
     * @see ChannelProtocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code> signaling
     * channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If <code>HTTPS</code> is
     * specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     * 
     * @param protocols
     *        This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code>
     *        signaling channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If
     *        <code>HTTPS</code> is specified, this API returns an <code>HTTPS</code> endpoint.
     * @see ChannelProtocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code> signaling
     * channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If <code>HTTPS</code> is
     * specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code>
     *        signaling channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If
     *        <code>HTTPS</code> is specified, this API returns an <code>HTTPS</code> endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelProtocol
     */

    public SingleMasterChannelEndpointConfiguration withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code> signaling
     * channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If <code>HTTPS</code> is
     * specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     * 
     * @param protocols
     *        This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code>
     *        signaling channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If
     *        <code>HTTPS</code> is specified, this API returns an <code>HTTPS</code> endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelProtocol
     */

    public SingleMasterChannelEndpointConfiguration withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code> signaling
     * channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If <code>HTTPS</code> is
     * specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     * 
     * @param protocols
     *        This property is used to determine the nature of communication over this <code>SINGLE_MASTER</code>
     *        signaling channel. If <code>WSS</code> is specified, this API returns a websocket endpoint. If
     *        <code>HTTPS</code> is specified, this API returns an <code>HTTPS</code> endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelProtocol
     */

    public SingleMasterChannelEndpointConfiguration withProtocols(ChannelProtocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (ChannelProtocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
        return this;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling channel. If
     * <code>MASTER</code> is specified, this API returns an endpoint that a client can use to receive offers from and
     * send answers to any of the viewers on this signaling channel. If <code>VIEWER</code> is specified, this API
     * returns an endpoint that a client can use only to send offers to another <code>MASTER</code> client on this
     * signaling channel.
     * </p>
     * 
     * @param role
     *        This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling
     *        channel. If <code>MASTER</code> is specified, this API returns an endpoint that a client can use to
     *        receive offers from and send answers to any of the viewers on this signaling channel. If
     *        <code>VIEWER</code> is specified, this API returns an endpoint that a client can use only to send offers
     *        to another <code>MASTER</code> client on this signaling channel.
     * @see ChannelRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling channel. If
     * <code>MASTER</code> is specified, this API returns an endpoint that a client can use to receive offers from and
     * send answers to any of the viewers on this signaling channel. If <code>VIEWER</code> is specified, this API
     * returns an endpoint that a client can use only to send offers to another <code>MASTER</code> client on this
     * signaling channel.
     * </p>
     * 
     * @return This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling
     *         channel. If <code>MASTER</code> is specified, this API returns an endpoint that a client can use to
     *         receive offers from and send answers to any of the viewers on this signaling channel. If
     *         <code>VIEWER</code> is specified, this API returns an endpoint that a client can use only to send offers
     *         to another <code>MASTER</code> client on this signaling channel.
     * @see ChannelRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling channel. If
     * <code>MASTER</code> is specified, this API returns an endpoint that a client can use to receive offers from and
     * send answers to any of the viewers on this signaling channel. If <code>VIEWER</code> is specified, this API
     * returns an endpoint that a client can use only to send offers to another <code>MASTER</code> client on this
     * signaling channel.
     * </p>
     * 
     * @param role
     *        This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling
     *        channel. If <code>MASTER</code> is specified, this API returns an endpoint that a client can use to
     *        receive offers from and send answers to any of the viewers on this signaling channel. If
     *        <code>VIEWER</code> is specified, this API returns an endpoint that a client can use only to send offers
     *        to another <code>MASTER</code> client on this signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelRole
     */

    public SingleMasterChannelEndpointConfiguration withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling channel. If
     * <code>MASTER</code> is specified, this API returns an endpoint that a client can use to receive offers from and
     * send answers to any of the viewers on this signaling channel. If <code>VIEWER</code> is specified, this API
     * returns an endpoint that a client can use only to send offers to another <code>MASTER</code> client on this
     * signaling channel.
     * </p>
     * 
     * @param role
     *        This property is used to determine messaging permissions in this <code>SINGLE_MASTER</code> signaling
     *        channel. If <code>MASTER</code> is specified, this API returns an endpoint that a client can use to
     *        receive offers from and send answers to any of the viewers on this signaling channel. If
     *        <code>VIEWER</code> is specified, this API returns an endpoint that a client can use only to send offers
     *        to another <code>MASTER</code> client on this signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelRole
     */

    public SingleMasterChannelEndpointConfiguration withRole(ChannelRole role) {
        this.role = role.toString();
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
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleMasterChannelEndpointConfiguration == false)
            return false;
        SingleMasterChannelEndpointConfiguration other = (SingleMasterChannelEndpointConfiguration) obj;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public SingleMasterChannelEndpointConfiguration clone() {
        try {
            return (SingleMasterChannelEndpointConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.SingleMasterChannelEndpointConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
