/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard 1 gigabit or 10
 * gigabit Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct
 * Connect router. With this connection in place, you can create virtual interfaces directly to the AWS cloud (for
 * example, to Amazon Elastic Compute Cloud (Amazon EC2) and Amazon Simple Storage Service (Amazon S3)) and to Amazon
 * Virtual Private Cloud (Amazon VPC), bypassing Internet service providers in your network path. An AWS Direct Connect
 * location provides access to AWS in the region it is associated with, as well as access to other US regions. For
 * example, you can provision a single connection to any AWS Direct Connect location in the US and use it to access
 * public AWS services in all US Regions and AWS GovCloud (US).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDirectConnectAsync extends AmazonDirectConnect {

    /**
     * <p>
     * Deprecated in favor of <a>AllocateHostedConnection</a>.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the given
     * interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     *        Container for the parameters to the AllocateConnectionOnInterconnect operation.
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
     * Deprecated in favor of <a>AllocateHostedConnection</a>.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the given
     * interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     *        Container for the parameters to the AllocateConnectionOnInterconnect operation.
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
     * Creates a hosted connection on an interconnect or a link aggregation group (LAG).
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the given
     * interconnect or LAG.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     *        Container for the parameters to theHostedConnection operation.
     * @return A Java Future containing the result of the AllocateHostedConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.AllocateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllocateHostedConnectionResult> allocateHostedConnectionAsync(AllocateHostedConnectionRequest allocateHostedConnectionRequest);

    /**
     * <p>
     * Creates a hosted connection on an interconnect or a link aggregation group (LAG).
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the given
     * interconnect or LAG.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     *        Container for the parameters to theHostedConnection operation.
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
     * Provisions a private virtual interface to be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the virtual interface owner by using the
     * <a>ConfirmPrivateVirtualInterface</a> action. Until then, the virtual interface will be in 'Confirming' state,
     * and will not be available for handling traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePrivateVirtualInterface operation.
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
     * Provisions a private virtual interface to be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the virtual interface owner by using the
     * <a>ConfirmPrivateVirtualInterface</a> action. Until then, the virtual interface will be in 'Confirming' state,
     * and will not be available for handling traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePrivateVirtualInterface operation.
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
     * Provisions a public virtual interface to be owned by a different customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public virtual interface which will be owned by
     * another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the virtual interface owner by calling
     * ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface will be in 'Confirming'
     * state, and will not be available for handling traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (addressFamily is 'ipv6'), the customer and amazon address fields
     * should be left blank to use auto-assigned IPv6 space. Custom IPv6 Addresses are currently not supported.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePublicVirtualInterface operation.
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
     * Provisions a public virtual interface to be owned by a different customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public virtual interface which will be owned by
     * another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the virtual interface owner by calling
     * ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface will be in 'Confirming'
     * state, and will not be available for handling traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (addressFamily is 'ipv6'), the customer and amazon address fields
     * should be left blank to use auto-assigned IPv6 space. Custom IPv6 Addresses are currently not supported.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePublicVirtualInterface operation.
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
     * re-established as a member of the LAG (connectivity to AWS will be interrupted). The connection must be hosted on
     * the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
     * reassociate a connection that's currently associated with a different LAG; however, if removing the connection
     * will cause the original LAG to fall below its setting for minimum number of operational connections, the request
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
     *        Container for the parameters to the AssociateConnectionWithLag operation.
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
     * re-established as a member of the LAG (connectivity to AWS will be interrupted). The connection must be hosted on
     * the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
     * reassociate a connection that's currently associated with a different LAG; however, if removing the connection
     * will cause the original LAG to fall below its setting for minimum number of operational connections, the request
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
     *        Container for the parameters to the AssociateConnectionWithLag operation.
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
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     *        Container for the parameters to the AssociateHostedConnection operation.
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
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     *        Container for the parameters to the AssociateHostedConnection operation.
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
     * In order to reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
     * interface itself or the connection to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG to which the virtual interface will be newly associated.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     *        Container for the parameters to the AssociateVirtualInterface operation.
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
     * In order to reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
     * interface itself or the connection to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG to which the virtual interface will be newly associated.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     *        Container for the parameters to the AssociateVirtualInterface operation.
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
     * Confirm the creation of a hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the 'Ordering' state, and will remain in this state until
     * the owner calls ConfirmConnection to confirm creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     *        Container for the parameters to the ConfirmConnection operation.
     * @return A Java Future containing the result of the ConfirmConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.ConfirmConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(ConfirmConnectionRequest confirmConnectionRequest);

    /**
     * <p>
     * Confirm the creation of a hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the 'Ordering' state, and will remain in this state until
     * the owner calls ConfirmConnection to confirm creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     *        Container for the parameters to the ConfirmConnection operation.
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
     * Accept ownership of a private virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual interface will be created and attached to the
     * given virtual private gateway or direct connect gateway, and will be available for handling traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPrivateVirtualInterface operation.
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
     * Accept ownership of a private virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual interface will be created and attached to the
     * given virtual private gateway or direct connect gateway, and will be available for handling traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPrivateVirtualInterface operation.
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
     * Accept ownership of a public virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the specified virtual interface will be created and made
     * available for handling traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPublicVirtualInterface operation.
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
     * Accept ownership of a public virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the specified virtual interface will be created and made
     * available for handling traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPublicVirtualInterface operation.
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
     * Creates a new BGP peer on a specified virtual interface. The BGP peer cannot be in the same address family
     * (IPv4/IPv6) of an existing BGP peer on the virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family in order to access AWS resources that also use
     * that address family.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, the Amazon address and customer address fields must be left blank. IPv6 addresses
     * are automatically assigned from Amazon's pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
     * virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     *        Container for the parameters to the CreateBGPPeer operation.
     * @return A Java Future containing the result of the CreateBGPPeer operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBGPPeerResult> createBGPPeerAsync(CreateBGPPeerRequest createBGPPeerRequest);

    /**
     * <p>
     * Creates a new BGP peer on a specified virtual interface. The BGP peer cannot be in the same address family
     * (IPv4/IPv6) of an existing BGP peer on the virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family in order to access AWS resources that also use
     * that address family.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, the Amazon address and customer address fields must be left blank. IPv6 addresses
     * are automatically assigned from Amazon's pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
     * virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     *        Container for the parameters to the CreateBGPPeer operation.
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
     * Creates a new connection between the customer network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect location over a standard 1 gigabit or 10
     * gigabit Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct
     * Connect router. An AWS Direct Connect location provides access to Amazon Web Services in the region it is
     * associated with. You can establish connections with AWS Direct Connect locations in multiple regions, but a
     * connection in one region does not provide connectivity to other regions.
     * </p>
     * <p>
     * To find the locations for your region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
     * specified LAG. If there are no available ports on the endpoint, the request fails and no connection will be
     * created.
     * </p>
     * 
     * @param createConnectionRequest
     *        Container for the parameters to the CreateConnection operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a new connection between the customer network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect location over a standard 1 gigabit or 10
     * gigabit Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct
     * Connect router. An AWS Direct Connect location provides access to Amazon Web Services in the region it is
     * associated with. You can establish connections with AWS Direct Connect locations in multiple regions, but a
     * connection in one region does not provide connectivity to other regions.
     * </p>
     * <p>
     * To find the locations for your region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
     * specified LAG. If there are no available ports on the endpoint, the request fails and no connection will be
     * created.
     * </p>
     * 
     * @param createConnectionRequest
     *        Container for the parameters to the CreateConnection operation.
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
     * Creates a new direct connect gateway. A direct connect gateway is an intermediate object that enables you to
     * connect a set of virtual interfaces and virtual private gateways. direct connect gateways are global and visible
     * in any AWS region after they are created. The virtual interfaces and virtual private gateways that are connected
     * through a direct connect gateway can be in different regions. This enables you to connect to a VPC in any region,
     * regardless of the region in which the virtual interfaces are located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     *        Container for the parameters to the CreateDirectConnectGateway operation.
     * @return A Java Future containing the result of the CreateDirectConnectGateway operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectConnectGatewayResult> createDirectConnectGatewayAsync(
            CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest);

    /**
     * <p>
     * Creates a new direct connect gateway. A direct connect gateway is an intermediate object that enables you to
     * connect a set of virtual interfaces and virtual private gateways. direct connect gateways are global and visible
     * in any AWS region after they are created. The virtual interfaces and virtual private gateways that are connected
     * through a direct connect gateway can be in different regions. This enables you to connect to a VPC in any region,
     * regardless of the region in which the virtual interfaces are located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     *        Container for the parameters to the CreateDirectConnectGateway operation.
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
     * Creates an association between a direct connect gateway and a virtual private gateway (VGW). The VGW must be
     * attached to a VPC and must not be associated with another direct connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     *        Container for the parameters to the CreateDirectConnectGatewayAssociation operation.
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
     * Creates an association between a direct connect gateway and a virtual private gateway (VGW). The VGW must be
     * attached to a VPC and must not be associated with another direct connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     *        Container for the parameters to the CreateDirectConnectGatewayAssociation operation.
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
     * Creates a new interconnect between a AWS Direct Connect partner's network and a specific AWS Direct Connect
     * location.
     * </p>
     * <p>
     * An interconnect is a connection which is capable of hosting other connections. The AWS Direct Connect partner can
     * use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own
     * connections. Like a standard connection, an interconnect links the AWS Direct Connect partner's network to an AWS
     * Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet fiber-optic cable. One end is connected to the
     * partner's router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
     * the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect will be
     * created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling
     * AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual
     * interface on their connection, using the VLAN assigned to them by the AWS Direct Connect partner.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     *        Container for the parameters to the CreateInterconnect operation.
     * @return A Java Future containing the result of the CreateInterconnect operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(CreateInterconnectRequest createInterconnectRequest);

    /**
     * <p>
     * Creates a new interconnect between a AWS Direct Connect partner's network and a specific AWS Direct Connect
     * location.
     * </p>
     * <p>
     * An interconnect is a connection which is capable of hosting other connections. The AWS Direct Connect partner can
     * use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own
     * connections. Like a standard connection, an interconnect links the AWS Direct Connect partner's network to an AWS
     * Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet fiber-optic cable. One end is connected to the
     * partner's router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
     * the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect will be
     * created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling
     * AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual
     * interface on their connection, using the VLAN assigned to them by the AWS Direct Connect partner.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     *        Container for the parameters to the CreateInterconnect operation.
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
     * Creates a new link aggregation group (LAG) with the specified number of bundled physical connections between the
     * customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
     * Aggregation Control Protocol (LACP) to aggregate multiple 1 gigabit or 10 gigabit interfaces, allowing you to
     * treat them as a single interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth (for example, 10 Gbps), and must terminate at the same AWS
     * Direct Connect endpoint.
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
     * If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically
     * enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
     * directly configured.
     * </p>
     * 
     * @param createLagRequest
     *        Container for the parameters to the CreateLag operation.
     * @return A Java Future containing the result of the CreateLag operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLagResult> createLagAsync(CreateLagRequest createLagRequest);

    /**
     * <p>
     * Creates a new link aggregation group (LAG) with the specified number of bundled physical connections between the
     * customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
     * Aggregation Control Protocol (LACP) to aggregate multiple 1 gigabit or 10 gigabit interfaces, allowing you to
     * treat them as a single interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth (for example, 10 Gbps), and must terminate at the same AWS
     * Direct Connect endpoint.
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
     * If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically
     * enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
     * directly configured.
     * </p>
     * 
     * @param createLagRequest
     *        Container for the parameters to the CreateLag operation.
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
     * Creates a new private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A private virtual interface supports sending traffic to a single virtual private cloud (VPC).
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     *        Container for the parameters to the CreatePrivateVirtualInterface operation.
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
     * Creates a new private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A private virtual interface supports sending traffic to a single virtual private cloud (VPC).
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     *        Container for the parameters to the CreatePrivateVirtualInterface operation.
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
     * Creates a new public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (addressFamily is 'ipv6'), the customer and amazon address fields
     * should be left blank to use auto-assigned IPv6 space. Custom IPv6 Addresses are currently not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     *        Container for the parameters to the CreatePublicVirtualInterface operation.
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
     * Creates a new public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (addressFamily is 'ipv6'), the customer and amazon address fields
     * should be left blank to use auto-assigned IPv6 space. Custom IPv6 Addresses are currently not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     *        Container for the parameters to the CreatePublicVirtualInterface operation.
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
     * Deletes a BGP peer on the specified virtual interface that matches the specified customer address and ASN. You
     * cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     *        Container for the parameters to the DeleteBGPPeer operation.
     * @return A Java Future containing the result of the DeleteBGPPeer operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBGPPeerResult> deleteBGPPeerAsync(DeleteBGPPeerRequest deleteBGPPeerRequest);

    /**
     * <p>
     * Deletes a BGP peer on the specified virtual interface that matches the specified customer address and ASN. You
     * cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     *        Container for the parameters to the DeleteBGPPeer operation.
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
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. You need to cancel
     * separately with the providers any services or charges for cross-connects or network circuits that connect you to
     * the AWS Direct Connect location.
     * </p>
     * 
     * @param deleteConnectionRequest
     *        Container for the parameters to the DeleteConnection operation.
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. You need to cancel
     * separately with the providers any services or charges for cross-connects or network circuits that connect you to
     * the AWS Direct Connect location.
     * </p>
     * 
     * @param deleteConnectionRequest
     *        Container for the parameters to the DeleteConnection operation.
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
     * Deletes a direct connect gateway. You must first delete all virtual interfaces that are attached to the direct
     * connect gateway and disassociate all virtual private gateways that are associated with the direct connect
     * gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     *        Container for the parameters to the DeleteDirectConnectGateway operation.
     * @return A Java Future containing the result of the DeleteDirectConnectGateway operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectConnectGatewayResult> deleteDirectConnectGatewayAsync(
            DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest);

    /**
     * <p>
     * Deletes a direct connect gateway. You must first delete all virtual interfaces that are attached to the direct
     * connect gateway and disassociate all virtual private gateways that are associated with the direct connect
     * gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     *        Container for the parameters to the DeleteDirectConnectGateway operation.
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
     * Deletes the association between a direct connect gateway and a virtual private gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     *        Container for the parameters to the DeleteDirectConnectGatewayAssociation operation.
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
     * Deletes the association between a direct connect gateway and a virtual private gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     *        Container for the parameters to the DeleteDirectConnectGatewayAssociation operation.
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
     * Deletes the specified interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     *        Container for the parameters to the DeleteInterconnect operation.
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
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     *        Container for the parameters to the DeleteInterconnect operation.
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
     * Deletes a link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted
     * connections.
     * </p>
     * 
     * @param deleteLagRequest
     *        Container for the parameters to the DeleteLag operation.
     * @return A Java Future containing the result of the DeleteLag operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLagResult> deleteLagAsync(DeleteLagRequest deleteLagRequest);

    /**
     * <p>
     * Deletes a link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted
     * connections.
     * </p>
     * 
     * @param deleteLagRequest
     *        Container for the parameters to the DeleteLag operation.
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
     *        Container for the parameters to the DeleteVirtualInterface operation.
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
     *        Container for the parameters to the DeleteVirtualInterface operation.
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
     * Deprecated in favor of <a>DescribeLoa</a>.
     * </p>
     * <p>
     * Returns the LOA-CFA for a Connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or
     * service provider uses when establishing your cross connect to AWS at the colocation facility. For more
     * information, see <a href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting
     * Cross Connects at AWS Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     *        Container for the parameters to the DescribeConnectionLoa operation.
     * @return A Java Future containing the result of the DescribeConnectionLoa operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeConnectionLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(DescribeConnectionLoaRequest describeConnectionLoaRequest);

    /**
     * <p>
     * Deprecated in favor of <a>DescribeLoa</a>.
     * </p>
     * <p>
     * Returns the LOA-CFA for a Connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or
     * service provider uses when establishing your cross connect to AWS at the colocation facility. For more
     * information, see <a href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting
     * Cross Connects at AWS Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     *        Container for the parameters to the DescribeConnectionLoa operation.
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
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, the call returns only that particular connection.
     * </p>
     * 
     * @param describeConnectionsRequest
     *        Container for the parameters to the DescribeConnections operation.
     * @return A Java Future containing the result of the DescribeConnections operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest describeConnectionsRequest);

    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, the call returns only that particular connection.
     * </p>
     * 
     * @param describeConnectionsRequest
     *        Container for the parameters to the DescribeConnections operation.
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
     * Deprecated in favor of <a>DescribeHostedConnections</a>.
     * </p>
     * <p>
     * Returns a list of connections that have been provisioned on the given interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     *        Container for the parameters to the DescribeConnectionsOnInterconnect operation.
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
     * Deprecated in favor of <a>DescribeHostedConnections</a>.
     * </p>
     * <p>
     * Returns a list of connections that have been provisioned on the given interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     *        Container for the parameters to the DescribeConnectionsOnInterconnect operation.
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
     * Returns a list of all direct connect gateway and virtual private gateway (VGW) associations. Either a direct
     * connect gateway ID or a VGW ID must be provided in the request. If a direct connect gateway ID is provided, the
     * response returns all VGWs associated with the direct connect gateway. If a VGW ID is provided, the response
     * returns all direct connect gateways associated with the VGW. If both are provided, the response only returns the
     * association that matches both the direct connect gateway and the VGW.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     *        Container for the parameters to the DescribeDirectConnectGatewayAssociations operation.
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
     * Returns a list of all direct connect gateway and virtual private gateway (VGW) associations. Either a direct
     * connect gateway ID or a VGW ID must be provided in the request. If a direct connect gateway ID is provided, the
     * response returns all VGWs associated with the direct connect gateway. If a VGW ID is provided, the response
     * returns all direct connect gateways associated with the VGW. If both are provided, the response only returns the
     * association that matches both the direct connect gateway and the VGW.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     *        Container for the parameters to the DescribeDirectConnectGatewayAssociations operation.
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
     * Returns a list of all direct connect gateway and virtual interface (VIF) attachments. Either a direct connect
     * gateway ID or a VIF ID must be provided in the request. If a direct connect gateway ID is provided, the response
     * returns all VIFs attached to the direct connect gateway. If a VIF ID is provided, the response returns all direct
     * connect gateways attached to the VIF. If both are provided, the response only returns the attachment that matches
     * both the direct connect gateway and the VIF.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     *        Container for the parameters to the DescribeDirectConnectGatewayAttachments operation.
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
     * Returns a list of all direct connect gateway and virtual interface (VIF) attachments. Either a direct connect
     * gateway ID or a VIF ID must be provided in the request. If a direct connect gateway ID is provided, the response
     * returns all VIFs attached to the direct connect gateway. If a VIF ID is provided, the response returns all direct
     * connect gateways attached to the VIF. If both are provided, the response only returns the attachment that matches
     * both the direct connect gateway and the VIF.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     *        Container for the parameters to the DescribeDirectConnectGatewayAttachments operation.
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
     * Returns a list of direct connect gateways in your account. Deleted direct connect gateways are not returned. You
     * can provide a direct connect gateway ID in the request to return information about the specific direct connect
     * gateway only. Otherwise, if a direct connect gateway ID is not provided, information about all of your direct
     * connect gateways is returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     *        Container for the parameters to the DescribeDirectConnectGateways operation.
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
     * Returns a list of direct connect gateways in your account. Deleted direct connect gateways are not returned. You
     * can provide a direct connect gateway ID in the request to return information about the specific direct connect
     * gateway only. Otherwise, if a direct connect gateway ID is not provided, information about all of your direct
     * connect gateways is returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     *        Container for the parameters to the DescribeDirectConnectGateways operation.
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
     * Returns a list of hosted connections that have been provisioned on the given interconnect or link aggregation
     * group (LAG).
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     *        Container for the parameters to the DescribeHostedConnections operation.
     * @return A Java Future containing the result of the DescribeHostedConnections operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeHostedConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeHostedConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostedConnectionsResult> describeHostedConnectionsAsync(
            DescribeHostedConnectionsRequest describeHostedConnectionsRequest);

    /**
     * <p>
     * Returns a list of hosted connections that have been provisioned on the given interconnect or link aggregation
     * group (LAG).
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     *        Container for the parameters to the DescribeHostedConnections operation.
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
     * Deprecated in favor of <a>DescribeLoa</a>.
     * </p>
     * <p>
     * Returns the LOA-CFA for an Interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at AWS
     * Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     *        Container for the parameters to the DescribeInterconnectLoa operation.
     * @return A Java Future containing the result of the DescribeInterconnectLoa operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeInterconnectLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnectLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(DescribeInterconnectLoaRequest describeInterconnectLoaRequest);

    /**
     * <p>
     * Deprecated in favor of <a>DescribeLoa</a>.
     * </p>
     * <p>
     * Returns the LOA-CFA for an Interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at AWS
     * Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     *        Container for the parameters to the DescribeInterconnectLoa operation.
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
     * Returns a list of interconnects owned by the AWS account.
     * </p>
     * <p>
     * If an interconnect ID is provided, it will only return this particular interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     *        Container for the parameters to the DescribeInterconnects operation.
     * @return A Java Future containing the result of the DescribeInterconnects operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeInterconnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(DescribeInterconnectsRequest describeInterconnectsRequest);

    /**
     * <p>
     * Returns a list of interconnects owned by the AWS account.
     * </p>
     * <p>
     * If an interconnect ID is provided, it will only return this particular interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     *        Container for the parameters to the DescribeInterconnects operation.
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
     * Describes the link aggregation groups (LAGs) in your account.
     * </p>
     * <p>
     * If a LAG ID is provided, only information about the specified LAG is returned.
     * </p>
     * 
     * @param describeLagsRequest
     *        Container for the parameters to the DescribeLags operation.
     * @return A Java Future containing the result of the DescribeLags operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeLags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLagsResult> describeLagsAsync(DescribeLagsRequest describeLagsRequest);

    /**
     * <p>
     * Describes the link aggregation groups (LAGs) in your account.
     * </p>
     * <p>
     * If a LAG ID is provided, only information about the specified LAG is returned.
     * </p>
     * 
     * @param describeLagsRequest
     *        Container for the parameters to the DescribeLags operation.
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
     * Returns the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at AWS
     * Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeLoaRequest
     *        Container for the parameters to the DescribeLoa operation.
     * @return A Java Future containing the result of the DescribeLoa operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoaResult> describeLoaAsync(DescribeLoaRequest describeLoaRequest);

    /**
     * <p>
     * Returns the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at AWS
     * Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeLoaRequest
     *        Container for the parameters to the DescribeLoa operation.
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
     * Returns the list of AWS Direct Connect locations in the current AWS region. These are the locations that may be
     * selected when calling <a>CreateConnection</a> or <a>CreateInterconnect</a>.
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
     * Returns the list of AWS Direct Connect locations in the current AWS region. These are the locations that may be
     * selected when calling <a>CreateConnection</a> or <a>CreateInterconnect</a>.
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
     * Describes the tags associated with the specified Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     *        Container for the parameters to the DescribeTags operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the tags associated with the specified Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     *        Container for the parameters to the DescribeTags operation.
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
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces linking to a virtual private gateway. A
     * virtual private gateway can be managed via Amazon Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action.
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
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces linking to a virtual private gateway. A
     * virtual private gateway can be managed via Amazon Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action.
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
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     *        Container for the parameters to the DescribeVirtualInterfaces operation.
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
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     *        Container for the parameters to the DescribeVirtualInterfaces operation.
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
     * associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically
     * converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection will cause the LAG to fall below its setting for minimum number of operational
     * connections, the request fails, except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     *        Container for the parameters to the DisassociateConnectionFromLag operation.
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
     * associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically
     * converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection will cause the LAG to fall below its setting for minimum number of operational
     * connections, the request fails, except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     *        Container for the parameters to the DisassociateConnectionFromLag operation.
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
     * Adds the specified tags to the specified Direct Connect resource. Each Direct Connect resource can have a maximum
     * of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * Direct Connect resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     *        Container for the parameters to the TagResource operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDirectConnectAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified Direct Connect resource. Each Direct Connect resource can have a maximum
     * of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * Direct Connect resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     *        Container for the parameters to the TagResource operation.
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
     * Removes one or more tags from the specified Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Container for the parameters to the UntagResource operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDirectConnectAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Container for the parameters to the UntagResource operation.
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
     * Updates the attributes of a link aggregation group (LAG).
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
     * update this value, and the number of operational connections falls below the specified value, the LAG will
     * automatically go down to avoid overutilization of the remaining connections. Adjusting this value should be done
     * with care as it could force the LAG down if the value is set higher than the current number of operational
     * connections.
     * </p>
     * 
     * @param updateLagRequest
     *        Container for the parameters to the UpdateLag operation.
     * @return A Java Future containing the result of the UpdateLag operation returned by the service.
     * @sample AmazonDirectConnectAsync.UpdateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLagResult> updateLagAsync(UpdateLagRequest updateLagRequest);

    /**
     * <p>
     * Updates the attributes of a link aggregation group (LAG).
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
     * update this value, and the number of operational connections falls below the specified value, the LAG will
     * automatically go down to avoid overutilization of the remaining connections. Adjusting this value should be done
     * with care as it could force the LAG down if the value is set higher than the current number of operational
     * connections.
     * </p>
     * 
     * @param updateLagRequest
     *        Container for the parameters to the UpdateLag operation.
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

}
