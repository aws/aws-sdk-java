/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.services.ec2.waiters.AmazonEC2Waiters;

/**
 * Interface for accessing Amazon EC2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ec2.AbstractAmazonEC2} instead.
 * </p>
 * <p>
 * <fullname>Amazon Elastic Compute Cloud</fullname>
 * <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides resizable computing capacity in the Amazon Web Services (AWS)
 * cloud. Using Amazon EC2 eliminates your need to invest in hardware up front, so you can develop and deploy
 * applications faster.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEC2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ec2";

    /**
     * Overrides the default endpoint for this client ("https://ec2.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://ec2.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ec2.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://ec2.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonEC2#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link com.amazonaws.regions.Region#getRegion(com.amazonaws.regions.Regions)} for accessing a given
     *        region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see com.amazonaws.regions.Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(com.amazonaws.regions.Region region);

    /**
     * <p>
     * Accepts the Convertible Reserved Instance exchange quote described in the
     * <a>GetReservedInstancesExchangeQuote</a> call.
     * </p>
     * 
     * @param acceptReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for accepting the quote.
     * @return Result of the AcceptReservedInstancesExchangeQuote operation returned by the service.
     * @sample AmazonEC2.AcceptReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptReservedInstancesExchangeQuoteResult acceptReservedInstancesExchangeQuote(
            AcceptReservedInstancesExchangeQuoteRequest acceptReservedInstancesExchangeQuoteRequest);

    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the
     * <code>pending-acceptance</code> state, and you must be the owner of the peer VPC. Use the
     * <code>DescribeVpcPeeringConnections</code> request to view your outstanding VPC peering connection requests.
     * </p>
     * 
     * @param acceptVpcPeeringConnectionRequest
     *        Contains the parameters for AcceptVpcPeeringConnection.
     * @return Result of the AcceptVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.AcceptVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest);

    /**
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation.
     *
     * @see #acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest)
     */
    AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection();

    /**
     * <p>
     * Acquires an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param allocateAddressRequest
     *        Contains the parameters for AllocateAddress.
     * @return Result of the AllocateAddress operation returned by the service.
     * @sample AmazonEC2.AllocateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest);

    /**
     * Simplified method form for invoking the AllocateAddress operation.
     *
     * @see #allocateAddress(AllocateAddressRequest)
     */
    AllocateAddressResult allocateAddress();

    /**
     * <p>
     * Allocates a Dedicated Host to your account. At minimum you need to specify the instance size type, Availability
     * Zone, and quantity of hosts you want to allocate.
     * </p>
     * 
     * @param allocateHostsRequest
     *        Contains the parameters for AllocateHosts.
     * @return Result of the AllocateHosts operation returned by the service.
     * @sample AmazonEC2.AllocateHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateHosts" target="_top">AWS API
     *      Documentation</a>
     */
    AllocateHostsResult allocateHosts(AllocateHostsRequest allocateHostsRequest);

    /**
     * <p>
     * Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6
     * addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's
     * IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private
     * IPv4 addresses, and the limit varies per instance type. For information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">IP Addresses Per
     * Network Interface Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param assignIpv6AddressesRequest
     * @return Result of the AssignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2.AssignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    AssignIpv6AddressesResult assignIpv6Addresses(AssignIpv6AddressesRequest assignIpv6AddressesRequest);

    /**
     * <p>
     * Assigns one or more secondary private IP addresses to the specified network interface. You can specify one or
     * more specific secondary IP addresses, or you can specify the number of secondary IP addresses to be automatically
     * assigned within the subnet's CIDR block range. The number of secondary IP addresses that you can assign to an
     * instance varies by instance type. For information about instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>. For more information about Elastic IP addresses, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * AssignPrivateIpAddresses is available only in EC2-VPC.
     * </p>
     * 
     * @param assignPrivateIpAddressesRequest
     *        Contains the parameters for AssignPrivateIpAddresses.
     * @return Result of the AssignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2.AssignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    AssignPrivateIpAddressesResult assignPrivateIpAddresses(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest);

    /**
     * <p>
     * Associates an Elastic IP address with an instance or a network interface.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different
     * instance, it is disassociated from that instance and associated with the specified instance.
     * </p>
     * <p>
     * [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated
     * with the primary IP address. If the Elastic IP address is already associated with a different instance or a
     * network interface, you get an error unless you allow reassociation.
     * </p>
     * <important>
     * <p>
     * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error,
     * and you may be charged for each time the Elastic IP address is remapped to the same instance. For more
     * information, see the <i>Elastic IP Addresses</i> section of <a href="http://aws.amazon.com/ec2/pricing/">Amazon
     * EC2 Pricing</a>.
     * </p>
     * </important>
     * 
     * @param associateAddressRequest
     *        Contains the parameters for AssociateAddress.
     * @return Result of the AssociateAddress operation returned by the service.
     * @sample AmazonEC2.AssociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest);

    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP
     * options with the VPC.
     * </p>
     * <p>
     * After you associate the options with the VPC, any existing instances and all new instances that you launch in
     * that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the
     * changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly
     * renew the lease using the operating system on the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html">DHCP Options Sets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateDhcpOptionsRequest
     *        Contains the parameters for AssociateDhcpOptions.
     * @return Result of the AssociateDhcpOptions operation returned by the service.
     * @sample AmazonEC2.AssociateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateDhcpOptionsResult associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest);

    /**
     * <p>
     * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM
     * instance profile with an instance.
     * </p>
     * 
     * @param associateIamInstanceProfileRequest
     * @return Result of the AssociateIamInstanceProfile operation returned by the service.
     * @sample AmazonEC2.AssociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateIamInstanceProfileResult associateIamInstanceProfile(AssociateIamInstanceProfileRequest associateIamInstanceProfileRequest);

    /**
     * <p>
     * Associates a subnet with a route table. The subnet and route table must be in the same VPC. This association
     * causes traffic originating from the subnet to be routed according to the routes in the route table. The action
     * returns an association ID, which you need in order to disassociate the route table from the subnet later. A route
     * table can be associated with multiple subnets.
     * </p>
     * <p>
     * For more information about route tables, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">Route Tables</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateRouteTableRequest
     *        Contains the parameters for AssociateRouteTable.
     * @return Result of the AssociateRouteTable operation returned by the service.
     * @sample AmazonEC2.AssociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateRouteTableResult associateRouteTable(AssociateRouteTableRequest associateRouteTableRequest);

    /**
     * <p>
     * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An
     * IPv6 CIDR block must have a prefix length of /64.
     * </p>
     * 
     * @param associateSubnetCidrBlockRequest
     * @return Result of the AssociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2.AssociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateSubnetCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateSubnetCidrBlockResult associateSubnetCidrBlock(AssociateSubnetCidrBlockRequest associateSubnetCidrBlockRequest);

    /**
     * <p>
     * Associates a CIDR block with your VPC. You can only associate a single Amazon-provided IPv6 CIDR block with your
     * VPC. The IPv6 CIDR block size is fixed at /56.
     * </p>
     * 
     * @param associateVpcCidrBlockRequest
     * @return Result of the AssociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2.AssociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateVpcCidrBlock" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateVpcCidrBlockResult associateVpcCidrBlock(AssociateVpcCidrBlockRequest associateVpcCidrBlockRequest);

    /**
     * <p>
     * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You
     * cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the
     * <code>running</code> state. An instance is automatically unlinked from a VPC when it's stopped - you can link it
     * to the VPC again when you restart it.
     * </p>
     * <p>
     * After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change
     * the security groups, you must first unlink the instance, and then link it again.
     * </p>
     * <p>
     * Linking your instance to a VPC is sometimes referred to as <i>attaching</i> your instance.
     * </p>
     * 
     * @param attachClassicLinkVpcRequest
     *        Contains the parameters for AttachClassicLinkVpc.
     * @return Result of the AttachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2.AttachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    AttachClassicLinkVpcResult attachClassicLinkVpc(AttachClassicLinkVpcRequest attachClassicLinkVpcRequest);

    /**
     * <p>
     * Attaches an Internet gateway to a VPC, enabling connectivity between the Internet and the VPC. For more
     * information about your VPC and Internet gateway, see the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/">Amazon Virtual Private Cloud User Guide</a>.
     * </p>
     * 
     * @param attachInternetGatewayRequest
     *        Contains the parameters for AttachInternetGateway.
     * @return Result of the AttachInternetGateway operation returned by the service.
     * @sample AmazonEC2.AttachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    AttachInternetGatewayResult attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest);

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     * 
     * @param attachNetworkInterfaceRequest
     *        Contains the parameters for AttachNetworkInterface.
     * @return Result of the AttachNetworkInterface operation returned by the service.
     * @sample AmazonEC2.AttachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    AttachNetworkInterfaceResult attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest);

    /**
     * <p>
     * Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device
     * name.
     * </p>
     * <p>
     * Encrypted EBS volumes may only be attached to instances that support Amazon EBS encryption. For more information,
     * see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For a list of supported device names, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html">Attaching an EBS Volume to an
     * Instance</a>. Any device names that aren't reserved for instance store volumes can be used for EBS volumes. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
     * EC2 Instance Store</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * If a volume has an AWS Marketplace product code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The volume can be attached only to a stopped instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Marketplace product codes are copied from the volume to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must be subscribed to the product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance type and operating system of the instance must support the product. For example, you can't detach a
     * volume from a Windows instance and attach it to a Linux instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an overview of the AWS Marketplace, see <a
     * href="https://aws.amazon.com/marketplace/help/200900000">Introducing AWS Marketplace</a>.
     * </p>
     * <p>
     * For more information about EBS volumes, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html">Attaching Amazon EBS
     * Volumes</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param attachVolumeRequest
     *        Contains the parameters for AttachVolume.
     * @return Result of the AttachVolume operation returned by the service.
     * @sample AmazonEC2.AttachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest);

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding a
     * Hardware Virtual Private Gateway to Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param attachVpnGatewayRequest
     *        Contains the parameters for AttachVpnGateway.
     * @return Result of the AttachVpnGateway operation returned by the service.
     * @sample AmazonEC2.AttachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    AttachVpnGatewayResult attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest);

    /**
     * <p>
     * [EC2-VPC only] Adds one or more egress rules to a security group for use with a VPC. Specifically, this action
     * permits instances to send traffic to one or more destination IPv4 or IPv6 CIDR address ranges, or to one or more
     * destination security groups for the same VPC. This action doesn't apply to security groups for use in
     * EC2-Classic. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>. For more information about security group limits,
     * see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Appendix_Limits.html">Amazon VPC
     * Limits</a>.
     * </p>
     * <p>
     * Each rule consists of the protocol (for example, TCP), plus either a CIDR range or a source group. For the TCP
     * and UDP protocols, you must also specify the destination port or port range. For the ICMP protocol, you must also
     * specify the ICMP type and code. You can use -1 for the type or code to mean all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.
     * </p>
     * 
     * @param authorizeSecurityGroupEgressRequest
     *        Contains the parameters for AuthorizeSecurityGroupEgress.
     * @return Result of the AuthorizeSecurityGroupEgress operation returned by the service.
     * @sample AmazonEC2.AuthorizeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupEgress"
     *      target="_top">AWS API Documentation</a>
     */
    AuthorizeSecurityGroupEgressResult authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest);

    /**
     * <p>
     * Adds one or more ingress rules to a security group.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * <p>
     * [EC2-Classic] This action gives one or more IPv4 CIDR address ranges permission to access a security group in
     * your account, or gives one or more security groups (called the <i>source groups</i>) permission to access a
     * security group for your account. A source group can be for your own AWS account, or another. You can have up to
     * 100 rules per group.
     * </p>
     * <p>
     * [EC2-VPC] This action gives one or more IPv4 or IPv6 CIDR address ranges permission to access a security group in
     * your VPC, or gives one or more other security groups (called the <i>source groups</i>) permission to access a
     * security group for your VPC. The security groups must all be for the same VPC or a peer VPC in a VPC peering
     * connection. For more information about VPC security group limits, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Appendix_Limits.html">Amazon VPC Limits</a>.
     * </p>
     * 
     * @param authorizeSecurityGroupIngressRequest
     *        Contains the parameters for AuthorizeSecurityGroupIngress.
     * @return Result of the AuthorizeSecurityGroupIngress operation returned by the service.
     * @sample AmazonEC2.AuthorizeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest);

    /**
     * <p>
     * Bundles an Amazon instance store-backed Windows instance.
     * </p>
     * <p>
     * During bundling, only the root device volume (C:\) is bundled. Data on other instance store volumes is not
     * preserved.
     * </p>
     * <note>
     * <p>
     * This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/Creating_InstanceStoreBacked_WinAMI.html">Creating an
     * Instance Store-Backed Windows AMI</a>.
     * </p>
     * 
     * @param bundleInstanceRequest
     *        Contains the parameters for BundleInstance.
     * @return Result of the BundleInstance operation returned by the service.
     * @sample AmazonEC2.BundleInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/BundleInstance" target="_top">AWS API
     *      Documentation</a>
     */
    BundleInstanceResult bundleInstance(BundleInstanceRequest bundleInstanceRequest);

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows instance.
     * </p>
     * 
     * @param cancelBundleTaskRequest
     *        Contains the parameters for CancelBundleTask.
     * @return Result of the CancelBundleTask operation returned by the service.
     * @sample AmazonEC2.CancelBundleTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelBundleTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelBundleTaskResult cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest);

    /**
     * <p>
     * Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all
     * artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or
     * is in the process of transferring the final disk image, the command fails and returns an exception.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/ec2-cli-vmimport-export.html">Importing a
     * Virtual Machine Using the Amazon EC2 CLI</a>.
     * </p>
     * 
     * @param cancelConversionTaskRequest
     *        Contains the parameters for CancelConversionTask.
     * @return Result of the CancelConversionTask operation returned by the service.
     * @sample AmazonEC2.CancelConversionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelConversionTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelConversionTaskResult cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest);

    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of the export, including any partially-created
     * Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the
     * command fails and returns an error.
     * </p>
     * 
     * @param cancelExportTaskRequest
     *        Contains the parameters for CancelExportTask.
     * @return Result of the CancelExportTask operation returned by the service.
     * @sample AmazonEC2.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Cancels an in-process import virtual machine or import snapshot task.
     * </p>
     * 
     * @param cancelImportTaskRequest
     *        Contains the parameters for CancelImportTask.
     * @return Result of the CancelImportTask operation returned by the service.
     * @sample AmazonEC2.CancelImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelImportTaskResult cancelImportTask(CancelImportTaskRequest cancelImportTaskRequest);

    /**
     * Simplified method form for invoking the CancelImportTask operation.
     *
     * @see #cancelImportTask(CancelImportTaskRequest)
     */
    CancelImportTaskResult cancelImportTask();

    /**
     * <p>
     * Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param cancelReservedInstancesListingRequest
     *        Contains the parameters for CancelReservedInstancesListing.
     * @return Result of the CancelReservedInstancesListing operation returned by the service.
     * @sample AmazonEC2.CancelReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    CancelReservedInstancesListingResult cancelReservedInstancesListing(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest);

    /**
     * <p>
     * Cancels the specified Spot fleet requests.
     * </p>
     * <p>
     * After you cancel a Spot fleet request, the Spot fleet launches no new Spot instances. You must specify whether
     * the Spot fleet should also terminate its Spot instances. If you terminate the instances, the Spot fleet request
     * enters the <code>cancelled_terminating</code> state. Otherwise, the Spot fleet request enters the
     * <code>cancelled_running</code> state and the instances continue to run until they are interrupted or you
     * terminate them manually.
     * </p>
     * 
     * @param cancelSpotFleetRequestsRequest
     *        Contains the parameters for CancelSpotFleetRequests.
     * @return Result of the CancelSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2.CancelSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSpotFleetRequestsResult cancelSpotFleetRequests(CancelSpotFleetRequestsRequest cancelSpotFleetRequestsRequest);

    /**
     * <p>
     * Cancels one or more Spot instance requests. Spot instances are instances that Amazon EC2 starts on your behalf
     * when the bid price that you specify exceeds the current Spot price. Amazon EC2 periodically sets the Spot price
     * based on available Spot instance capacity and current Spot instance requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Canceling a Spot instance request does not terminate running Spot instances associated with the request.
     * </p>
     * </important>
     * 
     * @param cancelSpotInstanceRequestsRequest
     *        Contains the parameters for CancelSpotInstanceRequests.
     * @return Result of the CancelSpotInstanceRequests operation returned by the service.
     * @sample AmazonEC2.CancelSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotInstanceRequests" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSpotInstanceRequestsResult cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest);

    /**
     * <p>
     * Determines whether a product code is associated with an instance. This action can only be used by the owner of
     * the product code. It is useful when a product code owner needs to verify whether another user's instance is
     * eligible for support.
     * </p>
     * 
     * @param confirmProductInstanceRequest
     *        Contains the parameters for ConfirmProductInstance.
     * @return Result of the ConfirmProductInstance operation returned by the service.
     * @sample AmazonEC2.ConfirmProductInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConfirmProductInstance" target="_top">AWS API
     *      Documentation</a>
     */
    ConfirmProductInstanceResult confirmProductInstance(ConfirmProductInstanceRequest confirmProductInstanceRequest);

    /**
     * <p>
     * Initiates the copy of an AMI from the specified source region to the current region. You specify the destination
     * region by using its endpoint when making the request.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html">Copying
     * AMIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param copyImageRequest
     *        Contains the parameters for CopyImage.
     * @return Result of the CopyImage operation returned by the service.
     * @sample AmazonEC2.CopyImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopyImage" target="_top">AWS API
     *      Documentation</a>
     */
    CopyImageResult copyImage(CopyImageRequest copyImageRequest);

    /**
     * <p>
     * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy the snapshot within the
     * same region or from one region to another. You can use the snapshot to create EBS volumes or Amazon Machine
     * Images (AMIs). The snapshot is copied to the regional endpoint that you send the HTTP request to.
     * </p>
     * <p>
     * Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted snapshots remain unencrypted, unless
     * the <code>Encrypted</code> flag is specified during the snapshot copy operation. By default, encrypted snapshot
     * copies use the default AWS Key Management Service (AWS KMS) customer master key (CMK); however, you can specify a
     * non-default CMK with the <code>KmsKeyId</code> parameter.
     * </p>
     * <note>
     * <p>
     * To copy an encrypted snapshot that has been shared from another account, you must have permissions for the CMK
     * used to encrypt the snapshot.
     * </p>
     * </note> <note>
     * <p>
     * Snapshots created by the CopySnapshot action have an arbitrary volume ID that should not be used for any purpose.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html">Copying an Amazon EBS
     * Snapshot</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param copySnapshotRequest
     *        Contains the parameters for CopySnapshot.
     * @return Result of the CopySnapshot operation returned by the service.
     * @sample AmazonEC2.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your
     * end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You
     * must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must
     * be static and may be behind a device performing network address translation (NAT).
     * </p>
     * <p>
     * For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System
     * Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use
     * a private ASN (in the 64512 - 65534 range).
     * </p>
     * <note>
     * <p>
     * Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with the exception of 7224, which is
     * reserved in the <code>us-east-1</code> region, and 9059, which is reserved in the <code>eu-west-1</code> region.
     * </p>
     * </note>
     * <p>
     * For more information about VPN customer gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding a Hardware Virtual Private
     * Gateway to Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <important>
     * <p>
     * You cannot create more than one customer gateway with the same VPN type, IP address, and BGP ASN parameter
     * values. If you run an identical request more than one time, the first request creates the customer gateway, and
     * subsequent requests return information about the existing customer gateway. The subsequent requests do not create
     * new customer gateway resources.
     * </p>
     * </important>
     * 
     * @param createCustomerGatewayRequest
     *        Contains the parameters for CreateCustomerGateway.
     * @return Result of the CreateCustomerGateway operation returned by the service.
     * @sample AmazonEC2.CreateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCustomerGatewayResult createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest);

    /**
     * <p>
     * Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing
     * all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the
     * individual DHCP options you can specify. For more information about the options, see <a
     * href="http://www.ietf.org/rfc/rfc2132.txt">RFC 2132</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>domain-name-servers</code> - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The
     * default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the
     * IP addresses in a single parameter, separated by commas. If you want your instance to receive a custom DNS
     * hostname as specified in <code>domain-name</code>, you must set <code>domain-name-servers</code> to a custom DNS
     * server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain-name</code> - If you're using AmazonProvidedDNS in "us-east-1", specify "ec2.internal". If you're
     * using AmazonProvidedDNS in another region, specify "region.compute.internal" (for example,
     * "ap-northeast-1.compute.internal"). Otherwise, specify a domain name (for example, "MyCompany.com"). This value
     * is used to complete unqualified DNS hostnames. <b>Important</b>: Some Linux operating systems accept multiple
     * domain names separated by spaces. However, Windows and other Linux operating systems treat the value as a single
     * domain, which results in unexpected behavior. If your DHCP options set is associated with a VPC that has
     * instances with multiple operating systems, specify only one domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ntp-servers</code> - The IP addresses of up to four Network Time Protocol (NTP) servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>netbios-name-servers</code> - The IP addresses of up to four NetBIOS name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>netbios-node-type</code> - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2
     * (broadcast and multicast are not currently supported). For more information about these node types, see <a
     * href="http://www.ietf.org/rfc/rfc2132.txt">RFC 2132</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide
     * (AmazonProvidedDNS). If you create a set of options, and if your VPC has an Internet gateway, make sure to set
     * the <code>domain-name-servers</code> option either to <code>AmazonProvidedDNS</code> or to a domain name server
     * of your choice. For more information about DHCP options, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html">DHCP Options Sets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createDhcpOptionsRequest
     *        Contains the parameters for CreateDhcpOptions.
     * @return Result of the CreateDhcpOptions operation returned by the service.
     * @sample AmazonEC2.CreateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDhcpOptionsResult createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest);

    /**
     * <p>
     * [IPv6 only] Creates an egress-only Internet gateway for your VPC. An egress-only Internet gateway is used to
     * enable outbound communication over IPv6 from instances in your VPC to the Internet, and prevents hosts outside of
     * your VPC from initiating an IPv6 connection with your instance.
     * </p>
     * 
     * @param createEgressOnlyInternetGatewayRequest
     * @return Result of the CreateEgressOnlyInternetGateway operation returned by the service.
     * @sample AmazonEC2.CreateEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEgressOnlyInternetGatewayResult createEgressOnlyInternetGateway(CreateEgressOnlyInternetGatewayRequest createEgressOnlyInternetGatewayRequest);

    /**
     * <p>
     * Creates one or more flow logs to capture IP traffic for a specific network interface, subnet, or VPC. Flow logs
     * are delivered to a specified log group in Amazon CloudWatch Logs. If you specify a VPC or subnet in the request,
     * a log stream is created in CloudWatch Logs for each network interface in the subnet or VPC. Log streams can
     * include information about accepted and rejected traffic to a network interface. You can view the data in your log
     * streams using Amazon CloudWatch Logs.
     * </p>
     * <p>
     * In your request, you must also specify an IAM role that has permission to publish logs to CloudWatch Logs.
     * </p>
     * 
     * @param createFlowLogsRequest
     *        Contains the parameters for CreateFlowLogs.
     * @return Result of the CreateFlowLogs operation returned by the service.
     * @sample AmazonEC2.CreateFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFlowLogsResult createFlowLogs(CreateFlowLogsRequest createFlowLogsRequest);

    /**
     * <p>
     * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped.
     * </p>
     * <p>
     * If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume,
     * the new AMI contains block device mapping information for those volumes. When you launch an instance from this
     * new AMI, the instance automatically launches with those additional volumes.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating Amazon EBS-Backed
     * Linux AMIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createImageRequest
     *        Contains the parameters for CreateImage.
     * @return Result of the CreateImage operation returned by the service.
     * @sample AmazonEC2.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateImageResult createImage(CreateImageRequest createImageRequest);

    /**
     * <p>
     * Exports a running or stopped instance to an S3 bucket.
     * </p>
     * <p>
     * For information about the supported operating systems, image formats, and known limitations for the types of
     * instances you can export, see <a
     * href="http://docs.aws.amazon.com/vm-import/latest/userguide/vmexport.html">Exporting an Instance as a VM Using VM
     * Import/Export</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param createInstanceExportTaskRequest
     *        Contains the parameters for CreateInstanceExportTask.
     * @return Result of the CreateInstanceExportTask operation returned by the service.
     * @sample AmazonEC2.CreateInstanceExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInstanceExportTask" target="_top">AWS
     *      API Documentation</a>
     */
    CreateInstanceExportTaskResult createInstanceExportTask(CreateInstanceExportTaskRequest createInstanceExportTaskRequest);

    /**
     * <p>
     * Creates an Internet gateway for use with a VPC. After creating the Internet gateway, you attach it to a VPC using
     * <a>AttachInternetGateway</a>.
     * </p>
     * <p>
     * For more information about your VPC and Internet gateway, see the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/">Amazon Virtual Private Cloud User Guide</a>.
     * </p>
     * 
     * @param createInternetGatewayRequest
     *        Contains the parameters for CreateInternetGateway.
     * @return Result of the CreateInternetGateway operation returned by the service.
     * @sample AmazonEC2.CreateInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInternetGatewayResult createInternetGateway(CreateInternetGatewayRequest createInternetGatewayRequest);

    /**
     * Simplified method form for invoking the CreateInternetGateway operation.
     *
     * @see #createInternetGateway(CreateInternetGatewayRequest)
     */
    CreateInternetGatewayResult createInternetGateway();

    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the
     * private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#8 private
     * key. If a key with the specified name already exists, Amazon EC2 returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per region.
     * </p>
     * <p>
     * The key pair returned to you is available only in the region in which you create it. To create a key pair that is
     * available in all regions, use <a>ImportKeyPair</a>.
     * </p>
     * <p>
     * For more information about key pairs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key Pairs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createKeyPairRequest
     *        Contains the parameters for CreateKeyPair.
     * @return Result of the CreateKeyPair operation returned by the service.
     * @sample AmazonEC2.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest);

    /**
     * <p>
     * Creates a NAT gateway in the specified subnet. A NAT gateway can be used to enable instances in a private subnet
     * to connect to the Internet. This action creates a network interface in the specified subnet with a private IP
     * address from the IP address range of the subnet. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">NAT Gateways</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNatGatewayRequest
     *        Contains the parameters for CreateNatGateway.
     * @return Result of the CreateNatGateway operation returned by the service.
     * @sample AmazonEC2.CreateNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNatGatewayResult createNatGateway(CreateNatGatewayRequest createNatGatewayRequest);

    /**
     * <p>
     * Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security
     * groups) for the instances in your VPC.
     * </p>
     * <p>
     * For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkAclRequest
     *        Contains the parameters for CreateNetworkAcl.
     * @return Result of the CreateNetworkAcl operation returned by the service.
     * @sample AmazonEC2.CreateNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest);

    /**
     * <p>
     * Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered
     * ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in
     * or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in
     * ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules.
     * </p>
     * <p>
     * We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them
     * one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing
     * ones without having to renumber the rules.
     * </p>
     * <p>
     * After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old
     * one.
     * </p>
     * <p>
     * For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkAclEntryRequest
     *        Contains the parameters for CreateNetworkAclEntry.
     * @return Result of the CreateNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2.CreateNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNetworkAclEntryResult createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest);

    /**
     * <p>
     * Creates a network interface in the specified subnet.
     * </p>
     * <p>
     * For more information about network interfaces, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkInterfaceRequest
     *        Contains the parameters for CreateNetworkInterface.
     * @return Result of the CreateNetworkInterface operation returned by the service.
     * @sample AmazonEC2.CreateNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest);

    /**
     * <p>
     * Creates a placement group that you launch cluster instances into. You must give the group a name that's unique
     * within the scope of your account.
     * </p>
     * <p>
     * For more information about placement groups and cluster instances, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Cluster Instances</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createPlacementGroupRequest
     *        Contains the parameters for CreatePlacementGroup.
     * @return Result of the CreatePlacementGroup operation returned by the service.
     * @sample AmazonEC2.CreatePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreatePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePlacementGroupResult createPlacementGroup(CreatePlacementGroupRequest createPlacementGroupRequest);

    /**
     * <p>
     * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You
     * can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances,
     * you can use the <a>DescribeReservedInstances</a> operation.
     * </p>
     * <note>
     * <p>
     * Only Standard Reserved Instances with a capacity reservation can be sold in the Reserved Instance Marketplace.
     * Convertible Reserved Instances and Standard Reserved Instances with a regional benefit cannot be sold.
     * </p>
     * </note>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that
     * they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold
     * through the Reserved Instance Marketplace work like any other Reserved Instances.
     * </p>
     * <p>
     * To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance
     * Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of
     * some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard
     * Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved
     * Instance listing, you can use the <a>DescribeReservedInstancesListings</a> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createReservedInstancesListingRequest
     *        Contains the parameters for CreateReservedInstancesListing.
     * @return Result of the CreateReservedInstancesListing operation returned by the service.
     * @sample AmazonEC2.CreateReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReservedInstancesListingResult createReservedInstancesListing(CreateReservedInstancesListingRequest createReservedInstancesListingRequest);

    /**
     * <p>
     * Creates a route in a route table within a VPC.
     * </p>
     * <p>
     * You must specify one of the following targets: Internet gateway or virtual private gateway, NAT instance, NAT
     * gateway, VPC peering connection, network interface, or egress-only Internet gateway.
     * </p>
     * <p>
     * When determining how to route traffic, we use the route with the most specific match. For example, traffic is
     * destined for the IPv4 address <code>192.0.2.3</code>, and the route table includes the following two IPv4 routes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>192.0.2.0/24</code> (goes to some target A)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>192.0.2.0/28</code> (goes to some target B)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both routes apply to the traffic destined for <code>192.0.2.3</code>. However, the second route in the list
     * covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where
     * to target the traffic.
     * </p>
     * <p>
     * For more information about route tables, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">Route Tables</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createRouteRequest
     *        Contains the parameters for CreateRoute.
     * @return Result of the CreateRoute operation returned by the service.
     * @sample AmazonEC2.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest);

    /**
     * <p>
     * Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the
     * table with a subnet.
     * </p>
     * <p>
     * For more information about route tables, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">Route Tables</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createRouteTableRequest
     *        Contains the parameters for CreateRouteTable.
     * @return Result of the CreateRouteTable operation returned by the service.
     * @sample AmazonEC2.CreateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRouteTableResult createRouteTable(CreateRouteTableRequest createRouteTableRequest);

    /**
     * <p>
     * Creates a security group.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more
     * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <important>
     * <p>
     * EC2-Classic: You can have up to 500 security groups.
     * </p>
     * <p>
     * EC2-VPC: You can create up to 500 security groups per VPC.
     * </p>
     * </important>
     * <p>
     * When you create a security group, you specify a friendly name of your choice. You can have a security group for
     * use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security
     * groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name.
     * </p>
     * <p>
     * You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you
     * don't specify a security group when you launch an instance, the instance is launched into the appropriate default
     * security group. A default security group includes a default rule that grants instances unrestricted network
     * access to each other.
     * </p>
     * <p>
     * You can add or remove rules from your security groups using <a>AuthorizeSecurityGroupIngress</a>,
     * <a>AuthorizeSecurityGroupEgress</a>, <a>RevokeSecurityGroupIngress</a>, and <a>RevokeSecurityGroupEgress</a>.
     * </p>
     * 
     * @param createSecurityGroupRequest
     *        Contains the parameters for CreateSecurityGroup.
     * @return Result of the CreateSecurityGroup operation returned by the service.
     * @sample AmazonEC2.CreateSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest);

    /**
     * <p>
     * Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies
     * of EBS volumes, and to save data before shutting down an instance.
     * </p>
     * <p>
     * When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are
     * propagated to the snapshot.
     * </p>
     * <p>
     * You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been
     * written to your EBS volume at the time the snapshot command is issued; this may exclude any data that has been
     * cached by any applications or the operating system. If you can pause any file systems on the volume long enough
     * to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume,
     * you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume
     * to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is
     * <code>pending</code>.
     * </p>
     * <p>
     * To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the
     * snapshot.
     * </p>
     * <p>
     * Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from
     * encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always
     * remain protected.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html">Amazon
     * Elastic Block Store</a> and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createSnapshotRequest
     *        Contains the parameters for CreateSnapshot.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @sample AmazonEC2.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a data feed for Spot instances, enabling you to view Spot instance usage logs. You can create one data
     * feed per AWS account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance Data Feed</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createSpotDatafeedSubscriptionRequest
     *        Contains the parameters for CreateSpotDatafeedSubscription.
     * @return Result of the CreateSpotDatafeedSubscription operation returned by the service.
     * @sample AmazonEC2.CreateSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSpotDatafeedSubscriptionResult createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest);

    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and the CIDR block you want for the subnet. After you create
     * a subnet, you can't change its CIDR block. The subnet's IPv4 CIDR block can be the same as the VPC's IPv4 CIDR
     * block (assuming you want only a single subnet in the VPC), or a subset of the VPC's IPv4 CIDR block. If you
     * create more than one subnet in a VPC, the subnets' CIDR blocks must not overlap. The smallest IPv4 subnet (and
     * VPC) you can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4
     * addresses).
     * </p>
     * <p>
     * If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses
     * a /64 prefix length.
     * </p>
     * <important>
     * <p>
     * AWS reserves both the first four and the last IP address in each subnet's CIDR block. They're not available for
     * use.
     * </p>
     * </important>
     * <p>
     * If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle.
     * </p>
     * <p>
     * If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP address doesn't change if you stop and
     * restart the instance (unlike a similar instance launched outside a VPC, which gets a new IP address when
     * restarted). It's therefore possible to have a subnet with no running instances (they're all stopped), but no
     * remaining IP addresses available.
     * </p>
     * <p>
     * For more information about subnets, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html">Your VPC and Subnets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createSubnetRequest
     *        Contains the parameters for CreateSubnet.
     * @return Result of the CreateSubnet operation returned by the service.
     * @sample AmazonEC2.CreateSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon EC2 resource or resources. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique per resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>. For more information about creating IAM policies that control
     * users' access to resources based on tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-iam-actions-resources.html">Supported
     * Resource-Level Permissions for Amazon EC2 API Actions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createTagsRequest
     *        Contains the parameters for CreateTags.
     * @return Result of the CreateTags operation returned by the service.
     * @sample AmazonEC2.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates an EBS volume that can be attached to an instance in the same Availability Zone. The volume is created in
     * the regional endpoint that you send the HTTP request to. For more information see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * <p>
     * You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes
     * from the snapshot are propagated to the volume.
     * </p>
     * <p>
     * You can create encrypted volumes with the <code>Encrypted</code> parameter. Encrypted volumes may only be
     * attached to instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     * also automatically encrypted. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can tag your volumes during creation. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html">Creating an Amazon EBS
     * Volume</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createVolumeRequest
     *        Contains the parameters for CreateVolume.
     * @return Result of the CreateVolume operation returned by the service.
     * @sample AmazonEC2.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest);

    /**
     * <p>
     * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4
     * addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). To help you decide how big to make your
     * VPC, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html">Your VPC and
     * Subnets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * You can optionally request an Amazon-provided IPv6 CIDR block for the VPC. The IPv6 CIDR block uses a /56 prefix
     * length, and is allocated from Amazon's pool of IPv6 addresses. You cannot choose the IPv6 range for your VPC.
     * </p>
     * <p>
     * By default, each instance you launch in the VPC has the default DHCP options, which includes only a default DNS
     * server that we provide (AmazonProvidedDNS). For more information about DHCP options, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html">DHCP Options Sets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the
     * VPC after you create it. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpcRequest
     *        Contains the parameters for CreateVpc.
     * @return Result of the CreateVpc operation returned by the service.
     * @sample AmazonEC2.CreateVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpc" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpcResult createVpc(CreateVpcRequest createVpcRequest);

    /**
     * <p>
     * Creates a VPC endpoint for a specified AWS service. An endpoint enables you to create a private connection
     * between your VPC and another AWS service in your account. You can specify an endpoint policy to attach to the
     * endpoint that will control access to the service from your VPC. You can also specify the VPC route tables that
     * use the endpoint.
     * </p>
     * <p>
     * Use <a>DescribeVpcEndpointServices</a> to get a list of supported AWS services.
     * </p>
     * 
     * @param createVpcEndpointRequest
     *        Contains the parameters for CreateVpcEndpoint.
     * @return Result of the CreateVpcEndpoint operation returned by the service.
     * @sample AmazonEC2.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest);

    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC that you own and a peer VPC with which to
     * create the connection. The peer VPC can belong to another AWS account. The requester VPC and peer VPC cannot have
     * overlapping CIDR blocks.
     * </p>
     * <p>
     * The owner of the peer VPC must accept the peering request to activate the peering connection. The VPC peering
     * connection request expires after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * A <code>CreateVpcPeeringConnection</code> request between VPCs with overlapping CIDR blocks results in the VPC
     * peering connection having a status of <code>failed</code>.
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Contains the parameters for CreateVpcPeeringConnection.
     * @return Result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);

    /**
     * Simplified method form for invoking the CreateVpcPeeringConnection operation.
     *
     * @see #createVpcPeeringConnection(CreateVpcPeeringConnectionRequest)
     */
    CreateVpcPeeringConnectionResult createVpcPeeringConnection();

    /**
     * <p>
     * Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway. The only
     * supported connection type is <code>ipsec.1</code>.
     * </p>
     * <p>
     * The response includes information that you need to give to your network administrator to configure your customer
     * gateway.
     * </p>
     * <important>
     * <p>
     * We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive
     * cryptographic information for configuring your customer gateway.
     * </p>
     * </important>
     * <p>
     * If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must
     * reconfigure your customer gateway with the new information returned from this call.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
     * </p>
     * <p>
     * For more information about VPN connections, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding a Hardware Virtual Private
     * Gateway to Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRequest
     *        Contains the parameters for CreateVpnConnection.
     * @return Result of the CreateVpnConnection operation returned by the service.
     * @sample AmazonEC2.CreateVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest);

    /**
     * <p>
     * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN
     * customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN
     * customer gateway.
     * </p>
     * <p>
     * For more information about VPN connections, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding a Hardware Virtual Private
     * Gateway to Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRouteRequest
     *        Contains the parameters for CreateVpnConnectionRoute.
     * @return Result of the CreateVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2.CreateVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVpnConnectionRouteResult createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest);

    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN
     * connection. You can create a virtual private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information about virtual private gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding a Hardware Virtual Private
     * Gateway to Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnGatewayRequest
     *        Contains the parameters for CreateVpnGateway.
     * @return Result of the CreateVpnGateway operation returned by the service.
     * @sample AmazonEC2.CreateVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest);

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer
     * gateway.
     * </p>
     * 
     * @param deleteCustomerGatewayRequest
     *        Contains the parameters for DeleteCustomerGateway.
     * @return Result of the DeleteCustomerGateway operation returned by the service.
     * @sample AmazonEC2.DeleteCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCustomerGatewayResult deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest);

    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete
     * it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of
     * options with the VPC.
     * </p>
     * 
     * @param deleteDhcpOptionsRequest
     *        Contains the parameters for DeleteDhcpOptions.
     * @return Result of the DeleteDhcpOptions operation returned by the service.
     * @sample AmazonEC2.DeleteDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDhcpOptionsResult deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest);

    /**
     * <p>
     * Deletes an egress-only Internet gateway.
     * </p>
     * 
     * @param deleteEgressOnlyInternetGatewayRequest
     * @return Result of the DeleteEgressOnlyInternetGateway operation returned by the service.
     * @sample AmazonEC2.DeleteEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEgressOnlyInternetGatewayResult deleteEgressOnlyInternetGateway(DeleteEgressOnlyInternetGatewayRequest deleteEgressOnlyInternetGatewayRequest);

    /**
     * <p>
     * Deletes one or more flow logs.
     * </p>
     * 
     * @param deleteFlowLogsRequest
     *        Contains the parameters for DeleteFlowLogs.
     * @return Result of the DeleteFlowLogs operation returned by the service.
     * @sample AmazonEC2.DeleteFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFlowLogsResult deleteFlowLogs(DeleteFlowLogsRequest deleteFlowLogsRequest);

    /**
     * <p>
     * Deletes the specified Internet gateway. You must detach the Internet gateway from the VPC before you can delete
     * it.
     * </p>
     * 
     * @param deleteInternetGatewayRequest
     *        Contains the parameters for DeleteInternetGateway.
     * @return Result of the DeleteInternetGateway operation returned by the service.
     * @sample AmazonEC2.DeleteInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInternetGatewayResult deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest);

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from Amazon EC2.
     * </p>
     * 
     * @param deleteKeyPairRequest
     *        Contains the parameters for DeleteKeyPair.
     * @return Result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonEC2.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest);

    /**
     * <p>
     * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not
     * release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your
     * route tables.
     * </p>
     * 
     * @param deleteNatGatewayRequest
     *        Contains the parameters for DeleteNatGateway.
     * @return Result of the DeleteNatGateway operation returned by the service.
     * @sample AmazonEC2.DeleteNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNatGatewayResult deleteNatGateway(DeleteNatGatewayRequest deleteNatGatewayRequest);

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete
     * the default network ACL.
     * </p>
     * 
     * @param deleteNetworkAclRequest
     *        Contains the parameters for DeleteNetworkAcl.
     * @return Result of the DeleteNetworkAcl operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNetworkAclResult deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest);

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
     * </p>
     * 
     * @param deleteNetworkAclEntryRequest
     *        Contains the parameters for DeleteNetworkAclEntry.
     * @return Result of the DeleteNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest);

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network interface before you can delete it.
     * </p>
     * 
     * @param deleteNetworkInterfaceRequest
     *        Contains the parameters for DeleteNetworkInterface.
     * @return Result of the DeleteNetworkInterface operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNetworkInterfaceResult deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest);

    /**
     * <p>
     * Deletes the specified placement group. You must terminate all instances in the placement group before you can
     * delete the placement group. For more information about placement groups and cluster instances, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Cluster Instances</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deletePlacementGroupRequest
     *        Contains the parameters for DeletePlacementGroup.
     * @return Result of the DeletePlacementGroup operation returned by the service.
     * @sample AmazonEC2.DeletePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeletePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePlacementGroupResult deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest);

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     * 
     * @param deleteRouteRequest
     *        Contains the parameters for DeleteRoute.
     * @return Result of the DeleteRoute operation returned by the service.
     * @sample AmazonEC2.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete
     * it. You can't delete the main route table.
     * </p>
     * 
     * @param deleteRouteTableRequest
     *        Contains the parameters for DeleteRouteTable.
     * @return Result of the DeleteRouteTable operation returned by the service.
     * @sample AmazonEC2.DeleteRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest);

    /**
     * <p>
     * Deletes a security group.
     * </p>
     * <p>
     * If you attempt to delete a security group that is associated with an instance, or is referenced by another
     * security group, the operation fails with <code>InvalidGroup.InUse</code> in EC2-Classic or
     * <code>DependencyViolation</code> in EC2-VPC.
     * </p>
     * 
     * @param deleteSecurityGroupRequest
     *        Contains the parameters for DeleteSecurityGroup.
     * @return Result of the DeleteSecurityGroup operation returned by the service.
     * @sample AmazonEC2.DeleteSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSecurityGroupResult deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest);

    /**
     * <p>
     * Deletes the specified snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device
     * that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the
     * data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
     * active snapshots will have access to all the information needed to restore the volume.
     * </p>
     * <p>
     * You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first
     * de-register the AMI before you can delete the snapshot.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html">Deleting an Amazon EBS
     * Snapshot</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the parameters for DeleteSnapshot.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonEC2.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes the data feed for Spot instances.
     * </p>
     * 
     * @param deleteSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DeleteSpotDatafeedSubscription.
     * @return Result of the DeleteSpotDatafeedSubscription operation returned by the service.
     * @sample AmazonEC2.DeleteSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSpotDatafeedSubscriptionResult deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest);

    /**
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation.
     *
     * @see #deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest)
     */
    DeleteSpotDatafeedSubscriptionResult deleteSpotDatafeedSubscription();

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the
     * subnet.
     * </p>
     * 
     * @param deleteSubnetRequest
     *        Contains the parameters for DeleteSubnet.
     * @return Result of the DeleteSubnet operation returned by the service.
     * @sample AmazonEC2.DeleteSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSubnetResult deleteSubnet(DeleteSubnetRequest deleteSubnetRequest);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of resources. This call is designed to follow a
     * <code>DescribeTags</code> request.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the parameters for DeleteTags.
     * @return Result of the DeleteTags operation returned by the service.
     * @sample AmazonEC2.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified EBS volume. The volume must be in the <code>available</code> state (not attached to an
     * instance).
     * </p>
     * <note>
     * <p>
     * The volume may remain in the <code>deleting</code> state for several minutes.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-volume.html">Deleting an Amazon EBS
     * Volume</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        Contains the parameters for DeleteVolume.
     * @return Result of the DeleteVolume operation returned by the service.
     * @sample AmazonEC2.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest);

    /**
     * <p>
     * Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC
     * before you can delete it. For example, you must terminate all instances running in the VPC, delete all security
     * groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except
     * the default one), and so on.
     * </p>
     * 
     * @param deleteVpcRequest
     *        Contains the parameters for DeleteVpc.
     * @return Result of the DeleteVpc operation returned by the service.
     * @sample AmazonEC2.DeleteVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpc" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpcResult deleteVpc(DeleteVpcRequest deleteVpcRequest);

    /**
     * <p>
     * Deletes one or more specified VPC endpoints. Deleting the endpoint also deletes the endpoint routes in the route
     * tables that were associated with the endpoint.
     * </p>
     * 
     * @param deleteVpcEndpointsRequest
     *        Contains the parameters for DeleteVpcEndpoints.
     * @return Result of the DeleteVpcEndpoints operation returned by the service.
     * @sample AmazonEC2.DeleteVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpcEndpointsResult deleteVpcEndpoints(DeleteVpcEndpointsRequest deleteVpcEndpointsRequest);

    /**
     * <p>
     * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the peer VPC can delete
     * the VPC peering connection if it's in the <code>active</code> state. The owner of the requester VPC can delete a
     * VPC peering connection in the <code>pending-acceptance</code> state.
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Contains the parameters for DeleteVpcPeeringConnection.
     * @return Result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest);

    /**
     * <p>
     * Deletes the specified VPN connection.
     * </p>
     * <p>
     * If you're deleting the VPC and its associated components, we recommend that you detach the virtual private
     * gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel
     * credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one
     * that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN
     * connection, you must reconfigure the customer gateway using the new configuration information returned with the
     * new VPN connection ID.
     * </p>
     * 
     * @param deleteVpnConnectionRequest
     *        Contains the parameters for DeleteVpnConnection.
     * @return Result of the DeleteVpnConnection operation returned by the service.
     * @sample AmazonEC2.DeleteVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpnConnectionResult deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest);

    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway
     * and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the
     * VPN customer gateway.
     * </p>
     * 
     * @param deleteVpnConnectionRouteRequest
     *        Contains the parameters for DeleteVpnConnectionRoute.
     * @return Result of the DeleteVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2.DeleteVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVpnConnectionRouteResult deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest);

    /**
     * <p>
     * Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you
     * detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private
     * gateway if you plan to delete and recreate the VPN connection between your VPC and your network.
     * </p>
     * 
     * @param deleteVpnGatewayRequest
     *        Contains the parameters for DeleteVpnGateway.
     * @return Result of the DeleteVpnGateway operation returned by the service.
     * @sample AmazonEC2.DeleteVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpnGatewayResult deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest);

    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances.
     * </p>
     * <p>
     * This command does not delete the AMI.
     * </p>
     * 
     * @param deregisterImageRequest
     *        Contains the parameters for DeregisterImage.
     * @return Result of the DeregisterImage operation returned by the service.
     * @sample AmazonEC2.DeregisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    DeregisterImageResult deregisterImage(DeregisterImageRequest deregisterImageRequest);

    /**
     * <p>
     * Describes attributes of your AWS account. The following are the supported account attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>supported-platforms</code>: Indicates whether your account can launch instances into EC2-Classic and
     * EC2-VPC, or only into EC2-VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-vpc</code>: The ID of the default VPC for your account, or <code>none</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>max-instances</code>: The maximum number of On-Demand instances that you can run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-max-security-groups-per-interface</code>: The maximum number of security groups that you can assign to
     * a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>max-elastic-ips</code>: The maximum number of Elastic IP addresses that you can allocate for use with
     * EC2-Classic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-max-elastic-ips</code>: The maximum number of Elastic IP addresses that you can allocate for use with
     * EC2-VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountAttributesRequest
     *        Contains the parameters for DescribeAccountAttributes.
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonEC2.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributes(DescribeAccountAttributesRequest)
     */
    DescribeAccountAttributesResult describeAccountAttributes();

    /**
     * <p>
     * Describes one or more of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeAddressesRequest
     *        Contains the parameters for DescribeAddresses.
     * @return Result of the DescribeAddresses operation returned by the service.
     * @sample AmazonEC2.DescribeAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAddresses" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest);

    /**
     * Simplified method form for invoking the DescribeAddresses operation.
     *
     * @see #describeAddresses(DescribeAddressesRequest)
     */
    DescribeAddressesResult describeAddresses();

    /**
     * <p>
     * Describes one or more of the Availability Zones that are available to you. The results include zones only for the
     * region you're currently using. If there is an event impacting an Availability Zone, you can use this request to
     * view the state and any provided message for that Availability Zone.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions and
     * Availability Zones</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeAvailabilityZonesRequest
     *        Contains the parameters for DescribeAvailabilityZones.
     * @return Result of the DescribeAvailabilityZones operation returned by the service.
     * @sample AmazonEC2.DescribeAvailabilityZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAvailabilityZones" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest);

    /**
     * Simplified method form for invoking the DescribeAvailabilityZones operation.
     *
     * @see #describeAvailabilityZones(DescribeAvailabilityZonesRequest)
     */
    DescribeAvailabilityZonesResult describeAvailabilityZones();

    /**
     * <p>
     * Describes one or more of your bundling tasks.
     * </p>
     * <note>
     * <p>
     * Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can
     * still register an AMI from it. Just use <code>RegisterImage</code> with the Amazon S3 bucket name and image
     * manifest name you provided to the bundle task.
     * </p>
     * </note>
     * 
     * @param describeBundleTasksRequest
     *        Contains the parameters for DescribeBundleTasks.
     * @return Result of the DescribeBundleTasks operation returned by the service.
     * @sample AmazonEC2.DescribeBundleTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeBundleTasks" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBundleTasksResult describeBundleTasks(DescribeBundleTasksRequest describeBundleTasksRequest);

    /**
     * Simplified method form for invoking the DescribeBundleTasks operation.
     *
     * @see #describeBundleTasks(DescribeBundleTasksRequest)
     */
    DescribeBundleTasksResult describeBundleTasks();

    /**
     * <p>
     * Describes one or more of your linked EC2-Classic instances. This request only returns information about
     * EC2-Classic instances linked to a VPC through ClassicLink; you cannot use this request to return information
     * about other instances.
     * </p>
     * 
     * @param describeClassicLinkInstancesRequest
     *        Contains the parameters for DescribeClassicLinkInstances.
     * @return Result of the DescribeClassicLinkInstances operation returned by the service.
     * @sample AmazonEC2.DescribeClassicLinkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClassicLinkInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClassicLinkInstancesResult describeClassicLinkInstances(DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeClassicLinkInstances operation.
     *
     * @see #describeClassicLinkInstances(DescribeClassicLinkInstancesRequest)
     */
    DescribeClassicLinkInstancesResult describeClassicLinkInstances();

    /**
     * <p>
     * Describes one or more of your conversion tasks. For more information, see the <a
     * href="http://docs.aws.amazon.com/vm-import/latest/userguide/">VM Import/Export User Guide</a>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param describeConversionTasksRequest
     *        Contains the parameters for DescribeConversionTasks.
     * @return Result of the DescribeConversionTasks operation returned by the service.
     * @sample AmazonEC2.DescribeConversionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeConversionTasks" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeConversionTasksResult describeConversionTasks(DescribeConversionTasksRequest describeConversionTasksRequest);

    /**
     * Simplified method form for invoking the DescribeConversionTasks operation.
     *
     * @see #describeConversionTasks(DescribeConversionTasksRequest)
     */
    DescribeConversionTasksResult describeConversionTasks();

    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding a Hardware Virtual Private
     * Gateway to Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeCustomerGatewaysRequest
     *        Contains the parameters for DescribeCustomerGateways.
     * @return Result of the DescribeCustomerGateways operation returned by the service.
     * @sample AmazonEC2.DescribeCustomerGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeCustomerGateways" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCustomerGatewaysResult describeCustomerGateways(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeCustomerGateways operation.
     *
     * @see #describeCustomerGateways(DescribeCustomerGatewaysRequest)
     */
    DescribeCustomerGatewaysResult describeCustomerGateways();

    /**
     * <p>
     * Describes one or more of your DHCP options sets.
     * </p>
     * <p>
     * For more information about DHCP options sets, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html">DHCP Options Sets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeDhcpOptionsRequest
     *        Contains the parameters for DescribeDhcpOptions.
     * @return Result of the DescribeDhcpOptions operation returned by the service.
     * @sample AmazonEC2.DescribeDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDhcpOptionsResult describeDhcpOptions(DescribeDhcpOptionsRequest describeDhcpOptionsRequest);

    /**
     * Simplified method form for invoking the DescribeDhcpOptions operation.
     *
     * @see #describeDhcpOptions(DescribeDhcpOptionsRequest)
     */
    DescribeDhcpOptionsResult describeDhcpOptions();

    /**
     * <p>
     * Describes one or more of your egress-only Internet gateways.
     * </p>
     * 
     * @param describeEgressOnlyInternetGatewaysRequest
     * @return Result of the DescribeEgressOnlyInternetGateways operation returned by the service.
     * @sample AmazonEC2.DescribeEgressOnlyInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeEgressOnlyInternetGateways"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEgressOnlyInternetGatewaysResult describeEgressOnlyInternetGateways(
            DescribeEgressOnlyInternetGatewaysRequest describeEgressOnlyInternetGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     *        Contains the parameters for DescribeExportTasks.
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @sample AmazonEC2.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * Simplified method form for invoking the DescribeExportTasks operation.
     *
     * @see #describeExportTasks(DescribeExportTasksRequest)
     */
    DescribeExportTasksResult describeExportTasks();

    /**
     * <p>
     * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network
     * interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
     * </p>
     * 
     * @param describeFlowLogsRequest
     *        Contains the parameters for DescribeFlowLogs.
     * @return Result of the DescribeFlowLogs operation returned by the service.
     * @sample AmazonEC2.DescribeFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFlowLogsResult describeFlowLogs(DescribeFlowLogsRequest describeFlowLogsRequest);

    /**
     * Simplified method form for invoking the DescribeFlowLogs operation.
     *
     * @see #describeFlowLogs(DescribeFlowLogsRequest)
     */
    DescribeFlowLogsResult describeFlowLogs();

    /**
     * <p>
     * Describes the Dedicated Host Reservations that are available to purchase.
     * </p>
     * <p>
     * The results describe all the Dedicated Host Reservation offerings, including offerings that may not match the
     * instance family and region of your Dedicated Hosts. When purchasing an offering, ensure that the the instance
     * family and region of the offering matches that of the Dedicated Host/s it will be associated with. For an
     * overview of supported instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html">Dedicated Hosts
     * Overview</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeHostReservationOfferingsRequest
     * @return Result of the DescribeHostReservationOfferings operation returned by the service.
     * @sample AmazonEC2.DescribeHostReservationOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservationOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHostReservationOfferingsResult describeHostReservationOfferings(DescribeHostReservationOfferingsRequest describeHostReservationOfferingsRequest);

    /**
     * <p>
     * Describes Dedicated Host Reservations which are associated with Dedicated Hosts in your account.
     * </p>
     * 
     * @param describeHostReservationsRequest
     * @return Result of the DescribeHostReservations operation returned by the service.
     * @sample AmazonEC2.DescribeHostReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservations" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeHostReservationsResult describeHostReservations(DescribeHostReservationsRequest describeHostReservationsRequest);

    /**
     * <p>
     * Describes one or more of your Dedicated Hosts.
     * </p>
     * <p>
     * The results describe only the Dedicated Hosts in the region you're currently using. All listed instances consume
     * capacity on your Dedicated Host. Dedicated Hosts that have recently been released will be listed with the state
     * <code>released</code>.
     * </p>
     * 
     * @param describeHostsRequest
     *        Contains the parameters for DescribeHosts.
     * @return Result of the DescribeHosts operation returned by the service.
     * @sample AmazonEC2.DescribeHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHosts" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeHostsResult describeHosts(DescribeHostsRequest describeHostsRequest);

    /**
     * Simplified method form for invoking the DescribeHosts operation.
     *
     * @see #describeHosts(DescribeHostsRequest)
     */
    DescribeHostsResult describeHosts();

    /**
     * <p>
     * Describes your IAM instance profile associations.
     * </p>
     * 
     * @param describeIamInstanceProfileAssociationsRequest
     * @return Result of the DescribeIamInstanceProfileAssociations operation returned by the service.
     * @sample AmazonEC2.DescribeIamInstanceProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIamInstanceProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIamInstanceProfileAssociationsResult describeIamInstanceProfileAssociations(
            DescribeIamInstanceProfileAssociationsRequest describeIamInstanceProfileAssociationsRequest);

    /**
     * <p>
     * Describes the ID format settings for your resources on a per-region basis, for example, to view which resource
     * types are enabled for longer IDs. This request only returns information about resource types whose ID formats can
     * be modified; it does not return information about other resource types.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>instance</code> | <code>reservation</code> |
     * <code>snapshot</code> | <code>volume</code>.
     * </p>
     * <p>
     * These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By
     * default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings
     * by running the <a>ModifyIdFormat</a> command. Resources created with longer IDs are visible to all IAM users,
     * regardless of these settings and provided that they have permission to use the relevant <code>Describe</code>
     * command for the resource type.
     * </p>
     * 
     * @param describeIdFormatRequest
     *        Contains the parameters for DescribeIdFormat.
     * @return Result of the DescribeIdFormat operation returned by the service.
     * @sample AmazonEC2.DescribeIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeIdFormatResult describeIdFormat(DescribeIdFormatRequest describeIdFormatRequest);

    /**
     * Simplified method form for invoking the DescribeIdFormat operation.
     *
     * @see #describeIdFormat(DescribeIdFormatRequest)
     */
    DescribeIdFormatResult describeIdFormat();

    /**
     * <p>
     * Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example,
     * you can view the resource types that are enabled for longer IDs. This request only returns information about
     * resource types whose ID formats can be modified; it does not return information about other resource types. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html">Resource
     * IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>instance</code> | <code>reservation</code> |
     * <code>snapshot</code> | <code>volume</code>.
     * </p>
     * <p>
     * These settings apply to the principal specified in the request. They do not apply to the principal that makes the
     * request.
     * </p>
     * 
     * @param describeIdentityIdFormatRequest
     *        Contains the parameters for DescribeIdentityIdFormat.
     * @return Result of the DescribeIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2.DescribeIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdentityIdFormat" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeIdentityIdFormatResult describeIdentityIdFormat(DescribeIdentityIdFormatRequest describeIdentityIdFormatRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeImageAttributeRequest
     *        Contains the parameters for DescribeImageAttribute.
     * @return Result of the DescribeImageAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeImageAttributeResult describeImageAttribute(DescribeImageAttributeRequest describeImageAttributeRequest);

    /**
     * <p>
     * Describes one or more of the images (AMIs, AKIs, and ARIs) available to you. Images available to you include
     * public images, private images that you own, and private images owned by other AWS accounts but for which you have
     * explicit launch permissions.
     * </p>
     * <note>
     * <p>
     * Deregistered images are included in the returned results for an unspecified interval after deregistration.
     * </p>
     * </note>
     * 
     * @param describeImagesRequest
     *        Contains the parameters for DescribeImages.
     * @return Result of the DescribeImages operation returned by the service.
     * @sample AmazonEC2.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);

    /**
     * Simplified method form for invoking the DescribeImages operation.
     *
     * @see #describeImages(DescribeImagesRequest)
     */
    DescribeImagesResult describeImages();

    /**
     * <p>
     * Displays details about an import virtual machine or import snapshot tasks that are already created.
     * </p>
     * 
     * @param describeImportImageTasksRequest
     *        Contains the parameters for DescribeImportImageTasks.
     * @return Result of the DescribeImportImageTasks operation returned by the service.
     * @sample AmazonEC2.DescribeImportImageTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportImageTasks" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest describeImportImageTasksRequest);

    /**
     * Simplified method form for invoking the DescribeImportImageTasks operation.
     *
     * @see #describeImportImageTasks(DescribeImportImageTasksRequest)
     */
    DescribeImportImageTasksResult describeImportImageTasks();

    /**
     * <p>
     * Describes your import snapshot tasks.
     * </p>
     * 
     * @param describeImportSnapshotTasksRequest
     *        Contains the parameters for DescribeImportSnapshotTasks.
     * @return Result of the DescribeImportSnapshotTasks operation returned by the service.
     * @sample AmazonEC2.DescribeImportSnapshotTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportSnapshotTasks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeImportSnapshotTasksResult describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest);

    /**
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation.
     *
     * @see #describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest)
     */
    DescribeImportSnapshotTasksResult describeImportSnapshotTasks();

    /**
     * <p>
     * Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid
     * attribute values are: <code>instanceType</code> | <code>kernel</code> | <code>ramdisk</code> |
     * <code>userData</code> | <code>disableApiTermination</code> | <code>instanceInitiatedShutdownBehavior</code> |
     * <code>rootDeviceName</code> | <code>blockDeviceMapping</code> | <code>productCodes</code> |
     * <code>sourceDestCheck</code> | <code>groupSet</code> | <code>ebsOptimized</code> | <code>sriovNetSupport</code>
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     *        Contains the parameters for DescribeInstanceAttribute.
     * @return Result of the DescribeInstanceAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest);

    /**
     * <p>
     * Describes the status of one or more instances. By default, only running instances are described, unless specified
     * otherwise.
     * </p>
     * <p>
     * Instance status includes the following components:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Status checks</b> - Amazon EC2 performs status checks on running EC2 instances to identify hardware and
     * software issues. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-system-instance-status-check.html">Status
     * Checks for Your Instances</a> and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html">Troubleshooting Instances
     * with Failed Status Checks</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scheduled events</b> - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances
     * related to hardware issues, software updates, or system maintenance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html">Scheduled
     * Events for Your Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Instance state</b> - You can manage your instances from the moment you launch them through their termination.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html">Instance Lifecycle</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeInstanceStatusRequest
     *        Contains the parameters for DescribeInstanceStatus.
     * @return Result of the DescribeInstanceStatus operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstanceStatusResult describeInstanceStatus(DescribeInstanceStatusRequest describeInstanceStatusRequest);

    /**
     * Simplified method form for invoking the DescribeInstanceStatus operation.
     *
     * @see #describeInstanceStatus(DescribeInstanceStatusRequest)
     */
    DescribeInstanceStatusResult describeInstanceStatus();

    /**
     * <p>
     * Describes one or more of your instances.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not
     * specify instance IDs, Amazon EC2 returns information for all relevant instances. If you specify an instance ID
     * that is not valid, an error is returned. If you specify an instance that you do not own, it is not included in
     * the returned results.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results. This interval is usually less than one hour.
     * </p>
     * <p>
     * If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and
     * you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call
     * fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works
     * normally.
     * </p>
     * 
     * @param describeInstancesRequest
     *        Contains the parameters for DescribeInstances.
     * @return Result of the DescribeInstances operation returned by the service.
     * @sample AmazonEC2.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeInstances operation.
     *
     * @see #describeInstances(DescribeInstancesRequest)
     */
    DescribeInstancesResult describeInstances();

    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     * 
     * @param describeInternetGatewaysRequest
     *        Contains the parameters for DescribeInternetGateways.
     * @return Result of the DescribeInternetGateways operation returned by the service.
     * @sample AmazonEC2.DescribeInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInternetGateways" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInternetGatewaysResult describeInternetGateways(DescribeInternetGatewaysRequest describeInternetGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeInternetGateways operation.
     *
     * @see #describeInternetGateways(DescribeInternetGatewaysRequest)
     */
    DescribeInternetGatewaysResult describeInternetGateways();

    /**
     * <p>
     * Describes one or more of your key pairs.
     * </p>
     * <p>
     * For more information about key pairs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key Pairs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeKeyPairsRequest
     *        Contains the parameters for DescribeKeyPairs.
     * @return Result of the DescribeKeyPairs operation returned by the service.
     * @sample AmazonEC2.DescribeKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest);

    /**
     * Simplified method form for invoking the DescribeKeyPairs operation.
     *
     * @see #describeKeyPairs(DescribeKeyPairsRequest)
     */
    DescribeKeyPairsResult describeKeyPairs();

    /**
     * <p>
     * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to
     * the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your
     * account.
     * </p>
     * 
     * @param describeMovingAddressesRequest
     *        Contains the parameters for DescribeMovingAddresses.
     * @return Result of the DescribeMovingAddresses operation returned by the service.
     * @sample AmazonEC2.DescribeMovingAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeMovingAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeMovingAddressesResult describeMovingAddresses(DescribeMovingAddressesRequest describeMovingAddressesRequest);

    /**
     * Simplified method form for invoking the DescribeMovingAddresses operation.
     *
     * @see #describeMovingAddresses(DescribeMovingAddressesRequest)
     */
    DescribeMovingAddressesResult describeMovingAddresses();

    /**
     * <p>
     * Describes one or more of the your NAT gateways.
     * </p>
     * 
     * @param describeNatGatewaysRequest
     *        Contains the parameters for DescribeNatGateways.
     * @return Result of the DescribeNatGateways operation returned by the service.
     * @sample AmazonEC2.DescribeNatGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNatGateways" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeNatGatewaysResult describeNatGateways(DescribeNatGatewaysRequest describeNatGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your network ACLs.
     * </p>
     * <p>
     * For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeNetworkAclsRequest
     *        Contains the parameters for DescribeNetworkAcls.
     * @return Result of the DescribeNetworkAcls operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkAcls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkAcls" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeNetworkAclsResult describeNetworkAcls(DescribeNetworkAclsRequest describeNetworkAclsRequest);

    /**
     * Simplified method form for invoking the DescribeNetworkAcls operation.
     *
     * @see #describeNetworkAcls(DescribeNetworkAclsRequest)
     */
    DescribeNetworkAclsResult describeNetworkAcls();

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeNetworkInterfaceAttributeRequest
     *        Contains the parameters for DescribeNetworkInterfaceAttribute.
     * @return Result of the DescribeNetworkInterfaceAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacesRequest
     *        Contains the parameters for DescribeNetworkInterfaces.
     * @return Result of the DescribeNetworkInterfaces operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaces" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest);

    /**
     * Simplified method form for invoking the DescribeNetworkInterfaces operation.
     *
     * @see #describeNetworkInterfaces(DescribeNetworkInterfacesRequest)
     */
    DescribeNetworkInterfacesResult describeNetworkInterfaces();

    /**
     * <p>
     * Describes one or more of your placement groups. For more information about placement groups and cluster
     * instances, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Cluster
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describePlacementGroupsRequest
     *        Contains the parameters for DescribePlacementGroups.
     * @return Result of the DescribePlacementGroups operation returned by the service.
     * @sample AmazonEC2.DescribePlacementGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePlacementGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePlacementGroupsResult describePlacementGroups(DescribePlacementGroupsRequest describePlacementGroupsRequest);

    /**
     * Simplified method form for invoking the DescribePlacementGroups operation.
     *
     * @see #describePlacementGroups(DescribePlacementGroupsRequest)
     */
    DescribePlacementGroupsResult describePlacementGroups();

    /**
     * <p>
     * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID
     * of the service and the IP address range for the service. A prefix list ID is required for creating an outbound
     * security group rule that allows traffic from a VPC to access an AWS service through a VPC endpoint.
     * </p>
     * 
     * @param describePrefixListsRequest
     *        Contains the parameters for DescribePrefixLists.
     * @return Result of the DescribePrefixLists operation returned by the service.
     * @sample AmazonEC2.DescribePrefixLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePrefixLists" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePrefixListsResult describePrefixLists(DescribePrefixListsRequest describePrefixListsRequest);

    /**
     * Simplified method form for invoking the DescribePrefixLists operation.
     *
     * @see #describePrefixLists(DescribePrefixListsRequest)
     */
    DescribePrefixListsResult describePrefixLists();

    /**
     * <p>
     * Describes one or more regions that are currently available to you.
     * </p>
     * <p>
     * For a list of the regions supported by Amazon EC2, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region">Regions and Endpoints</a>.
     * </p>
     * 
     * @param describeRegionsRequest
     *        Contains the parameters for DescribeRegions.
     * @return Result of the DescribeRegions operation returned by the service.
     * @sample AmazonEC2.DescribeRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRegions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRegionsResult describeRegions(DescribeRegionsRequest describeRegionsRequest);

    /**
     * Simplified method form for invoking the DescribeRegions operation.
     *
     * @see #describeRegions(DescribeRegionsRequest)
     */
    DescribeRegionsResult describeRegions();

    /**
     * <p>
     * Describes one or more of the Reserved Instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved Instances, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html">Reserved
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Contains the parameters for DescribeReservedInstances.
     * @return Result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstances operation.
     *
     * @see #describeReservedInstances(DescribeReservedInstancesRequest)
     */
    DescribeReservedInstancesResult describeReservedInstances();

    /**
     * <p>
     * Describes your account's Reserved Instance listings in the Reserved Instance Marketplace.
     * </p>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no
     * longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the
     * Reserved Instance Marketplace work like any other Reserved Instances.
     * </p>
     * <p>
     * As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to
     * receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available
     * for purchase.
     * </p>
     * <p>
     * As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what
     * you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to
     * you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged
     * based on the total price of all of the listings that you purchase.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesListingsRequest
     *        Contains the parameters for DescribeReservedInstancesListings.
     * @return Result of the DescribeReservedInstancesListings operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstancesListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesListings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedInstancesListingsResult describeReservedInstancesListings(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesListings operation.
     *
     * @see #describeReservedInstancesListings(DescribeReservedInstancesListingsRequest)
     */
    DescribeReservedInstancesListingsResult describeReservedInstancesListings();

    /**
     * <p>
     * Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all
     * your Reserved Instances modification requests is returned. If a modification ID is specified, only information
     * about the specific modification is returned.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html">Modifying Reserved Instances</a> in
     * the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @param describeReservedInstancesModificationsRequest
     *        Contains the parameters for DescribeReservedInstancesModifications.
     * @return Result of the DescribeReservedInstancesModifications operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstancesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedInstancesModificationsResult describeReservedInstancesModifications(
            DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation.
     *
     * @see #describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest)
     */
    DescribeReservedInstancesModificationsResult describeReservedInstancesModifications();

    /**
     * <p>
     * Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the
     * right to launch instances for a period of time. During that time period, you do not receive insufficient capacity
     * errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used.
     * </p>
     * <p>
     * If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be
     * excluded from these results. This is to ensure that you do not purchase your own Reserved Instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesOfferingsRequest
     *        Contains the parameters for DescribeReservedInstancesOfferings.
     * @return Result of the DescribeReservedInstancesOfferings operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings(
            DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation.
     *
     * @see #describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest)
     */
    DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings();

    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any
     * route table, it is implicitly associated with the main route table. This command does not return the subnet ID
     * for implicit associations.
     * </p>
     * <p>
     * For more information about route tables, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">Route Tables</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeRouteTablesRequest
     *        Contains the parameters for DescribeRouteTables.
     * @return Result of the DescribeRouteTables operation returned by the service.
     * @sample AmazonEC2.DescribeRouteTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRouteTables" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRouteTablesResult describeRouteTables(DescribeRouteTablesRequest describeRouteTablesRequest);

    /**
     * Simplified method form for invoking the DescribeRouteTables operation.
     *
     * @see #describeRouteTables(DescribeRouteTablesRequest)
     */
    DescribeRouteTablesResult describeRouteTables();

    /**
     * <p>
     * Finds available schedules that meet the specified criteria.
     * </p>
     * <p>
     * You can search for an available schedule no more than 3 months in advance. You must meet the minimum required
     * duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule
     * is 24 hours, and the minimum monthly schedule is 100 hours.
     * </p>
     * <p>
     * After you find a schedule that meets your needs, call <a>PurchaseScheduledInstances</a> to purchase Scheduled
     * Instances with that schedule.
     * </p>
     * 
     * @param describeScheduledInstanceAvailabilityRequest
     *        Contains the parameters for DescribeScheduledInstanceAvailability.
     * @return Result of the DescribeScheduledInstanceAvailability operation returned by the service.
     * @sample AmazonEC2.DescribeScheduledInstanceAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstanceAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScheduledInstanceAvailabilityResult describeScheduledInstanceAvailability(
            DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest);

    /**
     * <p>
     * Describes one or more of your Scheduled Instances.
     * </p>
     * 
     * @param describeScheduledInstancesRequest
     *        Contains the parameters for DescribeScheduledInstances.
     * @return Result of the DescribeScheduledInstances operation returned by the service.
     * @sample AmazonEC2.DescribeScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeScheduledInstancesResult describeScheduledInstances(DescribeScheduledInstancesRequest describeScheduledInstancesRequest);

    /**
     * <p>
     * [EC2-VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security
     * groups you've specified in this request.
     * </p>
     * 
     * @param describeSecurityGroupReferencesRequest
     * @return Result of the DescribeSecurityGroupReferences operation returned by the service.
     * @sample AmazonEC2.DescribeSecurityGroupReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroupReferences"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSecurityGroupReferencesResult describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest describeSecurityGroupReferencesRequest);

    /**
     * <p>
     * Describes one or more of your security groups.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more
     * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSecurityGroupsRequest
     *        Contains the parameters for DescribeSecurityGroups.
     * @return Result of the DescribeSecurityGroups operation returned by the service.
     * @sample AmazonEC2.DescribeSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeSecurityGroups operation.
     *
     * @see #describeSecurityGroups(DescribeSecurityGroupsRequest)
     */
    DescribeSecurityGroupsResult describeSecurityGroups();

    /**
     * <p>
     * Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS snapshots, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html">Amazon EBS Snapshots</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSnapshotAttributeRequest
     *        Contains the parameters for DescribeSnapshotAttribute.
     * @return Result of the DescribeSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSnapshotAttributeResult describeSnapshotAttribute(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest);

    /**
     * <p>
     * Describes one or more of the EBS snapshots available to you. Available snapshots include public snapshots
     * available for any AWS account to launch, private snapshots that you own, and private snapshots owned by another
     * AWS account but for which you've been given explicit create volume permissions.
     * </p>
     * <p>
     * The create volume permissions fall into the following categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>public</i>: The owner of the snapshot granted create volume permissions for the snapshot to the
     * <code>all</code> group. All AWS accounts have create volume permissions for these snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>explicit</i>: The owner of the snapshot granted create volume permissions to a specific AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>implicit</i>: An AWS account has implicit create volume permissions for all snapshots it owns.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The list of snapshots returned can be modified by specifying snapshot IDs, snapshot owners, or AWS accounts with
     * create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have
     * create volume permissions.
     * </p>
     * <p>
     * If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify
     * an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it
     * is not included in the returned results.
     * </p>
     * <p>
     * If you specify one or more snapshot owners using the <code>OwnerIds</code> option, only snapshots from the
     * specified owners and for which you have access are returned. The results can include the AWS account IDs of the
     * specified owners, <code>amazon</code> for snapshots owned by Amazon, or <code>self</code> for snapshots that you
     * own.
     * </p>
     * <p>
     * If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are
     * returned. You can specify AWS account IDs (if you own the snapshots), <code>self</code> for snapshots for which
     * you own or have explicit permissions, or <code>all</code> for public snapshots.
     * </p>
     * <p>
     * If you are describing a long list of snapshots, you can paginate the output to make the list more manageable. The
     * <code>MaxResults</code> parameter sets the maximum number of results returned in a single page. If the list of
     * results exceeds your <code>MaxResults</code> value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent <code>DescribeSnapshots</code> request to
     * retrieve the remaining results.
     * </p>
     * <p>
     * For more information about EBS snapshots, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html">Amazon EBS Snapshots</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the parameters for DescribeSnapshots.
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonEC2.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshots(DescribeSnapshotsRequest)
     */
    DescribeSnapshotsResult describeSnapshots();

    /**
     * <p>
     * Describes the data feed for Spot instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance Data Feed</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DescribeSpotDatafeedSubscription.
     * @return Result of the DescribeSpotDatafeedSubscription operation returned by the service.
     * @sample AmazonEC2.DescribeSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest);

    /**
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation.
     *
     * @see #describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest)
     */
    DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription();

    /**
     * <p>
     * Describes the running instances for the specified Spot fleet.
     * </p>
     * 
     * @param describeSpotFleetInstancesRequest
     *        Contains the parameters for DescribeSpotFleetInstances.
     * @return Result of the DescribeSpotFleetInstances operation returned by the service.
     * @sample AmazonEC2.DescribeSpotFleetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSpotFleetInstancesResult describeSpotFleetInstances(DescribeSpotFleetInstancesRequest describeSpotFleetInstancesRequest);

    /**
     * <p>
     * Describes the events for the specified Spot fleet request during the specified time.
     * </p>
     * <p>
     * Spot fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query
     * by the last evaluated time and not miss a recorded event.
     * </p>
     * 
     * @param describeSpotFleetRequestHistoryRequest
     *        Contains the parameters for DescribeSpotFleetRequestHistory.
     * @return Result of the DescribeSpotFleetRequestHistory operation returned by the service.
     * @sample AmazonEC2.DescribeSpotFleetRequestHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequestHistory"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpotFleetRequestHistoryResult describeSpotFleetRequestHistory(DescribeSpotFleetRequestHistoryRequest describeSpotFleetRequestHistoryRequest);

    /**
     * <p>
     * Describes your Spot fleet requests.
     * </p>
     * <p>
     * Spot fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotFleetRequestsRequest
     *        Contains the parameters for DescribeSpotFleetRequests.
     * @return Result of the DescribeSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2.DescribeSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest describeSpotFleetRequestsRequest);

    /**
     * Simplified method form for invoking the DescribeSpotFleetRequests operation.
     *
     * @see #describeSpotFleetRequests(DescribeSpotFleetRequestsRequest)
     */
    DescribeSpotFleetRequestsResult describeSpotFleetRequests();

    /**
     * <p>
     * Describes the Spot instance requests that belong to your account. Spot instances are instances that Amazon EC2
     * launches when the bid price that you specify exceeds the current Spot price. Amazon EC2 periodically sets the
     * Spot price based on available Spot instance capacity and current Spot instance requests. For more information,
     * see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a running Spot instance by examining the response.
     * If the status of the Spot instance is <code>fulfilled</code>, the instance ID appears in the response and
     * contains the identifier of the instance. Alternatively, you can use <a>DescribeInstances</a> with a filter to
     * look for instances where the instance lifecycle is <code>spot</code>.
     * </p>
     * <p>
     * Spot instance requests are deleted 4 hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotInstanceRequestsRequest
     *        Contains the parameters for DescribeSpotInstanceRequests.
     * @return Result of the DescribeSpotInstanceRequests operation returned by the service.
     * @sample AmazonEC2.DescribeSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotInstanceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpotInstanceRequestsResult describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest);

    /**
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation.
     *
     * @see #describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest)
     */
    DescribeSpotInstanceRequestsResult describeSpotInstanceRequests();

    /**
     * <p>
     * Describes the Spot price history. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-history.html">Spot Instance Pricing
     * History</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * When you specify a start and end time, this operation returns the prices of the instance types within the time
     * range that you specified and the time when the price changed. The price is valid within the time period that you
     * specified; the response merely indicates the last time that the price changed.
     * </p>
     * 
     * @param describeSpotPriceHistoryRequest
     *        Contains the parameters for DescribeSpotPriceHistory.
     * @return Result of the DescribeSpotPriceHistory operation returned by the service.
     * @sample AmazonEC2.DescribeSpotPriceHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotPriceHistory" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSpotPriceHistoryResult describeSpotPriceHistory(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest);

    /**
     * Simplified method form for invoking the DescribeSpotPriceHistory operation.
     *
     * @see #describeSpotPriceHistory(DescribeSpotPriceHistoryRequest)
     */
    DescribeSpotPriceHistoryResult describeSpotPriceHistory();

    /**
     * <p>
     * [EC2-VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale
     * when they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC
     * peering connection has been deleted.
     * </p>
     * 
     * @param describeStaleSecurityGroupsRequest
     * @return Result of the DescribeStaleSecurityGroups operation returned by the service.
     * @sample AmazonEC2.DescribeStaleSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeStaleSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStaleSecurityGroupsResult describeStaleSecurityGroups(DescribeStaleSecurityGroupsRequest describeStaleSecurityGroupsRequest);

    /**
     * <p>
     * Describes one or more of your subnets.
     * </p>
     * <p>
     * For more information about subnets, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html">Your VPC and Subnets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSubnetsRequest
     *        Contains the parameters for DescribeSubnets.
     * @return Result of the DescribeSubnets operation returned by the service.
     * @sample AmazonEC2.DescribeSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSubnets" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest);

    /**
     * Simplified method form for invoking the DescribeSubnets operation.
     *
     * @see #describeSubnets(DescribeSubnetsRequest)
     */
    DescribeSubnetsResult describeSubnets();

    /**
     * <p>
     * Describes one or more of the tags for your EC2 resources.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @return Result of the DescribeTags operation returned by the service.
     * @sample AmazonEC2.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTags(DescribeTagsRequest)
     */
    DescribeTagsResult describeTags();

    /**
     * <p>
     * Describes the specified attribute of the specified volume. You can specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS volumes, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html">Amazon EBS Volumes</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVolumeAttributeRequest
     *        Contains the parameters for DescribeVolumeAttribute.
     * @return Result of the DescribeVolumeAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeVolumeAttributeResult describeVolumeAttribute(DescribeVolumeAttributeRequest describeVolumeAttributeRequest);

    /**
     * <p>
     * Describes the status of the specified volumes. Volume status provides the result of the checks performed on your
     * volumes to determine events that can impair the performance of your volumes. The performance of a volume can be
     * affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power
     * outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume
     * events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the
     * event.
     * </p>
     * <p>
     * The <code>DescribeVolumeStatus</code> operation provides the following information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i>: Reflects the current status of the volume. The possible values are <code>ok</code>,
     * <code>impaired</code> , <code>warning</code>, or <code>insufficient-data</code>. If all checks pass, the overall
     * status of the volume is <code>ok</code>. If the check fails, the overall status is <code>impaired</code>. If the
     * status is <code>insufficient-data</code>, then the checks may still be taking place on your volume at the time.
     * We recommend that you retry the request. For more information on volume status, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html">Monitoring the Status of
     * Your Volumes</a>.
     * </p>
     * <p>
     * <i>Events</i>: Reflect the cause of a volume status and may require you to take action. For example, if your
     * volume returns an <code>impaired</code> status, then the volume event might be
     * <code>potential-data-inconsistency</code>. This means that your volume has been affected by an issue with the
     * underlying host, has all I/O operations disabled, and may have inconsistent data.
     * </p>
     * <p>
     * <i>Actions</i>: Reflect the actions you may have to take in response to an event. For example, if the status of
     * the volume is <code>impaired</code> and the volume event shows <code>potential-data-inconsistency</code>, then
     * the action shows <code>enable-volume-io</code>. This means that you may want to enable the I/O operations for the
     * volume by calling the <a>EnableVolumeIO</a> action and then check the volume for data consistency.
     * </p>
     * <note>
     * <p>
     * Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume
     * status does not indicate volumes in the <code>error</code> state (for example, when a volume is incapable of
     * accepting I/O.)
     * </p>
     * </note>
     * 
     * @param describeVolumeStatusRequest
     *        Contains the parameters for DescribeVolumeStatus.
     * @return Result of the DescribeVolumeStatus operation returned by the service.
     * @sample AmazonEC2.DescribeVolumeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeStatus" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVolumeStatusResult describeVolumeStatus(DescribeVolumeStatusRequest describeVolumeStatusRequest);

    /**
     * Simplified method form for invoking the DescribeVolumeStatus operation.
     *
     * @see #describeVolumeStatus(DescribeVolumeStatusRequest)
     */
    DescribeVolumeStatusResult describeVolumeStatus();

    /**
     * <p>
     * Describes the specified EBS volumes.
     * </p>
     * <p>
     * If you are describing a long list of volumes, you can paginate the output to make the list more manageable. The
     * <code>MaxResults</code> parameter sets the maximum number of results returned in a single page. If the list of
     * results exceeds your <code>MaxResults</code> value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent <code>DescribeVolumes</code> request to retrieve
     * the remaining results.
     * </p>
     * <p>
     * For more information about EBS volumes, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html">Amazon EBS Volumes</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVolumesRequest
     *        Contains the parameters for DescribeVolumes.
     * @return Result of the DescribeVolumes operation returned by the service.
     * @sample AmazonEC2.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest);

    /**
     * Simplified method form for invoking the DescribeVolumes operation.
     *
     * @see #describeVolumes(DescribeVolumesRequest)
     */
    DescribeVolumesResult describeVolumes();

    /**
     * <p>
     * Reports the current modification status of EBS volumes.
     * </p>
     * <p>
     * Current-generation EBS volumes support modification of attributes including type, size, and (for <code>io1</code>
     * volumes) IOPS provisioning while either attached to or detached from an instance. Following an action from the
     * API or the console to modify a volume, the status of the modification may be <code>modifying</code>,
     * <code>optimizing</code>, <code>completed</code>, or <code>failed</code>. If a volume has never been modified,
     * then certain elements of the returned <code>VolumeModification</code> objects are null.
     * </p>
     * <p>
     * You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about
     * CloudWatch Events, see the <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon CloudWatch
     * Events User Guide</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods">Monitoring
     * Volume Modifications"</a>.
     * </p>
     * 
     * @param describeVolumesModificationsRequest
     * @return Result of the DescribeVolumesModifications operation returned by the service.
     * @sample AmazonEC2.DescribeVolumesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVolumesModificationsResult describeVolumesModifications(DescribeVolumesModificationsRequest describeVolumesModificationsRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeVpcAttributeRequest
     *        Contains the parameters for DescribeVpcAttribute.
     * @return Result of the DescribeVpcAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcAttributeResult describeVpcAttribute(DescribeVpcAttributeRequest describeVpcAttributeRequest);

    /**
     * <p>
     * Describes the ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @param describeVpcClassicLinkRequest
     *        Contains the parameters for DescribeVpcClassicLink.
     * @return Result of the DescribeVpcClassicLink operation returned by the service.
     * @sample AmazonEC2.DescribeVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcClassicLinkResult describeVpcClassicLink(DescribeVpcClassicLinkRequest describeVpcClassicLinkRequest);

    /**
     * Simplified method form for invoking the DescribeVpcClassicLink operation.
     *
     * @see #describeVpcClassicLink(DescribeVpcClassicLinkRequest)
     */
    DescribeVpcClassicLinkResult describeVpcClassicLink();

    /**
     * <p>
     * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked
     * EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
     * linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
     * from a linked EC2-Classic instance. For more information about ClassicLink, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @param describeVpcClassicLinkDnsSupportRequest
     *        Contains the parameters for DescribeVpcClassicLinkDnsSupport.
     * @return Result of the DescribeVpcClassicLinkDnsSupport operation returned by the service.
     * @sample AmazonEC2.DescribeVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcClassicLinkDnsSupportResult describeVpcClassicLinkDnsSupport(DescribeVpcClassicLinkDnsSupportRequest describeVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Describes all supported AWS services that can be specified when creating a VPC endpoint.
     * </p>
     * 
     * @param describeVpcEndpointServicesRequest
     *        Contains the parameters for DescribeVpcEndpointServices.
     * @return Result of the DescribeVpcEndpointServices operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpointServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServices"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest describeVpcEndpointServicesRequest);

    /**
     * Simplified method form for invoking the DescribeVpcEndpointServices operation.
     *
     * @see #describeVpcEndpointServices(DescribeVpcEndpointServicesRequest)
     */
    DescribeVpcEndpointServicesResult describeVpcEndpointServices();

    /**
     * <p>
     * Describes one or more of your VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     *        Contains the parameters for DescribeVpcEndpoints.
     * @return Result of the DescribeVpcEndpoints operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcEndpointsResult describeVpcEndpoints(DescribeVpcEndpointsRequest describeVpcEndpointsRequest);

    /**
     * Simplified method form for invoking the DescribeVpcEndpoints operation.
     *
     * @see #describeVpcEndpoints(DescribeVpcEndpointsRequest)
     */
    DescribeVpcEndpointsResult describeVpcEndpoints();

    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Contains the parameters for DescribeVpcPeeringConnections.
     * @return Result of the DescribeVpcPeeringConnections operation returned by the service.
     * @sample AmazonEC2.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest);

    /**
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation.
     *
     * @see #describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest)
     */
    DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections();

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     * 
     * @param describeVpcsRequest
     *        Contains the parameters for DescribeVpcs.
     * @return Result of the DescribeVpcs operation returned by the service.
     * @sample AmazonEC2.DescribeVpcs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest);

    /**
     * Simplified method form for invoking the DescribeVpcs operation.
     *
     * @see #describeVpcs(DescribeVpcsRequest)
     */
    DescribeVpcsResult describeVpcs();

    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information about VPN connections, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding a Hardware Virtual Private
     * Gateway to Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpnConnectionsRequest
     *        Contains the parameters for DescribeVpnConnections.
     * @return Result of the DescribeVpnConnections operation returned by the service.
     * @sample AmazonEC2.DescribeVpnConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnConnections" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpnConnectionsResult describeVpnConnections(DescribeVpnConnectionsRequest describeVpnConnectionsRequest);

    /**
     * Simplified method form for invoking the DescribeVpnConnections operation.
     *
     * @see #describeVpnConnections(DescribeVpnConnectionsRequest)
     */
    DescribeVpnConnectionsResult describeVpnConnections();

    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information about virtual private gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">Adding an IPsec Hardware VPN to Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpnGatewaysRequest
     *        Contains the parameters for DescribeVpnGateways.
     * @return Result of the DescribeVpnGateways operation returned by the service.
     * @sample AmazonEC2.DescribeVpnGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnGateways" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpnGatewaysResult describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeVpnGateways operation.
     *
     * @see #describeVpnGateways(DescribeVpnGatewaysRequest)
     */
    DescribeVpnGatewaysResult describeVpnGateways();

    /**
     * <p>
     * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC
     * security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's
     * stopped.
     * </p>
     * 
     * @param detachClassicLinkVpcRequest
     *        Contains the parameters for DetachClassicLinkVpc.
     * @return Result of the DetachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2.DetachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    DetachClassicLinkVpcResult detachClassicLinkVpc(DetachClassicLinkVpcRequest detachClassicLinkVpcRequest);

    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity between the Internet and the VPC. The VPC must
     * not contain any running instances with Elastic IP addresses.
     * </p>
     * 
     * @param detachInternetGatewayRequest
     *        Contains the parameters for DetachInternetGateway.
     * @return Result of the DetachInternetGateway operation returned by the service.
     * @sample AmazonEC2.DetachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DetachInternetGatewayResult detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest);

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     * 
     * @param detachNetworkInterfaceRequest
     *        Contains the parameters for DetachNetworkInterface.
     * @return Result of the DetachNetworkInterface operation returned by the service.
     * @sample AmazonEC2.DetachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    DetachNetworkInterfaceResult detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest);

    /**
     * <p>
     * Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your
     * operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the
     * <code>busy</code> state while detaching. If this happens, detachment can be delayed indefinitely until you
     * unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of
     * an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance
     * first.
     * </p>
     * <p>
     * When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer
     * associated with the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html">Detaching an Amazon EBS
     * Volume</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param detachVolumeRequest
     *        Contains the parameters for DetachVolume.
     * @return Result of the DetachVolume operation returned by the service.
     * @sample AmazonEC2.DetachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest);

    /**
     * <p>
     * Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it
     * anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the
     * virtual private gateway (any attachments to the virtual private gateway are also described).
     * </p>
     * <p>
     * You must wait for the attachment's state to switch to <code>detached</code> before you can delete the VPC or
     * attach a different VPC to the virtual private gateway.
     * </p>
     * 
     * @param detachVpnGatewayRequest
     *        Contains the parameters for DetachVpnGateway.
     * @return Result of the DetachVpnGateway operation returned by the service.
     * @sample AmazonEC2.DetachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DetachVpnGatewayResult detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest);

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
     * </p>
     * 
     * @param disableVgwRoutePropagationRequest
     *        Contains the parameters for DisableVgwRoutePropagation.
     * @return Result of the DisableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2.DisableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    DisableVgwRoutePropagationResult disableVgwRoutePropagation(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest);

    /**
     * <p>
     * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to
     * it.
     * </p>
     * 
     * @param disableVpcClassicLinkRequest
     *        Contains the parameters for DisableVpcClassicLink.
     * @return Result of the DisableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2.DisableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    DisableVpcClassicLinkResult disableVpcClassicLink(DisableVpcClassicLinkRequest disableVpcClassicLinkRequest);

    /**
     * <p>
     * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when
     * addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more
     * information about ClassicLink, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @param disableVpcClassicLinkDnsSupportRequest
     *        Contains the parameters for DisableVpcClassicLinkDnsSupport.
     * @return Result of the DisableVpcClassicLinkDnsSupport operation returned by the service.
     * @sample AmazonEC2.DisableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    DisableVpcClassicLinkDnsSupportResult disableVpcClassicLinkDnsSupport(DisableVpcClassicLinkDnsSupportRequest disableVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Disassociates an Elastic IP address from the instance or network interface it's associated with.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
     * </p>
     * 
     * @param disassociateAddressRequest
     *        Contains the parameters for DisassociateAddress.
     * @return Result of the DisassociateAddress operation returned by the service.
     * @sample AmazonEC2.DisassociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateAddressResult disassociateAddress(DisassociateAddressRequest disassociateAddressRequest);

    /**
     * <p>
     * Disassociates an IAM instance profile from a running or stopped instance.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association ID.
     * </p>
     * 
     * @param disassociateIamInstanceProfileRequest
     * @return Result of the DisassociateIamInstanceProfile operation returned by the service.
     * @sample AmazonEC2.DisassociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateIamInstanceProfileResult disassociateIamInstanceProfile(DisassociateIamInstanceProfileRequest disassociateIamInstanceProfileRequest);

    /**
     * <p>
     * Disassociates a subnet from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the
     * routes in the VPC's main route table. For more information about route tables, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">Route Tables</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param disassociateRouteTableRequest
     *        Contains the parameters for DisassociateRouteTable.
     * @return Result of the DisassociateRouteTable operation returned by the service.
     * @sample AmazonEC2.DisassociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateRouteTableResult disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest);

    /**
     * <p>
     * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must
     * detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate
     * it.
     * </p>
     * 
     * @param disassociateSubnetCidrBlockRequest
     * @return Result of the DisassociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2.DisassociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateSubnetCidrBlock"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSubnetCidrBlockResult disassociateSubnetCidrBlock(DisassociateSubnetCidrBlockRequest disassociateSubnetCidrBlockRequest);

    /**
     * <p>
     * Disassociates a CIDR block from a VPC. Currently, you can disassociate an IPv6 CIDR block only. You must detach
     * or delete all gateways and resources that are associated with the CIDR block before you can disassociate it.
     * </p>
     * 
     * @param disassociateVpcCidrBlockRequest
     * @return Result of the DisassociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2.DisassociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateVpcCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateVpcCidrBlockResult disassociateVpcCidrBlock(DisassociateVpcCidrBlockRequest disassociateVpcCidrBlockRequest);

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
     * </p>
     * 
     * @param enableVgwRoutePropagationRequest
     *        Contains the parameters for EnableVgwRoutePropagation.
     * @return Result of the EnableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2.EnableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    EnableVgwRoutePropagationResult enableVgwRoutePropagation(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest);

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was
     * potentially inconsistent.
     * </p>
     * 
     * @param enableVolumeIORequest
     *        Contains the parameters for EnableVolumeIO.
     * @return Result of the EnableVolumeIO operation returned by the service.
     * @sample AmazonEC2.EnableVolumeIO
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVolumeIO" target="_top">AWS API
     *      Documentation</a>
     */
    EnableVolumeIOResult enableVolumeIO(EnableVolumeIORequest enableVolumeIORequest);

    /**
     * <p>
     * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow
     * communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC's route
     * tables have existing routes for address ranges within the <code>10.0.0.0/8</code> IP address range, excluding
     * local routes for VPCs in the <code>10.0.0.0/16</code> and <code>10.1.0.0/16</code> IP address ranges. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @param enableVpcClassicLinkRequest
     *        Contains the parameters for EnableVpcClassicLink.
     * @return Result of the EnableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2.EnableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    EnableVpcClassicLinkResult enableVpcClassicLink(EnableVpcClassicLinkRequest enableVpcClassicLinkRequest);

    /**
     * <p>
     * Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked
     * EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
     * linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
     * from a linked EC2-Classic instance. For more information about ClassicLink, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param enableVpcClassicLinkDnsSupportRequest
     *        Contains the parameters for EnableVpcClassicLinkDnsSupport.
     * @return Result of the EnableVpcClassicLinkDnsSupport operation returned by the service.
     * @sample AmazonEC2.EnableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    EnableVpcClassicLinkDnsSupportResult enableVpcClassicLinkDnsSupport(EnableVpcClassicLinkDnsSupportRequest enableVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Gets the console output for the specified instance.
     * </p>
     * <p>
     * Instances do not have a physical monitor through which you can view their console output. They also lack physical
     * controls that allow you to power up, reboot, or shut them down. To allow these actions, we provide them through
     * the Amazon EC2 API and command line interface.
     * </p>
     * <p>
     * Instance console output is buffered and posted shortly after instance boot, reboot, and termination. Amazon EC2
     * preserves the most recent 64 KB output which is available for at least one hour after the most recent post.
     * </p>
     * <p>
     * For Linux instances, the instance console output displays the exact console output that would normally be
     * displayed on a physical monitor attached to a computer. This output is buffered because the instance produces it
     * and then posts it to a store where the instance's owner can retrieve it.
     * </p>
     * <p>
     * For Windows instances, the instance console output includes output from the EC2Config service.
     * </p>
     * 
     * @param getConsoleOutputRequest
     *        Contains the parameters for GetConsoleOutput.
     * @return Result of the GetConsoleOutput operation returned by the service.
     * @sample AmazonEC2.GetConsoleOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleOutput" target="_top">AWS API
     *      Documentation</a>
     */
    GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest);

    /**
     * <p>
     * Retrieve a JPG-format screenshot of a running instance to help with troubleshooting.
     * </p>
     * <p>
     * The returned content is Base64-encoded.
     * </p>
     * 
     * @param getConsoleScreenshotRequest
     *        Contains the parameters for the request.
     * @return Result of the GetConsoleScreenshot operation returned by the service.
     * @sample AmazonEC2.GetConsoleScreenshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleScreenshot" target="_top">AWS API
     *      Documentation</a>
     */
    GetConsoleScreenshotResult getConsoleScreenshot(GetConsoleScreenshotRequest getConsoleScreenshotRequest);

    /**
     * <p>
     * Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active
     * Dedicated Hosts in your account before you purchase a reservation.
     * </p>
     * <p>
     * This is a preview of the <a>PurchaseHostReservation</a> action and does not result in the offering being
     * purchased.
     * </p>
     * 
     * @param getHostReservationPurchasePreviewRequest
     * @return Result of the GetHostReservationPurchasePreview operation returned by the service.
     * @sample AmazonEC2.GetHostReservationPurchasePreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetHostReservationPurchasePreview"
     *      target="_top">AWS API Documentation</a>
     */
    GetHostReservationPurchasePreviewResult getHostReservationPurchasePreview(GetHostReservationPurchasePreviewRequest getHostReservationPurchasePreviewRequest);

    /**
     * <p>
     * Retrieves the encrypted administrator password for an instance running Windows.
     * </p>
     * <p>
     * The Windows password is generated at boot if the <code>EC2Config</code> service plugin,
     * <code>Ec2SetPassword</code>, is enabled. This usually only happens the first time an AMI is launched, and then
     * <code>Ec2SetPassword</code> is automatically disabled. The password is not generated for rebundled AMIs unless
     * <code>Ec2SetPassword</code> is enabled before bundling.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when you launched the instance. You must provide
     * the corresponding key pair file.
     * </p>
     * <p>
     * Password generation and encryption takes a few moments. We recommend that you wait up to 15 minutes after
     * launching an instance before trying to retrieve the generated password.
     * </p>
     * 
     * @param getPasswordDataRequest
     *        Contains the parameters for GetPasswordData.
     * @return Result of the GetPasswordData operation returned by the service.
     * @sample AmazonEC2.GetPasswordData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetPasswordData" target="_top">AWS API
     *      Documentation</a>
     */
    GetPasswordDataResult getPasswordData(GetPasswordDataRequest getPasswordDataRequest);

    /**
     * <p>
     * Returns details about the values and term of your specified Convertible Reserved Instances. When a target
     * configuration is specified, it returns information about whether the exchange is valid and can be performed.
     * </p>
     * 
     * @param getReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for GetReservedInstanceExchangeQuote.
     * @return Result of the GetReservedInstancesExchangeQuote operation returned by the service.
     * @sample AmazonEC2.GetReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    GetReservedInstancesExchangeQuoteResult getReservedInstancesExchangeQuote(GetReservedInstancesExchangeQuoteRequest getReservedInstancesExchangeQuoteRequest);

    /**
     * <p>
     * Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI). For more
     * information, see <a
     * href="http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html">Importing a VM as an
     * Image Using VM Import/Export</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param importImageRequest
     *        Contains the parameters for ImportImage.
     * @return Result of the ImportImage operation returned by the service.
     * @sample AmazonEC2.ImportImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportImage" target="_top">AWS API
     *      Documentation</a>
     */
    ImportImageResult importImage(ImportImageRequest importImageRequest);

    /**
     * Simplified method form for invoking the ImportImage operation.
     *
     * @see #importImage(ImportImageRequest)
     */
    ImportImageResult importImage();

    /**
     * <p>
     * Creates an import instance task using metadata from the specified disk image. <code>ImportInstance</code> only
     * supports single-volume VMs. To import multi-volume VMs, use <a>ImportImage</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/ec2-cli-vmimport-export.html">Importing a
     * Virtual Machine Using the Amazon EC2 CLI</a>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param importInstanceRequest
     *        Contains the parameters for ImportInstance.
     * @return Result of the ImportInstance operation returned by the service.
     * @sample AmazonEC2.ImportInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportInstance" target="_top">AWS API
     *      Documentation</a>
     */
    ImportInstanceResult importInstance(ImportInstanceRequest importInstanceRequest);

    /**
     * <p>
     * Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with
     * <a>CreateKeyPair</a>, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public
     * key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never
     * transferred between you and AWS.
     * </p>
     * <p>
     * For more information about key pairs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key Pairs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param importKeyPairRequest
     *        Contains the parameters for ImportKeyPair.
     * @return Result of the ImportKeyPair operation returned by the service.
     * @sample AmazonEC2.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest);

    /**
     * <p>
     * Imports a disk into an EBS snapshot.
     * </p>
     * 
     * @param importSnapshotRequest
     *        Contains the parameters for ImportSnapshot.
     * @return Result of the ImportSnapshot operation returned by the service.
     * @sample AmazonEC2.ImportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    ImportSnapshotResult importSnapshot(ImportSnapshotRequest importSnapshotRequest);

    /**
     * Simplified method form for invoking the ImportSnapshot operation.
     *
     * @see #importSnapshot(ImportSnapshotRequest)
     */
    ImportSnapshotResult importSnapshot();

    /**
     * <p>
     * Creates an import volume task using metadata from the specified disk image.For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/importing-your-volumes-into-amazon-ebs.html"
     * >Importing Disks to Amazon EBS</a>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param importVolumeRequest
     *        Contains the parameters for ImportVolume.
     * @return Result of the ImportVolume operation returned by the service.
     * @sample AmazonEC2.ImportVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportVolume" target="_top">AWS API
     *      Documentation</a>
     */
    ImportVolumeResult importVolume(ImportVolumeRequest importVolumeRequest);

    /**
     * <p>
     * Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, AWS will place instances
     * that you launch with a tenancy of <code>host</code>, but without targeting a specific host ID, onto any available
     * Dedicated Host in your account which has auto-placement enabled. When auto-placement is disabled, you need to
     * provide a host ID if you want the instance to launch onto a specific host. If no host ID is provided, the
     * instance will be launched onto a suitable host which has auto-placement enabled.
     * </p>
     * 
     * @param modifyHostsRequest
     *        Contains the parameters for ModifyHosts.
     * @return Result of the ModifyHosts operation returned by the service.
     * @sample AmazonEC2.ModifyHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyHosts" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyHostsResult modifyHosts(ModifyHostsRequest modifyHostsRequest);

    /**
     * <p>
     * Modifies the ID format for the specified resource on a per-region basis. You can specify that resources should
     * receive longer IDs (17-character IDs) when they are created. The following resource types support longer IDs:
     * <code>instance</code> | <code>reservation</code> | <code>snapshot</code> | <code>volume</code>.
     * </p>
     * <p>
     * This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By
     * default, an IAM user defaults to the same settings as the root user. If you're using this action as the root
     * user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for
     * themselves. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html">Resource IDs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
     * provided that they have permission to use the relevant <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @param modifyIdFormatRequest
     *        Contains the parameters of ModifyIdFormat.
     * @return Result of the ModifyIdFormat operation returned by the service.
     * @sample AmazonEC2.ModifyIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyIdFormatResult modifyIdFormat(ModifyIdFormatRequest modifyIdFormatRequest);

    /**
     * <p>
     * Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all
     * IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs
     * (17-character IDs) when they are created.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>instance</code> | <code>reservation</code> |
     * <code>snapshot</code> | <code>volume</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html">Resource IDs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This setting applies to the principal specified in the request; it does not apply to the principal that makes the
     * request.
     * </p>
     * <p>
     * Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
     * provided that they have permission to use the relevant <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @param modifyIdentityIdFormatRequest
     *        Contains the parameters of ModifyIdentityIdFormat.
     * @return Result of the ModifyIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2.ModifyIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdentityIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyIdentityIdFormatResult modifyIdentityIdFormat(ModifyIdentityIdFormatRequest modifyIdentityIdFormatRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time.
     * </p>
     * <note>
     * <p>
     * AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made
     * public.
     * </p>
     * </note> <note>
     * <p>
     * The SriovNetSupport enhanced networking attribute cannot be changed using this command. Instead, enable
     * SriovNetSupport on an instance and create an AMI from the instance. This will result in an image with
     * SriovNetSupport enabled.
     * </p>
     * </note>
     * 
     * @param modifyImageAttributeRequest
     *        Contains the parameters for ModifyImageAttribute.
     * @return Result of the ModifyImageAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyImageAttributeResult modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.
     * </p>
     * <p>
     * To modify some attributes, the instance must be stopped. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"
     * >Modifying Attributes of a Stopped Instance</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceAttributeRequest
     *        Contains the parameters for ModifyInstanceAttribute.
     * @return Result of the ModifyInstanceAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyInstanceAttributeResult modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest);

    /**
     * <p>
     * Set the instance affinity value for a specific stopped instance and modify the instance tenancy setting.
     * </p>
     * <p>
     * Instance affinity is disabled by default. When instance affinity is <code>host</code> and it is not associated
     * with a specific Dedicated Host, the next time it is launched it will automatically be associated with the host it
     * lands on. This relationship will persist if the instance is stopped/started, or rebooted.
     * </p>
     * <p>
     * You can modify the host ID associated with a stopped instance. If a stopped instance has a new host ID
     * association, the instance will target that host when restarted.
     * </p>
     * <p>
     * You can modify the tenancy of a stopped instance with a tenancy of <code>host</code> or <code>dedicated</code>.
     * </p>
     * <p>
     * Affinity, hostID, and tenancy are not required parameters, but at least one of them must be specified in the
     * request. Affinity and tenancy can be modified in the same request, but tenancy can only be modified on instances
     * that are stopped.
     * </p>
     * 
     * @param modifyInstancePlacementRequest
     *        Contains the parameters for ModifyInstancePlacement.
     * @return Result of the ModifyInstancePlacement operation returned by the service.
     * @sample AmazonEC2.ModifyInstancePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstancePlacement" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyInstancePlacementResult modifyInstancePlacement(ModifyInstancePlacementRequest modifyInstancePlacementRequest);

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param modifyNetworkInterfaceAttributeRequest
     *        Contains the parameters for ModifyNetworkInterfaceAttribute.
     * @return Result of the ModifyNetworkInterfaceAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyNetworkInterfaceAttributeResult modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of
     * your Standard Reserved Instances. The Reserved Instances to be modified must be identical, except for
     * Availability Zone, network platform, and instance type.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html">Modifying Reserved Instances</a> in
     * the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @param modifyReservedInstancesRequest
     *        Contains the parameters for ModifyReservedInstances.
     * @return Result of the ModifyReservedInstances operation returned by the service.
     * @sample AmazonEC2.ModifyReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyReservedInstancesResult modifyReservedInstances(ModifyReservedInstancesRequest modifyReservedInstancesRequest);

    /**
     * <p>
     * Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs
     * from a snapshot's list of create volume permissions, but you cannot do both in a single API call. If you need to
     * both add and remove account IDs for a snapshot, you must use multiple API calls.
     * </p>
     * <note>
     * <p>
     * Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted
     * with your default CMK cannot be shared with other accounts.
     * </p>
     * </note>
     * <p>
     * For more information on modifying snapshot permissions, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html">Sharing
     * Snapshots</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifySnapshotAttributeRequest
     *        Contains the parameters for ModifySnapshotAttribute.
     * @return Result of the ModifySnapshotAttribute operation returned by the service.
     * @sample AmazonEC2.ModifySnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    ModifySnapshotAttributeResult modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest);

    /**
     * <p>
     * Modifies the specified Spot fleet request.
     * </p>
     * <p>
     * While the Spot fleet request is being modified, it is in the <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your Spot fleet, increase its target capacity. The Spot fleet launches the additional Spot instances
     * according to the allocation strategy for the Spot fleet request. If the allocation strategy is
     * <code>lowestPrice</code>, the Spot fleet launches instances using the Spot pool with the lowest price. If the
     * allocation strategy is <code>diversified</code>, the Spot fleet distributes the instances across the Spot pools.
     * </p>
     * <p>
     * To scale down your Spot fleet, decrease its target capacity. First, the Spot fleet cancels any open bids that
     * exceed the new target capacity. You can request that the Spot fleet terminate Spot instances until the size of
     * the fleet no longer exceeds the new target capacity. If the allocation strategy is <code>lowestPrice</code>, the
     * Spot fleet terminates the instances with the highest price per unit. If the allocation strategy is
     * <code>diversified</code>, the Spot fleet terminates instances across the Spot pools. Alternatively, you can
     * request that the Spot fleet keep the fleet at its current size, but not replace any Spot instances that are
     * interrupted or that you terminate manually.
     * </p>
     * 
     * @param modifySpotFleetRequestRequest
     *        Contains the parameters for ModifySpotFleetRequest.
     * @return Result of the ModifySpotFleetRequest operation returned by the service.
     * @sample AmazonEC2.ModifySpotFleetRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySpotFleetRequest" target="_top">AWS API
     *      Documentation</a>
     */
    ModifySpotFleetRequestResult modifySpotFleetRequest(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest);

    /**
     * <p>
     * Modifies a subnet attribute. You can only modify one attribute at a time.
     * </p>
     * 
     * @param modifySubnetAttributeRequest
     *        Contains the parameters for ModifySubnetAttribute.
     * @return Result of the ModifySubnetAttribute operation returned by the service.
     * @sample AmazonEC2.ModifySubnetAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySubnetAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifySubnetAttributeResult modifySubnetAttribute(ModifySubnetAttributeRequest modifySubnetAttributeRequest);

    /**
     * <p>
     * You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS
     * capacity. If your EBS volume is attached to a current-generation EC2 instance type, you may be able to apply
     * these changes without stopping the instance or detaching the volume from it. For more information about modifying
     * an EBS volume running Linux, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html">Modifying the Size, IOPS, or
     * Type of an EBS Volume on Linux</a>. For more information about modifying an EBS volume running Windows, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html">Modifying the Size, IOPS, or
     * Type of an EBS Volume on Windows</a>.
     * </p>
     * <p>
     * When you complete a resize operation on your volume, you need to extend the volume's file-system size to take
     * advantage of the new storage capacity. For information about extending a Linux file system, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#recognize-expanded-volume-linux"
     * >Extending a Linux File System</a>. For information about extending a Windows file system, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html#recognize-expanded-volume-windows"
     * >Extending a Windows File System</a>.
     * </p>
     * <p>
     * You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about
     * CloudWatch Events, see the <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon CloudWatch
     * Events User Guide</a>. You can also track the status of a modification using the
     * <a>DescribeVolumesModifications</a> API. For information about tracking status changes using either method, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods">Monitoring
     * Volume Modifications</a>.
     * </p>
     * <note>
     * <p>
     * With previous-generation instance types, resizing an EBS volume may require detaching and reattaching the volume
     * or stopping and restarting the instance. For more information about modifying an EBS volume running Linux, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html">Modifying the Size, IOPS, or
     * Type of an EBS Volume on Linux</a>. For more information about modifying an EBS volume running Windows, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html">Modifying the Size, IOPS, or
     * Type of an EBS Volume on Windows</a>.
     * </p>
     * </note> <note>
     * <p>
     * If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours
     * before applying further modifications to the affected EBS volume.
     * </p>
     * </note>
     * 
     * @param modifyVolumeRequest
     * @return Result of the ModifyVolume operation returned by the service.
     * @sample AmazonEC2.ModifyVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolume" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVolumeResult modifyVolume(ModifyVolumeRequest modifyVolumeRequest);

    /**
     * <p>
     * Modifies a volume attribute.
     * </p>
     * <p>
     * By default, all I/O operations for the volume are suspended when the data on the volume is determined to be
     * potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be
     * resumed by first enabling I/O access and then checking the data consistency on your volume.
     * </p>
     * <p>
     * You can change the default behavior to resume I/O operations. We recommend that you change this only for boot
     * volumes or for volumes that are stateless or disposable.
     * </p>
     * 
     * @param modifyVolumeAttributeRequest
     *        Contains the parameters for ModifyVolumeAttribute.
     * @return Result of the ModifyVolumeAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolumeAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVolumeAttributeResult modifyVolumeAttribute(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     * 
     * @param modifyVpcAttributeRequest
     *        Contains the parameters for ModifyVpcAttribute.
     * @return Result of the ModifyVpcAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVpcAttributeResult modifyVpcAttribute(ModifyVpcAttributeRequest modifyVpcAttributeRequest);

    /**
     * <p>
     * Modifies attributes of a specified VPC endpoint. You can modify the policy associated with the endpoint, and you
     * can add and remove route tables associated with the endpoint.
     * </p>
     * 
     * @param modifyVpcEndpointRequest
     *        Contains the parameters for ModifyVpcEndpoint.
     * @return Result of the ModifyVpcEndpoint operation returned by the service.
     * @sample AmazonEC2.ModifyVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVpcEndpointResult modifyVpcEndpoint(ModifyVpcEndpointRequest modifyVpcEndpointRequest);

    /**
     * <p>
     * Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your
     * VPC (using ClassicLink) and instances in the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic
     * instance that's linked to the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable/disable a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances in
     * the peer VPC.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the peered VPCs are in different accounts, each owner must initiate a separate request to modify the peering
     * connection options, depending on whether their VPC was the requester or accepter for the VPC peering connection.
     * If the peered VPCs are in the same account, you can modify the requester and accepter options in the same
     * request. To confirm which VPC is the accepter and requester for a VPC peering connection, use the
     * <a>DescribeVpcPeeringConnections</a> command.
     * </p>
     * 
     * @param modifyVpcPeeringConnectionOptionsRequest
     * @return Result of the ModifyVpcPeeringConnectionOptions operation returned by the service.
     * @sample AmazonEC2.ModifyVpcPeeringConnectionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcPeeringConnectionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyVpcPeeringConnectionOptionsResult modifyVpcPeeringConnectionOptions(ModifyVpcPeeringConnectionOptionsRequest modifyVpcPeeringConnectionOptionsRequest);

    /**
     * <p>
     * Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information,
     * see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html">Monitoring Your Instances
     * and Volumes</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * To disable detailed monitoring, see .
     * </p>
     * 
     * @param monitorInstancesRequest
     *        Contains the parameters for MonitorInstances.
     * @return Result of the MonitorInstances operation returned by the service.
     * @sample AmazonEC2.MonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest);

    /**
     * <p>
     * Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be
     * allocated to your account for more than 24 hours, and it must not be associated with an instance. After the
     * Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it
     * back using the <a>RestoreAddressToClassic</a> request. You cannot move an Elastic IP address that was originally
     * allocated for use in the EC2-VPC platform to the EC2-Classic platform.
     * </p>
     * 
     * @param moveAddressToVpcRequest
     *        Contains the parameters for MoveAddressToVpc.
     * @return Result of the MoveAddressToVpc operation returned by the service.
     * @sample AmazonEC2.MoveAddressToVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MoveAddressToVpc" target="_top">AWS API
     *      Documentation</a>
     */
    MoveAddressToVpcResult moveAddressToVpc(MoveAddressToVpcRequest moveAddressToVpcRequest);

    /**
     * <p>
     * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active
     * Dedicated Hosts in your account before you purchase a reservation. This action results in the specified
     * reservation being purchased and charged to your account.
     * </p>
     * 
     * @param purchaseHostReservationRequest
     * @return Result of the PurchaseHostReservation operation returned by the service.
     * @sample AmazonEC2.PurchaseHostReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseHostReservation" target="_top">AWS
     *      API Documentation</a>
     */
    PurchaseHostReservationResult purchaseHostReservation(PurchaseHostReservationRequest purchaseHostReservationRequest);

    /**
     * <p>
     * Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate
     * compared to On-Demand instance pricing.
     * </p>
     * <p>
     * Use <a>DescribeReservedInstancesOfferings</a> to get a list of Reserved Instance offerings that match your
     * specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with
     * <a>DescribeReservedInstances</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html">Reserved
     * Instances</a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved
     * Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param purchaseReservedInstancesOfferingRequest
     *        Contains the parameters for PurchaseReservedInstancesOffering.
     * @return Result of the PurchaseReservedInstancesOffering operation returned by the service.
     * @sample AmazonEC2.PurchaseReservedInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseReservedInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    PurchaseReservedInstancesOfferingResult purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest);

    /**
     * <p>
     * Purchases one or more Scheduled Instances with the specified schedule.
     * </p>
     * <p>
     * Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before
     * you can purchase a Scheduled Instance, you must call <a>DescribeScheduledInstanceAvailability</a> to check for
     * available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call
     * <a>RunScheduledInstances</a> during each scheduled time period.
     * </p>
     * <p>
     * After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.
     * </p>
     * 
     * @param purchaseScheduledInstancesRequest
     *        Contains the parameters for PurchaseScheduledInstances.
     * @return Result of the PurchaseScheduledInstances operation returned by the service.
     * @sample AmazonEC2.PurchaseScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    PurchaseScheduledInstancesResult purchaseScheduledInstances(PurchaseScheduledInstancesRequest purchaseScheduledInstancesRequest);

    /**
     * <p>
     * Requests a reboot of one or more instances. This operation is asynchronous; it only queues a request to reboot
     * the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot
     * terminated instances are ignored.
     * </p>
     * <p>
     * If an instance does not cleanly shut down within four minutes, Amazon EC2 performs a hard reboot.
     * </p>
     * <p>
     * For more information about troubleshooting, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html">Getting Console Output and
     * Rebooting Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param rebootInstancesRequest
     *        Contains the parameters for RebootInstances.
     * @return Result of the RebootInstances operation returned by the service.
     * @sample AmazonEC2.RebootInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RebootInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RebootInstancesResult rebootInstances(RebootInstancesRequest rebootInstancesRequest);

    /**
     * <p>
     * Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an
     * instance from the AMI. For more information about creating AMIs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html">Creating Your Own AMIs</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <note>
     * <p>
     * For Amazon EBS-backed instances, <a>CreateImage</a> creates and registers the AMI in a single request, so you
     * don't have to register the AMI yourself.
     * </p>
     * </note>
     * <p>
     * You can also use <code>RegisterImage</code> to create an Amazon EBS-backed Linux AMI from a snapshot of a root
     * device volume. You specify the snapshot using the block device mapping. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-launch-snapshot.html">Launching a Linux
     * Instance from a Backup</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can't register an image where a secondary (non-root) snapshot has AWS Marketplace product codes.
     * </p>
     * <p>
     * Some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use
     * the EC2 billing product code associated with an AMI to verify the subscription status for package updates.
     * Creating an AMI from an EBS snapshot does not maintain this billing code, and subsequent instances launched from
     * such an AMI will not be able to connect to package update infrastructure. To create an AMI that must retain
     * billing codes, see <a>CreateImage</a>.
     * </p>
     * <p>
     * If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance
     * store volume invalidates its registration. If you make changes to an image, deregister the previous image and
     * register the new image.
     * </p>
     * 
     * @param registerImageRequest
     *        Contains the parameters for RegisterImage.
     * @return Result of the RegisterImage operation returned by the service.
     * @sample AmazonEC2.RegisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RegisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterImageResult registerImage(RegisterImageRequest registerImageRequest);

    /**
     * <p>
     * Rejects a VPC peering connection request. The VPC peering connection must be in the
     * <code>pending-acceptance</code> state. Use the <a>DescribeVpcPeeringConnections</a> request to view your
     * outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC
     * peering connection request that you initiated, use <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * 
     * @param rejectVpcPeeringConnectionRequest
     *        Contains the parameters for RejectVpcPeeringConnection.
     * @return Result of the RejectVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.RejectVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest);

    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP address pool and might be unavailable to you. Be
     * sure to update your DNS records and any servers or devices that communicate with the address. If you attempt to
     * release an Elastic IP address that you already released, you'll get an <code>AuthFailure</code> error if the
     * address is already allocated to another AWS account.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that
     * it's associated with. To disassociate an Elastic IP address without releasing it, use <a>DisassociateAddress</a>.
     * </p>
     * <p>
     * [Nondefault VPC] You must use <a>DisassociateAddress</a> to disassociate the Elastic IP address before you try to
     * release it. Otherwise, Amazon EC2 returns an error (<code>InvalidIPAddress.InUse</code>).
     * </p>
     * 
     * @param releaseAddressRequest
     *        Contains the parameters for ReleaseAddress.
     * @return Result of the ReleaseAddress operation returned by the service.
     * @sample AmazonEC2.ReleaseAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseAddress" target="_top">AWS API
     *      Documentation</a>
     */
    ReleaseAddressResult releaseAddress(ReleaseAddressRequest releaseAddressRequest);

    /**
     * <p>
     * When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and
     * the host goes into <code>released</code> state. The host ID of Dedicated Hosts that have been released can no
     * longer be specified in another request, e.g., ModifyHosts. You must stop or terminate all instances on a host
     * before it can be released.
     * </p>
     * <p>
     * When Dedicated Hosts are released, it make take some time for them to stop counting toward your limit and you may
     * receive capacity errors when trying to allocate new Dedicated hosts. Try waiting a few minutes, and then try
     * again.
     * </p>
     * <p>
     * Released hosts will still appear in a <a>DescribeHosts</a> response.
     * </p>
     * 
     * @param releaseHostsRequest
     *        Contains the parameters for ReleaseHosts.
     * @return Result of the ReleaseHosts operation returned by the service.
     * @sample AmazonEC2.ReleaseHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseHosts" target="_top">AWS API
     *      Documentation</a>
     */
    ReleaseHostsResult releaseHosts(ReleaseHostsRequest releaseHostsRequest);

    /**
     * <p>
     * Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM
     * instance profile that's associated with an instance without having to disassociate the existing IAM instance
     * profile first.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association ID.
     * </p>
     * 
     * @param replaceIamInstanceProfileAssociationRequest
     * @return Result of the ReplaceIamInstanceProfileAssociation operation returned by the service.
     * @sample AmazonEC2.ReplaceIamInstanceProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceIamInstanceProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    ReplaceIamInstanceProfileAssociationResult replaceIamInstanceProfileAssociation(
            ReplaceIamInstanceProfileAssociationRequest replaceIamInstanceProfileAssociationRequest);

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically
     * associated with the default network ACL. For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceNetworkAclAssociationRequest
     *        Contains the parameters for ReplaceNetworkAclAssociation.
     * @return Result of the ReplaceNetworkAclAssociation operation returned by the service.
     * @sample AmazonEC2.ReplaceNetworkAclAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    ReplaceNetworkAclAssociationResult replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest);

    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceNetworkAclEntryRequest
     *        Contains the parameters for ReplaceNetworkAclEntry.
     * @return Result of the ReplaceNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2.ReplaceNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    ReplaceNetworkAclEntryResult replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest);

    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. You must provide only one of the following: Internet
     * gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, or
     * egress-only Internet gateway.
     * </p>
     * <p>
     * For more information about route tables, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">Route Tables</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceRouteRequest
     *        Contains the parameters for ReplaceRoute.
     * @return Result of the ReplaceRoute operation returned by the service.
     * @sample AmazonEC2.ReplaceRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRoute" target="_top">AWS API
     *      Documentation</a>
     */
    ReplaceRouteResult replaceRoute(ReplaceRouteRequest replaceRouteRequest);

    /**
     * <p>
     * Changes the route table associated with a given subnet in a VPC. After the operation completes, the subnet uses
     * the routes in the new route table it's associated with. For more information about route tables, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">Route Tables</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * You can also use ReplaceRouteTableAssociation to change which table is the main route table in the VPC. You just
     * specify the main route table's association ID and the route table to be the new main route table.
     * </p>
     * 
     * @param replaceRouteTableAssociationRequest
     *        Contains the parameters for ReplaceRouteTableAssociation.
     * @return Result of the ReplaceRouteTableAssociation operation returned by the service.
     * @sample AmazonEC2.ReplaceRouteTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRouteTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    ReplaceRouteTableAssociationResult replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest);

    /**
     * <p>
     * Submits feedback about the status of an instance. The instance must be in the <code>running</code> state. If your
     * experience with the instance differs from the instance status returned by <a>DescribeInstanceStatus</a>, use
     * <a>ReportInstanceStatus</a> to report your experience with the instance. Amazon EC2 collects this information to
     * improve the accuracy of status checks.
     * </p>
     * <p>
     * Use of this action does not change the value returned by <a>DescribeInstanceStatus</a>.
     * </p>
     * 
     * @param reportInstanceStatusRequest
     *        Contains the parameters for ReportInstanceStatus.
     * @return Result of the ReportInstanceStatus operation returned by the service.
     * @sample AmazonEC2.ReportInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReportInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    ReportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest);

    /**
     * <p>
     * Creates a Spot fleet request.
     * </p>
     * <p>
     * You can submit a single request that includes multiple launch specifications that vary by instance type, AMI,
     * Availability Zone, or subnet.
     * </p>
     * <p>
     * By default, the Spot fleet requests Spot instances in the Spot pool where the price per unit is the lowest. Each
     * launch specification can include its own instance weighting that reflects the value of the instance type to your
     * application workload.
     * </p>
     * <p>
     * Alternatively, you can specify that the Spot fleet distribute the target capacity across the Spot pools included
     * in its launch specifications. By ensuring that the Spot instances in your Spot fleet are in different Spot pools,
     * you can improve the availability of your fleet.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html">Spot Fleet Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param requestSpotFleetRequest
     *        Contains the parameters for RequestSpotFleet.
     * @return Result of the RequestSpotFleet operation returned by the service.
     * @sample AmazonEC2.RequestSpotFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotFleet" target="_top">AWS API
     *      Documentation</a>
     */
    RequestSpotFleetResult requestSpotFleet(RequestSpotFleetRequest requestSpotFleetRequest);

    /**
     * <p>
     * Creates a Spot instance request. Spot instances are instances that Amazon EC2 launches when the bid price that
     * you specify exceeds the current Spot price. Amazon EC2 periodically sets the Spot price based on available Spot
     * Instance capacity and current Spot instance requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param requestSpotInstancesRequest
     *        Contains the parameters for RequestSpotInstances.
     * @return Result of the RequestSpotInstances operation returned by the service.
     * @sample AmazonEC2.RequestSpotInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest requestSpotInstancesRequest);

    /**
     * <p>
     * Resets an attribute of an AMI to its default value.
     * </p>
     * <note>
     * <p>
     * The productCodes attribute can't be reset.
     * </p>
     * </note>
     * 
     * @param resetImageAttributeRequest
     *        Contains the parameters for ResetImageAttribute.
     * @return Result of the ResetImageAttribute operation returned by the service.
     * @sample AmazonEC2.ResetImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ResetImageAttributeResult resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest);

    /**
     * <p>
     * Resets an attribute of an instance to its default value. To reset the <code>kernel</code> or <code>ramdisk</code>
     * , the instance must be in a stopped state. To reset the <code>sourceDestCheck</code>, the instance can be either
     * running or stopped.
     * </p>
     * <p>
     * The <code>sourceDestCheck</code> attribute controls whether source/destination checking is enabled. The default
     * value is <code>true</code>, which means checking is enabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param resetInstanceAttributeRequest
     *        Contains the parameters for ResetInstanceAttribute.
     * @return Result of the ResetInstanceAttribute operation returned by the service.
     * @sample AmazonEC2.ResetInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetInstanceAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ResetInstanceAttributeResult resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest);

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param resetNetworkInterfaceAttributeRequest
     *        Contains the parameters for ResetNetworkInterfaceAttribute.
     * @return Result of the ResetNetworkInterfaceAttribute operation returned by the service.
     * @sample AmazonEC2.ResetNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    ResetNetworkInterfaceAttributeResult resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information on modifying snapshot permissions, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html">Sharing
     * Snapshots</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param resetSnapshotAttributeRequest
     *        Contains the parameters for ResetSnapshotAttribute.
     * @return Result of the ResetSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2.ResetSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetSnapshotAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ResetSnapshotAttributeResult resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest);

    /**
     * <p>
     * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic
     * platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP
     * address must not be associated with an instance or network interface.
     * </p>
     * 
     * @param restoreAddressToClassicRequest
     *        Contains the parameters for RestoreAddressToClassic.
     * @return Result of the RestoreAddressToClassic operation returned by the service.
     * @sample AmazonEC2.RestoreAddressToClassic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RestoreAddressToClassic" target="_top">AWS
     *      API Documentation</a>
     */
    RestoreAddressToClassicResult restoreAddressToClassic(RestoreAddressToClassicRequest restoreAddressToClassicRequest);

    /**
     * <p>
     * [EC2-VPC only] Removes one or more egress rules from a security group for EC2-VPC. This action doesn't apply to
     * security groups for use in EC2-Classic. The values that you specify in the revoke request (for example, ports)
     * must match the existing rule's values for the rule to be revoked.
     * </p>
     * <p>
     * Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP
     * protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also
     * specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupEgressRequest
     *        Contains the parameters for RevokeSecurityGroupEgress.
     * @return Result of the RevokeSecurityGroupEgress operation returned by the service.
     * @sample AmazonEC2.RevokeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupEgress" target="_top">AWS
     *      API Documentation</a>
     */
    RevokeSecurityGroupEgressResult revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest);

    /**
     * <p>
     * Removes one or more ingress rules from a security group. The values that you specify in the revoke request (for
     * example, ports) must match the existing rule's values for the rule to be removed.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols,
     * you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the
     * ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupIngressRequest
     *        Contains the parameters for RevokeSecurityGroupIngress.
     * @return Result of the RevokeSecurityGroupIngress operation returned by the service.
     * @sample AmazonEC2.RevokeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupIngress" target="_top">AWS
     *      API Documentation</a>
     */
    RevokeSecurityGroupIngressResult revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest);

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation.
     *
     * @see #revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest)
     */
    @Deprecated
    RevokeSecurityGroupIngressResult revokeSecurityGroupIngress();

    /**
     * <p>
     * Launches the specified number of instances using an AMI for which you have permissions.
     * </p>
     * <p>
     * You can specify a number of options, or leave the default options. The following rules apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you
     * don't have a default VPC, you must specify a subnet ID in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * [EC2-Classic] If don't specify an Availability Zone, we choose one for you.
     * </p>
     * </li>
     * <li>
     * <p>
     * Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a
     * subnet ID, the request fails. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-vpc.html#vpc-only-instance-types">Instance Types
     * Available Only in a VPC</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this
     * address, we choose one from the IPv4 range of your subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not all instance types support IPv6 addresses. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify a security group ID, we use the default security group. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Security Groups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To ensure faster instance launches, break up large requests into smaller batches. For example, create 5 separate
     * launch requests for 100 instances each instead of 1 launch request for 500 instances.
     * </p>
     * <p>
     * An instance is ready for you to use when it's in the <code>running</code> state. You can check the state of your
     * instance using <a>DescribeInstances</a>. You can tag instances and EBS volumes during launch, after launch, or
     * both. For more information, see <a>CreateTags</a> and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>.
     * </p>
     * <p>
     * Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure
     * access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key
     * Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For troubleshooting, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_InstanceStraightToTerminated.html">What To Do If
     * An Instance Immediately Terminates</a>, and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesConnecting.html">Troubleshooting
     * Connecting to Your Instance</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param runInstancesRequest
     *        Contains the parameters for RunInstances.
     * @return Result of the RunInstances operation returned by the service.
     * @sample AmazonEC2.RunInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest);

    /**
     * <p>
     * Launches the specified Scheduled Instances.
     * </p>
     * <p>
     * Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using
     * <a>PurchaseScheduledInstances</a>.
     * </p>
     * <p>
     * You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled
     * Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled
     * time period ends, you can launch it again after a few minutes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-scheduled-instances.html">Scheduled Instances</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param runScheduledInstancesRequest
     *        Contains the parameters for RunScheduledInstances.
     * @return Result of the RunScheduledInstances operation returned by the service.
     * @sample AmazonEC2.RunScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunScheduledInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RunScheduledInstancesResult runScheduledInstances(RunScheduledInstancesRequest runScheduledInstancesRequest);

    /**
     * <p>
     * Starts an Amazon EBS-backed AMI that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance
     * is stopped, the compute resources are released and you are not billed for hourly instance usage. However, your
     * root partition Amazon EBS volume remains, continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time. Each time you transition an instance from stopped to
     * started, Amazon EC2 charges a full instance hour, even if transitions happen multiple times within a single hour.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does
     * not preserve data stored in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store as its root device returns an error.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html">Stopping
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param startInstancesRequest
     *        Contains the parameters for StartInstances.
     * @return Result of the StartInstances operation returned by the service.
     * @sample AmazonEC2.StartInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StartInstances" target="_top">AWS API
     *      Documentation</a>
     */
    StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest);

    /**
     * <p>
     * Stops an Amazon EBS-backed instance.
     * </p>
     * <p>
     * We don't charge hourly usage for a stopped instance, or data transfer fees; however, your root partition Amazon
     * EBS volume remains, continues to persist your data, and you are charged for Amazon EBS volume usage. Each time
     * you transition an instance from stopped to started, Amazon EC2 charges a full instance hour, even if transitions
     * happen multiple times within a single hour.
     * </p>
     * <p>
     * You can't start or stop Spot instances, and you can't stop instance store-backed instances.
     * </p>
     * <p>
     * When you stop an instance, we shut it down. You can restart your instance at any time. Before stopping an
     * instance, make sure it is in a state from which it can be restarted. Stopping an instance does not preserve data
     * stored in RAM.
     * </p>
     * <p>
     * Stopping an instance is different to rebooting or terminating it. For example, when you stop an instance, the
     * root device and any other devices attached to the instance persist. When you terminate an instance, the root
     * device and any other devices attached during the instance launch are automatically deleted. For more information
     * about the differences between rebooting, stopping, and terminating instances, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html">Instance Lifecycle</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears
     * stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesStopping.html">Troubleshooting
     * Stopping Your Instance</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param stopInstancesRequest
     *        Contains the parameters for StopInstances.
     * @return Result of the StopInstances operation returned by the service.
     * @sample AmazonEC2.StopInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StopInstances" target="_top">AWS API
     *      Documentation</a>
     */
    StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest);

    /**
     * <p>
     * Shuts down one or more instances. This operation is idempotent; if you terminate an instance more than once, each
     * call succeeds.
     * </p>
     * <p>
     * If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID),
     * none of the instances are terminated.
     * </p>
     * <p>
     * Terminated instances remain visible after termination (for approximately one hour).
     * </p>
     * <p>
     * By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached
     * after instance launch continue running.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances.
     * What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the
     * root device and any other devices attached to the instance persist. When you terminate an instance, any attached
     * EBS volumes with the <code>DeleteOnTermination</code> block device mapping parameter set to <code>true</code> are
     * automatically deleted. For more information about the differences between stopping and terminating instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html">Instance Lifecycle</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information about troubleshooting, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesShuttingDown.html"
     * >Troubleshooting Terminating Your Instance</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param terminateInstancesRequest
     *        Contains the parameters for TerminateInstances.
     * @return Result of the TerminateInstances operation returned by the service.
     * @sample AmazonEC2.TerminateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TerminateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest);

    /**
     * <p>
     * Unassigns one or more IPv6 addresses from a network interface.
     * </p>
     * 
     * @param unassignIpv6AddressesRequest
     * @return Result of the UnassignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2.UnassignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    UnassignIpv6AddressesResult unassignIpv6Addresses(UnassignIpv6AddressesRequest unassignIpv6AddressesRequest);

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network interface.
     * </p>
     * 
     * @param unassignPrivateIpAddressesRequest
     *        Contains the parameters for UnassignPrivateIpAddresses.
     * @return Result of the UnassignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2.UnassignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    UnassignPrivateIpAddressesResult unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest);

    /**
     * <p>
     * Disables detailed monitoring for a running instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html">Monitoring Your Instances and
     * Volumes</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param unmonitorInstancesRequest
     *        Contains the parameters for UnmonitorInstances.
     * @return Result of the UnmonitorInstances operation returned by the service.
     * @sample AmazonEC2.UnmonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnmonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest);

    /**
     * Checks whether you have the required permissions for the provided Amazon EC2 operation, without actually running
     * it. The returned DryRunResult object contains the information of whether the dry-run was successful. This method
     * will throw exception when the service response does not clearly indicate whether you have the permission.
     *
     * @param request
     *        The request object for any Amazon EC2 operation supported with dry-run.
     *
     * @return A DryRunResult object that contains the information of whether the dry-run was successful.
     *
     * @throws AmazonClientException
     *         If any internal errors are encountered inside the client while attempting to make the request or handle
     *         the response. Or if the service response does not clearly indicate whether you have the permission.
     * @throws AmazonServiceException
     *         If an error response is returned by Amazon EC2 indicating either a problem with the data in the request,
     *         or a server side issue.
     */
    <X extends AmazonWebServiceRequest> DryRunResult<X> dryRun(DryRunSupportedRequest<X> request) throws AmazonServiceException, AmazonClientException;

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonEC2Waiters waiters();

}
