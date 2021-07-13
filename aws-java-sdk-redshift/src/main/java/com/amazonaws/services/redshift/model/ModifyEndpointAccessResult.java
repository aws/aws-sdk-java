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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Redshift-managed VPC endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyEndpointAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyEndpointAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier of the cluster associated with the endpoint.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The account ID of the owner of the cluster.
     * </p>
     */
    private String resourceOwner;
    /**
     * <p>
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     * </p>
     */
    private String subnetGroupName;
    /**
     * <p>
     * The status of the endpoint.
     * </p>
     */
    private String endpointStatus;
    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The time (UTC) that the endpoint was created.
     * </p>
     */
    private java.util.Date endpointCreateTime;
    /**
     * <p>
     * The port number on which the cluster accepts incoming connections.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The security groups associated with the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership> vpcSecurityGroups;

    private VpcEndpoint vpcEndpoint;

    /**
     * <p>
     * The cluster identifier of the cluster associated with the endpoint.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster associated with the endpoint.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster associated with the endpoint.
     * </p>
     * 
     * @return The cluster identifier of the cluster associated with the endpoint.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster associated with the endpoint.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The account ID of the owner of the cluster.
     * </p>
     * 
     * @param resourceOwner
     *        The account ID of the owner of the cluster.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The account ID of the owner of the cluster.
     * </p>
     * 
     * @return The account ID of the owner of the cluster.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The account ID of the owner of the cluster.
     * </p>
     * 
     * @param resourceOwner
     *        The account ID of the owner of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     * </p>
     * 
     * @param subnetGroupName
     *        The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     */

    public void setSubnetGroupName(String subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    /**
     * <p>
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     * </p>
     * 
     * @return The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     */

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    /**
     * <p>
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     * </p>
     * 
     * @param subnetGroupName
     *        The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withSubnetGroupName(String subnetGroupName) {
        setSubnetGroupName(subnetGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @return The status of the endpoint.
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The time (UTC) that the endpoint was created.
     * </p>
     * 
     * @param endpointCreateTime
     *        The time (UTC) that the endpoint was created.
     */

    public void setEndpointCreateTime(java.util.Date endpointCreateTime) {
        this.endpointCreateTime = endpointCreateTime;
    }

    /**
     * <p>
     * The time (UTC) that the endpoint was created.
     * </p>
     * 
     * @return The time (UTC) that the endpoint was created.
     */

    public java.util.Date getEndpointCreateTime() {
        return this.endpointCreateTime;
    }

    /**
     * <p>
     * The time (UTC) that the endpoint was created.
     * </p>
     * 
     * @param endpointCreateTime
     *        The time (UTC) that the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withEndpointCreateTime(java.util.Date endpointCreateTime) {
        setEndpointCreateTime(endpointCreateTime);
        return this;
    }

    /**
     * <p>
     * The port number on which the cluster accepts incoming connections.
     * </p>
     * 
     * @param port
     *        The port number on which the cluster accepts incoming connections.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts incoming connections.
     * </p>
     * 
     * @return The port number on which the cluster accepts incoming connections.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts incoming connections.
     * </p>
     * 
     * @param port
     *        The port number on which the cluster accepts incoming connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     * 
     * @param address
     *        The DNS address of the endpoint.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     * 
     * @return The DNS address of the endpoint.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     * 
     * @param address
     *        The DNS address of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The security groups associated with the endpoint.
     * </p>
     * 
     * @return The security groups associated with the endpoint.
     */

    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
            vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>();
        }
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * The security groups associated with the endpoint.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The security groups associated with the endpoint.
     */

    public void setVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroups);
    }

    /**
     * <p>
     * The security groups associated with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The security groups associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
        }
        for (VpcSecurityGroupMembership ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the endpoint.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The security groups associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * @param vpcEndpoint
     */

    public void setVpcEndpoint(VpcEndpoint vpcEndpoint) {
        this.vpcEndpoint = vpcEndpoint;
    }

    /**
     * @return
     */

    public VpcEndpoint getVpcEndpoint() {
        return this.vpcEndpoint;
    }

    /**
     * @param vpcEndpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointAccessResult withVpcEndpoint(VpcEndpoint vpcEndpoint) {
        setVpcEndpoint(vpcEndpoint);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getSubnetGroupName() != null)
            sb.append("SubnetGroupName: ").append(getSubnetGroupName()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointCreateTime() != null)
            sb.append("EndpointCreateTime: ").append(getEndpointCreateTime()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups()).append(",");
        if (getVpcEndpoint() != null)
            sb.append("VpcEndpoint: ").append(getVpcEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEndpointAccessResult == false)
            return false;
        ModifyEndpointAccessResult other = (ModifyEndpointAccessResult) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getSubnetGroupName() == null ^ this.getSubnetGroupName() == null)
            return false;
        if (other.getSubnetGroupName() != null && other.getSubnetGroupName().equals(this.getSubnetGroupName()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointCreateTime() == null ^ this.getEndpointCreateTime() == null)
            return false;
        if (other.getEndpointCreateTime() != null && other.getEndpointCreateTime().equals(this.getEndpointCreateTime()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getVpcEndpoint() == null ^ this.getVpcEndpoint() == null)
            return false;
        if (other.getVpcEndpoint() != null && other.getVpcEndpoint().equals(this.getVpcEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupName() == null) ? 0 : getSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointCreateTime() == null) ? 0 : getEndpointCreateTime().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpoint() == null) ? 0 : getVpcEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public ModifyEndpointAccessResult clone() {
        try {
            return (ModifyEndpointAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
