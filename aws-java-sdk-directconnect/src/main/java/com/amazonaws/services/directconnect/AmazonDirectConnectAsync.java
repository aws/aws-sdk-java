/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public interface AmazonDirectConnectAsync extends AmazonDirectConnect {

    /**
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
     */
    java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest);

    /**
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
     */
    java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateConnectionOnInterconnectRequest, AllocateConnectionOnInterconnectResult> asyncHandler);

    /**
     * <p>
     * Provisions a private virtual interface to be owned by a different customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a private virtual interface which will be owned by
     * another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the virtual interface owner by calling
     * ConfirmPrivateVirtualInterface. Until this step has been completed, the virtual interface will be in 'Confirming'
     * state, and will not be available for handling traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePrivateVirtualInterface operation.
     * @return A Java Future containing the result of the AllocatePrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.AllocatePrivateVirtualInterface
     */
    java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Provisions a private virtual interface to be owned by a different customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a private virtual interface which will be owned by
     * another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the virtual interface owner by calling
     * ConfirmPrivateVirtualInterface. Until this step has been completed, the virtual interface will be in 'Confirming'
     * state, and will not be available for handling traffic.
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
     * 
     * @param allocatePublicVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePublicVirtualInterface operation.
     * @return A Java Future containing the result of the AllocatePublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.AllocatePublicVirtualInterface
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
     */
    java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(
            AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<AllocatePublicVirtualInterfaceRequest, AllocatePublicVirtualInterfaceResult> asyncHandler);

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
     */
    java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(ConfirmConnectionRequest confirmConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmConnectionRequest, ConfirmConnectionResult> asyncHandler);

    /**
     * <p>
     * Accept ownership of a private virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual interface will be created and attached to the
     * given virtual private gateway, and will be available for handling traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPrivateVirtualInterface operation.
     * @return A Java Future containing the result of the ConfirmPrivateVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.ConfirmPrivateVirtualInterface
     */
    java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(
            ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Accept ownership of a private virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual interface will be created and attached to the
     * given virtual private gateway, and will be available for handling traffic.
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
     */
    java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(
            ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmPublicVirtualInterfaceRequest, ConfirmPublicVirtualInterfaceResult> asyncHandler);

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
     * 
     * @param createConnectionRequest
     *        Container for the parameters to the CreateConnection operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AmazonDirectConnectAsync.CreateConnection
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
     * 
     * @param createConnectionRequest
     *        Container for the parameters to the CreateConnection operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.CreateConnection
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler);

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
     */
    java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(CreateInterconnectRequest createInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInterconnectRequest, CreateInterconnectResult> asyncHandler);

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
     * 
     * @param createPublicVirtualInterfaceRequest
     *        Container for the parameters to the CreatePublicVirtualInterface operation.
     * @return A Java Future containing the result of the CreatePublicVirtualInterface operation returned by the
     *         service.
     * @sample AmazonDirectConnectAsync.CreatePublicVirtualInterface
     */
    java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(
            CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon Simple
     * Storage Service (Amazon S3).
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
     */
    java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(
            CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePublicVirtualInterfaceRequest, CreatePublicVirtualInterfaceResult> asyncHandler);

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
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler);

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
     */
    java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(DeleteInterconnectRequest deleteInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInterconnectRequest, DeleteInterconnectResult> asyncHandler);

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     *        Container for the parameters to the DeleteVirtualInterface operation.
     * @return A Java Future containing the result of the DeleteVirtualInterface operation returned by the service.
     * @sample AmazonDirectConnectAsync.DeleteVirtualInterface
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
     */
    java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResult> asyncHandler);

    /**
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
     */
    java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(DescribeConnectionLoaRequest describeConnectionLoaRequest);

    /**
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
     */
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
     * Return a list of connections that have been provisioned on the given interconnect.
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
     */
    java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest);

    /**
     * <p>
     * Return a list of connections that have been provisioned on the given interconnect.
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
     */
    java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsOnInterconnectRequest, DescribeConnectionsOnInterconnectResult> asyncHandler);

    /**
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
     */
    java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(DescribeInterconnectLoaRequest describeInterconnectLoaRequest);

    /**
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
     */
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
     * Returns the list of AWS Direct Connect locations in the current AWS region. These are the locations that may be
     * selected when calling CreateConnection or CreateInterconnect.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return A Java Future containing the result of the DescribeLocations operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeLocations
     */
    java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(DescribeLocationsRequest describeLocationsRequest);

    /**
     * <p>
     * Returns the list of AWS Direct Connect locations in the current AWS region. These are the locations that may be
     * selected when calling CreateConnection or CreateInterconnect.
     * </p>
     * 
     * @param describeLocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocations operation returned by the service.
     * @sample AmazonDirectConnectAsyncHandler.DescribeLocations
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
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before
     * DescribeVirtualInterfaces is called are also returned. If a connection ID is included then only virtual
     * interfaces associated with this connection will be returned. If a virtual interface ID is included then only a
     * single virtual interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.
     * </p>
     * <p>
     * If a connection ID is provided, only virtual interfaces provisioned on the specified connection will be returned.
     * If a virtual interface ID is provided, only this particular virtual interface will be returned.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     *        Container for the parameters to the DescribeVirtualInterfaces operation.
     * @return A Java Future containing the result of the DescribeVirtualInterfaces operation returned by the service.
     * @sample AmazonDirectConnectAsync.DescribeVirtualInterfaces
     */
    java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest);

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before
     * DescribeVirtualInterfaces is called are also returned. If a connection ID is included then only virtual
     * interfaces associated with this connection will be returned. If a virtual interface ID is included then only a
     * single virtual interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.
     * </p>
     * <p>
     * If a connection ID is provided, only virtual interfaces provisioned on the specified connection will be returned.
     * If a virtual interface ID is provided, only this particular virtual interface will be returned.
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
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
