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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.directconnect.model.*;

/**
 * Interface for accessing AmazonDirectConnect.
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
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonParameters.html"> Common Query Parameters </a> : Parameters that all
 * Query actions can use.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonErrors.html"> Common Errors </a> : Client and server errors that all
 * actions can return.</li>
 * 
 * </ul>
 */
public interface AmazonDirectConnect {

    /**
     * Overrides the default endpoint for this client ("https://directconnect.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://directconnect.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://directconnect.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonDirectConnect#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Returns the list of AWS Direct Connect locations in the current AWS
     * region. These are the locations that may be selected when calling
     * CreateConnection or CreateInterconnect.
     * </p>
     *
     * @param describeLocationsRequest Container for the necessary parameters
     *           to execute the DescribeLocations service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeLocations service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLocationsResult describeLocations(DescribeLocationsRequest describeLocationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accept ownership of a public virtual interface created by another
     * customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the specified
     * virtual interface will be created and made available for handling
     * traffic.
     * </p>
     *
     * @param confirmPublicVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the ConfirmPublicVirtualInterface
     *           service method on AmazonDirectConnect.
     * 
     * @return The response from the ConfirmPublicVirtualInterface service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A private virtual
     * interface supports sending traffic to a single virtual private cloud
     * (VPC).
     * </p>
     *
     * @param createPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the CreatePrivateVirtualInterface
     *           service method on AmazonDirectConnect.
     * 
     * @return The response from the CreatePrivateVirtualInterface service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     *
     * @param deleteVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteVirtualInterface service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DeleteVirtualInterface service method,
     *         as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest) 
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
     *           parameters to execute the CreatePublicVirtualInterface service method
     *           on AmazonDirectConnect.
     * 
     * @return The response from the CreatePublicVirtualInterface service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePublicVirtualInterfaceResult createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new interconnect between a AWS Direct Connect partner's
     * network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * An interconnect is a connection which is capable of hosting other
     * connections. The AWS Direct Connect partner can use an interconnect
     * to provide sub-1Gbps AWS Direct Connect service to tier 2 customers
     * who do not have their own connections. Like a standard connection, an
     * interconnect links the AWS Direct Connect partner's network to an AWS
     * Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet
     * fiber-optic cable. One end is connected to the partner's router, the
     * other to an AWS Direct Connect router.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect partner provisions a
     * connection on their interconnect by calling
     * AllocateConnectionOnInterconnect. The end customer can then connect
     * to AWS resources by creating a virtual interface on their connection,
     * using the VLAN assigned to them by the AWS Direct Connect partner.
     * </p>
     *
     * @param createInterconnectRequest Container for the necessary
     *           parameters to execute the CreateInterconnect service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the CreateInterconnect service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInterconnectResult createInterconnect(CreateInterconnectRequest createInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is
     * called are also returned. If a connection ID is included then only
     * virtual interfaces associated with this connection will be returned.
     * If a virtual interface ID is included then only a single virtual
     * interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS
     * Direct Connect location and the customer.
     * </p>
     * <p>
     * If a connection ID is provided, only virtual interfaces provisioned on
     * the specified connection will be returned. If a virtual interface ID
     * is provided, only this particular virtual interface will be returned.
     * </p>
     *
     * @param describeVirtualInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeVirtualInterfaces service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeVirtualInterfaces service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVirtualInterfacesResult describeVirtualInterfaces(DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Confirm the creation of a hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the 'Ordering'
     * state, and will remain in this state until the owner calls
     * ConfirmConnection to confirm creation of the hosted connection.
     * </p>
     *
     * @param confirmConnectionRequest Container for the necessary parameters
     *           to execute the ConfirmConnection service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the ConfirmConnection service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest confirmConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of interconnects owned by the AWS account.
     * </p>
     * <p>
     * If an interconnect ID is provided, it will only return this particular
     * interconnect.
     * </p>
     *
     * @param describeInterconnectsRequest Container for the necessary
     *           parameters to execute the DescribeInterconnects service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeInterconnects service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInterconnectsResult describeInterconnects(DescribeInterconnectsRequest describeInterconnectsRequest) 
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
     *           parameters to execute the DescribeVirtualGateways service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeVirtualGateways service method,
     *         as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVirtualGatewaysResult describeVirtualGateways(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accept ownership of a private virtual interface created by another
     * customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual
     * interface will be created and attached to the given virtual private
     * gateway, and will be available for handling traffic.
     * </p>
     *
     * @param confirmPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the ConfirmPrivateVirtualInterface
     *           service method on AmazonDirectConnect.
     * 
     * @return The response from the ConfirmPrivateVirtualInterface service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, the call returns only that particular
     * connection.
     * </p>
     *
     * @param describeConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeConnections service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeConnections service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest describeConnectionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provisions a public virtual interface to be owned by a different
     * customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public
     * virtual interface which will be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by
     * the virtual interface owner by calling ConfirmPublicVirtualInterface.
     * Until this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     *
     * @param allocatePublicVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the AllocatePublicVirtualInterface
     *           service method on AmazonDirectConnect.
     * 
     * @return The response from the AllocatePublicVirtualInterface service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provisions a private virtual interface to be owned by a different
     * customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a private
     * virtual interface which will be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by
     * the virtual interface owner by calling ConfirmPrivateVirtualInterface.
     * Until this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     *
     * @param allocatePrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the AllocatePrivateVirtualInterface
     *           service method on AmazonDirectConnect.
     * 
     * @return The response from the AllocatePrivateVirtualInterface service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and
     * data transfer charges. You need to cancel separately with the
     * providers any services or charges for cross-connects or network
     * circuits that connect you to the AWS Direct Connect location.
     * </p>
     *
     * @param deleteConnectionRequest Container for the necessary parameters
     *           to execute the DeleteConnection service method on AmazonDirectConnect.
     * 
     * @return The response from the DeleteConnection service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Return a list of connections that have been provisioned on the given
     * interconnect.
     * </p>
     *
     * @param describeConnectionsOnInterconnectRequest Container for the
     *           necessary parameters to execute the DescribeConnectionsOnInterconnect
     *           service method on AmazonDirectConnect.
     * 
     * @return The response from the DescribeConnectionsOnInterconnect
     *         service method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by
     * a hosted connection on the given interconnect.
     * </p>
     *
     * @param allocateConnectionOnInterconnectRequest Container for the
     *           necessary parameters to execute the AllocateConnectionOnInterconnect
     *           service method on AmazonDirectConnect.
     * 
     * @return The response from the AllocateConnectionOnInterconnect service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new connection between the customer network and a specific
     * AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to
     * an AWS Direct Connect router. An AWS Direct Connect location provides
     * access to Amazon Web Services in the region it is associated with. You
     * can establish connections with AWS Direct Connect locations in
     * multiple regions, but a connection in one region does not provide
     * connectivity to other regions.
     * </p>
     *
     * @param createConnectionRequest Container for the necessary parameters
     *           to execute the CreateConnection service method on AmazonDirectConnect.
     * 
     * @return The response from the CreateConnection service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     *
     * @param deleteInterconnectRequest Container for the necessary
     *           parameters to execute the DeleteInterconnect service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DeleteInterconnect service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest deleteInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the list of AWS Direct Connect locations in the current AWS
     * region. These are the locations that may be selected when calling
     * CreateConnection or CreateInterconnect.
     * </p>
     * 
     * @return The response from the DescribeLocations service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLocationsResult describeLocations() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is
     * called are also returned. If a connection ID is included then only
     * virtual interfaces associated with this connection will be returned.
     * If a virtual interface ID is included then only a single virtual
     * interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS
     * Direct Connect location and the customer.
     * </p>
     * <p>
     * If a connection ID is provided, only virtual interfaces provisioned on
     * the specified connection will be returned. If a virtual interface ID
     * is provided, only this particular virtual interface will be returned.
     * </p>
     * 
     * @return The response from the DescribeVirtualInterfaces service
     *         method, as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVirtualInterfacesResult describeVirtualInterfaces() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of interconnects owned by the AWS account.
     * </p>
     * <p>
     * If an interconnect ID is provided, it will only return this particular
     * interconnect.
     * </p>
     * 
     * @return The response from the DescribeInterconnects service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInterconnectsResult describeInterconnects() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeVirtualGateways service method,
     *         as returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVirtualGatewaysResult describeVirtualGateways() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, the call returns only that particular
     * connection.
     * </p>
     * 
     * @return The response from the DescribeConnections service method, as
     *         returned by AmazonDirectConnect.
     * 
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConnectionsResult describeConnections() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        