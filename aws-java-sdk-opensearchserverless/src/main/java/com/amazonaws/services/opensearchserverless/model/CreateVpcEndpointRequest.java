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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateVpcEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the interface endpoint.
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
     * The ID of one or more subnets from which you'll access OpenSearch Serverless.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The ID of the VPC from which you'll access OpenSearch Serverless.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the interface endpoint.
     * </p>
     * 
     * @param name
     *        The name of the interface endpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the interface endpoint.
     * </p>
     * 
     * @return The name of the interface endpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the interface endpoint.
     * </p>
     * 
     * @param name
     *        The name of the interface endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withName(String name) {
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

    public CreateVpcEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
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

    public CreateVpcEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of one or more subnets from which you'll access OpenSearch Serverless.
     * </p>
     * 
     * @return The ID of one or more subnets from which you'll access OpenSearch Serverless.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The ID of one or more subnets from which you'll access OpenSearch Serverless.
     * </p>
     * 
     * @param subnetIds
     *        The ID of one or more subnets from which you'll access OpenSearch Serverless.
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
     * The ID of one or more subnets from which you'll access OpenSearch Serverless.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The ID of one or more subnets from which you'll access OpenSearch Serverless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withSubnetIds(String... subnetIds) {
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
     * The ID of one or more subnets from which you'll access OpenSearch Serverless.
     * </p>
     * 
     * @param subnetIds
     *        The ID of one or more subnets from which you'll access OpenSearch Serverless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC from which you'll access OpenSearch Serverless.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC from which you'll access OpenSearch Serverless.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC from which you'll access OpenSearch Serverless.
     * </p>
     * 
     * @return The ID of the VPC from which you'll access OpenSearch Serverless.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC from which you'll access OpenSearch Serverless.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC from which you'll access OpenSearch Serverless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withVpcId(String vpcId) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
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

        if (obj instanceof CreateVpcEndpointRequest == false)
            return false;
        CreateVpcEndpointRequest other = (CreateVpcEndpointRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcEndpointRequest clone() {
        return (CreateVpcEndpointRequest) super.clone();
    }

}
