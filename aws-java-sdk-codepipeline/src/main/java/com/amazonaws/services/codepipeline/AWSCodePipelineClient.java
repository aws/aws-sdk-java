/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline;

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
import com.amazonaws.services.codepipeline.AWSCodePipelineClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.services.codepipeline.model.transform.*;

/**
 * Client for accessing CodePipeline. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS CodePipeline</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the AWS CodePipeline API Reference. This guide provides descriptions of the actions and data types for AWS
 * CodePipeline. Some functionality for your pipeline is only configurable through the API. For additional information,
 * see the <a href="http://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html">AWS CodePipeline User
 * Guide</a>.
 * </p>
 * <p>
 * You can use the AWS CodePipeline API to work with pipelines, stages, actions, gates, and transitions, as described
 * below.
 * </p>
 * <p>
 * <i>Pipelines</i> are models of automated release processes. Each pipeline is uniquely named, and consists of actions,
 * gates, and stages.
 * </p>
 * <p>
 * You can work with pipelines by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePipeline</a>, which creates a uniquely-named pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePipeline</a>, which deletes the specified pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipeline</a>, which returns information about the pipeline structure and pipeline metadata, including the
 * pipeline Amazon Resource Name (ARN).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineExecution</a>, which returns information about a specific execution of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineState</a>, which returns information about the current state of the stages and actions of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPipelines</a>, which gets a summary of all of the pipelines associated with your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPipelineExecutions</a>, which gets a summary of the most recent executions for a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartPipelineExecution</a>, which runs the the most recent revision of an artifact through the pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePipeline</a>, which updates a pipeline with edits or changes to the structure of the pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pipelines include <i>stages</i>, which are logical groupings of gates and actions. Each stage contains one or more
 * actions that must complete before the next stage begins. A stage will result in success or failure. If a stage fails,
 * then the pipeline stops at that stage and will remain stopped until either a new version of an artifact appears in
 * the source location, or a user takes action to re-run the most recent artifact through the pipeline. You can call
 * <a>GetPipelineState</a>, which displays the status of a pipeline, including the status of stages in the pipeline, or
 * <a>GetPipeline</a>, which returns the entire structure of the pipeline, including the stages of that pipeline. For
 * more information about the structure of stages and actions, also refer to the <a
 * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-structure.html">AWS CodePipeline Pipeline
 * Structure Reference</a>.
 * </p>
 * <p>
 * Pipeline stages include <i>actions</i>, which are categorized into categories such as source or build actions
 * performed within a stage of a pipeline. For example, you can use a source action to import artifacts into a pipeline
 * from a source such as Amazon S3. Like stages, you do not work with actions directly in most cases, but you do define
 * and interact with actions when working with pipeline operations such as <a>CreatePipeline</a> and
 * <a>GetPipelineState</a>.
 * </p>
 * <p>
 * Pipelines also include <i>transitions</i>, which allow the transition of artifacts from one stage to the next in a
 * pipeline after the actions in one stage complete.
 * </p>
 * <p>
 * You can work with transitions by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DisableStageTransition</a>, which prevents artifacts from transitioning to the next stage in a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EnableStageTransition</a>, which enables transition of artifacts between stages in a pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Using the API to integrate with AWS CodePipeline</b>
 * </p>
 * <p>
 * For third-party integrators or developers who want to create their own integrations with AWS CodePipeline, the
 * expected sequence varies from the standard API user. In order to integrate with AWS CodePipeline, developers will
 * need to work with the following items:
 * </p>
 * <p>
 * <b>Jobs</b>, which are instances of an action. For example, a job for a source action might import a revision of an
 * artifact from a source.
 * </p>
 * <p>
 * You can work with jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeJob</a>, which confirms whether a job worker has received the specified job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetJobDetails</a>, which returns the details of a job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForJobs</a>, which determines whether there are any jobs to act upon,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobFailureResult</a>, which provides details of a job failure, and
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Third party jobs</b>, which are instances of an action created by a partner action and integrated into AWS
 * CodePipeline. Partner actions are created by members of the AWS Partner Network.
 * </p>
 * <p>
 * You can work with third party jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeThirdPartyJob</a>, which confirms whether a job worker has received the specified job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetThirdPartyJobDetails</a>, which requests the details of a job for a partner action,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForThirdPartyJobs</a>, which determines whether there are any jobs to act upon,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobFailureResult</a>, which provides details of a job failure, and
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodePipelineClient extends AmazonWebServiceClient implements AWSCodePipeline {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodePipeline.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codepipeline";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientTokenException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidClientTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidJobStateException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidJobStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineVersionNotFoundException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.PipelineVersionNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidApprovalTokenException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidApprovalTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidActionDeclarationException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidActionDeclarationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineExecutionNotFoundException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.PipelineExecutionNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApprovalAlreadyCompletedException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.ApprovalAlreadyCompletedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineNameInUseException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.PipelineNameInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineNotFoundException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.PipelineNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidJobException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidJobException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActionTypeNotFoundException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.ActionTypeNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StageNotFoundException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.StageNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StageNotRetryableException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.StageNotRetryableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStructureException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidStructureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidBlockerDeclarationException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidBlockerDeclarationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActionNotFoundException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.ActionNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStageDeclarationException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidStageDeclarationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNonceException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.InvalidNonceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("JobNotFoundException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.JobNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotLatestPipelineExecutionException").withModeledClass(
                                    com.amazonaws.services.codepipeline.model.NotLatestPipelineExecutionException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codepipeline.model.AWSCodePipelineException.class));

    /**
     * Constructs a new client to invoke service methods on CodePipeline. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AWSCodePipelineClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCodePipelineClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodePipelineClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSCodePipelineClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodePipelineClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AWSCodePipelineClientBuilder builder() {
        return AWSCodePipelineClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodePipelineClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://codepipeline.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codepipeline/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codepipeline/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns information about a specified job and whether that job has been received by the job worker. Only used for
     * custom actions.
     * </p>
     * 
     * @param acknowledgeJobRequest
     *        Represents the input of an AcknowledgeJob action.
     * @return Result of the AcknowledgeJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The specified nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.AcknowledgeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AcknowledgeJobResult acknowledgeJob(AcknowledgeJobRequest request) {
        request = beforeClientExecution(request);
        return executeAcknowledgeJob(request);
    }

    @SdkInternalApi
    final AcknowledgeJobResult executeAcknowledgeJob(AcknowledgeJobRequest acknowledgeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(acknowledgeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcknowledgeJobRequest> request = null;
        Response<AcknowledgeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcknowledgeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acknowledgeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcknowledgeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcknowledgeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms a job worker has received the specified job. Only used for partner actions.
     * </p>
     * 
     * @param acknowledgeThirdPartyJobRequest
     *        Represents the input of an AcknowledgeThirdPartyJob action.
     * @return Result of the AcknowledgeThirdPartyJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The specified nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.AcknowledgeThirdPartyJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeThirdPartyJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcknowledgeThirdPartyJobResult acknowledgeThirdPartyJob(AcknowledgeThirdPartyJobRequest request) {
        request = beforeClientExecution(request);
        return executeAcknowledgeThirdPartyJob(request);
    }

    @SdkInternalApi
    final AcknowledgeThirdPartyJobResult executeAcknowledgeThirdPartyJob(AcknowledgeThirdPartyJobRequest acknowledgeThirdPartyJobRequest) {

        ExecutionContext executionContext = createExecutionContext(acknowledgeThirdPartyJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcknowledgeThirdPartyJobRequest> request = null;
        Response<AcknowledgeThirdPartyJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcknowledgeThirdPartyJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acknowledgeThirdPartyJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcknowledgeThirdPartyJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcknowledgeThirdPartyJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
     * custom actions.
     * </p>
     * 
     * @param createCustomActionTypeRequest
     *        Represents the input of a CreateCustomActionType operation.
     * @return Result of the CreateCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.CreateCustomActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreateCustomActionType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomActionTypeResult createCustomActionType(CreateCustomActionTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomActionType(request);
    }

    @SdkInternalApi
    final CreateCustomActionTypeResult executeCreateCustomActionType(CreateCustomActionTypeRequest createCustomActionTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomActionTypeRequest> request = null;
        Response<CreateCustomActionTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomActionTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCustomActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomActionTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCustomActionTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Represents the input of a CreatePipeline action.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNameInUseException
     *         The specified pipeline name is already in use.
     * @throws InvalidStageDeclarationException
     *         The specified stage declaration was specified in an invalid format.
     * @throws InvalidActionDeclarationException
     *         The specified action declaration was specified in an invalid format.
     * @throws InvalidBlockerDeclarationException
     *         Reserved for future use.
     * @throws InvalidStructureException
     *         The specified structure was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePipelineResult createPipeline(CreatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePipeline(request);
    }

    @SdkInternalApi
    final CreatePipelineResult executeCreatePipeline(CreatePipelineRequest createPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipelineRequest> request = null;
        Response<CreatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is marked for
     * deletion. Only used for custom actions.
     * </p>
     * <important>
     * <p>
     * You cannot recreate a custom action after it has been deleted unless you increase the version number of the
     * action.
     * </p>
     * </important>
     * 
     * @param deleteCustomActionTypeRequest
     *        Represents the input of a DeleteCustomActionType operation. The custom action will be marked as deleted.
     * @return Result of the DeleteCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeleteCustomActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeleteCustomActionType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomActionTypeResult deleteCustomActionType(DeleteCustomActionTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomActionType(request);
    }

    @SdkInternalApi
    final DeleteCustomActionTypeResult executeDeleteCustomActionType(DeleteCustomActionTypeRequest deleteCustomActionTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomActionTypeRequest> request = null;
        Response<DeleteCustomActionTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomActionTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomActionTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCustomActionTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Represents the input of a DeletePipeline action.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePipeline(request);
    }

    @SdkInternalApi
    final DeletePipelineResult executeDeletePipeline(DeletePipelineRequest deletePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipelineRequest> request = null;
        Response<DeletePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
     * </p>
     * 
     * @param disableStageTransitionRequest
     *        Represents the input of a DisableStageTransition action.
     * @return Result of the DisableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.DisableStageTransition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DisableStageTransition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableStageTransitionResult disableStageTransition(DisableStageTransitionRequest request) {
        request = beforeClientExecution(request);
        return executeDisableStageTransition(request);
    }

    @SdkInternalApi
    final DisableStageTransitionResult executeDisableStageTransition(DisableStageTransitionRequest disableStageTransitionRequest) {

        ExecutionContext executionContext = createExecutionContext(disableStageTransitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableStageTransitionRequest> request = null;
        Response<DisableStageTransitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableStageTransitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableStageTransitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableStageTransitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableStageTransitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables artifacts in a pipeline to transition to a stage in a pipeline.
     * </p>
     * 
     * @param enableStageTransitionRequest
     *        Represents the input of an EnableStageTransition action.
     * @return Result of the EnableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.EnableStageTransition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/EnableStageTransition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableStageTransitionResult enableStageTransition(EnableStageTransitionRequest request) {
        request = beforeClientExecution(request);
        return executeEnableStageTransition(request);
    }

    @SdkInternalApi
    final EnableStageTransitionResult executeEnableStageTransition(EnableStageTransitionRequest enableStageTransitionRequest) {

        ExecutionContext executionContext = createExecutionContext(enableStageTransitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableStageTransitionRequest> request = null;
        Response<EnableStageTransitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableStageTransitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableStageTransitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableStageTransitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new EnableStageTransitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a job. Only used for custom actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getJobDetailsRequest
     *        Represents the input of a GetJobDetails action.
     * @return Result of the GetJobDetails operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetJobDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetJobDetails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobDetailsResult getJobDetails(GetJobDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobDetails(request);
    }

    @SdkInternalApi
    final GetJobDetailsResult executeGetJobDetails(GetJobDetailsRequest getJobDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobDetailsRequest> request = null;
        Response<GetJobDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of
     * a pipeline in JSON format, which can then be modified and used to update the pipeline structure with
     * <a>UpdatePipeline</a>.
     * </p>
     * 
     * @param getPipelineRequest
     *        Represents the input of a GetPipeline action.
     * @return Result of the GetPipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineVersionNotFoundException
     *         The specified pipeline version was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPipelineResult getPipeline(GetPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipeline(request);
    }

    @SdkInternalApi
    final GetPipelineResult executeGetPipeline(GetPipelineRequest getPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineRequest> request = null;
        Response<GetPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
     * ID, and the name, version, and status of the pipeline.
     * </p>
     * 
     * @param getPipelineExecutionRequest
     *        Represents the input of a GetPipelineExecution action.
     * @return Result of the GetPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineExecutionNotFoundException
     *         The pipeline execution was specified in an invalid format or cannot be found, or an execution ID does not
     *         belong to the specified pipeline.
     * @sample AWSCodePipeline.GetPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPipelineExecutionResult getPipelineExecution(GetPipelineExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipelineExecution(request);
    }

    @SdkInternalApi
    final GetPipelineExecutionResult executeGetPipelineExecution(GetPipelineExecutionRequest getPipelineExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineExecutionRequest> request = null;
        Response<GetPipelineExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the state of a pipeline, including the stages and actions.
     * </p>
     * 
     * @param getPipelineStateRequest
     *        Represents the input of a GetPipelineState action.
     * @return Result of the GetPipelineState operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipelineState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipelineState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPipelineStateResult getPipelineState(GetPipelineStateRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipelineState(request);
    }

    @SdkInternalApi
    final GetPipelineStateResult executeGetPipelineState(GetPipelineStateRequest getPipelineStateRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineStateRequest> request = null;
        Response<GetPipelineStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests the details of a job for a third party action. Only used for partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getThirdPartyJobDetailsRequest
     *        Represents the input of a GetThirdPartyJobDetails action.
     * @return Result of the GetThirdPartyJobDetails operation returned by the service.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @throws InvalidJobException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetThirdPartyJobDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetThirdPartyJobDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetThirdPartyJobDetailsResult getThirdPartyJobDetails(GetThirdPartyJobDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetThirdPartyJobDetails(request);
    }

    @SdkInternalApi
    final GetThirdPartyJobDetailsResult executeGetThirdPartyJobDetails(GetThirdPartyJobDetailsRequest getThirdPartyJobDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getThirdPartyJobDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetThirdPartyJobDetailsRequest> request = null;
        Response<GetThirdPartyJobDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetThirdPartyJobDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getThirdPartyJobDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetThirdPartyJobDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetThirdPartyJobDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a summary of all AWS CodePipeline action types associated with your account.
     * </p>
     * 
     * @param listActionTypesRequest
     *        Represents the input of a ListActionTypes action.
     * @return Result of the ListActionTypes operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListActionTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListActionTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListActionTypesResult listActionTypes(ListActionTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListActionTypes(request);
    }

    @SdkInternalApi
    final ListActionTypesResult executeListActionTypes(ListActionTypesRequest listActionTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listActionTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActionTypesRequest> request = null;
        Response<ListActionTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActionTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listActionTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListActionTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListActionTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a summary of the most recent executions for a pipeline.
     * </p>
     * 
     * @param listPipelineExecutionsRequest
     *        Represents the input of a ListPipelineExecutions action.
     * @return Result of the ListPipelineExecutions operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListPipelineExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelineExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPipelineExecutionsResult listPipelineExecutions(ListPipelineExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPipelineExecutions(request);
    }

    @SdkInternalApi
    final ListPipelineExecutionsResult executeListPipelineExecutions(ListPipelineExecutionsRequest listPipelineExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipelineExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelineExecutionsRequest> request = null;
        Response<ListPipelineExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelineExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipelineExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipelineExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPipelineExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a summary of all of the pipelines associated with your account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Represents the input of a ListPipelines action.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPipelinesResult listPipelines(ListPipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeListPipelines(request);
    }

    @SdkInternalApi
    final ListPipelinesResult executeListPipelines(ListPipelinesRequest listPipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelinesRequest> request = null;
        Response<ListPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about any jobs for AWS CodePipeline to act upon.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param pollForJobsRequest
     *        Represents the input of a PollForJobs action.
     * @return Result of the PollForJobs operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @sample AWSCodePipeline.PollForJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PollForJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PollForJobsResult pollForJobs(PollForJobsRequest request) {
        request = beforeClientExecution(request);
        return executePollForJobs(request);
    }

    @SdkInternalApi
    final PollForJobsResult executePollForJobs(PollForJobsRequest pollForJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(pollForJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForJobsRequest> request = null;
        Response<PollForJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pollForJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PollForJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PollForJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * </p>
     * </important>
     * 
     * @param pollForThirdPartyJobsRequest
     *        Represents the input of a PollForThirdPartyJobs action.
     * @return Result of the PollForThirdPartyJobs operation returned by the service.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PollForThirdPartyJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PollForThirdPartyJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PollForThirdPartyJobsResult pollForThirdPartyJobs(PollForThirdPartyJobsRequest request) {
        request = beforeClientExecution(request);
        return executePollForThirdPartyJobs(request);
    }

    @SdkInternalApi
    final PollForThirdPartyJobsResult executePollForThirdPartyJobs(PollForThirdPartyJobsRequest pollForThirdPartyJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(pollForThirdPartyJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForThirdPartyJobsRequest> request = null;
        Response<PollForThirdPartyJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForThirdPartyJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pollForThirdPartyJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PollForThirdPartyJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PollForThirdPartyJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information to AWS CodePipeline about new revisions to a source.
     * </p>
     * 
     * @param putActionRevisionRequest
     *        Represents the input of a PutActionRevision action.
     * @return Result of the PutActionRevision operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @throws ActionNotFoundException
     *         The specified action cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PutActionRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutActionRevision" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutActionRevisionResult putActionRevision(PutActionRevisionRequest request) {
        request = beforeClientExecution(request);
        return executePutActionRevision(request);
    }

    @SdkInternalApi
    final PutActionRevisionResult executePutActionRevision(PutActionRevisionRequest putActionRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(putActionRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutActionRevisionRequest> request = null;
        Response<PutActionRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutActionRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putActionRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutActionRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutActionRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
     * Rejected.
     * </p>
     * 
     * @param putApprovalResultRequest
     *        Represents the input of a PutApprovalResult action.
     * @return Result of the PutApprovalResult operation returned by the service.
     * @throws InvalidApprovalTokenException
     *         The approval request already received a response or has expired.
     * @throws ApprovalAlreadyCompletedException
     *         The approval action has already been approved or rejected.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @throws ActionNotFoundException
     *         The specified action cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PutApprovalResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutApprovalResult" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutApprovalResultResult putApprovalResult(PutApprovalResultRequest request) {
        request = beforeClientExecution(request);
        return executePutApprovalResult(request);
    }

    @SdkInternalApi
    final PutApprovalResultResult executePutApprovalResult(PutApprovalResultRequest putApprovalResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putApprovalResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutApprovalResultRequest> request = null;
        Response<PutApprovalResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutApprovalResultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putApprovalResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutApprovalResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutApprovalResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobFailureResultRequest
     *        Represents the input of a PutJobFailureResult action.
     * @return Result of the PutJobFailureResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobFailureResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutJobFailureResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutJobFailureResultResult putJobFailureResult(PutJobFailureResultRequest request) {
        request = beforeClientExecution(request);
        return executePutJobFailureResult(request);
    }

    @SdkInternalApi
    final PutJobFailureResultResult executePutJobFailureResult(PutJobFailureResultRequest putJobFailureResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putJobFailureResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobFailureResultRequest> request = null;
        Response<PutJobFailureResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobFailureResultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putJobFailureResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutJobFailureResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutJobFailureResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobSuccessResultRequest
     *        Represents the input of a PutJobSuccessResult action.
     * @return Result of the PutJobSuccessResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobSuccessResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutJobSuccessResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutJobSuccessResultResult putJobSuccessResult(PutJobSuccessResultRequest request) {
        request = beforeClientExecution(request);
        return executePutJobSuccessResult(request);
    }

    @SdkInternalApi
    final PutJobSuccessResultResult executePutJobSuccessResult(PutJobSuccessResultRequest putJobSuccessResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putJobSuccessResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobSuccessResultRequest> request = null;
        Response<PutJobSuccessResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobSuccessResultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putJobSuccessResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutJobSuccessResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutJobSuccessResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobFailureResultRequest
     *        Represents the input of a PutThirdPartyJobFailureResult action.
     * @return Result of the PutThirdPartyJobFailureResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobFailureResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobFailureResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutThirdPartyJobFailureResultResult putThirdPartyJobFailureResult(PutThirdPartyJobFailureResultRequest request) {
        request = beforeClientExecution(request);
        return executePutThirdPartyJobFailureResult(request);
    }

    @SdkInternalApi
    final PutThirdPartyJobFailureResultResult executePutThirdPartyJobFailureResult(PutThirdPartyJobFailureResultRequest putThirdPartyJobFailureResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putThirdPartyJobFailureResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutThirdPartyJobFailureResultRequest> request = null;
        Response<PutThirdPartyJobFailureResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutThirdPartyJobFailureResultRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putThirdPartyJobFailureResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutThirdPartyJobFailureResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutThirdPartyJobFailureResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobSuccessResultRequest
     *        Represents the input of a PutThirdPartyJobSuccessResult action.
     * @return Result of the PutThirdPartyJobSuccessResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobSuccessResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobSuccessResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutThirdPartyJobSuccessResultResult putThirdPartyJobSuccessResult(PutThirdPartyJobSuccessResultRequest request) {
        request = beforeClientExecution(request);
        return executePutThirdPartyJobSuccessResult(request);
    }

    @SdkInternalApi
    final PutThirdPartyJobSuccessResultResult executePutThirdPartyJobSuccessResult(PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putThirdPartyJobSuccessResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutThirdPartyJobSuccessResultRequest> request = null;
        Response<PutThirdPartyJobSuccessResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutThirdPartyJobSuccessResultRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putThirdPartyJobSuccessResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutThirdPartyJobSuccessResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutThirdPartyJobSuccessResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resumes the pipeline execution by retrying the last failed actions in a stage.
     * </p>
     * 
     * @param retryStageExecutionRequest
     *        Represents the input of a RetryStageExecution action.
     * @return Result of the RetryStageExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @throws StageNotRetryableException
     *         The specified stage can't be retried because the pipeline structure or stage state changed after the
     *         stage was not completed; the stage contains no failed actions; one or more actions are still in progress;
     *         or another retry attempt is already in progress.
     * @throws NotLatestPipelineExecutionException
     *         The stage has failed in a later run of the pipeline and the pipelineExecutionId associated with the
     *         request is out of date.
     * @sample AWSCodePipeline.RetryStageExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RetryStageExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RetryStageExecutionResult retryStageExecution(RetryStageExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeRetryStageExecution(request);
    }

    @SdkInternalApi
    final RetryStageExecutionResult executeRetryStageExecution(RetryStageExecutionRequest retryStageExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(retryStageExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetryStageExecutionRequest> request = null;
        Response<RetryStageExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetryStageExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(retryStageExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetryStageExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RetryStageExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
     * specified as part of the pipeline.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     *        Represents the input of a StartPipelineExecution action.
     * @return Result of the StartPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.StartPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StartPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartPipelineExecutionResult startPipelineExecution(StartPipelineExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartPipelineExecution(request);
    }

    @SdkInternalApi
    final StartPipelineExecutionResult executeStartPipelineExecution(StartPipelineExecutionRequest startPipelineExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startPipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPipelineExecutionRequest> request = null;
        Response<StartPipelineExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPipelineExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startPipelineExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartPipelineExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartPipelineExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure
     * in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases
     * the version number of the pipeline by 1.
     * </p>
     * 
     * @param updatePipelineRequest
     *        Represents the input of an UpdatePipeline action.
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidStageDeclarationException
     *         The specified stage declaration was specified in an invalid format.
     * @throws InvalidActionDeclarationException
     *         The specified action declaration was specified in an invalid format.
     * @throws InvalidBlockerDeclarationException
     *         Reserved for future use.
     * @throws InvalidStructureException
     *         The specified structure was specified in an invalid format.
     * @sample AWSCodePipeline.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/UpdatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePipeline(request);
    }

    @SdkInternalApi
    final UpdatePipelineResult executeUpdatePipeline(UpdatePipelineRequest updatePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineRequest> request = null;
        Response<UpdatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePipelineResultJsonUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
