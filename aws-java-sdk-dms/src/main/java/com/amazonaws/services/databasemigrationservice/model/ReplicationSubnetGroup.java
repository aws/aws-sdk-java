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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReplicationSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationSubnetGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;
    /**
     * <p>
     * The description of the replication subnet group.
     * </p>
     */
    private String replicationSubnetGroupDescription;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The status of the subnet group.
     * </p>
     */
    private String subnetGroupStatus;
    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     */
    private java.util.List<Subnet> subnets;

    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The identifier of the replication instance subnet group.
     */

    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     * 
     * @return The identifier of the replication instance subnet group.
     */

    public String getReplicationSubnetGroupIdentifier() {
        return this.replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The identifier of the replication instance subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSubnetGroup withReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        setReplicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The description of the replication subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupDescription
     *        The description of the replication subnet group.
     */

    public void setReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the replication subnet group.
     * </p>
     * 
     * @return The description of the replication subnet group.
     */

    public String getReplicationSubnetGroupDescription() {
        return this.replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the replication subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupDescription
     *        The description of the replication subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSubnetGroup withReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
        setReplicationSubnetGroupDescription(replicationSubnetGroupDescription);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSubnetGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     * 
     * @param subnetGroupStatus
     *        The status of the subnet group.
     */

    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     * 
     * @return The status of the subnet group.
     */

    public String getSubnetGroupStatus() {
        return this.subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     * 
     * @param subnetGroupStatus
     *        The status of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        setSubnetGroupStatus(subnetGroupStatus);
        return this;
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     * 
     * @return The subnets that are in the subnet group.
     */

    public java.util.List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     * 
     * @param subnets
     *        The subnets that are in the subnet group.
     */

    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<Subnet>(subnets);
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The subnets that are in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSubnetGroup withSubnets(Subnet... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<Subnet>(subnets.length));
        }
        for (Subnet ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     * 
     * @param subnets
     *        The subnets that are in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
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
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: ").append(getReplicationSubnetGroupIdentifier()).append(",");
        if (getReplicationSubnetGroupDescription() != null)
            sb.append("ReplicationSubnetGroupDescription: ").append(getReplicationSubnetGroupDescription()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetGroupStatus() != null)
            sb.append("SubnetGroupStatus: ").append(getSubnetGroupStatus()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationSubnetGroup == false)
            return false;
        ReplicationSubnetGroup other = (ReplicationSubnetGroup) obj;
        if (other.getReplicationSubnetGroupIdentifier() == null ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(this.getReplicationSubnetGroupIdentifier()) == false)
            return false;
        if (other.getReplicationSubnetGroupDescription() == null ^ this.getReplicationSubnetGroupDescription() == null)
            return false;
        if (other.getReplicationSubnetGroupDescription() != null
                && other.getReplicationSubnetGroupDescription().equals(this.getReplicationSubnetGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null)
            return false;
        if (other.getSubnetGroupStatus() != null && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationSubnetGroupIdentifier() == null) ? 0 : getReplicationSubnetGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationSubnetGroupDescription() == null) ? 0 : getReplicationSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationSubnetGroup clone() {
        try {
            return (ReplicationSubnetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationSubnetGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
