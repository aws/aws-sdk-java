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
package com.amazonaws.services.gamelift;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.gamelift.AmazonGameLiftClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.services.gamelift.model.transform.*;

/**
 * Client for accessing Amazon GameLift. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Amazon GameLift is a managed service for developers who need a scalable, dedicated server solution for their
 * multiplayer games. Use Amazon GameLift for these tasks: (1) set up computing resources and deploy your game servers,
 * (2) run game sessions and get players into games, (3) automatically scale your resources to meet player demand and
 * manage costs, and (4) track in-depth metrics on game server performance and player usage.
 * </p>
 * <p>
 * When setting up hosting resources, you can deploy your custom game server or use the Amazon GameLift Realtime
 * Servers. Realtime Servers gives you the ability to quickly stand up lightweight, efficient game servers with the core
 * Amazon GameLift infrastructure already built in.
 * </p>
 * <p>
 * <b>Get Amazon GameLift Tools and Resources</b>
 * </p>
 * <p>
 * This reference guide describes the low-level service API for Amazon GameLift and provides links to language-specific
 * SDK reference topics. See also <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-components.html"> Amazon GameLift Tools and
 * Resources</a>.
 * </p>
 * <p>
 * <b>API Summary</b>
 * </p>
 * <p>
 * The Amazon GameLift service API includes two key sets of actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Manage game sessions and player access -- Integrate this functionality into game client services in order to create
 * new game sessions, retrieve information on existing game sessions; reserve a player slot in a game session, request
 * matchmaking, etc.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure and manage game server resources -- Manage your Amazon GameLift hosting resources, including builds,
 * scripts, fleets, queues, and aliases. Set up matchmakers, configure auto-scaling, retrieve game logs, and get hosting
 * and game metrics.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b> <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html"> Task-based list of
 * API actions</a> </b>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonGameLiftClient extends AmazonWebServiceClient implements AmazonGameLift {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonGameLift.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "gamelift";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FleetCapacityExceededException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.FleetCapacityExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.IdempotentParameterMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TerminalRoutingStrategyException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.TerminalRoutingStrategyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGameSessionStatusException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.InvalidGameSessionStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GameSessionFullException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.GameSessionFullException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedRegionException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.UnsupportedRegionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFleetStatusException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.InvalidFleetStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.gamelift.model.ConflictException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.gamelift.model.AmazonGameLiftException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonGameLiftClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonGameLiftClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon GameLift (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonGameLiftClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGameLiftClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonGameLiftClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonGameLiftClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonGameLiftClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon GameLift (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonGameLiftClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGameLiftClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonGameLiftClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonGameLiftClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon GameLift (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonGameLiftClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGameLiftClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon GameLift (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonGameLiftClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonGameLiftClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonGameLiftClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonGameLiftClientBuilder builder() {
        return AmazonGameLiftClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonGameLiftClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon GameLift using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonGameLiftClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://gamelift.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/gamelift/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/gamelift/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may
     * require player acceptance; if so, then matches built with that configuration cannot be completed unless all
     * players accept the proposed match within a specified time limit.
     * </p>
     * <p>
     * When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status
     * <code>REQUIRES_ACCEPTANCE</code>. This is a trigger for your game to get acceptance from all players in the
     * ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an
     * error.
     * </p>
     * <p>
     * To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have
     * registered acceptance, the matchmaking tickets advance to status <code>PLACING</code>, where a new game session
     * is created for the match.
     * </p>
     * <p>
     * If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed
     * match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where all players
     * accepted the match, the ticket status is returned to <code>SEARCHING</code> to find a new match. For tickets
     * where one or more players failed to accept the match, the ticket status is set to <code>FAILED</code>, and
     * processing is terminated. A new matchmaking request for these players can be submitted as needed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartMatchBackfill</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptMatchRequest
     *        Represents the input for a request action.
     * @return Result of the AcceptMatch operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.AcceptMatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AcceptMatch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AcceptMatchResult acceptMatch(AcceptMatchRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptMatch(request);
    }

    @SdkInternalApi
    final AcceptMatchResult executeAcceptMatch(AcceptMatchRequest acceptMatchRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptMatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptMatchRequest> request = null;
        Response<AcceptMatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptMatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptMatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptMatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptMatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptMatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. By using a
     * fleet alias instead of a specific fleet ID, you can switch gameplay and players to a new fleet without changing
     * your game client or other game components. For example, for games in production, using an alias allows you to
     * seamlessly redirect your player base to a new game server update.
     * </p>
     * <p>
     * Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points
     * to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to
     * an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you
     * want to direct players to an upgrade site.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can
     * point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned,
     * including an alias ID, which you can reference when creating a game session. You can reassign an alias to another
     * fleet by calling <code>UpdateAlias</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @return Result of the CreateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @sample AmazonGameLift.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlias(request);
    }

    @SdkInternalApi
    final CreateAliasResult executeCreateAlias(CreateAliasRequest createAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon GameLift build record for your game server binary files and points to the location of your
     * game server build files in an Amazon Simple Storage Service (Amazon S3) location.
     * </p>
     * <p>
     * Game server binaries must be combined into a <code>.zip</code> file for use with Amazon GameLift.
     * </p>
     * <important>
     * <p>
     * To create new builds quickly and easily, use the AWS CLI command <b> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html">upload-build</a> </b>. This
     * helper command uploads your build and creates a new build record in one step, and automatically handles the
     * necessary permissions.
     * </p>
     * </important>
     * <p>
     * The <code>CreateBuild</code> operation should be used only when you need to manually upload your build files, as
     * in the following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store a build file in an Amazon S3 bucket under your own AWS account. To use this option, you must first give
     * Amazon GameLift access to that Amazon S3 bucket. To create a new build record using files in your Amazon S3
     * bucket, call <code>CreateBuild</code> and specify a build name, operating system, and the storage location of
     * your game build.
     * </p>
     * </li>
     * <li>
     * <p>
     * Upload a build file directly to Amazon GameLift's Amazon S3 account. To use this option, you first call
     * <code>CreateBuild</code> with a build name and operating system. This action creates a new build record and
     * returns an Amazon S3 storage location (bucket and key only) and temporary access credentials. Use the credentials
     * to manually upload your build file to the storage location (see the Amazon S3 topic <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UploadingObjects.html">Uploading Objects</a>). You can
     * upload files to a location only once.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new build record with a unique build ID and places it in
     * <code>INITIALIZED</code> status. You can use <a>DescribeBuild</a> to check the status of your build. A build must
     * be in <code>READY</code> status before it can be used to create fleets.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">Uploading Your
     * Game</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * > Create a Build with Files in Amazon S3</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @return Result of the CreateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBuildResult createBuild(CreateBuildRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBuild(request);
    }

    @SdkInternalApi
    final CreateBuildResult executeCreateBuild(CreateBuildRequest createBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(createBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBuildRequest> request = null;
        Response<CreateBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBuildRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBuild");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBuildResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBuildResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new fleet to run your game servers. whether they are custom game builds or Realtime Servers with
     * game-specific script. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances, each of which can
     * host multiple game sessions. When creating a fleet, you choose the hardware specifications, set some
     * configuration options, and specify the game server to deploy on the new fleet.
     * </p>
     * <p>
     * To create a new fleet, you must provide the following: (1) a fleet name, (2) an EC2 instance type and fleet type
     * (spot or on-demand), (3) the build ID for your game build or script ID if using Realtime Servers, and (4) a
     * run-time configuration, which determines how game servers will run on each instance in the fleet.
     * </p>
     * <note>
     * <p>
     * When creating a Realtime Servers fleet, we recommend using a minimal version of the Realtime script (see this <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-script.html#realtime-script-examples">
     * working code example </a>). This will make it much easier to troubleshoot any fleet creation issues. Once the
     * fleet is active, you can update your Realtime script as needed.
     * </p>
     * </note>
     * <p>
     * If the <code>CreateFleet</code> call is successful, Amazon GameLift performs the following tasks. You can track
     * the process of a fleet by checking the fleet status or by monitoring fleet creation events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a fleet record. Status: <code>NEW</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console.
     * </p>
     * <p>
     * Sets the fleet's target capacity to 1 (desired instances), which triggers Amazon GameLift to start one new EC2
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Downloads the game build or Realtime script to the new instance and installs it. Statuses:
     * <code>DOWNLOADING</code>, <code>VALIDATING</code>, <code>BUILDING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Starts launching server processes on the instance. If the fleet is configured to run multiple server processes
     * per instance, Amazon GameLift staggers each launch by a few seconds. Status: <code>ACTIVATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the fleet's status to <code>ACTIVE</code> as soon as one server process is ready to host a game session.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html"> Debug Fleet
     * Creation Issues</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFleet(request);
    }

    @SdkInternalApi
    final CreateFleetResult executeCreateFleet(CreateFleetRequest createFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a game session record and assigns an
     * available server process in the specified fleet to host the game session. A fleet must have an
     * <code>ACTIVE</code> status before a game session can be created in it.
     * </p>
     * <p>
     * To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow
     * in the game session. You can also provide a name and game-specific properties for this game session. If
     * successful, a <a>GameSession</a> object is returned containing the game session properties and other settings you
     * specified.
     * </p>
     * <p>
     * <b>Idempotency tokens.</b> You can add a token that uniquely identifies game session requests. This is useful for
     * ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are
     * processed only once; subsequent requests return the original result. All response values are the same with the
     * exception of game session status, which may change.
     * </p>
     * <p>
     * <b>Resource creation limits.</b> If you are creating a game session on a fleet with a resource creation limit
     * policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the
     * policy for this new game session request.
     * </p>
     * <p>
     * <b>Player acceptance policy.</b> By default, newly created game sessions are open to new players. You can
     * restrict new player access by using <a>UpdateGameSession</a> to change the game session's player session creation
     * policy.
     * </p>
     * <p>
     * <b>Game session logs.</b> Logs are retained for all active game sessions for 14 days. To access the logs, call
     * <a>GetGameSessionLogUrl</a> to download the log files.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreateGameSession operation returned by the service.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws FleetCapacityExceededException
     *         The specified fleet has no available instances to fulfill a <code>CreateGameSession</code> request.
     *         Clients can retry such requests immediately or after a waiting period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws IdempotentParameterMismatchException
     *         A game session with this custom ID string already exists in this fleet. Resolve this conflict before
     *         retrying this request.
     * @sample AmazonGameLift.CreateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGameSessionResult createGameSession(CreateGameSessionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGameSession(request);
    }

    @SdkInternalApi
    final CreateGameSessionResult executeCreateGameSession(CreateGameSessionRequest createGameSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(createGameSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGameSessionRequest> request = null;
        Response<CreateGameSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGameSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGameSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGameSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGameSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGameSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game
     * sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can
     * wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple
     * regions. To add placement requests to a queue, call <a>StartGameSessionPlacement</a> and reference the queue
     * name.
     * </p>
     * <p>
     * <b>Destination order.</b> When processing a request for a game session, Amazon GameLift tries each destination in
     * order until it finds one with available resources to host the new game session. A queue's default order is
     * determined by how destinations are listed. The default order is overridden when a game session placement request
     * provides player latency information. Player latency information enables Amazon GameLift to prioritize
     * destinations where players report the lowest average latency, as a result placing the new game session where the
     * majority of players will have the best possible gameplay experience.
     * </p>
     * <p>
     * <b>Player latency policies.</b> For placement requests containing player latency information, use player latency
     * policies to protect individual players from very high latencies. With a latency cap, even when a destination can
     * deliver a low latency for most players, the game is not placed where any individual player is reporting latency
     * higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively
     * starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls;
     * for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a
     * higher cap for the next 60 seconds, etc.
     * </p>
     * <p>
     * To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency
     * policies. If successful, a new queue object is returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return Result of the CreateGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @sample AmazonGameLift.CreateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGameSessionQueueResult createGameSessionQueue(CreateGameSessionQueueRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGameSessionQueue(request);
    }

    @SdkInternalApi
    final CreateGameSessionQueueResult executeCreateGameSessionQueue(CreateGameSessionQueueRequest createGameSessionQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(createGameSessionQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGameSessionQueueRequest> request = null;
        Response<CreateGameSessionQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGameSessionQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGameSessionQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGameSessionQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGameSessionQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateGameSessionQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines a new matchmaking configuration for use with FlexMatch. A matchmaking configuration sets out guidelines
     * for matching players and getting the matches into games. You can set up multiple matchmaking configurations to
     * handle the scenarios needed for your game. Each matchmaking ticket (<a>StartMatchmaking</a> or
     * <a>StartMatchBackfill</a>) specifies a configuration for the match and provides player attributes to support the
     * configuration being used.
     * </p>
     * <p>
     * To create a matchmaking configuration, at a minimum you must specify the following: configuration name; a rule
     * set that governs how to evaluate players and find acceptable matches; a game session queue to use when placing a
     * new game session for the match; and the maximum time allowed for a matchmaking attempt.
     * </p>
     * <p>
     * <b>Player acceptance</b> -- In each configuration, you have the option to require that all players accept
     * participation in a proposed match. To enable this feature, set <i>AcceptanceRequired</i> to true and specify a
     * time limit for player acceptance. Players have the option to accept or reject a proposed match, and a match does
     * not move ahead to game session placement unless all matched players accept.
     * </p>
     * <p>
     * <b>Matchmaking status notification</b> -- There are two ways to track the progress of matchmaking tickets: (1)
     * polling ticket status with <a>DescribeMatchmaking</a>; or (2) receiving notifications with Amazon Simple
     * Notification Service (SNS). To use notifications, you first need to set up an SNS topic to receive the
     * notifications, and provide the topic ARN in the matchmaking configuration (see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-notification.html"> Setting up
     * Notifications for Matchmaking</a>). Since notifications promise only "best effort" delivery, we recommend calling
     * <code>DescribeMatchmaking</code> if no notifications are received within 30 seconds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @return Result of the CreateMatchmakingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.CreateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMatchmakingConfigurationResult createMatchmakingConfiguration(CreateMatchmakingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMatchmakingConfiguration(request);
    }

    @SdkInternalApi
    final CreateMatchmakingConfigurationResult executeCreateMatchmakingConfiguration(CreateMatchmakingConfigurationRequest createMatchmakingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createMatchmakingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMatchmakingConfigurationRequest> request = null;
        Response<CreateMatchmakingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMatchmakingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMatchmakingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMatchmakingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMatchmakingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMatchmakingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the
     * number and size of teams, and sets the parameters for acceptable player matches, such as minimum skill level or
     * character type. A rule set is used by a <a>MatchmakingConfiguration</a>.
     * </p>
     * <p>
     * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets
     * must be defined in the same region as the matchmaking configuration they will be used with.
     * </p>
     * <p>
     * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using
     * <a>ValidateMatchmakingRuleSet</a> before creating a new rule set.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html">Build a Rule Set</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-configuration.html">Design a
     * Matchmaker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-intro.html">Matchmaking with
     * FlexMatch</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMatchmakingRuleSetRequest
     *        Represents the input for a request action.
     * @return Result of the CreateMatchmakingRuleSet operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.CreateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMatchmakingRuleSetResult createMatchmakingRuleSet(CreateMatchmakingRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMatchmakingRuleSet(request);
    }

    @SdkInternalApi
    final CreateMatchmakingRuleSetResult executeCreateMatchmakingRuleSet(CreateMatchmakingRuleSetRequest createMatchmakingRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createMatchmakingRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMatchmakingRuleSetRequest> request = null;
        Response<CreateMatchmakingRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMatchmakingRuleSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMatchmakingRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMatchmakingRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMatchmakingRuleSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMatchmakingRuleSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reserves an open player slot in an active game session. Before a player can be added, a game session must have an
     * <code>ACTIVE</code> status, have a creation policy of <code>ALLOW_ALL</code>, and have an open player slot. To
     * add a group of players to a game session, use <a>CreatePlayerSessions</a>. When the player connects to the game
     * server and references a player session ID, the game server contacts the Amazon GameLift service to validate the
     * player reservation and accept the player.
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a string of player data. If
     * successful, a slot is reserved in the game session for the player and a new <a>PlayerSession</a> object is
     * returned. Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSession operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the game instance. Resolve the conflict before retrying.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the requested player(s) to join. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.CreatePlayerSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePlayerSessionResult createPlayerSession(CreatePlayerSessionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlayerSession(request);
    }

    @SdkInternalApi
    final CreatePlayerSessionResult executeCreatePlayerSession(CreatePlayerSessionRequest createPlayerSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(createPlayerSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlayerSessionRequest> request = null;
        Response<CreatePlayerSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlayerSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPlayerSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlayerSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePlayerSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePlayerSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reserves open slots in a game session for a group of players. Before players can be added, a game session must
     * have an <code>ACTIVE</code> status, have a creation policy of <code>ALLOW_ALL</code>, and have an open player
     * slot. To add a single player to a game session, use <a>CreatePlayerSession</a>. When a player connects to the
     * game server and references a player session ID, the game server contacts the Amazon GameLift service to validate
     * the player reservation and accept the player.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data
     * strings. If successful, a slot is reserved in the game session for each player and a set of new
     * <a>PlayerSession</a> objects is returned. Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the game instance. Resolve the conflict before retrying.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the requested player(s) to join. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.CreatePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlayerSessions(request);
    }

    @SdkInternalApi
    final CreatePlayerSessionsResult executeCreatePlayerSessions(CreatePlayerSessionsRequest createPlayerSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(createPlayerSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlayerSessionsRequest> request = null;
        Response<CreatePlayerSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlayerSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPlayerSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlayerSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePlayerSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePlayerSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new script record for your Realtime Servers script. Realtime scripts are JavaScript that provide
     * configuration settings and optional custom game logic for your game. The script is deployed when you create a
     * Realtime Servers fleet to host your game sessions. Script logic is executed during an active game session.
     * </p>
     * <p>
     * To create a new script record, specify a script name and provide the script file(s). The script files and all
     * dependencies must be zipped into a single file. You can pull the zip file from either of these locations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A locally available directory. Use the <i>ZipFile</i> parameter for this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) bucket under your AWS account. Use the <i>StorageLocation</i>
     * parameter for this option. You'll need to have an Identity Access Management (IAM) role that allows the Amazon
     * GameLift service to access your S3 bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the call is successful, a new script record is created with a unique script ID. If the script file is provided
     * as a local file, the file is uploaded to an Amazon GameLift-owned S3 bucket and the script record's storage
     * location reflects this location. If the script file is provided as an S3 bucket, Amazon GameLift accesses the
     * file at this storage location as needed for deployment.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html">Set Up a Role for
     * Amazon GameLift Access</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListScripts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScript</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createScriptRequest
     * @return Result of the CreateScript operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateScriptResult createScript(CreateScriptRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScript(request);
    }

    @SdkInternalApi
    final CreateScriptResult executeCreateScript(CreateScriptRequest createScriptRequest) {

        ExecutionContext executionContext = createExecutionContext(createScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScriptRequest> request = null;
        Response<CreateScriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScriptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScript");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a
     * virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to
     * communicate directly with other AWS resources. Once you've received authorization, call
     * <a>CreateVpcPeeringConnection</a> to establish the peering connection. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use
     * to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions.
     * </p>
     * <p>
     * To request authorization to create a connection, call this operation from the AWS account with the VPC that you
     * want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a
     * DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of
     * the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If
     * successful, VPC peering is authorized for the specified VPC.
     * </p>
     * <p>
     * To request authorization to delete a connection, call this operation from the AWS account with the VPC that is
     * peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the
     * peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.
     * </p>
     * <p>
     * The authorization remains valid for 24 hours unless it is canceled by a call to
     * <a>DeleteVpcPeeringAuthorization</a>. You must create or delete the peering connection while the authorization is
     * valid.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createVpcPeeringAuthorizationRequest
     *        Represents the input for a request action.
     * @return Result of the CreateVpcPeeringAuthorization operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVpcPeeringAuthorizationResult createVpcPeeringAuthorization(CreateVpcPeeringAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVpcPeeringAuthorization(request);
    }

    @SdkInternalApi
    final CreateVpcPeeringAuthorizationResult executeCreateVpcPeeringAuthorization(CreateVpcPeeringAuthorizationRequest createVpcPeeringAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(createVpcPeeringAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcPeeringAuthorizationRequest> request = null;
        Response<CreateVpcPeeringAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcPeeringAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createVpcPeeringAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVpcPeeringAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVpcPeeringAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVpcPeeringAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for
     * your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other
     * AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you
     * use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. For more
     * information, see <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC
     * Peering with Amazon GameLift Fleets</a>.
     * </p>
     * <p>
     * Before calling this operation to establish the peering connection, you first need to call
     * <a>CreateVpcPeeringAuthorization</a> and identify the VPC you want to peer with. Once the authorization for the
     * specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks
     * necessary to peer the two VPCs, including acceptance, updating routing tables, etc.
     * </p>
     * <p>
     * To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift
     * fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection
     * for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer
     * with. This operation is asynchronous. If successful, a <a>VpcPeeringConnection</a> request is created. You can
     * use continuous polling to track the request's status using <a>DescribeVpcPeeringConnections</a>, or by monitoring
     * fleet events for success or failure using <a>DescribeFleetEvents</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Represents the input for a request action.
     * @return Result of the CreateVpcPeeringConnection operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVpcPeeringConnection(request);
    }

    @SdkInternalApi
    final CreateVpcPeeringConnectionResult executeCreateVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createVpcPeeringConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcPeeringConnectionRequest> request = null;
        Response<CreateVpcPeeringConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcPeeringConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createVpcPeeringConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVpcPeeringConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVpcPeeringConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVpcPeeringConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias. Game clients attempting to access a server process
     * using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlias(request);
    }

    @SdkInternalApi
    final DeleteAliasResult executeDeleteAlias(DeleteAliasRequest deleteAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<DeleteAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the status of any active fleets using the
     * build, but you can no longer create new fleets with the deleted build.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/build-intro.html"> Working with Builds</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DeleteBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteBuild" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBuildResult deleteBuild(DeleteBuildRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBuild(request);
    }

    @SdkInternalApi
    final DeleteBuildResult executeDeleteBuild(DeleteBuildRequest deleteBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBuildRequest> request = null;
        Response<DeleteBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBuildRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBuild");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBuildResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBuildResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must set the fleet's desired capacity to
     * zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a fleet is deleted, you can no longer use
     * that fleet.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleet(request);
    }

    @SdkInternalApi
    final DeleteFleetResult executeDeleteFleet(DeleteFleetRequest deleteFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<DeleteFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a game session queue. This action means that any <a>StartGameSessionPlacement</a> requests that reference
     * this queue will fail. To delete a queue, specify the queue name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGameSessionQueueResult deleteGameSessionQueue(DeleteGameSessionQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGameSessionQueue(request);
    }

    @SdkInternalApi
    final DeleteGameSessionQueueResult executeDeleteGameSessionQueue(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGameSessionQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGameSessionQueueRequest> request = null;
        Response<DeleteGameSessionQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGameSessionQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGameSessionQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGameSessionQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGameSessionQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteGameSessionQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A
     * matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteMatchmakingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.DeleteMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMatchmakingConfigurationResult deleteMatchmakingConfiguration(DeleteMatchmakingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMatchmakingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteMatchmakingConfigurationResult executeDeleteMatchmakingConfiguration(DeleteMatchmakingConfigurationRequest deleteMatchmakingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMatchmakingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMatchmakingConfigurationRequest> request = null;
        Response<DeleteMatchmakingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMatchmakingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMatchmakingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMatchmakingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMatchmakingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMatchmakingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing matchmaking rule set. To delete the rule set, provide the rule set name. Rule sets cannot be
     * deleted if they are currently being used by a matchmaking configuration.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html">Build a Rule Set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMatchmakingRuleSetRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteMatchmakingRuleSet operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.DeleteMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMatchmakingRuleSetResult deleteMatchmakingRuleSet(DeleteMatchmakingRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMatchmakingRuleSet(request);
    }

    @SdkInternalApi
    final DeleteMatchmakingRuleSetResult executeDeleteMatchmakingRuleSet(DeleteMatchmakingRuleSetRequest deleteMatchmakingRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMatchmakingRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMatchmakingRuleSetRequest> request = null;
        Response<DeleteMatchmakingRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMatchmakingRuleSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMatchmakingRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMatchmakingRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMatchmakingRuleSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMatchmakingRuleSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no longer in force and removes all record of
     * it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with.
     * </p>
     * <p>
     * To temporarily suspend scaling policies, call <a>StopFleetActions</a>. This operation suspends all policies for
     * the fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Manage scaling policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (auto-scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (auto-scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (auto-scaling)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteScalingPolicy operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteScalingPolicyResult deleteScalingPolicy(DeleteScalingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScalingPolicy(request);
    }

    @SdkInternalApi
    final DeleteScalingPolicyResult executeDeleteScalingPolicy(DeleteScalingPolicyRequest deleteScalingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScalingPolicyRequest> request = null;
        Response<DeleteScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScalingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScalingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScalingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScalingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Realtime script. This action permanently deletes the script record. If script files were uploaded, they
     * are also deleted (files stored in an S3 bucket are not deleted).
     * </p>
     * <p>
     * To delete a script, specify the script ID. Before deleting a script, be sure to terminate all fleets that are
     * deployed with the script being deleted. Fleet instances periodically check for script updates, and if the script
     * record no longer exists, the instance will go into an error state and be unable to host game sessions.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListScripts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScript</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteScriptRequest
     * @return Result of the DeleteScript operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScript" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteScriptResult deleteScript(DeleteScriptRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScript(request);
    }

    @SdkInternalApi
    final DeleteScriptResult executeDeleteScript(DeleteScriptRequest deleteScriptRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScriptRequest> request = null;
        Response<DeleteScriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScriptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScript");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a pending VPC peering authorization for the specified VPC. If the authorization has already been used to
     * create a peering connection, call <a>DeleteVpcPeeringConnection</a> to remove the connection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteVpcPeeringAuthorizationRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteVpcPeeringAuthorization operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVpcPeeringAuthorizationResult deleteVpcPeeringAuthorization(DeleteVpcPeeringAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVpcPeeringAuthorization(request);
    }

    @SdkInternalApi
    final DeleteVpcPeeringAuthorizationResult executeDeleteVpcPeeringAuthorization(DeleteVpcPeeringAuthorizationRequest deleteVpcPeeringAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVpcPeeringAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcPeeringAuthorizationRequest> request = null;
        Response<DeleteVpcPeeringAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcPeeringAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVpcPeeringAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVpcPeeringAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVpcPeeringAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVpcPeeringAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC
     * peering connection that you want to delete. You can check for an authorization by calling
     * <a>DescribeVpcPeeringAuthorizations</a> or request a new one using <a>CreateVpcPeeringAuthorization</a>.
     * </p>
     * <p>
     * Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the
     * connection is removed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteVpcPeeringConnection operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVpcPeeringConnection(request);
    }

    @SdkInternalApi
    final DeleteVpcPeeringConnectionResult executeDeleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVpcPeeringConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcPeeringConnectionRequest> request = null;
        Response<DeleteVpcPeeringConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcPeeringConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVpcPeeringConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVpcPeeringConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVpcPeeringConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVpcPeeringConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's
     * target fleet ID only, use <code>ResolveAlias</code>.
     * </p>
     * <p>
     * To get alias properties, specify the alias ID. If successful, the requested alias record is returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAliasResult describeAlias(DescribeAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlias(request);
    }

    @SdkInternalApi
    final DescribeAliasResult executeDescribeAlias(DescribeAliasRequest describeAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAliasRequest> request = null;
        Response<DescribeAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for a build. To request a build record, specify a build ID. If successful, an object
     * containing the build properties is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/build-intro.html"> Working with Builds</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeBuild" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBuildResult describeBuild(DescribeBuildRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBuild(request);
    }

    @SdkInternalApi
    final DescribeBuildResult executeDescribeBuild(DescribeBuildRequest describeBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBuildRequest> request = null;
        Response<DescribeBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBuildRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBuild");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBuildResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBuildResultJsonUnmarshaller());
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
     * <li>
     * <p>
     * maximum number of instances allowed per AWS account (service limit)
     * </p>
     * </li>
     * <li>
     * <p>
     * current usage level for the AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management
     * Console for Amazon GameLift (see the drop-down list in the upper right corner).
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeEC2InstanceLimits operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEC2InstanceLimitsResult describeEC2InstanceLimits(DescribeEC2InstanceLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEC2InstanceLimits(request);
    }

    @SdkInternalApi
    final DescribeEC2InstanceLimitsResult executeDescribeEC2InstanceLimits(DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEC2InstanceLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEC2InstanceLimitsRequest> request = null;
        Response<DescribeEC2InstanceLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEC2InstanceLimitsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEC2InstanceLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEC2InstanceLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEC2InstanceLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEC2InstanceLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can
     * request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets,
     * use the pagination parameters to retrieve results as a set of sequential pages. If successful, a
     * <a>FleetAttributes</a> object is returned for each requested fleet ID. When specifying a list of fleet IDs,
     * attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetAttributes operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetAttributesResult describeFleetAttributes(DescribeFleetAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetAttributes(request);
    }

    @SdkInternalApi
    final DescribeFleetAttributesResult executeDescribeFleetAttributes(DescribeFleetAttributesRequest describeFleetAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetAttributesRequest> request = null;
        Response<DescribeFleetAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFleetAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of
     * instances that have been requested for the fleet and the number currently active. You can request capacity for
     * all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>FleetCapacity</a> object is
     * returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only
     * for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetCapacity operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeFleetCapacityResult describeFleetCapacity(DescribeFleetCapacityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetCapacity(request);
    }

    @SdkInternalApi
    final DescribeFleetCapacityResult executeDescribeFleetCapacity(DescribeFleetCapacityRequest describeFleetCapacityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetCapacityRequest> request = null;
        Response<DescribeFleetCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetCapacityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFleetCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetCapacity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetCapacityResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeFleetCapacityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use
     * the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event
     * log entries matching the request are returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetEvents operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DescribeFleetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetEvents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeFleetEventsResult describeFleetEvents(DescribeFleetEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetEvents(request);
    }

    @SdkInternalApi
    final DescribeFleetEventsResult executeDescribeFleetEvents(DescribeFleetEventsRequest describeFleetEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetEventsRequest> request = null;
        Response<DescribeFleetEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFleetEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFleetEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses
     * and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound
     * connection permissions, specify a fleet ID. If successful, a collection of <a>IpPermission</a> objects is
     * returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetPortSettings operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetPortSettingsResult describeFleetPortSettings(DescribeFleetPortSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetPortSettings(request);
    }

    @SdkInternalApi
    final DescribeFleetPortSettingsResult executeDescribeFleetPortSettings(DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetPortSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetPortSettingsRequest> request = null;
        Response<DescribeFleetPortSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetPortSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetPortSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetPortSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetPortSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFleetPortSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or
     * specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a <a>FleetUtilization</a> object is returned for
     * each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets
     * that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetUtilization operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetUtilizationResult describeFleetUtilization(DescribeFleetUtilizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetUtilization(request);
    }

    @SdkInternalApi
    final DescribeFleetUtilizationResult executeDescribeFleetUtilization(DescribeFleetUtilizationRequest describeFleetUtilizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetUtilizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetUtilizationRequest> request = null;
        Response<DescribeFleetUtilizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetUtilizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetUtilizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetUtilization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetUtilizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFleetUtilizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be
     * used in several ways: (1) provide a <code>GameSessionId</code> or <code>GameSessionArn</code> to request details
     * for a specific game session; (2) provide either a <code>FleetId</code> or an <code>AliasId</code> to request
     * properties for all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can
     * filter this request by game session status. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, a <a>GameSessionDetail</a> object is returned for each session matching the
     * request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionDetails operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @sample AmazonGameLift.DescribeGameSessionDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGameSessionDetailsResult describeGameSessionDetails(DescribeGameSessionDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGameSessionDetails(request);
    }

    @SdkInternalApi
    final DescribeGameSessionDetailsResult executeDescribeGameSessionDetails(DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGameSessionDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGameSessionDetailsRequest> request = null;
        Response<DescribeGameSessionDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGameSessionDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGameSessionDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGameSessionDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGameSessionDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGameSessionDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties and current status of a game session placement request. To get game session placement
     * details, specify the placement ID. If successful, a <a>GameSessionPlacement</a> object is returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGameSessionPlacementResult describeGameSessionPlacement(DescribeGameSessionPlacementRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGameSessionPlacement(request);
    }

    @SdkInternalApi
    final DescribeGameSessionPlacementResult executeDescribeGameSessionPlacement(DescribeGameSessionPlacementRequest describeGameSessionPlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGameSessionPlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGameSessionPlacementRequest> request = null;
        Response<DescribeGameSessionPlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGameSessionPlacementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGameSessionPlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGameSessionPlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGameSessionPlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGameSessionPlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>GameSessionQueue</a> object is
     * returned for each requested queue. When specifying a list of queues, objects are returned only for queues that
     * currently exist in the region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionQueuesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionQueues operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeGameSessionQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGameSessionQueuesResult describeGameSessionQueues(DescribeGameSessionQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGameSessionQueues(request);
    }

    @SdkInternalApi
    final DescribeGameSessionQueuesResult executeDescribeGameSessionQueues(DescribeGameSessionQueuesRequest describeGameSessionQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGameSessionQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGameSessionQueuesRequest> request = null;
        Response<DescribeGameSessionQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGameSessionQueuesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGameSessionQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGameSessionQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGameSessionQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGameSessionQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a
     * fleet. Alternatively, use <a>SearchGameSessions</a> to request a set of active game sessions that are filtered by
     * certain criteria. To retrieve protection policy settings for game sessions, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this
     * request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages.
     * If successful, a <a>GameSession</a> object is returned for each game session matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @sample AmazonGameLift.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeGameSessionsResult describeGameSessions(DescribeGameSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGameSessions(request);
    }

    @SdkInternalApi
    final DescribeGameSessionsResult executeDescribeGameSessions(DescribeGameSessionsRequest describeGameSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGameSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGameSessionsRequest> request = null;
        Response<DescribeGameSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGameSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGameSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGameSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGameSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGameSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all
     * instances in the fleet or get details on one specific instance.
     * </p>
     * <p>
     * To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID
     * only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an
     * <a>Instance</a> object is returned for each result.
     * </p>
     * 
     * @param describeInstancesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeInstances operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstances(request);
    }

    @SdkInternalApi
    final DescribeInstancesResult executeDescribeInstances(DescribeInstancesRequest describeInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesRequest> request = null;
        Response<DescribeInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves one or more matchmaking tickets. Use this operation to retrieve ticket information, including status
     * and--once a successful match is made--acquire connection information for the resulting new game session.
     * </p>
     * <p>
     * You can use this operation to track the progress of matchmaking requests (through polling) as an alternative to
     * using event notifications. See more details on tracking matchmaking requests through polling or notifications in
     * <a>StartMatchmaking</a>.
     * </p>
     * <p>
     * To request matchmaking tickets, provide a list of up to 10 ticket IDs. If the request is successful, a ticket
     * object is returned for each requested ID that currently exists.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartMatchBackfill</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeMatchmaking operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.DescribeMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeMatchmakingResult describeMatchmaking(DescribeMatchmakingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMatchmaking(request);
    }

    @SdkInternalApi
    final DescribeMatchmakingResult executeDescribeMatchmaking(DescribeMatchmakingRequest describeMatchmakingRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMatchmakingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMatchmakingRequest> request = null;
        Response<DescribeMatchmakingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMatchmakingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMatchmakingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMatchmaking");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMatchmakingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMatchmakingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of FlexMatch matchmaking configurations. with this operation, you have the following
     * options: (1) retrieve all existing configurations, (2) provide the names of one or more configurations to
     * retrieve, or (3) retrieve all configurations that use a specified rule set name. When requesting multiple items,
     * use the pagination parameters to retrieve results as a set of sequential pages. If successful, a configuration is
     * returned for each requested name. When specifying a list of names, only configurations that currently exist are
     * returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingConfigurationsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeMatchmakingConfigurations operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.DescribeMatchmakingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMatchmakingConfigurationsResult describeMatchmakingConfigurations(DescribeMatchmakingConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMatchmakingConfigurations(request);
    }

    @SdkInternalApi
    final DescribeMatchmakingConfigurationsResult executeDescribeMatchmakingConfigurations(
            DescribeMatchmakingConfigurationsRequest describeMatchmakingConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMatchmakingConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMatchmakingConfigurationsRequest> request = null;
        Response<DescribeMatchmakingConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMatchmakingConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMatchmakingConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMatchmakingConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMatchmakingConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMatchmakingConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the region,
     * or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html">Build a Rule Set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingRuleSetsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeMatchmakingRuleSets operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.DescribeMatchmakingRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingRuleSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMatchmakingRuleSets(request);
    }

    @SdkInternalApi
    final DescribeMatchmakingRuleSetsResult executeDescribeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest describeMatchmakingRuleSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMatchmakingRuleSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMatchmakingRuleSetsRequest> request = null;
        Response<DescribeMatchmakingRuleSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMatchmakingRuleSetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMatchmakingRuleSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMatchmakingRuleSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMatchmakingRuleSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMatchmakingRuleSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a
     * <code>PlayerSessionId</code> to request properties for a specific player session; (2) provide a
     * <code>GameSessionId</code> to request properties for all player sessions in the specified game session; (3)
     * provide a <code>PlayerId</code> to request properties for all player sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a
     * player ID. You can filter this request by player session status. Use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a <a>PlayerSession</a> object is returned for each session
     * matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribePlayerSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribePlayerSessions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePlayerSessionsResult describePlayerSessions(DescribePlayerSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePlayerSessions(request);
    }

    @SdkInternalApi
    final DescribePlayerSessionsResult executeDescribePlayerSessions(DescribePlayerSessionsRequest describePlayerSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePlayerSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlayerSessionsRequest> request = null;
        Response<DescribePlayerSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePlayerSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePlayerSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePlayerSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePlayerSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePlayerSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current run-time configuration for the specified fleet. The run-time configuration tells Amazon
     * GameLift how to launch server processes on instances in the fleet.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeRuntimeConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DescribeRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRuntimeConfigurationResult describeRuntimeConfiguration(DescribeRuntimeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRuntimeConfiguration(request);
    }

    @SdkInternalApi
    final DescribeRuntimeConfigurationResult executeDescribeRuntimeConfiguration(DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRuntimeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuntimeConfigurationRequest> request = null;
        Response<DescribeRuntimeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuntimeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRuntimeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRuntimeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRuntimeConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRuntimeConfigurationResultJsonUnmarshaller());
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
     * To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to
     * retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential
     * pages. If successful, set of <a>ScalingPolicy</a> objects is returned for the fleet.
     * </p>
     * <p>
     * A fleet may have all of its scaling policies suspended (<a>StopFleetActions</a>). This action does not affect the
     * status of the scaling policies, which remains ACTIVE. To see whether a fleet's scaling policies are in force or
     * suspended, call <a>DescribeFleetAttributes</a> and check the stopped actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Manage scaling policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (auto-scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (auto-scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (auto-scaling)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeScalingPolicies operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalingPoliciesResult describeScalingPolicies(DescribeScalingPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingPolicies(request);
    }

    @SdkInternalApi
    final DescribeScalingPoliciesResult executeDescribeScalingPolicies(DescribeScalingPoliciesRequest describeScalingPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingPoliciesRequest> request = null;
        Response<DescribeScalingPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeScalingPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScalingPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScalingPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves properties for a Realtime script.
     * </p>
     * <p>
     * To request a script record, specify the script ID. If successful, an object containing the script properties is
     * returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListScripts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScript</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeScriptRequest
     * @return Result of the DescribeScript operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.DescribeScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScript" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeScriptResult describeScript(DescribeScriptRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScript(request);
    }

    @SdkInternalApi
    final DescribeScriptResult executeDescribeScript(DescribeScriptRequest describeScriptRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScriptRequest> request = null;
        Response<DescribeScriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScriptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScript");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeScriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC
     * peering authorizations and requests for peering. This includes those initiated and received by this account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeVpcPeeringAuthorizationsRequest
     * @return Result of the DescribeVpcPeeringAuthorizations operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeVpcPeeringAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeVpcPeeringAuthorizationsResult describeVpcPeeringAuthorizations(DescribeVpcPeeringAuthorizationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVpcPeeringAuthorizations(request);
    }

    @SdkInternalApi
    final DescribeVpcPeeringAuthorizationsResult executeDescribeVpcPeeringAuthorizations(
            DescribeVpcPeeringAuthorizationsRequest describeVpcPeeringAuthorizationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVpcPeeringAuthorizationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpcPeeringAuthorizationsRequest> request = null;
        Response<DescribeVpcPeeringAuthorizationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpcPeeringAuthorizationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeVpcPeeringAuthorizationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVpcPeeringAuthorizations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVpcPeeringAuthorizationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeVpcPeeringAuthorizationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or
     * for one specific fleet ID.
     * </p>
     * <p>
     * To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If
     * successful, the retrieved information includes both active and pending connections. Active connections identify
     * the IpV4 CIDR block that the VPC uses to connect.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeVpcPeeringConnections operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVpcPeeringConnections(request);
    }

    @SdkInternalApi
    final DescribeVpcPeeringConnectionsResult executeDescribeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVpcPeeringConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpcPeeringConnectionsRequest> request = null;
        Response<DescribeVpcPeeringConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpcPeeringConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeVpcPeeringConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVpcPeeringConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVpcPeeringConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeVpcPeeringConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session. When a game session is
     * terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL
     * to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">AWS
     * Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @return Result of the GetGameSessionLogUrl operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.GetGameSessionLogUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetGameSessionLogUrlResult getGameSessionLogUrl(GetGameSessionLogUrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetGameSessionLogUrl(request);
    }

    @SdkInternalApi
    final GetGameSessionLogUrlResult executeGetGameSessionLogUrl(GetGameSessionLogUrlRequest getGameSessionLogUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getGameSessionLogUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGameSessionLogUrlRequest> request = null;
        Response<GetGameSessionLogUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGameSessionLogUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGameSessionLogUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGameSessionLogUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGameSessionLogUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGameSessionLogUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data,
     * or watching activity in real time.
     * </p>
     * <p>
     * Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon
     * GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux
     * instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client.
     * The private key must be saved in the proper format to a <code>.pem</code> file before using. If you're making
     * this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See
     * the example later in this topic). For more information on remote access, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Accessing an
     * Instance</a>.
     * </p>
     * <p>
     * To request access to a specific instance, specify the IDs of both the instance and the fleet it belongs to. You
     * can retrieve a fleet's instance IDs by calling <a>DescribeInstances</a>. If successful, an <a>InstanceAccess</a>
     * object is returned containing the instance's IP address and a set of credentials.
     * </p>
     * 
     * @param getInstanceAccessRequest
     *        Represents the input for a request action.
     * @return Result of the GetInstanceAccess operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.GetInstanceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstanceAccessResult getInstanceAccess(GetInstanceAccessRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceAccess(request);
    }

    @SdkInternalApi
    final GetInstanceAccessResult executeGetInstanceAccess(GetInstanceAccessRequest getInstanceAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceAccessRequest> request = null;
        Response<GetInstanceAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy
     * type. Use the pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Returned aliases are not listed in any particular order.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @return Result of the ListAliases operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAliases(request);
    }

    @SdkInternalApi
    final ListAliasesResult executeListAliases(ListAliasesRequest listAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds
     * that are in a specific status by using the <code>Status</code> parameter. Use the pagination parameters to
     * retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/build-intro.html"> Working with Builds</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @return Result of the ListBuilds operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBuildsResult listBuilds(ListBuildsRequest request) {
        request = beforeClientExecution(request);
        return executeListBuilds(request);
    }

    @SdkInternalApi
    final ListBuildsResult executeListBuilds(ListBuildsRequest listBuildsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuildsRequest> request = null;
        Response<ListBuildsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuildsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBuildsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBuilds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBuildsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBuildsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can filter the result set to find only those
     * fleets that are deployed with a specific build or script. Use the pagination parameters to retrieve results in
     * sequential pages.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in a particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Set Up Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @return Result of the ListFleets operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFleetsResult listFleets(ListFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListFleets(request);
    }

    @SdkInternalApi
    final ListFleetsResult executeListFleets(ListFleetsRequest listFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsRequest> request = null;
        Response<ListFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFleets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFleetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves script records for all Realtime scripts that are associated with the AWS account in use.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListScripts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScript</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listScriptsRequest
     * @return Result of the ListScripts operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListScripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListScripts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListScriptsResult listScripts(ListScriptsRequest request) {
        request = beforeClientExecution(request);
        return executeListScripts(request);
    }

    @SdkInternalApi
    final ListScriptsResult executeListScripts(ListScriptsRequest listScriptsRequest) {

        ExecutionContext executionContext = createExecutionContext(listScriptsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScriptsRequest> request = null;
        Response<ListScriptsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScriptsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScriptsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScripts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScriptsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScriptsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. Scaling policies are used to automatically scale a fleet's
     * hosting capacity to meet player demand. An active scaling policy instructs Amazon GameLift to track a fleet
     * metric and automatically change the fleet's capacity when a certain threshold is reached. There are two types of
     * scaling policies: target-based and rule-based. Use a target-based policy to quickly and efficiently manage fleet
     * scaling; this option is the most commonly used. Use rule-based policies when you need to exert fine-grained
     * control over auto-scaling.
     * </p>
     * <p>
     * Fleets can have multiple scaling policies of each type in force at the same time; you can have one target-based
     * policy, one or multiple rule-based scaling policies, or both. We recommend caution, however, because multiple
     * auto-scaling policies can have unintended consequences.
     * </p>
     * <p>
     * You can temporarily suspend all scaling policies for a fleet by calling <a>StopFleetActions</a> with the fleet
     * action AUTO_SCALING. To resume scaling policies, call <a>StartFleetActions</a> with the same fleet action. To
     * stop just one scaling policy--or to permanently remove it, you must delete the policy with
     * <a>DeleteScalingPolicy</a>.
     * </p>
     * <p>
     * Learn more about how to work with auto-scaling in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-autoscaling.html">Set Up Fleet Automatic
     * Scaling</a>.
     * </p>
     * <p>
     * <b>Target-based policy</b>
     * </p>
     * <p>
     * A target-based policy tracks a single metric: PercentAvailableGameSessions. This metric tells us how much of a
     * fleet's hosting capacity is ready to host game sessions but is not currently in use. This is the fleet's buffer;
     * it measures the additional player demand that the fleet could handle at current capacity. With a target-based
     * policy, you set your ideal buffer size and leave it to Amazon GameLift to take whatever action is needed to
     * maintain that target.
     * </p>
     * <p>
     * For example, you might choose to maintain a 10% buffer for a fleet that has the capacity to host 100 simultaneous
     * game sessions. This policy tells Amazon GameLift to take action whenever the fleet's available capacity falls
     * below or rises above 10 game sessions. Amazon GameLift will start new instances or stop unused instances in order
     * to return to the 10% buffer.
     * </p>
     * <p>
     * To create or update a target-based policy, specify a fleet ID and name, and set the policy type to "TargetBased".
     * Specify the metric to track (PercentAvailableGameSessions) and reference a <a>TargetConfiguration</a> object with
     * your desired buffer value. Exclude all other parameters. On a successful request, the policy name is returned.
     * The scaling policy is automatically in force as soon as it's successfully created. If the fleet's auto-scaling
     * actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.
     * </p>
     * <p>
     * <b>Rule-based policy</b>
     * </p>
     * <p>
     * A rule-based policy tracks specified fleet metric, sets a threshold value, and specifies the type of action to
     * initiate when triggered. With a rule-based policy, you can select from several available fleet metrics. Each
     * policy specifies whether to scale up or scale down (and by how much), so you need one policy for each type of
     * action.
     * </p>
     * <p>
     * For example, a policy may make the following statement:
     * "If the percentage of idle instances is greater than 20% for more than 15 minutes, then reduce the fleet capacity by 10%."
     * </p>
     * <p>
     * A policy's rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code> <code>[Threshold]</code> for
     * <code>[EvaluationPeriods]</code> minutes, then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * To implement the example, the rule statement would look like this:
     * </p>
     * <p>
     * If <code>[PercentIdleInstances]</code> is <code>[GreaterThanThreshold]</code> <code>[20]</code> for
     * <code>[15]</code> minutes, then <code>[PercentChangeInCapacity]</code> to/by <code>[10]</code>.
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the policy type
     * to "RuleBased". Specify the parameter values for a policy rule statement. On a successful request, the policy
     * name is returned. Scaling policies are automatically in force as soon as they're successfully created. If the
     * fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions
     * are restarted.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Manage scaling policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (auto-scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (auto-scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (auto-scaling)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutScalingPolicy(request);
    }

    @SdkInternalApi
    final PutScalingPolicyResult executePutScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScalingPolicyRequest> request = null;
        Response<PutScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScalingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutScalingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutScalingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutScalingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's
     * Amazon S3. This is done as part of the build creation process; see <a>CreateBuild</a>.
     * </p>
     * <p>
     * To request new credentials, specify the build ID as returned with an initial <code>CreateBuild</code> request. If
     * successful, a new set of credentials are returned, along with the S3 storage location associated with the build
     * ID.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">Uploading Your
     * Game</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @return Result of the RequestUploadCredentials operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.RequestUploadCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RequestUploadCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RequestUploadCredentialsResult requestUploadCredentials(RequestUploadCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeRequestUploadCredentials(request);
    }

    @SdkInternalApi
    final RequestUploadCredentialsResult executeRequestUploadCredentials(RequestUploadCredentialsRequest requestUploadCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(requestUploadCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestUploadCredentialsRequest> request = null;
        Response<RequestUploadCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestUploadCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(requestUploadCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RequestUploadCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RequestUploadCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RequestUploadCredentialsResultJsonUnmarshaller());
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
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return Result of the ResolveAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ResolveAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResolveAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResolveAliasResult resolveAlias(ResolveAliasRequest request) {
        request = beforeClientExecution(request);
        return executeResolveAlias(request);
    }

    @SdkInternalApi
    final ResolveAliasResult executeResolveAlias(ResolveAliasRequest resolveAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(resolveAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveAliasRequest> request = null;
        Response<ResolveAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resolveAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResolveAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResolveAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResolveAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all active game sessions that match a set of search criteria and sorts them in a specified order. You
     * can search or sort by the following game session attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>gameSessionId</b> -- Unique identifier for the game session. You can use either a <code>GameSessionId</code>
     * or <code>GameSessionArn</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionName</b> -- Name assigned to a game session. This value is set when requesting a new game session
     * with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>. Game session names do not need to be
     * unique to a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionProperties</b> -- Custom data defined in a game session's <code>GameProperty</code> parameter.
     * <code>GameProperty</code> values are stored as key:value pairs; the filter expression must indicate the key and a
     * string to search the data values for. For example, to search for game sessions with custom data containing the
     * key:value pair "gameMode:brawl", specify the following: <code>gameSessionProperties.gameMode = "brawl"</code>.
     * All custom data values are searched as strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session. This value is set when
     * requesting a new game session with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>creationTimeMillis</b> -- Value indicating when a game session was created. It is expressed in Unix time as
     * milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>playerSessionCount</b> -- Number of players currently connected to a game session. This value changes rapidly
     * as players join the session or drop out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>hasAvailablePlayerSessions</b> -- Boolean value indicating whether a game session has reached its maximum
     * number of players. It is highly recommended that all search requests include this filter attribute to optimize
     * search performance and return only sessions that players can join.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Returned values for <code>playerSessionCount</code> and <code>hasAvailablePlayerSessions</code> change quickly as
     * players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh
     * search results often, and handle sessions that fill up before a player can join.
     * </p>
     * </note>
     * <p>
     * To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort
     * expression, or both. If successful, a collection of <a>GameSession</a> objects matching the request is returned.
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * You can search for game sessions one fleet at a time only. To find game sessions across multiple fleets, you must
     * search each fleet separately and combine the results. This search feature finds only game sessions that are in
     * <code>ACTIVE</code> status. To locate games in statuses other than active, use <a>DescribeGameSessionDetails</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param searchGameSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the SearchGameSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @sample AmazonGameLift.SearchGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchGameSessionsResult searchGameSessions(SearchGameSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchGameSessions(request);
    }

    @SdkInternalApi
    final SearchGameSessionsResult executeSearchGameSessions(SearchGameSessionsRequest searchGameSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchGameSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchGameSessionsRequest> request = null;
        Response<SearchGameSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchGameSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchGameSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchGameSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchGameSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchGameSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resumes activity on a fleet that was suspended with <a>StopFleetActions</a>. Currently, this operation is used to
     * restart a fleet's auto-scaling activity.
     * </p>
     * <p>
     * To start fleet actions, specify the fleet ID and the type of actions to restart. When auto-scaling fleet actions
     * are restarted, Amazon GameLift once again initiates scaling events as triggered by the fleet's scaling policies.
     * If actions on the fleet were never stopped, this operation will have no effect. You can view a fleet's stopped
     * actions using <a>DescribeFleetAttributes</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param startFleetActionsRequest
     * @return Result of the StartFleetActions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.StartFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartFleetActionsResult startFleetActions(StartFleetActionsRequest request) {
        request = beforeClientExecution(request);
        return executeStartFleetActions(request);
    }

    @SdkInternalApi
    final StartFleetActionsResult executeStartFleetActions(StartFleetActionsRequest startFleetActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(startFleetActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFleetActionsRequest> request = null;
        Response<StartFleetActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFleetActionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFleetActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFleetActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFleetActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFleetActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Places a request for a new game session in a queue (see <a>CreateGameSessionQueue</a>). When processing a
     * placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each
     * until it finds resources or the placement request times out.
     * </p>
     * <p>
     * A game session placement request can also request player sessions. When a new game session is successfully
     * created, Amazon GameLift creates a player session for each player included in the request.
     * </p>
     * <p>
     * When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the
     * queue configuration. Ideally, a queue's destinations are listed in preference order.
     * </p>
     * <p>
     * Alternatively, when requesting a game session with players, you can also provide latency data for each player in
     * relevant regions. Latency data indicates the performance lag a player experiences when connected to a fleet in
     * the region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a
     * region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each
     * region's average lag for all players and reorders to get the best game play across all players.
     * </p>
     * <p>
     * To place a new game session request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The queue name and a set of game session properties and settings
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) A set of player data and a unique player ID for each player that you are joining to the new game
     * session (player data is optional, but if you include it, you must also provide a unique ID for each player)
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency data for all players (if you want to optimize game play for the players)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a new game session placement is created.
     * </p>
     * <p>
     * To track the status of a placement request, call <a>DescribeGameSessionPlacement</a> and check the request's
     * status. If the status is <code>FULFILLED</code>, a new game session has been created and a game session ARN and
     * region are referenced. If the placement request times out, you can resubmit the request or retry it with a
     * different queue.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param startGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return Result of the StartGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartGameSessionPlacementResult startGameSessionPlacement(StartGameSessionPlacementRequest request) {
        request = beforeClientExecution(request);
        return executeStartGameSessionPlacement(request);
    }

    @SdkInternalApi
    final StartGameSessionPlacementResult executeStartGameSessionPlacement(StartGameSessionPlacementRequest startGameSessionPlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(startGameSessionPlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartGameSessionPlacementRequest> request = null;
        Response<StartGameSessionPlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartGameSessionPlacementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startGameSessionPlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartGameSessionPlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartGameSessionPlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartGameSessionPlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Finds new players to fill open slots in an existing game session. This operation can be used to add players to
     * matched games that start with fewer than the maximum number of players or to replace players when they drop out.
     * By backfilling with the same matchmaker used to create the original match, you ensure that new players meet the
     * match criteria and maintain a consistent experience throughout the game session. You can backfill a match anytime
     * after a game session has been created.
     * </p>
     * <p>
     * To request a match backfill, specify a unique ticket ID, the existing game session's ARN, a matchmaking
     * configuration, and a set of data that describes all current players in the game session. If successful, a match
     * backfill ticket is created and returned with status set to QUEUED. The ticket is placed in the matchmaker's
     * ticket pool and processed. Track the status of the ticket to respond as needed. For more detail how to set up
     * backfilling, see <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-backfill.html">
     * Backfill Existing Games with FlexMatch</a>.
     * </p>
     * <p>
     * The process of finding backfill matches is essentially identical to the initial matchmaking process. The
     * matchmaker searches the pool and groups tickets together to form potential matches, allowing only one backfill
     * ticket per potential match. Once the a match is formed, the matchmaker creates player sessions for the new
     * players. All tickets in the match are updated with the game session's connection information, and the
     * <a>GameSession</a> object is updated to include matchmaker data on the new players. For more detail on how match
     * backfill requests are processed, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-intro.html"> How Amazon GameLift FlexMatch
     * Works</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartMatchBackfill</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMatchBackfillRequest
     *        Represents the input for a request action.
     * @return Result of the StartMatchBackfill operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.StartMatchBackfill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchBackfill" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartMatchBackfillResult startMatchBackfill(StartMatchBackfillRequest request) {
        request = beforeClientExecution(request);
        return executeStartMatchBackfill(request);
    }

    @SdkInternalApi
    final StartMatchBackfillResult executeStartMatchBackfill(StartMatchBackfillRequest startMatchBackfillRequest) {

        ExecutionContext executionContext = createExecutionContext(startMatchBackfillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMatchBackfillRequest> request = null;
        Response<StartMatchBackfillResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMatchBackfillRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMatchBackfillRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMatchBackfill");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMatchBackfillResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartMatchBackfillResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules, and starts a new
     * game for the matched players. Each matchmaking request specifies the type of match to build (team configuration,
     * rules for an acceptable match, etc.). The request also specifies the players to find a match for and where to
     * host the new game session for optimal performance. A matchmaking request might start with a single player or a
     * group of players who want to play together. FlexMatch finds additional players as needed to fill the match. Match
     * type, rules, and the queue used to place a new game session are defined in a
     * <code>MatchmakingConfiguration</code>. For complete information on setting up and using FlexMatch, see the topic
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-intro.html"> Adding FlexMatch to Your
     * Game</a>.
     * </p>
     * <p>
     * To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to
     * be matched. You must also include a set of player attributes relevant for the matchmaking configuration. If
     * successful, a matchmaking ticket is returned with status set to <code>QUEUED</code>. Track the status of the
     * ticket to respond as needed and acquire game session connection information for successfully completed matches.
     * </p>
     * <p>
     * <b>Tracking ticket status</b> -- A couple of options are available for tracking the status of matchmaking
     * requests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Polling -- Call <code>DescribeMatchmaking</code>. This operation returns the full ticket object, including
     * current status and (for completed tickets) game session connection info. We recommend polling no more than once
     * every 10 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notifications -- Get event notifications for changes in ticket status using Amazon Simple Notification Service
     * (SNS). Notifications are easy to set up (see <a>CreateMatchmakingConfiguration</a>) and typically deliver match
     * status changes faster and more efficiently than polling. We recommend that you use polling to back up to
     * notifications (since delivery is not guaranteed) and call <code>DescribeMatchmaking</code> only when
     * notifications are not received within 30 seconds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Processing a matchmaking request</b> -- FlexMatch handles a matchmaking request as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Your client code submits a <code>StartMatchmaking</code> request for one or more players and tracks the status of
     * the request ticket.
     * </p>
     * </li>
     * <li>
     * <p>
     * FlexMatch uses this ticket and others in process to build an acceptable match. When a potential match is
     * identified, all tickets in the proposed match are advanced to the next status.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the match requires player acceptance (set in the matchmaking configuration), the tickets move into status
     * <code>REQUIRES_ACCEPTANCE</code>. This status triggers your client code to solicit acceptance from all players in
     * every ticket involved in the match, and then call <a>AcceptMatch</a> for each player. If any player rejects or
     * fails to accept the match before a specified timeout, the proposed match is dropped (see <code>AcceptMatch</code>
     * for more details).
     * </p>
     * </li>
     * <li>
     * <p>
     * Once a match is proposed and accepted, the matchmaking tickets move into status <code>PLACING</code>. FlexMatch
     * locates resources for a new game session using the game session queue (set in the matchmaking configuration) and
     * creates the game session based on the match data.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the match is successfully placed, the matchmaking tickets move into <code>COMPLETED</code> status.
     * Connection information (including game session endpoint and player session) is added to the matchmaking tickets.
     * Matched players can use the connection information to join the game.
     * </p>
     * </li>
     * </ol>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartMatchBackfill</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMatchmakingRequest
     *        Represents the input for a request action.
     * @return Result of the StartMatchmaking operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.StartMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartMatchmakingResult startMatchmaking(StartMatchmakingRequest request) {
        request = beforeClientExecution(request);
        return executeStartMatchmaking(request);
    }

    @SdkInternalApi
    final StartMatchmakingResult executeStartMatchmaking(StartMatchmakingRequest startMatchmakingRequest) {

        ExecutionContext executionContext = createExecutionContext(startMatchmakingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMatchmakingRequest> request = null;
        Response<StartMatchmakingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMatchmakingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMatchmakingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMatchmaking");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMatchmakingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartMatchmakingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Suspends activity on a fleet. Currently, this operation is used to stop a fleet's auto-scaling activity. It is
     * used to temporarily stop scaling events triggered by the fleet's scaling policies. The policies can be retained
     * and auto-scaling activity can be restarted using <a>StartFleetActions</a>. You can view a fleet's stopped actions
     * using <a>DescribeFleetAttributes</a>.
     * </p>
     * <p>
     * To stop fleet actions, specify the fleet ID and the type of actions to suspend. When auto-scaling fleet actions
     * are stopped, Amazon GameLift no longer initiates scaling events except to maintain the fleet's desired instances
     * setting (<a>FleetCapacity</a>. Changes to the fleet's capacity must be done manually using
     * <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param stopFleetActionsRequest
     * @return Result of the StopFleetActions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.StopFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopFleetActionsResult stopFleetActions(StopFleetActionsRequest request) {
        request = beforeClientExecution(request);
        return executeStopFleetActions(request);
    }

    @SdkInternalApi
    final StopFleetActionsResult executeStopFleetActions(StopFleetActionsRequest stopFleetActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(stopFleetActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopFleetActionsRequest> request = null;
        Response<StopFleetActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopFleetActionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopFleetActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopFleetActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopFleetActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopFleetActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a game session placement that is in <code>PENDING</code> status. To stop a placement, provide the
     * placement ID values. If successful, the placement is moved to <code>CANCELLED</code> status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param stopGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return Result of the StopGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.StopGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopGameSessionPlacementResult stopGameSessionPlacement(StopGameSessionPlacementRequest request) {
        request = beforeClientExecution(request);
        return executeStopGameSessionPlacement(request);
    }

    @SdkInternalApi
    final StopGameSessionPlacementResult executeStopGameSessionPlacement(StopGameSessionPlacementRequest stopGameSessionPlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(stopGameSessionPlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopGameSessionPlacementRequest> request = null;
        Response<StopGameSessionPlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopGameSessionPlacementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopGameSessionPlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopGameSessionPlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopGameSessionPlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopGameSessionPlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a matchmaking ticket that is currently being processed. To stop the matchmaking operation, specify the
     * ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed to
     * <code>CANCELLED</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartMatchBackfill</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopMatchmakingRequest
     *        Represents the input for a request action.
     * @return Result of the StopMatchmaking operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.StopMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopMatchmakingResult stopMatchmaking(StopMatchmakingRequest request) {
        request = beforeClientExecution(request);
        return executeStopMatchmaking(request);
    }

    @SdkInternalApi
    final StopMatchmakingResult executeStopMatchmaking(StopMatchmakingRequest stopMatchmakingRequest) {

        ExecutionContext executionContext = createExecutionContext(stopMatchmakingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopMatchmakingRequest> request = null;
        Response<StopMatchmakingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopMatchmakingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopMatchmakingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopMatchmaking");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopMatchmakingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopMatchmakingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the
     * information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAliasResult updateAlias(UpdateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAlias(request);
    }

    @SdkInternalApi
    final UpdateAliasResult executeUpdateAlias(UpdateAliasRequest updateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<UpdateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version. To update the metadata, specify the
     * build ID to update and provide the new values. If successful, a build object containing the updated metadata is
     * returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/build-intro.html"> Working with Builds</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBuildResult updateBuild(UpdateBuildRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBuild(request);
    }

    @SdkInternalApi
    final UpdateBuildResult executeUpdateBuild(UpdateBuildRequest updateBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBuildRequest> request = null;
        Response<UpdateBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBuildRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBuild");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBuildResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBuildResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID
     * and the property values that you want to change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetAttributes operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFleetAttributesResult updateFleetAttributes(UpdateFleetAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFleetAttributes(request);
    }

    @SdkInternalApi
    final UpdateFleetAttributesResult executeUpdateFleetAttributes(UpdateFleetAttributesRequest updateFleetAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFleetAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetAttributesRequest> request = null;
        Response<UpdateFleetAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFleetAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFleetAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFleetAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateFleetAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you
     * want this fleet to contain. Before calling this action, you may want to call <a>DescribeEC2InstanceLimits</a> to
     * get the maximum capacity based on the fleet's EC2 instance type.
     * </p>
     * <p>
     * Specify minimum and maximum number of instances. Amazon GameLift will not change fleet capacity to values fall
     * outside of this range. This is particularly important when using auto-scaling (see <a>PutScalingPolicy</a>) to
     * allow capacity to adjust based on player demand while imposing limits on automatic adjustments.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If
     * successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the
     * desired instance count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher than the instance type's limit, the
     * "Limit Exceeded" exception occurs.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetCapacity operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFleetCapacityResult updateFleetCapacity(UpdateFleetCapacityRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFleetCapacity(request);
    }

    @SdkInternalApi
    final UpdateFleetCapacityResult executeUpdateFleetCapacity(UpdateFleetCapacityRequest updateFleetCapacityRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFleetCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetCapacityRequest> request = null;
        Response<UpdateFleetCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetCapacityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFleetCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFleetCapacity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFleetCapacityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFleetCapacityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the
     * permissions you want to update. List the permissions you want to add in
     * <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions. If
     * successful, the fleet ID for the updated fleet is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetPortSettings operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFleetPortSettingsResult updateFleetPortSettings(UpdateFleetPortSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFleetPortSettings(request);
    }

    @SdkInternalApi
    final UpdateFleetPortSettingsResult executeUpdateFleetPortSettings(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFleetPortSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetPortSettingsRequest> request = null;
        Response<UpdateFleetPortSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetPortSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFleetPortSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFleetPortSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFleetPortSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFleetPortSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum player count, protection policy, which
     * controls whether or not an active game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can join the session. To update a game
     * session, specify the game session ID and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateGameSession operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the game instance. Resolve the conflict before retrying.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.UpdateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGameSessionResult updateGameSession(UpdateGameSessionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGameSession(request);
    }

    @SdkInternalApi
    final UpdateGameSessionResult executeUpdateGameSession(UpdateGameSessionRequest updateGameSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGameSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGameSessionRequest> request = null;
        Response<UpdateGameSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGameSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGameSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGameSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGameSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGameSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates settings for a game session queue, which determines how new game session requests in the queue are
     * processed. To update settings, specify the queue name to be updated and provide the new settings. When updating
     * destinations, provide a complete list of destinations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGameSessionQueueResult updateGameSessionQueue(UpdateGameSessionQueueRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGameSessionQueue(request);
    }

    @SdkInternalApi
    final UpdateGameSessionQueueResult executeUpdateGameSessionQueue(UpdateGameSessionQueueRequest updateGameSessionQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGameSessionQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGameSessionQueueRequest> request = null;
        Response<UpdateGameSessionQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGameSessionQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGameSessionQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGameSessionQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGameSessionQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGameSessionQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates settings for a FlexMatch matchmaking configuration. To update settings, specify the configuration name to
     * be updated and provide the new settings.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateMatchmakingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @sample AmazonGameLift.UpdateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMatchmakingConfigurationResult updateMatchmakingConfiguration(UpdateMatchmakingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMatchmakingConfiguration(request);
    }

    @SdkInternalApi
    final UpdateMatchmakingConfigurationResult executeUpdateMatchmakingConfiguration(UpdateMatchmakingConfigurationRequest updateMatchmakingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMatchmakingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMatchmakingConfigurationRequest> request = null;
        Response<UpdateMatchmakingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMatchmakingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMatchmakingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMatchmakingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMatchmakingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMatchmakingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the current run-time configuration for the specified fleet, which tells Amazon GameLift how to launch
     * server processes on instances in the fleet. You can update a fleet's run-time configuration at any time after the
     * fleet is created; it does not need to be in an <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update run-time configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> object
     * with an updated set of server process configurations.
     * </p>
     * <p>
     * Each instance in a Amazon GameLift fleet checks regularly for an updated run-time configuration and changes how
     * it launches server processes to comply with the latest version. Existing server processes are not affected by the
     * update; run-time configuration changes are applied gradually as existing processes shut down and new processes
     * are launched during Amazon GameLift's normal process recycling activity.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html"> Working with Fleets</a>.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartFleetActions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopFleetActions</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateRuntimeConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @sample AmazonGameLift.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRuntimeConfigurationResult updateRuntimeConfiguration(UpdateRuntimeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuntimeConfiguration(request);
    }

    @SdkInternalApi
    final UpdateRuntimeConfigurationResult executeUpdateRuntimeConfiguration(UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuntimeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuntimeConfigurationRequest> request = null;
        Response<UpdateRuntimeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuntimeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRuntimeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuntimeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuntimeConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRuntimeConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates Realtime script metadata and content.
     * </p>
     * <p>
     * To update script metadata, specify the script ID and provide updated name and/or version values.
     * </p>
     * <p>
     * To update script content, provide an updated zip file by pointing to either a local file or an Amazon S3 bucket
     * location. You can use either method regardless of how the original script was uploaded. Use the <i>Version</i>
     * parameter to track updates to the script.
     * </p>
     * <p>
     * If the call is successful, the updated metadata is stored in the script record and a revised script is uploaded
     * to the Amazon GameLift service. Once the script is updated and acquired by a fleet instance, the new version is
     * used for all new game sessions.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListScripts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateScript</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScript</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateScriptRequest
     * @return Result of the UpdateScript operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateScript" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateScriptResult updateScript(UpdateScriptRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateScript(request);
    }

    @SdkInternalApi
    final UpdateScriptResult executeUpdateScript(UpdateScriptRequest updateScriptRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScriptRequest> request = null;
        Response<UpdateScriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScriptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateScriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateScript");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateScriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateScriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set is using
     * syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a
     * rule set JSON string.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html">Build a Rule Set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param validateMatchmakingRuleSetRequest
     *        Represents the input for a request action.
     * @return Result of the ValidateMatchmakingRuleSet operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the region specified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.ValidateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateMatchmakingRuleSetResult validateMatchmakingRuleSet(ValidateMatchmakingRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeValidateMatchmakingRuleSet(request);
    }

    @SdkInternalApi
    final ValidateMatchmakingRuleSetResult executeValidateMatchmakingRuleSet(ValidateMatchmakingRuleSetRequest validateMatchmakingRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(validateMatchmakingRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateMatchmakingRuleSetRequest> request = null;
        Response<ValidateMatchmakingRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateMatchmakingRuleSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(validateMatchmakingRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameLift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateMatchmakingRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateMatchmakingRuleSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidateMatchmakingRuleSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
