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
package com.amazonaws.services.directconnect;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;

/**
 * Interface for accessing AWS Direct Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.directconnect.AbstractAmazonDirectConnectAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
 * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. With this
 * connection in place, you can create virtual interfaces directly to the AWS cloud (for example, to Amazon EC2 and
 * Amazon S3) and to Amazon VPC, bypassing Internet service providers in your network path. A connection provides access
 * to all AWS Regions except the China (Beijing) and (China) Ningxia Regions. AWS resources in the China Regions can
 * only be accessed through locations associated with those Regions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDirectConnectAsync extends AmazonDirectConnect {

    /**
     * <p>
     * Accepts a proposal request to attach a virtual private gateway to a Direct Connect gateway.
     * </p>
     * 
     * @param acceptDirectConnectGatewayAssociationProposalRequest
     * @return A Java Future containing the result of the AcceptDirectConnectGatewayAssociationProposal operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsync.AcceptDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AcceptDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptDirectConnectGatewayAssociationProposalResult> acceptDirectConnectGatewayAssociationProposalAsync(
            AcceptDirectConnectGatewayAssociationProposalRequest acceptDirectConnectGatewayAssociationProposalRequest);

    /**
     * <p>
     * Accepts a proposal request to attach a virtual private gateway to a Direct Connect gateway.
     * </p>
     * 
     * @param acceptDirectConnectGatewayAssociationProposalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptDirectConnectGatewayAssociationProposal operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.AcceptDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AcceptDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptDirectConnectGatewayAssociationProposalResult> acceptDirectConnectGatewayAssociationProposalAsync(
            AcceptDirectConnectGatewayAssociationProposalRequest acceptDirectConnectGatewayAssociationProposalRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptDirectConnectGatewayAssociationProposalRequest, AcceptDirectConnectGatewayAssociationProposalResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use <a>AllocateHostedConnection</a> instead.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified
     * interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     * @return A Java Future containing the result of the AllocateConnectionOnInterconnect operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.AllocateConnectionOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateConnectionOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest);

    /**
     * <p>
     * Deprecated. Use <a>AllocateHostedConnection</a> instead.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified
     * interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocateConnectionOnInterconnect operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.AllocateConnectionOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateConnectionOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateConnectionOnInterconnectRequest, AllocateConnectionOnInterconnectResult> asyncHandler);

    /**
     * <p>
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the
     * specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and
     * the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     * @return A Java Future containing the result of the AllocateHostedConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.AllocateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllocateHostedConnectionResult> allocateHostedConnectionAsync(AllocateHostedConnectionRequest allocateHostedConnectionRequest);

    /**
     * <p>
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the
     * specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and
     * the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocateHostedConnection operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.AllocateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllocateHostedConnectionResult> allocateHostedConnectionAsync(AllocateHostedConnectionRequest allocateHostedConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateHostedConnectionRequest, AllocateHostedConnectionResult> asyncHandler);

    /**
     * <p>
     * Provisions a private virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the owner using
     * <a>ConfirmPrivateVirtualInterface</a>. Until then, the virtual interface is in the <code>Confirming</code> state
     * and is not available to handle traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     * @return A Java Future containing the result of the AllocatePrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.AllocatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Provisions a private virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the owner using
     * <a>ConfirmPrivateVirtualInterface</a>. Until then, the virtual interface is in the <code>Confirming</code> state
     * and is not available to handle traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocatePrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.AllocatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<AllocatePrivateVirtualInterfaceRequest, AllocatePrivateVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Provisions a public virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public virtual interface to be owned by the
     * specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the owner using
     * <a>ConfirmPublicVirtualInterface</a>. Until this step has been completed, the virtual interface is in the
     * <code>confirming</code> state and is not available to handle traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are
     * automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     * @return A Java Future containing the result of the AllocatePublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.AllocatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(
            AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest);

    /**
     * <p>
     * Provisions a public virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public virtual interface to be owned by the
     * specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the owner using
     * <a>ConfirmPublicVirtualInterface</a>. Until this step has been completed, the virtual interface is in the
     * <code>confirming</code> state and is not available to handle traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are
     * automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocatePublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.AllocatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(
            AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<AllocatePublicVirtualInterfaceRequest, AllocatePublicVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and
     * re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the
     * same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
     * re-associate a connection that's currently associated with a different LAG; however, if removing the connection
     * would cause the original LAG to fall below its setting for minimum number of operational connections, the request
     * fails.
     * </p>
     * <p>
     * Any virtual interfaces that are directly associated with the connection are automatically re-associated with the
     * LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated
     * with the original LAG.
     * </p>
     * <p>
     * For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was
     * originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     * </p>
     * 
     * @param associateConnectionWithLagRequest
     * @return A Java Future containing the result of the AssociateConnectionWithLag operation returned by the service.
     * @sample AmazonDirectConnectAsync.AssociateConnectionWithLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateConnectionWithLag"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateConnectionWithLagResult> associateConnectionWithLagAsync(
            AssociateConnectionWithLagRequest associateConnectionWithLagRequest);

    /**
     * <p>
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and
     * re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the
     * same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
     * re-associate a connection that's currently associated with a different LAG; however, if removing the connection
     * would cause the original LAG to fall below its setting for minimum number of operational connections, the request
     * fails.
     * </p>
     * <p>
     * Any virtual interfaces that are directly associated with the connection are automatically re-associated with the
     * LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated
     * with the original LAG.
     * </p>
     * <p>
     * For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was
     * originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     * </p>
     * 
     * @param associateConnectionWithLagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateConnectionWithLag operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.AssociateConnectionWithLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateConnectionWithLag"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateConnectionWithLagResult> associateConnectionWithLagAsync(
            AssociateConnectionWithLagRequest associateConnectionWithLagRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateConnectionWithLagRequest, AssociateConnectionWithLagResult> asyncHandler);

    /**
     * <p>
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If
     * the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address,
     * the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is
     * being migrated.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     * @return A Java Future containing the result of the AssociateHostedConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.AssociateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateHostedConnectionResult> associateHostedConnectionAsync(
            AssociateHostedConnectionRequest associateHostedConnectionRequest);

    /**
     * <p>
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If
     * the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address,
     * the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is
     * being migrated.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateHostedConnection operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.AssociateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateHostedConnectionResult> associateHostedConnectionAsync(
            AssociateHostedConnectionRequest associateHostedConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateHostedConnectionRequest, AssociateHostedConnectionResult> asyncHandler);

    /**
     * <p>
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS
     * is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an
     * associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails.
     * </p>
     * <p>
     * Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must
     * be migrated along with their virtual interfaces using <a>AssociateHostedConnection</a>.
     * </p>
     * <p>
     * To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
     * interface itself or the connection to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG for the association.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     * @return A Java Future containing the result of the AssociateVirtualInterface operation returned by the service.
     * @sample AmazonDirectConnectAsync.AssociateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateVirtualInterfaceResult> associateVirtualInterfaceAsync(
            AssociateVirtualInterfaceRequest associateVirtualInterfaceRequest);

    /**
     * <p>
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS
     * is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an
     * associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails.
     * </p>
     * <p>
     * Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must
     * be migrated along with their virtual interfaces using <a>AssociateHostedConnection</a>.
     * </p>
     * <p>
     * To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
     * interface itself or the connection to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG for the association.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateVirtualInterface operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.AssociateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateVirtualInterfaceResult> associateVirtualInterfaceAsync(
            AssociateVirtualInterfaceRequest associateVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateVirtualInterfaceRequest, AssociateVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Confirms the creation of the specified hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the <code>Ordering</code> state, and remains in this state
     * until the owner confirms creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     * @return A Java Future containing the result of the ConfirmConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.ConfirmConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(ConfirmConnectionRequest confirmConnectionRequest);

    /**
     * <p>
     * Confirms the creation of the specified hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the <code>Ordering</code> state, and remains in this state
     * until the owner confirms creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmConnection operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.ConfirmConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(ConfirmConnectionRequest confirmConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmConnectionRequest, ConfirmConnectionResult> asyncHandler);

    /**
     * <p>
     * Accepts ownership of a private virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the virtual interface is created and attached to the specified
     * virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     * @return A Java Future containing the result of the ConfirmPrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.ConfirmPrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(
            ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Accepts ownership of a private virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the virtual interface is created and attached to the specified
     * virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmPrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.ConfirmPrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(
            ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmPrivateVirtualInterfaceRequest, ConfirmPrivateVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Accepts ownership of a public virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the specified virtual interface is created and made available
     * to handle traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     * @return A Java Future containing the result of the ConfirmPublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.ConfirmPublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(
            ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest);

    /**
     * <p>
     * Accepts ownership of a public virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the specified virtual interface is created and made available
     * to handle traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmPublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.ConfirmPublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(
            ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmPublicVirtualInterfaceRequest, ConfirmPublicVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Creates a BGP peer on the specified virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that
     * also use that address family.
     * </p>
     * <p>
     * If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the
     * same address family as an existing BGP peer on the virtual interface.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically
     * assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
     * virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     * @return A Java Future containing the result of the CreateBGPPeer operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBGPPeerResult> createBGPPeerAsync(CreateBGPPeerRequest createBGPPeerRequest);

    /**
     * <p>
     * Creates a BGP peer on the specified virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that
     * also use that address family.
     * </p>
     * <p>
     * If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the
     * same address family as an existing BGP peer on the virtual interface.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically
     * assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
     * virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBGPPeer operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBGPPeerResult> createBGPPeerAsync(CreateBGPPeerRequest createBGPPeerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBGPPeerRequest, CreateBGPPeerResult> asyncHandler);

    /**
     * <p>
     * Creates a connection between a customer network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * To find the locations for your Region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
     * specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     * </p>
     * 
     * @param createConnectionRequest
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a connection between a customer network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * To find the locations for your Region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
     * specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     * </p>
     * 
     * @param createConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler);

    /**
     * <p>
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual
     * interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after
     * it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect
     * gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the
     * Region in which the virtual interfaces are located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     * @return A Java Future containing the result of the CreateDirectConnectGateway operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectConnectGatewayResult> createDirectConnectGatewayAsync(
            CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest);

    /**
     * <p>
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual
     * interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after
     * it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect
     * gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the
     * Region in which the virtual interfaces are located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectConnectGateway operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectConnectGatewayResult> createDirectConnectGatewayAsync(
            CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayRequest, CreateDirectConnectGatewayResult> asyncHandler);

    /**
     * <p>
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private
     * gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     * @return A Java Future containing the result of the CreateDirectConnectGatewayAssociation operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsync.CreateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectConnectGatewayAssociationResult> createDirectConnectGatewayAssociationAsync(
            CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private
     * gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectConnectGatewayAssociation operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectConnectGatewayAssociationResult> createDirectConnectGatewayAssociationAsync(
            CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayAssociationRequest, CreateDirectConnectGatewayAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates a proposal to associate the specified virtual private gateway with the specified Direct Connect gateway.
     * </p>
     * <p>
     * You can only associate a Direct Connect gateway and virtual private gateway when the account that owns the Direct
     * Connect gateway and the account that owns the virtual private gateway have the same payer ID.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationProposalRequest
     * @return A Java Future containing the result of the CreateDirectConnectGatewayAssociationProposal operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsync.CreateDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectConnectGatewayAssociationProposalResult> createDirectConnectGatewayAssociationProposalAsync(
            CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest);

    /**
     * <p>
     * Creates a proposal to associate the specified virtual private gateway with the specified Direct Connect gateway.
     * </p>
     * <p>
     * You can only associate a Direct Connect gateway and virtual private gateway when the account that owns the Direct
     * Connect gateway and the account that owns the virtual private gateway have the same payer ID.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationProposalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectConnectGatewayAssociationProposal operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectConnectGatewayAssociationProposalResult> createDirectConnectGatewayAssociationProposalAsync(
            CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayAssociationProposalRequest, CreateDirectConnectGatewayAssociationProposalResult> asyncHandler);

    /**
     * <p>
     * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect
     * location.
     * </p>
     * <p>
     * An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can
     * use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network
     * services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect
     * location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to
     * an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
     * the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is
     * created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling
     * <a>AllocateHostedConnection</a>. The end customer can then connect to AWS resources by creating a virtual
     * interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     * @return A Java Future containing the result of the CreateInterconnect operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(CreateInterconnectRequest createInterconnectRequest);

    /**
     * <p>
     * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect
     * location.
     * </p>
     * <p>
     * An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can
     * use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network
     * services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect
     * location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to
     * an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
     * the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is
     * created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling
     * <a>AllocateHostedConnection</a>. The end customer can then connect to AWS resources by creating a virtual
     * interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInterconnect operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(CreateInterconnectRequest createInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInterconnectRequest, CreateInterconnectResult> asyncHandler);

    /**
     * <p>
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the
     * customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
     * Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single
     * interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint.
     * </p>
     * <p>
     * You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG
     * than AWS Direct Connect can allocate on a single endpoint, no LAG is created.
     * </p>
     * <p>
     * You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the
     * total number of connections). Doing so interrupts the current physical connection or hosted connections, and
     * re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to
     * which the connection terminates. Any virtual interfaces associated with the connection are automatically
     * disassociated and re-associated with the LAG. The connection ID does not change.
     * </p>
     * <p>
     * If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically
     * enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
     * directly configured.
     * </p>
     * 
     * @param createLagRequest
     * @return A Java Future containing the result of the CreateLag operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLagResult> createLagAsync(CreateLagRequest createLagRequest);

    /**
     * <p>
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the
     * customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
     * Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single
     * interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint.
     * </p>
     * <p>
     * You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG
     * than AWS Direct Connect can allocate on a single endpoint, no LAG is created.
     * </p>
     * <p>
     * You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the
     * total number of connections). Doing so interrupts the current physical connection or hosted connections, and
     * re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to
     * which the connection terminates. Any virtual interfaces associated with the connection are automatically
     * disassociated and re-associated with the LAG. The connection ID does not change.
     * </p>
     * <p>
     * If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically
     * enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
     * directly configured.
     * </p>
     * 
     * @param createLagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLag operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLagResult> createLagAsync(CreateLagRequest createLagRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLagRequest, CreateLagResult> asyncHandler);

    /**
     * <p>
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic.
     * A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway
     * (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for
     * connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to
     * a VGW only provides access to a single VPC within the same Region.
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     * @return A Java Future containing the result of the CreatePrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.CreatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(
            CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic.
     * A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway
     * (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for
     * connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to
     * a VGW only provides access to a single VPC within the same Region.
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.CreatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(
            CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePrivateVirtualInterfaceRequest, CreatePrivateVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A
     * public virtual interface supports sending traffic to public services of AWS such as Amazon S3.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (<code>addressFamily</code> is <code>ipv6</code>), leave the
     * <code>customer</code> and <code>amazon</code> address fields blank to use auto-assigned IPv6 space. Custom IPv6
     * addresses are not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     * @return A Java Future containing the result of the CreatePublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.CreatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(
            CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A
     * public virtual interface supports sending traffic to public services of AWS such as Amazon S3.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (<code>addressFamily</code> is <code>ipv6</code>), leave the
     * <code>customer</code> and <code>amazon</code> address fields blank to use auto-assigned IPv6 space. Custom IPv6
     * addresses are not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.CreatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(
            CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePublicVirtualInterfaceRequest, CreatePublicVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN.
     * </p>
     * <p>
     * You cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     * @return A Java Future containing the result of the DeleteBGPPeer operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBGPPeerResult> deleteBGPPeerAsync(DeleteBGPPeerRequest deleteBGPPeerRequest);

    /**
     * <p>
     * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN.
     * </p>
     * <p>
     * You cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBGPPeer operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBGPPeerResult> deleteBGPPeerAsync(DeleteBGPPeerRequest deleteBGPPeerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBGPPeerRequest, DeleteBGPPeerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are
     * partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service
     * with them separately.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes the specified connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are
     * partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service
     * with them separately.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to
     * the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct
     * Connect gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     * @return A Java Future containing the result of the DeleteDirectConnectGateway operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectConnectGatewayResult> deleteDirectConnectGatewayAsync(
            DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest);

    /**
     * <p>
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to
     * the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct
     * Connect gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectConnectGateway operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectConnectGatewayResult> deleteDirectConnectGatewayAsync(
            DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayRequest, DeleteDirectConnectGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     * @return A Java Future containing the result of the DeleteDirectConnectGatewayAssociation operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsync.DeleteDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationResult> deleteDirectConnectGatewayAssociationAsync(
            DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectConnectGatewayAssociation operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationResult> deleteDirectConnectGatewayAssociationAsync(
            DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayAssociationRequest, DeleteDirectConnectGatewayAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes the association proposal request between the specified Direct Connect gateway and virtual private
     * gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationProposalRequest
     * @return A Java Future containing the result of the DeleteDirectConnectGatewayAssociationProposal operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationProposalResult> deleteDirectConnectGatewayAssociationProposalAsync(
            DeleteDirectConnectGatewayAssociationProposalRequest deleteDirectConnectGatewayAssociationProposalRequest);

    /**
     * <p>
     * Deletes the association proposal request between the specified Direct Connect gateway and virtual private
     * gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationProposalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectConnectGatewayAssociationProposal operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationProposalResult> deleteDirectConnectGatewayAssociationProposalAsync(
            DeleteDirectConnectGatewayAssociationProposalRequest deleteDirectConnectGatewayAssociationProposalRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayAssociationProposalRequest, DeleteDirectConnectGatewayAssociationProposalResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     * @return A Java Future containing the result of the DeleteInterconnect operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(DeleteInterconnectRequest deleteInterconnectRequest);

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInterconnect operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(DeleteInterconnectRequest deleteInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInterconnectRequest, DeleteInterconnectResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces
     * or hosted connections.
     * </p>
     * 
     * @param deleteLagRequest
     * @return A Java Future containing the result of the DeleteLag operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLagResult> deleteLagAsync(DeleteLagRequest deleteLagRequest);

    /**
     * <p>
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces
     * or hosted connections.
     * </p>
     * 
     * @param deleteLagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLag operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLagResult> deleteLagAsync(DeleteLagRequest deleteLagRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLagRequest, DeleteLagResult> asyncHandler);

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     * @return A Java Future containing the result of the DeleteVirtualInterface operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest);

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVirtualInterface operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DeleteVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for a connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or
     * service provider uses when establishing your cross connect to AWS at the colocation facility. For more
     * information, see <a href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting
     * Cross Connects at AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     * @return A Java Future containing the result of the DescribeConnectionLoa operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeConnectionLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(DescribeConnectionLoaRequest describeConnectionLoaRequest);

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for a connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or
     * service provider uses when establishing your cross connect to AWS at the colocation facility. For more
     * information, see <a href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting
     * Cross Connects at AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectionLoa operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeConnectionLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(DescribeConnectionLoaRequest describeConnectionLoaRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionLoaRequest, DescribeConnectionLoaResult> asyncHandler);

    /**
     * <p>
     * Displays the specified connection or all connections in this Region.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @return A Java Future containing the result of the DescribeConnections operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest describeConnectionsRequest);

    /**
     * <p>
     * Displays the specified connection or all connections in this Region.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnections operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest describeConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConnections operation.
     *
     * @see #describeConnectionsAsync(DescribeConnectionsRequest)
     */
    java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync();

    /**
     * Simplified method form for invoking the DescribeConnections operation with an AsyncHandler.
     *
     * @see #describeConnectionsAsync(DescribeConnectionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use <a>DescribeHostedConnections</a> instead.
     * </p>
     * <p>
     * Lists the connections that have been provisioned on the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     * @return A Java Future containing the result of the DescribeConnectionsOnInterconnect operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.DescribeConnectionsOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionsOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest);

    /**
     * <p>
     * Deprecated. Use <a>DescribeHostedConnections</a> instead.
     * </p>
     * <p>
     * Lists the connections that have been provisioned on the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectionsOnInterconnect operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeConnectionsOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionsOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsOnInterconnectRequest, DescribeConnectionsOnInterconnectResult> asyncHandler);

    /**
     * <p>
     * Describes one or more association proposals for connection between a virtual private gateway and a Direct Connect
     * gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationProposalsRequest
     * @return A Java Future containing the result of the DescribeDirectConnectGatewayAssociationProposals operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeDirectConnectGatewayAssociationProposals
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociationProposals"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationProposalsResult> describeDirectConnectGatewayAssociationProposalsAsync(
            DescribeDirectConnectGatewayAssociationProposalsRequest describeDirectConnectGatewayAssociationProposalsRequest);

    /**
     * <p>
     * Describes one or more association proposals for connection between a virtual private gateway and a Direct Connect
     * gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationProposalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDirectConnectGatewayAssociationProposals operation
     *         returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeDirectConnectGatewayAssociationProposals
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociationProposals"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationProposalsResult> describeDirectConnectGatewayAssociationProposalsAsync(
            DescribeDirectConnectGatewayAssociationProposalsRequest describeDirectConnectGatewayAssociationProposalsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAssociationProposalsRequest, DescribeDirectConnectGatewayAssociationProposalsResult> asyncHandler);

    /**
     * <p>
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a
     * Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response
     * contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual
     * private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway.
     * If you specify both, the response contains the association between the Direct Connect gateway and the virtual
     * private gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     * @return A Java Future containing the result of the DescribeDirectConnectGatewayAssociations operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsync.DescribeDirectConnectGatewayAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationsResult> describeDirectConnectGatewayAssociationsAsync(
            DescribeDirectConnectGatewayAssociationsRequest describeDirectConnectGatewayAssociationsRequest);

    /**
     * <p>
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a
     * Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response
     * contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual
     * private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway.
     * If you specify both, the response contains the association between the Direct Connect gateway and the virtual
     * private gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDirectConnectGatewayAssociations operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeDirectConnectGatewayAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationsResult> describeDirectConnectGatewayAssociationsAsync(
            DescribeDirectConnectGatewayAssociationsRequest describeDirectConnectGatewayAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAssociationsRequest, DescribeDirectConnectGatewayAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct
     * Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all
     * virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response
     * contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response
     * contains the attachment between the Direct Connect gateway and the virtual interface.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     * @return A Java Future containing the result of the DescribeDirectConnectGatewayAttachments operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsync.DescribeDirectConnectGatewayAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewayAttachmentsResult> describeDirectConnectGatewayAttachmentsAsync(
            DescribeDirectConnectGatewayAttachmentsRequest describeDirectConnectGatewayAttachmentsRequest);

    /**
     * <p>
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct
     * Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all
     * virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response
     * contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response
     * contains the attachment between the Direct Connect gateway and the virtual interface.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDirectConnectGatewayAttachments operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeDirectConnectGatewayAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewayAttachmentsResult> describeDirectConnectGatewayAttachmentsAsync(
            DescribeDirectConnectGatewayAttachmentsRequest describeDirectConnectGatewayAttachmentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAttachmentsRequest, DescribeDirectConnectGatewayAttachmentsResult> asyncHandler);

    /**
     * <p>
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect
     * gateways are not returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     * @return A Java Future containing the result of the DescribeDirectConnectGateways operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.DescribeDirectConnectGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewaysResult> describeDirectConnectGatewaysAsync(
            DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest);

    /**
     * <p>
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect
     * gateways are not returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDirectConnectGateways operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeDirectConnectGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectConnectGatewaysResult> describeDirectConnectGatewaysAsync(
            DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewaysRequest, DescribeDirectConnectGatewaysResult> asyncHandler);

    /**
     * <p>
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group
     * (LAG).
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     * @return A Java Future containing the result of the DescribeHostedConnections operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeHostedConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeHostedConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostedConnectionsResult> describeHostedConnectionsAsync(
            DescribeHostedConnectionsRequest describeHostedConnectionsRequest);

    /**
     * <p>
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group
     * (LAG).
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHostedConnections operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeHostedConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeHostedConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostedConnectionsResult> describeHostedConnectionsAsync(
            DescribeHostedConnectionsRequest describeHostedConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHostedConnectionsRequest, DescribeHostedConnectionsResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for the specified interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     * @return A Java Future containing the result of the DescribeInterconnectLoa operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeInterconnectLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnectLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(DescribeInterconnectLoaRequest describeInterconnectLoaRequest);

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for the specified interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInterconnectLoa operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeInterconnectLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnectLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(DescribeInterconnectLoaRequest describeInterconnectLoaRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectLoaRequest, DescribeInterconnectLoaResult> asyncHandler);

    /**
     * <p>
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     * @return A Java Future containing the result of the DescribeInterconnects operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeInterconnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(DescribeInterconnectsRequest describeInterconnectsRequest);

    /**
     * <p>
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInterconnects operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeInterconnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(DescribeInterconnectsRequest describeInterconnectsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeInterconnects operation.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest)
     */
    java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync();

    /**
     * Simplified method form for invoking the DescribeInterconnects operation with an AsyncHandler.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler);

    /**
     * <p>
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     * </p>
     * 
     * @param describeLagsRequest
     * @return A Java Future containing the result of the DescribeLags operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeLags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLagsResult> describeLagsAsync(DescribeLagsRequest describeLagsRequest);

    /**
     * <p>
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     * </p>
     * 
     * @param describeLagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLags operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeLags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLagsResult> describeLagsAsync(DescribeLagsRequest describeLagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLagsRequest, DescribeLagsResult> asyncHandler);

    /**
     * <p>
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeLoaRequest
     * @return A Java Future containing the result of the DescribeLoa operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoaResult> describeLoaAsync(DescribeLoaRequest describeLoaRequest);

    /**
     * <p>
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeLoaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoa operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoaResult> describeLoaAsync(DescribeLoaRequest describeLoaRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoaRequest, DescribeLoaResult> asyncHandler);

    /**
     * <p>
     * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected
     * when calling <a>CreateConnection</a> or <a>CreateInterconnect</a>.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return A Java Future containing the result of the DescribeLocations operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(DescribeLocationsRequest describeLocationsRequest);

    /**
     * <p>
     * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected
     * when calling <a>CreateConnection</a> or <a>CreateInterconnect</a>.
     * </p>
     * 
     * @param describeLocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocations operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(DescribeLocationsRequest describeLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLocations operation.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest)
     */
    java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync();

    /**
     * Simplified method form for invoking the DescribeLocations operation with an AsyncHandler.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler);

    /**
     * <p>
     * Describes the tags associated with the specified AWS Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the tags associated with the specified AWS Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Lists the virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
     * </p>
     * 
     * @param describeVirtualGatewaysRequest
     * @return A Java Future containing the result of the DescribeVirtualGateways operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeVirtualGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest);

    /**
     * <p>
     * Lists the virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
     * </p>
     * 
     * @param describeVirtualGatewaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVirtualGateways operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeVirtualGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest)
     */
    java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync();

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation with an AsyncHandler.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler);

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you
     * make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with
     * the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is
     * returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer
     * network.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     * @return A Java Future containing the result of the DescribeVirtualInterfaces operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeVirtualInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest);

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you
     * make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with
     * the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is
     * returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer
     * network.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVirtualInterfaces operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeVirtualInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces operation.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest)
     */
    java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync();

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces operation with an AsyncHandler.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler);

    /**
     * <p>
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established
     * as a standalone connection (the connection is not deleted; to delete the connection, use the
     * <a>DeleteConnection</a> request). If the LAG has associated virtual interfaces or hosted connections, they remain
     * associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically
     * converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational
     * connections, the request fails, except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     * @return A Java Future containing the result of the DisassociateConnectionFromLag operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.DisassociateConnectionFromLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DisassociateConnectionFromLag"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectionFromLagResult> disassociateConnectionFromLagAsync(
            DisassociateConnectionFromLagRequest disassociateConnectionFromLagRequest);

    /**
     * <p>
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established
     * as a standalone connection (the connection is not deleted; to delete the connection, use the
     * <a>DeleteConnection</a> request). If the LAG has associated virtual interfaces or hosted connections, they remain
     * associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically
     * converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational
     * connections, the request fails, except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateConnectionFromLag operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.DisassociateConnectionFromLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DisassociateConnectionFromLag"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectionFromLagResult> disassociateConnectionFromLagAsync(
            DisassociateConnectionFromLagRequest disassociateConnectionFromLagRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectionFromLagRequest, DisassociateConnectionFromLagResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50
     * tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDirectConnectAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50
     * tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified AWS Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDirectConnectAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified AWS Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified attributes of the Direct Connect gateway association.
     * </p>
     * <p>
     * Add or remove prefixes from the association.
     * </p>
     * 
     * @param updateDirectConnectGatewayAssociationRequest
     * @return A Java Future containing the result of the UpdateDirectConnectGatewayAssociation operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsync.UpdateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDirectConnectGatewayAssociationResult> updateDirectConnectGatewayAssociationAsync(
            UpdateDirectConnectGatewayAssociationRequest updateDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Updates the specified attributes of the Direct Connect gateway association.
     * </p>
     * <p>
     * Add or remove prefixes from the association.
     * </p>
     * 
     * @param updateDirectConnectGatewayAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDirectConnectGatewayAssociation operation returned by
     *         the service.
     * @sample AmazonDirectConnectAsyncHandler.UpdateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDirectConnectGatewayAssociationResult> updateDirectConnectGatewayAssociationAsync(
            UpdateDirectConnectGatewayAssociationRequest updateDirectConnectGatewayAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDirectConnectGatewayAssociationRequest, UpdateDirectConnectGatewayAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates the attributes of the specified link aggregation group (LAG).
     * </p>
     * <p>
     * You can update the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value for the minimum number of connections that must be operational for the LAG itself to be operational.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you
     * update this value and the number of operational connections falls below the specified value, the LAG
     * automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as
     * it could force the LAG down if it is set higher than the current number of operational connections.
     * </p>
     * 
     * @param updateLagRequest
     * @return A Java Future containing the result of the UpdateLag operation returned by the service.
     * @sample AmazonDirectConnectAsync.UpdateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLagResult> updateLagAsync(UpdateLagRequest updateLagRequest);

    /**
     * <p>
     * Updates the attributes of the specified link aggregation group (LAG).
     * </p>
     * <p>
     * You can update the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value for the minimum number of connections that must be operational for the LAG itself to be operational.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you
     * update this value and the number of operational connections falls below the specified value, the LAG
     * automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as
     * it could force the LAG down if it is set higher than the current number of operational connections.
     * </p>
     * 
     * @param updateLagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLag operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.UpdateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLagResult> updateLagAsync(UpdateLagRequest updateLagRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLagRequest, UpdateLagResult> asyncHandler);

    /**
     * <p>
     * Updates the specified attributes of the specified virtual private interface.
     * </p>
     * <p>
     * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical
     * connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity
     * for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection
     * supports jumbo frames, call <a>DescribeConnections</a>. To check whether your virtual interface supports jumbo
     * frames, call <a>DescribeVirtualInterfaces</a>.
     * </p>
     * 
     * @param updateVirtualInterfaceAttributesRequest
     * @return A Java Future containing the result of the UpdateVirtualInterfaceAttributes operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.UpdateVirtualInterfaceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateVirtualInterfaceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualInterfaceAttributesResult> updateVirtualInterfaceAttributesAsync(
            UpdateVirtualInterfaceAttributesRequest updateVirtualInterfaceAttributesRequest);

    /**
     * <p>
     * Updates the specified attributes of the specified virtual private interface.
     * </p>
     * <p>
     * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical
     * connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity
     * for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection
     * supports jumbo frames, call <a>DescribeConnections</a>. To check whether your virtual interface supports jumbo
     * frames, call <a>DescribeVirtualInterfaces</a>.
     * </p>
     * 
     * @param updateVirtualInterfaceAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVirtualInterfaceAttributes operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsyncHandler.UpdateVirtualInterfaceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateVirtualInterfaceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualInterfaceAttributesResult> updateVirtualInterfaceAttributesAsync(
            UpdateVirtualInterfaceAttributesRequest updateVirtualInterfaceAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVirtualInterfaceAttributesRequest, UpdateVirtualInterfaceAttributesResult> asyncHandler);

}
