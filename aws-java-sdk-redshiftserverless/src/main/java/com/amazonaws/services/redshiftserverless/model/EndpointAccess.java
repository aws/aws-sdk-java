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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon Redshift Serverless VPC endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/EndpointAccess" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     */
    private java.util.Date endpointCreateTime;
    /**
     * <p>
     * The name of the VPC endpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The status of the VPC endpoint.
     * </p>
     */
    private String endpointStatus;
    /**
     * <p>
     * The port number on which Amazon Redshift Serverless accepts incoming connections.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The connection endpoint for connecting to Amazon Redshift Serverless.
     * </p>
     */
    private VpcEndpoint vpcEndpoint;
    /**
     * <p>
     * The security groups associated with the endpoint.
     * </p>
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups;
    /**
     * <p>
     * The name of the workgroup associated with the endpoint.
     * </p>
     */
    private String workgroupName;

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

    public EndpointAccess withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the VPC endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     * 
     * @param endpointCreateTime
     *        The time that the endpoint was created.
     */

    public void setEndpointCreateTime(java.util.Date endpointCreateTime) {
        this.endpointCreateTime = endpointCreateTime;
    }

    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     * 
     * @return The time that the endpoint was created.
     */

    public java.util.Date getEndpointCreateTime() {
        return this.endpointCreateTime;
    }

    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     * 
     * @param endpointCreateTime
     *        The time that the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withEndpointCreateTime(java.util.Date endpointCreateTime) {
        setEndpointCreateTime(endpointCreateTime);
        return this;
    }

    /**
     * <p>
     * The name of the VPC endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the VPC endpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the VPC endpoint.
     * </p>
     * 
     * @return The name of the VPC endpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the VPC endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The status of the VPC endpoint.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the VPC endpoint.
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The status of the VPC endpoint.
     * </p>
     * 
     * @return The status of the VPC endpoint.
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * The status of the VPC endpoint.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The port number on which Amazon Redshift Serverless accepts incoming connections.
     * </p>
     * 
     * @param port
     *        The port number on which Amazon Redshift Serverless accepts incoming connections.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which Amazon Redshift Serverless accepts incoming connections.
     * </p>
     * 
     * @return The port number on which Amazon Redshift Serverless accepts incoming connections.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which Amazon Redshift Serverless accepts incoming connections.
     * </p>
     * 
     * @param port
     *        The port number on which Amazon Redshift Serverless accepts incoming connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     * </p>
     * 
     * @return The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
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
     * The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withSubnetIds(String... subnetIds) {
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
     * The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The connection endpoint for connecting to Amazon Redshift Serverless.
     * </p>
     * 
     * @param vpcEndpoint
     *        The connection endpoint for connecting to Amazon Redshift Serverless.
     */

    public void setVpcEndpoint(VpcEndpoint vpcEndpoint) {
        this.vpcEndpoint = vpcEndpoint;
    }

    /**
     * <p>
     * The connection endpoint for connecting to Amazon Redshift Serverless.
     * </p>
     * 
     * @return The connection endpoint for connecting to Amazon Redshift Serverless.
     */

    public VpcEndpoint getVpcEndpoint() {
        return this.vpcEndpoint;
    }

    /**
     * <p>
     * The connection endpoint for connecting to Amazon Redshift Serverless.
     * </p>
     * 
     * @param vpcEndpoint
     *        The connection endpoint for connecting to Amazon Redshift Serverless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withVpcEndpoint(VpcEndpoint vpcEndpoint) {
        setVpcEndpoint(vpcEndpoint);
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

        this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroups);
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

    public EndpointAccess withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
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

    public EndpointAccess withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup associated with the endpoint.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the endpoint.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the endpoint.
     * </p>
     * 
     * @return The name of the workgroup associated with the endpoint.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the endpoint.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAccess withWorkgroupName(String workgroupName) {
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getEndpointCreateTime() != null)
            sb.append("EndpointCreateTime: ").append(getEndpointCreateTime()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcEndpoint() != null)
            sb.append("VpcEndpoint: ").append(getVpcEndpoint()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups()).append(",");
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

        if (obj instanceof EndpointAccess == false)
            return false;
        EndpointAccess other = (EndpointAccess) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getEndpointCreateTime() == null ^ this.getEndpointCreateTime() == null)
            return false;
        if (other.getEndpointCreateTime() != null && other.getEndpointCreateTime().equals(this.getEndpointCreateTime()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcEndpoint() == null ^ this.getVpcEndpoint() == null)
            return false;
        if (other.getVpcEndpoint() != null && other.getVpcEndpoint().equals(this.getVpcEndpoint()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
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

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointCreateTime() == null) ? 0 : getEndpointCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpoint() == null) ? 0 : getVpcEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public EndpointAccess clone() {
        try {
            return (EndpointAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.EndpointAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
