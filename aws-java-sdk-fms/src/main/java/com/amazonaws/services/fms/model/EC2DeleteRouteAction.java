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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the DeleteRoute action in Amazon EC2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EC2DeleteRouteAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2DeleteRouteAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the DeleteRoute action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     */
    private String destinationPrefixListId;
    /**
     * <p>
     * Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     */
    private String destinationIpv6CidrBlock;
    /**
     * <p>
     * Information about the ID of the route table.
     * </p>
     */
    private ActionTarget routeTableId;

    /**
     * <p>
     * A description of the DeleteRoute action.
     * </p>
     * 
     * @param description
     *        A description of the DeleteRoute action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the DeleteRoute action.
     * </p>
     * 
     * @return A description of the DeleteRoute action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the DeleteRoute action.
     * </p>
     * 
     * @param description
     *        A description of the DeleteRoute action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2DeleteRouteAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     * 
     * @param destinationCidrBlock
     *        Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the
     *        route exactly.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     * 
     * @return Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the
     *         route exactly.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     * 
     * @param destinationCidrBlock
     *        Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the
     *        route exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2DeleteRouteAction withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     * 
     * @param destinationPrefixListId
     *        Information about the ID of the prefix list for the route.
     */

    public void setDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     * 
     * @return Information about the ID of the prefix list for the route.
     */

    public String getDestinationPrefixListId() {
        return this.destinationPrefixListId;
    }

    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     * 
     * @param destinationPrefixListId
     *        Information about the ID of the prefix list for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2DeleteRouteAction withDestinationPrefixListId(String destinationPrefixListId) {
        setDestinationPrefixListId(destinationPrefixListId);
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the
     *        route exactly.
     */

    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     * 
     * @return Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the
     *         route exactly.
     */

    public String getDestinationIpv6CidrBlock() {
        return this.destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the route
     * exactly.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the
     *        route exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2DeleteRouteAction withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        setDestinationIpv6CidrBlock(destinationIpv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        Information about the ID of the route table.
     */

    public void setRouteTableId(ActionTarget routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * Information about the ID of the route table.
     * </p>
     * 
     * @return Information about the ID of the route table.
     */

    public ActionTarget getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * Information about the ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        Information about the ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2DeleteRouteAction withRouteTableId(ActionTarget routeTableId) {
        setRouteTableId(routeTableId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getDestinationPrefixListId() != null)
            sb.append("DestinationPrefixListId: ").append(getDestinationPrefixListId()).append(",");
        if (getDestinationIpv6CidrBlock() != null)
            sb.append("DestinationIpv6CidrBlock: ").append(getDestinationIpv6CidrBlock()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2DeleteRouteAction == false)
            return false;
        EC2DeleteRouteAction other = (EC2DeleteRouteAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationPrefixListId() == null ^ this.getDestinationPrefixListId() == null)
            return false;
        if (other.getDestinationPrefixListId() != null && other.getDestinationPrefixListId().equals(this.getDestinationPrefixListId()) == false)
            return false;
        if (other.getDestinationIpv6CidrBlock() == null ^ this.getDestinationIpv6CidrBlock() == null)
            return false;
        if (other.getDestinationIpv6CidrBlock() != null && other.getDestinationIpv6CidrBlock().equals(this.getDestinationIpv6CidrBlock()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefixListId() == null) ? 0 : getDestinationPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getDestinationIpv6CidrBlock() == null) ? 0 : getDestinationIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public EC2DeleteRouteAction clone() {
        try {
            return (EC2DeleteRouteAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EC2DeleteRouteActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
