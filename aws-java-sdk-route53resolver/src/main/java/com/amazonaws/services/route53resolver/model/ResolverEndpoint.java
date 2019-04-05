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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In the response to a <a>CreateResolverEndpoint</a>, <a>DeleteResolverEndpoint</a>, <a>GetResolverEndpoint</a>,
 * <a>ListResolverEndpoints</a>, or <a>UpdateResolverEndpoint</a> request, a complex type that contains settings for an
 * existing inbound or outbound resolver endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the resolver endpoint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique string that identifies the request that created the resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver endpoint.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name that you assigned to the resolver endpoint when you submitted a <a>CreateResolverEndpoint</a> request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of one or more security groups that control access to this VPC. The security group must include one or
     * more inbound resolver rules.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     * </p>
     * </li>
     * </ul>
     */
    private String direction;
    /**
     * <p>
     * The number of IP addresses that the resolver endpoint can use for DNS queries.
     * </p>
     */
    private Integer ipAddressCount;
    /**
     * <p>
     * The ID of the VPC that you want to create the resolver endpoint in.
     * </p>
     */
    private String hostVPCId;
    /**
     * <p>
     * A code that specifies the current status of the resolver endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed description of the status of the resolver endpoint.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private String modificationTime;

    /**
     * <p>
     * The ID of the resolver endpoint.
     * </p>
     * 
     * @param id
     *        The ID of the resolver endpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resolver endpoint.
     * </p>
     * 
     * @return The ID of the resolver endpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resolver endpoint.
     * </p>
     * 
     * @param id
     *        The ID of the resolver endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request that created the resolver endpoint. The
     *        <code>CreatorRequestId</code> allows failed requests to be retried without the risk of executing the
     *        operation twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     * 
     * @return A unique string that identifies the request that created the resolver endpoint. The
     *         <code>CreatorRequestId</code> allows failed requests to be retried without the risk of executing the
     *         operation twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request that created the resolver endpoint. The
     *        <code>CreatorRequestId</code> allows failed requests to be retried without the risk of executing the
     *        operation twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver endpoint.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the resolver endpoint.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver endpoint.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the resolver endpoint.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver endpoint.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the resolver endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name that you assigned to the resolver endpoint when you submitted a <a>CreateResolverEndpoint</a> request.
     * </p>
     * 
     * @param name
     *        The name that you assigned to the resolver endpoint when you submitted a <a>CreateResolverEndpoint</a>
     *        request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you assigned to the resolver endpoint when you submitted a <a>CreateResolverEndpoint</a> request.
     * </p>
     * 
     * @return The name that you assigned to the resolver endpoint when you submitted a <a>CreateResolverEndpoint</a>
     *         request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you assigned to the resolver endpoint when you submitted a <a>CreateResolverEndpoint</a> request.
     * </p>
     * 
     * @param name
     *        The name that you assigned to the resolver endpoint when you submitted a <a>CreateResolverEndpoint</a>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of one or more security groups that control access to this VPC. The security group must include one or
     * more inbound resolver rules.
     * </p>
     * 
     * @return The ID of one or more security groups that control access to this VPC. The security group must include
     *         one or more inbound resolver rules.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The ID of one or more security groups that control access to this VPC. The security group must include one or
     * more inbound resolver rules.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that control access to this VPC. The security group must include one
     *        or more inbound resolver rules.
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
     * The ID of one or more security groups that control access to this VPC. The security group must include one or
     * more inbound resolver rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that control access to this VPC. The security group must include one
     *        or more inbound resolver rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withSecurityGroupIds(String... securityGroupIds) {
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
     * The ID of one or more security groups that control access to this VPC. The security group must include one or
     * more inbound resolver rules.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that control access to this VPC. The security group must include one
     *        or more inbound resolver rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Indicates whether the resolver endpoint allows inbound or outbound DNS queries:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     *        </p>
     *        </li>
     * @see ResolverEndpointDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the resolver endpoint allows inbound or outbound DNS queries:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     *         </p>
     *         </li>
     * @see ResolverEndpointDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Indicates whether the resolver endpoint allows inbound or outbound DNS queries:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointDirection
     */

    public ResolverEndpoint withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Indicates whether the resolver endpoint allows inbound or outbound DNS queries:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: allows DNS queries to your VPC from your network or another VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: allows DNS queries from your VPC to your network or another VPC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointDirection
     */

    public ResolverEndpoint withDirection(ResolverEndpointDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The number of IP addresses that the resolver endpoint can use for DNS queries.
     * </p>
     * 
     * @param ipAddressCount
     *        The number of IP addresses that the resolver endpoint can use for DNS queries.
     */

    public void setIpAddressCount(Integer ipAddressCount) {
        this.ipAddressCount = ipAddressCount;
    }

    /**
     * <p>
     * The number of IP addresses that the resolver endpoint can use for DNS queries.
     * </p>
     * 
     * @return The number of IP addresses that the resolver endpoint can use for DNS queries.
     */

    public Integer getIpAddressCount() {
        return this.ipAddressCount;
    }

    /**
     * <p>
     * The number of IP addresses that the resolver endpoint can use for DNS queries.
     * </p>
     * 
     * @param ipAddressCount
     *        The number of IP addresses that the resolver endpoint can use for DNS queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withIpAddressCount(Integer ipAddressCount) {
        setIpAddressCount(ipAddressCount);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC that you want to create the resolver endpoint in.
     * </p>
     * 
     * @param hostVPCId
     *        The ID of the VPC that you want to create the resolver endpoint in.
     */

    public void setHostVPCId(String hostVPCId) {
        this.hostVPCId = hostVPCId;
    }

    /**
     * <p>
     * The ID of the VPC that you want to create the resolver endpoint in.
     * </p>
     * 
     * @return The ID of the VPC that you want to create the resolver endpoint in.
     */

    public String getHostVPCId() {
        return this.hostVPCId;
    }

    /**
     * <p>
     * The ID of the VPC that you want to create the resolver endpoint in.
     * </p>
     * 
     * @param hostVPCId
     *        The ID of the VPC that you want to create the resolver endpoint in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withHostVPCId(String hostVPCId) {
        setHostVPCId(hostVPCId);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver endpoint.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the resolver endpoint.
     * @see ResolverEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver endpoint.
     * </p>
     * 
     * @return A code that specifies the current status of the resolver endpoint.
     * @see ResolverEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver endpoint.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the resolver endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointStatus
     */

    public ResolverEndpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver endpoint.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the resolver endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointStatus
     */

    public ResolverEndpoint withStatus(ResolverEndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed description of the status of the resolver endpoint.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of the resolver endpoint.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of the resolver endpoint.
     * </p>
     * 
     * @return A detailed description of the status of the resolver endpoint.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of the resolver endpoint.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of the resolver endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time
     *        (UTC).
     */

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverEndpoint withModificationTime(String modificationTime) {
        setModificationTime(modificationTime);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getIpAddressCount() != null)
            sb.append("IpAddressCount: ").append(getIpAddressCount()).append(",");
        if (getHostVPCId() != null)
            sb.append("HostVPCId: ").append(getHostVPCId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModificationTime() != null)
            sb.append("ModificationTime: ").append(getModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolverEndpoint == false)
            return false;
        ResolverEndpoint other = (ResolverEndpoint) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getIpAddressCount() == null ^ this.getIpAddressCount() == null)
            return false;
        if (other.getIpAddressCount() != null && other.getIpAddressCount().equals(this.getIpAddressCount()) == false)
            return false;
        if (other.getHostVPCId() == null ^ this.getHostVPCId() == null)
            return false;
        if (other.getHostVPCId() != null && other.getHostVPCId().equals(this.getHostVPCId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModificationTime() == null ^ this.getModificationTime() == null)
            return false;
        if (other.getModificationTime() != null && other.getModificationTime().equals(this.getModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getIpAddressCount() == null) ? 0 : getIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getHostVPCId() == null) ? 0 : getHostVPCId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public ResolverEndpoint clone() {
        try {
            return (ResolverEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.ResolverEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
