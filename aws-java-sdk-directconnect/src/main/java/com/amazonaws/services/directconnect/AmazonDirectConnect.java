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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.directconnect.model.*;

/**
 * Interface for accessing AWS Direct Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.directconnect.AbstractAmazonDirectConnect} instead.
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
public interface AmazonDirectConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "directconnect";

    /**
     * Overrides the default endpoint for this client ("https://directconnect.us-east-1.amazonaws.com/"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "https://directconnect.us-east-1.amazonaws.com/"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://directconnect.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonDirectConnect#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @return Result of the AllocateConnectionOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AllocateConnectionOnInterconnect
     */
    AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest);

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
     * @return Result of the AllocatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AllocatePrivateVirtualInterface
     */
    AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest);

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
     * @return Result of the AllocatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AllocatePublicVirtualInterface
     */
    AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest);

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
     * @return Result of the ConfirmConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.ConfirmConnection
     */
    ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest confirmConnectionRequest);

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
     * @return Result of the ConfirmPrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.ConfirmPrivateVirtualInterface
     */
    ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest);

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
     * @return Result of the ConfirmPublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.ConfirmPublicVirtualInterface
     */
    ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest);

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
     * @return Result of the CreateConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateConnection
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest);

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
     * @return Result of the CreateInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateInterconnect
     */
    CreateInterconnectResult createInterconnect(CreateInterconnectRequest createInterconnectRequest);

    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A private virtual interface supports sending traffic to a single virtual private cloud (VPC).
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     *        Container for the parameters to the CreatePrivateVirtualInterface operation.
     * @return Result of the CreatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreatePrivateVirtualInterface
     */
    CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     *        Container for the parameters to the CreatePublicVirtualInterface operation.
     * @return Result of the CreatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreatePublicVirtualInterface
     */
    CreatePublicVirtualInterfaceResult createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest);

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
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteConnection
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest);

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
     * @return Result of the DeleteInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteInterconnect
     */
    DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest deleteInterconnectRequest);

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     *        Container for the parameters to the DeleteVirtualInterface operation.
     * @return Result of the DeleteVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteVirtualInterface
     */
    DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest);

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
     * @return Result of the DescribeConnectionLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeConnectionLoa
     */
    DescribeConnectionLoaResult describeConnectionLoa(DescribeConnectionLoaRequest describeConnectionLoaRequest);

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
     * @return Result of the DescribeConnections operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeConnections
     */
    DescribeConnectionsResult describeConnections(DescribeConnectionsRequest describeConnectionsRequest);

    /**
     * Simplified method form for invoking the DescribeConnections operation.
     *
     * @see #describeConnections(DescribeConnectionsRequest)
     */
    DescribeConnectionsResult describeConnections();

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
     * @return Result of the DescribeConnectionsOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeConnectionsOnInterconnect
     */
    DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest);

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
     * @return Result of the DescribeInterconnectLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeInterconnectLoa
     */
    DescribeInterconnectLoaResult describeInterconnectLoa(DescribeInterconnectLoaRequest describeInterconnectLoaRequest);

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
     * @return Result of the DescribeInterconnects operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeInterconnects
     */
    DescribeInterconnectsResult describeInterconnects(DescribeInterconnectsRequest describeInterconnectsRequest);

    /**
     * Simplified method form for invoking the DescribeInterconnects operation.
     *
     * @see #describeInterconnects(DescribeInterconnectsRequest)
     */
    DescribeInterconnectsResult describeInterconnects();

    /**
     * <p>
     * Returns the list of AWS Direct Connect locations in the current AWS region. These are the locations that may be
     * selected when calling CreateConnection or CreateInterconnect.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return Result of the DescribeLocations operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeLocations
     */
    DescribeLocationsResult describeLocations(DescribeLocationsRequest describeLocationsRequest);

    /**
     * Simplified method form for invoking the DescribeLocations operation.
     *
     * @see #describeLocations(DescribeLocationsRequest)
     */
    DescribeLocationsResult describeLocations();

    /**
     * <p>
     * Describes the tags associated with the specified Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     *        Container for the parameters to the DescribeTags operation.
     * @return Result of the DescribeTags operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeTags
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

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
     * @return Result of the DescribeVirtualGateways operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeVirtualGateways
     */
    DescribeVirtualGatewaysResult describeVirtualGateways(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation.
     *
     * @see #describeVirtualGateways(DescribeVirtualGatewaysRequest)
     */
    DescribeVirtualGatewaysResult describeVirtualGateways();

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
     * @return Result of the DescribeVirtualInterfaces operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeVirtualInterfaces
     */
    DescribeVirtualInterfacesResult describeVirtualInterfaces(DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest);

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces operation.
     *
     * @see #describeVirtualInterfaces(DescribeVirtualInterfacesRequest)
     */
    DescribeVirtualInterfacesResult describeVirtualInterfaces();

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
     * @return Result of the TagResource operation returned by the service.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @throws TooManyTagsException
     *         You have reached the limit on the number of tags that can be assigned to a Direct Connect resource.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.TagResource
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Container for the parameters to the UntagResource operation.
     * @return Result of the UntagResource operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.UntagResource
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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

}
