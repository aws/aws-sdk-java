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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The transport parameters that are associated with an outbound media stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** The IP address where contents of the media stream will be sent. */
    private String destinationIp;
    /** The port to use when the content of the media stream is distributed to the output. */
    private Integer destinationPort;
    /** The VPC interface that is used for the media stream associated with the output. */
    private Interface interfaceValue;
    /**
     * The IP address that the receiver requires in order to establish a connection with the flow. This value is
     * represented by the elastic network interface IP address of the VPC. This field applies only to outputs that use
     * the CDI or ST 2110 JPEG XS protocol.
     */
    private String outboundIp;

    /**
     * The IP address where contents of the media stream will be sent.
     * 
     * @param destinationIp
     *        The IP address where contents of the media stream will be sent.
     */

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    /**
     * The IP address where contents of the media stream will be sent.
     * 
     * @return The IP address where contents of the media stream will be sent.
     */

    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * The IP address where contents of the media stream will be sent.
     * 
     * @param destinationIp
     *        The IP address where contents of the media stream will be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withDestinationIp(String destinationIp) {
        setDestinationIp(destinationIp);
        return this;
    }

    /**
     * The port to use when the content of the media stream is distributed to the output.
     * 
     * @param destinationPort
     *        The port to use when the content of the media stream is distributed to the output.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * The port to use when the content of the media stream is distributed to the output.
     * 
     * @return The port to use when the content of the media stream is distributed to the output.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * The port to use when the content of the media stream is distributed to the output.
     * 
     * @param destinationPort
     *        The port to use when the content of the media stream is distributed to the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * The VPC interface that is used for the media stream associated with the output.
     * 
     * @param interfaceValue
     *        The VPC interface that is used for the media stream associated with the output.
     */

    public void setInterface(Interface interfaceValue) {
        this.interfaceValue = interfaceValue;
    }

    /**
     * The VPC interface that is used for the media stream associated with the output.
     * 
     * @return The VPC interface that is used for the media stream associated with the output.
     */

    public Interface getInterface() {
        return this.interfaceValue;
    }

    /**
     * The VPC interface that is used for the media stream associated with the output.
     * 
     * @param interfaceValue
     *        The VPC interface that is used for the media stream associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withInterface(Interface interfaceValue) {
        setInterface(interfaceValue);
        return this;
    }

    /**
     * The IP address that the receiver requires in order to establish a connection with the flow. This value is
     * represented by the elastic network interface IP address of the VPC. This field applies only to outputs that use
     * the CDI or ST 2110 JPEG XS protocol.
     * 
     * @param outboundIp
     *        The IP address that the receiver requires in order to establish a connection with the flow. This value is
     *        represented by the elastic network interface IP address of the VPC. This field applies only to outputs
     *        that use the CDI or ST 2110 JPEG XS protocol.
     */

    public void setOutboundIp(String outboundIp) {
        this.outboundIp = outboundIp;
    }

    /**
     * The IP address that the receiver requires in order to establish a connection with the flow. This value is
     * represented by the elastic network interface IP address of the VPC. This field applies only to outputs that use
     * the CDI or ST 2110 JPEG XS protocol.
     * 
     * @return The IP address that the receiver requires in order to establish a connection with the flow. This value is
     *         represented by the elastic network interface IP address of the VPC. This field applies only to outputs
     *         that use the CDI or ST 2110 JPEG XS protocol.
     */

    public String getOutboundIp() {
        return this.outboundIp;
    }

    /**
     * The IP address that the receiver requires in order to establish a connection with the flow. This value is
     * represented by the elastic network interface IP address of the VPC. This field applies only to outputs that use
     * the CDI or ST 2110 JPEG XS protocol.
     * 
     * @param outboundIp
     *        The IP address that the receiver requires in order to establish a connection with the flow. This value is
     *        represented by the elastic network interface IP address of the VPC. This field applies only to outputs
     *        that use the CDI or ST 2110 JPEG XS protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withOutboundIp(String outboundIp) {
        setOutboundIp(outboundIp);
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
        if (getDestinationIp() != null)
            sb.append("DestinationIp: ").append(getDestinationIp()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
        if (getInterface() != null)
            sb.append("Interface: ").append(getInterface()).append(",");
        if (getOutboundIp() != null)
            sb.append("OutboundIp: ").append(getOutboundIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationConfiguration == false)
            return false;
        DestinationConfiguration other = (DestinationConfiguration) obj;
        if (other.getDestinationIp() == null ^ this.getDestinationIp() == null)
            return false;
        if (other.getDestinationIp() != null && other.getDestinationIp().equals(this.getDestinationIp()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        if (other.getInterface() == null ^ this.getInterface() == null)
            return false;
        if (other.getInterface() != null && other.getInterface().equals(this.getInterface()) == false)
            return false;
        if (other.getOutboundIp() == null ^ this.getOutboundIp() == null)
            return false;
        if (other.getOutboundIp() != null && other.getOutboundIp().equals(this.getOutboundIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationIp() == null) ? 0 : getDestinationIp().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getInterface() == null) ? 0 : getInterface().hashCode());
        hashCode = prime * hashCode + ((getOutboundIp() == null) ? 0 : getOutboundIp().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConfiguration clone() {
        try {
            return (DestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.DestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
