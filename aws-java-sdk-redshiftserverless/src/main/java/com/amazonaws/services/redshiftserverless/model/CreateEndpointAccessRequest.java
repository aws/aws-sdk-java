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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateEndpointAccess"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9,
     * and hyphen(-). The first character must be a letter. The name can't contain two consecutive hyphens or end with a
     * hyphen.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC endpoint.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The unique identifiers of the security group that defines the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The name of the workgroup to associate with the VPC endpoint.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9,
     * and hyphen(-). The first character must be a letter. The name can't contain two consecutive hyphens or end with a
     * hyphen.
     * </p>
     * 
     * @param endpointName
     *        The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z,
     *        a-z, 0-9, and hyphen(-). The first character must be a letter. The name can't contain two consecutive
     *        hyphens or end with a hyphen.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9,
     * and hyphen(-). The first character must be a letter. The name can't contain two consecutive hyphens or end with a
     * hyphen.
     * </p>
     * 
     * @return The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z,
     *         a-z, 0-9, and hyphen(-). The first character must be a letter. The name can't contain two consecutive
     *         hyphens or end with a hyphen.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9,
     * and hyphen(-). The first character must be a letter. The name can't contain two consecutive hyphens or end with a
     * hyphen.
     * </p>
     * 
     * @param endpointName
     *        The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z,
     *        a-z, 0-9, and hyphen(-). The first character must be a letter. The name can't contain two consecutive
     *        hyphens or end with a hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC endpoint.
     * </p>
     * 
     * @return The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC
     *         endpoint.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC
     *        endpoint.
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
     * The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withSubnetIds(String... subnetIds) {
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
     * The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the security group that defines the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * 
     * @return The unique identifiers of the security group that defines the ports, protocols, and sources for inbound
     *         traffic that you are authorizing into your endpoint.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * The unique identifiers of the security group that defines the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The unique identifiers of the security group that defines the ports, protocols, and sources for inbound
     *        traffic that you are authorizing into your endpoint.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * The unique identifiers of the security group that defines the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The unique identifiers of the security group that defines the ports, protocols, and sources for inbound
     *        traffic that you are authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the security group that defines the ports, protocols, and sources for inbound traffic
     * that you are authorizing into your endpoint.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The unique identifiers of the security group that defines the ports, protocols, and sources for inbound
     *        traffic that you are authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup to associate with the VPC endpoint.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup to associate with the VPC endpoint.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup to associate with the VPC endpoint.
     * </p>
     * 
     * @return The name of the workgroup to associate with the VPC endpoint.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup to associate with the VPC endpoint.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup to associate with the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointAccessRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
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
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointAccessRequest clone() {
        return (CreateEndpointAccessRequest) super.clone();
    }

}
