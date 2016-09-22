/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the ConfirmPrivateVirtualInterface operation.
 * </p>
 */
public class ConfirmPrivateVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String virtualInterfaceId;
    /**
     * <p>
     * ID of the virtual private gateway that will be attached to the virtual interface.
     * </p>
     * <p>
     * A virtual private gateway can be managed via the Amazon Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String virtualGatewayId;

    /**
     * @param virtualInterfaceId
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * @return
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * @param virtualInterfaceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmPrivateVirtualInterfaceRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * ID of the virtual private gateway that will be attached to the virtual interface.
     * </p>
     * <p>
     * A virtual private gateway can be managed via the Amazon Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualGatewayId
     *        ID of the virtual private gateway that will be attached to the virtual interface.</p>
     *        <p>
     *        A virtual private gateway can be managed via the Amazon Virtual Private Cloud (VPC) console or the <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     *        CreateVpnGateway</a> action.
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * ID of the virtual private gateway that will be attached to the virtual interface.
     * </p>
     * <p>
     * A virtual private gateway can be managed via the Amazon Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return ID of the virtual private gateway that will be attached to the virtual interface.</p>
     *         <p>
     *         A virtual private gateway can be managed via the Amazon Virtual Private Cloud (VPC) console or the <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     *         CreateVpnGateway</a> action.
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * ID of the virtual private gateway that will be attached to the virtual interface.
     * </p>
     * <p>
     * A virtual private gateway can be managed via the Amazon Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualGatewayId
     *        ID of the virtual private gateway that will be attached to the virtual interface.</p>
     *        <p>
     *        A virtual private gateway can be managed via the Amazon Virtual Private Cloud (VPC) console or the <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     *        CreateVpnGateway</a> action.
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmPrivateVirtualInterfaceRequest withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: " + getVirtualGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmPrivateVirtualInterfaceRequest == false)
            return false;
        ConfirmPrivateVirtualInterfaceRequest other = (ConfirmPrivateVirtualInterfaceRequest) obj;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        return true;
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
    public ConfirmPrivateVirtualInterfaceRequest clone() {
        return (ConfirmPrivateVirtualInterfaceRequest) super.clone();
    }
}
