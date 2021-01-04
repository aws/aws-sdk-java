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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the ports and associated IP addresses and ports of Amazon EC2 instances in your virtual private cloud (VPC)
 * subnets. Custom routing is a port mapping protocol in AWS Global Accelerator that statically associates port ranges
 * with VPC subnets, which allows Global Accelerator to route to specific instances and ports within one or more
 * subnets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/PortMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The accelerator port.
     * </p>
     */
    private Integer acceleratorPort;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     */
    private String endpointGroupArn;
    /**
     * <p>
     * The IP address of the VPC subnet (the subnet ID).
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
     * </p>
     */
    private SocketAddress destinationSocketAddress;
    /**
     * <p>
     * The protocols supported by the endpoint group.
     * </p>
     */
    private java.util.List<String> protocols;
    /**
     * <p>
     * Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if traffic is
     * allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * </p>
     */
    private String destinationTrafficState;

    /**
     * <p>
     * The accelerator port.
     * </p>
     * 
     * @param acceleratorPort
     *        The accelerator port.
     */

    public void setAcceleratorPort(Integer acceleratorPort) {
        this.acceleratorPort = acceleratorPort;
    }

    /**
     * <p>
     * The accelerator port.
     * </p>
     * 
     * @return The accelerator port.
     */

    public Integer getAcceleratorPort() {
        return this.acceleratorPort;
    }

    /**
     * <p>
     * The accelerator port.
     * </p>
     * 
     * @param acceleratorPort
     *        The accelerator port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withAcceleratorPort(Integer acceleratorPort) {
        setAcceleratorPort(acceleratorPort);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     */

    public void setEndpointGroupArn(String endpointGroupArn) {
        this.endpointGroupArn = endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint group.
     */

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withEndpointGroupArn(String endpointGroupArn) {
        setEndpointGroupArn(endpointGroupArn);
        return this;
    }

    /**
     * <p>
     * The IP address of the VPC subnet (the subnet ID).
     * </p>
     * 
     * @param endpointId
     *        The IP address of the VPC subnet (the subnet ID).
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The IP address of the VPC subnet (the subnet ID).
     * </p>
     * 
     * @return The IP address of the VPC subnet (the subnet ID).
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The IP address of the VPC subnet (the subnet ID).
     * </p>
     * 
     * @param endpointId
     *        The IP address of the VPC subnet (the subnet ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @param destinationSocketAddress
     *        The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
     */

    public void setDestinationSocketAddress(SocketAddress destinationSocketAddress) {
        this.destinationSocketAddress = destinationSocketAddress;
    }

    /**
     * <p>
     * The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @return The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
     */

    public SocketAddress getDestinationSocketAddress() {
        return this.destinationSocketAddress;
    }

    /**
     * <p>
     * The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @param destinationSocketAddress
     *        The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withDestinationSocketAddress(SocketAddress destinationSocketAddress) {
        setDestinationSocketAddress(destinationSocketAddress);
        return this;
    }

    /**
     * <p>
     * The protocols supported by the endpoint group.
     * </p>
     * 
     * @return The protocols supported by the endpoint group.
     * @see CustomRoutingProtocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols supported by the endpoint group.
     * </p>
     * 
     * @param protocols
     *        The protocols supported by the endpoint group.
     * @see CustomRoutingProtocol
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
     * The protocols supported by the endpoint group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols supported by the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingProtocol
     */

    public PortMapping withProtocols(String... protocols) {
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
     * The protocols supported by the endpoint group.
     * </p>
     * 
     * @param protocols
     *        The protocols supported by the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingProtocol
     */

    public PortMapping withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The protocols supported by the endpoint group.
     * </p>
     * 
     * @param protocols
     *        The protocols supported by the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingProtocol
     */

    public PortMapping withProtocols(CustomRoutingProtocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (CustomRoutingProtocol value : protocols) {
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
     * Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if traffic is
     * allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * </p>
     * 
     * @param destinationTrafficState
     *        Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if
     *        traffic is allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * @see CustomRoutingDestinationTrafficState
     */

    public void setDestinationTrafficState(String destinationTrafficState) {
        this.destinationTrafficState = destinationTrafficState;
    }

    /**
     * <p>
     * Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if traffic is
     * allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * </p>
     * 
     * @return Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if
     *         traffic is allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * @see CustomRoutingDestinationTrafficState
     */

    public String getDestinationTrafficState() {
        return this.destinationTrafficState;
    }

    /**
     * <p>
     * Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if traffic is
     * allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * </p>
     * 
     * @param destinationTrafficState
     *        Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if
     *        traffic is allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingDestinationTrafficState
     */

    public PortMapping withDestinationTrafficState(String destinationTrafficState) {
        setDestinationTrafficState(destinationTrafficState);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if traffic is
     * allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * </p>
     * 
     * @param destinationTrafficState
     *        Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if
     *        traffic is allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingDestinationTrafficState
     */

    public PortMapping withDestinationTrafficState(CustomRoutingDestinationTrafficState destinationTrafficState) {
        this.destinationTrafficState = destinationTrafficState.toString();
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
        if (getAcceleratorPort() != null)
            sb.append("AcceleratorPort: ").append(getAcceleratorPort()).append(",");
        if (getEndpointGroupArn() != null)
            sb.append("EndpointGroupArn: ").append(getEndpointGroupArn()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getDestinationSocketAddress() != null)
            sb.append("DestinationSocketAddress: ").append(getDestinationSocketAddress()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getDestinationTrafficState() != null)
            sb.append("DestinationTrafficState: ").append(getDestinationTrafficState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortMapping == false)
            return false;
        PortMapping other = (PortMapping) obj;
        if (other.getAcceleratorPort() == null ^ this.getAcceleratorPort() == null)
            return false;
        if (other.getAcceleratorPort() != null && other.getAcceleratorPort().equals(this.getAcceleratorPort()) == false)
            return false;
        if (other.getEndpointGroupArn() == null ^ this.getEndpointGroupArn() == null)
            return false;
        if (other.getEndpointGroupArn() != null && other.getEndpointGroupArn().equals(this.getEndpointGroupArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getDestinationSocketAddress() == null ^ this.getDestinationSocketAddress() == null)
            return false;
        if (other.getDestinationSocketAddress() != null && other.getDestinationSocketAddress().equals(this.getDestinationSocketAddress()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getDestinationTrafficState() == null ^ this.getDestinationTrafficState() == null)
            return false;
        if (other.getDestinationTrafficState() != null && other.getDestinationTrafficState().equals(this.getDestinationTrafficState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorPort() == null) ? 0 : getAcceleratorPort().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDestinationSocketAddress() == null) ? 0 : getDestinationSocketAddress().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getDestinationTrafficState() == null) ? 0 : getDestinationTrafficState().hashCode());
        return hashCode;
    }

    @Override
    public PortMapping clone() {
        try {
            return (PortMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.PortMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
