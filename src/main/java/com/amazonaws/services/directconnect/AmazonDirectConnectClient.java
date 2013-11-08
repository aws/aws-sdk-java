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
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonParameters.html"> Common Query Parameters </a> : Parameters that all
 * Query actions can use.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonErrors.html"> Common Errors </a> : Client and server errors that all
 * actions can return.</li>
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
        setEndpoint("directconnect.us-east-1.amazonaws.com/");

        signer = new AWS4Signer();
        
        signer.setServiceName("directconnect");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/directconnect/request.handlers"));

        
    }

    
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeLocationsRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeLocationsRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DescribeLocationsRequestMarshaller().marshall(describeLocationsRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DescribeLocationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeLocationsResultJsonUnmarshaller();

        JsonResponseHandler<DescribeLocationsResult> responseHandler = new JsonResponseHandler<DescribeLocationsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(confirmPublicVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ConfirmPublicVirtualInterfaceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ConfirmPublicVirtualInterfaceRequestMarshaller().marshall(confirmPublicVirtualInterfaceRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ConfirmPublicVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new ConfirmPublicVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<ConfirmPublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<ConfirmPublicVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createPrivateVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreatePrivateVirtualInterfaceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreatePrivateVirtualInterfaceRequestMarshaller().marshall(createPrivateVirtualInterfaceRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

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
        Request<DeleteVirtualInterfaceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteVirtualInterfaceRequestMarshaller().marshall(deleteVirtualInterfaceRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

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
        Request<CreatePublicVirtualInterfaceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreatePublicVirtualInterfaceRequestMarshaller().marshall(createPublicVirtualInterfaceRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<CreatePublicVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new CreatePublicVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<CreatePublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreatePublicVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createInterconnectRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateInterconnectRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreateInterconnectRequestMarshaller().marshall(createInterconnectRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<CreateInterconnectResult, JsonUnmarshallerContext> unmarshaller = new CreateInterconnectResultJsonUnmarshaller();

        JsonResponseHandler<CreateInterconnectResult> responseHandler = new JsonResponseHandler<CreateInterconnectResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeVirtualInterfacesRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeVirtualInterfacesRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DescribeVirtualInterfacesRequestMarshaller().marshall(describeVirtualInterfacesRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DescribeVirtualInterfacesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualInterfacesResultJsonUnmarshaller();

        JsonResponseHandler<DescribeVirtualInterfacesResult> responseHandler = new JsonResponseHandler<DescribeVirtualInterfacesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(confirmConnectionRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ConfirmConnectionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ConfirmConnectionRequestMarshaller().marshall(confirmConnectionRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ConfirmConnectionResult, JsonUnmarshallerContext> unmarshaller = new ConfirmConnectionResultJsonUnmarshaller();

        JsonResponseHandler<ConfirmConnectionResult> responseHandler = new JsonResponseHandler<ConfirmConnectionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeInterconnectsRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeInterconnectsRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DescribeInterconnectsRequestMarshaller().marshall(describeInterconnectsRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DescribeInterconnectsResult, JsonUnmarshallerContext> unmarshaller = new DescribeInterconnectsResultJsonUnmarshaller();

        JsonResponseHandler<DescribeInterconnectsResult> responseHandler = new JsonResponseHandler<DescribeInterconnectsResult>(unmarshaller);

        

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
        Request<DescribeVirtualGatewaysRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DescribeVirtualGatewaysRequestMarshaller().marshall(describeVirtualGatewaysRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DescribeVirtualGatewaysResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualGatewaysResultJsonUnmarshaller();

        JsonResponseHandler<DescribeVirtualGatewaysResult> responseHandler = new JsonResponseHandler<DescribeVirtualGatewaysResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(confirmPrivateVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ConfirmPrivateVirtualInterfaceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ConfirmPrivateVirtualInterfaceRequestMarshaller().marshall(confirmPrivateVirtualInterfaceRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ConfirmPrivateVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new ConfirmPrivateVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<ConfirmPrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<ConfirmPrivateVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeConnectionsRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DescribeConnectionsRequestMarshaller().marshall(describeConnectionsRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DescribeConnectionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionsResultJsonUnmarshaller();

        JsonResponseHandler<DescribeConnectionsResult> responseHandler = new JsonResponseHandler<DescribeConnectionsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(allocatePublicVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AllocatePublicVirtualInterfaceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AllocatePublicVirtualInterfaceRequestMarshaller().marshall(allocatePublicVirtualInterfaceRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<AllocatePublicVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new AllocatePublicVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<AllocatePublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AllocatePublicVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(allocatePrivateVirtualInterfaceRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AllocatePrivateVirtualInterfaceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AllocatePrivateVirtualInterfaceRequestMarshaller().marshall(allocatePrivateVirtualInterfaceRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<AllocatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new AllocatePrivateVirtualInterfaceResultJsonUnmarshaller();

        JsonResponseHandler<AllocatePrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AllocatePrivateVirtualInterfaceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteConnectionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteConnectionRequestMarshaller().marshall(deleteConnectionRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DeleteConnectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteConnectionResultJsonUnmarshaller();

        JsonResponseHandler<DeleteConnectionResult> responseHandler = new JsonResponseHandler<DeleteConnectionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(describeConnectionsOnInterconnectRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeConnectionsOnInterconnectRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DescribeConnectionsOnInterconnectRequestMarshaller().marshall(describeConnectionsOnInterconnectRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DescribeConnectionsOnInterconnectResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionsOnInterconnectResultJsonUnmarshaller();

        JsonResponseHandler<DescribeConnectionsOnInterconnectResult> responseHandler = new JsonResponseHandler<DescribeConnectionsOnInterconnectResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(allocateConnectionOnInterconnectRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AllocateConnectionOnInterconnectRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AllocateConnectionOnInterconnectRequestMarshaller().marshall(allocateConnectionOnInterconnectRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<AllocateConnectionOnInterconnectResult, JsonUnmarshallerContext> unmarshaller = new AllocateConnectionOnInterconnectResultJsonUnmarshaller();

        JsonResponseHandler<AllocateConnectionOnInterconnectResult> responseHandler = new JsonResponseHandler<AllocateConnectionOnInterconnectResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateConnectionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreateConnectionRequestMarshaller().marshall(createConnectionRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<CreateConnectionResult, JsonUnmarshallerContext> unmarshaller = new CreateConnectionResultJsonUnmarshaller();

        JsonResponseHandler<CreateConnectionResult> responseHandler = new JsonResponseHandler<CreateConnectionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(deleteInterconnectRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteInterconnectRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteInterconnectRequestMarshaller().marshall(deleteInterconnectRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DeleteInterconnectResult, JsonUnmarshallerContext> unmarshaller = new DeleteInterconnectResultJsonUnmarshaller();

        JsonResponseHandler<DeleteInterconnectResult> responseHandler = new JsonResponseHandler<DeleteInterconnectResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
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
    public DescribeLocationsResult describeLocations() throws AmazonServiceException, AmazonClientException {
        return describeLocations(new DescribeLocationsRequest());
    }
    
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
    public DescribeVirtualInterfacesResult describeVirtualInterfaces() throws AmazonServiceException, AmazonClientException {
        return describeVirtualInterfaces(new DescribeVirtualInterfacesRequest());
    }
    
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
    public DescribeInterconnectsResult describeInterconnects() throws AmazonServiceException, AmazonClientException {
        return describeInterconnects(new DescribeInterconnectsRequest());
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
    public DescribeConnectionsResult describeConnections() throws AmazonServiceException, AmazonClientException {
        return describeConnections(new DescribeConnectionsRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("https://directconnect.us-east-1.amazonaws.com/") and explicitly provides
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
     * Callers can pass in just the endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://directconnect.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://directconnect.us-east-1.amazonaws.com/") of
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
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);

        
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        X result = (X) client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        awsRequestMetrics.log();
        return result;
    }
}
        