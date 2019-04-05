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
package com.amazonaws.services.codebuild;

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

import com.amazonaws.services.codebuild.AWSCodeBuildClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.services.codebuild.model.transform.*;

/**
 * Client for accessing AWS CodeBuild. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS CodeBuild</fullname>
 * <p>
 * AWS CodeBuild is a fully managed build service in the cloud. AWS CodeBuild compiles your source code, runs unit
 * tests, and produces artifacts that are ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
 * scale your own build servers. It provides prepackaged build environments for the most popular programming languages
 * and build tools, such as Apache Maven, Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to meet peak build requests. You pay only
 * for the build time you consume. For more information about AWS CodeBuild, see the <i>AWS CodeBuild User Guide</i>.
 * </p>
 * <p>
 * AWS CodeBuild supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchDeleteBuilds</code>: Deletes one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetProjects</code>: Gets information about one or more build projects. A <i>build project</i> defines how
 * AWS CodeBuild runs a build. This includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build output. A <i>build environment</i> is a
 * representation of operating system, programming language runtime, and tools that AWS CodeBuild uses to run a build.
 * You can add tags to build projects to help manage your resources and costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateWebhook</code>: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
 * or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed
 * to the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateWebhook</code>: Changes the settings of an existing webhook.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteWebhook</code>: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
 * or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to
 * the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>: Gets a list of build project names, with each build project name representing a single
 * build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>: Changes the settings of an existing build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetBuilds</code>: Gets information about one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuilds</code>: Gets a list of build IDs, with each build ID representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuildsForProject</code>: Gets a list of build IDs for the specified build project, with each build ID
 * representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartBuild</code>: Starts running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StopBuild</code>: Attempts to stop running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListCuratedEnvironmentImages</code>: Gets information about Docker images that are managed by AWS CodeBuild.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteSourceCredentials</code>: Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ImportSourceCredentials</code>: Imports the source repository credentials for an AWS CodeBuild project that has
 * its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSourceCredentials</code>: Returns a list of <code>SourceCredentialsInfo</code> objects. Each
 * <code>SourceCredentialsInfo</code> object includes the authentication type, token ARN, and type of source provider
 * for one set of credentials.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeBuildClient extends AmazonWebServiceClient implements AWSCodeBuild {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeBuild.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codebuild";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.codebuild.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.codebuild.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codebuild.model.AccountLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OAuthProviderException").withModeledClass(
                                    com.amazonaws.services.codebuild.model.OAuthProviderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.codebuild.model.ResourceAlreadyExistsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codebuild.model.AWSCodeBuildException.class));

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild. A credentials provider chain will be used
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
     * @deprecated use {@link AWSCodeBuildClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCodeBuildClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCodeBuildClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeBuildClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSCodeBuildClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSCodeBuildClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSCodeBuildClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSCodeBuildClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeBuildClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSCodeBuildClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSCodeBuildClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSCodeBuildClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodeBuildClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSCodeBuildClientBuilder builder() {
        return AWSCodeBuildClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeBuildClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeBuildClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codebuild.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codebuild/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codebuild/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes one or more builds.
     * </p>
     * 
     * @param batchDeleteBuildsRequest
     * @return Result of the BatchDeleteBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchDeleteBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchDeleteBuilds" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchDeleteBuildsResult batchDeleteBuilds(BatchDeleteBuildsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteBuilds(request);
    }

    @SdkInternalApi
    final BatchDeleteBuildsResult executeBatchDeleteBuilds(BatchDeleteBuildsRequest batchDeleteBuildsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteBuildsRequest> request = null;
        Response<BatchDeleteBuildsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteBuildsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteBuildsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteBuilds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteBuildsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteBuildsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about builds.
     * </p>
     * 
     * @param batchGetBuildsRequest
     * @return Result of the BatchGetBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchGetBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetBuildsResult batchGetBuilds(BatchGetBuildsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetBuilds(request);
    }

    @SdkInternalApi
    final BatchGetBuildsResult executeBatchGetBuilds(BatchGetBuildsRequest batchGetBuildsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetBuildsRequest> request = null;
        Response<BatchGetBuildsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetBuildsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetBuildsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetBuilds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetBuildsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetBuildsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about build projects.
     * </p>
     * 
     * @param batchGetProjectsRequest
     * @return Result of the BatchGetProjects operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchGetProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetProjectsResult batchGetProjects(BatchGetProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetProjects(request);
    }

    @SdkInternalApi
    final BatchGetProjectsResult executeBatchGetProjects(BatchGetProjectsRequest batchGetProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetProjectsRequest> request = null;
        Response<BatchGetProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a build project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceAlreadyExistsException
     *         The specified AWS resource cannot be created, because an AWS resource with the same settings already
     *         exists.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
     * enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.
     * </p>
     * <important>
     * <p>
     * If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline,
     * then two identical builds are created for each commit. One build is triggered through webhooks, and one through
     * AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are
     * using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console,
     * clear the Webhook box. For more information, see step 5 in <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/change-project.html#change-project-console">Change a
     * Build Project's Settings</a>.
     * </p>
     * </important>
     * 
     * @param createWebhookRequest
     * @return Result of the CreateWebhook operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws OAuthProviderException
     *         There was a problem with the underlying OAuth provider.
     * @throws ResourceAlreadyExistsException
     *         The specified AWS resource cannot be created, because an AWS resource with the same settings already
     *         exists.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWebhookResult createWebhook(CreateWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWebhook(request);
    }

    @SdkInternalApi
    final CreateWebhookResult executeCreateWebhook(CreateWebhookRequest createWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(createWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebhookRequest> request = null;
        Response<CreateWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWebhookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWebhookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a build project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
     * </p>
     * 
     * @param deleteSourceCredentialsRequest
     * @return Result of the DeleteSourceCredentials operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.DeleteSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSourceCredentialsResult deleteSourceCredentials(DeleteSourceCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSourceCredentials(request);
    }

    @SdkInternalApi
    final DeleteSourceCredentialsResult executeDeleteSourceCredentials(DeleteSourceCredentialsRequest deleteSourceCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSourceCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSourceCredentialsRequest> request = null;
        Response<DeleteSourceCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSourceCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSourceCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSourceCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSourceCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSourceCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
     * stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @return Result of the DeleteWebhook operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @throws OAuthProviderException
     *         There was a problem with the underlying OAuth provider.
     * @sample AWSCodeBuild.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWebhookResult deleteWebhook(DeleteWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWebhook(request);
    }

    @SdkInternalApi
    final DeleteWebhookResult executeDeleteWebhook(DeleteWebhookRequest deleteWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebhookRequest> request = null;
        Response<DeleteWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWebhookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWebhookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a
     * GitHub, GitHub Enterprise, or Bitbucket repository.
     * </p>
     * 
     * @param importSourceCredentialsRequest
     * @return Result of the ImportSourceCredentials operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.ImportSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ImportSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportSourceCredentialsResult importSourceCredentials(ImportSourceCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeImportSourceCredentials(request);
    }

    @SdkInternalApi
    final ImportSourceCredentialsResult executeImportSourceCredentials(ImportSourceCredentialsRequest importSourceCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(importSourceCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportSourceCredentialsRequest> request = null;
        Response<ImportSourceCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportSourceCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(importSourceCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportSourceCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportSourceCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ImportSourceCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets the cache for a project.
     * </p>
     * 
     * @param invalidateProjectCacheRequest
     * @return Result of the InvalidateProjectCache operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.InvalidateProjectCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/InvalidateProjectCache"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public InvalidateProjectCacheResult invalidateProjectCache(InvalidateProjectCacheRequest request) {
        request = beforeClientExecution(request);
        return executeInvalidateProjectCache(request);
    }

    @SdkInternalApi
    final InvalidateProjectCacheResult executeInvalidateProjectCache(InvalidateProjectCacheRequest invalidateProjectCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(invalidateProjectCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvalidateProjectCacheRequest> request = null;
        Response<InvalidateProjectCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvalidateProjectCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(invalidateProjectCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InvalidateProjectCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InvalidateProjectCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new InvalidateProjectCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsRequest
     * @return Result of the ListBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuilds" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
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
     * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsForProjectRequest
     * @return Result of the ListBuildsForProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.ListBuildsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuildsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBuildsForProjectResult listBuildsForProject(ListBuildsForProjectRequest request) {
        request = beforeClientExecution(request);
        return executeListBuildsForProject(request);
    }

    @SdkInternalApi
    final ListBuildsForProjectResult executeListBuildsForProject(ListBuildsForProjectRequest listBuildsForProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(listBuildsForProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuildsForProjectRequest> request = null;
        Response<ListBuildsForProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuildsForProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBuildsForProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBuildsForProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBuildsForProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBuildsForProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @return Result of the ListCuratedEnvironmentImages operation returned by the service.
     * @sample AWSCodeBuild.ListCuratedEnvironmentImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListCuratedEnvironmentImages"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCuratedEnvironmentImagesResult listCuratedEnvironmentImages(ListCuratedEnvironmentImagesRequest request) {
        request = beforeClientExecution(request);
        return executeListCuratedEnvironmentImages(request);
    }

    @SdkInternalApi
    final ListCuratedEnvironmentImagesResult executeListCuratedEnvironmentImages(ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCuratedEnvironmentImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCuratedEnvironmentImagesRequest> request = null;
        Response<ListCuratedEnvironmentImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCuratedEnvironmentImagesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCuratedEnvironmentImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCuratedEnvironmentImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCuratedEnvironmentImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCuratedEnvironmentImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of build project names, with each build project name representing a single build project.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>SourceCredentialsInfo</code> objects.
     * </p>
     * 
     * @param listSourceCredentialsRequest
     * @return Result of the ListSourceCredentials operation returned by the service.
     * @sample AWSCodeBuild.ListSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSourceCredentialsResult listSourceCredentials(ListSourceCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeListSourceCredentials(request);
    }

    @SdkInternalApi
    final ListSourceCredentialsResult executeListSourceCredentials(ListSourceCredentialsRequest listSourceCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSourceCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSourceCredentialsRequest> request = null;
        Response<ListSourceCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSourceCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSourceCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSourceCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSourceCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListSourceCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts running a build.
     * </p>
     * 
     * @param startBuildRequest
     * @return Result of the StartBuild operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.StartBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StartBuild" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartBuildResult startBuild(StartBuildRequest request) {
        request = beforeClientExecution(request);
        return executeStartBuild(request);
    }

    @SdkInternalApi
    final StartBuildResult executeStartBuild(StartBuildRequest startBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(startBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBuildRequest> request = null;
        Response<StartBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBuildRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartBuild");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartBuildResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartBuildResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to stop running a build.
     * </p>
     * 
     * @param stopBuildRequest
     * @return Result of the StopBuild operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.StopBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StopBuild" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopBuildResult stopBuild(StopBuildRequest request) {
        request = beforeClientExecution(request);
        return executeStopBuild(request);
    }

    @SdkInternalApi
    final StopBuildResult executeStopBuild(StopBuildRequest stopBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(stopBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopBuildRequest> request = null;
        Response<StopBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopBuildRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopBuild");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopBuildResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopBuildResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the settings of a build project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the webhook associated with an AWS CodeBuild build project.
     * </p>
     * <note>
     * <p>
     * If you use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     * </note>
     * 
     * @param updateWebhookRequest
     * @return Result of the UpdateWebhook operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @throws OAuthProviderException
     *         There was a problem with the underlying OAuth provider.
     * @sample AWSCodeBuild.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWebhookResult updateWebhook(UpdateWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWebhook(request);
    }

    @SdkInternalApi
    final UpdateWebhookResult executeUpdateWebhook(UpdateWebhookRequest updateWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebhookRequest> request = null;
        Response<UpdateWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeBuild");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWebhookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWebhookResultJsonUnmarshaller());
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
