/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.directconnect.model.*;

/**
 * Interface for accessing AmazonDirectConnect asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * <p>
 * AWS Direct Connect makes it easy to establish a dedicated network connection from your premises to Amazon Web Services (AWS). Using AWS Direct
 * Connect, you can establish private connectivity between AWS and your data center, office, or colocation environment, which in many cases can reduce
 * your network costs, increase bandwidth throughput, and provide a more consistent network experience than Internet-based connections.
 * </p>
 * <p>
 * The AWS Direct Connect API Reference provides descriptions, syntax, and usage examples for each of the actions and data types for AWS Direct Connect.
 * Use the following links to get started using the <i>AWS Direct Connect API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Operations.html"> Actions </a> : An alphabetical list of all AWS
 * Direct Connect actions.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Types.html"> Data Types </a> : An alphabetical list of all AWS Direct
 * Connect data types.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonParameters.html"> Common Parameters </a> : Parameters that all Query
 * actions can use.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonErrors.html"> Common Errors </a> : Client and server errors that all
 * actions can return.</li>
 * <li> <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a> : Itemized regions and endpoints for
 * all AWS products.</li>
 * 
 * </ul> 
 */       
public interface AmazonDirectConnectAsync extends AmazonDirectConnect {
    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is
     * called are also returned. If a virtual interface ID is included then
     * only a single virtual interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the Direct
     * Connect location and the customer.
     * </p>
     *
     * @param describeVirtualInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeVirtualInterfaces operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualInterfaces service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is
     * called are also returned. If a virtual interface ID is included then
     * only a single virtual interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the Direct
     * Connect location and the customer.
     * </p>
     *
     * @param describeVirtualInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeVirtualInterfaces operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualInterfaces service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest,
            AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual
     * interfaces linking to a virtual private gateway. A virtual private
     * gateway can be managed via Amazon Virtual Private Cloud (VPC) console
     * or the <a
     * /AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">
     * EC2 CreateVpnGateway </a> action.
     * </p>
     *
     * @param describeVirtualGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVirtualGateways operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualGateways service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual
     * interfaces linking to a virtual private gateway. A virtual private
     * gateway can be managed via Amazon Virtual Private Cloud (VPC) console
     * or the <a
     * /AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">
     * EC2 CreateVpnGateway </a> action.
     * </p>
     *
     * @param describeVirtualGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVirtualGateways operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualGateways service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest,
            AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays details about a specific connection including the order steps
     * for the connection and the current state of the connection order.
     * </p>
     *
     * @param describeConnectionDetailRequest Container for the necessary
     *           parameters to execute the DescribeConnectionDetail operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnectionDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionDetailResult> describeConnectionDetailAsync(DescribeConnectionDetailRequest describeConnectionDetailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays details about a specific connection including the order steps
     * for the connection and the current state of the connection order.
     * </p>
     *
     * @param describeConnectionDetailRequest Container for the necessary
     *           parameters to execute the DescribeConnectionDetail operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnectionDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionDetailResult> describeConnectionDetailAsync(DescribeConnectionDetailRequest describeConnectionDetailRequest,
            AsyncHandler<DescribeConnectionDetailRequest, DescribeConnectionDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the offerings that are currently available
     * for creating new connections. The results include offerings for all
     * regions.
     * </p>
     * <p>
     * To order a new connection you need to select a specific offering ID.
     * </p>
     *
     * @param describeOfferingsRequest Container for the necessary parameters
     *           to execute the DescribeOfferings operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferings service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingsResult> describeOfferingsAsync(DescribeOfferingsRequest describeOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the offerings that are currently available
     * for creating new connections. The results include offerings for all
     * regions.
     * </p>
     * <p>
     * To order a new connection you need to select a specific offering ID.
     * </p>
     *
     * @param describeOfferingsRequest Container for the necessary parameters
     *           to execute the DescribeOfferings operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferings service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingsResult> describeOfferingsAsync(DescribeOfferingsRequest describeOfferingsRequest,
            AsyncHandler<DescribeOfferingsRequest, DescribeOfferingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, it will only return this particular
     * connection.
     * </p>
     *
     * @param describeConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeConnections operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnections service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest describeConnectionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, it will only return this particular
     * connection.
     * </p>
     *
     * @param describeConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeConnections operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnections service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest describeConnectionsRequest,
            AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays additional ordering step details for a specified offering.
     * </p>
     *
     * @param describeOfferingDetailRequest Container for the necessary
     *           parameters to execute the DescribeOfferingDetail operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferingDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingDetailResult> describeOfferingDetailAsync(DescribeOfferingDetailRequest describeOfferingDetailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays additional ordering step details for a specified offering.
     * </p>
     *
     * @param describeOfferingDetailRequest Container for the necessary
     *           parameters to execute the DescribeOfferingDetail operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferingDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingDetailResult> describeOfferingDetailAsync(DescribeOfferingDetailRequest describeOfferingDetailRequest,
            AsyncHandler<DescribeOfferingDetailRequest, DescribeOfferingDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port and data
     * transfer charges. You separately need to cancel any services or
     * charges for cross-connects or network circuits that connect you to the
     * AWS Direct Connect location with the providers of those services.
     * </p>
     *
     * @param deleteConnectionRequest Container for the necessary parameters
     *           to execute the DeleteConnection operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port and data
     * transfer charges. You separately need to cancel any services or
     * charges for cross-connects or network circuits that connect you to the
     * AWS Direct Connect location with the providers of those services.
     * </p>
     *
     * @param deleteConnectionRequest Container for the necessary parameters
     *           to execute the DeleteConnection operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new network connection between the customer network and a
     * specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to
     * an AWS Direct Connect router. A Direct Connect location provides
     * access to Amazon Web Services in the region it is associated with. You
     * can establish connections with AWS Direct Connect locations in
     * multiple regions, but a connection in one region does not provide
     * connectivity to other regions.
     * </p>
     *
     * @param createConnectionRequest Container for the necessary parameters
     *           to execute the CreateConnection operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         CreateConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new network connection between the customer network and a
     * specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to
     * an AWS Direct Connect router. A Direct Connect location provides
     * access to Amazon Web Services in the region it is associated with. You
     * can establish connections with AWS Direct Connect locations in
     * multiple regions, but a connection in one region does not provide
     * connectivity to other regions.
     * </p>
     *
     * @param createConnectionRequest Container for the necessary parameters
     *           to execute the CreateConnection operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest,
            AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A private virtual
     * interface supports sending traffic to a single Virtual Private Cloud
     * (VPC).
     * </p>
     *
     * @param createPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the CreatePrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A private virtual
     * interface supports sending traffic to a single Virtual Private Cloud
     * (VPC).
     * </p>
     *
     * @param createPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the CreatePrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest,
            AsyncHandler<CreatePrivateVirtualInterfaceRequest, CreatePrivateVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     *
     * @param deleteVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteVirtualInterface operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     *
     * @param deleteVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteVirtualInterface operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest,
            AsyncHandler<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A public virtual
     * interface supports sending traffic to public services of AWS such as
     * Amazon Simple Storage Service (Amazon S3).
     * </p>
     *
     * @param createPublicVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the CreatePublicVirtualInterface operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A public virtual
     * interface supports sending traffic to public services of AWS such as
     * Amazon Simple Storage Service (Amazon S3).
     * </p>
     *
     * @param createPublicVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the CreatePublicVirtualInterface operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest,
            AsyncHandler<CreatePublicVirtualInterfaceRequest, CreatePublicVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        