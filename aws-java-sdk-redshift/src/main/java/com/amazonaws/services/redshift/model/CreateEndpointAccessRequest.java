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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateEndpointAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The account ID of the owner of the cluster. This is only required if the cluster is in another account.
     * </p>
     */
    private String resourceOwner;
    /**
     * <p>
     * The Redshift-managed VPC endpoint name.
     * </p>
     * <p>
     * An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The first
     * character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
     * </p>
     */
    private String subnetGroupName;
    /**
     * <p>
     * The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing
     * into your endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster to access.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     * 
     * @return The cluster identifier of the cluster to access.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster to access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The account ID of the owner of the cluster. This is only required if the cluster is in another account.
     * </p>
     * 
     * @param resourceOwner
     *        The account ID of the owner of the cluster. This is only required if the cluster is in another account.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The account ID of the owner of the cluster. This is only required if the cluster is in another account.
     * </p>
     * 
     * @return The account ID of the owner of the cluster. This is only required if the cluster is in another account.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The account ID of the owner of the cluster. This is only required if the cluster is in another account.
     * </p>
     * 
     * @param resourceOwner
     *        The account ID of the owner of the cluster. This is only required if the cluster is in another account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * The Redshift-managed VPC endpoint name.
     * </p>
     * <p>
     * An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The first
     * character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
     * </p>
     * 
     * @param endpointName
     *        The Redshift-managed VPC endpoint name.</p>
     *        <p>
     *        An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The
     *        first character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The Redshift-managed VPC endpoint name.
     * </p>
     * <p>
     * An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The first
     * character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
     * </p>
     * 
     * @return The Redshift-managed VPC endpoint name.</p>
     *         <p>
     *         An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The
     *         first character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The Redshift-managed VPC endpoint name.
     * </p>
     * <p>
     * An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The first
     * character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
     * </p>
     * 
     * @param endpointName
     *        The Redshift-managed VPC endpoint name.</p>
     *        <p>
     *        An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The
     *        first character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
     * </p>
     * 
     * @param subnetGroupName
     *        The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
     */

    public void setSubnetGroupName(String subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    /**
     * <p>
     * The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
     * </p>
     * 
     * @return The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
     */

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    /**
     * <p>
     * The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
     * </p>
     * 
     * @param subnetGroupName
     *        The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withSubnetGroupName(String subnetGroupName) {
        setSubnetGroupName(subnetGroupName);
        return this;
    }

    /**
     * <p>
     * The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing
     * into your endpoint.
     * </p>
     * 
     * @return The security group that defines the ports, protocols, and sources for inbound traffic that you are
     *         authorizing into your endpoint.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing
     * into your endpoint.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The security group that defines the ports, protocols, and sources for inbound traffic that you are
     *        authorizing into your endpoint.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing
     * into your endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The security group that defines the ports, protocols, and sources for inbound traffic that you are
     *        authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing
     * into your endpoint.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The security group that defines the ports, protocols, and sources for inbound traffic that you are
     *        authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getSubnetGroupName() != null)
            sb.append("SubnetGroupName: ").append(getSubnetGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointAccessRequest == false)
            return false;
        CreateEndpointAccessRequest other = (CreateEndpointAccessRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getSubnetGroupName() == null ^ this.getSubnetGroupName() == null)
            return false;
        if (other.getSubnetGroupName() != null && other.getSubnetGroupName().equals(this.getSubnetGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupName() == null) ? 0 : getSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointAccessRequest clone() {
        return (CreateEndpointAccessRequest) super.clone();
    }

}
