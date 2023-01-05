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
 * Update details for an OpenSearch Serverless-managed interface endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateVpcEndpointDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcEndpointDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp of when the endpoint was last modified.
     * </p>
     */
    private Long lastModifiedDate;
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
     * The current status of the endpoint update process.
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

    public UpdateVpcEndpointDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the endpoint was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The timestamp of when the endpoint was last modified.
     */

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The timestamp of when the endpoint was last modified.
     * </p>
     * 
     * @return The timestamp of when the endpoint was last modified.
     */

    public Long getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The timestamp of when the endpoint was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The timestamp of when the endpoint was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointDetail withLastModifiedDate(Long lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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

    public UpdateVpcEndpointDetail withName(String name) {
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

    public UpdateVpcEndpointDetail withSecurityGroupIds(String... securityGroupIds) {
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

    public UpdateVpcEndpointDetail withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint update process.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint update process.
     * @see VpcEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the endpoint update process.
     * </p>
     * 
     * @return The current status of the endpoint update process.
     * @see VpcEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the endpoint update process.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint update process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public UpdateVpcEndpointDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint update process.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint update process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public UpdateVpcEndpointDetail withStatus(VpcEndpointStatus status) {
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

    public UpdateVpcEndpointDetail withSubnetIds(String... subnetIds) {
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

    public UpdateVpcEndpointDetail withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVpcEndpointDetail == false)
            return false;
        UpdateVpcEndpointDetail other = (UpdateVpcEndpointDetail) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcEndpointDetail clone() {
        try {
            return (UpdateVpcEndpointDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.UpdateVpcEndpointDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
