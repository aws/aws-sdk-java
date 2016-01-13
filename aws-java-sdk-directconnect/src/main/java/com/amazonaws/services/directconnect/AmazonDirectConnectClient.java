/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.services.directconnect.model.transform.*;

/**
 * Client for accessing AWS Direct Connect. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * AWS Direct Connect makes it easy to establish a dedicated network connection
 * from your premises to Amazon Web Services (AWS). Using AWS Direct Connect,
 * you can establish private connectivity between AWS and your data center,
 * office, or colocation environment, which in many cases can reduce your
 * network costs, increase bandwidth throughput, and provide a more consistent
 * network experience than Internet-based connections.
 * </p>
 * <p>
 * The AWS Direct Connect API Reference provides descriptions, syntax, and usage
 * examples for each of the actions and data types for AWS Direct Connect. Use
 * the following links to get started using the <i>AWS Direct Connect API
 * Reference</i>:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Operations.html"
 * >Actions</a>: An alphabetical list of all AWS Direct Connect actions.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Types.html"
 * >Data Types</a>: An alphabetical list of all AWS Direct Connect data types.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonParameters.html"
 * >Common Query Parameters</a>: Parameters that all Query actions can use.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonErrors.html"
 * >Common Errors</a>: Client and server errors that all actions can return.</li>
 * </ul>
 */
public class AmazonDirectConnectClient extends AmazonWebServiceClient implements
        AmazonDirectConnect {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDirectConnect.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "directconnect";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "directconnect";

    /**
     * List of exception unmarshallers for all AWS Direct Connect exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDirectConnectClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Direct Connect (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDirectConnectClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonDirectConnectClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Direct Connect (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonDirectConnectClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonDirectConnectClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Direct Connect (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonDirectConnectClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Direct Connect (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonDirectConnectClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directconnect.model.DirectConnectClientException.class,
                        "DirectConnectClientException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directconnect.model.DirectConnectServerException.class,
                        "DirectConnectServerException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://directconnect.us-east-1.amazonaws.com/");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/directconnect/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/directconnect/request.handler2s"));
    }

    /**
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a
     * hosted connection on the given interconnect.
     * </p>
     * 
     * @param allocateConnectionOnInterconnectRequest
     *        Container for the parameters to the
     *        AllocateConnectionOnInterconnect operation.
     * @return Result of the AllocateConnectionOnInterconnect operation returned
     *         by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.AllocateConnectionOnInterconnect
     */
    @Override
    public AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest) {
        ExecutionContext executionContext = createExecutionContext(allocateConnectionOnInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateConnectionOnInterconnectRequest> request = null;
        Response<AllocateConnectionOnInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateConnectionOnInterconnectRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(allocateConnectionOnInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AllocateConnectionOnInterconnectResult> responseHandler = new JsonResponseHandler<AllocateConnectionOnInterconnectResult>(
                    new AllocateConnectionOnInterconnectResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * Virtual interfaces created using this function must be confirmed by the
     * virtual interface owner by calling ConfirmPrivateVirtualInterface. Until
     * this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     *        Container for the parameters to the
     *        AllocatePrivateVirtualInterface operation.
     * @return Result of the AllocatePrivateVirtualInterface operation returned
     *         by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.AllocatePrivateVirtualInterface
     */
    @Override
    public AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(
            AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(allocatePrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocatePrivateVirtualInterfaceRequest> request = null;
        Response<AllocatePrivateVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocatePrivateVirtualInterfaceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(allocatePrivateVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AllocatePrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AllocatePrivateVirtualInterfaceResult>(
                    new AllocatePrivateVirtualInterfaceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * Virtual interfaces created using this function must be confirmed by the
     * virtual interface owner by calling ConfirmPublicVirtualInterface. Until
     * this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePublicVirtualInterface
     *        operation.
     * @return Result of the AllocatePublicVirtualInterface operation returned
     *         by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.AllocatePublicVirtualInterface
     */
    @Override
    public AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(
            AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(allocatePublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocatePublicVirtualInterfaceRequest> request = null;
        Response<AllocatePublicVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocatePublicVirtualInterfaceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(allocatePublicVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AllocatePublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AllocatePublicVirtualInterfaceResult>(
                    new AllocatePublicVirtualInterfaceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @param confirmConnectionRequest
     *        Container for the parameters to the ConfirmConnection operation.
     * @return Result of the ConfirmConnection operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.ConfirmConnection
     */
    @Override
    public ConfirmConnectionResult confirmConnection(
            ConfirmConnectionRequest confirmConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmConnectionRequest> request = null;
        Response<ConfirmConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmConnectionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(confirmConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ConfirmConnectionResult> responseHandler = new JsonResponseHandler<ConfirmConnectionResult>(
                    new ConfirmConnectionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @param confirmPrivateVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPrivateVirtualInterface
     *        operation.
     * @return Result of the ConfirmPrivateVirtualInterface operation returned
     *         by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.ConfirmPrivateVirtualInterface
     */
    @Override
    public ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(
            ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmPrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmPrivateVirtualInterfaceRequest> request = null;
        Response<ConfirmPrivateVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmPrivateVirtualInterfaceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(confirmPrivateVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ConfirmPrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<ConfirmPrivateVirtualInterfaceResult>(
                    new ConfirmPrivateVirtualInterfaceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @param confirmPublicVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPublicVirtualInterface
     *        operation.
     * @return Result of the ConfirmPublicVirtualInterface operation returned by
     *         the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.ConfirmPublicVirtualInterface
     */
    @Override
    public ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(
            ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmPublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmPublicVirtualInterfaceRequest> request = null;
        Response<ConfirmPublicVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmPublicVirtualInterfaceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(confirmPublicVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ConfirmPublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<ConfirmPublicVirtualInterfaceResult>(
                    new ConfirmPublicVirtualInterfaceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new connection between the customer network and a specific AWS
     * Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to an
     * AWS Direct Connect router. An AWS Direct Connect location provides access
     * to Amazon Web Services in the region it is associated with. You can
     * establish connections with AWS Direct Connect locations in multiple
     * regions, but a connection in one region does not provide connectivity to
     * other regions.
     * </p>
     * 
     * @param createConnectionRequest
     *        Container for the parameters to the CreateConnection operation.
     * @return Result of the CreateConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.CreateConnection
     */
    @Override
    public CreateConnectionResult createConnection(
            CreateConnectionRequest createConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionRequest> request = null;
        Response<CreateConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateConnectionResult> responseHandler = new JsonResponseHandler<CreateConnectionResult>(
                    new CreateConnectionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new interconnect between a AWS Direct Connect partner's network
     * and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * An interconnect is a connection which is capable of hosting other
     * connections. The AWS Direct Connect partner can use an interconnect to
     * provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do
     * not have their own connections. Like a standard connection, an
     * interconnect links the AWS Direct Connect partner's network to an AWS
     * Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet
     * fiber-optic cable. One end is connected to the partner's router, the
     * other to an AWS Direct Connect router.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect partner provisions a
     * connection on their interconnect by calling
     * AllocateConnectionOnInterconnect. The end customer can then connect to
     * AWS resources by creating a virtual interface on their connection, using
     * the VLAN assigned to them by the AWS Direct Connect partner.
     * </p>
     * 
     * @param createInterconnectRequest
     *        Container for the parameters to the CreateInterconnect operation.
     * @return Result of the CreateInterconnect operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.CreateInterconnect
     */
    @Override
    public CreateInterconnectResult createInterconnect(
            CreateInterconnectRequest createInterconnectRequest) {
        ExecutionContext executionContext = createExecutionContext(createInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInterconnectRequest> request = null;
        Response<CreateInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInterconnectRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateInterconnectResult> responseHandler = new JsonResponseHandler<CreateInterconnectResult>(
                    new CreateInterconnectResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the VLAN
     * that transports AWS Direct Connect traffic. A private virtual interface
     * supports sending traffic to a single virtual private cloud (VPC).
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     *        Container for the parameters to the CreatePrivateVirtualInterface
     *        operation.
     * @return Result of the CreatePrivateVirtualInterface operation returned by
     *         the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.CreatePrivateVirtualInterface
     */
    @Override
    public CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(
            CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(createPrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePrivateVirtualInterfaceRequest> request = null;
        Response<CreatePrivateVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePrivateVirtualInterfaceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createPrivateVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreatePrivateVirtualInterfaceResult>(
                    new CreatePrivateVirtualInterfaceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the VLAN
     * that transports AWS Direct Connect traffic. A public virtual interface
     * supports sending traffic to public services of AWS such as Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     *        Container for the parameters to the CreatePublicVirtualInterface
     *        operation.
     * @return Result of the CreatePublicVirtualInterface operation returned by
     *         the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.CreatePublicVirtualInterface
     */
    @Override
    public CreatePublicVirtualInterfaceResult createPublicVirtualInterface(
            CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(createPublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePublicVirtualInterfaceRequest> request = null;
        Response<CreatePublicVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePublicVirtualInterfaceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createPublicVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreatePublicVirtualInterfaceResult>(
                    new CreatePublicVirtualInterfaceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and
     * data transfer charges. You need to cancel separately with the providers
     * any services or charges for cross-connects or network circuits that
     * connect you to the AWS Direct Connect location.
     * </p>
     * 
     * @param deleteConnectionRequest
     *        Container for the parameters to the DeleteConnection operation.
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DeleteConnection
     */
    @Override
    public DeleteConnectionResult deleteConnection(
            DeleteConnectionRequest deleteConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteConnectionResult> responseHandler = new JsonResponseHandler<DeleteConnectionResult>(
                    new DeleteConnectionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     * 
     * @param deleteInterconnectRequest
     *        Container for the parameters to the DeleteInterconnect operation.
     * @return Result of the DeleteInterconnect operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DeleteInterconnect
     */
    @Override
    public DeleteInterconnectResult deleteInterconnect(
            DeleteInterconnectRequest deleteInterconnectRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInterconnectRequest> request = null;
        Response<DeleteInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInterconnectRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteInterconnectResult> responseHandler = new JsonResponseHandler<DeleteInterconnectResult>(
                    new DeleteInterconnectResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     *        Container for the parameters to the DeleteVirtualInterface
     *        operation.
     * @return Result of the DeleteVirtualInterface operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DeleteVirtualInterface
     */
    @Override
    public DeleteVirtualInterfaceResult deleteVirtualInterface(
            DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualInterfaceRequest> request = null;
        Response<DeleteVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualInterfaceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteVirtualInterfaceResult> responseHandler = new JsonResponseHandler<DeleteVirtualInterfaceResult>(
                    new DeleteVirtualInterfaceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @param describeConnectionsRequest
     *        Container for the parameters to the DescribeConnections operation.
     * @return Result of the DescribeConnections operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DescribeConnections
     */
    @Override
    public DescribeConnectionsResult describeConnections(
            DescribeConnectionsRequest describeConnectionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsRequest> request = null;
        Response<DescribeConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConnectionsResult> responseHandler = new JsonResponseHandler<DescribeConnectionsResult>(
                    new DescribeConnectionsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConnectionsResult describeConnections() {
        return describeConnections(new DescribeConnectionsRequest());
    }

    /**
     * <p>
     * Return a list of connections that have been provisioned on the given
     * interconnect.
     * </p>
     * 
     * @param describeConnectionsOnInterconnectRequest
     *        Container for the parameters to the
     *        DescribeConnectionsOnInterconnect operation.
     * @return Result of the DescribeConnectionsOnInterconnect operation
     *         returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DescribeConnectionsOnInterconnect
     */
    @Override
    public DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConnectionsOnInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsOnInterconnectRequest> request = null;
        Response<DescribeConnectionsOnInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsOnInterconnectRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConnectionsOnInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConnectionsOnInterconnectResult> responseHandler = new JsonResponseHandler<DescribeConnectionsOnInterconnectResult>(
                    new DescribeConnectionsOnInterconnectResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @param describeInterconnectsRequest
     *        Container for the parameters to the DescribeInterconnects
     *        operation.
     * @return Result of the DescribeInterconnects operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DescribeInterconnects
     */
    @Override
    public DescribeInterconnectsResult describeInterconnects(
            DescribeInterconnectsRequest describeInterconnectsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInterconnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInterconnectsRequest> request = null;
        Response<DescribeInterconnectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInterconnectsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeInterconnectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeInterconnectsResult> responseHandler = new JsonResponseHandler<DescribeInterconnectsResult>(
                    new DescribeInterconnectsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeInterconnectsResult describeInterconnects() {
        return describeInterconnects(new DescribeInterconnectsRequest());
    }

    /**
     * <p>
     * Returns the list of AWS Direct Connect locations in the current AWS
     * region. These are the locations that may be selected when calling
     * CreateConnection or CreateInterconnect.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return Result of the DescribeLocations operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DescribeLocations
     */
    @Override
    public DescribeLocationsResult describeLocations(
            DescribeLocationsRequest describeLocationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationsRequest> request = null;
        Response<DescribeLocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeLocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeLocationsResult> responseHandler = new JsonResponseHandler<DescribeLocationsResult>(
                    new DescribeLocationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLocationsResult describeLocations() {
        return describeLocations(new DescribeLocationsRequest());
    }

    /**
     * <p>
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces
     * linking to a virtual private gateway. A virtual private gateway can be
     * managed via Amazon Virtual Private Cloud (VPC) console or the <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html"
     * >EC2 CreateVpnGateway</a> action.
     * </p>
     * 
     * @param describeVirtualGatewaysRequest
     * @return Result of the DescribeVirtualGateways operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DescribeVirtualGateways
     */
    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways(
            DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVirtualGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualGatewaysRequest> request = null;
        Response<DescribeVirtualGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualGatewaysRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeVirtualGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeVirtualGatewaysResult> responseHandler = new JsonResponseHandler<DescribeVirtualGatewaysResult>(
                    new DescribeVirtualGatewaysResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways() {
        return describeVirtualGateways(new DescribeVirtualGatewaysRequest());
    }

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is called
     * are also returned. If a connection ID is included then only virtual
     * interfaces associated with this connection will be returned. If a virtual
     * interface ID is included then only a single virtual interface will be
     * returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct
     * Connect location and the customer.
     * </p>
     * <p>
     * If a connection ID is provided, only virtual interfaces provisioned on
     * the specified connection will be returned. If a virtual interface ID is
     * provided, only this particular virtual interface will be returned.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     *        Container for the parameters to the DescribeVirtualInterfaces
     *        operation.
     * @return Result of the DescribeVirtualInterfaces operation returned by the
     *         service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error
     *         message will contain additional details about the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message
     *         will contain additional details about the cause.
     * @sample AmazonDirectConnect.DescribeVirtualInterfaces
     */
    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces(
            DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVirtualInterfacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualInterfacesRequest> request = null;
        Response<DescribeVirtualInterfacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualInterfacesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeVirtualInterfacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeVirtualInterfacesResult> responseHandler = new JsonResponseHandler<DescribeVirtualInterfacesResult>(
                    new DescribeVirtualInterfacesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces() {
        return describeVirtualInterfaces(new DescribeVirtualInterfacesRequest());
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
