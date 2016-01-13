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
package com.amazonaws.services.codepipeline;

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

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.services.codepipeline.model.transform.*;

/**
 * Client for accessing CodePipeline. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CodePipeline</fullname> <b>Overview</b>
 * <p>
 * This is the AWS CodePipeline API Reference. This guide provides descriptions
 * of the actions and data types for AWS CodePipeline. Some functionality for
 * your pipeline is only configurable through the API. For additional
 * information, see the <a
 * href="http://docs.aws.amazon.com/pipelines/latest/userguide/welcome.html">AWS
 * CodePipeline User Guide</a>.
 * </p>
 * <p>
 * You can use the AWS CodePipeline API to work with pipelines, stages, actions,
 * gates, and transitions, as described below.
 * </p>
 * <p>
 * <i>Pipelines</i> are models of automated release processes. Each pipeline is
 * uniquely named, and consists of actions, gates, and stages.
 * </p>
 * <p>
 * You can work with pipelines by calling:
 * <ul>
 * <li><a>CreatePipeline</a>, which creates a uniquely-named pipeline.</li>
 * <li><a>DeletePipeline</a>, which deletes the specified pipeline.</li>
 * <li><a>GetPipeline</a>, which returns information about a pipeline structure.
 * </li>
 * <li><a>GetPipelineState</a>, which returns information about the current
 * state of the stages and actions of a pipeline.</li>
 * <li><a>ListPipelines</a>, which gets a summary of all of the pipelines
 * associated with your account.</li>
 * <li><a>StartPipelineExecution</a>, which runs the the most recent revision of
 * an artifact through the pipeline.</li>
 * <li><a>UpdatePipeline</a>, which updates a pipeline with edits or changes to
 * the structure of the pipeline.</li>
 * </ul>
 * <p>
 * Pipelines include <i>stages</i>, which are which are logical groupings of
 * gates and actions. Each stage contains one or more actions that must complete
 * before the next stage begins. A stage will result in success or failure. If a
 * stage fails, then the pipeline stops at that stage and will remain stopped
 * until either a new version of an artifact appears in the source location, or
 * a user takes action to re-run the most recent artifact through the pipeline.
 * You can call <a>GetPipelineState</a>, which displays the status of a
 * pipeline, including the status of stages in the pipeline, or
 * <a>GetPipeline</a>, which returns the entire structure of the pipeline,
 * including the stages of that pipeline.
 * </p>
 * </p>
 * <p>
 * Pipeline stages include <i>actions</i>, which are categorized into categories
 * such as source or build actions performed within a stage of a pipeline. For
 * example, you can use a source action to import artifacts into a pipeline from
 * a source such as Amazon S3. Like stages, you do not work with actions
 * directly in most cases, but you do define and interact with actions when
 * working with pipeline operations such as <a>CreatePipeline</a> and
 * <a>GetPipelineState</a>.
 * </p>
 * <p>
 * Pipelines also include <i>transitions</i>, which allow the transition of
 * artifacts from one stage to the next in a pipeline after the actions in one
 * stage complete.
 * </p>
 * <p>
 * You can work with transitions by calling:
 * </p>
 * <ul>
 * <li><a>DisableStageTransition</a>, which prevents artifacts from
 * transitioning to the next stage in a pipeline.</li>
 * <li><a>EnableStageTransition</a>, which enables transition of artifacts
 * between stages in a pipeline.</li>
 * </ul>
 * <p>
 * <b>Using the API to integrate with AWS CodePipeline</b>
 * </p>
 * <p>
 * For third-party integrators or developers who want to create their own
 * integrations with AWS CodePipeline, the expected sequence varies from the
 * standard API user. In order to integrate with AWS CodePipeline, developers
 * will need to work with the following items:
 * </p>
 * <ul>
 * <li>Jobs, which are instances of an action. For example, a job for a source
 * action might import a revision of an artifact from a source.
 * <p>
 * You can work with jobs by calling:
 * </p>
 * <ul>
 * <li><a>AcknowledgeJob</a>, which confirms whether a job worker has received
 * the specified job,</li>
 * <li><a>PollForJobs</a>, which determines whether there are any jobs to act
 * upon,</li>
 * <li><a>PutJobFailureResult</a>, which provides details of a job failure, and</li>
 * <li><a>PutJobSuccessResult</a>, which provides details of a job success.</li>
 * </ul>
 * </li>
 * <li>Third party jobs, which are instances of an action created by a partner
 * action and integrated into AWS CodePipeline. Partner actions are created by
 * members of the AWS Partner Network.
 * <p>
 * You can work with third party jobs by calling:
 * </p>
 * <ul>
 * <li><a>AcknowledgeThirdPartyJob</a>, which confirms whether a job worker has
 * received the specified job,</li>
 * <li><a>PollForThirdPartyJobs</a>, which determines whether there are any jobs
 * to act upon,</li>
 * <li><a>PutThirdPartyJobFailureResult</a>, which provides details of a job
 * failure, and</li>
 * <li><a>PutThirdPartyJobSuccessResult</a>, which provides details of a job
 * success.</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AWSCodePipelineClient extends AmazonWebServiceClient implements
        AWSCodePipeline {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodePipeline.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codepipeline";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "codepipeline";

    /**
     * List of exception unmarshallers for all CodePipeline exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on CodePipeline. A
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
    public AWSCodePipelineClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline. A
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
     *        connects to CodePipeline (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCodePipelineClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using
     * the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSCodePipelineClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using
     * the specified AWS account credentials and client configuration options.
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
     *        connects to CodePipeline (ex: proxy settings, retry counts, etc.).
     */
    public AWSCodePipelineClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using
     * the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using
     * the specified AWS account credentials provider and client configuration
     * options.
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
     *        connects to CodePipeline (ex: proxy settings, retry counts, etc.).
     */
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using
     * the specified AWS account credentials provider, client configuration
     * options, and request metric collector.
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
     *        connects to CodePipeline (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.ActionNotFoundException.class,
                        "ActionNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.JobNotFoundException.class,
                        "JobNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.PipelineNameInUseException.class,
                        "PipelineNameInUseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidBlockerDeclarationException.class,
                        "InvalidBlockerDeclarationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidStructureException.class,
                        "InvalidStructureException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.PipelineVersionNotFoundException.class,
                        "PipelineVersionNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidStageDeclarationException.class,
                        "InvalidStageDeclarationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.ValidationException.class,
                        "ValidationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.ActionTypeNotFoundException.class,
                        "ActionTypeNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.StageNotFoundException.class,
                        "StageNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidClientTokenException.class,
                        "InvalidClientTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidNonceException.class,
                        "InvalidNonceException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidNextTokenException.class,
                        "InvalidNextTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.PipelineNotFoundException.class,
                        "PipelineNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidJobException.class,
                        "InvalidJobException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidJobStateException.class,
                        "InvalidJobStateException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codepipeline.model.InvalidActionDeclarationException.class,
                        "InvalidActionDeclarationException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://codepipeline.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/codepipeline/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/codepipeline/request.handler2s"));
    }

    /**
     * <p>
     * Returns information about a specified job and whether that job has been
     * received by the job worker. Only used for custom actions.
     * </p>
     * 
     * @param acknowledgeJobRequest
     *        Represents the input of an acknowledge job action.
     * @return Result of the AcknowledgeJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The specified nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @sample AWSCodePipeline.AcknowledgeJob
     */
    @Override
    public AcknowledgeJobResult acknowledgeJob(
            AcknowledgeJobRequest acknowledgeJobRequest) {
        ExecutionContext executionContext = createExecutionContext(acknowledgeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcknowledgeJobRequest> request = null;
        Response<AcknowledgeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcknowledgeJobRequestMarshaller().marshall(super
                        .beforeMarshalling(acknowledgeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AcknowledgeJobResult> responseHandler = new JsonResponseHandler<AcknowledgeJobResult>(
                    new AcknowledgeJobResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms a job worker has received the specified job. Only used for
     * partner actions.
     * </p>
     * 
     * @param acknowledgeThirdPartyJobRequest
     *        Represents the input of an acknowledge third party job action.
     * @return Result of the AcknowledgeThirdPartyJob operation returned by the
     *         service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The specified nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.AcknowledgeThirdPartyJob
     */
    @Override
    public AcknowledgeThirdPartyJobResult acknowledgeThirdPartyJob(
            AcknowledgeThirdPartyJobRequest acknowledgeThirdPartyJobRequest) {
        ExecutionContext executionContext = createExecutionContext(acknowledgeThirdPartyJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcknowledgeThirdPartyJobRequest> request = null;
        Response<AcknowledgeThirdPartyJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcknowledgeThirdPartyJobRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(acknowledgeThirdPartyJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AcknowledgeThirdPartyJobResult> responseHandler = new JsonResponseHandler<AcknowledgeThirdPartyJobResult>(
                    new AcknowledgeThirdPartyJobResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom action that can be used in all pipelines associated
     * with the AWS account. Only used for custom actions.
     * </p>
     * 
     * @param createCustomActionTypeRequest
     *        Represents the input of a create custom action operation.
     * @return Result of the CreateCustomActionType operation returned by the
     *         service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has
     *         exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.CreateCustomActionType
     */
    @Override
    public CreateCustomActionTypeResult createCustomActionType(
            CreateCustomActionTypeRequest createCustomActionTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(createCustomActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomActionTypeRequest> request = null;
        Response<CreateCustomActionTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomActionTypeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createCustomActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateCustomActionTypeResult> responseHandler = new JsonResponseHandler<CreateCustomActionTypeResult>(
                    new CreateCustomActionTypeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a create pipeline action.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNameInUseException
     *         The specified pipeline name is already in use.
     * @throws InvalidStageDeclarationException
     *         The specified stage declaration was specified in an invalid
     *         format.
     * @throws InvalidActionDeclarationException
     *         The specified action declaration was specified in an invalid
     *         format.
     * @throws InvalidBlockerDeclarationException
     *         The specified gate declaration was specified in an invalid
     *         format.
     * @throws InvalidStructureException
     *         The specified structure was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has
     *         exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.CreatePipeline
     */
    @Override
    public CreatePipelineResult createPipeline(
            CreatePipelineRequest createPipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipelineRequest> request = null;
        Response<CreatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(createPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePipelineResult> responseHandler = new JsonResponseHandler<CreatePipelineResult>(
                    new CreatePipelineResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Marks a custom action as deleted. PollForJobs for the custom action will
     * fail after the action is marked for deletion. Only used for custom
     * actions.
     * </p>
     * <important>
     * <p>
     * You cannot recreate a custom action after it has been deleted unless you
     * increase the version number of the action.
     * </p>
     * </important>
     * 
     * @param deleteCustomActionTypeRequest
     *        Represents the input of a delete custom action operation. The
     *        custom action will be marked as deleted.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeleteCustomActionType
     */
    @Override
    public void deleteCustomActionType(
            DeleteCustomActionTypeRequest deleteCustomActionTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCustomActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomActionTypeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomActionTypeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteCustomActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Represents the input of a delete pipeline action.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeletePipeline
     */
    @Override
    public void deletePipeline(DeletePipelineRequest deletePipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipelineRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(deletePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Prevents artifacts in a pipeline from transitioning to the next stage in
     * the pipeline.
     * </p>
     * 
     * @param disableStageTransitionRequest
     *        Represents the input of a disable stage transition input action.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or
     *         cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot
     *         be found.
     * @sample AWSCodePipeline.DisableStageTransition
     */
    @Override
    public void disableStageTransition(
            DisableStageTransitionRequest disableStageTransitionRequest) {
        ExecutionContext executionContext = createExecutionContext(disableStageTransitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableStageTransitionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableStageTransitionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(disableStageTransitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Represents the input of an enable stage transition action.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or
     *         cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot
     *         be found.
     * @sample AWSCodePipeline.EnableStageTransition
     */
    @Override
    public void enableStageTransition(
            EnableStageTransitionRequest enableStageTransitionRequest) {
        ExecutionContext executionContext = createExecutionContext(enableStageTransitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableStageTransitionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableStageTransitionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(enableStageTransitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * When this API is called, AWS CodePipeline returns temporary credentials
     * for the Amazon S3 bucket used to store artifacts for the pipeline, if the
     * action requires access to that Amazon S3 bucket for input or output
     * artifacts. Additionally, this API returns any secret values defined for
     * the action.
     * </p>
     * </important>
     * 
     * @param getJobDetailsRequest
     *        Represents the input of a get job details action.
     * @return Result of the GetJobDetails operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @sample AWSCodePipeline.GetJobDetails
     */
    @Override
    public GetJobDetailsResult getJobDetails(
            GetJobDetailsRequest getJobDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getJobDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobDetailsRequest> request = null;
        Response<GetJobDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobDetailsRequestMarshaller().marshall(super
                        .beforeMarshalling(getJobDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetJobDetailsResult> responseHandler = new JsonResponseHandler<GetJobDetailsResult>(
                    new GetJobDetailsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the metadata, structure, stages, and actions of a pipeline. Can
     * be used to return the entire structure of a pipeline in JSON format,
     * which can then be modified and used to update the pipeline structure with
     * <a>UpdatePipeline</a>.
     * </p>
     * 
     * @param getPipelineRequest
     *        Represents the input of a get pipeline action.
     * @return Result of the GetPipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or
     *         cannot be found.
     * @throws PipelineVersionNotFoundException
     *         The specified pipeline version was specified in an invalid format
     *         or cannot be found.
     * @sample AWSCodePipeline.GetPipeline
     */
    @Override
    public GetPipelineResult getPipeline(GetPipelineRequest getPipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(getPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineRequest> request = null;
        Response<GetPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(getPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetPipelineResult> responseHandler = new JsonResponseHandler<GetPipelineResult>(
                    new GetPipelineResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the state of a pipeline, including the stages,
     * actions, and details about the last run of the pipeline.
     * </p>
     * 
     * @param getPipelineStateRequest
     *        Represents the input of a get pipeline state action.
     * @return Result of the GetPipelineState operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or
     *         cannot be found.
     * @sample AWSCodePipeline.GetPipelineState
     */
    @Override
    public GetPipelineStateResult getPipelineState(
            GetPipelineStateRequest getPipelineStateRequest) {
        ExecutionContext executionContext = createExecutionContext(getPipelineStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineStateRequest> request = null;
        Response<GetPipelineStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineStateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getPipelineStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetPipelineStateResult> responseHandler = new JsonResponseHandler<GetPipelineStateResult>(
                    new GetPipelineStateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests the details of a job for a third party action. Only used for
     * partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials
     * for the Amazon S3 bucket used to store artifacts for the pipeline, if the
     * action requires access to that Amazon S3 bucket for input or output
     * artifacts. Additionally, this API returns any secret values defined for
     * the action.
     * </p>
     * </important>
     * 
     * @param getThirdPartyJobDetailsRequest
     *        Represents the input of a get third party job details action.
     * @return Result of the GetThirdPartyJobDetails operation returned by the
     *         service.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @throws InvalidJobException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @sample AWSCodePipeline.GetThirdPartyJobDetails
     */
    @Override
    public GetThirdPartyJobDetailsResult getThirdPartyJobDetails(
            GetThirdPartyJobDetailsRequest getThirdPartyJobDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getThirdPartyJobDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetThirdPartyJobDetailsRequest> request = null;
        Response<GetThirdPartyJobDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetThirdPartyJobDetailsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getThirdPartyJobDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetThirdPartyJobDetailsResult> responseHandler = new JsonResponseHandler<GetThirdPartyJobDetailsResult>(
                    new GetThirdPartyJobDetailsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a summary of all AWS CodePipeline action types associated with your
     * account.
     * </p>
     * 
     * @param listActionTypesRequest
     *        Represents the input of a list action types action.
     * @return Result of the ListActionTypes operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that
     *         the next token you provided is the token returned by a previous
     *         call.
     * @sample AWSCodePipeline.ListActionTypes
     */
    @Override
    public ListActionTypesResult listActionTypes(
            ListActionTypesRequest listActionTypesRequest) {
        ExecutionContext executionContext = createExecutionContext(listActionTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActionTypesRequest> request = null;
        Response<ListActionTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActionTypesRequestMarshaller().marshall(super
                        .beforeMarshalling(listActionTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListActionTypesResult> responseHandler = new JsonResponseHandler<ListActionTypesResult>(
                    new ListActionTypesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a list pipelines action.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that
     *         the next token you provided is the token returned by a previous
     *         call.
     * @sample AWSCodePipeline.ListPipelines
     */
    @Override
    public ListPipelinesResult listPipelines(
            ListPipelinesRequest listPipelinesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelinesRequest> request = null;
        Response<ListPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelinesRequestMarshaller().marshall(super
                        .beforeMarshalling(listPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPipelinesResult> responseHandler = new JsonResponseHandler<ListPipelinesResult>(
                    new ListPipelinesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * When this API is called, AWS CodePipeline returns temporary credentials
     * for the Amazon S3 bucket used to store artifacts for the pipeline, if the
     * action requires access to that Amazon S3 bucket for input or output
     * artifacts. Additionally, this API returns any secret values defined for
     * the action.
     * </p>
     * </important>
     * 
     * @param pollForJobsRequest
     *        Represents the input of a poll for jobs action.
     * @return Result of the PollForJobs operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @sample AWSCodePipeline.PollForJobs
     */
    @Override
    public PollForJobsResult pollForJobs(PollForJobsRequest pollForJobsRequest) {
        ExecutionContext executionContext = createExecutionContext(pollForJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForJobsRequest> request = null;
        Response<PollForJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForJobsRequestMarshaller().marshall(super
                        .beforeMarshalling(pollForJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PollForJobsResult> responseHandler = new JsonResponseHandler<PollForJobsResult>(
                    new PollForJobsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Determines whether there are any third party jobs for a job worker to act
     * on. Only used for partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials
     * for the Amazon S3 bucket used to store artifacts for the pipeline, if the
     * action requires access to that Amazon S3 bucket for input or output
     * artifacts.
     * </p>
     * </important>
     * 
     * @param pollForThirdPartyJobsRequest
     *        Represents the input of a poll for third party jobs action.
     * @return Result of the PollForThirdPartyJobs operation returned by the
     *         service.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PollForThirdPartyJobs
     */
    @Override
    public PollForThirdPartyJobsResult pollForThirdPartyJobs(
            PollForThirdPartyJobsRequest pollForThirdPartyJobsRequest) {
        ExecutionContext executionContext = createExecutionContext(pollForThirdPartyJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForThirdPartyJobsRequest> request = null;
        Response<PollForThirdPartyJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForThirdPartyJobsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(pollForThirdPartyJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PollForThirdPartyJobsResult> responseHandler = new JsonResponseHandler<PollForThirdPartyJobsResult>(
                    new PollForThirdPartyJobsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a put action revision action.
     * @return Result of the PutActionRevision operation returned by the
     *         service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or
     *         cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot
     *         be found.
     * @throws ActionNotFoundException
     *         The specified action cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PutActionRevision
     */
    @Override
    public PutActionRevisionResult putActionRevision(
            PutActionRevisionRequest putActionRevisionRequest) {
        ExecutionContext executionContext = createExecutionContext(putActionRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutActionRevisionRequest> request = null;
        Response<PutActionRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutActionRevisionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putActionRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutActionRevisionResult> responseHandler = new JsonResponseHandler<PutActionRevisionResult>(
                    new PutActionRevisionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the failure of a job as returned to the pipeline by a job
     * worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobFailureResultRequest
     *        Represents the input of a put job failure result action.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobFailureResult
     */
    @Override
    public void putJobFailureResult(
            PutJobFailureResultRequest putJobFailureResultRequest) {
        ExecutionContext executionContext = createExecutionContext(putJobFailureResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobFailureResultRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobFailureResultRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putJobFailureResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the success of a job as returned to the pipeline by a job
     * worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobSuccessResultRequest
     *        Represents the input of a put job success result action.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobSuccessResult
     */
    @Override
    public void putJobSuccessResult(
            PutJobSuccessResultRequest putJobSuccessResultRequest) {
        ExecutionContext executionContext = createExecutionContext(putJobSuccessResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobSuccessResultRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobSuccessResultRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putJobSuccessResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the failure of a third party job as returned to the pipeline
     * by a job worker. Only used for partner actions.
     * </p>
     * 
     * @param putThirdPartyJobFailureResultRequest
     *        Represents the input of a third party job failure result action.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobFailureResult
     */
    @Override
    public void putThirdPartyJobFailureResult(
            PutThirdPartyJobFailureResultRequest putThirdPartyJobFailureResultRequest) {
        ExecutionContext executionContext = createExecutionContext(putThirdPartyJobFailureResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutThirdPartyJobFailureResultRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutThirdPartyJobFailureResultRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putThirdPartyJobFailureResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the success of a third party job as returned to the pipeline
     * by a job worker. Only used for partner actions.
     * </p>
     * 
     * @param putThirdPartyJobSuccessResultRequest
     *        Represents the input of a put third party job success result
     *        action.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be
     *         found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobSuccessResult
     */
    @Override
    public void putThirdPartyJobSuccessResult(
            PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest) {
        ExecutionContext executionContext = createExecutionContext(putThirdPartyJobSuccessResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutThirdPartyJobSuccessResultRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutThirdPartyJobSuccessResultRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putThirdPartyJobSuccessResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the specified pipeline. Specifically, it begins processing the
     * latest commit to the source location specified as part of the pipeline.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     *        Represents the input of a start pipeline execution action.
     * @return Result of the StartPipelineExecution operation returned by the
     *         service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or
     *         cannot be found.
     * @sample AWSCodePipeline.StartPipelineExecution
     */
    @Override
    public StartPipelineExecutionResult startPipelineExecution(
            StartPipelineExecutionRequest startPipelineExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(startPipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPipelineExecutionRequest> request = null;
        Response<StartPipelineExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPipelineExecutionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(startPipelineExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StartPipelineExecutionResult> responseHandler = new JsonResponseHandler<StartPipelineExecutionResult>(
                    new StartPipelineExecutionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified pipeline with edits or changes to its structure. Use
     * a JSON file with the pipeline structure in conjunction with
     * UpdatePipeline to provide the full structure of the pipeline. Updating
     * the pipeline increases the version number of the pipeline by 1.
     * </p>
     * 
     * @param updatePipelineRequest
     *        Represents the input of an update pipeline action.
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidStageDeclarationException
     *         The specified stage declaration was specified in an invalid
     *         format.
     * @throws InvalidActionDeclarationException
     *         The specified action declaration was specified in an invalid
     *         format.
     * @throws InvalidBlockerDeclarationException
     *         The specified gate declaration was specified in an invalid
     *         format.
     * @throws InvalidStructureException
     *         The specified structure was specified in an invalid format.
     * @sample AWSCodePipeline.UpdatePipeline
     */
    @Override
    public UpdatePipelineResult updatePipeline(
            UpdatePipelineRequest updatePipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(updatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineRequest> request = null;
        Response<UpdatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(updatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdatePipelineResult> responseHandler = new JsonResponseHandler<UpdatePipelineResult>(
                    new UpdatePipelineResultJsonUnmarshaller());
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

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
