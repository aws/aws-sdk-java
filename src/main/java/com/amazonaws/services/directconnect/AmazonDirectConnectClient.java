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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.services.directconnect.model.transform.*;


/**
 * Client for accessing AmazonDirectConnect.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
public class AmazonDirectConnectClient extends AmazonWebServiceClient implements AmazonDirectConnect {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDirectConnect.class);

    /**
     * List of exception unmarshallers for all AmazonDirectConnect exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonDirectConnect.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDirectConnectClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDirectConnect.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonDirectConnect
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDirectConnectClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonDirectConnectClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonDirectConnect
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDirectConnectClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonDirectConnect
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new DirectConnectServerExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DirectConnectClientExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("directConnect.us-east-1.amazonaws.com/");

        signer = new AWS4Signer();
        
        signer.setServiceName("directconnect");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/directconnect/request.handlers"));

        
    }

    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeVirtualInterfacesRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeVirtualInterfacesRequest> request = new DescribeVirtualInterfacesRequestMarshaller().marshall(describeVirtualInterfacesRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeVirtualInterfacesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualInterfacesResultJsonUnmarshaller();

        JsonResponseHandler<DescribeVirtualInterfacesResult> responseHandler = new JsonResponseHandler<DescribeVirtualInterfacesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeVirtualGatewaysRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeVirtualGatewaysRequest> request = new DescribeVirtualGatewaysRequestMarshaller().marshall(describeVirtualGatewaysRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeVirtualGatewaysResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualGatewaysResultJsonUnmarshaller();

        JsonResponseHandler<DescribeVirtualGatewaysResult> responseHandler = new JsonResponseHandler<DescribeVirtualGatewaysResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Displays details about a specific connection including the order steps
     * for the connection and the current state of the connection order.
     * </p>
     *
     * @param describeConnectionDetailRequest Container for the necessary
     *           parameters to execute the DescribeConnectionDetail service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeConnectionDetail service method,
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
    public DescribeConnectionDetailResult describeConnectionDetail(DescribeConnectionDetailRequest describeConnectionDetailRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeConnectionDetailRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeConnectionDetailRequest> request = new DescribeConnectionDetailRequestMarshaller().marshall(describeConnectionDetailRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeConnectionDetailResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionDetailResultJsonUnmarshaller();

        JsonResponseHandler<DescribeConnectionDetailResult> responseHandler = new JsonResponseHandler<DescribeConnectionDetailResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
     *           to execute the DescribeOfferings service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeOfferings service method, as
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
    public DescribeOfferingsResult describeOfferings(DescribeOfferingsRequest describeOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeOfferingsRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeOfferingsRequest> request = new DescribeOfferingsRequestMarshaller().marshall(describeOfferingsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeOfferingsResult, JsonUnmarshallerContext> unmarshaller = new DescribeOfferingsResultJsonUnmarshaller();

        JsonResponseHandler<DescribeOfferingsResult> responseHandler = new JsonResponseHandler<DescribeOfferingsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeConnectionsRequest> request = new DescribeConnectionsRequestMarshaller().marshall(describeConnectionsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeConnectionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionsResultJsonUnmarshaller();

        JsonResponseHandler<DescribeConnectionsResult> responseHandler = new JsonResponseHandler<DescribeConnectionsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Displays additional ordering step details for a specified offering.
     * </p>
     *
     * @param describeOfferingDetailRequest Container for the necessary
     *           parameters to execute the DescribeOfferingDetail service method on
     *           AmazonDirectConnect.
     * 
     * @return The response from the DescribeOfferingDetail service method,
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
    public DescribeOfferingDetailResult describeOfferingDetail(DescribeOfferingDetailRequest describeOfferingDetailRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeOfferingDetailRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeOfferingDetailRequest> request = new DescribeOfferingDetailRequestMarshaller().marshall(describeOfferingDetailRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeOfferingDetailResult, JsonUnmarshallerContext> unmarshaller = new DescribeOfferingDetailResultJsonUnmarshaller();

        JsonResponseHandler<DescribeOfferingDetailResult> responseHandler = new JsonResponseHandler<DescribeOfferingDetailResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteConnectionRequest> request = new DeleteConnectionRequestMarshaller().marshall(deleteConnectionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DeleteConnectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteConnectionResultJsonUnmarshaller();

        JsonResponseHandler<DeleteConnectionResult> responseHandler = new JsonResponseHandler<DeleteConnectionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateConnectionRequest> request = new CreateConnectionRequestMarshaller().marshall(createConnectionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateConnectionResult, JsonUnmarshallerContext> unmarshaller = new CreateConnectionResultJsonUnmarshaller();

        JsonResponseHandler<CreateConnectionResult> responseHandler = new JsonResponseHandler<CreateConnectionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createPrivateVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreatePrivateVirtualInterfaceRequest> request = new CreatePrivateVirtualInterfaceRequestMarshaller().marshall(createPrivateVirtualInterfaceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new CreatePrivateVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<CreatePrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreatePrivateVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(deleteVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteVirtualInterfaceRequest> request = new DeleteVirtualInterfaceRequestMarshaller().marshall(deleteVirtualInterfaceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DeleteVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new DeleteVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<DeleteVirtualInterfaceResult> responseHandler = new JsonResponseHandler<DeleteVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createPublicVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreatePublicVirtualInterfaceRequest> request = new CreatePublicVirtualInterfaceRequestMarshaller().marshall(createPublicVirtualInterfaceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreatePublicVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new CreatePublicVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<CreatePublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreatePublicVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
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
    public DescribeVirtualInterfacesResult describeVirtualInterfaces() throws AmazonServiceException, AmazonClientException {
        return describeVirtualInterfaces(new DescribeVirtualInterfacesRequest());
    }
    
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
    public DescribeVirtualGatewaysResult describeVirtualGateways() throws AmazonServiceException, AmazonClientException {
        return describeVirtualGateways(new DescribeVirtualGatewaysRequest());
    }
    
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
     * @return The response from the DescribeOfferings service method, as
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
    public DescribeOfferingsResult describeOfferings() throws AmazonServiceException, AmazonClientException {
        return describeOfferings(new DescribeOfferingsRequest());
    }
    
    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, it will only return this particular
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
    public DescribeConnectionsResult describeConnections() throws AmazonServiceException, AmazonClientException {
        return describeConnections(new DescribeConnectionsRequest());
    }
    
    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A private virtual
     * interface supports sending traffic to a single Virtual Private Cloud
     * (VPC).
     * </p>
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
    public CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface() throws AmazonServiceException, AmazonClientException {
        return createPrivateVirtualInterface(new CreatePrivateVirtualInterfaceRequest());
    }
    
    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
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
    public DeleteVirtualInterfaceResult deleteVirtualInterface() throws AmazonServiceException, AmazonClientException {
        return deleteVirtualInterface(new DeleteVirtualInterfaceRequest());
    }
    
    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A public virtual
     * interface supports sending traffic to public services of AWS such as
     * Amazon Simple Storage Service (Amazon S3).
     * </p>
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
    public CreatePublicVirtualInterfaceResult createPublicVirtualInterface() throws AmazonServiceException, AmazonClientException {
        return createPublicVirtualInterface(new CreatePublicVirtualInterfaceRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("http://directConnect.us-east-1.amazonaws.com/") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "directConnect.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "http://directConnect.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "directConnect.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "http://directConnect.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     * @see AmazonDynamoDB#setRegion(Region)
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "directconnect";
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                                                HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
                                                                ExecutionContext executionContext) throws AmazonClientException {

        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();

        awsRequestMetrics.startEvent(Field.CredentialsRequestTime.name());
        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        awsRequestMetrics.endEvent(Field.CredentialsRequestTime.name());

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);

        
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);

        awsRequestMetrics.startEvent(Field.ClientExecuteTime.name());
        X result = (X) client.execute(request, responseHandler, errorResponseHandler, executionContext);
        awsRequestMetrics.endEvent(Field.ClientExecuteTime.name());

        awsRequestMetrics.log();

        return result;
    }
}
        