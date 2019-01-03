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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResolverEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of one or more security groups that you want to use to control access to this VPC. The security group that
     * you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for
     * outbound resolver endpoints).
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or another
     * VPC
     * </p>
     * </li>
     * </ul>
     */
    private String direction;
    /**
     * <p>
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs to
     * your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound resolver
     * endpoints).
     * </p>
     */
    private java.util.List<IpAddressRequest> ipAddresses;
    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed requests to be retried without the
     *         risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for
     *         example, a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @param name
     *        A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53
     *        console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @return A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53
     *         console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @param name
     *        A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53
     *        console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of one or more security groups that you want to use to control access to this VPC. The security group that
     * you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for
     * outbound resolver endpoints).
     * </p>
     * 
     * @return The ID of one or more security groups that you want to use to control access to this VPC. The security
     *         group that you specify must include one or more inbound rules (for inbound resolver endpoints) or
     *         outbound rules (for outbound resolver endpoints).
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The ID of one or more security groups that you want to use to control access to this VPC. The security group that
     * you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for
     * outbound resolver endpoints).
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that you want to use to control access to this VPC. The security
     *        group that you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound
     *        rules (for outbound resolver endpoints).
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
     * The ID of one or more security groups that you want to use to control access to this VPC. The security group that
     * you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for
     * outbound resolver endpoints).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that you want to use to control access to this VPC. The security
     *        group that you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound
     *        rules (for outbound resolver endpoints).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * The ID of one or more security groups that you want to use to control access to this VPC. The security group that
     * you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for
     * outbound resolver endpoints).
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that you want to use to control access to this VPC. The security
     *        group that you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound
     *        rules (for outbound resolver endpoints).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or another
     * VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Specify the applicable value:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or
     *        another VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or
     *        another VPC
     *        </p>
     *        </li>
     * @see ResolverEndpointDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or another
     * VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the applicable value:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or
     *         another VPC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or
     *         another VPC
     *         </p>
     *         </li>
     * @see ResolverEndpointDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or another
     * VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Specify the applicable value:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or
     *        another VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or
     *        another VPC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointDirection
     */

    public CreateResolverEndpointRequest withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or another
     * VPC
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Specify the applicable value:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network or
     *        another VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network or
     *        another VPC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointDirection
     */

    public CreateResolverEndpointRequest withDirection(ResolverEndpointDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs to
     * your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound resolver
     * endpoints).
     * </p>
     * 
     * @return The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your
     *         VPCs to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound
     *         resolver endpoints).
     */

    public java.util.List<IpAddressRequest> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * <p>
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs to
     * your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound resolver
     * endpoints).
     * </p>
     * 
     * @param ipAddresses
     *        The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your
     *        VPCs to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound
     *        resolver endpoints).
     */

    public void setIpAddresses(java.util.Collection<IpAddressRequest> ipAddresses) {
        if (ipAddresses == null) {
            this.ipAddresses = null;
            return;
        }

        this.ipAddresses = new java.util.ArrayList<IpAddressRequest>(ipAddresses);
    }

    /**
     * <p>
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs to
     * your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound resolver
     * endpoints).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAddresses(java.util.Collection)} or {@link #withIpAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipAddresses
     *        The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your
     *        VPCs to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound
     *        resolver endpoints).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withIpAddresses(IpAddressRequest... ipAddresses) {
        if (this.ipAddresses == null) {
            setIpAddresses(new java.util.ArrayList<IpAddressRequest>(ipAddresses.length));
        }
        for (IpAddressRequest ele : ipAddresses) {
            this.ipAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs to
     * your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound resolver
     * endpoints).
     * </p>
     * 
     * @param ipAddresses
     *        The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your
     *        VPCs to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound
     *        resolver endpoints).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withIpAddresses(java.util.Collection<IpAddressRequest> ipAddresses) {
        setIpAddresses(ipAddresses);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to associate with the endpoint.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the endpoint.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getIpAddresses() != null)
            sb.append("IpAddresses: ").append(getIpAddresses()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResolverEndpointRequest == false)
            return false;
        CreateResolverEndpointRequest other = (CreateResolverEndpointRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
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
        if (other.getIpAddresses() == null ^ this.getIpAddresses() == null)
            return false;
        if (other.getIpAddresses() != null && other.getIpAddresses().equals(this.getIpAddresses()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getIpAddresses() == null) ? 0 : getIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateResolverEndpointRequest clone() {
        return (CreateResolverEndpointRequest) super.clone();
    }

}
