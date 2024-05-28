/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary metadata that describes a VPC connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/VPCConnectionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VPCConnectionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     */
    private String vPCConnectionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The display name for the VPC connection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon EC2 VPC ID associated with the VPC connection.
     * </p>
     */
    private String vPCId;
    /**
     * <p>
     * The Amazon EC2 security group IDs associated with the VPC connection.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * </p>
     */
    private java.util.List<String> dnsResolvers;
    /**
     * <p>
     * The status of the VPC connection.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     */
    private String availabilityStatus;
    /**
     * <p>
     * A list of network interfaces.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;
    /**
     * <p>
     * The ARN of the IAM role associated with the VPC connection.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The time that the VPC connection was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that the VPC connection was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web
     *        Services Region in an Amazon Web Services account.
     */

    public void setVPCConnectionId(String vPCConnectionId) {
        this.vPCConnectionId = vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     * 
     * @return The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web
     *         Services Region in an Amazon Web Services account.
     */

    public String getVPCConnectionId() {
        return this.vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web
     *        Services Region in an Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withVPCConnectionId(String vPCConnectionId) {
        setVPCConnectionId(vPCConnectionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the VPC connection.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC connection.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The display name for the VPC connection.
     * </p>
     * 
     * @param name
     *        The display name for the VPC connection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for the VPC connection.
     * </p>
     * 
     * @return The display name for the VPC connection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name for the VPC connection.
     * </p>
     * 
     * @param name
     *        The display name for the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 VPC ID associated with the VPC connection.
     * </p>
     * 
     * @param vPCId
     *        The Amazon EC2 VPC ID associated with the VPC connection.
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The Amazon EC2 VPC ID associated with the VPC connection.
     * </p>
     * 
     * @return The Amazon EC2 VPC ID associated with the VPC connection.
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * <p>
     * The Amazon EC2 VPC ID associated with the VPC connection.
     * </p>
     * 
     * @param vPCId
     *        The Amazon EC2 VPC ID associated with the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withVPCId(String vPCId) {
        setVPCId(vPCId);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 security group IDs associated with the VPC connection.
     * </p>
     * 
     * @return The Amazon EC2 security group IDs associated with the VPC connection.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The Amazon EC2 security group IDs associated with the VPC connection.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security group IDs associated with the VPC connection.
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
     * The Amazon EC2 security group IDs associated with the VPC connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security group IDs associated with the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withSecurityGroupIds(String... securityGroupIds) {
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
     * The Amazon EC2 security group IDs associated with the VPC connection.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security group IDs associated with the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * </p>
     * 
     * @return A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */

    public java.util.List<String> getDnsResolvers() {
        return dnsResolvers;
    }

    /**
     * <p>
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * </p>
     * 
     * @param dnsResolvers
     *        A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */

    public void setDnsResolvers(java.util.Collection<String> dnsResolvers) {
        if (dnsResolvers == null) {
            this.dnsResolvers = null;
            return;
        }

        this.dnsResolvers = new java.util.ArrayList<String>(dnsResolvers);
    }

    /**
     * <p>
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsResolvers(java.util.Collection)} or {@link #withDnsResolvers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsResolvers
     *        A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withDnsResolvers(String... dnsResolvers) {
        if (this.dnsResolvers == null) {
            setDnsResolvers(new java.util.ArrayList<String>(dnsResolvers.length));
        }
        for (String ele : dnsResolvers) {
            this.dnsResolvers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * </p>
     * 
     * @param dnsResolvers
     *        A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withDnsResolvers(java.util.Collection<String> dnsResolvers) {
        setDnsResolvers(dnsResolvers);
        return this;
    }

    /**
     * <p>
     * The status of the VPC connection.
     * </p>
     * 
     * @param status
     *        The status of the VPC connection.
     * @see VPCConnectionResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC connection.
     * </p>
     * 
     * @return The status of the VPC connection.
     * @see VPCConnectionResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the VPC connection.
     * </p>
     * 
     * @param status
     *        The status of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionResourceStatus
     */

    public VPCConnectionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the VPC connection.
     * </p>
     * 
     * @param status
     *        The status of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionResourceStatus
     */

    public VPCConnectionSummary withStatus(VPCConnectionResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @param availabilityStatus
     *        The availability status of the VPC connection.
     * @see VPCConnectionAvailabilityStatus
     */

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @return The availability status of the VPC connection.
     * @see VPCConnectionAvailabilityStatus
     */

    public String getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @param availabilityStatus
     *        The availability status of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionAvailabilityStatus
     */

    public VPCConnectionSummary withAvailabilityStatus(String availabilityStatus) {
        setAvailabilityStatus(availabilityStatus);
        return this;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @param availabilityStatus
     *        The availability status of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionAvailabilityStatus
     */

    public VPCConnectionSummary withAvailabilityStatus(VPCConnectionAvailabilityStatus availabilityStatus) {
        this.availabilityStatus = availabilityStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of network interfaces.
     * </p>
     * 
     * @return A list of network interfaces.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * A list of network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        A list of network interfaces.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * A list of network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        A list of network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        A list of network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the VPC connection.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role associated with the VPC connection.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the VPC connection.
     * </p>
     * 
     * @return The ARN of the IAM role associated with the VPC connection.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the VPC connection.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role associated with the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The time that the VPC connection was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the VPC connection was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the VPC connection was created.
     * </p>
     * 
     * @return The time that the VPC connection was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that the VPC connection was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the VPC connection was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that the VPC connection was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the VPC connection was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the VPC connection was last updated.
     * </p>
     * 
     * @return The time that the VPC connection was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the VPC connection was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the VPC connection was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConnectionSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getVPCConnectionId() != null)
            sb.append("VPCConnectionId: ").append(getVPCConnectionId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getDnsResolvers() != null)
            sb.append("DnsResolvers: ").append(getDnsResolvers()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAvailabilityStatus() != null)
            sb.append("AvailabilityStatus: ").append(getAvailabilityStatus()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VPCConnectionSummary == false)
            return false;
        VPCConnectionSummary other = (VPCConnectionSummary) obj;
        if (other.getVPCConnectionId() == null ^ this.getVPCConnectionId() == null)
            return false;
        if (other.getVPCConnectionId() != null && other.getVPCConnectionId().equals(this.getVPCConnectionId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getDnsResolvers() == null ^ this.getDnsResolvers() == null)
            return false;
        if (other.getDnsResolvers() != null && other.getDnsResolvers().equals(this.getDnsResolvers()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAvailabilityStatus() == null ^ this.getAvailabilityStatus() == null)
            return false;
        if (other.getAvailabilityStatus() != null && other.getAvailabilityStatus().equals(this.getAvailabilityStatus()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVPCConnectionId() == null) ? 0 : getVPCConnectionId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDnsResolvers() == null) ? 0 : getDnsResolvers().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityStatus() == null) ? 0 : getAvailabilityStatus().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public VPCConnectionSummary clone() {
        try {
            return (VPCConnectionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.VPCConnectionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
