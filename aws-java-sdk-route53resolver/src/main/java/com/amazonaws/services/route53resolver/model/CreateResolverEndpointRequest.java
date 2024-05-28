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
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
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
     * you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound rules (for
     * outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For inbound access, open
     * port 53. For outbound access, open the port that you're using for DNS queries on your network.
     * </p>
     * <p>
     * Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     * potentially impact the maximum queries per second from outbound endpoint to your target name server. For inbound
     * resolver endpoint, it can bring down the overall maximum queries per second per IP address to as low as 1500. To
     * avoid connection tracking caused by security group, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     * >Untracked connections</a>.
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
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
     * </p>
     * </li>
     * </ul>
     */
    private String direction;
    /**
     * <p>
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you
     * forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC.
     * </p>
     * <note>
     * <p>
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     * </p>
     * </note>
     */
    private java.util.List<IpAddressRequest> ipAddresses;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * The instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     */
    private String preferredInstanceType;
    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it will
     * resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * </p>
     */
    private String resolverEndpointType;
    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed requests to be retried without the
     *         risk of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example,
     *         a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
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
     * you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound rules (for
     * outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For inbound access, open
     * port 53. For outbound access, open the port that you're using for DNS queries on your network.
     * </p>
     * <p>
     * Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     * potentially impact the maximum queries per second from outbound endpoint to your target name server. For inbound
     * resolver endpoint, it can bring down the overall maximum queries per second per IP address to as low as 1500. To
     * avoid connection tracking caused by security group, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     * >Untracked connections</a>.
     * </p>
     * 
     * @return The ID of one or more security groups that you want to use to control access to this VPC. The security
     *         group that you specify must include one or more inbound rules (for inbound Resolver endpoints) or
     *         outbound rules (for outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP
     *         access. For inbound access, open port 53. For outbound access, open the port that you're using for DNS
     *         queries on your network.</p>
     *         <p>
     *         Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it
     *         can potentially impact the maximum queries per second from outbound endpoint to your target name server.
     *         For inbound resolver endpoint, it can bring down the overall maximum queries per second per IP address to
     *         as low as 1500. To avoid connection tracking caused by security group, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     *         >Untracked connections</a>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The ID of one or more security groups that you want to use to control access to this VPC. The security group that
     * you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound rules (for
     * outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For inbound access, open
     * port 53. For outbound access, open the port that you're using for DNS queries on your network.
     * </p>
     * <p>
     * Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     * potentially impact the maximum queries per second from outbound endpoint to your target name server. For inbound
     * resolver endpoint, it can bring down the overall maximum queries per second per IP address to as low as 1500. To
     * avoid connection tracking caused by security group, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     * >Untracked connections</a>.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that you want to use to control access to this VPC. The security
     *        group that you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound
     *        rules (for outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     *        inbound access, open port 53. For outbound access, open the port that you're using for DNS queries on your
     *        network.</p>
     *        <p>
     *        Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     *        potentially impact the maximum queries per second from outbound endpoint to your target name server. For
     *        inbound resolver endpoint, it can bring down the overall maximum queries per second per IP address to as
     *        low as 1500. To avoid connection tracking caused by security group, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     *        >Untracked connections</a>.
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
     * you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound rules (for
     * outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For inbound access, open
     * port 53. For outbound access, open the port that you're using for DNS queries on your network.
     * </p>
     * <p>
     * Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     * potentially impact the maximum queries per second from outbound endpoint to your target name server. For inbound
     * resolver endpoint, it can bring down the overall maximum queries per second per IP address to as low as 1500. To
     * avoid connection tracking caused by security group, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     * >Untracked connections</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that you want to use to control access to this VPC. The security
     *        group that you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound
     *        rules (for outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     *        inbound access, open port 53. For outbound access, open the port that you're using for DNS queries on your
     *        network.</p>
     *        <p>
     *        Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     *        potentially impact the maximum queries per second from outbound endpoint to your target name server. For
     *        inbound resolver endpoint, it can bring down the overall maximum queries per second per IP address to as
     *        low as 1500. To avoid connection tracking caused by security group, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     *        >Untracked connections</a>.
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
     * you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound rules (for
     * outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For inbound access, open
     * port 53. For outbound access, open the port that you're using for DNS queries on your network.
     * </p>
     * <p>
     * Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     * potentially impact the maximum queries per second from outbound endpoint to your target name server. For inbound
     * resolver endpoint, it can bring down the overall maximum queries per second per IP address to as low as 1500. To
     * avoid connection tracking caused by security group, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     * >Untracked connections</a>.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of one or more security groups that you want to use to control access to this VPC. The security
     *        group that you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound
     *        rules (for outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     *        inbound access, open port 53. For outbound access, open the port that you're using for DNS queries on your
     *        network.</p>
     *        <p>
     *        Some security group rules will cause your connection to be tracked. For outbound resolver endpoint, it can
     *        potentially impact the maximum queries per second from outbound endpoint to your target name server. For
     *        inbound resolver endpoint, it can bring down the overall maximum queries per second per IP address to as
     *        low as 1500. To avoid connection tracking caused by security group, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#untracked-connectionsl"
     *        >Untracked connections</a>.
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
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Specify the applicable value:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
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
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the applicable value:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
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
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Specify the applicable value:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
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
     * <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        Specify the applicable value:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INBOUND</code>: Resolver forwards DNS queries to the DNS service for a VPC from your network
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTBOUND</code>: Resolver forwards DNS queries from the DNS service for a VPC to your network
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
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you
     * forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC.
     * </p>
     * <note>
     * <p>
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     * </p>
     * </note>
     * 
     * @return The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that
     *         you forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC. </p> <note>
     *         <p>
     *         Even though the minimum is 1, Route 53 requires that you create at least two.
     *         </p>
     */

    public java.util.List<IpAddressRequest> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * <p>
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you
     * forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC.
     * </p>
     * <note>
     * <p>
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     * </p>
     * </note>
     * 
     * @param ipAddresses
     *        The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that
     *        you forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC. </p> <note>
     *        <p>
     *        Even though the minimum is 1, Route 53 requires that you create at least two.
     *        </p>
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
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you
     * forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC.
     * </p>
     * <note>
     * <p>
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAddresses(java.util.Collection)} or {@link #withIpAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipAddresses
     *        The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that
     *        you forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC. </p> <note>
     *        <p>
     *        Even though the minimum is 1, Route 53 requires that you create at least two.
     *        </p>
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
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you
     * forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC.
     * </p>
     * <note>
     * <p>
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     * </p>
     * </note>
     * 
     * @param ipAddresses
     *        The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that
     *        you forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC. </p> <note>
     *        <p>
     *        Even though the minimum is 1, Route 53 requires that you create at least two.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withIpAddresses(java.util.Collection<IpAddressRequest> ipAddresses) {
        setIpAddresses(ipAddresses);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     *        <code>PreferredInstanceType</code>.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     *         <code>PreferredInstanceType</code>.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     *        <code>PreferredInstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * The instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     * 
     * @param preferredInstanceType
     *        The instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     */

    public void setPreferredInstanceType(String preferredInstanceType) {
        this.preferredInstanceType = preferredInstanceType;
    }

    /**
     * <p>
     * The instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     * 
     * @return The instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     */

    public String getPreferredInstanceType() {
        return this.preferredInstanceType;
    }

    /**
     * <p>
     * The instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     * 
     * @param preferredInstanceType
     *        The instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverEndpointRequest withPreferredInstanceType(String preferredInstanceType) {
        setPreferredInstanceType(preferredInstanceType);
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
     * <p>
     * For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it will
     * resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * </p>
     * 
     * @param resolverEndpointType
     *        For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it
     *        will resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * @see ResolverEndpointType
     */

    public void setResolverEndpointType(String resolverEndpointType) {
        this.resolverEndpointType = resolverEndpointType;
    }

    /**
     * <p>
     * For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it will
     * resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * </p>
     * 
     * @return For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that
     *         it will resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * @see ResolverEndpointType
     */

    public String getResolverEndpointType() {
        return this.resolverEndpointType;
    }

    /**
     * <p>
     * For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it will
     * resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * </p>
     * 
     * @param resolverEndpointType
     *        For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it
     *        will resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointType
     */

    public CreateResolverEndpointRequest withResolverEndpointType(String resolverEndpointType) {
        setResolverEndpointType(resolverEndpointType);
        return this;
    }

    /**
     * <p>
     * For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it will
     * resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * </p>
     * 
     * @param resolverEndpointType
     *        For the endpoint type you can choose either IPv4, IPv6, or dual-stack. A dual-stack endpoint means that it
     *        will resolve via both IPv4 and IPv6. This endpoint type is applied to all IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointType
     */

    public CreateResolverEndpointRequest withResolverEndpointType(ResolverEndpointType resolverEndpointType) {
        this.resolverEndpointType = resolverEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *         <p>
     *         For an inbound endpoint you can apply the protocols as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do53 and DoH in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 and DoH-FIPS in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH-FIPS alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         None, which is treated as Do53.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For an outbound endpoint you can apply the protocols as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do53 and DoH in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         None, which is treated as Do53.
     *         </p>
     *         </li>
     * @see Protocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     * @see Protocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public CreateResolverEndpointRequest withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public CreateResolverEndpointRequest withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public CreateResolverEndpointRequest withProtocols(Protocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (Protocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
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
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getPreferredInstanceType() != null)
            sb.append("PreferredInstanceType: ").append(getPreferredInstanceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getResolverEndpointType() != null)
            sb.append("ResolverEndpointType: ").append(getResolverEndpointType()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols());
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
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getPreferredInstanceType() == null ^ this.getPreferredInstanceType() == null)
            return false;
        if (other.getPreferredInstanceType() != null && other.getPreferredInstanceType().equals(this.getPreferredInstanceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResolverEndpointType() == null ^ this.getResolverEndpointType() == null)
            return false;
        if (other.getResolverEndpointType() != null && other.getResolverEndpointType().equals(this.getResolverEndpointType()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
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
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getPreferredInstanceType() == null) ? 0 : getPreferredInstanceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getResolverEndpointType() == null) ? 0 : getResolverEndpointType().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        return hashCode;
    }

    @Override
    public CreateResolverEndpointRequest clone() {
        return (CreateResolverEndpointRequest) super.clone();
    }

}
