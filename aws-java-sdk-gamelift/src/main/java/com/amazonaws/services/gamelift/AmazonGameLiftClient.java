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
package com.amazonaws.services.gamelift;

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
import com.amazonaws.util.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.services.gamelift.model.transform.*;

/**
 * Client for accessing Amazon GameLift. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Welcome to the <i>Amazon GameLift API Reference</i>. Amazon GameLift is a
 * managed Amazon Web Services (AWS) service for developers who need a scalable,
 * server-based solution for multiplayer games. Amazon GameLift provides setup
 * and deployment of game servers, and handles infrastructure scaling and
 * session management. For more information about the GameLift service,
 * including a feature overview, getting started guide, and tutorial, see the
 * accompanying <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon
 * GameLift Developer Guide</a>.
 * </p>
 * <p>
 * This reference describes the low-level service API for GameLift. You can call
 * this API directly or use the <a href="https://aws.amazon.com/tools/">AWS
 * SDK</a> for your preferred language. The AWS SDK includes a set of high-level
 * GameLift actions multiplayer game sessions. Alternatively, you can use the <a
 * href="https://aws.amazon.com/cli/">AWS command-line interface</a> (CLI) tool,
 * which includes commands for GameLift. For administrative actions, you can use
 * the Amazon GameLift console.
 * </p>
 * <p>
 * <b>Managing Game and Player Sessions Through GameLift</b>
 * </p>
 * <p>
 * Call these actions from your game clients and/or services to create and
 * manage multiplayer game sessions.
 * </p>
 * <ul>
 * <li><b>Game sessions</b>
 * <ul>
 * <li><a>CreateGameSession</a></li>
 * <li><a>DescribeGameSessions</a></li>
 * <li><a>DescribeGameSessionDetails</a></li>
 * <li><a>UpdateGameSession</a></li>
 * </ul>
 * </li>
 * <li><b>Player sessions</b>
 * <ul>
 * <li><a>CreatePlayerSession</a></li>
 * <li><a>CreatePlayerSessions</a></li>
 * <li><a>DescribePlayerSessions</a></li>
 * </ul>
 * </li>
 * <li><b>Other actions:</b>
 * <ul>
 * <li><a>GetGameSessionLogUrl</a></li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Setting Up Game Servers</b>
 * </p>
 * <p>
 * Use these administrative actions to configure GameLift to host your game
 * servers. When configuring GameLift, you'll need to (1) configure a build for
 * your game and provide build files, and (2) set up one or more fleets to host
 * game sessions.
 * </p>
 * <ul>
 * <li><b>Build actions:</b>
 * <ul>
 * <li><a>ListBuilds</a></li>
 * <li><a>CreateBuild</a></li>
 * <li><a>DescribeBuild</a></li>
 * <li><a>UpdateBuild</a></li>
 * <li><a>DeleteBuild</a></li>
 * <li><a>RequestUploadCredentials</a></li>
 * </ul>
 * </li>
 * <li><b>Fleet actions:</b>
 * <ul>
 * <li><a>ListFleets</a></li>
 * <li><a>CreateFleet</a></li>
 * <li>Describe fleet actions:
 * <ul>
 * <li><a>DescribeFleetAttributes</a></li>
 * <li><a>DescribeFleetCapacity</a></li>
 * <li><a>DescribeFleetPortSettings</a></li>
 * <li><a>DescribeFleetUtilization</a></li>
 * <li><a>DescribeEC2InstanceLimits</a></li>
 * <li><a>DescribeFleetEvents</a></li>
 * </ul>
 * </li>
 * <li>Update fleet actions:
 * <ul>
 * <li><a>UpdateFleetAttributes</a></li>
 * <li><a>UpdateFleetCapacity</a></li>
 * <li><a>UpdateFleetPortSettings</a></li>
 * </ul>
 * </li>
 * <li><a>DeleteFleet</a></li>
 * </ul>
 * </li>
 * <li><b>Alias actions:</b>
 * <ul>
 * <li><a>ListAliases</a></li>
 * <li><a>CreateAlias</a></li>
 * <li><a>DescribeAlias</a></li>
 * <li><a>UpdateAlias</a></li>
 * <li><a>DeleteAlias</a></li>
 * <li><a>ResolveAlias</a></li>
 * </ul>
 * </li>
 * <li><b>Scaling policy actions:</b>
 * <ul>
 * <li><a>PutScalingPolicy</a></li>
 * <li><a>DescribeScalingPolicies</a></li>
 * <li><a>DeleteScalingPolicy</a></li>
 * </ul>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AmazonGameLiftClient extends AmazonWebServiceClient implements
        AmazonGameLift {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonGameLift.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "gamelift";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "gamelift";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all Amazon GameLift exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonGameLiftClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *        connects to Amazon GameLift (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonGameLiftClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift
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
    public AmazonGameLiftClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift
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
     *        connects to Amazon GameLift (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonGameLiftClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift
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
    public AmazonGameLiftClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift
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
     *        connects to Amazon GameLift (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonGameLiftClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift
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
     *        connects to Amazon GameLift (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonGameLiftClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.UnauthorizedException.class,
                        "UnauthorizedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.InvalidGameSessionStatusException.class,
                        "InvalidGameSessionStatusException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.gamelift.model.ConflictException.class,
                "ConflictException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.gamelift.model.NotFoundException.class,
                "NotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.InternalServiceException.class,
                        "InternalServiceException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.FleetCapacityExceededException.class,
                        "FleetCapacityExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.TerminalRoutingStrategyException.class,
                        "TerminalRoutingStrategyException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.GameSessionFullException.class,
                        "GameSessionFullException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.InvalidFleetStatusException.class,
                        "InvalidFleetStatusException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.gamelift.model.InvalidRequestException.class,
                        "InvalidRequestException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://gamelift.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/gamelift/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/gamelift/request.handler2s"));
    }

    /**
     * <p>
     * Creates an alias for a fleet. You can use an alias to anonymize your
     * fleet by referencing an alias instead of a specific fleet when you create
     * game sessions. Amazon GameLift supports two types of routing strategies
     * for aliases: simple and terminal. Use a simple alias to point to an
     * active fleet. Use a terminal alias to display a message to incoming
     * traffic instead of routing players to an active fleet. This option is
     * useful when a game server is no longer supported but you want to provide
     * better messaging than a standard 404 error.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and
     * optional description. If successful, a new alias record is returned,
     * including an alias ID, which you can reference when creating a game
     * session. To reassign the alias to another fleet ID, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @return Result of the CreateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @sample AmazonGameLift.CreateAlias
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAliasResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateAliasResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initializes a new build record and generates information required to
     * upload a game build to Amazon GameLift. Once the build record has been
     * created and is in an INITIALIZED state, you can upload your game build.
     * </p>
     * <important>
     * <p>
     * To create a build, use the CLI command <code>upload-build</code>, which
     * creates a new build record and uploads the build files in one step. (See
     * the <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">
     * Amazon GameLift Developer Guide</a> for more details on the CLI and the
     * upload process.) Call the <code>CreateBuild</code> action only if you
     * have your own Amazon Simple Storage Service (Amazon S3) client and need
     * to manually upload your build files.
     * </p>
     * </important>
     * <p>
     * To create a new build, optionally specify a build name and version. This
     * metadata is stored with other properties in the build record and is
     * displayed in the GameLift console (but not visible to players). If
     * successful, this action returns the newly created build record along with
     * an Amazon S3 storage location and AWS account credentials. Use the
     * location and credentials to upload your game build.
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @return Result of the CreateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.CreateBuild
     */
    @Override
    public CreateBuildResult createBuild(CreateBuildRequest createBuildRequest) {
        ExecutionContext executionContext = createExecutionContext(createBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBuildRequest> request = null;
        Response<CreateBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBuildRequestMarshaller().marshall(super
                        .beforeMarshalling(createBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateBuildResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateBuildResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new fleet to host game servers. A fleet consists of a set of
     * Amazon Elastic Compute Cloud (Amazon EC2) instances of a certain type,
     * which defines the CPU, memory, storage, and networking capacity of each
     * host in the fleet. See <a
     * href="https://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for more information. Each instance in the fleet hosts a game
     * server created from the specified game build. Once a fleet is in an
     * ACTIVE state, it can begin hosting game sessions.
     * </p>
     * <p>
     * To create a new fleet, provide a name and the EC2 instance type for the
     * new fleet, and specify the build and server launch path. Builds must be
     * in a READY state before they can be used to build fleets. When
     * configuring the new fleet, you can optionally (1) provide a set of launch
     * parameters to be passed to a game server when activated; (2) limit
     * incoming traffic to a specified range of IP addresses and port numbers;
     * (3) set game session protection for all instances in the fleet, and (4)
     * configure Amazon GameLift to store game session logs by specifying the
     * path to the logs stored in your game server files. If the call is
     * successful, Amazon GameLift performs the following tasks:
     * </p>
     * <ul>
     * <li>Creates a fleet record and sets the state to NEW.</li>
     * <li>Sets the fleet's capacity to 1 "desired" and 1 "active" EC2 instance
     * count.</li>
     * <li>Creates an EC2 instance and begins the process of initializing the
     * fleet and activating a game server on the instance.</li>
     * <li>Begins writing events to the fleet event log, which can be accessed
     * in the GameLift console.</li>
     * </ul>
     * <p>
     * Once a fleet is created, use the following actions to change certain
     * fleet properties (server launch parameters and log paths cannot be
     * changed):
     * </p>
     * <ul>
     * <li><a>UpdateFleetAttributes</a> -- Update fleet metadata, including name
     * and description.</li>
     * <li><a>UpdateFleetCapacity</a> -- Increase or decrease the number of
     * instances you want the fleet to maintain.</li>
     * <li><a>UpdateFleetPortSettings</a> -- Change the IP addresses and ports
     * that allow access to incoming traffic.</li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.CreateFleet
     */
    @Override
    public CreateFleetResult createFleet(CreateFleetRequest createFleetRequest) {
        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestMarshaller().marshall(super
                        .beforeMarshalling(createFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateFleetResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateFleetResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a
     * game session record and assigns the new session to an instance in the
     * specified fleet, which activates the server initialization process in
     * your game server. A fleet must be in an ACTIVE state before a game
     * session can be created for it.
     * </p>
     * <p>
     * To create a game session, specify either a fleet ID or an alias ID and
     * indicate the maximum number of players the game session allows. You can
     * also provide a name and a set of properties for your game (optional). If
     * successful, a <a>GameSession</a> object is returned containing session
     * properties, including an IP address. By default, newly created game
     * sessions are set to accept adding any new players to the game session.
     * Use <a>UpdateGameSession</a> to change the creation policy.
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreateGameSession operation returned by the
     *         service.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws FleetCapacityExceededException
     *         The specified fleet has no available instances to fulfill a
     *         request to create a new game session. Such requests should only
     *         be retried once the fleet capacity has been increased.
     * @sample AmazonGameLift.CreateGameSession
     */
    @Override
    public CreateGameSessionResult createGameSession(
            CreateGameSessionRequest createGameSessionRequest) {
        ExecutionContext executionContext = createExecutionContext(createGameSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGameSessionRequest> request = null;
        Response<CreateGameSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGameSessionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createGameSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateGameSessionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateGameSessionResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. A
     * game session must be in an ACTIVE state, have a creation policy of
     * ALLOW_ALL, and have an open player slot before players can be added to
     * the session.
     * </p>
     * <p>
     * To create a player session, specify a game session ID and player ID. If
     * successful, the player is added to the game session and a new
     * <a>PlayerSession</a> object is returned.
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSession operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the game
     *         instance. Such requests should not be retried by clients without
     *         resolving the conflict.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the
     *         requested player(s) to join. This exception occurs in response to
     *         a <a>CreatePlayerSession</a> request.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.CreatePlayerSession
     */
    @Override
    public CreatePlayerSessionResult createPlayerSession(
            CreatePlayerSessionRequest createPlayerSessionRequest) {
        ExecutionContext executionContext = createExecutionContext(createPlayerSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlayerSessionRequest> request = null;
        Response<CreatePlayerSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlayerSessionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createPlayerSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePlayerSessionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreatePlayerSessionResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a group of players to a game session. Similar to
     * <a>CreatePlayerSession</a>, this action allows you to add multiple
     * players in a single call, which is useful for games that provide party
     * and/or matchmaking features. A game session must be in an ACTIVE state,
     * have a creation policy of ALLOW_ALL, and have an open player slot before
     * players can be added to the session.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player
     * IDs. If successful, the players are added to the game session and a set
     * of new <a>PlayerSession</a> objects is returned.
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the game
     *         instance. Such requests should not be retried by clients without
     *         resolving the conflict.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the
     *         requested player(s) to join. This exception occurs in response to
     *         a <a>CreatePlayerSession</a> request.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.CreatePlayerSessions
     */
    @Override
    public CreatePlayerSessionsResult createPlayerSessions(
            CreatePlayerSessionsRequest createPlayerSessionsRequest) {
        ExecutionContext executionContext = createExecutionContext(createPlayerSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlayerSessionsRequest> request = null;
        Response<CreatePlayerSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlayerSessionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createPlayerSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePlayerSessionsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreatePlayerSessionsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias; game
     * clients attempting to access a game server using the deleted alias
     * receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.DeleteAlias
     */
    @Override
    public void deleteAlias(DeleteAliasRequest deleteAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any
     * uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the
     * status of any active fleets, but you can no longer create new fleets for
     * the deleted build.
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.DeleteBuild
     */
    @Override
    public void deleteBuild(DeleteBuildRequest deleteBuildRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBuildRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBuildRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must
     * set the fleet's desired capacity to zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a
     * fleet is deleted, you can no longer use that fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @sample AmazonGameLift.DeleteFleet
     */
    @Override
    public void deleteFleet(DeleteFleetRequest deleteFleetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no
     * longer in force and removes all record of it. To delete a scaling policy,
     * specify both the scaling policy name and the fleet ID it is associated
     * with.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.DeleteScalingPolicy
     */
    @Override
    public void deleteScalingPolicy(
            DeleteScalingPolicyRequest deleteScalingPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScalingPolicyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScalingPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for a specified alias. To get the alias, specify an
     * alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.DescribeAlias
     */
    @Override
    public DescribeAliasResult describeAlias(
            DescribeAliasRequest describeAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAliasRequest> request = null;
        Response<DescribeAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(describeAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAliasResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeAliasResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build
     * ID. If successful, an object containing the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.DescribeBuild
     */
    @Override
    public DescribeBuildResult describeBuild(
            DescribeBuildRequest describeBuildRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBuildRequest> request = null;
        Response<DescribeBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBuildRequestMarshaller().marshall(super
                        .beforeMarshalling(describeBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeBuildResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeBuildResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the following information for the specified EC2 instance type:
     * </p>
     * <ul>
     * <li>maximum number of instances allowed per AWS account (service limit)</li>
     * <li>current usage level for the AWS account</li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for GameLift
     * can be found in the AWS Management Console for GameLift (see the
     * drop-down list in the upper right corner).
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeEC2InstanceLimits operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeEC2InstanceLimits
     */
    @Override
    public DescribeEC2InstanceLimitsResult describeEC2InstanceLimits(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEC2InstanceLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEC2InstanceLimitsRequest> request = null;
        Response<DescribeEC2InstanceLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEC2InstanceLimitsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeEC2InstanceLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeEC2InstanceLimitsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeEC2InstanceLimitsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and
     * configuration, for one or more fleets. You can request attributes for all
     * fleets, or specify a list of one or more fleet IDs. When requesting all
     * fleets, use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, a <a>FleetAttributes</a> object is
     * returned for each requested fleet ID. When specifying a list of fleet
     * IDs, attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetAttributes operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetAttributes
     */
    @Override
    public DescribeFleetAttributesResult describeFleetAttributes(
            DescribeFleetAttributesRequest describeFleetAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFleetAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetAttributesRequest> request = null;
        Response<DescribeFleetAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetAttributesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeFleetAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeFleetAttributesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeFleetAttributesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets.
     * This information includes the number of instances that have been
     * requested for the fleet and the number currently active. You can request
     * capacity for all fleets, or specify a list of one or more fleet IDs. When
     * requesting all fleets, use the pagination parameters to retrieve results
     * as a set of sequential pages. If successful, a <a>FleetCapacity</a>
     * object is returned for each requested fleet ID. When specifying a list of
     * fleet IDs, attribute objects are returned only for fleets that currently
     * exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetCapacity operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetCapacity
     */
    @Override
    public DescribeFleetCapacityResult describeFleetCapacity(
            DescribeFleetCapacityRequest describeFleetCapacityRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFleetCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetCapacityRequest> request = null;
        Response<DescribeFleetCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetCapacityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeFleetCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeFleetCapacityResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeFleetCapacityResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves entries from the fleet event log. You can specify a time range
     * to limit the result set. Use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a collection of
     * event log entries matching the request are returned.
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetEvents operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.DescribeFleetEvents
     */
    @Override
    public DescribeFleetEventsResult describeFleetEvents(
            DescribeFleetEventsRequest describeFleetEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFleetEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetEventsRequest> request = null;
        Response<DescribeFleetEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetEventsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeFleetEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeFleetEventsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeFleetEventsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the port settings for a fleet. Port settings are used to limit
     * incoming traffic access to game servers in the fleet. To get a fleet's
     * port settings, specify a fleet ID. If successful, an <a>IpPermission</a>
     * object is returned for the requested fleet ID. If the requested fleet has
     * been deleted, the result set will be empty.
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetPortSettings operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetPortSettings
     */
    @Override
    public DescribeFleetPortSettingsResult describeFleetPortSettings(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFleetPortSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetPortSettingsRequest> request = null;
        Response<DescribeFleetPortSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetPortSettingsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeFleetPortSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeFleetPortSettingsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeFleetPortSettingsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request
     * utilization data for all fleets, or specify a list of one or more fleet
     * IDs. When requesting all fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>FleetUtilization</a> object is returned for each requested fleet ID.
     * When specifying a list of fleet IDs, utilization objects are returned
     * only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetUtilization operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetUtilization
     */
    @Override
    public DescribeFleetUtilizationResult describeFleetUtilization(
            DescribeFleetUtilizationRequest describeFleetUtilizationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFleetUtilizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetUtilizationRequest> request = null;
        Response<DescribeFleetUtilizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetUtilizationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeFleetUtilizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeFleetUtilizationResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeFleetUtilizationResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one
     * or more game sessions. This action can be used in several ways: (1)
     * provide a <i>GameSessionId</i> to request details for a specific game
     * session; (2) provide either a <i>FleetId</i> or an <i>AliasId</i> to
     * request properties for all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSessionDetail</a> object
     * is returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionDetails operation returned by
     *         the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @sample AmazonGameLift.DescribeGameSessionDetails
     */
    @Override
    public DescribeGameSessionDetailsResult describeGameSessionDetails(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeGameSessionDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGameSessionDetailsRequest> request = null;
        Response<DescribeGameSessionDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGameSessionDetailsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeGameSessionDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeGameSessionDetailsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeGameSessionDetailsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for one or more game sessions. This action can be
     * used in several ways: (1) provide a <i>GameSessionId</i> to request
     * properties for a specific game session; (2) provide a <i>FleetId</i> or
     * an <i>AliasId</i> to request properties for all game sessions running on
     * a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSession</a> object is
     * returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @sample AmazonGameLift.DescribeGameSessions
     */
    @Override
    public DescribeGameSessionsResult describeGameSessions(
            DescribeGameSessionsRequest describeGameSessionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeGameSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGameSessionsRequest> request = null;
        Response<DescribeGameSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGameSessionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeGameSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeGameSessionsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeGameSessionsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be
     * used in several ways: (1) provide a <i>PlayerSessionId</i> parameter to
     * request properties for a specific player session; (2) provide a
     * <i>GameSessionId</i> parameter to request properties for all player
     * sessions in the specified game session; (3) provide a <i>PlayerId</i>
     * parameter to request properties for all player sessions of a specified
     * player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a
     * player session ID, a game session ID, or a player ID. You can filter this
     * request by player session status. Use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>PlayerSession</a> object is returned for each session matching the
     * request.
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribePlayerSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribePlayerSessions
     */
    @Override
    public DescribePlayerSessionsResult describePlayerSessions(
            DescribePlayerSessionsRequest describePlayerSessionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describePlayerSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlayerSessionsRequest> request = null;
        Response<DescribePlayerSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePlayerSessionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describePlayerSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribePlayerSessionsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribePlayerSessionsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter
     * this request by policy status, such as to retrieve only active scaling
     * policies. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, set of <a>ScalingPolicy</a> objects is
     * returned for the fleet.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeScalingPolicies operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.DescribeScalingPolicies
     */
    @Override
    public DescribeScalingPoliciesResult describeScalingPolicies(
            DescribeScalingPoliciesRequest describeScalingPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeScalingPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingPoliciesRequest> request = null;
        Response<DescribeScalingPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingPoliciesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeScalingPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeScalingPoliciesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeScalingPoliciesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game
     * session. When a game session is terminated, Amazon GameLift automatically
     * stores the logs in Amazon S3. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >AWS Service Limits</a> page for maximum log file sizes. Log files that
     * exceed this limit are not saved.
     * </p>
     * </note>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @return Result of the GetGameSessionLogUrl operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.GetGameSessionLogUrl
     */
    @Override
    public GetGameSessionLogUrlResult getGameSessionLogUrl(
            GetGameSessionLogUrlRequest getGameSessionLogUrlRequest) {
        ExecutionContext executionContext = createExecutionContext(getGameSessionLogUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGameSessionLogUrlRequest> request = null;
        Response<GetGameSessionLogUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGameSessionLogUrlRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getGameSessionLogUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetGameSessionLogUrlResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetGameSessionLogUrlResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a collection of alias records for this AWS account. You can
     * filter the result set by alias name and/or routing strategy type. Use the
     * pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Aliases are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @return Result of the ListAliases operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.ListAliases
     */
    @Override
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestMarshaller().marshall(super
                        .beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAliasesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListAliasesResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves build records for all builds associated with an AWS account.
     * You can filter the result set by build status. Use the pagination
     * parameters to retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @return Result of the ListBuilds operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.ListBuilds
     */
    @Override
    public ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest) {
        ExecutionContext executionContext = createExecutionContext(listBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuildsRequest> request = null;
        Response<ListBuildsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuildsRequestMarshaller().marshall(super
                        .beforeMarshalling(listBuildsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListBuildsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListBuildsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can
     * filter the result set by build ID. Use the pagination parameters to
     * retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @return Result of the ListFleets operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.ListFleets
     */
    @Override
    public ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsRequest> request = null;
        Response<ListFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsRequestMarshaller().marshall(super
                        .beforeMarshalling(listFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListFleetsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListFleetsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. An active scaling policy
     * prompts GameLift to track a certain metric for a fleet and automatically
     * change the fleet's capacity in specific circumstances. Each scaling
     * policy contains one rule statement. Fleets can have multiple scaling
     * policies in force simultaneously.
     * </p>
     * <p>
     * A scaling policy rule statement has the following structure:
     * </p>
     * <p>
     * If <i>[MetricName]</i> is <i>[ComparisonOperator]</i> <i>[Threshold]</i>
     * for <i>[EvaluationPeriods]</i> minutes, then
     * <i>[ScalingAdjustmentType]</i> to/by <i>[ScalingAdjustment]</i>.
     * </p>
     * <p>
     * For example, this policy:
     * "If the number of idle instances exceeds 20 for more than 15 minutes, then reduce the fleet capacity by 10 instances"
     * could be implemented as the following rule statement:
     * </p>
     * <p>
     * If [IdleInstances] is [GreaterThanOrEqualToThreshold] [20] for [15]
     * minutes, then [ChangeInCapacity] by [-10].
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of
     * name and fleet ID, and set the rule values. All parameters for this
     * action are required. If successful, the policy name is returned. Scaling
     * policies cannot be suspended or made inactive. To stop enforcing a
     * scaling policy, call <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.PutScalingPolicy
     */
    @Override
    public PutScalingPolicyResult putScalingPolicy(
            PutScalingPolicyRequest putScalingPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScalingPolicyRequest> request = null;
        Response<PutScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScalingPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutScalingPolicyResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new PutScalingPolicyResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a fresh set of upload credentials and the assigned Amazon S3
     * storage location for a specific build. Valid credentials are required to
     * upload your game build files to Amazon S3.
     * </p>
     * <important>
     * <p>
     * Call this action only if you need credentials for a build created with
     * <a>CreateBuild</a>. This is a rare situation; in most cases, builds are
     * created using the CLI command <code>upload-build</code>, which creates a
     * build record and also uploads build files.
     * </p>
     * </important>
     * <p>
     * Upload credentials are returned when you create the build, but they have
     * a limited lifespan. You can get fresh credentials and use them to
     * re-upload game files until the state of that build changes to READY. Once
     * this happens, you must create a brand new build.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @return Result of the RequestUploadCredentials operation returned by the
     *         service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.RequestUploadCredentials
     */
    @Override
    public RequestUploadCredentialsResult requestUploadCredentials(
            RequestUploadCredentialsRequest requestUploadCredentialsRequest) {
        ExecutionContext executionContext = createExecutionContext(requestUploadCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestUploadCredentialsRequest> request = null;
        Response<RequestUploadCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestUploadCredentialsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(requestUploadCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RequestUploadCredentialsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RequestUploadCredentialsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return Result of the ResolveAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.ResolveAlias
     */
    @Override
    public ResolveAliasResult resolveAlias(
            ResolveAliasRequest resolveAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(resolveAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveAliasRequest> request = null;
        Response<ResolveAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(resolveAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ResolveAliasResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ResolveAliasResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias
     * ID to be updated and provide the information to be changed. To reassign
     * an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.UpdateAlias
     */
    @Override
    public UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<UpdateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(updateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateAliasResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateAliasResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version.
     * To update the metadata, specify the build ID to update and provide the
     * new values. If successful, a build object containing the updated metadata
     * is returned.
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.UpdateBuild
     */
    @Override
    public UpdateBuildResult updateBuild(UpdateBuildRequest updateBuildRequest) {
        ExecutionContext executionContext = createExecutionContext(updateBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBuildRequest> request = null;
        Response<UpdateBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBuildRequestMarshaller().marshall(super
                        .beforeMarshalling(updateBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateBuildResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateBuildResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To
     * update metadata, specify the fleet ID and the property values you want to
     * change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetAttributes operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.UpdateFleetAttributes
     */
    @Override
    public UpdateFleetAttributesResult updateFleetAttributes(
            UpdateFleetAttributesRequest updateFleetAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(updateFleetAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetAttributesRequest> request = null;
        Response<UpdateFleetAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetAttributesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateFleetAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateFleetAttributesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateFleetAttributesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the
     * number of EC2 instances (hosts) you want this fleet to contain. Before
     * calling this action, you may want to call
     * <a>DescribeEC2InstanceLimits</a> to get the maximum capacity based on the
     * fleet's EC2 instance type.
     * </p>
     * <p>
     * If you're using auto-scaling (see <a>PutScalingPolicy</a>), you may want
     * to specify a minimum and/or maximum capacity. If you don't provide these
     * boundaries, auto-scaling can set capacity anywhere between zero and the
     * <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >service limits</a>.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the desired number of
     * instances. If successful, Amazon GameLift starts or terminates instances
     * so that the fleet's active instance count matches the desired instance
     * count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher
     * than the instance type's limit, the "Limit Exceeded" exception will
     * occur.
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetCapacity operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.UpdateFleetCapacity
     */
    @Override
    public UpdateFleetCapacityResult updateFleetCapacity(
            UpdateFleetCapacityRequest updateFleetCapacityRequest) {
        ExecutionContext executionContext = createExecutionContext(updateFleetCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetCapacityRequest> request = null;
        Response<UpdateFleetCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetCapacityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateFleetCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateFleetCapacityResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateFleetCapacityResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet
     * ID to be updated and list the permissions you want to update. List the
     * permissions you want to add in <i>InboundPermissionAuthorizations</i>,
     * and permissions you want to remove in
     * <i>InboundPermissionRevocations</i>. Permissions to be removed must match
     * existing fleet permissions. If successful, the fleet ID for the updated
     * fleet is returned.
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetPortSettings operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.UpdateFleetPortSettings
     */
    @Override
    public UpdateFleetPortSettingsResult updateFleetPortSettings(
            UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateFleetPortSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetPortSettingsRequest> request = null;
        Response<UpdateFleetPortSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetPortSettingsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateFleetPortSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateFleetPortSettingsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateFleetPortSettingsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum
     * player count, protection policy, which controls whether or not an active
     * game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can
     * join the session. To update a game session, specify the game session ID
     * and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateGameSession operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the game
     *         instance. Such requests should not be retried by clients without
     *         resolving the conflict.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.UpdateGameSession
     */
    @Override
    public UpdateGameSessionResult updateGameSession(
            UpdateGameSessionRequest updateGameSessionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateGameSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGameSessionRequest> request = null;
        Response<UpdateGameSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGameSessionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateGameSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateGameSessionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateGameSessionResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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

        JsonErrorResponseHandlerV2 errorResponseHandler = SdkJsonProtocolFactory
                .createErrorResponseHandler(jsonErrorUnmarshallers, false);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
