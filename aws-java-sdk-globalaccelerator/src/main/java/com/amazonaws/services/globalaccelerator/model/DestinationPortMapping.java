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
 * The port mappings for a specified endpoint IP address (destination).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DestinationPortMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationPortMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
     * </p>
     */
    private String acceleratorArn;
    /**
     * <p>
     * The IP address/port combinations (sockets) that map to a given destination socket address.
     * </p>
     */
    private java.util.List<SocketAddress> acceleratorSocketAddresses;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     */
    private String endpointGroupArn;
    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The AWS Region for the endpoint group.
     * </p>
     */
    private String endpointGroupRegion;
    /**
     * <p>
     * The endpoint IP address/port combination for traffic received on the accelerator socket address.
     * </p>
     */
    private SocketAddress destinationSocketAddress;
    /**
     * <p>
     * The IP address type, which must be IPv4.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if traffic is
     * allowed to the destination, or DENY, if traffic is not allowed to the destination.
     * </p>
     */
    private String destinationTrafficState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
     */

    public void setAcceleratorArn(String acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
     */

    public String getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationPortMapping withAcceleratorArn(String acceleratorArn) {
        setAcceleratorArn(acceleratorArn);
        return this;
    }

    /**
     * <p>
     * The IP address/port combinations (sockets) that map to a given destination socket address.
     * </p>
     * 
     * @return The IP address/port combinations (sockets) that map to a given destination socket address.
     */

    public java.util.List<SocketAddress> getAcceleratorSocketAddresses() {
        return acceleratorSocketAddresses;
    }

    /**
     * <p>
     * The IP address/port combinations (sockets) that map to a given destination socket address.
     * </p>
     * 
     * @param acceleratorSocketAddresses
     *        The IP address/port combinations (sockets) that map to a given destination socket address.
     */

    public void setAcceleratorSocketAddresses(java.util.Collection<SocketAddress> acceleratorSocketAddresses) {
        if (acceleratorSocketAddresses == null) {
            this.acceleratorSocketAddresses = null;
            return;
        }

        this.acceleratorSocketAddresses = new java.util.ArrayList<SocketAddress>(acceleratorSocketAddresses);
    }

    /**
     * <p>
     * The IP address/port combinations (sockets) that map to a given destination socket address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorSocketAddresses(java.util.Collection)} or
     * {@link #withAcceleratorSocketAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param acceleratorSocketAddresses
     *        The IP address/port combinations (sockets) that map to a given destination socket address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationPortMapping withAcceleratorSocketAddresses(SocketAddress... acceleratorSocketAddresses) {
        if (this.acceleratorSocketAddresses == null) {
            setAcceleratorSocketAddresses(new java.util.ArrayList<SocketAddress>(acceleratorSocketAddresses.length));
        }
        for (SocketAddress ele : acceleratorSocketAddresses) {
            this.acceleratorSocketAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP address/port combinations (sockets) that map to a given destination socket address.
     * </p>
     * 
     * @param acceleratorSocketAddresses
     *        The IP address/port combinations (sockets) that map to a given destination socket address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationPortMapping withAcceleratorSocketAddresses(java.util.Collection<SocketAddress> acceleratorSocketAddresses) {
        setAcceleratorSocketAddresses(acceleratorSocketAddresses);
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

    public DestinationPortMapping withEndpointGroupArn(String endpointGroupArn) {
        setEndpointGroupArn(endpointGroupArn);
        return this;
    }

    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @param endpointId
     *        The ID for the virtual private cloud (VPC) subnet.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @return The ID for the virtual private cloud (VPC) subnet.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @param endpointId
     *        The ID for the virtual private cloud (VPC) subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationPortMapping withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The AWS Region for the endpoint group.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region for the endpoint group.
     */

    public void setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region for the endpoint group.
     * </p>
     * 
     * @return The AWS Region for the endpoint group.
     */

    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region for the endpoint group.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region for the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationPortMapping withEndpointGroupRegion(String endpointGroupRegion) {
        setEndpointGroupRegion(endpointGroupRegion);
        return this;
    }

    /**
     * <p>
     * The endpoint IP address/port combination for traffic received on the accelerator socket address.
     * </p>
     * 
     * @param destinationSocketAddress
     *        The endpoint IP address/port combination for traffic received on the accelerator socket address.
     */

    public void setDestinationSocketAddress(SocketAddress destinationSocketAddress) {
        this.destinationSocketAddress = destinationSocketAddress;
    }

    /**
     * <p>
     * The endpoint IP address/port combination for traffic received on the accelerator socket address.
     * </p>
     * 
     * @return The endpoint IP address/port combination for traffic received on the accelerator socket address.
     */

    public SocketAddress getDestinationSocketAddress() {
        return this.destinationSocketAddress;
    }

    /**
     * <p>
     * The endpoint IP address/port combination for traffic received on the accelerator socket address.
     * </p>
     * 
     * @param destinationSocketAddress
     *        The endpoint IP address/port combination for traffic received on the accelerator socket address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationPortMapping withDestinationSocketAddress(SocketAddress destinationSocketAddress) {
        setDestinationSocketAddress(destinationSocketAddress);
        return this;
    }

    /**
     * <p>
     * The IP address type, which must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type, which must be IPv4.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The IP address type, which must be IPv4.
     * </p>
     * 
     * @return The IP address type, which must be IPv4.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The IP address type, which must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type, which must be IPv4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public DestinationPortMapping withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The IP address type, which must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type, which must be IPv4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public DestinationPortMapping withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
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

    public DestinationPortMapping withDestinationTrafficState(String destinationTrafficState) {
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

    public DestinationPortMapping withDestinationTrafficState(CustomRoutingDestinationTrafficState destinationTrafficState) {
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
        if (getAcceleratorArn() != null)
            sb.append("AcceleratorArn: ").append(getAcceleratorArn()).append(",");
        if (getAcceleratorSocketAddresses() != null)
            sb.append("AcceleratorSocketAddresses: ").append(getAcceleratorSocketAddresses()).append(",");
        if (getEndpointGroupArn() != null)
            sb.append("EndpointGroupArn: ").append(getEndpointGroupArn()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getEndpointGroupRegion() != null)
            sb.append("EndpointGroupRegion: ").append(getEndpointGroupRegion()).append(",");
        if (getDestinationSocketAddress() != null)
            sb.append("DestinationSocketAddress: ").append(getDestinationSocketAddress()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
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

        if (obj instanceof DestinationPortMapping == false)
            return false;
        DestinationPortMapping other = (DestinationPortMapping) obj;
        if (other.getAcceleratorArn() == null ^ this.getAcceleratorArn() == null)
            return false;
        if (other.getAcceleratorArn() != null && other.getAcceleratorArn().equals(this.getAcceleratorArn()) == false)
            return false;
        if (other.getAcceleratorSocketAddresses() == null ^ this.getAcceleratorSocketAddresses() == null)
            return false;
        if (other.getAcceleratorSocketAddresses() != null && other.getAcceleratorSocketAddresses().equals(this.getAcceleratorSocketAddresses()) == false)
            return false;
        if (other.getEndpointGroupArn() == null ^ this.getEndpointGroupArn() == null)
            return false;
        if (other.getEndpointGroupArn() != null && other.getEndpointGroupArn().equals(this.getEndpointGroupArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getEndpointGroupRegion() == null ^ this.getEndpointGroupRegion() == null)
            return false;
        if (other.getEndpointGroupRegion() != null && other.getEndpointGroupRegion().equals(this.getEndpointGroupRegion()) == false)
            return false;
        if (other.getDestinationSocketAddress() == null ^ this.getDestinationSocketAddress() == null)
            return false;
        if (other.getDestinationSocketAddress() != null && other.getDestinationSocketAddress().equals(this.getDestinationSocketAddress()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
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

        hashCode = prime * hashCode + ((getAcceleratorArn() == null) ? 0 : getAcceleratorArn().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorSocketAddresses() == null) ? 0 : getAcceleratorSocketAddresses().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupRegion() == null) ? 0 : getEndpointGroupRegion().hashCode());
        hashCode = prime * hashCode + ((getDestinationSocketAddress() == null) ? 0 : getDestinationSocketAddress().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getDestinationTrafficState() == null) ? 0 : getDestinationTrafficState().hashCode());
        return hashCode;
    }

    @Override
    public DestinationPortMapping clone() {
        try {
            return (DestinationPortMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.DestinationPortMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
