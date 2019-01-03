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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcPeeringConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection
     * record.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for a VPC peering connection. This value is included in the <a>VpcPeeringConnection</a> object,
     * which can be retrieved by calling <a>DescribeVpcPeeringConnections</a>.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection
     * record.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection
     *        record.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection
     * record.
     * </p>
     * 
     * @return Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering
     *         connection record.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection
     * record.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection
     *        record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcPeeringConnectionRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a VPC peering connection. This value is included in the <a>VpcPeeringConnection</a> object,
     * which can be retrieved by calling <a>DescribeVpcPeeringConnections</a>.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        Unique identifier for a VPC peering connection. This value is included in the <a>VpcPeeringConnection</a>
     *        object, which can be retrieved by calling <a>DescribeVpcPeeringConnections</a>.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * Unique identifier for a VPC peering connection. This value is included in the <a>VpcPeeringConnection</a> object,
     * which can be retrieved by calling <a>DescribeVpcPeeringConnections</a>.
     * </p>
     * 
     * @return Unique identifier for a VPC peering connection. This value is included in the <a>VpcPeeringConnection</a>
     *         object, which can be retrieved by calling <a>DescribeVpcPeeringConnections</a>.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * Unique identifier for a VPC peering connection. This value is included in the <a>VpcPeeringConnection</a> object,
     * which can be retrieved by calling <a>DescribeVpcPeeringConnections</a>.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        Unique identifier for a VPC peering connection. This value is included in the <a>VpcPeeringConnection</a>
     *        object, which can be retrieved by calling <a>DescribeVpcPeeringConnections</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcPeeringConnectionRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcPeeringConnectionRequest == false)
            return false;
        DeleteVpcPeeringConnectionRequest other = (DeleteVpcPeeringConnectionRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcPeeringConnectionRequest clone() {
        return (DeleteVpcPeeringConnectionRequest) super.clone();
    }

}
