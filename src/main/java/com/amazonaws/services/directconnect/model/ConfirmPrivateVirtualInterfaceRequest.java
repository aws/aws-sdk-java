/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest) ConfirmPrivateVirtualInterface operation}.
 * <p>
 * Accept ownership of a private virtual interface created by another customer.
 * </p>
 * <p>
 * After the virtual interface owner calls this function, the virtual interface will be created and attached to the given virtual private gateway, and
 * will be available for handling traffic.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest)
 */
public class ConfirmPrivateVirtualInterfaceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     */
    private String virtualInterfaceId;

    /**
     * ID of the virtual private gateway that will be attached to the virtual
     * interface. <p> A virtual private gateway can be managed via the Amazon
     * Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action. <p>Default: None
     */
    private String virtualGatewayId;

    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     *
     * @return ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }
    
    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     *
     * @param virtualInterfaceId ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }
    
    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaceId ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfirmPrivateVirtualInterfaceRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * ID of the virtual private gateway that will be attached to the virtual
     * interface. <p> A virtual private gateway can be managed via the Amazon
     * Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action. <p>Default: None
     *
     * @return ID of the virtual private gateway that will be attached to the virtual
     *         interface. <p> A virtual private gateway can be managed via the Amazon
     *         Virtual Private Cloud (VPC) console or the <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     *         CreateVpnGateway</a> action. <p>Default: None
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }
    
    /**
     * ID of the virtual private gateway that will be attached to the virtual
     * interface. <p> A virtual private gateway can be managed via the Amazon
     * Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action. <p>Default: None
     *
     * @param virtualGatewayId ID of the virtual private gateway that will be attached to the virtual
     *         interface. <p> A virtual private gateway can be managed via the Amazon
     *         Virtual Private Cloud (VPC) console or the <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     *         CreateVpnGateway</a> action. <p>Default: None
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }
    
    /**
     * ID of the virtual private gateway that will be attached to the virtual
     * interface. <p> A virtual private gateway can be managed via the Amazon
     * Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action. <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualGatewayId ID of the virtual private gateway that will be attached to the virtual
     *         interface. <p> A virtual private gateway can be managed via the Amazon
     *         Virtual Private Cloud (VPC) console or the <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     *         CreateVpnGateway</a> action. <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfirmPrivateVirtualInterfaceRequest withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVirtualInterfaceId() != null) sb.append("VirtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getVirtualGatewayId() != null) sb.append("VirtualGatewayId: " + getVirtualGatewayId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfirmPrivateVirtualInterfaceRequest == false) return false;
        ConfirmPrivateVirtualInterfaceRequest other = (ConfirmPrivateVirtualInterfaceRequest)obj;
        
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null) return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false) return false; 
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null) return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false) return false; 
        return true;
    }
    
}
    