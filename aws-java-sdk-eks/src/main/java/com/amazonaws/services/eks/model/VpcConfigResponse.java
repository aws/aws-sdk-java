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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an Amazon EKS cluster VPC configuration response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/VpcConfigResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfigResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnets associated with your cluster.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The security groups associated with the cross-account elastic network interfaces that are used to allow
     * communication between your worker nodes and the Kubernetes control plane.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The VPC associated with your cluster.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public
     * API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests that originate
     * from within the cluster VPC.
     * </p>
     */
    private Boolean endpointPublicAccess;
    /**
     * <p>
     * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private
     * API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC will use
     * the private VPC endpoint instead of traversing the internet.
     * </p>
     */
    private Boolean endpointPrivateAccess;

    /**
     * <p>
     * The subnets associated with your cluster.
     * </p>
     * 
     * @return The subnets associated with your cluster.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnets associated with your cluster.
     * </p>
     * 
     * @param subnetIds
     *        The subnets associated with your cluster.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnets associated with your cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The subnets associated with your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigResponse withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets associated with your cluster.
     * </p>
     * 
     * @param subnetIds
     *        The subnets associated with your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigResponse withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The security groups associated with the cross-account elastic network interfaces that are used to allow
     * communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * 
     * @return The security groups associated with the cross-account elastic network interfaces that are used to allow
     *         communication between your worker nodes and the Kubernetes control plane.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security groups associated with the cross-account elastic network interfaces that are used to allow
     * communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups associated with the cross-account elastic network interfaces that are used to allow
     *        communication between your worker nodes and the Kubernetes control plane.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security groups associated with the cross-account elastic network interfaces that are used to allow
     * communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups associated with the cross-account elastic network interfaces that are used to allow
     *        communication between your worker nodes and the Kubernetes control plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigResponse withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the cross-account elastic network interfaces that are used to allow
     * communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups associated with the cross-account elastic network interfaces that are used to allow
     *        communication between your worker nodes and the Kubernetes control plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigResponse withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The VPC associated with your cluster.
     * </p>
     * 
     * @param vpcId
     *        The VPC associated with your cluster.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC associated with your cluster.
     * </p>
     * 
     * @return The VPC associated with your cluster.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC associated with your cluster.
     * </p>
     * 
     * @param vpcId
     *        The VPC associated with your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigResponse withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public
     * API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests that originate
     * from within the cluster VPC.
     * </p>
     * 
     * @param endpointPublicAccess
     *        This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS
     *        public API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests
     *        that originate from within the cluster VPC.
     */

    public void setEndpointPublicAccess(Boolean endpointPublicAccess) {
        this.endpointPublicAccess = endpointPublicAccess;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public
     * API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests that originate
     * from within the cluster VPC.
     * </p>
     * 
     * @return This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS
     *         public API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests
     *         that originate from within the cluster VPC.
     */

    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public
     * API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests that originate
     * from within the cluster VPC.
     * </p>
     * 
     * @param endpointPublicAccess
     *        This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS
     *        public API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests
     *        that originate from within the cluster VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigResponse withEndpointPublicAccess(Boolean endpointPublicAccess) {
        setEndpointPublicAccess(endpointPublicAccess);
        return this;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public
     * API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests that originate
     * from within the cluster VPC.
     * </p>
     * 
     * @return This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS
     *         public API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests
     *         that originate from within the cluster VPC.
     */

    public Boolean isEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private
     * API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC will use
     * the private VPC endpoint instead of traversing the internet.
     * </p>
     * 
     * @param endpointPrivateAccess
     *        This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS
     *        private API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's
     *        VPC will use the private VPC endpoint instead of traversing the internet.
     */

    public void setEndpointPrivateAccess(Boolean endpointPrivateAccess) {
        this.endpointPrivateAccess = endpointPrivateAccess;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private
     * API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC will use
     * the private VPC endpoint instead of traversing the internet.
     * </p>
     * 
     * @return This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS
     *         private API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's
     *         VPC will use the private VPC endpoint instead of traversing the internet.
     */

    public Boolean getEndpointPrivateAccess() {
        return this.endpointPrivateAccess;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private
     * API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC will use
     * the private VPC endpoint instead of traversing the internet.
     * </p>
     * 
     * @param endpointPrivateAccess
     *        This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS
     *        private API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's
     *        VPC will use the private VPC endpoint instead of traversing the internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigResponse withEndpointPrivateAccess(Boolean endpointPrivateAccess) {
        setEndpointPrivateAccess(endpointPrivateAccess);
        return this;
    }

    /**
     * <p>
     * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private
     * API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC will use
     * the private VPC endpoint instead of traversing the internet.
     * </p>
     * 
     * @return This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS
     *         private API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's
     *         VPC will use the private VPC endpoint instead of traversing the internet.
     */

    public Boolean isEndpointPrivateAccess() {
        return this.endpointPrivateAccess;
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getEndpointPublicAccess() != null)
            sb.append("EndpointPublicAccess: ").append(getEndpointPublicAccess()).append(",");
        if (getEndpointPrivateAccess() != null)
            sb.append("EndpointPrivateAccess: ").append(getEndpointPrivateAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfigResponse == false)
            return false;
        VpcConfigResponse other = (VpcConfigResponse) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getEndpointPublicAccess() == null ^ this.getEndpointPublicAccess() == null)
            return false;
        if (other.getEndpointPublicAccess() != null && other.getEndpointPublicAccess().equals(this.getEndpointPublicAccess()) == false)
            return false;
        if (other.getEndpointPrivateAccess() == null ^ this.getEndpointPrivateAccess() == null)
            return false;
        if (other.getEndpointPrivateAccess() != null && other.getEndpointPrivateAccess().equals(this.getEndpointPrivateAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getEndpointPublicAccess() == null) ? 0 : getEndpointPublicAccess().hashCode());
        hashCode = prime * hashCode + ((getEndpointPrivateAccess() == null) ? 0 : getEndpointPrivateAccess().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfigResponse clone() {
        try {
            return (VpcConfigResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.VpcConfigResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
