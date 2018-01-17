/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.ec2.model.*;

/**
 * Interface for accessing Amazon EC2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ec2.AbstractAmazonEC2Async} instead.
 * </p>
 * <p>
 * <fullname>Amazon Elastic Compute Cloud</fullname>
 * <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides resizable computing capacity in the AWS Cloud. Using Amazon EC2
 * eliminates your need to invest in hardware up front, so you can develop and deploy applications faster.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEC2Async extends AmazonEC2 {

    /**
     * <p>
     * Accepts the Convertible Reserved Instance exchange quote described in the
     * <a>GetReservedInstancesExchangeQuote</a> call.
     * </p>
     * 
     * @param acceptReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for accepting the quote.
     * @return A Java Future containing the result of the AcceptReservedInstancesExchangeQuote operation returned by the
     *         service.
     * @sample AmazonEC2Async.AcceptReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptReservedInstancesExchangeQuoteResult> acceptReservedInstancesExchangeQuoteAsync(
            AcceptReservedInstancesExchangeQuoteRequest acceptReservedInstancesExchangeQuoteRequest);

    /**
     * <p>
     * Accepts the Convertible Reserved Instance exchange quote described in the
     * <a>GetReservedInstancesExchangeQuote</a> call.
     * </p>
     * 
     * @param acceptReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for accepting the quote.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptReservedInstancesExchangeQuote operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.AcceptReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptReservedInstancesExchangeQuoteResult> acceptReservedInstancesExchangeQuoteAsync(
            AcceptReservedInstancesExchangeQuoteRequest acceptReservedInstancesExchangeQuoteRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptReservedInstancesExchangeQuoteRequest, AcceptReservedInstancesExchangeQuoteResult> asyncHandler);

    /**
     * <p>
     * Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.
     * </p>
     * 
     * @param acceptVpcEndpointConnectionsRequest
     * @return A Java Future containing the result of the AcceptVpcEndpointConnections operation returned by the
     *         service.
     * @sample AmazonEC2Async.AcceptVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptVpcEndpointConnectionsResult> acceptVpcEndpointConnectionsAsync(
            AcceptVpcEndpointConnectionsRequest acceptVpcEndpointConnectionsRequest);

    /**
     * <p>
     * Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.
     * </p>
     * 
     * @param acceptVpcEndpointConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptVpcEndpointConnections operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.AcceptVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptVpcEndpointConnectionsResult> acceptVpcEndpointConnectionsAsync(
            AcceptVpcEndpointConnectionsRequest acceptVpcEndpointConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptVpcEndpointConnectionsRequest, AcceptVpcEndpointConnectionsResult> asyncHandler);

    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the
     * <code>pending-acceptance</code> state, and you must be the owner of the peer VPC. Use
     * <a>DescribeVpcPeeringConnections</a> to view your outstanding VPC peering connection requests.
     * </p>
     * <p>
     * For an inter-region VPC peering connection request, you must accept the VPC peering connection in the region of
     * the accepter VPC.
     * </p>
     * 
     * @param acceptVpcPeeringConnectionRequest
     *        Contains the parameters for AcceptVpcPeeringConnection.
     * @return A Java Future containing the result of the AcceptVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2Async.AcceptVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(
            AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest);

    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the
     * <code>pending-acceptance</code> state, and you must be the owner of the peer VPC. Use
     * <a>DescribeVpcPeeringConnections</a> to view your outstanding VPC peering connection requests.
     * </p>
     * <p>
     * For an inter-region VPC peering connection request, you must accept the VPC peering connection in the region of
     * the accepter VPC.
     * </p>
     * 
     * @param acceptVpcPeeringConnectionRequest
     *        Contains the parameters for AcceptVpcPeeringConnection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AcceptVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(
            AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler);

    /**
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation.
     *
     * @see #acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest)
     */
    java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync();

    /**
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation with an AsyncHandler.
     *
     * @see #acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(
            com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler);

    /**
     * <p>
     * Allocates an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5
     * Elastic IP addresses for EC2-Classic per region and 5 Elastic IP addresses for EC2-VPC per region.
     * </p>
     * <p>
     * If you release an Elastic IP address for use in a VPC, you might be able to recover it. To recover an Elastic IP
     * address that you released, specify it in the <code>Address</code> parameter. Note that you cannot recover an
     * Elastic IP address that you released after it is allocated to another AWS account.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param allocateAddressRequest
     *        Contains the parameters for AllocateAddress.
     * @return A Java Future containing the result of the AllocateAddress operation returned by the service.
     * @sample AmazonEC2Async.AllocateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest allocateAddressRequest);

    /**
     * <p>
     * Allocates an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5
     * Elastic IP addresses for EC2-Classic per region and 5 Elastic IP addresses for EC2-VPC per region.
     * </p>
     * <p>
     * If you release an Elastic IP address for use in a VPC, you might be able to recover it. To recover an Elastic IP
     * address that you released, specify it in the <code>Address</code> parameter. Note that you cannot recover an
     * Elastic IP address that you released after it is allocated to another AWS account.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param allocateAddressRequest
     *        Contains the parameters for AllocateAddress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocateAddress operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AllocateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest allocateAddressRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler);

    /**
     * Simplified method form for invoking the AllocateAddress operation.
     *
     * @see #allocateAddressAsync(AllocateAddressRequest)
     */
    java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync();

    /**
     * Simplified method form for invoking the AllocateAddress operation with an AsyncHandler.
     *
     * @see #allocateAddressAsync(AllocateAddressRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(
            com.amazonaws.handlers.AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler);

    /**
     * <p>
     * Allocates a Dedicated Host to your account. At minimum you need to specify the instance size type, Availability
     * Zone, and quantity of hosts you want to allocate.
     * </p>
     * 
     * @param allocateHostsRequest
     *        Contains the parameters for AllocateHosts.
     * @return A Java Future containing the result of the AllocateHosts operation returned by the service.
     * @sample AmazonEC2Async.AllocateHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateHostsResult> allocateHostsAsync(AllocateHostsRequest allocateHostsRequest);

    /**
     * <p>
     * Allocates a Dedicated Host to your account. At minimum you need to specify the instance size type, Availability
     * Zone, and quantity of hosts you want to allocate.
     * </p>
     * 
     * @param allocateHostsRequest
     *        Contains the parameters for AllocateHosts.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocateHosts operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AllocateHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateHostsResult> allocateHostsAsync(AllocateHostsRequest allocateHostsRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateHostsRequest, AllocateHostsResult> asyncHandler);

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
     * @return A Java Future containing the result of the AssignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2Async.AssignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssignIpv6AddressesResult> assignIpv6AddressesAsync(AssignIpv6AddressesRequest assignIpv6AddressesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssignIpv6AddressesResult> assignIpv6AddressesAsync(AssignIpv6AddressesRequest assignIpv6AddressesRequest,
            com.amazonaws.handlers.AsyncHandler<AssignIpv6AddressesRequest, AssignIpv6AddressesResult> asyncHandler);

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
     * @return A Java Future containing the result of the AssignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2Async.AssignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<AssignPrivateIpAddressesRequest, AssignPrivateIpAddressesResult> asyncHandler);

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
     * instance, it is disassociated from that instance and associated with the specified instance. If you associate an
     * Elastic IP address with an instance that has an existing Elastic IP address, the existing address is
     * disassociated from the instance, but remains allocated to your account.
     * </p>
     * <p>
     * [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated
     * with the primary IP address. If the Elastic IP address is already associated with a different instance or a
     * network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address
     * with an instance or network interface that has an existing Elastic IP address.
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
     * @return A Java Future containing the result of the AssociateAddress operation returned by the service.
     * @sample AmazonEC2Async.AssociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest associateAddressRequest);

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
     * instance, it is disassociated from that instance and associated with the specified instance. If you associate an
     * Elastic IP address with an instance that has an existing Elastic IP address, the existing address is
     * disassociated from the instance, but remains allocated to your account.
     * </p>
     * <p>
     * [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated
     * with the primary IP address. If the Elastic IP address is already associated with a different instance or a
     * network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address
     * with an instance or network interface that has an existing Elastic IP address.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAddress operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest associateAddressRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAddressRequest, AssociateAddressResult> asyncHandler);

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
     * @return A Java Future containing the result of the AssociateDhcpOptions operation returned by the service.
     * @sample AmazonEC2Async.AssociateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest associateDhcpOptionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDhcpOptions operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssociateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest associateDhcpOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDhcpOptionsRequest, AssociateDhcpOptionsResult> asyncHandler);

    /**
     * <p>
     * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM
     * instance profile with an instance.
     * </p>
     * 
     * @param associateIamInstanceProfileRequest
     * @return A Java Future containing the result of the AssociateIamInstanceProfile operation returned by the service.
     * @sample AmazonEC2Async.AssociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateIamInstanceProfileResult> associateIamInstanceProfileAsync(
            AssociateIamInstanceProfileRequest associateIamInstanceProfileRequest);

    /**
     * <p>
     * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM
     * instance profile with an instance.
     * </p>
     * 
     * @param associateIamInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateIamInstanceProfile operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateIamInstanceProfileResult> associateIamInstanceProfileAsync(
            AssociateIamInstanceProfileRequest associateIamInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateIamInstanceProfileRequest, AssociateIamInstanceProfileResult> asyncHandler);

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
     * @return A Java Future containing the result of the AssociateRouteTable operation returned by the service.
     * @sample AmazonEC2Async.AssociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest associateRouteTableRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateRouteTable operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest associateRouteTableRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateRouteTableRequest, AssociateRouteTableResult> asyncHandler);

    /**
     * <p>
     * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An
     * IPv6 CIDR block must have a prefix length of /64.
     * </p>
     * 
     * @param associateSubnetCidrBlockRequest
     * @return A Java Future containing the result of the AssociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2Async.AssociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateSubnetCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSubnetCidrBlockResult> associateSubnetCidrBlockAsync(AssociateSubnetCidrBlockRequest associateSubnetCidrBlockRequest);

    /**
     * <p>
     * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An
     * IPv6 CIDR block must have a prefix length of /64.
     * </p>
     * 
     * @param associateSubnetCidrBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateSubnetCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSubnetCidrBlockResult> associateSubnetCidrBlockAsync(AssociateSubnetCidrBlockRequest associateSubnetCidrBlockRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSubnetCidrBlockRequest, AssociateSubnetCidrBlockResult> asyncHandler);

    /**
     * <p>
     * Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an
     * Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56.
     * </p>
     * <p>
     * For more information about associating CIDR blocks with your VPC and applicable restrictions, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html#VPC_Sizing">VPC and Subnet
     * Sizing</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateVpcCidrBlockRequest
     * @return A Java Future containing the result of the AssociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2Async.AssociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateVpcCidrBlock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateVpcCidrBlockResult> associateVpcCidrBlockAsync(AssociateVpcCidrBlockRequest associateVpcCidrBlockRequest);

    /**
     * <p>
     * Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an
     * Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56.
     * </p>
     * <p>
     * For more information about associating CIDR blocks with your VPC and applicable restrictions, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html#VPC_Sizing">VPC and Subnet
     * Sizing</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateVpcCidrBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AssociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateVpcCidrBlock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateVpcCidrBlockResult> associateVpcCidrBlockAsync(AssociateVpcCidrBlockRequest associateVpcCidrBlockRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateVpcCidrBlockRequest, AssociateVpcCidrBlockResult> asyncHandler);

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
     * @return A Java Future containing the result of the AttachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2Async.AttachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(AttachClassicLinkVpcRequest attachClassicLinkVpcRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AttachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(AttachClassicLinkVpcRequest attachClassicLinkVpcRequest,
            com.amazonaws.handlers.AsyncHandler<AttachClassicLinkVpcRequest, AttachClassicLinkVpcResult> asyncHandler);

    /**
     * <p>
     * Attaches an Internet gateway to a VPC, enabling connectivity between the Internet and the VPC. For more
     * information about your VPC and Internet gateway, see the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/">Amazon Virtual Private Cloud User Guide</a>.
     * </p>
     * 
     * @param attachInternetGatewayRequest
     *        Contains the parameters for AttachInternetGateway.
     * @return A Java Future containing the result of the AttachInternetGateway operation returned by the service.
     * @sample AmazonEC2Async.AttachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(AttachInternetGatewayRequest attachInternetGatewayRequest);

    /**
     * <p>
     * Attaches an Internet gateway to a VPC, enabling connectivity between the Internet and the VPC. For more
     * information about your VPC and Internet gateway, see the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/">Amazon Virtual Private Cloud User Guide</a>.
     * </p>
     * 
     * @param attachInternetGatewayRequest
     *        Contains the parameters for AttachInternetGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachInternetGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AttachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(AttachInternetGatewayRequest attachInternetGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<AttachInternetGatewayRequest, AttachInternetGatewayResult> asyncHandler);

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     * 
     * @param attachNetworkInterfaceRequest
     *        Contains the parameters for AttachNetworkInterface.
     * @return A Java Future containing the result of the AttachNetworkInterface operation returned by the service.
     * @sample AmazonEC2Async.AttachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest);

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     * 
     * @param attachNetworkInterfaceRequest
     *        Contains the parameters for AttachNetworkInterface.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachNetworkInterface operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AttachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<AttachNetworkInterfaceRequest, AttachNetworkInterfaceResult> asyncHandler);

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
     * @return A Java Future containing the result of the AttachVolume operation returned by the service.
     * @sample AmazonEC2Async.AttachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest attachVolumeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachVolume operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AttachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest attachVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<AttachVolumeRequest, AttachVolumeResult> asyncHandler);

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS
     * Managed VPN Connections</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param attachVpnGatewayRequest
     *        Contains the parameters for AttachVpnGateway.
     * @return A Java Future containing the result of the AttachVpnGateway operation returned by the service.
     * @sample AmazonEC2Async.AttachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest attachVpnGatewayRequest);

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS
     * Managed VPN Connections</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param attachVpnGatewayRequest
     *        Contains the parameters for AttachVpnGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachVpnGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.AttachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest attachVpnGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<AttachVpnGatewayRequest, AttachVpnGatewayResult> asyncHandler);

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
     * specify the ICMP type and code. You can use -1 for the type or code to mean all types or all codes. You can
     * optionally specify a description for the rule.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.
     * </p>
     * 
     * @param authorizeSecurityGroupEgressRequest
     *        Contains the parameters for AuthorizeSecurityGroupEgress.
     * @return A Java Future containing the result of the AuthorizeSecurityGroupEgress operation returned by the
     *         service.
     * @sample AmazonEC2Async.AuthorizeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupEgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(
            AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest);

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
     * specify the ICMP type and code. You can use -1 for the type or code to mean all types or all codes. You can
     * optionally specify a description for the rule.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.
     * </p>
     * 
     * @param authorizeSecurityGroupEgressRequest
     *        Contains the parameters for AuthorizeSecurityGroupEgress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeSecurityGroupEgress operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.AuthorizeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupEgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(
            AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupEgressRequest, AuthorizeSecurityGroupEgressResult> asyncHandler);

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
     * <p>
     * You can optionally specify a description for the security group rule.
     * </p>
     * 
     * @param authorizeSecurityGroupIngressRequest
     *        Contains the parameters for AuthorizeSecurityGroupIngress.
     * @return A Java Future containing the result of the AuthorizeSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonEC2Async.AuthorizeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(
            AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest);

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
     * <p>
     * You can optionally specify a description for the security group rule.
     * </p>
     * 
     * @param authorizeSecurityGroupIngressRequest
     *        Contains the parameters for AuthorizeSecurityGroupIngress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.AuthorizeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(
            AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupIngressRequest, AuthorizeSecurityGroupIngressResult> asyncHandler);

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
     * @return A Java Future containing the result of the BundleInstance operation returned by the service.
     * @sample AmazonEC2Async.BundleInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/BundleInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest bundleInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BundleInstance operation returned by the service.
     * @sample AmazonEC2AsyncHandler.BundleInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/BundleInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest bundleInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<BundleInstanceRequest, BundleInstanceResult> asyncHandler);

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows instance.
     * </p>
     * 
     * @param cancelBundleTaskRequest
     *        Contains the parameters for CancelBundleTask.
     * @return A Java Future containing the result of the CancelBundleTask operation returned by the service.
     * @sample AmazonEC2Async.CancelBundleTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelBundleTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest cancelBundleTaskRequest);

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows instance.
     * </p>
     * 
     * @param cancelBundleTaskRequest
     *        Contains the parameters for CancelBundleTask.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelBundleTask operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CancelBundleTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelBundleTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest cancelBundleTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelBundleTaskRequest, CancelBundleTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the CancelConversionTask operation returned by the service.
     * @sample AmazonEC2Async.CancelConversionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelConversionTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(CancelConversionTaskRequest cancelConversionTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelConversionTask operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CancelConversionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelConversionTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(CancelConversionTaskRequest cancelConversionTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelConversionTaskRequest, CancelConversionTaskResult> asyncHandler);

    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of the export, including any partially-created
     * Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the
     * command fails and returns an error.
     * </p>
     * 
     * @param cancelExportTaskRequest
     *        Contains the parameters for CancelExportTask.
     * @return A Java Future containing the result of the CancelExportTask operation returned by the service.
     * @sample AmazonEC2Async.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of the export, including any partially-created
     * Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the
     * command fails and returns an error.
     * </p>
     * 
     * @param cancelExportTaskRequest
     *        Contains the parameters for CancelExportTask.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelExportTask operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler);

    /**
     * <p>
     * Cancels an in-process import virtual machine or import snapshot task.
     * </p>
     * 
     * @param cancelImportTaskRequest
     *        Contains the parameters for CancelImportTask.
     * @return A Java Future containing the result of the CancelImportTask operation returned by the service.
     * @sample AmazonEC2Async.CancelImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(CancelImportTaskRequest cancelImportTaskRequest);

    /**
     * <p>
     * Cancels an in-process import virtual machine or import snapshot task.
     * </p>
     * 
     * @param cancelImportTaskRequest
     *        Contains the parameters for CancelImportTask.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelImportTask operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CancelImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(CancelImportTaskRequest cancelImportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelImportTaskRequest, CancelImportTaskResult> asyncHandler);

    /**
     * Simplified method form for invoking the CancelImportTask operation.
     *
     * @see #cancelImportTaskAsync(CancelImportTaskRequest)
     */
    java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync();

    /**
     * Simplified method form for invoking the CancelImportTask operation with an AsyncHandler.
     *
     * @see #cancelImportTaskAsync(CancelImportTaskRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(
            com.amazonaws.handlers.AsyncHandler<CancelImportTaskRequest, CancelImportTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the CancelReservedInstancesListing operation returned by the
     *         service.
     * @sample AmazonEC2Async.CancelReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(
            CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelReservedInstancesListing operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.CancelReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(
            CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest,
            com.amazonaws.handlers.AsyncHandler<CancelReservedInstancesListingRequest, CancelReservedInstancesListingResult> asyncHandler);

    /**
     * <p>
     * Cancels the specified Spot Fleet requests.
     * </p>
     * <p>
     * After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether
     * the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request
     * enters the <code>cancelled_terminating</code> state. Otherwise, the Spot Fleet request enters the
     * <code>cancelled_running</code> state and the instances continue to run until they are interrupted or you
     * terminate them manually.
     * </p>
     * 
     * @param cancelSpotFleetRequestsRequest
     *        Contains the parameters for CancelSpotFleetRequests.
     * @return A Java Future containing the result of the CancelSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2Async.CancelSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(CancelSpotFleetRequestsRequest cancelSpotFleetRequestsRequest);

    /**
     * <p>
     * Cancels the specified Spot Fleet requests.
     * </p>
     * <p>
     * After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether
     * the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request
     * enters the <code>cancelled_terminating</code> state. Otherwise, the Spot Fleet request enters the
     * <code>cancelled_running</code> state and the instances continue to run until they are interrupted or you
     * terminate them manually.
     * </p>
     * 
     * @param cancelSpotFleetRequestsRequest
     *        Contains the parameters for CancelSpotFleetRequests.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CancelSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(CancelSpotFleetRequestsRequest cancelSpotFleetRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<CancelSpotFleetRequestsRequest, CancelSpotFleetRequestsResult> asyncHandler);

    /**
     * <p>
     * Cancels one or more Spot Instance requests. Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot price. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Canceling a Spot Instance request does not terminate running Spot Instances associated with the request.
     * </p>
     * </important>
     * 
     * @param cancelSpotInstanceRequestsRequest
     *        Contains the parameters for CancelSpotInstanceRequests.
     * @return A Java Future containing the result of the CancelSpotInstanceRequests operation returned by the service.
     * @sample AmazonEC2Async.CancelSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotInstanceRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(
            CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest);

    /**
     * <p>
     * Cancels one or more Spot Instance requests. Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot price. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Canceling a Spot Instance request does not terminate running Spot Instances associated with the request.
     * </p>
     * </important>
     * 
     * @param cancelSpotInstanceRequestsRequest
     *        Contains the parameters for CancelSpotInstanceRequests.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSpotInstanceRequests operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CancelSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotInstanceRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(
            CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<CancelSpotInstanceRequestsRequest, CancelSpotInstanceRequestsResult> asyncHandler);

    /**
     * <p>
     * Determines whether a product code is associated with an instance. This action can only be used by the owner of
     * the product code. It is useful when a product code owner must verify whether another user's instance is eligible
     * for support.
     * </p>
     * 
     * @param confirmProductInstanceRequest
     *        Contains the parameters for ConfirmProductInstance.
     * @return A Java Future containing the result of the ConfirmProductInstance operation returned by the service.
     * @sample AmazonEC2Async.ConfirmProductInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConfirmProductInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest confirmProductInstanceRequest);

    /**
     * <p>
     * Determines whether a product code is associated with an instance. This action can only be used by the owner of
     * the product code. It is useful when a product code owner must verify whether another user's instance is eligible
     * for support.
     * </p>
     * 
     * @param confirmProductInstanceRequest
     *        Contains the parameters for ConfirmProductInstance.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmProductInstance operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ConfirmProductInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConfirmProductInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest confirmProductInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmProductInstanceRequest, ConfirmProductInstanceResult> asyncHandler);

    /**
     * <p>
     * Copies the specified Amazon FPGA Image (AFI) to the current region.
     * </p>
     * 
     * @param copyFpgaImageRequest
     * @return A Java Future containing the result of the CopyFpgaImage operation returned by the service.
     * @sample AmazonEC2Async.CopyFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopyFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyFpgaImageResult> copyFpgaImageAsync(CopyFpgaImageRequest copyFpgaImageRequest);

    /**
     * <p>
     * Copies the specified Amazon FPGA Image (AFI) to the current region.
     * </p>
     * 
     * @param copyFpgaImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyFpgaImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CopyFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopyFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyFpgaImageResult> copyFpgaImageAsync(CopyFpgaImageRequest copyFpgaImageRequest,
            com.amazonaws.handlers.AsyncHandler<CopyFpgaImageRequest, CopyFpgaImageResult> asyncHandler);

    /**
     * <p>
     * Initiates the copy of an AMI from the specified source region to the current region. You specify the destination
     * region by using its endpoint when making the request.
     * </p>
     * <p>
     * For more information about the prerequisites and limits when copying an AMI, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html">Copying an AMI</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param copyImageRequest
     *        Contains the parameters for CopyImage.
     * @return A Java Future containing the result of the CopyImage operation returned by the service.
     * @sample AmazonEC2Async.CopyImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopyImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest copyImageRequest);

    /**
     * <p>
     * Initiates the copy of an AMI from the specified source region to the current region. You specify the destination
     * region by using its endpoint when making the request.
     * </p>
     * <p>
     * For more information about the prerequisites and limits when copying an AMI, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html">Copying an AMI</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param copyImageRequest
     *        Contains the parameters for CopyImage.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CopyImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopyImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest copyImageRequest,
            com.amazonaws.handlers.AsyncHandler<CopyImageRequest, CopyImageResult> asyncHandler);

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
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonEC2Async.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler);

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
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
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
     * @return A Java Future containing the result of the CreateCustomerGateway operation returned by the service.
     * @sample AmazonEC2Async.CreateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest createCustomerGatewayRequest);

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
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomerGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest createCustomerGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomerGatewayRequest, CreateCustomerGatewayResult> asyncHandler);

    /**
     * <p>
     * Creates a default subnet with a size <code>/20</code> IPv4 CIDR block in the specified Availability Zone in your
     * default VPC. You can have only one default subnet per Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html#create-default-subnet">Creating a
     * Default Subnet</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createDefaultSubnetRequest
     * @return A Java Future containing the result of the CreateDefaultSubnet operation returned by the service.
     * @sample AmazonEC2Async.CreateDefaultSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDefaultSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDefaultSubnetResult> createDefaultSubnetAsync(CreateDefaultSubnetRequest createDefaultSubnetRequest);

    /**
     * <p>
     * Creates a default subnet with a size <code>/20</code> IPv4 CIDR block in the specified Availability Zone in your
     * default VPC. You can have only one default subnet per Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html#create-default-subnet">Creating a
     * Default Subnet</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createDefaultSubnetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDefaultSubnet operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateDefaultSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDefaultSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDefaultSubnetResult> createDefaultSubnetAsync(CreateDefaultSubnetRequest createDefaultSubnetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDefaultSubnetRequest, CreateDefaultSubnetResult> asyncHandler);

    /**
     * <p>
     * Creates a default VPC with a size <code>/16</code> IPv4 CIDR block and a default subnet in each Availability
     * Zone. For more information about the components of a default VPC, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html">Default VPC and Default Subnets</a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i>. You cannot specify the components of the default VPC
     * yourself.
     * </p>
     * <p>
     * You can create a default VPC if you deleted your previous default VPC. You cannot have more than one default VPC
     * per region.
     * </p>
     * <p>
     * If your account supports EC2-Classic, you cannot use this action to create a default VPC in a region that
     * supports EC2-Classic. If you want a default VPC in a region that supports EC2-Classic, see
     * "I really want a default VPC for my existing EC2 account. Is that possible?" in the <a
     * href="http://aws.amazon.com/vpc/faqs/#Default_VPCs">Default VPCs FAQ</a>.
     * </p>
     * 
     * @param createDefaultVpcRequest
     *        Contains the parameters for CreateDefaultVpc.
     * @return A Java Future containing the result of the CreateDefaultVpc operation returned by the service.
     * @sample AmazonEC2Async.CreateDefaultVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDefaultVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDefaultVpcResult> createDefaultVpcAsync(CreateDefaultVpcRequest createDefaultVpcRequest);

    /**
     * <p>
     * Creates a default VPC with a size <code>/16</code> IPv4 CIDR block and a default subnet in each Availability
     * Zone. For more information about the components of a default VPC, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html">Default VPC and Default Subnets</a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i>. You cannot specify the components of the default VPC
     * yourself.
     * </p>
     * <p>
     * You can create a default VPC if you deleted your previous default VPC. You cannot have more than one default VPC
     * per region.
     * </p>
     * <p>
     * If your account supports EC2-Classic, you cannot use this action to create a default VPC in a region that
     * supports EC2-Classic. If you want a default VPC in a region that supports EC2-Classic, see
     * "I really want a default VPC for my existing EC2 account. Is that possible?" in the <a
     * href="http://aws.amazon.com/vpc/faqs/#Default_VPCs">Default VPCs FAQ</a>.
     * </p>
     * 
     * @param createDefaultVpcRequest
     *        Contains the parameters for CreateDefaultVpc.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDefaultVpc operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateDefaultVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDefaultVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDefaultVpcResult> createDefaultVpcAsync(CreateDefaultVpcRequest createDefaultVpcRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDefaultVpcRequest, CreateDefaultVpcResult> asyncHandler);

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
     * <code>domain-name</code> - If you're using AmazonProvidedDNS in <code>us-east-1</code>, specify
     * <code>ec2.internal</code>. If you're using AmazonProvidedDNS in another region, specify
     * <code>region.compute.internal</code> (for example, <code>ap-northeast-1.compute.internal</code>). Otherwise,
     * specify a domain name (for example, <code>MyCompany.com</code>). This value is used to complete unqualified DNS
     * hostnames. <b>Important</b>: Some Linux operating systems accept multiple domain names separated by spaces.
     * However, Windows and other Linux operating systems treat the value as a single domain, which results in
     * unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating
     * systems, specify only one domain name.
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
     * @return A Java Future containing the result of the CreateDhcpOptions operation returned by the service.
     * @sample AmazonEC2Async.CreateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest createDhcpOptionsRequest);

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
     * <code>domain-name</code> - If you're using AmazonProvidedDNS in <code>us-east-1</code>, specify
     * <code>ec2.internal</code>. If you're using AmazonProvidedDNS in another region, specify
     * <code>region.compute.internal</code> (for example, <code>ap-northeast-1.compute.internal</code>). Otherwise,
     * specify a domain name (for example, <code>MyCompany.com</code>). This value is used to complete unqualified DNS
     * hostnames. <b>Important</b>: Some Linux operating systems accept multiple domain names separated by spaces.
     * However, Windows and other Linux operating systems treat the value as a single domain, which results in
     * unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating
     * systems, specify only one domain name.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDhcpOptions operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest createDhcpOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResult> asyncHandler);

    /**
     * <p>
     * [IPv6 only] Creates an egress-only Internet gateway for your VPC. An egress-only Internet gateway is used to
     * enable outbound communication over IPv6 from instances in your VPC to the Internet, and prevents hosts outside of
     * your VPC from initiating an IPv6 connection with your instance.
     * </p>
     * 
     * @param createEgressOnlyInternetGatewayRequest
     * @return A Java Future containing the result of the CreateEgressOnlyInternetGateway operation returned by the
     *         service.
     * @sample AmazonEC2Async.CreateEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEgressOnlyInternetGatewayResult> createEgressOnlyInternetGatewayAsync(
            CreateEgressOnlyInternetGatewayRequest createEgressOnlyInternetGatewayRequest);

    /**
     * <p>
     * [IPv6 only] Creates an egress-only Internet gateway for your VPC. An egress-only Internet gateway is used to
     * enable outbound communication over IPv6 from instances in your VPC to the Internet, and prevents hosts outside of
     * your VPC from initiating an IPv6 connection with your instance.
     * </p>
     * 
     * @param createEgressOnlyInternetGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEgressOnlyInternetGateway operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.CreateEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEgressOnlyInternetGatewayResult> createEgressOnlyInternetGatewayAsync(
            CreateEgressOnlyInternetGatewayRequest createEgressOnlyInternetGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEgressOnlyInternetGatewayRequest, CreateEgressOnlyInternetGatewayResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateFlowLogs operation returned by the service.
     * @sample AmazonEC2Async.CreateFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(CreateFlowLogsRequest createFlowLogsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlowLogs operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(CreateFlowLogsRequest createFlowLogsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowLogsRequest, CreateFlowLogsResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP).
     * </p>
     * <p>
     * The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs.
     * </p>
     * <p>
     * An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on one or
     * more FPGA-accelerated instances. For more information, see the <a href="https://github.com/aws/aws-fpga/">AWS
     * FPGA Hardware Development Kit</a>.
     * </p>
     * 
     * @param createFpgaImageRequest
     * @return A Java Future containing the result of the CreateFpgaImage operation returned by the service.
     * @sample AmazonEC2Async.CreateFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFpgaImageResult> createFpgaImageAsync(CreateFpgaImageRequest createFpgaImageRequest);

    /**
     * <p>
     * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP).
     * </p>
     * <p>
     * The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs.
     * </p>
     * <p>
     * An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on one or
     * more FPGA-accelerated instances. For more information, see the <a href="https://github.com/aws/aws-fpga/">AWS
     * FPGA Hardware Development Kit</a>.
     * </p>
     * 
     * @param createFpgaImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFpgaImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFpgaImageResult> createFpgaImageAsync(CreateFpgaImageRequest createFpgaImageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFpgaImageRequest, CreateFpgaImageResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateImage operation returned by the service.
     * @sample AmazonEC2Async.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateInstanceExportTask operation returned by the service.
     * @sample AmazonEC2Async.CreateInstanceExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInstanceExportTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest createInstanceExportTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstanceExportTask operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateInstanceExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInstanceExportTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest createInstanceExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceExportTaskRequest, CreateInstanceExportTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateInternetGateway operation returned by the service.
     * @sample AmazonEC2Async.CreateInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest createInternetGatewayRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInternetGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest createInternetGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateInternetGateway operation.
     *
     * @see #createInternetGatewayAsync(CreateInternetGatewayRequest)
     */
    java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync();

    /**
     * Simplified method form for invoking the CreateInternetGateway operation with an AsyncHandler.
     *
     * @see #createInternetGatewayAsync(CreateInternetGatewayRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(
            com.amazonaws.handlers.AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler);

    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the
     * private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private
     * key. If a key with the specified name already exists, Amazon EC2 returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per region.
     * </p>
     * <p>
     * The key pair returned to you is available only in the region in which you create it. If you prefer, you can
     * create your own key pair using a third-party tool and upload it to any region using <a>ImportKeyPair</a>.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key
     * Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createKeyPairRequest
     *        Contains the parameters for CreateKeyPair.
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonEC2Async.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest);

    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the
     * private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private
     * key. If a key with the specified name already exists, Amazon EC2 returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per region.
     * </p>
     * <p>
     * The key pair returned to you is available only in the region in which you create it. If you prefer, you can
     * create your own key pair using a third-party tool and upload it to any region using <a>ImportKeyPair</a>.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key
     * Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createKeyPairRequest
     *        Contains the parameters for CreateKeyPair.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler);

    /**
     * <p>
     * Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an
     * instance using <a>RunInstances</a>, you can specify a launch template instead of providing the launch parameters
     * in the request.
     * </p>
     * 
     * @param createLaunchTemplateRequest
     * @return A Java Future containing the result of the CreateLaunchTemplate operation returned by the service.
     * @sample AmazonEC2Async.CreateLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchTemplateResult> createLaunchTemplateAsync(CreateLaunchTemplateRequest createLaunchTemplateRequest);

    /**
     * <p>
     * Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an
     * instance using <a>RunInstances</a>, you can specify a launch template instead of providing the launch parameters
     * in the request.
     * </p>
     * 
     * @param createLaunchTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLaunchTemplate operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchTemplateResult> createLaunchTemplateAsync(CreateLaunchTemplateRequest createLaunchTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchTemplateRequest, CreateLaunchTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a new version for a launch template. You can specify an existing version of launch template from which to
     * base the new version.
     * </p>
     * <p>
     * Launch template versions are numbered in the order in which they are created. You cannot specify, change, or
     * replace the numbering of launch template versions.
     * </p>
     * 
     * @param createLaunchTemplateVersionRequest
     * @return A Java Future containing the result of the CreateLaunchTemplateVersion operation returned by the service.
     * @sample AmazonEC2Async.CreateLaunchTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLaunchTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchTemplateVersionResult> createLaunchTemplateVersionAsync(
            CreateLaunchTemplateVersionRequest createLaunchTemplateVersionRequest);

    /**
     * <p>
     * Creates a new version for a launch template. You can specify an existing version of launch template from which to
     * base the new version.
     * </p>
     * <p>
     * Launch template versions are numbered in the order in which they are created. You cannot specify, change, or
     * replace the numbering of launch template versions.
     * </p>
     * 
     * @param createLaunchTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLaunchTemplateVersion operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateLaunchTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLaunchTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchTemplateVersionResult> createLaunchTemplateVersionAsync(
            CreateLaunchTemplateVersionRequest createLaunchTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchTemplateVersionRequest, CreateLaunchTemplateVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateNatGateway operation returned by the service.
     * @sample AmazonEC2Async.CreateNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(CreateNatGatewayRequest createNatGatewayRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNatGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(CreateNatGatewayRequest createNatGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNatGatewayRequest, CreateNatGatewayResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateNetworkAcl operation returned by the service.
     * @sample AmazonEC2Async.CreateNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest createNetworkAclRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkAcl operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest createNetworkAclRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkAclRequest, CreateNetworkAclResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2Async.CreateNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest createNetworkAclEntryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest createNetworkAclEntryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkAclEntryRequest, CreateNetworkAclEntryResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateNetworkInterface operation returned by the service.
     * @sample AmazonEC2Async.CreateNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest createNetworkInterfaceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkInterface operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest createNetworkInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkInterfaceRequest, CreateNetworkInterfaceResult> asyncHandler);

    /**
     * <p>
     * Grants an AWS authorized partner account permission to attach the specified network interface to an instance in
     * their account.
     * </p>
     * <p>
     * You can grant permission to a single AWS account only, and only one account at a time.
     * </p>
     * 
     * @param createNetworkInterfacePermissionRequest
     *        Contains the parameters for CreateNetworkInterfacePermission.
     * @return A Java Future containing the result of the CreateNetworkInterfacePermission operation returned by the
     *         service.
     * @sample AmazonEC2Async.CreateNetworkInterfacePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInterfacePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkInterfacePermissionResult> createNetworkInterfacePermissionAsync(
            CreateNetworkInterfacePermissionRequest createNetworkInterfacePermissionRequest);

    /**
     * <p>
     * Grants an AWS authorized partner account permission to attach the specified network interface to an instance in
     * their account.
     * </p>
     * <p>
     * You can grant permission to a single AWS account only, and only one account at a time.
     * </p>
     * 
     * @param createNetworkInterfacePermissionRequest
     *        Contains the parameters for CreateNetworkInterfacePermission.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkInterfacePermission operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.CreateNetworkInterfacePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInterfacePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkInterfacePermissionResult> createNetworkInterfacePermissionAsync(
            CreateNetworkInterfacePermissionRequest createNetworkInterfacePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkInterfacePermissionRequest, CreateNetworkInterfacePermissionResult> asyncHandler);

    /**
     * <p>
     * Creates a placement group in which to launch instances. The strategy of the placement group determines how the
     * instances are organized within the group.
     * </p>
     * <p>
     * A <code>cluster</code> placement group is a logical grouping of instances within a single Availability Zone that
     * benefit from low network latency, high network throughput. A <code>spread</code> placement group places instances
     * on distinct hardware.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createPlacementGroupRequest
     *        Contains the parameters for CreatePlacementGroup.
     * @return A Java Future containing the result of the CreatePlacementGroup operation returned by the service.
     * @sample AmazonEC2Async.CreatePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreatePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(CreatePlacementGroupRequest createPlacementGroupRequest);

    /**
     * <p>
     * Creates a placement group in which to launch instances. The strategy of the placement group determines how the
     * instances are organized within the group.
     * </p>
     * <p>
     * A <code>cluster</code> placement group is a logical grouping of instances within a single Availability Zone that
     * benefit from low network latency, high network throughput. A <code>spread</code> placement group places instances
     * on distinct hardware.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createPlacementGroupRequest
     *        Contains the parameters for CreatePlacementGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlacementGroup operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreatePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreatePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(CreatePlacementGroupRequest createPlacementGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlacementGroupRequest, CreatePlacementGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateReservedInstancesListing operation returned by the
     *         service.
     * @sample AmazonEC2Async.CreateReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(
            CreateReservedInstancesListingRequest createReservedInstancesListingRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReservedInstancesListing operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.CreateReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(
            CreateReservedInstancesListingRequest createReservedInstancesListingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReservedInstancesListingRequest, CreateReservedInstancesListingResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AmazonEC2Async.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRouteTable operation returned by the service.
     * @sample AmazonEC2Async.CreateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest createRouteTableRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRouteTable operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest createRouteTableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteTableRequest, CreateRouteTableResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSecurityGroup operation returned by the service.
     * @sample AmazonEC2Async.CreateSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest createSecurityGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecurityGroup operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest createSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityGroupRequest, CreateSecurityGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonEC2Async.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data
     * feed per AWS account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance Data Feed</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createSpotDatafeedSubscriptionRequest
     *        Contains the parameters for CreateSpotDatafeedSubscription.
     * @return A Java Future containing the result of the CreateSpotDatafeedSubscription operation returned by the
     *         service.
     * @sample AmazonEC2Async.CreateSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(
            CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest);

    /**
     * <p>
     * Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data
     * feed per AWS account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance Data Feed</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createSpotDatafeedSubscriptionRequest
     *        Contains the parameters for CreateSpotDatafeedSubscription.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSpotDatafeedSubscription operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.CreateSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(
            CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSpotDatafeedSubscriptionRequest, CreateSpotDatafeedSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and the IPv4 CIDR block you want for the subnet. After you
     * create a subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a
     * VPC's IPv4 CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the
     * subnets' CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16
     * IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses).
     * </p>
     * <p>
     * If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses
     * a /64 prefix length.
     * </p>
     * <important>
     * <p>
     * AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for
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
     * @return A Java Future containing the result of the CreateSubnet operation returned by the service.
     * @sample AmazonEC2Async.CreateSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest createSubnetRequest);

    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and the IPv4 CIDR block you want for the subnet. After you
     * create a subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a
     * VPC's IPv4 CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the
     * subnets' CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16
     * IPv4 addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses).
     * </p>
     * <p>
     * If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses
     * a /64 prefix length.
     * </p>
     * <important>
     * <p>
     * AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubnet operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest createSubnetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubnetRequest, CreateSubnetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonEC2Async.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVolume operation returned by the service.
     * @sample AmazonEC2Async.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest createVolumeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVolume operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest createVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVpc operation returned by the service.
     * @sample AmazonEC2Async.CreateVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcResult> createVpcAsync(CreateVpcRequest createVpcRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpc operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcResult> createVpcAsync(CreateVpcRequest createVpcRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcRequest, CreateVpcResult> asyncHandler);

    /**
     * <p>
     * Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between
     * your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account.
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-endpoints.html">VPC
     * Endpoints</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * A <code>gateway</code> endpoint serves as a target for a route in your route table for traffic destined for the
     * AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service
     * from your VPC. You can also specify the VPC route tables that use the endpoint.
     * </p>
     * <p>
     * An <code>interface</code> endpoint is a network interface in your subnet that serves as an endpoint for
     * communicating with the specified service. You can specify the subnets in which to create an endpoint, and the
     * security groups to associate with the endpoint network interface.
     * </p>
     * <p>
     * Use <a>DescribeVpcEndpointServices</a> to get a list of supported services.
     * </p>
     * 
     * @param createVpcEndpointRequest
     *        Contains the parameters for CreateVpcEndpoint.
     * @return A Java Future containing the result of the CreateVpcEndpoint operation returned by the service.
     * @sample AmazonEC2Async.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest createVpcEndpointRequest);

    /**
     * <p>
     * Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between
     * your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account.
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-endpoints.html">VPC
     * Endpoints</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * A <code>gateway</code> endpoint serves as a target for a route in your route table for traffic destined for the
     * AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service
     * from your VPC. You can also specify the VPC route tables that use the endpoint.
     * </p>
     * <p>
     * An <code>interface</code> endpoint is a network interface in your subnet that serves as an endpoint for
     * communicating with the specified service. You can specify the subnets in which to create an endpoint, and the
     * security groups to associate with the endpoint network interface.
     * </p>
     * <p>
     * Use <a>DescribeVpcEndpointServices</a> to get a list of supported services.
     * </p>
     * 
     * @param createVpcEndpointRequest
     *        Contains the parameters for CreateVpcEndpoint.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcEndpoint operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest createVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification
     * notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Create a Topic</a> in the
     * <i>Amazon Simple Notification Service Developer Guide</i>.
     * </p>
     * <p>
     * You can create a connection notification for interface endpoints only.
     * </p>
     * 
     * @param createVpcEndpointConnectionNotificationRequest
     * @return A Java Future containing the result of the CreateVpcEndpointConnectionNotification operation returned by
     *         the service.
     * @sample AmazonEC2Async.CreateVpcEndpointConnectionNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpointConnectionNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointConnectionNotificationResult> createVpcEndpointConnectionNotificationAsync(
            CreateVpcEndpointConnectionNotificationRequest createVpcEndpointConnectionNotificationRequest);

    /**
     * <p>
     * Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification
     * notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Create a Topic</a> in the
     * <i>Amazon Simple Notification Service Developer Guide</i>.
     * </p>
     * <p>
     * You can create a connection notification for interface endpoints only.
     * </p>
     * 
     * @param createVpcEndpointConnectionNotificationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcEndpointConnectionNotification operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.CreateVpcEndpointConnectionNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpointConnectionNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointConnectionNotificationResult> createVpcEndpointConnectionNotificationAsync(
            CreateVpcEndpointConnectionNotificationRequest createVpcEndpointConnectionNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointConnectionNotificationRequest, CreateVpcEndpointConnectionNotificationResult> asyncHandler);

    /**
     * <p>
     * Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles)
     * can connect. Service consumers can create an interface VPC endpoint to connect to your service.
     * </p>
     * <p>
     * To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For
     * more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/endpoint-service.html">VPC
     * Endpoint Services</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpcEndpointServiceConfigurationRequest
     * @return A Java Future containing the result of the CreateVpcEndpointServiceConfiguration operation returned by
     *         the service.
     * @sample AmazonEC2Async.CreateVpcEndpointServiceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpointServiceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointServiceConfigurationResult> createVpcEndpointServiceConfigurationAsync(
            CreateVpcEndpointServiceConfigurationRequest createVpcEndpointServiceConfigurationRequest);

    /**
     * <p>
     * Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles)
     * can connect. Service consumers can create an interface VPC endpoint to connect to your service.
     * </p>
     * <p>
     * To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For
     * more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/endpoint-service.html">VPC
     * Endpoint Services</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpcEndpointServiceConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcEndpointServiceConfiguration operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.CreateVpcEndpointServiceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpointServiceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointServiceConfigurationResult> createVpcEndpointServiceConfigurationAsync(
            CreateVpcEndpointServiceConfigurationRequest createVpcEndpointServiceConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointServiceConfigurationRequest, CreateVpcEndpointServiceConfigurationResult> asyncHandler);

    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which
     * to create the connection. The accepter VPC can belong to another AWS account and can be in a different region to
     * the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.
     * </p>
     * <note>
     * <p>
     * Limitations and rules apply to a VPC peering connection. For more information, see the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/vpc-peering-basics.html#vpc-peering-limitations"
     * >limitations</a> section in the <i>VPC Peering Guide</i>.
     * </p>
     * </note>
     * <p>
     * The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering
     * connection request expires after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering
     * connection has a status of <code>failed</code>.
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Contains the parameters for CreateVpcPeeringConnection.
     * @return A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2Async.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);

    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which
     * to create the connection. The accepter VPC can belong to another AWS account and can be in a different region to
     * the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.
     * </p>
     * <note>
     * <p>
     * Limitations and rules apply to a VPC peering connection. For more information, see the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/vpc-peering-basics.html#vpc-peering-limitations"
     * >limitations</a> section in the <i>VPC Peering Guide</i>.
     * </p>
     * </note>
     * <p>
     * The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering
     * connection request expires after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering
     * connection has a status of <code>failed</code>.
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Contains the parameters for CreateVpcPeeringConnection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateVpcPeeringConnection operation.
     *
     * @see #createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest)
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync();

    /**
     * Simplified method form for invoking the CreateVpcPeeringConnection operation with an AsyncHandler.
     *
     * @see #createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler);

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
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS
     * Managed VPN Connections</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRequest
     *        Contains the parameters for CreateVpnConnection.
     * @return A Java Future containing the result of the CreateVpnConnection operation returned by the service.
     * @sample AmazonEC2Async.CreateVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest createVpnConnectionRequest);

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
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS
     * Managed VPN Connections</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRequest
     *        Contains the parameters for CreateVpnConnection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpnConnection operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest createVpnConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpnConnectionRequest, CreateVpnConnectionResult> asyncHandler);

    /**
     * <p>
     * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN
     * customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN
     * customer gateway.
     * </p>
     * <p>
     * For more information about VPN connections, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRouteRequest
     *        Contains the parameters for CreateVpnConnectionRoute.
     * @return A Java Future containing the result of the CreateVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2Async.CreateVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest);

    /**
     * <p>
     * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN
     * customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN
     * customer gateway.
     * </p>
     * <p>
     * For more information about VPN connections, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRouteRequest
     *        Contains the parameters for CreateVpnConnectionRoute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpnConnectionRouteRequest, CreateVpnConnectionRouteResult> asyncHandler);

    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN
     * connection. You can create a virtual private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information about virtual private gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnGatewayRequest
     *        Contains the parameters for CreateVpnGateway.
     * @return A Java Future containing the result of the CreateVpnGateway operation returned by the service.
     * @sample AmazonEC2Async.CreateVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest createVpnGatewayRequest);

    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN
     * connection. You can create a virtual private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information about virtual private gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpnGatewayRequest
     *        Contains the parameters for CreateVpnGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpnGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.CreateVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest createVpnGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpnGatewayRequest, CreateVpnGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer
     * gateway.
     * </p>
     * 
     * @param deleteCustomerGatewayRequest
     *        Contains the parameters for DeleteCustomerGateway.
     * @return A Java Future containing the result of the DeleteCustomerGateway operation returned by the service.
     * @sample AmazonEC2Async.DeleteCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest);

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer
     * gateway.
     * </p>
     * 
     * @param deleteCustomerGatewayRequest
     *        Contains the parameters for DeleteCustomerGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomerGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomerGatewayRequest, DeleteCustomerGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete
     * it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of
     * options with the VPC.
     * </p>
     * 
     * @param deleteDhcpOptionsRequest
     *        Contains the parameters for DeleteDhcpOptions.
     * @return A Java Future containing the result of the DeleteDhcpOptions operation returned by the service.
     * @sample AmazonEC2Async.DeleteDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest);

    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete
     * it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of
     * options with the VPC.
     * </p>
     * 
     * @param deleteDhcpOptionsRequest
     *        Contains the parameters for DeleteDhcpOptions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDhcpOptions operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDhcpOptionsRequest, DeleteDhcpOptionsResult> asyncHandler);

    /**
     * <p>
     * Deletes an egress-only Internet gateway.
     * </p>
     * 
     * @param deleteEgressOnlyInternetGatewayRequest
     * @return A Java Future containing the result of the DeleteEgressOnlyInternetGateway operation returned by the
     *         service.
     * @sample AmazonEC2Async.DeleteEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEgressOnlyInternetGatewayResult> deleteEgressOnlyInternetGatewayAsync(
            DeleteEgressOnlyInternetGatewayRequest deleteEgressOnlyInternetGatewayRequest);

    /**
     * <p>
     * Deletes an egress-only Internet gateway.
     * </p>
     * 
     * @param deleteEgressOnlyInternetGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEgressOnlyInternetGateway operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DeleteEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEgressOnlyInternetGatewayResult> deleteEgressOnlyInternetGatewayAsync(
            DeleteEgressOnlyInternetGatewayRequest deleteEgressOnlyInternetGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEgressOnlyInternetGatewayRequest, DeleteEgressOnlyInternetGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more flow logs.
     * </p>
     * 
     * @param deleteFlowLogsRequest
     *        Contains the parameters for DeleteFlowLogs.
     * @return A Java Future containing the result of the DeleteFlowLogs operation returned by the service.
     * @sample AmazonEC2Async.DeleteFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(DeleteFlowLogsRequest deleteFlowLogsRequest);

    /**
     * <p>
     * Deletes one or more flow logs.
     * </p>
     * 
     * @param deleteFlowLogsRequest
     *        Contains the parameters for DeleteFlowLogs.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlowLogs operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(DeleteFlowLogsRequest deleteFlowLogsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowLogsRequest, DeleteFlowLogsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param deleteFpgaImageRequest
     * @return A Java Future containing the result of the DeleteFpgaImage operation returned by the service.
     * @sample AmazonEC2Async.DeleteFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFpgaImageResult> deleteFpgaImageAsync(DeleteFpgaImageRequest deleteFpgaImageRequest);

    /**
     * <p>
     * Deletes the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param deleteFpgaImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFpgaImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFpgaImageResult> deleteFpgaImageAsync(DeleteFpgaImageRequest deleteFpgaImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFpgaImageRequest, DeleteFpgaImageResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Internet gateway. You must detach the Internet gateway from the VPC before you can delete
     * it.
     * </p>
     * 
     * @param deleteInternetGatewayRequest
     *        Contains the parameters for DeleteInternetGateway.
     * @return A Java Future containing the result of the DeleteInternetGateway operation returned by the service.
     * @sample AmazonEC2Async.DeleteInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(DeleteInternetGatewayRequest deleteInternetGatewayRequest);

    /**
     * <p>
     * Deletes the specified Internet gateway. You must detach the Internet gateway from the VPC before you can delete
     * it.
     * </p>
     * 
     * @param deleteInternetGatewayRequest
     *        Contains the parameters for DeleteInternetGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInternetGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(DeleteInternetGatewayRequest deleteInternetGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInternetGatewayRequest, DeleteInternetGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from Amazon EC2.
     * </p>
     * 
     * @param deleteKeyPairRequest
     *        Contains the parameters for DeleteKeyPair.
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonEC2Async.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest);

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from Amazon EC2.
     * </p>
     * 
     * @param deleteKeyPairRequest
     *        Contains the parameters for DeleteKeyPair.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler);

    /**
     * <p>
     * Deletes a launch template. Deleting a launch template deletes all of its versions.
     * </p>
     * 
     * @param deleteLaunchTemplateRequest
     * @return A Java Future containing the result of the DeleteLaunchTemplate operation returned by the service.
     * @sample AmazonEC2Async.DeleteLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchTemplateResult> deleteLaunchTemplateAsync(DeleteLaunchTemplateRequest deleteLaunchTemplateRequest);

    /**
     * <p>
     * Deletes a launch template. Deleting a launch template deletes all of its versions.
     * </p>
     * 
     * @param deleteLaunchTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunchTemplate operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchTemplateResult> deleteLaunchTemplateAsync(DeleteLaunchTemplateRequest deleteLaunchTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchTemplateRequest, DeleteLaunchTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more versions of a launch template. You cannot delete the default version of a launch template;
     * you must first assign a different version as the default. If the default version is the only version for the
     * launch template, you must delete the entire launch template using <a>DeleteLaunchTemplate</a>.
     * </p>
     * 
     * @param deleteLaunchTemplateVersionsRequest
     * @return A Java Future containing the result of the DeleteLaunchTemplateVersions operation returned by the
     *         service.
     * @sample AmazonEC2Async.DeleteLaunchTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLaunchTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchTemplateVersionsResult> deleteLaunchTemplateVersionsAsync(
            DeleteLaunchTemplateVersionsRequest deleteLaunchTemplateVersionsRequest);

    /**
     * <p>
     * Deletes one or more versions of a launch template. You cannot delete the default version of a launch template;
     * you must first assign a different version as the default. If the default version is the only version for the
     * launch template, you must delete the entire launch template using <a>DeleteLaunchTemplate</a>.
     * </p>
     * 
     * @param deleteLaunchTemplateVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunchTemplateVersions operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DeleteLaunchTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLaunchTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchTemplateVersionsResult> deleteLaunchTemplateVersionsAsync(
            DeleteLaunchTemplateVersionsRequest deleteLaunchTemplateVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchTemplateVersionsRequest, DeleteLaunchTemplateVersionsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not
     * release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your
     * route tables.
     * </p>
     * 
     * @param deleteNatGatewayRequest
     *        Contains the parameters for DeleteNatGateway.
     * @return A Java Future containing the result of the DeleteNatGateway operation returned by the service.
     * @sample AmazonEC2Async.DeleteNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(DeleteNatGatewayRequest deleteNatGatewayRequest);

    /**
     * <p>
     * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not
     * release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your
     * route tables.
     * </p>
     * 
     * @param deleteNatGatewayRequest
     *        Contains the parameters for DeleteNatGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNatGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(DeleteNatGatewayRequest deleteNatGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNatGatewayRequest, DeleteNatGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete
     * the default network ACL.
     * </p>
     * 
     * @param deleteNetworkAclRequest
     *        Contains the parameters for DeleteNetworkAcl.
     * @return A Java Future containing the result of the DeleteNetworkAcl operation returned by the service.
     * @sample AmazonEC2Async.DeleteNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(DeleteNetworkAclRequest deleteNetworkAclRequest);

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete
     * the default network ACL.
     * </p>
     * 
     * @param deleteNetworkAclRequest
     *        Contains the parameters for DeleteNetworkAcl.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkAcl operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(DeleteNetworkAclRequest deleteNetworkAclRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclRequest, DeleteNetworkAclResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
     * </p>
     * 
     * @param deleteNetworkAclEntryRequest
     *        Contains the parameters for DeleteNetworkAclEntry.
     * @return A Java Future containing the result of the DeleteNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2Async.DeleteNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest);

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
     * </p>
     * 
     * @param deleteNetworkAclEntryRequest
     *        Contains the parameters for DeleteNetworkAclEntry.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclEntryRequest, DeleteNetworkAclEntryResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network interface before you can delete it.
     * </p>
     * 
     * @param deleteNetworkInterfaceRequest
     *        Contains the parameters for DeleteNetworkInterface.
     * @return A Java Future containing the result of the DeleteNetworkInterface operation returned by the service.
     * @sample AmazonEC2Async.DeleteNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest);

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network interface before you can delete it.
     * </p>
     * 
     * @param deleteNetworkInterfaceRequest
     *        Contains the parameters for DeleteNetworkInterface.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkInterface operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkInterfaceRequest, DeleteNetworkInterfaceResult> asyncHandler);

    /**
     * <p>
     * Deletes a permission for a network interface. By default, you cannot delete the permission if the account for
     * which you're removing the permission has attached the network interface to an instance. However, you can force
     * delete the permission, regardless of any attachment.
     * </p>
     * 
     * @param deleteNetworkInterfacePermissionRequest
     *        Contains the parameters for DeleteNetworkInterfacePermission.
     * @return A Java Future containing the result of the DeleteNetworkInterfacePermission operation returned by the
     *         service.
     * @sample AmazonEC2Async.DeleteNetworkInterfacePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInterfacePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkInterfacePermissionResult> deleteNetworkInterfacePermissionAsync(
            DeleteNetworkInterfacePermissionRequest deleteNetworkInterfacePermissionRequest);

    /**
     * <p>
     * Deletes a permission for a network interface. By default, you cannot delete the permission if the account for
     * which you're removing the permission has attached the network interface to an instance. However, you can force
     * delete the permission, regardless of any attachment.
     * </p>
     * 
     * @param deleteNetworkInterfacePermissionRequest
     *        Contains the parameters for DeleteNetworkInterfacePermission.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkInterfacePermission operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DeleteNetworkInterfacePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInterfacePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkInterfacePermissionResult> deleteNetworkInterfacePermissionAsync(
            DeleteNetworkInterfacePermissionRequest deleteNetworkInterfacePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkInterfacePermissionRequest, DeleteNetworkInterfacePermissionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified placement group. You must terminate all instances in the placement group before you can
     * delete the placement group. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deletePlacementGroupRequest
     *        Contains the parameters for DeletePlacementGroup.
     * @return A Java Future containing the result of the DeletePlacementGroup operation returned by the service.
     * @sample AmazonEC2Async.DeletePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeletePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(DeletePlacementGroupRequest deletePlacementGroupRequest);

    /**
     * <p>
     * Deletes the specified placement group. You must terminate all instances in the placement group before you can
     * delete the placement group. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deletePlacementGroupRequest
     *        Contains the parameters for DeletePlacementGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlacementGroup operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeletePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeletePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(DeletePlacementGroupRequest deletePlacementGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePlacementGroupRequest, DeletePlacementGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     * 
     * @param deleteRouteRequest
     *        Contains the parameters for DeleteRoute.
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AmazonEC2Async.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     * 
     * @param deleteRouteRequest
     *        Contains the parameters for DeleteRoute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete
     * it. You can't delete the main route table.
     * </p>
     * 
     * @param deleteRouteTableRequest
     *        Contains the parameters for DeleteRouteTable.
     * @return A Java Future containing the result of the DeleteRouteTable operation returned by the service.
     * @sample AmazonEC2Async.DeleteRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(DeleteRouteTableRequest deleteRouteTableRequest);

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete
     * it. You can't delete the main route table.
     * </p>
     * 
     * @param deleteRouteTableRequest
     *        Contains the parameters for DeleteRouteTable.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRouteTable operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(DeleteRouteTableRequest deleteRouteTableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSecurityGroup operation returned by the service.
     * @sample AmazonEC2Async.DeleteSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(DeleteSecurityGroupRequest deleteSecurityGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecurityGroup operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(DeleteSecurityGroupRequest deleteSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityGroupRequest, DeleteSecurityGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonEC2Async.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes the data feed for Spot Instances.
     * </p>
     * 
     * @param deleteSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DeleteSpotDatafeedSubscription.
     * @return A Java Future containing the result of the DeleteSpotDatafeedSubscription operation returned by the
     *         service.
     * @sample AmazonEC2Async.DeleteSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(
            DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest);

    /**
     * <p>
     * Deletes the data feed for Spot Instances.
     * </p>
     * 
     * @param deleteSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DeleteSpotDatafeedSubscription.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSpotDatafeedSubscription operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DeleteSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(
            DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation.
     *
     * @see #deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest)
     */
    java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync();

    /**
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation with an AsyncHandler.
     *
     * @see #deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(
            com.amazonaws.handlers.AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the
     * subnet.
     * </p>
     * 
     * @param deleteSubnetRequest
     *        Contains the parameters for DeleteSubnet.
     * @return A Java Future containing the result of the DeleteSubnet operation returned by the service.
     * @sample AmazonEC2Async.DeleteSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubnetResult> deleteSubnetAsync(DeleteSubnetRequest deleteSubnetRequest);

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the
     * subnet.
     * </p>
     * 
     * @param deleteSubnetRequest
     *        Contains the parameters for DeleteSubnet.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubnet operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubnetResult> deleteSubnetAsync(DeleteSubnetRequest deleteSubnetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubnetRequest, DeleteSubnetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of resources.
     * </p>
     * <p>
     * To list the current tags, use <a>DescribeTags</a>. For more information about tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the parameters for DeleteTags.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonEC2Async.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of resources.
     * </p>
     * <p>
     * To list the current tags, use <a>DescribeTags</a>. For more information about tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the parameters for DeleteTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteVolume operation returned by the service.
     * @sample AmazonEC2Async.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVolume operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteVpc operation returned by the service.
     * @sample AmazonEC2Async.DeleteVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(DeleteVpcRequest deleteVpcRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpc operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(DeleteVpcRequest deleteVpcRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcRequest, DeleteVpcResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more VPC endpoint connection notifications.
     * </p>
     * 
     * @param deleteVpcEndpointConnectionNotificationsRequest
     * @return A Java Future containing the result of the DeleteVpcEndpointConnectionNotifications operation returned by
     *         the service.
     * @sample AmazonEC2Async.DeleteVpcEndpointConnectionNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpointConnectionNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointConnectionNotificationsResult> deleteVpcEndpointConnectionNotificationsAsync(
            DeleteVpcEndpointConnectionNotificationsRequest deleteVpcEndpointConnectionNotificationsRequest);

    /**
     * <p>
     * Deletes one or more VPC endpoint connection notifications.
     * </p>
     * 
     * @param deleteVpcEndpointConnectionNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcEndpointConnectionNotifications operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpcEndpointConnectionNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpointConnectionNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointConnectionNotificationsResult> deleteVpcEndpointConnectionNotificationsAsync(
            DeleteVpcEndpointConnectionNotificationsRequest deleteVpcEndpointConnectionNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointConnectionNotificationsRequest, DeleteVpcEndpointConnectionNotificationsResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service
     * configuration, you must reject any <code>Available</code> or <code>PendingAcceptance</code> interface endpoint
     * connections that are attached to the service.
     * </p>
     * 
     * @param deleteVpcEndpointServiceConfigurationsRequest
     * @return A Java Future containing the result of the DeleteVpcEndpointServiceConfigurations operation returned by
     *         the service.
     * @sample AmazonEC2Async.DeleteVpcEndpointServiceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpointServiceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointServiceConfigurationsResult> deleteVpcEndpointServiceConfigurationsAsync(
            DeleteVpcEndpointServiceConfigurationsRequest deleteVpcEndpointServiceConfigurationsRequest);

    /**
     * <p>
     * Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service
     * configuration, you must reject any <code>Available</code> or <code>PendingAcceptance</code> interface endpoint
     * connections that are attached to the service.
     * </p>
     * 
     * @param deleteVpcEndpointServiceConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcEndpointServiceConfigurations operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpcEndpointServiceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpointServiceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointServiceConfigurationsResult> deleteVpcEndpointServiceConfigurationsAsync(
            DeleteVpcEndpointServiceConfigurationsRequest deleteVpcEndpointServiceConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointServiceConfigurationsRequest, DeleteVpcEndpointServiceConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the
     * route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network
     * interfaces.
     * </p>
     * 
     * @param deleteVpcEndpointsRequest
     *        Contains the parameters for DeleteVpcEndpoints.
     * @return A Java Future containing the result of the DeleteVpcEndpoints operation returned by the service.
     * @sample AmazonEC2Async.DeleteVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(DeleteVpcEndpointsRequest deleteVpcEndpointsRequest);

    /**
     * <p>
     * Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the
     * route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network
     * interfaces.
     * </p>
     * 
     * @param deleteVpcEndpointsRequest
     *        Contains the parameters for DeleteVpcEndpoints.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcEndpoints operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(DeleteVpcEndpointsRequest deleteVpcEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointsRequest, DeleteVpcEndpointsResult> asyncHandler);

    /**
     * <p>
     * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can
     * delete the VPC peering connection if it's in the <code>active</code> state. The owner of the requester VPC can
     * delete a VPC peering connection in the <code>pending-acceptance</code> state.
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Contains the parameters for DeleteVpcPeeringConnection.
     * @return A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2Async.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(
            DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest);

    /**
     * <p>
     * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can
     * delete the VPC peering connection if it's in the <code>active</code> state. The owner of the requester VPC can
     * delete a VPC peering connection in the <code>pending-acceptance</code> state.
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Contains the parameters for DeleteVpcPeeringConnection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(
            DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteVpnConnection operation returned by the service.
     * @sample AmazonEC2Async.DeleteVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(DeleteVpnConnectionRequest deleteVpnConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpnConnection operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(DeleteVpnConnectionRequest deleteVpnConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRequest, DeleteVpnConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway
     * and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the
     * VPN customer gateway.
     * </p>
     * 
     * @param deleteVpnConnectionRouteRequest
     *        Contains the parameters for DeleteVpnConnectionRoute.
     * @return A Java Future containing the result of the DeleteVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2Async.DeleteVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest);

    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway
     * and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the
     * VPN customer gateway.
     * </p>
     * 
     * @param deleteVpnConnectionRouteRequest
     *        Contains the parameters for DeleteVpnConnectionRoute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRouteRequest, DeleteVpnConnectionRouteResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you
     * detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private
     * gateway if you plan to delete and recreate the VPN connection between your VPC and your network.
     * </p>
     * 
     * @param deleteVpnGatewayRequest
     *        Contains the parameters for DeleteVpnGateway.
     * @return A Java Future containing the result of the DeleteVpnGateway operation returned by the service.
     * @sample AmazonEC2Async.DeleteVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(DeleteVpnGatewayRequest deleteVpnGatewayRequest);

    /**
     * <p>
     * Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you
     * detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private
     * gateway if you plan to delete and recreate the VPN connection between your VPC and your network.
     * </p>
     * 
     * @param deleteVpnGatewayRequest
     *        Contains the parameters for DeleteVpnGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpnGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeleteVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(DeleteVpnGatewayRequest deleteVpnGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpnGatewayRequest, DeleteVpnGatewayResult> asyncHandler);

    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it
     * doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for
     * those instances until you terminate them.
     * </p>
     * <p>
     * When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume
     * of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't
     * affect the files that you uploaded to Amazon S3 when you created the AMI.
     * </p>
     * 
     * @param deregisterImageRequest
     *        Contains the parameters for DeregisterImage.
     * @return A Java Future containing the result of the DeregisterImage operation returned by the service.
     * @sample AmazonEC2Async.DeregisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(DeregisterImageRequest deregisterImageRequest);

    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it
     * doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for
     * those instances until you terminate them.
     * </p>
     * <p>
     * When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume
     * of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't
     * affect the files that you uploaded to Amazon S3 when you created the AMI.
     * </p>
     * 
     * @param deregisterImageRequest
     *        Contains the parameters for DeregisterImage.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DeregisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(DeregisterImageRequest deregisterImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterImageRequest, DeregisterImageResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonEC2Async.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest)
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync();

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation with an AsyncHandler.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAddresses operation returned by the service.
     * @sample AmazonEC2Async.DescribeAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAddresses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest describeAddressesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAddresses operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAddresses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest describeAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAddresses operation.
     *
     * @see #describeAddressesAsync(DescribeAddressesRequest)
     */
    java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync();

    /**
     * Simplified method form for invoking the DescribeAddresses operation with an AsyncHandler.
     *
     * @see #describeAddressesAsync(DescribeAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAvailabilityZones operation returned by the service.
     * @sample AmazonEC2Async.DescribeAvailabilityZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAvailabilityZones" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(
            DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAvailabilityZones operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeAvailabilityZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAvailabilityZones" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(
            DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAvailabilityZones operation.
     *
     * @see #describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest)
     */
    java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync();

    /**
     * Simplified method form for invoking the DescribeAvailabilityZones operation with an AsyncHandler.
     *
     * @see #describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeBundleTasks operation returned by the service.
     * @sample AmazonEC2Async.DescribeBundleTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeBundleTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest describeBundleTasksRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBundleTasks operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeBundleTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeBundleTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest describeBundleTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeBundleTasks operation.
     *
     * @see #describeBundleTasksAsync(DescribeBundleTasksRequest)
     */
    java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync();

    /**
     * Simplified method form for invoking the DescribeBundleTasks operation with an AsyncHandler.
     *
     * @see #describeBundleTasksAsync(DescribeBundleTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your linked EC2-Classic instances. This request only returns information about
     * EC2-Classic instances linked to a VPC through ClassicLink; you cannot use this request to return information
     * about other instances.
     * </p>
     * 
     * @param describeClassicLinkInstancesRequest
     *        Contains the parameters for DescribeClassicLinkInstances.
     * @return A Java Future containing the result of the DescribeClassicLinkInstances operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeClassicLinkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClassicLinkInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(
            DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest);

    /**
     * <p>
     * Describes one or more of your linked EC2-Classic instances. This request only returns information about
     * EC2-Classic instances linked to a VPC through ClassicLink; you cannot use this request to return information
     * about other instances.
     * </p>
     * 
     * @param describeClassicLinkInstancesRequest
     *        Contains the parameters for DescribeClassicLinkInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClassicLinkInstances operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeClassicLinkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClassicLinkInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(
            DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClassicLinkInstances operation.
     *
     * @see #describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest)
     */
    java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeClassicLinkInstances operation with an AsyncHandler.
     *
     * @see #describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeConversionTasks operation returned by the service.
     * @sample AmazonEC2Async.DescribeConversionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeConversionTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest describeConversionTasksRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConversionTasks operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeConversionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeConversionTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest describeConversionTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConversionTasks operation.
     *
     * @see #describeConversionTasksAsync(DescribeConversionTasksRequest)
     */
    java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync();

    /**
     * Simplified method form for invoking the DescribeConversionTasks operation with an AsyncHandler.
     *
     * @see #describeConversionTasksAsync(DescribeConversionTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeCustomerGatewaysRequest
     *        Contains the parameters for DescribeCustomerGateways.
     * @return A Java Future containing the result of the DescribeCustomerGateways operation returned by the service.
     * @sample AmazonEC2Async.DescribeCustomerGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeCustomerGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeCustomerGatewaysRequest
     *        Contains the parameters for DescribeCustomerGateways.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomerGateways operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeCustomerGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeCustomerGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCustomerGateways operation.
     *
     * @see #describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest)
     */
    java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync();

    /**
     * Simplified method form for invoking the DescribeCustomerGateways operation with an AsyncHandler.
     *
     * @see #describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDhcpOptions operation returned by the service.
     * @sample AmazonEC2Async.DescribeDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest describeDhcpOptionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDhcpOptions operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest describeDhcpOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDhcpOptions operation.
     *
     * @see #describeDhcpOptionsAsync(DescribeDhcpOptionsRequest)
     */
    java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync();

    /**
     * Simplified method form for invoking the DescribeDhcpOptions operation with an AsyncHandler.
     *
     * @see #describeDhcpOptionsAsync(DescribeDhcpOptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your egress-only Internet gateways.
     * </p>
     * 
     * @param describeEgressOnlyInternetGatewaysRequest
     * @return A Java Future containing the result of the DescribeEgressOnlyInternetGateways operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeEgressOnlyInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeEgressOnlyInternetGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEgressOnlyInternetGatewaysResult> describeEgressOnlyInternetGatewaysAsync(
            DescribeEgressOnlyInternetGatewaysRequest describeEgressOnlyInternetGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your egress-only Internet gateways.
     * </p>
     * 
     * @param describeEgressOnlyInternetGatewaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEgressOnlyInternetGateways operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeEgressOnlyInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeEgressOnlyInternetGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEgressOnlyInternetGatewaysResult> describeEgressOnlyInternetGatewaysAsync(
            DescribeEgressOnlyInternetGatewaysRequest describeEgressOnlyInternetGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEgressOnlyInternetGatewaysRequest, DescribeEgressOnlyInternetGatewaysResult> asyncHandler);

    /**
     * <p>
     * Describes the Elastic GPUs associated with your instances. For more information about Elastic GPUs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html">Amazon EC2 Elastic GPUs</a>.
     * </p>
     * 
     * @param describeElasticGpusRequest
     * @return A Java Future containing the result of the DescribeElasticGpus operation returned by the service.
     * @sample AmazonEC2Async.DescribeElasticGpus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeElasticGpus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeElasticGpusResult> describeElasticGpusAsync(DescribeElasticGpusRequest describeElasticGpusRequest);

    /**
     * <p>
     * Describes the Elastic GPUs associated with your instances. For more information about Elastic GPUs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html">Amazon EC2 Elastic GPUs</a>.
     * </p>
     * 
     * @param describeElasticGpusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticGpus operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeElasticGpus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeElasticGpus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeElasticGpusResult> describeElasticGpusAsync(DescribeElasticGpusRequest describeElasticGpusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticGpusRequest, DescribeElasticGpusResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     *        Contains the parameters for DescribeExportTasks.
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AmazonEC2Async.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     *        Contains the parameters for DescribeExportTasks.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeExportTasks operation.
     *
     * @see #describeExportTasksAsync(DescribeExportTasksRequest)
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync();

    /**
     * Simplified method form for invoking the DescribeExportTasks operation with an AsyncHandler.
     *
     * @see #describeExportTasksAsync(DescribeExportTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler);

    /**
     * <p>
     * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network
     * interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
     * </p>
     * 
     * @param describeFlowLogsRequest
     *        Contains the parameters for DescribeFlowLogs.
     * @return A Java Future containing the result of the DescribeFlowLogs operation returned by the service.
     * @sample AmazonEC2Async.DescribeFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(DescribeFlowLogsRequest describeFlowLogsRequest);

    /**
     * <p>
     * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network
     * interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
     * </p>
     * 
     * @param describeFlowLogsRequest
     *        Contains the parameters for DescribeFlowLogs.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFlowLogs operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(DescribeFlowLogsRequest describeFlowLogsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeFlowLogs operation.
     *
     * @see #describeFlowLogsAsync(DescribeFlowLogsRequest)
     */
    java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync();

    /**
     * Simplified method form for invoking the DescribeFlowLogs operation with an AsyncHandler.
     *
     * @see #describeFlowLogsAsync(DescribeFlowLogsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified attribute of the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param describeFpgaImageAttributeRequest
     * @return A Java Future containing the result of the DescribeFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2Async.DescribeFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFpgaImageAttributeResult> describeFpgaImageAttributeAsync(
            DescribeFpgaImageAttributeRequest describeFpgaImageAttributeRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param describeFpgaImageAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFpgaImageAttributeResult> describeFpgaImageAttributeAsync(
            DescribeFpgaImageAttributeRequest describeFpgaImageAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFpgaImageAttributeRequest, DescribeFpgaImageAttributeResult> asyncHandler);

    /**
     * <p>
     * Describes one or more available Amazon FPGA Images (AFIs). These include public AFIs, private AFIs that you own,
     * and AFIs owned by other AWS accounts for which you have load permissions.
     * </p>
     * 
     * @param describeFpgaImagesRequest
     * @return A Java Future containing the result of the DescribeFpgaImages operation returned by the service.
     * @sample AmazonEC2Async.DescribeFpgaImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFpgaImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFpgaImagesResult> describeFpgaImagesAsync(DescribeFpgaImagesRequest describeFpgaImagesRequest);

    /**
     * <p>
     * Describes one or more available Amazon FPGA Images (AFIs). These include public AFIs, private AFIs that you own,
     * and AFIs owned by other AWS accounts for which you have load permissions.
     * </p>
     * 
     * @param describeFpgaImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFpgaImages operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeFpgaImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFpgaImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFpgaImagesResult> describeFpgaImagesAsync(DescribeFpgaImagesRequest describeFpgaImagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFpgaImagesRequest, DescribeFpgaImagesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeHostReservationOfferings operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeHostReservationOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservationOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            DescribeHostReservationOfferingsRequest describeHostReservationOfferingsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHostReservationOfferings operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeHostReservationOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservationOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            DescribeHostReservationOfferingsRequest describeHostReservationOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHostReservationOfferingsRequest, DescribeHostReservationOfferingsResult> asyncHandler);

    /**
     * <p>
     * Describes Dedicated Host Reservations which are associated with Dedicated Hosts in your account.
     * </p>
     * 
     * @param describeHostReservationsRequest
     * @return A Java Future containing the result of the DescribeHostReservations operation returned by the service.
     * @sample AmazonEC2Async.DescribeHostReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(DescribeHostReservationsRequest describeHostReservationsRequest);

    /**
     * <p>
     * Describes Dedicated Host Reservations which are associated with Dedicated Hosts in your account.
     * </p>
     * 
     * @param describeHostReservationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHostReservations operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeHostReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(DescribeHostReservationsRequest describeHostReservationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHostReservationsRequest, DescribeHostReservationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeHosts operation returned by the service.
     * @sample AmazonEC2Async.DescribeHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(DescribeHostsRequest describeHostsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHosts operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(DescribeHostsRequest describeHostsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeHosts operation.
     *
     * @see #describeHostsAsync(DescribeHostsRequest)
     */
    java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync();

    /**
     * Simplified method form for invoking the DescribeHosts operation with an AsyncHandler.
     *
     * @see #describeHostsAsync(DescribeHostsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler);

    /**
     * <p>
     * Describes your IAM instance profile associations.
     * </p>
     * 
     * @param describeIamInstanceProfileAssociationsRequest
     * @return A Java Future containing the result of the DescribeIamInstanceProfileAssociations operation returned by
     *         the service.
     * @sample AmazonEC2Async.DescribeIamInstanceProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIamInstanceProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIamInstanceProfileAssociationsResult> describeIamInstanceProfileAssociationsAsync(
            DescribeIamInstanceProfileAssociationsRequest describeIamInstanceProfileAssociationsRequest);

    /**
     * <p>
     * Describes your IAM instance profile associations.
     * </p>
     * 
     * @param describeIamInstanceProfileAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIamInstanceProfileAssociations operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.DescribeIamInstanceProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIamInstanceProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIamInstanceProfileAssociationsResult> describeIamInstanceProfileAssociationsAsync(
            DescribeIamInstanceProfileAssociationsRequest describeIamInstanceProfileAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIamInstanceProfileAssociationsRequest, DescribeIamInstanceProfileAssociationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeIdFormat operation returned by the service.
     * @sample AmazonEC2Async.DescribeIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(DescribeIdFormatRequest describeIdFormatRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdFormat operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(DescribeIdFormatRequest describeIdFormatRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdFormatRequest, DescribeIdFormatResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeIdFormat operation.
     *
     * @see #describeIdFormatAsync(DescribeIdFormatRequest)
     */
    java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync();

    /**
     * Simplified method form for invoking the DescribeIdFormat operation with an AsyncHandler.
     *
     * @see #describeIdFormatAsync(DescribeIdFormatRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeIdFormatRequest, DescribeIdFormatResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2Async.DescribeIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdentityIdFormat" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityIdFormatResult> describeIdentityIdFormatAsync(DescribeIdentityIdFormatRequest describeIdentityIdFormatRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdentityIdFormat" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityIdFormatResult> describeIdentityIdFormatAsync(DescribeIdentityIdFormatRequest describeIdentityIdFormatRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityIdFormatRequest, DescribeIdentityIdFormatResult> asyncHandler);

    /**
     * <p>
     * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeImageAttributeRequest
     *        Contains the parameters for DescribeImageAttribute.
     * @return A Java Future containing the result of the DescribeImageAttribute operation returned by the service.
     * @sample AmazonEC2Async.DescribeImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest describeImageAttributeRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeImageAttributeRequest
     *        Contains the parameters for DescribeImageAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImageAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest describeImageAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImageAttributeRequest, DescribeImageAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonEC2Async.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeImages operation.
     *
     * @see #describeImagesAsync(DescribeImagesRequest)
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync();

    /**
     * Simplified method form for invoking the DescribeImages operation with an AsyncHandler.
     *
     * @see #describeImagesAsync(DescribeImagesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler);

    /**
     * <p>
     * Displays details about an import virtual machine or import snapshot tasks that are already created.
     * </p>
     * 
     * @param describeImportImageTasksRequest
     *        Contains the parameters for DescribeImportImageTasks.
     * @return A Java Future containing the result of the DescribeImportImageTasks operation returned by the service.
     * @sample AmazonEC2Async.DescribeImportImageTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportImageTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(DescribeImportImageTasksRequest describeImportImageTasksRequest);

    /**
     * <p>
     * Displays details about an import virtual machine or import snapshot tasks that are already created.
     * </p>
     * 
     * @param describeImportImageTasksRequest
     *        Contains the parameters for DescribeImportImageTasks.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImportImageTasks operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeImportImageTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportImageTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(DescribeImportImageTasksRequest describeImportImageTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImportImageTasksRequest, DescribeImportImageTasksResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeImportImageTasks operation.
     *
     * @see #describeImportImageTasksAsync(DescribeImportImageTasksRequest)
     */
    java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync();

    /**
     * Simplified method form for invoking the DescribeImportImageTasks operation with an AsyncHandler.
     *
     * @see #describeImportImageTasksAsync(DescribeImportImageTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImportImageTasksRequest, DescribeImportImageTasksResult> asyncHandler);

    /**
     * <p>
     * Describes your import snapshot tasks.
     * </p>
     * 
     * @param describeImportSnapshotTasksRequest
     *        Contains the parameters for DescribeImportSnapshotTasks.
     * @return A Java Future containing the result of the DescribeImportSnapshotTasks operation returned by the service.
     * @sample AmazonEC2Async.DescribeImportSnapshotTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportSnapshotTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(
            DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest);

    /**
     * <p>
     * Describes your import snapshot tasks.
     * </p>
     * 
     * @param describeImportSnapshotTasksRequest
     *        Contains the parameters for DescribeImportSnapshotTasks.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImportSnapshotTasks operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeImportSnapshotTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportSnapshotTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(
            DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation.
     *
     * @see #describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest)
     */
    java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync();

    /**
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation with an AsyncHandler.
     *
     * @see #describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeInstanceAttribute operation returned by the service.
     * @sample AmazonEC2Async.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler);

    /**
     * <p>
     * Describes the credit option for CPU usage of one or more of your T2 instances. The credit options are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * If you do not specify an instance ID, Amazon EC2 returns only the T2 instances with the <code>unlimited</code>
     * credit option. If you specify one or more instance IDs, Amazon EC2 returns the credit option (
     * <code>standard</code> or <code>unlimited</code>) of those instances. If you specify an instance ID that is not
     * valid, such as an instance that is not a T2 instance, an error is returned.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results. This interval is usually less than one hour.
     * </p>
     * <p>
     * If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone,
     * or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected
     * zone, the call works normally.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/t2-instances.html">T2
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeInstanceCreditSpecificationsRequest
     * @return A Java Future containing the result of the DescribeInstanceCreditSpecifications operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeInstanceCreditSpecifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceCreditSpecifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceCreditSpecificationsResult> describeInstanceCreditSpecificationsAsync(
            DescribeInstanceCreditSpecificationsRequest describeInstanceCreditSpecificationsRequest);

    /**
     * <p>
     * Describes the credit option for CPU usage of one or more of your T2 instances. The credit options are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * If you do not specify an instance ID, Amazon EC2 returns only the T2 instances with the <code>unlimited</code>
     * credit option. If you specify one or more instance IDs, Amazon EC2 returns the credit option (
     * <code>standard</code> or <code>unlimited</code>) of those instances. If you specify an instance ID that is not
     * valid, such as an instance that is not a T2 instance, an error is returned.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results. This interval is usually less than one hour.
     * </p>
     * <p>
     * If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone,
     * or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected
     * zone, the call works normally.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/t2-instances.html">T2
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeInstanceCreditSpecificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceCreditSpecifications operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeInstanceCreditSpecifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceCreditSpecifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceCreditSpecificationsResult> describeInstanceCreditSpecificationsAsync(
            DescribeInstanceCreditSpecificationsRequest describeInstanceCreditSpecificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceCreditSpecificationsRequest, DescribeInstanceCreditSpecificationsResult> asyncHandler);

    /**
     * <p>
     * Describes the status of one or more instances. By default, only running instances are described, unless you
     * specifically indicate to return the status of all instances.
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
     * @return A Java Future containing the result of the DescribeInstanceStatus operation returned by the service.
     * @sample AmazonEC2Async.DescribeInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest describeInstanceStatusRequest);

    /**
     * <p>
     * Describes the status of one or more instances. By default, only running instances are described, unless you
     * specifically indicate to return the status of all instances.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceStatus operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest describeInstanceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeInstanceStatus operation.
     *
     * @see #describeInstanceStatusAsync(DescribeInstanceStatusRequest)
     */
    java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync();

    /**
     * Simplified method form for invoking the DescribeInstanceStatus operation with an AsyncHandler.
     *
     * @see #describeInstanceStatusAsync(DescribeInstanceStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AmazonEC2Async.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeInstances operation.
     *
     * @see #describeInstancesAsync(DescribeInstancesRequest)
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeInstances operation with an AsyncHandler.
     *
     * @see #describeInstancesAsync(DescribeInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     * 
     * @param describeInternetGatewaysRequest
     *        Contains the parameters for DescribeInternetGateways.
     * @return A Java Future containing the result of the DescribeInternetGateways operation returned by the service.
     * @sample AmazonEC2Async.DescribeInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInternetGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(DescribeInternetGatewaysRequest describeInternetGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     * 
     * @param describeInternetGatewaysRequest
     *        Contains the parameters for DescribeInternetGateways.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInternetGateways operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInternetGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(DescribeInternetGatewaysRequest describeInternetGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeInternetGateways operation.
     *
     * @see #describeInternetGatewaysAsync(DescribeInternetGatewaysRequest)
     */
    java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync();

    /**
     * Simplified method form for invoking the DescribeInternetGateways operation with an AsyncHandler.
     *
     * @see #describeInternetGatewaysAsync(DescribeInternetGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeKeyPairs operation returned by the service.
     * @sample AmazonEC2Async.DescribeKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest describeKeyPairsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeKeyPairs operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest describeKeyPairsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeKeyPairs operation.
     *
     * @see #describeKeyPairsAsync(DescribeKeyPairsRequest)
     */
    java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync();

    /**
     * Simplified method form for invoking the DescribeKeyPairs operation with an AsyncHandler.
     *
     * @see #describeKeyPairsAsync(DescribeKeyPairsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more versions of a specified launch template. You can describe all versions, individual
     * versions, or a range of versions.
     * </p>
     * 
     * @param describeLaunchTemplateVersionsRequest
     * @return A Java Future containing the result of the DescribeLaunchTemplateVersions operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeLaunchTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLaunchTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchTemplateVersionsResult> describeLaunchTemplateVersionsAsync(
            DescribeLaunchTemplateVersionsRequest describeLaunchTemplateVersionsRequest);

    /**
     * <p>
     * Describes one or more versions of a specified launch template. You can describe all versions, individual
     * versions, or a range of versions.
     * </p>
     * 
     * @param describeLaunchTemplateVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLaunchTemplateVersions operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeLaunchTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLaunchTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchTemplateVersionsResult> describeLaunchTemplateVersionsAsync(
            DescribeLaunchTemplateVersionsRequest describeLaunchTemplateVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchTemplateVersionsRequest, DescribeLaunchTemplateVersionsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more launch templates.
     * </p>
     * 
     * @param describeLaunchTemplatesRequest
     * @return A Java Future containing the result of the DescribeLaunchTemplates operation returned by the service.
     * @sample AmazonEC2Async.DescribeLaunchTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLaunchTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchTemplatesResult> describeLaunchTemplatesAsync(DescribeLaunchTemplatesRequest describeLaunchTemplatesRequest);

    /**
     * <p>
     * Describes one or more launch templates.
     * </p>
     * 
     * @param describeLaunchTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLaunchTemplates operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeLaunchTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLaunchTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchTemplatesResult> describeLaunchTemplatesAsync(DescribeLaunchTemplatesRequest describeLaunchTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchTemplatesRequest, DescribeLaunchTemplatesResult> asyncHandler);

    /**
     * <p>
     * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to
     * the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your
     * account.
     * </p>
     * 
     * @param describeMovingAddressesRequest
     *        Contains the parameters for DescribeMovingAddresses.
     * @return A Java Future containing the result of the DescribeMovingAddresses operation returned by the service.
     * @sample AmazonEC2Async.DescribeMovingAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeMovingAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(DescribeMovingAddressesRequest describeMovingAddressesRequest);

    /**
     * <p>
     * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to
     * the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your
     * account.
     * </p>
     * 
     * @param describeMovingAddressesRequest
     *        Contains the parameters for DescribeMovingAddresses.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMovingAddresses operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeMovingAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeMovingAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(DescribeMovingAddressesRequest describeMovingAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMovingAddressesRequest, DescribeMovingAddressesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeMovingAddresses operation.
     *
     * @see #describeMovingAddressesAsync(DescribeMovingAddressesRequest)
     */
    java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync();

    /**
     * Simplified method form for invoking the DescribeMovingAddresses operation with an AsyncHandler.
     *
     * @see #describeMovingAddressesAsync(DescribeMovingAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMovingAddressesRequest, DescribeMovingAddressesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of the your NAT gateways.
     * </p>
     * 
     * @param describeNatGatewaysRequest
     *        Contains the parameters for DescribeNatGateways.
     * @return A Java Future containing the result of the DescribeNatGateways operation returned by the service.
     * @sample AmazonEC2Async.DescribeNatGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNatGateways" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNatGatewaysResult> describeNatGatewaysAsync(DescribeNatGatewaysRequest describeNatGatewaysRequest);

    /**
     * <p>
     * Describes one or more of the your NAT gateways.
     * </p>
     * 
     * @param describeNatGatewaysRequest
     *        Contains the parameters for DescribeNatGateways.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNatGateways operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeNatGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNatGateways" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNatGatewaysResult> describeNatGatewaysAsync(DescribeNatGatewaysRequest describeNatGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNatGatewaysRequest, DescribeNatGatewaysResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeNetworkAcls operation returned by the service.
     * @sample AmazonEC2Async.DescribeNetworkAcls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkAcls" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest describeNetworkAclsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNetworkAcls operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeNetworkAcls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkAcls" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest describeNetworkAclsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeNetworkAcls operation.
     *
     * @see #describeNetworkAclsAsync(DescribeNetworkAclsRequest)
     */
    java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync();

    /**
     * Simplified method form for invoking the DescribeNetworkAcls operation with an AsyncHandler.
     *
     * @see #describeNetworkAclsAsync(DescribeNetworkAclsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler);

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeNetworkInterfaceAttributeRequest
     *        Contains the parameters for DescribeNetworkInterfaceAttribute.
     * @return A Java Future containing the result of the DescribeNetworkInterfaceAttribute operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(
            DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeNetworkInterfaceAttributeRequest
     *        Contains the parameters for DescribeNetworkInterfaceAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNetworkInterfaceAttribute operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(
            DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfaceAttributeRequest, DescribeNetworkInterfaceAttributeResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions for your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacePermissionsRequest
     *        Contains the parameters for DescribeNetworkInterfacePermissions.
     * @return A Java Future containing the result of the DescribeNetworkInterfacePermissions operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeNetworkInterfacePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfacePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkInterfacePermissionsResult> describeNetworkInterfacePermissionsAsync(
            DescribeNetworkInterfacePermissionsRequest describeNetworkInterfacePermissionsRequest);

    /**
     * <p>
     * Describes the permissions for your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacePermissionsRequest
     *        Contains the parameters for DescribeNetworkInterfacePermissions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNetworkInterfacePermissions operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeNetworkInterfacePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfacePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkInterfacePermissionsResult> describeNetworkInterfacePermissionsAsync(
            DescribeNetworkInterfacePermissionsRequest describeNetworkInterfacePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacePermissionsRequest, DescribeNetworkInterfacePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacesRequest
     *        Contains the parameters for DescribeNetworkInterfaces.
     * @return A Java Future containing the result of the DescribeNetworkInterfaces operation returned by the service.
     * @sample AmazonEC2Async.DescribeNetworkInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(
            DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest);

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacesRequest
     *        Contains the parameters for DescribeNetworkInterfaces.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNetworkInterfaces operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeNetworkInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(
            DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeNetworkInterfaces operation.
     *
     * @see #describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest)
     */
    java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync();

    /**
     * Simplified method form for invoking the DescribeNetworkInterfaces operation with an AsyncHandler.
     *
     * @see #describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your placement groups. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describePlacementGroupsRequest
     *        Contains the parameters for DescribePlacementGroups.
     * @return A Java Future containing the result of the DescribePlacementGroups operation returned by the service.
     * @sample AmazonEC2Async.DescribePlacementGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePlacementGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(DescribePlacementGroupsRequest describePlacementGroupsRequest);

    /**
     * <p>
     * Describes one or more of your placement groups. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describePlacementGroupsRequest
     *        Contains the parameters for DescribePlacementGroups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePlacementGroups operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribePlacementGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePlacementGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(DescribePlacementGroupsRequest describePlacementGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePlacementGroupsRequest, DescribePlacementGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribePlacementGroups operation.
     *
     * @see #describePlacementGroupsAsync(DescribePlacementGroupsRequest)
     */
    java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync();

    /**
     * Simplified method form for invoking the DescribePlacementGroups operation with an AsyncHandler.
     *
     * @see #describePlacementGroupsAsync(DescribePlacementGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePlacementGroupsRequest, DescribePlacementGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID
     * of the service and the IP address range for the service. A prefix list ID is required for creating an outbound
     * security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint.
     * </p>
     * 
     * @param describePrefixListsRequest
     *        Contains the parameters for DescribePrefixLists.
     * @return A Java Future containing the result of the DescribePrefixLists operation returned by the service.
     * @sample AmazonEC2Async.DescribePrefixLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePrefixLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(DescribePrefixListsRequest describePrefixListsRequest);

    /**
     * <p>
     * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID
     * of the service and the IP address range for the service. A prefix list ID is required for creating an outbound
     * security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint.
     * </p>
     * 
     * @param describePrefixListsRequest
     *        Contains the parameters for DescribePrefixLists.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePrefixLists operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribePrefixLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePrefixLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(DescribePrefixListsRequest describePrefixListsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePrefixListsRequest, DescribePrefixListsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribePrefixLists operation.
     *
     * @see #describePrefixListsAsync(DescribePrefixListsRequest)
     */
    java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync();

    /**
     * Simplified method form for invoking the DescribePrefixLists operation with an AsyncHandler.
     *
     * @see #describePrefixListsAsync(DescribePrefixListsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePrefixListsRequest, DescribePrefixListsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeRegions operation returned by the service.
     * @sample AmazonEC2Async.DescribeRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest describeRegionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegions operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest describeRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeRegions operation.
     *
     * @see #describeRegionsAsync(DescribeRegionsRequest)
     */
    java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync();

    /**
     * Simplified method form for invoking the DescribeRegions operation with an AsyncHandler.
     *
     * @see #describeRegionsAsync(DescribeRegionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonEC2Async.DescribeReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            DescribeReservedInstancesRequest describeReservedInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            DescribeReservedInstancesRequest describeReservedInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedInstances operation.
     *
     * @see #describeReservedInstancesAsync(DescribeReservedInstancesRequest)
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeReservedInstances operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesAsync(DescribeReservedInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeReservedInstancesListings operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeReservedInstancesListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesListings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstancesListings operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeReservedInstancesListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesListings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesListings operation.
     *
     * @see #describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest)
     */
    java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync();

    /**
     * Simplified method form for invoking the DescribeReservedInstancesListings operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeReservedInstancesModifications operation returned by
     *         the service.
     * @sample AmazonEC2Async.DescribeReservedInstancesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstancesModifications operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.DescribeReservedInstancesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation.
     *
     * @see #describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest)
     */
    java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync();

    /**
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeReservedInstancesOfferings operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeReservedInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstancesOfferings operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeReservedInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation.
     *
     * @see #describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest)
     */
    java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync();

    /**
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeRouteTables operation returned by the service.
     * @sample AmazonEC2Async.DescribeRouteTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRouteTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(DescribeRouteTablesRequest describeRouteTablesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRouteTables operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeRouteTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRouteTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(DescribeRouteTablesRequest describeRouteTablesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRouteTablesRequest, DescribeRouteTablesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeRouteTables operation.
     *
     * @see #describeRouteTablesAsync(DescribeRouteTablesRequest)
     */
    java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync();

    /**
     * Simplified method form for invoking the DescribeRouteTables operation with an AsyncHandler.
     *
     * @see #describeRouteTablesAsync(DescribeRouteTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeRouteTablesRequest, DescribeRouteTablesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeScheduledInstanceAvailability operation returned by
     *         the service.
     * @sample AmazonEC2Async.DescribeScheduledInstanceAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstanceAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledInstanceAvailabilityResult> describeScheduledInstanceAvailabilityAsync(
            DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledInstanceAvailability operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.DescribeScheduledInstanceAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstanceAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledInstanceAvailabilityResult> describeScheduledInstanceAvailabilityAsync(
            DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledInstanceAvailabilityRequest, DescribeScheduledInstanceAvailabilityResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your Scheduled Instances.
     * </p>
     * 
     * @param describeScheduledInstancesRequest
     *        Contains the parameters for DescribeScheduledInstances.
     * @return A Java Future containing the result of the DescribeScheduledInstances operation returned by the service.
     * @sample AmazonEC2Async.DescribeScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(
            DescribeScheduledInstancesRequest describeScheduledInstancesRequest);

    /**
     * <p>
     * Describes one or more of your Scheduled Instances.
     * </p>
     * 
     * @param describeScheduledInstancesRequest
     *        Contains the parameters for DescribeScheduledInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(
            DescribeScheduledInstancesRequest describeScheduledInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledInstancesRequest, DescribeScheduledInstancesResult> asyncHandler);

    /**
     * <p>
     * [EC2-VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security
     * groups you've specified in this request.
     * </p>
     * 
     * @param describeSecurityGroupReferencesRequest
     * @return A Java Future containing the result of the DescribeSecurityGroupReferences operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeSecurityGroupReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroupReferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            DescribeSecurityGroupReferencesRequest describeSecurityGroupReferencesRequest);

    /**
     * <p>
     * [EC2-VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security
     * groups you've specified in this request.
     * </p>
     * 
     * @param describeSecurityGroupReferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecurityGroupReferences operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeSecurityGroupReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroupReferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            DescribeSecurityGroupReferencesRequest describeSecurityGroupReferencesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupReferencesRequest, DescribeSecurityGroupReferencesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSecurityGroups operation returned by the service.
     * @sample AmazonEC2Async.DescribeSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest describeSecurityGroupsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecurityGroups operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest describeSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSecurityGroups operation.
     *
     * @see #describeSecurityGroupsAsync(DescribeSecurityGroupsRequest)
     */
    java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeSecurityGroupsAsync(DescribeSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2Async.DescribeSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(
            DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(
            DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotAttributeRequest, DescribeSnapshotAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonEC2Async.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Describes the data feed for Spot Instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance Data Feed</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DescribeSpotDatafeedSubscription.
     * @return A Java Future containing the result of the DescribeSpotDatafeedSubscription operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest);

    /**
     * <p>
     * Describes the data feed for Spot Instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance Data Feed</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DescribeSpotDatafeedSubscription.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpotDatafeedSubscription operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation.
     *
     * @see #describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest)
     */
    java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync();

    /**
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation with an AsyncHandler.
     *
     * @see #describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Describes the running instances for the specified Spot Fleet.
     * </p>
     * 
     * @param describeSpotFleetInstancesRequest
     *        Contains the parameters for DescribeSpotFleetInstances.
     * @return A Java Future containing the result of the DescribeSpotFleetInstances operation returned by the service.
     * @sample AmazonEC2Async.DescribeSpotFleetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotFleetInstancesResult> describeSpotFleetInstancesAsync(
            DescribeSpotFleetInstancesRequest describeSpotFleetInstancesRequest);

    /**
     * <p>
     * Describes the running instances for the specified Spot Fleet.
     * </p>
     * 
     * @param describeSpotFleetInstancesRequest
     *        Contains the parameters for DescribeSpotFleetInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpotFleetInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeSpotFleetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotFleetInstancesResult> describeSpotFleetInstancesAsync(
            DescribeSpotFleetInstancesRequest describeSpotFleetInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetInstancesRequest, DescribeSpotFleetInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes the events for the specified Spot Fleet request during the specified time.
     * </p>
     * <p>
     * Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query
     * by the last evaluated time and not miss a recorded event.
     * </p>
     * 
     * @param describeSpotFleetRequestHistoryRequest
     *        Contains the parameters for DescribeSpotFleetRequestHistory.
     * @return A Java Future containing the result of the DescribeSpotFleetRequestHistory operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeSpotFleetRequestHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequestHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            DescribeSpotFleetRequestHistoryRequest describeSpotFleetRequestHistoryRequest);

    /**
     * <p>
     * Describes the events for the specified Spot Fleet request during the specified time.
     * </p>
     * <p>
     * Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query
     * by the last evaluated time and not miss a recorded event.
     * </p>
     * 
     * @param describeSpotFleetRequestHistoryRequest
     *        Contains the parameters for DescribeSpotFleetRequestHistory.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpotFleetRequestHistory operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeSpotFleetRequestHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequestHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            DescribeSpotFleetRequestHistoryRequest describeSpotFleetRequestHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestHistoryRequest, DescribeSpotFleetRequestHistoryResult> asyncHandler);

    /**
     * <p>
     * Describes your Spot Fleet requests.
     * </p>
     * <p>
     * Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotFleetRequestsRequest
     *        Contains the parameters for DescribeSpotFleetRequests.
     * @return A Java Future containing the result of the DescribeSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2Async.DescribeSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(
            DescribeSpotFleetRequestsRequest describeSpotFleetRequestsRequest);

    /**
     * <p>
     * Describes your Spot Fleet requests.
     * </p>
     * <p>
     * Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotFleetRequestsRequest
     *        Contains the parameters for DescribeSpotFleetRequests.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(
            DescribeSpotFleetRequestsRequest describeSpotFleetRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSpotFleetRequests operation.
     *
     * @see #describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest)
     */
    java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync();

    /**
     * Simplified method form for invoking the DescribeSpotFleetRequests operation with an AsyncHandler.
     *
     * @see #describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult> asyncHandler);

    /**
     * <p>
     * Describes the Spot Instance requests that belong to your account. Spot Instances are instances that Amazon EC2
     * launches when the Spot price that you specify exceeds the current Spot price. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a running Spot Instance by examining the response.
     * If the status of the Spot Instance is <code>fulfilled</code>, the instance ID appears in the response and
     * contains the identifier of the instance. Alternatively, you can use <a>DescribeInstances</a> with a filter to
     * look for instances where the instance lifecycle is <code>spot</code>.
     * </p>
     * <p>
     * Spot Instance requests are deleted 4 hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotInstanceRequestsRequest
     *        Contains the parameters for DescribeSpotInstanceRequests.
     * @return A Java Future containing the result of the DescribeSpotInstanceRequests operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotInstanceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(
            DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest);

    /**
     * <p>
     * Describes the Spot Instance requests that belong to your account. Spot Instances are instances that Amazon EC2
     * launches when the Spot price that you specify exceeds the current Spot price. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a running Spot Instance by examining the response.
     * If the status of the Spot Instance is <code>fulfilled</code>, the instance ID appears in the response and
     * contains the identifier of the instance. Alternatively, you can use <a>DescribeInstances</a> with a filter to
     * look for instances where the instance lifecycle is <code>spot</code>.
     * </p>
     * <p>
     * Spot Instance requests are deleted 4 hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotInstanceRequestsRequest
     *        Contains the parameters for DescribeSpotInstanceRequests.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpotInstanceRequests operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotInstanceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(
            DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation.
     *
     * @see #describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest)
     */
    java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync();

    /**
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation with an AsyncHandler.
     *
     * @see #describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSpotPriceHistory operation returned by the service.
     * @sample AmazonEC2Async.DescribeSpotPriceHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotPriceHistory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpotPriceHistory operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeSpotPriceHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotPriceHistory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSpotPriceHistory operation.
     *
     * @see #describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest)
     */
    java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync();

    /**
     * Simplified method form for invoking the DescribeSpotPriceHistory operation with an AsyncHandler.
     *
     * @see #describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult> asyncHandler);

    /**
     * <p>
     * [EC2-VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale
     * when they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC
     * peering connection has been deleted.
     * </p>
     * 
     * @param describeStaleSecurityGroupsRequest
     * @return A Java Future containing the result of the DescribeStaleSecurityGroups operation returned by the service.
     * @sample AmazonEC2Async.DescribeStaleSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeStaleSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStaleSecurityGroupsResult> describeStaleSecurityGroupsAsync(
            DescribeStaleSecurityGroupsRequest describeStaleSecurityGroupsRequest);

    /**
     * <p>
     * [EC2-VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale
     * when they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC
     * peering connection has been deleted.
     * </p>
     * 
     * @param describeStaleSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStaleSecurityGroups operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeStaleSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeStaleSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStaleSecurityGroupsResult> describeStaleSecurityGroupsAsync(
            DescribeStaleSecurityGroupsRequest describeStaleSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStaleSecurityGroupsRequest, DescribeStaleSecurityGroupsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSubnets operation returned by the service.
     * @sample AmazonEC2Async.DescribeSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSubnets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest describeSubnetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubnets operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSubnets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest describeSubnetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSubnets operation.
     *
     * @see #describeSubnetsAsync(DescribeSubnetsRequest)
     */
    java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync();

    /**
     * Simplified method form for invoking the DescribeSubnets operation with an AsyncHandler.
     *
     * @see #describeSubnetsAsync(DescribeSubnetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonEC2Async.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync();

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeVolumeAttribute operation returned by the service.
     * @sample AmazonEC2Async.DescribeVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest describeVolumeAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVolumeAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest describeVolumeAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumeAttributeRequest, DescribeVolumeAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeVolumeStatus operation returned by the service.
     * @sample AmazonEC2Async.DescribeVolumeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest describeVolumeStatusRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVolumeStatus operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVolumeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest describeVolumeStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVolumeStatus operation.
     *
     * @see #describeVolumeStatusAsync(DescribeVolumeStatusRequest)
     */
    java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync();

    /**
     * Simplified method form for invoking the DescribeVolumeStatus operation with an AsyncHandler.
     *
     * @see #describeVolumeStatusAsync(DescribeVolumeStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeVolumes operation returned by the service.
     * @sample AmazonEC2Async.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVolumes operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVolumes operation.
     *
     * @see #describeVolumesAsync(DescribeVolumesRequest)
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync();

    /**
     * Simplified method form for invoking the DescribeVolumes operation with an AsyncHandler.
     *
     * @see #describeVolumesAsync(DescribeVolumesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeVolumesModifications operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeVolumesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesModificationsResult> describeVolumesModificationsAsync(
            DescribeVolumesModificationsRequest describeVolumesModificationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVolumesModifications operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeVolumesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesModificationsResult> describeVolumesModificationsAsync(
            DescribeVolumesModificationsRequest describeVolumesModificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesModificationsRequest, DescribeVolumesModificationsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeVpcAttributeRequest
     *        Contains the parameters for DescribeVpcAttribute.
     * @return A Java Future containing the result of the DescribeVpcAttribute operation returned by the service.
     * @sample AmazonEC2Async.DescribeVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest describeVpcAttributeRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeVpcAttributeRequest
     *        Contains the parameters for DescribeVpcAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest describeVpcAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcAttributeRequest, DescribeVpcAttributeResult> asyncHandler);

    /**
     * <p>
     * Describes the ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @param describeVpcClassicLinkRequest
     *        Contains the parameters for DescribeVpcClassicLink.
     * @return A Java Future containing the result of the DescribeVpcClassicLink operation returned by the service.
     * @sample AmazonEC2Async.DescribeVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest describeVpcClassicLinkRequest);

    /**
     * <p>
     * Describes the ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @param describeVpcClassicLinkRequest
     *        Contains the parameters for DescribeVpcClassicLink.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcClassicLink operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest describeVpcClassicLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVpcClassicLink operation.
     *
     * @see #describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest)
     */
    java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync();

    /**
     * Simplified method form for invoking the DescribeVpcClassicLink operation with an AsyncHandler.
     *
     * @see #describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult> asyncHandler);

    /**
     * <p>
     * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked
     * EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
     * linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
     * from a linked EC2-Classic instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpcClassicLinkDnsSupportRequest
     *        Contains the parameters for DescribeVpcClassicLinkDnsSupport.
     * @return A Java Future containing the result of the DescribeVpcClassicLinkDnsSupport operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcClassicLinkDnsSupportResult> describeVpcClassicLinkDnsSupportAsync(
            DescribeVpcClassicLinkDnsSupportRequest describeVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked
     * EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
     * linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
     * from a linked EC2-Classic instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpcClassicLinkDnsSupportRequest
     *        Contains the parameters for DescribeVpcClassicLinkDnsSupport.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcClassicLinkDnsSupport operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcClassicLinkDnsSupportResult> describeVpcClassicLinkDnsSupportAsync(
            DescribeVpcClassicLinkDnsSupportRequest describeVpcClassicLinkDnsSupportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkDnsSupportRequest, DescribeVpcClassicLinkDnsSupportResult> asyncHandler);

    /**
     * <p>
     * Describes the connection notifications for VPC endpoints and VPC endpoint services.
     * </p>
     * 
     * @param describeVpcEndpointConnectionNotificationsRequest
     * @return A Java Future containing the result of the DescribeVpcEndpointConnectionNotifications operation returned
     *         by the service.
     * @sample AmazonEC2Async.DescribeVpcEndpointConnectionNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointConnectionNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointConnectionNotificationsResult> describeVpcEndpointConnectionNotificationsAsync(
            DescribeVpcEndpointConnectionNotificationsRequest describeVpcEndpointConnectionNotificationsRequest);

    /**
     * <p>
     * Describes the connection notifications for VPC endpoints and VPC endpoint services.
     * </p>
     * 
     * @param describeVpcEndpointConnectionNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcEndpointConnectionNotifications operation returned
     *         by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcEndpointConnectionNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointConnectionNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointConnectionNotificationsResult> describeVpcEndpointConnectionNotificationsAsync(
            DescribeVpcEndpointConnectionNotificationsRequest describeVpcEndpointConnectionNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointConnectionNotificationsRequest, DescribeVpcEndpointConnectionNotificationsResult> asyncHandler);

    /**
     * <p>
     * Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending
     * your acceptance.
     * </p>
     * 
     * @param describeVpcEndpointConnectionsRequest
     * @return A Java Future containing the result of the DescribeVpcEndpointConnections operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointConnectionsResult> describeVpcEndpointConnectionsAsync(
            DescribeVpcEndpointConnectionsRequest describeVpcEndpointConnectionsRequest);

    /**
     * <p>
     * Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending
     * your acceptance.
     * </p>
     * 
     * @param describeVpcEndpointConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcEndpointConnections operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointConnectionsResult> describeVpcEndpointConnectionsAsync(
            DescribeVpcEndpointConnectionsRequest describeVpcEndpointConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointConnectionsRequest, DescribeVpcEndpointConnectionsResult> asyncHandler);

    /**
     * <p>
     * Describes the VPC endpoint service configurations in your account (your services).
     * </p>
     * 
     * @param describeVpcEndpointServiceConfigurationsRequest
     * @return A Java Future containing the result of the DescribeVpcEndpointServiceConfigurations operation returned by
     *         the service.
     * @sample AmazonEC2Async.DescribeVpcEndpointServiceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServiceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointServiceConfigurationsResult> describeVpcEndpointServiceConfigurationsAsync(
            DescribeVpcEndpointServiceConfigurationsRequest describeVpcEndpointServiceConfigurationsRequest);

    /**
     * <p>
     * Describes the VPC endpoint service configurations in your account (your services).
     * </p>
     * 
     * @param describeVpcEndpointServiceConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcEndpointServiceConfigurations operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcEndpointServiceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServiceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointServiceConfigurationsResult> describeVpcEndpointServiceConfigurationsAsync(
            DescribeVpcEndpointServiceConfigurationsRequest describeVpcEndpointServiceConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServiceConfigurationsRequest, DescribeVpcEndpointServiceConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.
     * </p>
     * 
     * @param describeVpcEndpointServicePermissionsRequest
     * @return A Java Future containing the result of the DescribeVpcEndpointServicePermissions operation returned by
     *         the service.
     * @sample AmazonEC2Async.DescribeVpcEndpointServicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointServicePermissionsResult> describeVpcEndpointServicePermissionsAsync(
            DescribeVpcEndpointServicePermissionsRequest describeVpcEndpointServicePermissionsRequest);

    /**
     * <p>
     * Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.
     * </p>
     * 
     * @param describeVpcEndpointServicePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcEndpointServicePermissions operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcEndpointServicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointServicePermissionsResult> describeVpcEndpointServicePermissionsAsync(
            DescribeVpcEndpointServicePermissionsRequest describeVpcEndpointServicePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicePermissionsRequest, DescribeVpcEndpointServicePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes available services to which you can create a VPC endpoint.
     * </p>
     * 
     * @param describeVpcEndpointServicesRequest
     *        Contains the parameters for DescribeVpcEndpointServices.
     * @return A Java Future containing the result of the DescribeVpcEndpointServices operation returned by the service.
     * @sample AmazonEC2Async.DescribeVpcEndpointServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(
            DescribeVpcEndpointServicesRequest describeVpcEndpointServicesRequest);

    /**
     * <p>
     * Describes available services to which you can create a VPC endpoint.
     * </p>
     * 
     * @param describeVpcEndpointServicesRequest
     *        Contains the parameters for DescribeVpcEndpointServices.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcEndpointServices operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcEndpointServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(
            DescribeVpcEndpointServicesRequest describeVpcEndpointServicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVpcEndpointServices operation.
     *
     * @see #describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest)
     */
    java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync();

    /**
     * Simplified method form for invoking the DescribeVpcEndpointServices operation with an AsyncHandler.
     *
     * @see #describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     *        Contains the parameters for DescribeVpcEndpoints.
     * @return A Java Future containing the result of the DescribeVpcEndpoints operation returned by the service.
     * @sample AmazonEC2Async.DescribeVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest describeVpcEndpointsRequest);

    /**
     * <p>
     * Describes one or more of your VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     *        Contains the parameters for DescribeVpcEndpoints.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcEndpoints operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest describeVpcEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVpcEndpoints operation.
     *
     * @see #describeVpcEndpointsAsync(DescribeVpcEndpointsRequest)
     */
    java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync();

    /**
     * Simplified method form for invoking the DescribeVpcEndpoints operation with an AsyncHandler.
     *
     * @see #describeVpcEndpointsAsync(DescribeVpcEndpointsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Contains the parameters for DescribeVpcPeeringConnections.
     * @return A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
     *         service.
     * @sample AmazonEC2Async.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest);

    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Contains the parameters for DescribeVpcPeeringConnections.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation.
     *
     * @see #describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest)
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync();

    /**
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation with an AsyncHandler.
     *
     * @see #describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     * 
     * @param describeVpcsRequest
     *        Contains the parameters for DescribeVpcs.
     * @return A Java Future containing the result of the DescribeVpcs operation returned by the service.
     * @sample AmazonEC2Async.DescribeVpcs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest describeVpcsRequest);

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     * 
     * @param describeVpcsRequest
     *        Contains the parameters for DescribeVpcs.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcs operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpcs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest describeVpcsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcsRequest, DescribeVpcsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVpcs operation.
     *
     * @see #describeVpcsAsync(DescribeVpcsRequest)
     */
    java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync();

    /**
     * Simplified method form for invoking the DescribeVpcs operation with an AsyncHandler.
     *
     * @see #describeVpcsAsync(DescribeVpcsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(com.amazonaws.handlers.AsyncHandler<DescribeVpcsRequest, DescribeVpcsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information about VPN connections, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpnConnectionsRequest
     *        Contains the parameters for DescribeVpnConnections.
     * @return A Java Future containing the result of the DescribeVpnConnections operation returned by the service.
     * @sample AmazonEC2Async.DescribeVpnConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest describeVpnConnectionsRequest);

    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information about VPN connections, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpnConnectionsRequest
     *        Contains the parameters for DescribeVpnConnections.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpnConnections operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpnConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest describeVpnConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVpnConnections operation.
     *
     * @see #describeVpnConnectionsAsync(DescribeVpnConnectionsRequest)
     */
    java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync();

    /**
     * Simplified method form for invoking the DescribeVpnConnections operation with an AsyncHandler.
     *
     * @see #describeVpnConnectionsAsync(DescribeVpnConnectionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information about virtual private gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpnGatewaysRequest
     *        Contains the parameters for DescribeVpnGateways.
     * @return A Java Future containing the result of the DescribeVpnGateways operation returned by the service.
     * @sample AmazonEC2Async.DescribeVpnGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnGateways" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest describeVpnGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information about virtual private gateways, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html">AWS Managed VPN Connections</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpnGatewaysRequest
     *        Contains the parameters for DescribeVpnGateways.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpnGateways operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DescribeVpnGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnGateways" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest describeVpnGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVpnGateways operation.
     *
     * @see #describeVpnGatewaysAsync(DescribeVpnGatewaysRequest)
     */
    java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync();

    /**
     * Simplified method form for invoking the DescribeVpnGateways operation with an AsyncHandler.
     *
     * @see #describeVpnGatewaysAsync(DescribeVpnGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult> asyncHandler);

    /**
     * <p>
     * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC
     * security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's
     * stopped.
     * </p>
     * 
     * @param detachClassicLinkVpcRequest
     *        Contains the parameters for DetachClassicLinkVpc.
     * @return A Java Future containing the result of the DetachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2Async.DetachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachClassicLinkVpcResult> detachClassicLinkVpcAsync(DetachClassicLinkVpcRequest detachClassicLinkVpcRequest);

    /**
     * <p>
     * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC
     * security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's
     * stopped.
     * </p>
     * 
     * @param detachClassicLinkVpcRequest
     *        Contains the parameters for DetachClassicLinkVpc.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DetachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachClassicLinkVpcResult> detachClassicLinkVpcAsync(DetachClassicLinkVpcRequest detachClassicLinkVpcRequest,
            com.amazonaws.handlers.AsyncHandler<DetachClassicLinkVpcRequest, DetachClassicLinkVpcResult> asyncHandler);

    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity between the Internet and the VPC. The VPC must
     * not contain any running instances with Elastic IP addresses or public IPv4 addresses.
     * </p>
     * 
     * @param detachInternetGatewayRequest
     *        Contains the parameters for DetachInternetGateway.
     * @return A Java Future containing the result of the DetachInternetGateway operation returned by the service.
     * @sample AmazonEC2Async.DetachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(DetachInternetGatewayRequest detachInternetGatewayRequest);

    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity between the Internet and the VPC. The VPC must
     * not contain any running instances with Elastic IP addresses or public IPv4 addresses.
     * </p>
     * 
     * @param detachInternetGatewayRequest
     *        Contains the parameters for DetachInternetGateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachInternetGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DetachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(DetachInternetGatewayRequest detachInternetGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DetachInternetGatewayRequest, DetachInternetGatewayResult> asyncHandler);

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     * 
     * @param detachNetworkInterfaceRequest
     *        Contains the parameters for DetachNetworkInterface.
     * @return A Java Future containing the result of the DetachNetworkInterface operation returned by the service.
     * @sample AmazonEC2Async.DetachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest);

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     * 
     * @param detachNetworkInterfaceRequest
     *        Contains the parameters for DetachNetworkInterface.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachNetworkInterface operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DetachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<DetachNetworkInterfaceRequest, DetachNetworkInterfaceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetachVolume operation returned by the service.
     * @sample AmazonEC2Async.DetachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest detachVolumeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachVolume operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DetachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest detachVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DetachVolumeRequest, DetachVolumeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetachVpnGateway operation returned by the service.
     * @sample AmazonEC2Async.DetachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(DetachVpnGatewayRequest detachVpnGatewayRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachVpnGateway operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DetachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(DetachVpnGatewayRequest detachVpnGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DetachVpnGatewayRequest, DetachVpnGatewayResult> asyncHandler);

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
     * </p>
     * 
     * @param disableVgwRoutePropagationRequest
     *        Contains the parameters for DisableVgwRoutePropagation.
     * @return A Java Future containing the result of the DisableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2Async.DisableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(
            DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest);

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
     * </p>
     * 
     * @param disableVgwRoutePropagationRequest
     *        Contains the parameters for DisableVgwRoutePropagation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DisableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(
            DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest,
            com.amazonaws.handlers.AsyncHandler<DisableVgwRoutePropagationRequest, DisableVgwRoutePropagationResult> asyncHandler);

    /**
     * <p>
     * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to
     * it.
     * </p>
     * 
     * @param disableVpcClassicLinkRequest
     *        Contains the parameters for DisableVpcClassicLink.
     * @return A Java Future containing the result of the DisableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2Async.DisableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(DisableVpcClassicLinkRequest disableVpcClassicLinkRequest);

    /**
     * <p>
     * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to
     * it.
     * </p>
     * 
     * @param disableVpcClassicLinkRequest
     *        Contains the parameters for DisableVpcClassicLink.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DisableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(DisableVpcClassicLinkRequest disableVpcClassicLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkRequest, DisableVpcClassicLinkResult> asyncHandler);

    /**
     * <p>
     * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when
     * addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more
     * information about ClassicLink, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param disableVpcClassicLinkDnsSupportRequest
     *        Contains the parameters for DisableVpcClassicLinkDnsSupport.
     * @return A Java Future containing the result of the DisableVpcClassicLinkDnsSupport operation returned by the
     *         service.
     * @sample AmazonEC2Async.DisableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            DisableVpcClassicLinkDnsSupportRequest disableVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when
     * addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more
     * information about ClassicLink, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param disableVpcClassicLinkDnsSupportRequest
     *        Contains the parameters for DisableVpcClassicLinkDnsSupport.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableVpcClassicLinkDnsSupport operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DisableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            DisableVpcClassicLinkDnsSupportRequest disableVpcClassicLinkDnsSupportRequest,
            com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkDnsSupportRequest, DisableVpcClassicLinkDnsSupportResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateAddress operation returned by the service.
     * @sample AmazonEC2Async.DisassociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(DisassociateAddressRequest disassociateAddressRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAddress operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DisassociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(DisassociateAddressRequest disassociateAddressRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAddressRequest, DisassociateAddressResult> asyncHandler);

    /**
     * <p>
     * Disassociates an IAM instance profile from a running or stopped instance.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association ID.
     * </p>
     * 
     * @param disassociateIamInstanceProfileRequest
     * @return A Java Future containing the result of the DisassociateIamInstanceProfile operation returned by the
     *         service.
     * @sample AmazonEC2Async.DisassociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateIamInstanceProfileResult> disassociateIamInstanceProfileAsync(
            DisassociateIamInstanceProfileRequest disassociateIamInstanceProfileRequest);

    /**
     * <p>
     * Disassociates an IAM instance profile from a running or stopped instance.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association ID.
     * </p>
     * 
     * @param disassociateIamInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateIamInstanceProfile operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.DisassociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateIamInstanceProfileResult> disassociateIamInstanceProfileAsync(
            DisassociateIamInstanceProfileRequest disassociateIamInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateIamInstanceProfileRequest, DisassociateIamInstanceProfileResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateRouteTable operation returned by the service.
     * @sample AmazonEC2Async.DisassociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(DisassociateRouteTableRequest disassociateRouteTableRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateRouteTable operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DisassociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(DisassociateRouteTableRequest disassociateRouteTableRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateRouteTableRequest, DisassociateRouteTableResult> asyncHandler);

    /**
     * <p>
     * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must
     * detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate
     * it.
     * </p>
     * 
     * @param disassociateSubnetCidrBlockRequest
     * @return A Java Future containing the result of the DisassociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2Async.DisassociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateSubnetCidrBlock"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSubnetCidrBlockResult> disassociateSubnetCidrBlockAsync(
            DisassociateSubnetCidrBlockRequest disassociateSubnetCidrBlockRequest);

    /**
     * <p>
     * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must
     * detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate
     * it.
     * </p>
     * 
     * @param disassociateSubnetCidrBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DisassociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateSubnetCidrBlock"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSubnetCidrBlockResult> disassociateSubnetCidrBlockAsync(
            DisassociateSubnetCidrBlockRequest disassociateSubnetCidrBlockRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSubnetCidrBlockRequest, DisassociateSubnetCidrBlockResult> asyncHandler);

    /**
     * <p>
     * Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You
     * can get the association ID by using <a>DescribeVpcs</a>. You must detach or delete all gateways and resources
     * that are associated with the CIDR block before you can disassociate it.
     * </p>
     * <p>
     * You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).
     * </p>
     * 
     * @param disassociateVpcCidrBlockRequest
     * @return A Java Future containing the result of the DisassociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2Async.DisassociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateVpcCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateVpcCidrBlockResult> disassociateVpcCidrBlockAsync(DisassociateVpcCidrBlockRequest disassociateVpcCidrBlockRequest);

    /**
     * <p>
     * Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You
     * can get the association ID by using <a>DescribeVpcs</a>. You must detach or delete all gateways and resources
     * that are associated with the CIDR block before you can disassociate it.
     * </p>
     * <p>
     * You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).
     * </p>
     * 
     * @param disassociateVpcCidrBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2AsyncHandler.DisassociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateVpcCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateVpcCidrBlockResult> disassociateVpcCidrBlockAsync(DisassociateVpcCidrBlockRequest disassociateVpcCidrBlockRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateVpcCidrBlockRequest, DisassociateVpcCidrBlockResult> asyncHandler);

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
     * </p>
     * 
     * @param enableVgwRoutePropagationRequest
     *        Contains the parameters for EnableVgwRoutePropagation.
     * @return A Java Future containing the result of the EnableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2Async.EnableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(
            EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest);

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
     * </p>
     * 
     * @param enableVgwRoutePropagationRequest
     *        Contains the parameters for EnableVgwRoutePropagation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2AsyncHandler.EnableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(
            EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest,
            com.amazonaws.handlers.AsyncHandler<EnableVgwRoutePropagationRequest, EnableVgwRoutePropagationResult> asyncHandler);

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was
     * potentially inconsistent.
     * </p>
     * 
     * @param enableVolumeIORequest
     *        Contains the parameters for EnableVolumeIO.
     * @return A Java Future containing the result of the EnableVolumeIO operation returned by the service.
     * @sample AmazonEC2Async.EnableVolumeIO
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVolumeIO" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(EnableVolumeIORequest enableVolumeIORequest);

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was
     * potentially inconsistent.
     * </p>
     * 
     * @param enableVolumeIORequest
     *        Contains the parameters for EnableVolumeIO.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableVolumeIO operation returned by the service.
     * @sample AmazonEC2AsyncHandler.EnableVolumeIO
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVolumeIO" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(EnableVolumeIORequest enableVolumeIORequest,
            com.amazonaws.handlers.AsyncHandler<EnableVolumeIORequest, EnableVolumeIOResult> asyncHandler);

    /**
     * <p>
     * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow
     * communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC's route
     * tables have existing routes for address ranges within the <code>10.0.0.0/8</code> IP address range, excluding
     * local routes for VPCs in the <code>10.0.0.0/16</code> and <code>10.1.0.0/16</code> IP address ranges. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param enableVpcClassicLinkRequest
     *        Contains the parameters for EnableVpcClassicLink.
     * @return A Java Future containing the result of the EnableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2Async.EnableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(EnableVpcClassicLinkRequest enableVpcClassicLinkRequest);

    /**
     * <p>
     * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow
     * communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC's route
     * tables have existing routes for address ranges within the <code>10.0.0.0/8</code> IP address range, excluding
     * local routes for VPCs in the <code>10.0.0.0/16</code> and <code>10.1.0.0/16</code> IP address ranges. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param enableVpcClassicLinkRequest
     *        Contains the parameters for EnableVpcClassicLink.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2AsyncHandler.EnableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(EnableVpcClassicLinkRequest enableVpcClassicLinkRequest,
            com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkRequest, EnableVpcClassicLinkResult> asyncHandler);

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
     * @return A Java Future containing the result of the EnableVpcClassicLinkDnsSupport operation returned by the
     *         service.
     * @sample AmazonEC2Async.EnableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(
            EnableVpcClassicLinkDnsSupportRequest enableVpcClassicLinkDnsSupportRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableVpcClassicLinkDnsSupport operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.EnableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(
            EnableVpcClassicLinkDnsSupportRequest enableVpcClassicLinkDnsSupportRequest,
            com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkDnsSupportRequest, EnableVpcClassicLinkDnsSupportResult> asyncHandler);

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
     * preserves the most recent 64 KB output, which is available for at least one hour after the most recent post.
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
     * @return A Java Future containing the result of the GetConsoleOutput operation returned by the service.
     * @sample AmazonEC2Async.GetConsoleOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleOutput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest getConsoleOutputRequest);

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
     * preserves the most recent 64 KB output, which is available for at least one hour after the most recent post.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConsoleOutput operation returned by the service.
     * @sample AmazonEC2AsyncHandler.GetConsoleOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleOutput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest getConsoleOutputRequest,
            com.amazonaws.handlers.AsyncHandler<GetConsoleOutputRequest, GetConsoleOutputResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetConsoleScreenshot operation returned by the service.
     * @sample AmazonEC2Async.GetConsoleScreenshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleScreenshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(GetConsoleScreenshotRequest getConsoleScreenshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConsoleScreenshot operation returned by the service.
     * @sample AmazonEC2AsyncHandler.GetConsoleScreenshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleScreenshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(GetConsoleScreenshotRequest getConsoleScreenshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetConsoleScreenshotRequest, GetConsoleScreenshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetHostReservationPurchasePreview operation returned by the
     *         service.
     * @sample AmazonEC2Async.GetHostReservationPurchasePreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetHostReservationPurchasePreview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            GetHostReservationPurchasePreviewRequest getHostReservationPurchasePreviewRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostReservationPurchasePreview operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.GetHostReservationPurchasePreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetHostReservationPurchasePreview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            GetHostReservationPurchasePreviewRequest getHostReservationPurchasePreviewRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostReservationPurchasePreviewRequest, GetHostReservationPurchasePreviewResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration data of the specified instance. You can use this data to create a launch template.
     * </p>
     * 
     * @param getLaunchTemplateDataRequest
     * @return A Java Future containing the result of the GetLaunchTemplateData operation returned by the service.
     * @sample AmazonEC2Async.GetLaunchTemplateData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetLaunchTemplateData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchTemplateDataResult> getLaunchTemplateDataAsync(GetLaunchTemplateDataRequest getLaunchTemplateDataRequest);

    /**
     * <p>
     * Retrieves the configuration data of the specified instance. You can use this data to create a launch template.
     * </p>
     * 
     * @param getLaunchTemplateDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunchTemplateData operation returned by the service.
     * @sample AmazonEC2AsyncHandler.GetLaunchTemplateData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetLaunchTemplateData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchTemplateDataResult> getLaunchTemplateDataAsync(GetLaunchTemplateDataRequest getLaunchTemplateDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchTemplateDataRequest, GetLaunchTemplateDataResult> asyncHandler);

    /**
     * <p>
     * Retrieves the encrypted administrator password for a running Windows instance.
     * </p>
     * <p>
     * The Windows password is generated at boot by the <code>EC2Config</code> service or <code>EC2Launch</code> scripts
     * (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/UsingConfig_WinAMI.html">EC2Config</a> and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2launch.html">EC2Launch</a> in the Amazon Elastic
     * Compute Cloud User Guide.
     * </p>
     * <p>
     * For the <code>EC2Config</code> service, the password is not generated for rebundled AMIs unless
     * <code>Ec2SetPassword</code> is enabled before bundling.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when you launched the instance. You must provide
     * the corresponding key pair file.
     * </p>
     * <p>
     * When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve
     * the password before it's available, the output returns an empty string. We recommend that you wait up to 15
     * minutes after launching an instance before trying to retrieve the generated password.
     * </p>
     * 
     * @param getPasswordDataRequest
     *        Contains the parameters for GetPasswordData.
     * @return A Java Future containing the result of the GetPasswordData operation returned by the service.
     * @sample AmazonEC2Async.GetPasswordData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetPasswordData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest getPasswordDataRequest);

    /**
     * <p>
     * Retrieves the encrypted administrator password for a running Windows instance.
     * </p>
     * <p>
     * The Windows password is generated at boot by the <code>EC2Config</code> service or <code>EC2Launch</code> scripts
     * (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/UsingConfig_WinAMI.html">EC2Config</a> and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2launch.html">EC2Launch</a> in the Amazon Elastic
     * Compute Cloud User Guide.
     * </p>
     * <p>
     * For the <code>EC2Config</code> service, the password is not generated for rebundled AMIs unless
     * <code>Ec2SetPassword</code> is enabled before bundling.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when you launched the instance. You must provide
     * the corresponding key pair file.
     * </p>
     * <p>
     * When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve
     * the password before it's available, the output returns an empty string. We recommend that you wait up to 15
     * minutes after launching an instance before trying to retrieve the generated password.
     * </p>
     * 
     * @param getPasswordDataRequest
     *        Contains the parameters for GetPasswordData.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPasswordData operation returned by the service.
     * @sample AmazonEC2AsyncHandler.GetPasswordData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetPasswordData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest getPasswordDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetPasswordDataRequest, GetPasswordDataResult> asyncHandler);

    /**
     * <p>
     * Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for
     * a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response.
     * Use <a>AcceptReservedInstancesExchangeQuote</a> to perform the exchange.
     * </p>
     * 
     * @param getReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for GetReservedInstanceExchangeQuote.
     * @return A Java Future containing the result of the GetReservedInstancesExchangeQuote operation returned by the
     *         service.
     * @sample AmazonEC2Async.GetReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            GetReservedInstancesExchangeQuoteRequest getReservedInstancesExchangeQuoteRequest);

    /**
     * <p>
     * Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for
     * a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response.
     * Use <a>AcceptReservedInstancesExchangeQuote</a> to perform the exchange.
     * </p>
     * 
     * @param getReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for GetReservedInstanceExchangeQuote.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReservedInstancesExchangeQuote operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.GetReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            GetReservedInstancesExchangeQuoteRequest getReservedInstancesExchangeQuoteRequest,
            com.amazonaws.handlers.AsyncHandler<GetReservedInstancesExchangeQuoteRequest, GetReservedInstancesExchangeQuoteResult> asyncHandler);

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
     * @return A Java Future containing the result of the ImportImage operation returned by the service.
     * @sample AmazonEC2Async.ImportImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportImageResult> importImageAsync(ImportImageRequest importImageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ImportImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportImageResult> importImageAsync(ImportImageRequest importImageRequest,
            com.amazonaws.handlers.AsyncHandler<ImportImageRequest, ImportImageResult> asyncHandler);

    /**
     * Simplified method form for invoking the ImportImage operation.
     *
     * @see #importImageAsync(ImportImageRequest)
     */
    java.util.concurrent.Future<ImportImageResult> importImageAsync();

    /**
     * Simplified method form for invoking the ImportImage operation with an AsyncHandler.
     *
     * @see #importImageAsync(ImportImageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ImportImageResult> importImageAsync(com.amazonaws.handlers.AsyncHandler<ImportImageRequest, ImportImageResult> asyncHandler);

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
     * @return A Java Future containing the result of the ImportInstance operation returned by the service.
     * @sample AmazonEC2Async.ImportInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportInstanceResult> importInstanceAsync(ImportInstanceRequest importInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportInstance operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ImportInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportInstanceResult> importInstanceAsync(ImportInstanceRequest importInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<ImportInstanceRequest, ImportInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonEC2Async.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler);

    /**
     * <p>
     * Imports a disk into an EBS snapshot.
     * </p>
     * 
     * @param importSnapshotRequest
     *        Contains the parameters for ImportSnapshot.
     * @return A Java Future containing the result of the ImportSnapshot operation returned by the service.
     * @sample AmazonEC2Async.ImportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(ImportSnapshotRequest importSnapshotRequest);

    /**
     * <p>
     * Imports a disk into an EBS snapshot.
     * </p>
     * 
     * @param importSnapshotRequest
     *        Contains the parameters for ImportSnapshot.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportSnapshot operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ImportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(ImportSnapshotRequest importSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<ImportSnapshotRequest, ImportSnapshotResult> asyncHandler);

    /**
     * Simplified method form for invoking the ImportSnapshot operation.
     *
     * @see #importSnapshotAsync(ImportSnapshotRequest)
     */
    java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync();

    /**
     * Simplified method form for invoking the ImportSnapshot operation with an AsyncHandler.
     *
     * @see #importSnapshotAsync(ImportSnapshotRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(
            com.amazonaws.handlers.AsyncHandler<ImportSnapshotRequest, ImportSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the ImportVolume operation returned by the service.
     * @sample AmazonEC2Async.ImportVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportVolumeResult> importVolumeAsync(ImportVolumeRequest importVolumeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportVolume operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ImportVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportVolumeResult> importVolumeAsync(ImportVolumeRequest importVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<ImportVolumeRequest, ImportVolumeResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param modifyFpgaImageAttributeRequest
     * @return A Java Future containing the result of the ModifyFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2Async.ModifyFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyFpgaImageAttributeResult> modifyFpgaImageAttributeAsync(ModifyFpgaImageAttributeRequest modifyFpgaImageAttributeRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param modifyFpgaImageAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyFpgaImageAttributeResult> modifyFpgaImageAttributeAsync(ModifyFpgaImageAttributeRequest modifyFpgaImageAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyFpgaImageAttributeRequest, ModifyFpgaImageAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyHosts operation returned by the service.
     * @sample AmazonEC2Async.ModifyHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(ModifyHostsRequest modifyHostsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyHosts operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(ModifyHostsRequest modifyHostsRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyHostsRequest, ModifyHostsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyIdFormat operation returned by the service.
     * @sample AmazonEC2Async.ModifyIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(ModifyIdFormatRequest modifyIdFormatRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyIdFormat operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(ModifyIdFormatRequest modifyIdFormatRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyIdFormatRequest, ModifyIdFormatResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2Async.ModifyIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdentityIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(ModifyIdentityIdFormatRequest modifyIdentityIdFormatRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdentityIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(ModifyIdentityIdFormatRequest modifyIdentityIdFormatRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyIdentityIdFormatRequest, ModifyIdentityIdFormatResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use
     * the <code>Attribute</code> parameter to specify the attribute or one of the following parameters:
     * <code>Description</code>, <code>LaunchPermission</code>, or <code>ProductCode</code>.
     * </p>
     * <p>
     * AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made
     * public.
     * </p>
     * <p>
     * To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance
     * and create an AMI from the instance.
     * </p>
     * 
     * @param modifyImageAttributeRequest
     *        Contains the parameters for ModifyImageAttribute.
     * @return A Java Future containing the result of the ModifyImageAttribute operation returned by the service.
     * @sample AmazonEC2Async.ModifyImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(ModifyImageAttributeRequest modifyImageAttributeRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use
     * the <code>Attribute</code> parameter to specify the attribute or one of the following parameters:
     * <code>Description</code>, <code>LaunchPermission</code>, or <code>ProductCode</code>.
     * </p>
     * <p>
     * AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made
     * public.
     * </p>
     * <p>
     * To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance
     * and create an AMI from the instance.
     * </p>
     * 
     * @param modifyImageAttributeRequest
     *        Contains the parameters for ModifyImageAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyImageAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(ModifyImageAttributeRequest modifyImageAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyImageAttributeRequest, ModifyImageAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyInstanceAttribute operation returned by the service.
     * @sample AmazonEC2Async.ModifyInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyInstanceAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceAttributeRequest, ModifyInstanceAttributeResult> asyncHandler);

    /**
     * <p>
     * Modifies the credit option for CPU usage on a running or stopped T2 instance. The credit options are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/t2-instances.html">T2
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceCreditSpecificationRequest
     * @return A Java Future containing the result of the ModifyInstanceCreditSpecification operation returned by the
     *         service.
     * @sample AmazonEC2Async.ModifyInstanceCreditSpecification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceCreditSpecification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstanceCreditSpecificationResult> modifyInstanceCreditSpecificationAsync(
            ModifyInstanceCreditSpecificationRequest modifyInstanceCreditSpecificationRequest);

    /**
     * <p>
     * Modifies the credit option for CPU usage on a running or stopped T2 instance. The credit options are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/t2-instances.html">T2
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceCreditSpecificationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyInstanceCreditSpecification operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ModifyInstanceCreditSpecification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceCreditSpecification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstanceCreditSpecificationResult> modifyInstanceCreditSpecificationAsync(
            ModifyInstanceCreditSpecificationRequest modifyInstanceCreditSpecificationRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceCreditSpecificationRequest, ModifyInstanceCreditSpecificationResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyInstancePlacement operation returned by the service.
     * @sample AmazonEC2Async.ModifyInstancePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstancePlacement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(ModifyInstancePlacementRequest modifyInstancePlacementRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyInstancePlacement operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyInstancePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstancePlacement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(ModifyInstancePlacementRequest modifyInstancePlacementRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyInstancePlacementRequest, ModifyInstancePlacementResult> asyncHandler);

    /**
     * <p>
     * Modifies a launch template. You can specify which version of the launch template to set as the default version.
     * When launching an instance, the default version applies when a launch template version is not specified.
     * </p>
     * 
     * @param modifyLaunchTemplateRequest
     * @return A Java Future containing the result of the ModifyLaunchTemplate operation returned by the service.
     * @sample AmazonEC2Async.ModifyLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyLaunchTemplateResult> modifyLaunchTemplateAsync(ModifyLaunchTemplateRequest modifyLaunchTemplateRequest);

    /**
     * <p>
     * Modifies a launch template. You can specify which version of the launch template to set as the default version.
     * When launching an instance, the default version applies when a launch template version is not specified.
     * </p>
     * 
     * @param modifyLaunchTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyLaunchTemplate operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyLaunchTemplateResult> modifyLaunchTemplateAsync(ModifyLaunchTemplateRequest modifyLaunchTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyLaunchTemplateRequest, ModifyLaunchTemplateResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param modifyNetworkInterfaceAttributeRequest
     *        Contains the parameters for ModifyNetworkInterfaceAttribute.
     * @return A Java Future containing the result of the ModifyNetworkInterfaceAttribute operation returned by the
     *         service.
     * @sample AmazonEC2Async.ModifyNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param modifyNetworkInterfaceAttributeRequest
     *        Contains the parameters for ModifyNetworkInterfaceAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyNetworkInterfaceAttribute operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ModifyNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyNetworkInterfaceAttributeRequest, ModifyNetworkInterfaceAttributeResult> asyncHandler);

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of
     * your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone,
     * network platform, and instance type.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html">Modifying Reserved Instances</a> in
     * the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @param modifyReservedInstancesRequest
     *        Contains the parameters for ModifyReservedInstances.
     * @return A Java Future containing the result of the ModifyReservedInstances operation returned by the service.
     * @sample AmazonEC2Async.ModifyReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest modifyReservedInstancesRequest);

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of
     * your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone,
     * network platform, and instance type.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html">Modifying Reserved Instances</a> in
     * the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @param modifyReservedInstancesRequest
     *        Contains the parameters for ModifyReservedInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReservedInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest modifyReservedInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReservedInstancesRequest, ModifyReservedInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifySnapshotAttribute operation returned by the service.
     * @sample AmazonEC2Async.ModifySnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifySnapshotAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifySnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifySnapshotAttributeRequest, ModifySnapshotAttributeResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified Spot Fleet request.
     * </p>
     * <p>
     * While the Spot Fleet request is being modified, it is in the <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances
     * according to the allocation strategy for the Spot Fleet request. If the allocation strategy is
     * <code>lowestPrice</code>, the Spot Fleet launches instances using the Spot pool with the lowest price. If the
     * allocation strategy is <code>diversified</code>, the Spot Fleet distributes the instances across the Spot pools.
     * </p>
     * <p>
     * To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that
     * exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of
     * the fleet no longer exceeds the new target capacity. If the allocation strategy is <code>lowestPrice</code>, the
     * Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is
     * <code>diversified</code>, the Spot Fleet terminates instances across the Spot pools. Alternatively, you can
     * request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are
     * interrupted or that you terminate manually.
     * </p>
     * <p>
     * If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to
     * 0.
     * </p>
     * 
     * @param modifySpotFleetRequestRequest
     *        Contains the parameters for ModifySpotFleetRequest.
     * @return A Java Future containing the result of the ModifySpotFleetRequest operation returned by the service.
     * @sample AmazonEC2Async.ModifySpotFleetRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySpotFleetRequest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest);

    /**
     * <p>
     * Modifies the specified Spot Fleet request.
     * </p>
     * <p>
     * While the Spot Fleet request is being modified, it is in the <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances
     * according to the allocation strategy for the Spot Fleet request. If the allocation strategy is
     * <code>lowestPrice</code>, the Spot Fleet launches instances using the Spot pool with the lowest price. If the
     * allocation strategy is <code>diversified</code>, the Spot Fleet distributes the instances across the Spot pools.
     * </p>
     * <p>
     * To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that
     * exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of
     * the fleet no longer exceeds the new target capacity. If the allocation strategy is <code>lowestPrice</code>, the
     * Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is
     * <code>diversified</code>, the Spot Fleet terminates instances across the Spot pools. Alternatively, you can
     * request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are
     * interrupted or that you terminate manually.
     * </p>
     * <p>
     * If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to
     * 0.
     * </p>
     * 
     * @param modifySpotFleetRequestRequest
     *        Contains the parameters for ModifySpotFleetRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifySpotFleetRequest operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifySpotFleetRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySpotFleetRequest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest,
            com.amazonaws.handlers.AsyncHandler<ModifySpotFleetRequestRequest, ModifySpotFleetRequestResult> asyncHandler);

    /**
     * <p>
     * Modifies a subnet attribute. You can only modify one attribute at a time.
     * </p>
     * 
     * @param modifySubnetAttributeRequest
     *        Contains the parameters for ModifySubnetAttribute.
     * @return A Java Future containing the result of the ModifySubnetAttribute operation returned by the service.
     * @sample AmazonEC2Async.ModifySubnetAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySubnetAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(ModifySubnetAttributeRequest modifySubnetAttributeRequest);

    /**
     * <p>
     * Modifies a subnet attribute. You can only modify one attribute at a time.
     * </p>
     * 
     * @param modifySubnetAttributeRequest
     *        Contains the parameters for ModifySubnetAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifySubnetAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifySubnetAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySubnetAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(ModifySubnetAttributeRequest modifySubnetAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifySubnetAttributeRequest, ModifySubnetAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyVolume operation returned by the service.
     * @sample AmazonEC2Async.ModifyVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVolumeResult> modifyVolumeAsync(ModifyVolumeRequest modifyVolumeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVolume operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVolumeResult> modifyVolumeAsync(ModifyVolumeRequest modifyVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVolumeRequest, ModifyVolumeResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyVolumeAttribute operation returned by the service.
     * @sample AmazonEC2Async.ModifyVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolumeAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVolumeAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolumeAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVolumeAttributeRequest, ModifyVolumeAttributeResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     * 
     * @param modifyVpcAttributeRequest
     *        Contains the parameters for ModifyVpcAttribute.
     * @return A Java Future containing the result of the ModifyVpcAttribute operation returned by the service.
     * @sample AmazonEC2Async.ModifyVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(ModifyVpcAttributeRequest modifyVpcAttributeRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     * 
     * @param modifyVpcAttributeRequest
     *        Contains the parameters for ModifyVpcAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVpcAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(ModifyVpcAttributeRequest modifyVpcAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcAttributeRequest, ModifyVpcAttributeResult> asyncHandler);

    /**
     * <p>
     * Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC
     * endpoint (interface or gateway). For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-endpoints.html">VPC Endpoints</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcEndpointRequest
     *        Contains the parameters for ModifyVpcEndpoint.
     * @return A Java Future containing the result of the ModifyVpcEndpoint operation returned by the service.
     * @sample AmazonEC2Async.ModifyVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(ModifyVpcEndpointRequest modifyVpcEndpointRequest);

    /**
     * <p>
     * Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC
     * endpoint (interface or gateway). For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-endpoints.html">VPC Endpoints</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcEndpointRequest
     *        Contains the parameters for ModifyVpcEndpoint.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVpcEndpoint operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(ModifyVpcEndpointRequest modifyVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointRequest, ModifyVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the
     * notification, or the events for which to be notified.
     * </p>
     * 
     * @param modifyVpcEndpointConnectionNotificationRequest
     * @return A Java Future containing the result of the ModifyVpcEndpointConnectionNotification operation returned by
     *         the service.
     * @sample AmazonEC2Async.ModifyVpcEndpointConnectionNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointConnectionNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointConnectionNotificationResult> modifyVpcEndpointConnectionNotificationAsync(
            ModifyVpcEndpointConnectionNotificationRequest modifyVpcEndpointConnectionNotificationRequest);

    /**
     * <p>
     * Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the
     * notification, or the events for which to be notified.
     * </p>
     * 
     * @param modifyVpcEndpointConnectionNotificationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVpcEndpointConnectionNotification operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.ModifyVpcEndpointConnectionNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointConnectionNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointConnectionNotificationResult> modifyVpcEndpointConnectionNotificationAsync(
            ModifyVpcEndpointConnectionNotificationRequest modifyVpcEndpointConnectionNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointConnectionNotificationRequest, ModifyVpcEndpointConnectionNotificationResult> asyncHandler);

    /**
     * <p>
     * Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for
     * your service, and you can specify whether acceptance is required for requests to connect to your endpoint service
     * through an interface VPC endpoint.
     * </p>
     * 
     * @param modifyVpcEndpointServiceConfigurationRequest
     * @return A Java Future containing the result of the ModifyVpcEndpointServiceConfiguration operation returned by
     *         the service.
     * @sample AmazonEC2Async.ModifyVpcEndpointServiceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointServiceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointServiceConfigurationResult> modifyVpcEndpointServiceConfigurationAsync(
            ModifyVpcEndpointServiceConfigurationRequest modifyVpcEndpointServiceConfigurationRequest);

    /**
     * <p>
     * Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for
     * your service, and you can specify whether acceptance is required for requests to connect to your endpoint service
     * through an interface VPC endpoint.
     * </p>
     * 
     * @param modifyVpcEndpointServiceConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVpcEndpointServiceConfiguration operation returned by
     *         the service.
     * @sample AmazonEC2AsyncHandler.ModifyVpcEndpointServiceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointServiceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointServiceConfigurationResult> modifyVpcEndpointServiceConfigurationAsync(
            ModifyVpcEndpointServiceConfigurationRequest modifyVpcEndpointServiceConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointServiceConfigurationRequest, ModifyVpcEndpointServiceConfigurationResult> asyncHandler);

    /**
     * <p>
     * Modifies the permissions for your <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/endpoint-service.html">VPC endpoint service</a>. You
     * can add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your
     * endpoint service.
     * </p>
     * 
     * @param modifyVpcEndpointServicePermissionsRequest
     * @return A Java Future containing the result of the ModifyVpcEndpointServicePermissions operation returned by the
     *         service.
     * @sample AmazonEC2Async.ModifyVpcEndpointServicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointServicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointServicePermissionsResult> modifyVpcEndpointServicePermissionsAsync(
            ModifyVpcEndpointServicePermissionsRequest modifyVpcEndpointServicePermissionsRequest);

    /**
     * <p>
     * Modifies the permissions for your <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/endpoint-service.html">VPC endpoint service</a>. You
     * can add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your
     * endpoint service.
     * </p>
     * 
     * @param modifyVpcEndpointServicePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVpcEndpointServicePermissions operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ModifyVpcEndpointServicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointServicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcEndpointServicePermissionsResult> modifyVpcEndpointServicePermissionsAsync(
            ModifyVpcEndpointServicePermissionsRequest modifyVpcEndpointServicePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointServicePermissionsRequest, ModifyVpcEndpointServicePermissionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyVpcPeeringConnectionOptions operation returned by the
     *         service.
     * @sample AmazonEC2Async.ModifyVpcPeeringConnectionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcPeeringConnectionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            ModifyVpcPeeringConnectionOptionsRequest modifyVpcPeeringConnectionOptionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVpcPeeringConnectionOptions operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ModifyVpcPeeringConnectionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcPeeringConnectionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            ModifyVpcPeeringConnectionOptionsRequest modifyVpcPeeringConnectionOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcPeeringConnectionOptionsRequest, ModifyVpcPeeringConnectionOptionsResult> asyncHandler);

    /**
     * <p>
     * Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a
     * VPC to <code>default</code> only. You cannot change the instance tenancy attribute to <code>dedicated</code>.
     * </p>
     * <p>
     * After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of
     * <code>default</code>, unless you specify otherwise during launch. The tenancy of any existing instances in the
     * VPC is not affected.
     * </p>
     * <p>
     * For more information about Dedicated Instances, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcTenancyRequest
     *        Contains the parameters for ModifyVpcTenancy.
     * @return A Java Future containing the result of the ModifyVpcTenancy operation returned by the service.
     * @sample AmazonEC2Async.ModifyVpcTenancy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcTenancy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcTenancyResult> modifyVpcTenancyAsync(ModifyVpcTenancyRequest modifyVpcTenancyRequest);

    /**
     * <p>
     * Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a
     * VPC to <code>default</code> only. You cannot change the instance tenancy attribute to <code>dedicated</code>.
     * </p>
     * <p>
     * After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of
     * <code>default</code>, unless you specify otherwise during launch. The tenancy of any existing instances in the
     * VPC is not affected.
     * </p>
     * <p>
     * For more information about Dedicated Instances, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcTenancyRequest
     *        Contains the parameters for ModifyVpcTenancy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyVpcTenancy operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ModifyVpcTenancy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcTenancy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyVpcTenancyResult> modifyVpcTenancyAsync(ModifyVpcTenancyRequest modifyVpcTenancyRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcTenancyRequest, ModifyVpcTenancyResult> asyncHandler);

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
     * @return A Java Future containing the result of the MonitorInstances operation returned by the service.
     * @sample AmazonEC2Async.MonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest monitorInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MonitorInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.MonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest monitorInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<MonitorInstancesRequest, MonitorInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the MoveAddressToVpc operation returned by the service.
     * @sample AmazonEC2Async.MoveAddressToVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MoveAddressToVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(MoveAddressToVpcRequest moveAddressToVpcRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MoveAddressToVpc operation returned by the service.
     * @sample AmazonEC2AsyncHandler.MoveAddressToVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MoveAddressToVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(MoveAddressToVpcRequest moveAddressToVpcRequest,
            com.amazonaws.handlers.AsyncHandler<MoveAddressToVpcRequest, MoveAddressToVpcResult> asyncHandler);

    /**
     * <p>
     * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active
     * Dedicated Hosts in your account before you purchase a reservation. This action results in the specified
     * reservation being purchased and charged to your account.
     * </p>
     * 
     * @param purchaseHostReservationRequest
     * @return A Java Future containing the result of the PurchaseHostReservation operation returned by the service.
     * @sample AmazonEC2Async.PurchaseHostReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseHostReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(PurchaseHostReservationRequest purchaseHostReservationRequest);

    /**
     * <p>
     * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active
     * Dedicated Hosts in your account before you purchase a reservation. This action results in the specified
     * reservation being purchased and charged to your account.
     * </p>
     * 
     * @param purchaseHostReservationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseHostReservation operation returned by the service.
     * @sample AmazonEC2AsyncHandler.PurchaseHostReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseHostReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(PurchaseHostReservationRequest purchaseHostReservationRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseHostReservationRequest, PurchaseHostReservationResult> asyncHandler);

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
     * @return A Java Future containing the result of the PurchaseReservedInstancesOffering operation returned by the
     *         service.
     * @sample AmazonEC2Async.PurchaseReservedInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseReservedInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseReservedInstancesOffering operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.PurchaseReservedInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseReservedInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedInstancesOfferingRequest, PurchaseReservedInstancesOfferingResult> asyncHandler);

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
     * @return A Java Future containing the result of the PurchaseScheduledInstances operation returned by the service.
     * @sample AmazonEC2Async.PurchaseScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(
            PurchaseScheduledInstancesRequest purchaseScheduledInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseScheduledInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.PurchaseScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(
            PurchaseScheduledInstancesRequest purchaseScheduledInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseScheduledInstancesRequest, PurchaseScheduledInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RebootInstances operation returned by the service.
     * @sample AmazonEC2Async.RebootInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RebootInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(RebootInstancesRequest rebootInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RebootInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RebootInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(RebootInstancesRequest rebootInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<RebootInstancesRequest, RebootInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterImage operation returned by the service.
     * @sample AmazonEC2Async.RegisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RegisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterImageResult> registerImageAsync(RegisterImageRequest registerImageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterImage operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RegisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RegisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterImageResult> registerImageAsync(RegisterImageRequest registerImageRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterImageRequest, RegisterImageResult> asyncHandler);

    /**
     * <p>
     * Rejects one or more VPC endpoint connection requests to your VPC endpoint service.
     * </p>
     * 
     * @param rejectVpcEndpointConnectionsRequest
     * @return A Java Future containing the result of the RejectVpcEndpointConnections operation returned by the
     *         service.
     * @sample AmazonEC2Async.RejectVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectVpcEndpointConnectionsResult> rejectVpcEndpointConnectionsAsync(
            RejectVpcEndpointConnectionsRequest rejectVpcEndpointConnectionsRequest);

    /**
     * <p>
     * Rejects one or more VPC endpoint connection requests to your VPC endpoint service.
     * </p>
     * 
     * @param rejectVpcEndpointConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectVpcEndpointConnections operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.RejectVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectVpcEndpointConnectionsResult> rejectVpcEndpointConnectionsAsync(
            RejectVpcEndpointConnectionsRequest rejectVpcEndpointConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<RejectVpcEndpointConnectionsRequest, RejectVpcEndpointConnectionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the RejectVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2Async.RejectVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(
            RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RejectVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(
            RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<RejectVpcPeeringConnectionRequest, RejectVpcPeeringConnectionResult> asyncHandler);

    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that
     * it's associated with. To disassociate an Elastic IP address without releasing it, use <a>DisassociateAddress</a>.
     * </p>
     * <p>
     * [Nondefault VPC] You must use <a>DisassociateAddress</a> to disassociate the Elastic IP address before you can
     * release it. Otherwise, Amazon EC2 returns an error (<code>InvalidIPAddress.InUse</code>).
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records
     * and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address
     * that you already released, you'll get an <code>AuthFailure</code> error if the address is already allocated to
     * another AWS account.
     * </p>
     * <p>
     * [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more
     * information, see <a>AllocateAddress</a>.
     * </p>
     * 
     * @param releaseAddressRequest
     *        Contains the parameters for ReleaseAddress.
     * @return A Java Future containing the result of the ReleaseAddress operation returned by the service.
     * @sample AmazonEC2Async.ReleaseAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(ReleaseAddressRequest releaseAddressRequest);

    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that
     * it's associated with. To disassociate an Elastic IP address without releasing it, use <a>DisassociateAddress</a>.
     * </p>
     * <p>
     * [Nondefault VPC] You must use <a>DisassociateAddress</a> to disassociate the Elastic IP address before you can
     * release it. Otherwise, Amazon EC2 returns an error (<code>InvalidIPAddress.InUse</code>).
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records
     * and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address
     * that you already released, you'll get an <code>AuthFailure</code> error if the address is already allocated to
     * another AWS account.
     * </p>
     * <p>
     * [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more
     * information, see <a>AllocateAddress</a>.
     * </p>
     * 
     * @param releaseAddressRequest
     *        Contains the parameters for ReleaseAddress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleaseAddress operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ReleaseAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(ReleaseAddressRequest releaseAddressRequest,
            com.amazonaws.handlers.AsyncHandler<ReleaseAddressRequest, ReleaseAddressResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReleaseHosts operation returned by the service.
     * @sample AmazonEC2Async.ReleaseHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(ReleaseHostsRequest releaseHostsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleaseHosts operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ReleaseHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseHosts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(ReleaseHostsRequest releaseHostsRequest,
            com.amazonaws.handlers.AsyncHandler<ReleaseHostsRequest, ReleaseHostsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReplaceIamInstanceProfileAssociation operation returned by the
     *         service.
     * @sample AmazonEC2Async.ReplaceIamInstanceProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceIamInstanceProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplaceIamInstanceProfileAssociationResult> replaceIamInstanceProfileAssociationAsync(
            ReplaceIamInstanceProfileAssociationRequest replaceIamInstanceProfileAssociationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplaceIamInstanceProfileAssociation operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ReplaceIamInstanceProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceIamInstanceProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplaceIamInstanceProfileAssociationResult> replaceIamInstanceProfileAssociationAsync(
            ReplaceIamInstanceProfileAssociationRequest replaceIamInstanceProfileAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<ReplaceIamInstanceProfileAssociationRequest, ReplaceIamInstanceProfileAssociationResult> asyncHandler);

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically
     * associated with the default network ACL. For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * This is an idempotent operation.
     * </p>
     * 
     * @param replaceNetworkAclAssociationRequest
     *        Contains the parameters for ReplaceNetworkAclAssociation.
     * @return A Java Future containing the result of the ReplaceNetworkAclAssociation operation returned by the
     *         service.
     * @sample AmazonEC2Async.ReplaceNetworkAclAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(
            ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest);

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically
     * associated with the default network ACL. For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * This is an idempotent operation.
     * </p>
     * 
     * @param replaceNetworkAclAssociationRequest
     *        Contains the parameters for ReplaceNetworkAclAssociation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplaceNetworkAclAssociation operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ReplaceNetworkAclAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(
            ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclAssociationRequest, ReplaceNetworkAclAssociationResult> asyncHandler);

    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceNetworkAclEntryRequest
     *        Contains the parameters for ReplaceNetworkAclEntry.
     * @return A Java Future containing the result of the ReplaceNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2Async.ReplaceNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest);

    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information about network ACLs, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceNetworkAclEntryRequest
     *        Contains the parameters for ReplaceNetworkAclEntry.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplaceNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ReplaceNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest,
            com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclEntryRequest, ReplaceNetworkAclEntryResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReplaceRoute operation returned by the service.
     * @sample AmazonEC2Async.ReplaceRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(ReplaceRouteRequest replaceRouteRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplaceRoute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ReplaceRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(ReplaceRouteRequest replaceRouteRequest,
            com.amazonaws.handlers.AsyncHandler<ReplaceRouteRequest, ReplaceRouteResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReplaceRouteTableAssociation operation returned by the
     *         service.
     * @sample AmazonEC2Async.ReplaceRouteTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRouteTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(
            ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplaceRouteTableAssociation operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ReplaceRouteTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRouteTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(
            ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<ReplaceRouteTableAssociationRequest, ReplaceRouteTableAssociationResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReportInstanceStatus operation returned by the service.
     * @sample AmazonEC2Async.ReportInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReportInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(ReportInstanceStatusRequest reportInstanceStatusRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReportInstanceStatus operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ReportInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReportInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(ReportInstanceStatusRequest reportInstanceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ReportInstanceStatusRequest, ReportInstanceStatusResult> asyncHandler);

    /**
     * <p>
     * Creates a Spot Fleet request.
     * </p>
     * <p>
     * You can submit a single request that includes multiple launch specifications that vary by instance type, AMI,
     * Availability Zone, or subnet.
     * </p>
     * <p>
     * By default, the Spot Fleet requests Spot Instances in the Spot pool where the price per unit is the lowest. Each
     * launch specification can include its own instance weighting that reflects the value of the instance type to your
     * application workload.
     * </p>
     * <p>
     * Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included
     * in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools,
     * you can improve the availability of your fleet.
     * </p>
     * <p>
     * You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request; only
     * the <code>instance</code> resource type is supported.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html">Spot Fleet Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param requestSpotFleetRequest
     *        Contains the parameters for RequestSpotFleet.
     * @return A Java Future containing the result of the RequestSpotFleet operation returned by the service.
     * @sample AmazonEC2Async.RequestSpotFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(RequestSpotFleetRequest requestSpotFleetRequest);

    /**
     * <p>
     * Creates a Spot Fleet request.
     * </p>
     * <p>
     * You can submit a single request that includes multiple launch specifications that vary by instance type, AMI,
     * Availability Zone, or subnet.
     * </p>
     * <p>
     * By default, the Spot Fleet requests Spot Instances in the Spot pool where the price per unit is the lowest. Each
     * launch specification can include its own instance weighting that reflects the value of the instance type to your
     * application workload.
     * </p>
     * <p>
     * Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included
     * in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools,
     * you can improve the availability of your fleet.
     * </p>
     * <p>
     * You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request; only
     * the <code>instance</code> resource type is supported.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html">Spot Fleet Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param requestSpotFleetRequest
     *        Contains the parameters for RequestSpotFleet.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestSpotFleet operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RequestSpotFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(RequestSpotFleetRequest requestSpotFleetRequest,
            com.amazonaws.handlers.AsyncHandler<RequestSpotFleetRequest, RequestSpotFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a Spot Instance request. Spot Instances are instances that Amazon EC2 launches when the maximum price
     * that you specify exceeds the current Spot price. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param requestSpotInstancesRequest
     *        Contains the parameters for RequestSpotInstances.
     * @return A Java Future containing the result of the RequestSpotInstances operation returned by the service.
     * @sample AmazonEC2Async.RequestSpotInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest requestSpotInstancesRequest);

    /**
     * <p>
     * Creates a Spot Instance request. Spot Instances are instances that Amazon EC2 launches when the maximum price
     * that you specify exceeds the current Spot price. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot Instance Requests</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param requestSpotInstancesRequest
     *        Contains the parameters for RequestSpotInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestSpotInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RequestSpotInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest requestSpotInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<RequestSpotInstancesRequest, RequestSpotInstancesResult> asyncHandler);

    /**
     * <p>
     * Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset
     * the load permission attribute.
     * </p>
     * 
     * @param resetFpgaImageAttributeRequest
     * @return A Java Future containing the result of the ResetFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2Async.ResetFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResetFpgaImageAttributeResult> resetFpgaImageAttributeAsync(ResetFpgaImageAttributeRequest resetFpgaImageAttributeRequest);

    /**
     * <p>
     * Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset
     * the load permission attribute.
     * </p>
     * 
     * @param resetFpgaImageAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ResetFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResetFpgaImageAttributeResult> resetFpgaImageAttributeAsync(ResetFpgaImageAttributeRequest resetFpgaImageAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ResetFpgaImageAttributeRequest, ResetFpgaImageAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the ResetImageAttribute operation returned by the service.
     * @sample AmazonEC2Async.ResetImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(ResetImageAttributeRequest resetImageAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetImageAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ResetImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(ResetImageAttributeRequest resetImageAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ResetImageAttributeRequest, ResetImageAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the ResetInstanceAttribute operation returned by the service.
     * @sample AmazonEC2Async.ResetInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetInstanceAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(ResetInstanceAttributeRequest resetInstanceAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetInstanceAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ResetInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetInstanceAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(ResetInstanceAttributeRequest resetInstanceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ResetInstanceAttributeRequest, ResetInstanceAttributeResult> asyncHandler);

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param resetNetworkInterfaceAttributeRequest
     *        Contains the parameters for ResetNetworkInterfaceAttribute.
     * @return A Java Future containing the result of the ResetNetworkInterfaceAttribute operation returned by the
     *         service.
     * @sample AmazonEC2Async.ResetNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(
            ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param resetNetworkInterfaceAttributeRequest
     *        Contains the parameters for ResetNetworkInterfaceAttribute.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetNetworkInterfaceAttribute operation returned by the
     *         service.
     * @sample AmazonEC2AsyncHandler.ResetNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(
            ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ResetNetworkInterfaceAttributeRequest, ResetNetworkInterfaceAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the ResetSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2Async.ResetSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetSnapshotAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2AsyncHandler.ResetSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetSnapshotAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ResetSnapshotAttributeRequest, ResetSnapshotAttributeResult> asyncHandler);

    /**
     * <p>
     * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic
     * platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP
     * address must not be associated with an instance or network interface.
     * </p>
     * 
     * @param restoreAddressToClassicRequest
     *        Contains the parameters for RestoreAddressToClassic.
     * @return A Java Future containing the result of the RestoreAddressToClassic operation returned by the service.
     * @sample AmazonEC2Async.RestoreAddressToClassic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RestoreAddressToClassic" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(RestoreAddressToClassicRequest restoreAddressToClassicRequest);

    /**
     * <p>
     * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic
     * platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP
     * address must not be associated with an instance or network interface.
     * </p>
     * 
     * @param restoreAddressToClassicRequest
     *        Contains the parameters for RestoreAddressToClassic.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreAddressToClassic operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RestoreAddressToClassic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RestoreAddressToClassic" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(RestoreAddressToClassicRequest restoreAddressToClassicRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreAddressToClassicRequest, RestoreAddressToClassicResult> asyncHandler);

    /**
     * <p>
     * [EC2-VPC only] Removes one or more egress rules from a security group for EC2-VPC. This action doesn't apply to
     * security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must
     * match the existing rule's values exactly.
     * </p>
     * <p>
     * Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP
     * protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also
     * specify the ICMP type and code. If the security group rule has a description, you do not have to specify the
     * description to revoke the rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupEgressRequest
     *        Contains the parameters for RevokeSecurityGroupEgress.
     * @return A Java Future containing the result of the RevokeSecurityGroupEgress operation returned by the service.
     * @sample AmazonEC2Async.RevokeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupEgress" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(
            RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest);

    /**
     * <p>
     * [EC2-VPC only] Removes one or more egress rules from a security group for EC2-VPC. This action doesn't apply to
     * security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must
     * match the existing rule's values exactly.
     * </p>
     * <p>
     * Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP
     * protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also
     * specify the ICMP type and code. If the security group rule has a description, you do not have to specify the
     * description to revoke the rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupEgressRequest
     *        Contains the parameters for RevokeSecurityGroupEgress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeSecurityGroupEgress operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RevokeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupEgress" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(
            RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupEgressRequest, RevokeSecurityGroupEgressResult> asyncHandler);

    /**
     * <p>
     * Removes one or more ingress rules from a security group. To remove a rule, the values that you specify (for
     * example, ports) must match the existing rule's values exactly.
     * </p>
     * <note>
     * <p>
     * [EC2-Classic security groups only] If the values you specify do not match the existing rule's values, no error is
     * returned. Use <a>DescribeSecurityGroups</a> to verify that the rule has been removed.
     * </p>
     * </note>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols,
     * you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the
     * ICMP type and code. If the security group rule has a description, you do not have to specify the description to
     * revoke the rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupIngressRequest
     *        Contains the parameters for RevokeSecurityGroupIngress.
     * @return A Java Future containing the result of the RevokeSecurityGroupIngress operation returned by the service.
     * @sample AmazonEC2Async.RevokeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupIngress" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(
            RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest);

    /**
     * <p>
     * Removes one or more ingress rules from a security group. To remove a rule, the values that you specify (for
     * example, ports) must match the existing rule's values exactly.
     * </p>
     * <note>
     * <p>
     * [EC2-Classic security groups only] If the values you specify do not match the existing rule's values, no error is
     * returned. Use <a>DescribeSecurityGroups</a> to verify that the rule has been removed.
     * </p>
     * </note>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols,
     * you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the
     * ICMP type and code. If the security group rule has a description, you do not have to specify the description to
     * revoke the rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupIngressRequest
     *        Contains the parameters for RevokeSecurityGroupIngress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeSecurityGroupIngress operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RevokeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupIngress" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(
            RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult> asyncHandler);

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest)
     */
    @Deprecated
    java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync();

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation with an AsyncHandler.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Deprecated
    java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(
            com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult> asyncHandler);

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
     * You can create a <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">launch
     * template</a>, which is a resource that contains the parameters to launch an instance. When you launch an instance
     * using <a>RunInstances</a>, you can specify the launch template instead of specifying the launch parameters.
     * </p>
     * <p>
     * To ensure faster instance launches, break up large requests into smaller batches. For example, create five
     * separate launch requests for 100 instances each instead of one launch request for 500 instances.
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
     * @return A Java Future containing the result of the RunInstances operation returned by the service.
     * @sample AmazonEC2Async.RunInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest runInstancesRequest);

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
     * You can create a <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">launch
     * template</a>, which is a resource that contains the parameters to launch an instance. When you launch an instance
     * using <a>RunInstances</a>, you can specify the launch template instead of specifying the launch parameters.
     * </p>
     * <p>
     * To ensure faster instance launches, break up large requests into smaller batches. For example, create five
     * separate launch requests for 100 instances each instead of one launch request for 500 instances.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RunInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RunInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest runInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<RunInstancesRequest, RunInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RunScheduledInstances operation returned by the service.
     * @sample AmazonEC2Async.RunScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunScheduledInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(RunScheduledInstancesRequest runScheduledInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RunScheduledInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.RunScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunScheduledInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(RunScheduledInstancesRequest runScheduledInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<RunScheduledInstancesRequest, RunScheduledInstancesResult> asyncHandler);

    /**
     * <p>
     * Starts an Amazon EBS-backed instance that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance
     * is stopped, the compute resources are released and you are not billed for instance usage. However, your root
     * partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume
     * usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges
     * you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and
     * Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when
     * it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance
     * usage, and thereafter charges per second for instance usage.
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
     * @return A Java Future containing the result of the StartInstances operation returned by the service.
     * @sample AmazonEC2Async.StartInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StartInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest startInstancesRequest);

    /**
     * <p>
     * Starts an Amazon EBS-backed instance that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance
     * is stopped, the compute resources are released and you are not billed for instance usage. However, your root
     * partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume
     * usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges
     * you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and
     * Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when
     * it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance
     * usage, and thereafter charges per second for instance usage.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.StartInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StartInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest startInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstancesRequest, StartInstancesResult> asyncHandler);

    /**
     * <p>
     * Stops an Amazon EBS-backed instance.
     * </p>
     * <p>
     * We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS
     * volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time
     * you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your
     * Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if
     * you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance,
     * Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage.
     * </p>
     * <p>
     * You can't start or stop Spot Instances, and you can't stop instance store-backed instances.
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
     * @return A Java Future containing the result of the StopInstances operation returned by the service.
     * @sample AmazonEC2Async.StopInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StopInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest stopInstancesRequest);

    /**
     * <p>
     * Stops an Amazon EBS-backed instance.
     * </p>
     * <p>
     * We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS
     * volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time
     * you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your
     * Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if
     * you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance,
     * Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage.
     * </p>
     * <p>
     * You can't start or stop Spot Instances, and you can't stop instance store-backed instances.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.StopInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StopInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest stopInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<StopInstancesRequest, StopInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the TerminateInstances operation returned by the service.
     * @sample AmazonEC2Async.TerminateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TerminateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest terminateInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.TerminateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TerminateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest terminateInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateInstancesRequest, TerminateInstancesResult> asyncHandler);

    /**
     * <p>
     * Unassigns one or more IPv6 addresses from a network interface.
     * </p>
     * 
     * @param unassignIpv6AddressesRequest
     * @return A Java Future containing the result of the UnassignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2Async.UnassignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnassignIpv6AddressesResult> unassignIpv6AddressesAsync(UnassignIpv6AddressesRequest unassignIpv6AddressesRequest);

    /**
     * <p>
     * Unassigns one or more IPv6 addresses from a network interface.
     * </p>
     * 
     * @param unassignIpv6AddressesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnassignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2AsyncHandler.UnassignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnassignIpv6AddressesResult> unassignIpv6AddressesAsync(UnassignIpv6AddressesRequest unassignIpv6AddressesRequest,
            com.amazonaws.handlers.AsyncHandler<UnassignIpv6AddressesRequest, UnassignIpv6AddressesResult> asyncHandler);

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network interface.
     * </p>
     * 
     * @param unassignPrivateIpAddressesRequest
     *        Contains the parameters for UnassignPrivateIpAddresses.
     * @return A Java Future containing the result of the UnassignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2Async.UnassignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(
            UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest);

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network interface.
     * </p>
     * 
     * @param unassignPrivateIpAddressesRequest
     *        Contains the parameters for UnassignPrivateIpAddresses.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnassignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2AsyncHandler.UnassignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(
            UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<UnassignPrivateIpAddressesRequest, UnassignPrivateIpAddressesResult> asyncHandler);

    /**
     * <p>
     * Disables detailed monitoring for a running instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html">Monitoring Your Instances and
     * Volumes</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param unmonitorInstancesRequest
     *        Contains the parameters for UnmonitorInstances.
     * @return A Java Future containing the result of the UnmonitorInstances operation returned by the service.
     * @sample AmazonEC2Async.UnmonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnmonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest unmonitorInstancesRequest);

    /**
     * <p>
     * Disables detailed monitoring for a running instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html">Monitoring Your Instances and
     * Volumes</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param unmonitorInstancesRequest
     *        Contains the parameters for UnmonitorInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnmonitorInstances operation returned by the service.
     * @sample AmazonEC2AsyncHandler.UnmonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnmonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest unmonitorInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<UnmonitorInstancesRequest, UnmonitorInstancesResult> asyncHandler);

    /**
     * <p>
     * [EC2-VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing
     * description, or add a description to a rule that did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You can remove a description for a security
     * group rule by omitting the description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsEgressRequest
     *        Contains the parameters for UpdateSecurityGroupRuleDescriptionsEgress.
     * @return A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsEgress operation returned
     *         by the service.
     * @sample AmazonEC2Async.UpdateSecurityGroupRuleDescriptionsEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UpdateSecurityGroupRuleDescriptionsEgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsEgressResult> updateSecurityGroupRuleDescriptionsEgressAsync(
            UpdateSecurityGroupRuleDescriptionsEgressRequest updateSecurityGroupRuleDescriptionsEgressRequest);

    /**
     * <p>
     * [EC2-VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing
     * description, or add a description to a rule that did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You can remove a description for a security
     * group rule by omitting the description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsEgressRequest
     *        Contains the parameters for UpdateSecurityGroupRuleDescriptionsEgress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsEgress operation returned
     *         by the service.
     * @sample AmazonEC2AsyncHandler.UpdateSecurityGroupRuleDescriptionsEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UpdateSecurityGroupRuleDescriptionsEgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsEgressResult> updateSecurityGroupRuleDescriptionsEgressAsync(
            UpdateSecurityGroupRuleDescriptionsEgressRequest updateSecurityGroupRuleDescriptionsEgressRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityGroupRuleDescriptionsEgressRequest, UpdateSecurityGroupRuleDescriptionsEgressResult> asyncHandler);

    /**
     * <p>
     * Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or
     * add a description to a rule that did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You can remove a description for a security
     * group rule by omitting the description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsIngressRequest
     *        Contains the parameters for UpdateSecurityGroupRuleDescriptionsIngress.
     * @return A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsIngress operation returned
     *         by the service.
     * @sample AmazonEC2Async.UpdateSecurityGroupRuleDescriptionsIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UpdateSecurityGroupRuleDescriptionsIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsIngressResult> updateSecurityGroupRuleDescriptionsIngressAsync(
            UpdateSecurityGroupRuleDescriptionsIngressRequest updateSecurityGroupRuleDescriptionsIngressRequest);

    /**
     * <p>
     * Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or
     * add a description to a rule that did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You can remove a description for a security
     * group rule by omitting the description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsIngressRequest
     *        Contains the parameters for UpdateSecurityGroupRuleDescriptionsIngress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsIngress operation returned
     *         by the service.
     * @sample AmazonEC2AsyncHandler.UpdateSecurityGroupRuleDescriptionsIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UpdateSecurityGroupRuleDescriptionsIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsIngressResult> updateSecurityGroupRuleDescriptionsIngressAsync(
            UpdateSecurityGroupRuleDescriptionsIngressRequest updateSecurityGroupRuleDescriptionsIngressRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityGroupRuleDescriptionsIngressRequest, UpdateSecurityGroupRuleDescriptionsIngressResult> asyncHandler);

}
