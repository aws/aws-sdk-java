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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a route for a local gateway route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LocalGatewayRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayRoute implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;
    /**
     * <p>
     * The route type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the route.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block used for destination matches.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @return The CIDR block used for destination matches.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block used for destination matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRoute withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     */

    public void setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @return The ID of the virtual interface group.
     */

    public String getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRoute withLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        setLocalGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId);
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     * @see LocalGatewayRouteType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @return The route type.
     * @see LocalGatewayRouteType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalGatewayRouteType
     */

    public LocalGatewayRoute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalGatewayRouteType
     */

    public LocalGatewayRoute withType(LocalGatewayRouteType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @param state
     *        The state of the route.
     * @see LocalGatewayRouteState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @return The state of the route.
     * @see LocalGatewayRouteState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @param state
     *        The state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalGatewayRouteState
     */

    public LocalGatewayRoute withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * 
     * @param state
     *        The state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalGatewayRouteState
     */

    public LocalGatewayRoute withState(LocalGatewayRouteState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRoute withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: ").append(getLocalGatewayVirtualInterfaceGroupId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalGatewayRoute == false)
            return false;
        LocalGatewayRoute other = (LocalGatewayRoute) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() == null ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(this.getLocalGatewayVirtualInterfaceGroupId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0 : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public LocalGatewayRoute clone() {
        try {
            return (LocalGatewayRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
