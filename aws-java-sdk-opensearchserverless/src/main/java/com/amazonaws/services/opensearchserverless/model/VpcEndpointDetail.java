/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an OpenSearch Serverless-managed interface endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/VpcEndpointDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date the endpoint was created.
     * </p>
     */
    private Long createdDate;
    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifiers of the security groups that define the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the subnets from which you access OpenSearch Serverless.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The ID of the VPC from which you access OpenSearch Serverless
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The date the endpoint was created.
     * </p>
     * 
     * @param createdDate
     *        The date the endpoint was created.
     */

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the endpoint was created.
     * </p>
     * 
     * @return The date the endpoint was created.
     */

    public Long getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the endpoint was created.
     * </p>
     * 
     * @param createdDate
     *        The date the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withCreatedDate(Long createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the endpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @return The unique identifier of the endpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the security groups that define the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * 
     * @return The unique identifiers of the security groups that define the ports, protocols, and sources for inbound
     *         traffic that you are authorizing into your endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The unique identifiers of the security groups that define the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifiers of the security groups that define the ports, protocols, and sources for inbound
     *        traffic that you are authorizing into your endpoint.
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
     * The unique identifiers of the security groups that define the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifiers of the security groups that define the ports, protocols, and sources for inbound
     *        traffic that you are authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withSecurityGroupIds(String... securityGroupIds) {
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
     * The unique identifiers of the security groups that define the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifiers of the security groups that define the ports, protocols, and sources for inbound
     *        traffic that you are authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint.
     * @see VpcEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @return The current status of the endpoint.
     * @see VpcEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public VpcEndpointDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public VpcEndpointDetail withStatus(VpcEndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the subnets from which you access OpenSearch Serverless.
     * </p>
     * 
     * @return The ID of the subnets from which you access OpenSearch Serverless.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The ID of the subnets from which you access OpenSearch Serverless.
     * </p>
     * 
     * @param subnetIds
     *        The ID of the subnets from which you access OpenSearch Serverless.
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
     * The ID of the subnets from which you access OpenSearch Serverless.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The ID of the subnets from which you access OpenSearch Serverless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withSubnetIds(String... subnetIds) {
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
     * The ID of the subnets from which you access OpenSearch Serverless.
     * </p>
     * 
     * @param subnetIds
     *        The ID of the subnets from which you access OpenSearch Serverless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC from which you access OpenSearch Serverless
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC from which you access OpenSearch Serverless
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC from which you access OpenSearch Serverless
     * </p>
     * 
     * @return The ID of the VPC from which you access OpenSearch Serverless
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC from which you access OpenSearch Serverless
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC from which you access OpenSearch Serverless
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointDetail withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpointDetail == false)
            return false;
        VpcEndpointDetail other = (VpcEndpointDetail) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpointDetail clone() {
        try {
            return (VpcEndpointDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.VpcEndpointDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
