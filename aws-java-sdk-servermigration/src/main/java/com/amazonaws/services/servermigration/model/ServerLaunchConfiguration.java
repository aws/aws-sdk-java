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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Launch configuration for a server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerLaunchConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerLaunchConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the server the launch configuration is associated with.
     * </p>
     */
    private Server server;
    /**
     * <p>
     * Logical ID of the server in the Amazon CloudFormation template.
     * </p>
     */
    private String logicalId;
    /**
     * <p>
     * Identifier of the VPC the server should be launched into.
     * </p>
     */
    private String vpc;
    /**
     * <p>
     * Identifier of the subnet the server should be launched into.
     * </p>
     */
    private String subnet;
    /**
     * <p>
     * Identifier of the security group that applies to the launched server.
     * </p>
     */
    private String securityGroup;
    /**
     * <p>
     * Name of the EC2 SSH Key to be used for connecting to the launched server.
     * </p>
     */
    private String ec2KeyName;
    /**
     * <p>
     * Location of the user-data script to be executed when launching the server.
     * </p>
     */
    private UserData userData;
    /**
     * <p>
     * Instance type to be used for launching the server.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * If true, a publicly accessible IP address is created when launching the server.
     * </p>
     */
    private Boolean associatePublicIpAddress;

    /**
     * <p>
     * Identifier of the server the launch configuration is associated with.
     * </p>
     * 
     * @param server
     *        Identifier of the server the launch configuration is associated with.
     */

    public void setServer(Server server) {
        this.server = server;
    }

    /**
     * <p>
     * Identifier of the server the launch configuration is associated with.
     * </p>
     * 
     * @return Identifier of the server the launch configuration is associated with.
     */

    public Server getServer() {
        return this.server;
    }

    /**
     * <p>
     * Identifier of the server the launch configuration is associated with.
     * </p>
     * 
     * @param server
     *        Identifier of the server the launch configuration is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withServer(Server server) {
        setServer(server);
        return this;
    }

    /**
     * <p>
     * Logical ID of the server in the Amazon CloudFormation template.
     * </p>
     * 
     * @param logicalId
     *        Logical ID of the server in the Amazon CloudFormation template.
     */

    public void setLogicalId(String logicalId) {
        this.logicalId = logicalId;
    }

    /**
     * <p>
     * Logical ID of the server in the Amazon CloudFormation template.
     * </p>
     * 
     * @return Logical ID of the server in the Amazon CloudFormation template.
     */

    public String getLogicalId() {
        return this.logicalId;
    }

    /**
     * <p>
     * Logical ID of the server in the Amazon CloudFormation template.
     * </p>
     * 
     * @param logicalId
     *        Logical ID of the server in the Amazon CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withLogicalId(String logicalId) {
        setLogicalId(logicalId);
        return this;
    }

    /**
     * <p>
     * Identifier of the VPC the server should be launched into.
     * </p>
     * 
     * @param vpc
     *        Identifier of the VPC the server should be launched into.
     */

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * Identifier of the VPC the server should be launched into.
     * </p>
     * 
     * @return Identifier of the VPC the server should be launched into.
     */

    public String getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * Identifier of the VPC the server should be launched into.
     * </p>
     * 
     * @param vpc
     *        Identifier of the VPC the server should be launched into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withVpc(String vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * Identifier of the subnet the server should be launched into.
     * </p>
     * 
     * @param subnet
     *        Identifier of the subnet the server should be launched into.
     */

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    /**
     * <p>
     * Identifier of the subnet the server should be launched into.
     * </p>
     * 
     * @return Identifier of the subnet the server should be launched into.
     */

    public String getSubnet() {
        return this.subnet;
    }

    /**
     * <p>
     * Identifier of the subnet the server should be launched into.
     * </p>
     * 
     * @param subnet
     *        Identifier of the subnet the server should be launched into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withSubnet(String subnet) {
        setSubnet(subnet);
        return this;
    }

    /**
     * <p>
     * Identifier of the security group that applies to the launched server.
     * </p>
     * 
     * @param securityGroup
     *        Identifier of the security group that applies to the launched server.
     */

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    /**
     * <p>
     * Identifier of the security group that applies to the launched server.
     * </p>
     * 
     * @return Identifier of the security group that applies to the launched server.
     */

    public String getSecurityGroup() {
        return this.securityGroup;
    }

    /**
     * <p>
     * Identifier of the security group that applies to the launched server.
     * </p>
     * 
     * @param securityGroup
     *        Identifier of the security group that applies to the launched server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withSecurityGroup(String securityGroup) {
        setSecurityGroup(securityGroup);
        return this;
    }

    /**
     * <p>
     * Name of the EC2 SSH Key to be used for connecting to the launched server.
     * </p>
     * 
     * @param ec2KeyName
     *        Name of the EC2 SSH Key to be used for connecting to the launched server.
     */

    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    /**
     * <p>
     * Name of the EC2 SSH Key to be used for connecting to the launched server.
     * </p>
     * 
     * @return Name of the EC2 SSH Key to be used for connecting to the launched server.
     */

    public String getEc2KeyName() {
        return this.ec2KeyName;
    }

    /**
     * <p>
     * Name of the EC2 SSH Key to be used for connecting to the launched server.
     * </p>
     * 
     * @param ec2KeyName
     *        Name of the EC2 SSH Key to be used for connecting to the launched server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withEc2KeyName(String ec2KeyName) {
        setEc2KeyName(ec2KeyName);
        return this;
    }

    /**
     * <p>
     * Location of the user-data script to be executed when launching the server.
     * </p>
     * 
     * @param userData
     *        Location of the user-data script to be executed when launching the server.
     */

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * Location of the user-data script to be executed when launching the server.
     * </p>
     * 
     * @return Location of the user-data script to be executed when launching the server.
     */

    public UserData getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * Location of the user-data script to be executed when launching the server.
     * </p>
     * 
     * @param userData
     *        Location of the user-data script to be executed when launching the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withUserData(UserData userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * Instance type to be used for launching the server.
     * </p>
     * 
     * @param instanceType
     *        Instance type to be used for launching the server.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Instance type to be used for launching the server.
     * </p>
     * 
     * @return Instance type to be used for launching the server.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Instance type to be used for launching the server.
     * </p>
     * 
     * @param instanceType
     *        Instance type to be used for launching the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * If true, a publicly accessible IP address is created when launching the server.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        If true, a publicly accessible IP address is created when launching the server.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * If true, a publicly accessible IP address is created when launching the server.
     * </p>
     * 
     * @return If true, a publicly accessible IP address is created when launching the server.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * If true, a publicly accessible IP address is created when launching the server.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        If true, a publicly accessible IP address is created when launching the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerLaunchConfiguration withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * If true, a publicly accessible IP address is created when launching the server.
     * </p>
     * 
     * @return If true, a publicly accessible IP address is created when launching the server.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
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
        if (getServer() != null)
            sb.append("Server: ").append(getServer()).append(",");
        if (getLogicalId() != null)
            sb.append("LogicalId: ").append(getLogicalId()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc()).append(",");
        if (getSubnet() != null)
            sb.append("Subnet: ").append(getSubnet()).append(",");
        if (getSecurityGroup() != null)
            sb.append("SecurityGroup: ").append(getSecurityGroup()).append(",");
        if (getEc2KeyName() != null)
            sb.append("Ec2KeyName: ").append(getEc2KeyName()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: ").append(getAssociatePublicIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerLaunchConfiguration == false)
            return false;
        ServerLaunchConfiguration other = (ServerLaunchConfiguration) obj;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        if (other.getLogicalId() == null ^ this.getLogicalId() == null)
            return false;
        if (other.getLogicalId() != null && other.getLogicalId().equals(this.getLogicalId()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getSubnet() == null ^ this.getSubnet() == null)
            return false;
        if (other.getSubnet() != null && other.getSubnet().equals(this.getSubnet()) == false)
            return false;
        if (other.getSecurityGroup() == null ^ this.getSecurityGroup() == null)
            return false;
        if (other.getSecurityGroup() != null && other.getSecurityGroup().equals(this.getSecurityGroup()) == false)
            return false;
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null)
            return false;
        if (other.getEc2KeyName() != null && other.getEc2KeyName().equals(this.getEc2KeyName()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAssociatePublicIpAddress() == null ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        hashCode = prime * hashCode + ((getLogicalId() == null) ? 0 : getLogicalId().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getSubnet() == null) ? 0 : getSubnet().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroup() == null) ? 0 : getSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public ServerLaunchConfiguration clone() {
        try {
            return (ServerLaunchConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerLaunchConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
