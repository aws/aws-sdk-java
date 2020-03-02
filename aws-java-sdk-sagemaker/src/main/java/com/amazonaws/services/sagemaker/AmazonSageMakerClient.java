/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker;

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

import com.amazonaws.services.sagemaker.AmazonSageMakerClientBuilder;
import com.amazonaws.services.sagemaker.waiters.AmazonSageMakerWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.services.sagemaker.model.transform.*;

/**
 * Client for accessing SageMaker. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerClient extends AmazonWebServiceClient implements AmazonSageMaker {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSageMaker.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sagemaker";

    private volatile AmazonSageMakerWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUse").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemaker.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemaker.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemaker.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemaker.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.sagemaker.model.AmazonSageMakerException.class));

    public static AmazonSageMakerClientBuilder builder() {
        return AmazonSageMakerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SageMaker using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SageMaker using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("sagemaker.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/sagemaker/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/sagemaker/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
     * instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams,
     * endpoint configurations, and endpoints.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <note>
     * <p>
     * Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the
     * hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter
     * tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter
     * tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you
     * first create the tuning job by specifying them in the <code>Tags</code> parameter of
     * <a>CreateHyperParameterTuningJob</a>
     * </p>
     * </note>
     * 
     * @param addTagsRequest
     * @return Result of the AddTags operation returned by the service.
     * @sample AmazonSageMaker.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        request = beforeClientExecution(request);
        return executeAddTags(request);
    }

    @SdkInternalApi
    final AddTagsResult executeAddTags(AddTagsRequest addTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a trial component with a trial. A trial component can be associated with multiple trials. To
     * disassociate a trial component from a trial, call the <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param associateTrialComponentRequest
     * @return Result of the AssociateTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.AssociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AssociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateTrialComponentResult associateTrialComponent(AssociateTrialComponentRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTrialComponent(request);
    }

    @SdkInternalApi
    final AssociateTrialComponentResult executeAssociateTrialComponent(AssociateTrialComponentRequest associateTrialComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTrialComponentRequest> request = null;
        Response<AssociateTrialComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTrialComponentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateTrialComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTrialComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTrialComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateTrialComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @return Result of the CreateAlgorithm operation returned by the service.
     * @sample AmazonSageMaker.CreateAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlgorithm(request);
    }

    @SdkInternalApi
    final CreateAlgorithmResult executeCreateAlgorithm(CreateAlgorithmRequest createAlgorithmRequest) {

        ExecutionContext executionContext = createExecutionContext(createAlgorithmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAlgorithmRequest> request = null;
        Response<CreateAlgorithmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAlgorithmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAlgorithmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlgorithm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAlgorithmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAlgorithmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a running App for the specified UserProfile. Supported Apps are JupyterServer and KernelGateway. This
     * operation is automatically invoked by Amazon SageMaker Amazon SageMaker Studio (Studio) upon access to the
     * associated Studio Domain, and when new kernel configurations are selected by the user. A user may have multiple
     * Apps active simultaneously. Apps will automatically terminate and be deleted when stopped from within Studio, or
     * when the DeleteApp API is manually called. UserProfiles are limited to 5 concurrently running Apps at a time.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAppResult createApp(CreateAppRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApp(request);
    }

    @SdkInternalApi
    final CreateAppResult executeCreateApp(CreateAppRequest createAppRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AutoPilot job.
     * </p>
     * 
     * @param createAutoMLJobRequest
     * @return Result of the CreateAutoMLJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAutoMLJobResult createAutoMLJob(CreateAutoMLJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAutoMLJob(request);
    }

    @SdkInternalApi
    final CreateAutoMLJobResult executeCreateAutoMLJob(CreateAutoMLJobRequest createAutoMLJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAutoMLJobRequest> request = null;
        Response<CreateAutoMLJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAutoMLJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAutoMLJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAutoMLJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAutoMLJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAutoMLJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
     * notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
     * resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
     * persists independently from the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @return Result of the CreateCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.CreateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCodeRepositoryResult createCodeRepository(CreateCodeRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCodeRepository(request);
    }

    @SdkInternalApi
    final CreateCodeRepositoryResult executeCreateCodeRepository(CreateCodeRepositoryRequest createCodeRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(createCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCodeRepositoryRequest> request = null;
        Response<CreateCodeRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCodeRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCodeRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCodeRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCodeRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCodeRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model
     * artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them
     * as an ML resource.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name for the compilation job
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about the input model artifacts
     * </p>
     * </li>
     * <li>
     * <p>
     * The output location for the compiled model and the device (target) that the model runs on
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide a <code>Tag</code> to track the model compilation job's resource use and costs. The response
     * body contains the <code>CompilationJobArn</code> for the compiled job.
     * </p>
     * <p>
     * To stop a model compilation job, use <a>StopCompilationJob</a>. To get information about a particular model
     * compilation job, use <a>DescribeCompilationJob</a>. To get information about multiple model compilation jobs, use
     * <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param createCompilationJobRequest
     * @return Result of the CreateCompilationJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCompilationJobResult createCompilationJob(CreateCompilationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCompilationJob(request);
    }

    @SdkInternalApi
    final CreateCompilationJobResult executeCreateCompilationJob(CreateCompilationJobRequest createCompilationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createCompilationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCompilationJobRequest> request = null;
        Response<CreateCompilationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCompilationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCompilationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCompilationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCompilationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCompilationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Domain for Amazon SageMaker Amazon SageMaker Studio (Studio), which can be accessed by end-users in a
     * web browser. A Domain has an associated directory, list of authorized users, and a variety of security,
     * application, policies, and Amazon Virtual Private Cloud configurations. An AWS account is limited to one Domain,
     * per region. Users within a domain can share notebook files and other artifacts with each other. When a Domain is
     * created, an Amazon Elastic File System (EFS) is also created for use by all of the users within the Domain. Each
     * user receives a private home directory within the EFS for notebooks, Git repositories, and data files.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
     * to provision resources and deploy models. You create the endpoint configuration with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>
     * API.
     * </p>
     * <p>
     * Use this API to deploy models using Amazon SageMaker hosting services.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> that is in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * <p>
     * The endpoint name must be unique within an AWS Region in your AWS account.
     * </p>
     * <p>
     * When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute
     * instances), and deploys the model(s) on them.
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Creating</code>. After it
     * creates the endpoint, it sets the status to <code>InService</code>. Amazon SageMaker can then process incoming
     * requests for inferences. To check the status of an endpoint, use the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html">DescribeEndpoint</a> API.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
     * IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
     * for that region. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param createEndpointRequest
     * @return Result of the CreateEndpoint operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEndpointResult createEndpoint(CreateEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEndpoint(request);
    }

    @SdkInternalApi
    final CreateEndpointResult executeCreateEndpoint(CreateEndpointRequest createEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointRequest> request = null;
        Response<CreateEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
     * configuration, you identify one or more models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API if you want to use Amazon SageMaker hosting services to deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define a <code>ProductionVariant</code>, for each model that you want to deploy. Each
     * <code>ProductionVariant</code> parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a <code>VariantWeight</code> to specify how much traffic you
     * want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
     * traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * 
     * @param createEndpointConfigRequest
     * @return Result of the CreateEndpointConfig operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateEndpointConfigResult createEndpointConfig(CreateEndpointConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEndpointConfig(request);
    }

    @SdkInternalApi
    final CreateEndpointConfigResult executeCreateEndpointConfig(CreateEndpointConfigRequest createEndpointConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createEndpointConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointConfigRequest> request = null;
        Response<CreateEndpointConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEndpointConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEndpointConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEndpointConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEndpointConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon SageMaker <i>experiment</i>. An experiment is a collection of <i>trials</i> that are observed,
     * compared and evaluated as a group. A trial is a set of steps, called <i>trial components</i>, that produce a
     * machine learning model.
     * </p>
     * <p>
     * The goal of an experiment is to determine the components that produce the best model. Multiple trials are
     * performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the
     * remaining inputs constant.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to experiments, trials, trial components and then use the <a>Search</a> API to search for the
     * tags.
     * </p>
     * <p>
     * To add a description to an experiment, specify the optional <code>Description</code> parameter. To add a
     * description later, or to change the description, call the <a>UpdateExperiment</a> API.
     * </p>
     * <p>
     * To get a list of all your experiments, call the <a>ListExperiments</a> API. To view an experiment's properties,
     * call the <a>DescribeExperiment</a> API. To get a list of all the trials associated with an experiment, call the
     * <a>ListTrials</a> API. To create a trial call the <a>CreateTrial</a> API.
     * </p>
     * 
     * @param createExperimentRequest
     * @return Result of the CreateExperiment operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateExperimentResult createExperiment(CreateExperimentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExperiment(request);
    }

    @SdkInternalApi
    final CreateExperimentResult executeCreateExperiment(CreateExperimentRequest createExperimentRequest) {

        ExecutionContext executionContext = createExecutionContext(createExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExperimentRequest> request = null;
        Response<CreateExperimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExperimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createExperimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExperiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExperimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateExperimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a flow definition.
     * </p>
     * 
     * @param createFlowDefinitionRequest
     * @return Result of the CreateFlowDefinition operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateFlowDefinitionResult createFlowDefinition(CreateFlowDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFlowDefinition(request);
    }

    @SdkInternalApi
    final CreateFlowDefinitionResult executeCreateFlowDefinition(CreateFlowDefinitionRequest createFlowDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(createFlowDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowDefinitionRequest> request = null;
        Response<CreateFlowDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFlowDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFlowDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFlowDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFlowDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines the settings you will use for the human review workflow user interface. Reviewers will see a three-panel
     * interface with an instruction area, the item to review, and an input area.
     * </p>
     * 
     * @param createHumanTaskUiRequest
     * @return Result of the CreateHumanTaskUi operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateHumanTaskUiResult createHumanTaskUi(CreateHumanTaskUiRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHumanTaskUi(request);
    }

    @SdkInternalApi
    final CreateHumanTaskUiResult executeCreateHumanTaskUi(CreateHumanTaskUiRequest createHumanTaskUiRequest) {

        ExecutionContext executionContext = createExecutionContext(createHumanTaskUiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHumanTaskUiRequest> request = null;
        Response<CreateHumanTaskUiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHumanTaskUiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHumanTaskUiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHumanTaskUi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHumanTaskUiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateHumanTaskUiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
     * training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
     * you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
     * by an objective metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @return Result of the CreateHyperParameterTuningJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateHyperParameterTuningJobResult createHyperParameterTuningJob(CreateHyperParameterTuningJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHyperParameterTuningJob(request);
    }

    @SdkInternalApi
    final CreateHyperParameterTuningJobResult executeCreateHyperParameterTuningJob(CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHyperParameterTuningJobRequest> request = null;
        Response<CreateHyperParameterTuningJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHyperParameterTuningJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createHyperParameterTuningJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHyperParameterTuningJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHyperParameterTuningJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateHyperParameterTuningJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to
     * train machine learning models.
     * </p>
     * <p>
     * You can select your workforce from one of three providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A private workforce that you create. It can include employees, contractors, and outside experts. Use a private
     * workforce when want the data to stay within your organization or when a specific set of skills is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data
     * or data that has been stripped of any personally identifiable information.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use <i>automated data labeling</i> to reduce the number of data objects that need to be labeled by a
     * human. Automated data labeling uses <i>active learning</i> to determine if a data object can be labeled by
     * machine or if it needs to be sent to a human worker. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html">Using Automated Data
     * Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You create a <i>manifest file</i> that
     * describes the location of each object. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html">Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or as training data for your machine
     * learning models.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @return Result of the CreateLabelingJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLabelingJobResult createLabelingJob(CreateLabelingJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLabelingJob(request);
    }

    @SdkInternalApi
    final CreateLabelingJobResult executeCreateLabelingJob(CreateLabelingJobRequest createLabelingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createLabelingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLabelingJobRequest> request = null;
        Response<CreateLabelingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLabelingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLabelingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLabelingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLabelingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLabelingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
     * primary container, you specify the Docker image that contains inference code, artifacts (from prior training),
     * and a custom environment map that the inference code uses when you deploy the model for predictions.
     * </p>
     * <p>
     * Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job.
     * </p>
     * <p>
     * To host your model, you create an endpoint configuration with the <code>CreateEndpointConfig</code> API, and then
     * create an endpoint with the <code>CreateEndpoint</code> API. Amazon SageMaker then deploys all of the containers
     * that you defined for the model in the hosting environment.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <p>
     * To run a batch transform using your model, you start a job with the <code>CreateTransformJob</code> API. Amazon
     * SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location.
     * </p>
     * <p>
     * In the <code>CreateModel</code> request, you must define a container with the <code>PrimaryContainer</code>
     * parameter.
     * </p>
     * <p>
     * In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also
     * use the IAM role to manage permissions the inference code needs. For example, if the inference code access any
     * other AWS resources, you grant necessary permissions via this role.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateModelResult createModel(CreateModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModel(request);
    }

    @SdkInternalApi
    final CreateModelResult executeCreateModel(CreateModelRequest createModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can
     * subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * <p>
     * To create a model package by specifying a Docker container that contains your inference code and the Amazon S3
     * location of your model artifacts, provide values for <code>InferenceSpecification</code>. To create a model from
     * an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for
     * <code>SourceAlgorithmSpecification</code>.
     * </p>
     * 
     * @param createModelPackageRequest
     * @return Result of the CreateModelPackage operation returned by the service.
     * @sample AmazonSageMaker.CreateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateModelPackageResult createModelPackage(CreateModelPackageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModelPackage(request);
    }

    @SdkInternalApi
    final CreateModelPackageResult executeCreateModelPackage(CreateModelPackageRequest createModelPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelPackageRequest> request = null;
        Response<CreateModelPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelPackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModelPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs to monitor the data captured for an
     * Amazon SageMaker Endoint.
     * </p>
     * 
     * @param createMonitoringScheduleRequest
     * @return Result of the CreateMonitoringSchedule operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMonitoringScheduleResult createMonitoringSchedule(CreateMonitoringScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMonitoringSchedule(request);
    }

    @SdkInternalApi
    final CreateMonitoringScheduleResult executeCreateMonitoringSchedule(CreateMonitoringScheduleRequest createMonitoringScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(createMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMonitoringScheduleRequest> request = null;
        Response<CreateMonitoringScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMonitoringScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMonitoringScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMonitoringSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMonitoringScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMonitoringScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance
     * running on a Jupyter notebook.
     * </p>
     * <p>
     * In a <code>CreateNotebookInstance</code> request, specify the type of ML compute instance that you want to run.
     * Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model
     * training, and attaches an ML storage volume to the notebook instance.
     * </p>
     * <p>
     * Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker
     * with a specific algorithm or with a machine learning framework.
     * </p>
     * <p>
     * After receiving the request, Amazon SageMaker does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Creates a network interface in the Amazon SageMaker VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Option) If you specified <code>SubnetId</code>, Amazon SageMaker creates a network interface in your own VPC,
     * which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon
     * SageMaker attaches the security group that you specified in the request to the network interface that it creates
     * in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified
     * <code>SubnetId</code> of your VPC, Amazon SageMaker specifies both network interfaces when launching this
     * instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security
     * groups allow it.
     * </p>
     * </li>
     * </ol>
     * <p>
     * After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change
     * the name of a notebook instance after you create it.
     * </p>
     * <p>
     * After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter
     * notebooks. For example, you can write code to explore a dataset that you can use for model training, train a
     * model, host models by creating Amazon SageMaker endpoints, and validate hosted models.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It
     * Works</a>.
     * </p>
     * 
     * @param createNotebookInstanceRequest
     * @return Result of the CreateNotebookInstance operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNotebookInstanceResult createNotebookInstance(CreateNotebookInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNotebookInstance(request);
    }

    @SdkInternalApi
    final CreateNotebookInstanceResult executeCreateNotebookInstance(CreateNotebookInstanceRequest createNotebookInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotebookInstanceRequest> request = null;
        Response<CreateNotebookInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotebookInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNotebookInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNotebookInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNotebookInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateNotebookInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a lifecycle configuration that you can associate with a notebook instance. A <i>lifecycle
     * configuration</i> is a collection of shell scripts that run when you create or start a notebook instance.
     * </p>
     * <p>
     * Each lifecycle configuration script has a limit of 16384 characters.
     * </p>
     * <p>
     * The value of the <code>$PATH</code> environment variable that is available to both scripts is
     * <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
     * </p>
     * <p>
     * View CloudWatch Logs for notebook instance lifecycle configurations in log group
     * <code>/aws/sagemaker/NotebookInstances</code> in log stream
     * <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
     * </p>
     * <p>
     * Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes,
     * it fails and the notebook instance is not created or started.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param createNotebookInstanceLifecycleConfigRequest
     * @return Result of the CreateNotebookInstanceLifecycleConfig operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNotebookInstanceLifecycleConfigResult createNotebookInstanceLifecycleConfig(CreateNotebookInstanceLifecycleConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNotebookInstanceLifecycleConfig(request);
    }

    @SdkInternalApi
    final CreateNotebookInstanceLifecycleConfigResult executeCreateNotebookInstanceLifecycleConfig(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotebookInstanceLifecycleConfigRequest> request = null;
        Response<CreateNotebookInstanceLifecycleConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotebookInstanceLifecycleConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createNotebookInstanceLifecycleConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNotebookInstanceLifecycleConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNotebookInstanceLifecycleConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateNotebookInstanceLifecycleConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be
     * automatically signed in to Amazon SageMaker Amazon SageMaker Studio (Studio), and granted access to all of the
     * Apps and files associated with that Amazon Elastic File System (EFS). This operation can only be called when
     * AuthMode equals IAM.
     * </p>
     * 
     * @param createPresignedDomainUrlRequest
     * @return Result of the CreatePresignedDomainUrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreatePresignedDomainUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedDomainUrl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePresignedDomainUrl(request);
    }

    @SdkInternalApi
    final CreatePresignedDomainUrlResult executeCreatePresignedDomainUrl(CreatePresignedDomainUrlRequest createPresignedDomainUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(createPresignedDomainUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresignedDomainUrlRequest> request = null;
        Response<CreatePresignedDomainUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresignedDomainUrlRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPresignedDomainUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePresignedDomainUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePresignedDomainUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePresignedDomainUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
     * console, when you choose <code>Open</code> next to a notebook instance, Amazon SageMaker opens a new tab showing
     * the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
     * page.
     * </p>
     * <p>
     * IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that
     * attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that
     * it returns to a list of IP addresses that you specify. Use the <code>NotIpAddress</code> condition operator and
     * the <code>aws:SourceIP</code> condition context key to specify the list of IP addresses that you want to have
     * access to the notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security_iam_id-based-policy-examples.html#nbi-ip-filter"
     * >Limit Access to a Notebook Instance by IP Address</a>.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to is valid only for 5 minutes. If you try to use the URL after the 5-minute
     * limit expires, you are directed to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @return Result of the CreatePresignedNotebookInstanceUrl operation returned by the service.
     * @sample AmazonSageMaker.CreatePresignedNotebookInstanceUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePresignedNotebookInstanceUrlResult createPresignedNotebookInstanceUrl(CreatePresignedNotebookInstanceUrlRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePresignedNotebookInstanceUrl(request);
    }

    @SdkInternalApi
    final CreatePresignedNotebookInstanceUrlResult executeCreatePresignedNotebookInstanceUrl(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(createPresignedNotebookInstanceUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresignedNotebookInstanceUrlRequest> request = null;
        Response<CreatePresignedNotebookInstanceUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresignedNotebookInstanceUrlRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPresignedNotebookInstanceUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePresignedNotebookInstanceUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePresignedNotebookInstanceUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePresignedNotebookInstanceUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a processing job.
     * </p>
     * 
     * @param createProcessingJobRequest
     * @return Result of the CreateProcessingJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreateProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateProcessingJobResult createProcessingJob(CreateProcessingJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProcessingJob(request);
    }

    @SdkInternalApi
    final CreateProcessingJobResult executeCreateProcessingJob(CreateProcessingJobRequest createProcessingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProcessingJobRequest> request = null;
        Response<CreateProcessingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProcessingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProcessingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProcessingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProcessingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProcessingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an
     * Amazon S3 location that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon
     * SageMaker, provided that you know how to use them for inferences.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmSpecification</code> - Identifies the training algorithm to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HyperParameters</code> - Specify these algorithm-specific parameters to enable the estimation of model
     * parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of
     * hyperparameters for each training algorithm provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 bucket where you want Amazon SageMaker to save the
     * results of model training.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>ResourceConfig</code> - Identifies the resources, ML compute instances, and ML storage volumes to deploy
     * for model training. In distributed training, you specify more than one instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableManagedSpotTraining</code> - Optimize the cost of training machine learning models by up to 80% by
     * using Amazon EC2 Spot instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoleARN</code> - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your
     * behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
     * successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - To help cap training costs, use <code>MaxRuntimeInSeconds</code> to set a time
     * limit for training. Use <code>MaxWaitTimeInSeconds</code> to specify how long you are willing to wait for a
     * managed spot training job to complete.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @return Result of the CreateTrainingJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTrainingJobResult createTrainingJob(CreateTrainingJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrainingJob(request);
    }

    @SdkInternalApi
    final CreateTrainingJobResult executeCreateTrainingJob(CreateTrainingJobRequest createTrainingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrainingJobRequest> request = null;
        Response<CreateTrainingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrainingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrainingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrainingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrainingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrainingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these
     * results to an Amazon S3 location that you specify.
     * </p>
     * <p>
     * To perform batch transformations, you create a transform job and use the data that you have readily available.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TransformJobName</code> - Identifies the transform job. The name must be unique within an AWS Region in an
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModelName</code> - Identifies the model to use. <code>ModelName</code> must be the name of an existing
     * Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see
     * <a>CreateModel</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformInput</code> - Describes the dataset to be transformed and the Amazon S3 location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformOutput</code> - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
     * results from the transform job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformResources</code> - Identifies the ML compute instances for the transform job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how batch transformation works, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html">Batch Transform</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @return Result of the CreateTransformJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreateTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTransformJobResult createTransformJob(CreateTransformJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTransformJob(request);
    }

    @SdkInternalApi
    final CreateTransformJobResult executeCreateTransformJob(CreateTransformJobRequest createTransformJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTransformJobRequest> request = null;
        Response<CreateTransformJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTransformJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTransformJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTransformJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTransformJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTransformJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon SageMaker <i>trial</i>. A trial is a set of steps called <i>trial components</i> that produce a
     * machine learning model. A trial is part of a single Amazon SageMaker <i>experiment</i>.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <p>
     * To get a list of all your trials, call the <a>ListTrials</a> API. To view a trial's properties, call the
     * <a>DescribeTrial</a> API. To create a trial component, call the <a>CreateTrialComponent</a> API.
     * </p>
     * 
     * @param createTrialRequest
     * @return Result of the CreateTrial operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTrialResult createTrial(CreateTrialRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrial(request);
    }

    @SdkInternalApi
    final CreateTrialResult executeCreateTrial(CreateTrialRequest createTrialRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrialRequest> request = null;
        Response<CreateTrialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrialRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrial");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrialResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrialResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <i>trial component</i>, which is a stage of a machine learning <i>trial</i>. A trial is composed of one
     * or more trial components. A trial component can be used in multiple trials.
     * </p>
     * <p>
     * Trial components include pre-processing jobs, training jobs, and batch transform jobs.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial component and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <note>
     * <p>
     * <code>CreateTrialComponent</code> can only be invoked from within an Amazon SageMaker managed environment. This
     * includes Amazon SageMaker training jobs, processing jobs, transform jobs, and Amazon SageMaker notebooks. A call
     * to <code>CreateTrialComponent</code> from outside one of these environments results in an error.
     * </p>
     * </note>
     * 
     * @param createTrialComponentRequest
     * @return Result of the CreateTrialComponent operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTrialComponentResult createTrialComponent(CreateTrialComponentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrialComponent(request);
    }

    @SdkInternalApi
    final CreateTrialComponentResult executeCreateTrialComponent(CreateTrialComponentRequest createTrialComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrialComponentRequest> request = null;
        Response<CreateTrialComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrialComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrialComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrialComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrialComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrialComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new user profile. A user profile represents a single user within a Domain, and is the main way to
     * reference a "person" for the purposes of sharing, reporting and other user-oriented features. This entity is
     * created during on-boarding. If an administrator invites a person by email or imports them from SSO, a new
     * UserProfile is automatically created. This entity is the primary holder of settings for an individual user and
     * has a reference to the user's private Amazon Elastic File System (EFS) home directory.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserProfile(request);
    }

    @SdkInternalApi
    final CreateUserProfileResult executeCreateUserProfile(CreateUserProfileRequest createUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserProfileRequest> request = null;
        Response<CreateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools.
     * You must first create the user pools before you can create a work team.
     * </p>
     * <p>
     * You cannot create more than 25 work teams in an account and region.
     * </p>
     * 
     * @param createWorkteamRequest
     * @return Result of the CreateWorkteam operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkteamResult createWorkteam(CreateWorkteamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkteam(request);
    }

    @SdkInternalApi
    final CreateWorkteamResult executeCreateWorkteam(CreateWorkteamRequest createWorkteamRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkteamRequest> request = null;
        Response<CreateWorkteamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkteamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkteamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkteam");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkteamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkteamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @return Result of the DeleteAlgorithm operation returned by the service.
     * @sample AmazonSageMaker.DeleteAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAlgorithmResult deleteAlgorithm(DeleteAlgorithmRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlgorithm(request);
    }

    @SdkInternalApi
    final DeleteAlgorithmResult executeDeleteAlgorithm(DeleteAlgorithmRequest deleteAlgorithmRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAlgorithmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlgorithmRequest> request = null;
        Response<DeleteAlgorithmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlgorithmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAlgorithmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlgorithm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAlgorithmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAlgorithmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to stop and delete an app.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppResult deleteApp(DeleteAppRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApp(request);
    }

    @SdkInternalApi
    final DeleteAppResult executeDeleteApp(DeleteAppRequest deleteAppRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<DeleteAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @return Result of the DeleteCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.DeleteCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCodeRepositoryResult deleteCodeRepository(DeleteCodeRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCodeRepository(request);
    }

    @SdkInternalApi
    final DeleteCodeRepositoryResult executeDeleteCodeRepository(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCodeRepositoryRequest> request = null;
        Response<DeleteCodeRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCodeRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCodeRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCodeRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCodeRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCodeRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to delete a domain. If you on-boarded with IAM mode, you will need to delete your domain to on-board again
     * using SSO. Use with caution. All of the members of the domain will lose access to their EFS volume, including
     * data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was
     * created.
     * </p>
     * <p>
     * Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> API call.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSageMaker.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEndpoint(request);
    }

    @SdkInternalApi
    final DeleteEndpointResult executeDeleteEndpoint(DeleteEndpointRequest deleteEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code> API deletes only the specified
     * configuration. It does not delete endpoints created using the configuration.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @return Result of the DeleteEndpointConfig operation returned by the service.
     * @sample AmazonSageMaker.DeleteEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEndpointConfigResult deleteEndpointConfig(DeleteEndpointConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEndpointConfig(request);
    }

    @SdkInternalApi
    final DeleteEndpointConfigResult executeDeleteEndpointConfig(DeleteEndpointConfigRequest deleteEndpointConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEndpointConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointConfigRequest> request = null;
        Response<DeleteEndpointConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEndpointConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEndpointConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEndpointConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEndpointConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon SageMaker experiment. All trials associated with the experiment must be deleted first. Use the
     * <a>ListTrials</a> API to get a list of the trials associated with the experiment.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @return Result of the DeleteExperiment operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteExperimentResult deleteExperiment(DeleteExperimentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteExperiment(request);
    }

    @SdkInternalApi
    final DeleteExperimentResult executeDeleteExperiment(DeleteExperimentRequest deleteExperimentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExperimentRequest> request = null;
        Response<DeleteExperimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExperimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteExperimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteExperiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteExperimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteExperimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified flow definition.
     * </p>
     * 
     * @param deleteFlowDefinitionRequest
     * @return Result of the DeleteFlowDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFlowDefinitionResult deleteFlowDefinition(DeleteFlowDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFlowDefinition(request);
    }

    @SdkInternalApi
    final DeleteFlowDefinitionResult executeDeleteFlowDefinition(DeleteFlowDefinitionRequest deleteFlowDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFlowDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowDefinitionRequest> request = null;
        Response<DeleteFlowDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFlowDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFlowDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFlowDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFlowDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model entry that was created in Amazon
     * SageMaker when you called the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API. It does not
     * delete model artifacts, inference code, or the IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @sample AmazonSageMaker.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteModelResult deleteModel(DeleteModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModel(request);
    }

    @SdkInternalApi
    final DeleteModelResult executeDeleteModel(DeleteModelRequest deleteModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<DeleteModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a model package.
     * </p>
     * <p>
     * A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to
     * model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * 
     * @param deleteModelPackageRequest
     * @return Result of the DeleteModelPackage operation returned by the service.
     * @sample AmazonSageMaker.DeleteModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteModelPackageResult deleteModelPackage(DeleteModelPackageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModelPackage(request);
    }

    @SdkInternalApi
    final DeleteModelPackageResult executeDeleteModelPackage(DeleteModelPackageRequest deleteModelPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelPackageRequest> request = null;
        Response<DeleteModelPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelPackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModelPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a monitoring schedule. Also stops the schedule had not already been stopped. This does not delete the job
     * execution history of the monitoring schedule.
     * </p>
     * 
     * @param deleteMonitoringScheduleRequest
     * @return Result of the DeleteMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMonitoringScheduleResult deleteMonitoringSchedule(DeleteMonitoringScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMonitoringSchedule(request);
    }

    @SdkInternalApi
    final DeleteMonitoringScheduleResult executeDeleteMonitoringSchedule(DeleteMonitoringScheduleRequest deleteMonitoringScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMonitoringScheduleRequest> request = null;
        Response<DeleteMonitoringScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMonitoringScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMonitoringScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMonitoringSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMonitoringScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMonitoringScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the
     * <code>StopNotebookInstance</code> API.
     * </p>
     * <important>
     * <p>
     * When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance,
     * and deletes the ML storage volume and the network interface associated with the notebook instance.
     * </p>
     * </important>
     * 
     * @param deleteNotebookInstanceRequest
     * @return Result of the DeleteNotebookInstance operation returned by the service.
     * @sample AmazonSageMaker.DeleteNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNotebookInstanceResult deleteNotebookInstance(DeleteNotebookInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotebookInstance(request);
    }

    @SdkInternalApi
    final DeleteNotebookInstanceResult executeDeleteNotebookInstance(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotebookInstanceRequest> request = null;
        Response<DeleteNotebookInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotebookInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNotebookInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNotebookInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNotebookInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteNotebookInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @return Result of the DeleteNotebookInstanceLifecycleConfig operation returned by the service.
     * @sample AmazonSageMaker.DeleteNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNotebookInstanceLifecycleConfigResult deleteNotebookInstanceLifecycleConfig(DeleteNotebookInstanceLifecycleConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotebookInstanceLifecycleConfig(request);
    }

    @SdkInternalApi
    final DeleteNotebookInstanceLifecycleConfigResult executeDeleteNotebookInstanceLifecycleConfig(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotebookInstanceLifecycleConfigRequest> request = null;
        Response<DeleteNotebookInstanceLifecycleConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotebookInstanceLifecycleConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteNotebookInstanceLifecycleConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNotebookInstanceLifecycleConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNotebookInstanceLifecycleConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteNotebookInstanceLifecycleConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified tags from an Amazon SageMaker resource.
     * </p>
     * <p>
     * To list a resource's tags, use the <code>ListTags</code> API.
     * </p>
     * <note>
     * <p>
     * When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from
     * training jobs that the hyperparameter tuning job launched before you called this API.
     * </p>
     * </note>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @sample AmazonSageMaker.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified trial. All trial components that make up the trial must be deleted first. Use the
     * <a>DescribeTrialComponent</a> API to get the list of trial components.
     * </p>
     * 
     * @param deleteTrialRequest
     * @return Result of the DeleteTrial operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrial" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTrialResult deleteTrial(DeleteTrialRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrial(request);
    }

    @SdkInternalApi
    final DeleteTrialResult executeDeleteTrial(DeleteTrialRequest deleteTrialRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrialRequest> request = null;
        Response<DeleteTrialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrialRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrial");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrialResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrialResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified trial component. A trial component must be disassociated from all trials before the trial
     * component can be deleted. To disassociate a trial component from a trial, call the
     * <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param deleteTrialComponentRequest
     * @return Result of the DeleteTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTrialComponentResult deleteTrialComponent(DeleteTrialComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrialComponent(request);
    }

    @SdkInternalApi
    final DeleteTrialComponentResult executeDeleteTrialComponent(DeleteTrialComponentRequest deleteTrialComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrialComponentRequest> request = null;
        Response<DeleteTrialComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrialComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrialComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrialComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrialComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrialComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return Result of the DeleteUserProfile operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteUserProfileResult deleteUserProfile(DeleteUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserProfile(request);
    }

    @SdkInternalApi
    final DeleteUserProfileResult executeDeleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserProfileRequest> request = null;
        Response<DeleteUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @return Result of the DeleteWorkteam operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.DeleteWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkteamResult deleteWorkteam(DeleteWorkteamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkteam(request);
    }

    @SdkInternalApi
    final DeleteWorkteamResult executeDeleteWorkteam(DeleteWorkteamRequest deleteWorkteamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkteamRequest> request = null;
        Response<DeleteWorkteamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkteamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkteamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkteam");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkteamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkteamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return Result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonSageMaker.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAlgorithmResult describeAlgorithm(DescribeAlgorithmRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlgorithm(request);
    }

    @SdkInternalApi
    final DescribeAlgorithmResult executeDescribeAlgorithm(DescribeAlgorithmRequest describeAlgorithmRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlgorithmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlgorithmRequest> request = null;
        Response<DescribeAlgorithmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlgorithmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAlgorithmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlgorithm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAlgorithmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAlgorithmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the app.
     * </p>
     * 
     * @param describeAppRequest
     * @return Result of the DescribeApp operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAppResult describeApp(DescribeAppRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApp(request);
    }

    @SdkInternalApi
    final DescribeAppResult executeDescribeApp(DescribeAppRequest describeAppRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppRequest> request = null;
        Response<DescribeAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an Amazon SageMaker job.
     * </p>
     * 
     * @param describeAutoMLJobRequest
     * @return Result of the DescribeAutoMLJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAutoMLJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAutoMLJobResult describeAutoMLJob(DescribeAutoMLJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutoMLJob(request);
    }

    @SdkInternalApi
    final DescribeAutoMLJobResult executeDescribeAutoMLJob(DescribeAutoMLJobRequest describeAutoMLJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoMLJobRequest> request = null;
        Response<DescribeAutoMLJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutoMLJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAutoMLJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutoMLJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAutoMLJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAutoMLJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @return Result of the DescribeCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.DescribeCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCodeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCodeRepository(request);
    }

    @SdkInternalApi
    final DescribeCodeRepositoryResult executeDescribeCodeRepository(DescribeCodeRepositoryRequest describeCodeRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCodeRepositoryRequest> request = null;
        Response<DescribeCodeRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCodeRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCodeRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCodeRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCodeRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCodeRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a model compilation job.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about multiple model
     * compilation jobs, use <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param describeCompilationJobRequest
     * @return Result of the DescribeCompilationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCompilationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCompilationJobResult describeCompilationJob(DescribeCompilationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCompilationJob(request);
    }

    @SdkInternalApi
    final DescribeCompilationJobResult executeDescribeCompilationJob(DescribeCompilationJobRequest describeCompilationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCompilationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCompilationJobRequest> request = null;
        Response<DescribeCompilationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCompilationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCompilationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCompilationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCompilationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCompilationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The desciption of the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDomainResult describeDomain(DescribeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomain(request);
    }

    @SdkInternalApi
    final DescribeDomainResult executeDescribeDomain(DescribeDomainRequest describeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return Result of the DescribeEndpoint operation returned by the service.
     * @sample AmazonSageMaker.DescribeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEndpointResult describeEndpoint(DescribeEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpoint(request);
    }

    @SdkInternalApi
    final DescribeEndpointResult executeDescribeEndpoint(DescribeEndpointRequest describeEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointRequest> request = null;
        Response<DescribeEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @return Result of the DescribeEndpointConfig operation returned by the service.
     * @sample AmazonSageMaker.DescribeEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpointConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEndpointConfigResult describeEndpointConfig(DescribeEndpointConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpointConfig(request);
    }

    @SdkInternalApi
    final DescribeEndpointConfigResult executeDescribeEndpointConfig(DescribeEndpointConfigRequest describeEndpointConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointConfigRequest> request = null;
        Response<DescribeEndpointConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpointConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEndpointConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of an experiment's properties.
     * </p>
     * 
     * @param describeExperimentRequest
     * @return Result of the DescribeExperiment operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeExperiment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeExperimentResult describeExperiment(DescribeExperimentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExperiment(request);
    }

    @SdkInternalApi
    final DescribeExperimentResult executeDescribeExperiment(DescribeExperimentRequest describeExperimentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExperimentRequest> request = null;
        Response<DescribeExperimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExperimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExperimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExperiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExperimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExperimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified flow definition.
     * </p>
     * 
     * @param describeFlowDefinitionRequest
     * @return Result of the DescribeFlowDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFlowDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFlowDefinitionResult describeFlowDefinition(DescribeFlowDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFlowDefinition(request);
    }

    @SdkInternalApi
    final DescribeFlowDefinitionResult executeDescribeFlowDefinition(DescribeFlowDefinitionRequest describeFlowDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFlowDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFlowDefinitionRequest> request = null;
        Response<DescribeFlowDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFlowDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFlowDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFlowDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFlowDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFlowDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the requested human task user interface.
     * </p>
     * 
     * @param describeHumanTaskUiRequest
     * @return Result of the DescribeHumanTaskUi operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeHumanTaskUiResult describeHumanTaskUi(DescribeHumanTaskUiRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHumanTaskUi(request);
    }

    @SdkInternalApi
    final DescribeHumanTaskUiResult executeDescribeHumanTaskUi(DescribeHumanTaskUiRequest describeHumanTaskUiRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHumanTaskUiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHumanTaskUiRequest> request = null;
        Response<DescribeHumanTaskUiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHumanTaskUiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeHumanTaskUiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHumanTaskUi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHumanTaskUiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeHumanTaskUiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @return Result of the DescribeHyperParameterTuningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHyperParameterTuningJobResult describeHyperParameterTuningJob(DescribeHyperParameterTuningJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHyperParameterTuningJob(request);
    }

    @SdkInternalApi
    final DescribeHyperParameterTuningJobResult executeDescribeHyperParameterTuningJob(
            DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHyperParameterTuningJobRequest> request = null;
        Response<DescribeHyperParameterTuningJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHyperParameterTuningJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeHyperParameterTuningJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHyperParameterTuningJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHyperParameterTuningJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeHyperParameterTuningJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @return Result of the DescribeLabelingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeLabelingJobResult describeLabelingJob(DescribeLabelingJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLabelingJob(request);
    }

    @SdkInternalApi
    final DescribeLabelingJobResult executeDescribeLabelingJob(DescribeLabelingJobRequest describeLabelingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLabelingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLabelingJobRequest> request = null;
        Response<DescribeLabelingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLabelingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLabelingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLabelingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLabelingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLabelingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param describeModelRequest
     * @return Result of the DescribeModel operation returned by the service.
     * @sample AmazonSageMaker.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeModelResult describeModel(DescribeModelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeModel(request);
    }

    @SdkInternalApi
    final DescribeModelResult executeDescribeModel(DescribeModelRequest describeModelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelRequest> request = null;
        Response<DescribeModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list
     * them on AWS Marketplace.
     * </p>
     * <p>
     * To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
     * </p>
     * 
     * @param describeModelPackageRequest
     * @return Result of the DescribeModelPackage operation returned by the service.
     * @sample AmazonSageMaker.DescribeModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeModelPackageResult describeModelPackage(DescribeModelPackageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeModelPackage(request);
    }

    @SdkInternalApi
    final DescribeModelPackageResult executeDescribeModelPackage(DescribeModelPackageRequest describeModelPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(describeModelPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelPackageRequest> request = null;
        Response<DescribeModelPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelPackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeModelPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeModelPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeModelPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeModelPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the schedule for a monitoring job.
     * </p>
     * 
     * @param describeMonitoringScheduleRequest
     * @return Result of the DescribeMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMonitoringScheduleResult describeMonitoringSchedule(DescribeMonitoringScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMonitoringSchedule(request);
    }

    @SdkInternalApi
    final DescribeMonitoringScheduleResult executeDescribeMonitoringSchedule(DescribeMonitoringScheduleRequest describeMonitoringScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMonitoringScheduleRequest> request = null;
        Response<DescribeMonitoringScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMonitoringScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMonitoringScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMonitoringSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMonitoringScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMonitoringScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @return Result of the DescribeNotebookInstance operation returned by the service.
     * @sample AmazonSageMaker.DescribeNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNotebookInstanceResult describeNotebookInstance(DescribeNotebookInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNotebookInstance(request);
    }

    @SdkInternalApi
    final DescribeNotebookInstanceResult executeDescribeNotebookInstance(DescribeNotebookInstanceRequest describeNotebookInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotebookInstanceRequest> request = null;
        Response<DescribeNotebookInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotebookInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNotebookInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNotebookInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNotebookInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeNotebookInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param describeNotebookInstanceLifecycleConfigRequest
     * @return Result of the DescribeNotebookInstanceLifecycleConfig operation returned by the service.
     * @sample AmazonSageMaker.DescribeNotebookInstanceLifecycleConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNotebookInstanceLifecycleConfig(request);
    }

    @SdkInternalApi
    final DescribeNotebookInstanceLifecycleConfigResult executeDescribeNotebookInstanceLifecycleConfig(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotebookInstanceLifecycleConfigRequest> request = null;
        Response<DescribeNotebookInstanceLifecycleConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotebookInstanceLifecycleConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNotebookInstanceLifecycleConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNotebookInstanceLifecycleConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNotebookInstanceLifecycleConfigResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of a processing job.
     * </p>
     * 
     * @param describeProcessingJobRequest
     * @return Result of the DescribeProcessingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProcessingJobResult describeProcessingJob(DescribeProcessingJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProcessingJob(request);
    }

    @SdkInternalApi
    final DescribeProcessingJobResult executeDescribeProcessingJob(DescribeProcessingJobRequest describeProcessingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProcessingJobRequest> request = null;
        Response<DescribeProcessingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProcessingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProcessingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProcessingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProcessingJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeProcessingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
     * in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @return Result of the DescribeSubscribedWorkteam operation returned by the service.
     * @sample AmazonSageMaker.DescribeSubscribedWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSubscribedWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSubscribedWorkteamResult describeSubscribedWorkteam(DescribeSubscribedWorkteamRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSubscribedWorkteam(request);
    }

    @SdkInternalApi
    final DescribeSubscribedWorkteamResult executeDescribeSubscribedWorkteam(DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSubscribedWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscribedWorkteamRequest> request = null;
        Response<DescribeSubscribedWorkteamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscribedWorkteamRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSubscribedWorkteamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSubscribedWorkteam");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSubscribedWorkteamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSubscribedWorkteamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @return Result of the DescribeTrainingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTrainingJobResult describeTrainingJob(DescribeTrainingJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrainingJob(request);
    }

    @SdkInternalApi
    final DescribeTrainingJobResult executeDescribeTrainingJob(DescribeTrainingJobRequest describeTrainingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrainingJobRequest> request = null;
        Response<DescribeTrainingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrainingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTrainingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrainingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrainingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTrainingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @return Result of the DescribeTransformJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTransformJobResult describeTransformJob(DescribeTransformJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTransformJob(request);
    }

    @SdkInternalApi
    final DescribeTransformJobResult executeDescribeTransformJob(DescribeTransformJobRequest describeTransformJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTransformJobRequest> request = null;
        Response<DescribeTransformJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTransformJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTransformJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTransformJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTransformJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTransformJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of a trial's properties.
     * </p>
     * 
     * @param describeTrialRequest
     * @return Result of the DescribeTrial operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrial" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTrialResult describeTrial(DescribeTrialRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrial(request);
    }

    @SdkInternalApi
    final DescribeTrialResult executeDescribeTrial(DescribeTrialRequest describeTrialRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrialRequest> request = null;
        Response<DescribeTrialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrialRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTrialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrial");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrialResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTrialResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of a trials component's properties.
     * </p>
     * 
     * @param describeTrialComponentRequest
     * @return Result of the DescribeTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTrialComponentResult describeTrialComponent(DescribeTrialComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrialComponent(request);
    }

    @SdkInternalApi
    final DescribeTrialComponentResult executeDescribeTrialComponent(DescribeTrialComponentRequest describeTrialComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrialComponentRequest> request = null;
        Response<DescribeTrialComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrialComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTrialComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrialComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrialComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTrialComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the user profile.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return Result of the DescribeUserProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeUserProfileResult describeUserProfile(DescribeUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserProfile(request);
    }

    @SdkInternalApi
    final DescribeUserProfileResult executeDescribeUserProfile(DescribeUserProfileRequest describeUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserProfileRequest> request = null;
        Response<DescribeUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists private workforce information, including workforce name, Amazon Resource Name (ARN), and, if applicable,
     * allowed IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>). Allowable IP address ranges
     * are the IP addresses that workers can use to access tasks.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param describeWorkforceRequest
     * @return Result of the DescribeWorkforce operation returned by the service.
     * @sample AmazonSageMaker.DescribeWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkforce" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeWorkforceResult describeWorkforce(DescribeWorkforceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkforce(request);
    }

    @SdkInternalApi
    final DescribeWorkforceResult executeDescribeWorkforce(DescribeWorkforceRequest describeWorkforceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkforceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkforceRequest> request = null;
        Response<DescribeWorkforceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkforceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkforceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkforce");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkforceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkforceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specific work team. You can see information such as the create date, the last updated
     * date, membership information, and the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @return Result of the DescribeWorkteam operation returned by the service.
     * @sample AmazonSageMaker.DescribeWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeWorkteamResult describeWorkteam(DescribeWorkteamRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkteam(request);
    }

    @SdkInternalApi
    final DescribeWorkteamResult executeDescribeWorkteam(DescribeWorkteamRequest describeWorkteamRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkteamRequest> request = null;
        Response<DescribeWorkteamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkteamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkteamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkteam");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkteamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkteamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a trial component from a trial. This doesn't effect other trials the component is associated with.
     * Before you can delete a component, you must disassociate the component from all trials it is associated with. To
     * associate a trial component with a trial, call the <a>AssociateTrialComponent</a> API.
     * </p>
     * <p>
     * To get a list of the trials a component is associated with, use the <a>Search</a> API. Specify
     * <code>ExperimentTrialComponent</code> for the <code>Resource</code> parameter. The list appears in the response
     * under <code>Results.TrialComponent.Parents</code>.
     * </p>
     * 
     * @param disassociateTrialComponentRequest
     * @return Result of the DisassociateTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DisassociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DisassociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateTrialComponentResult disassociateTrialComponent(DisassociateTrialComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateTrialComponent(request);
    }

    @SdkInternalApi
    final DisassociateTrialComponentResult executeDisassociateTrialComponent(DisassociateTrialComponentRequest disassociateTrialComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTrialComponentRequest> request = null;
        Response<DisassociateTrialComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTrialComponentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateTrialComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateTrialComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateTrialComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateTrialComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
     * possible matches for the property name to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>.
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @return Result of the GetSearchSuggestions operation returned by the service.
     * @sample AmazonSageMaker.GetSearchSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSearchSuggestionsResult getSearchSuggestions(GetSearchSuggestionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSearchSuggestions(request);
    }

    @SdkInternalApi
    final GetSearchSuggestionsResult executeGetSearchSuggestions(GetSearchSuggestionsRequest getSearchSuggestionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSearchSuggestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSearchSuggestionsRequest> request = null;
        Response<GetSearchSuggestionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSearchSuggestionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSearchSuggestionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSearchSuggestions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSearchSuggestionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSearchSuggestionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @return Result of the ListAlgorithms operation returned by the service.
     * @sample AmazonSageMaker.ListAlgorithms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAlgorithmsResult listAlgorithms(ListAlgorithmsRequest request) {
        request = beforeClientExecution(request);
        return executeListAlgorithms(request);
    }

    @SdkInternalApi
    final ListAlgorithmsResult executeListAlgorithms(ListAlgorithmsRequest listAlgorithmsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAlgorithmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAlgorithmsRequest> request = null;
        Response<ListAlgorithmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAlgorithmsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAlgorithmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAlgorithms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAlgorithmsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAlgorithmsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists apps.
     * </p>
     * 
     * @param listAppsRequest
     * @return Result of the ListApps operation returned by the service.
     * @sample AmazonSageMaker.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAppsResult listApps(ListAppsRequest request) {
        request = beforeClientExecution(request);
        return executeListApps(request);
    }

    @SdkInternalApi
    final ListAppsResult executeListApps(ListAppsRequest listAppsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppsRequest> request = null;
        Response<ListAppsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Request a list of jobs.
     * </p>
     * 
     * @param listAutoMLJobsRequest
     * @return Result of the ListAutoMLJobs operation returned by the service.
     * @sample AmazonSageMaker.ListAutoMLJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAutoMLJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAutoMLJobsResult listAutoMLJobs(ListAutoMLJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListAutoMLJobs(request);
    }

    @SdkInternalApi
    final ListAutoMLJobsResult executeListAutoMLJobs(ListAutoMLJobsRequest listAutoMLJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAutoMLJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAutoMLJobsRequest> request = null;
        Response<ListAutoMLJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAutoMLJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAutoMLJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAutoMLJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAutoMLJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAutoMLJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the Candidates created for the job.
     * </p>
     * 
     * @param listCandidatesForAutoMLJobRequest
     * @return Result of the ListCandidatesForAutoMLJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListCandidatesForAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCandidatesForAutoMLJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCandidatesForAutoMLJobResult listCandidatesForAutoMLJob(ListCandidatesForAutoMLJobRequest request) {
        request = beforeClientExecution(request);
        return executeListCandidatesForAutoMLJob(request);
    }

    @SdkInternalApi
    final ListCandidatesForAutoMLJobResult executeListCandidatesForAutoMLJob(ListCandidatesForAutoMLJobRequest listCandidatesForAutoMLJobRequest) {

        ExecutionContext executionContext = createExecutionContext(listCandidatesForAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCandidatesForAutoMLJobRequest> request = null;
        Response<ListCandidatesForAutoMLJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCandidatesForAutoMLJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCandidatesForAutoMLJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCandidatesForAutoMLJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCandidatesForAutoMLJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCandidatesForAutoMLJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @return Result of the ListCodeRepositories operation returned by the service.
     * @sample AmazonSageMaker.ListCodeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCodeRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCodeRepositoriesResult listCodeRepositories(ListCodeRepositoriesRequest request) {
        request = beforeClientExecution(request);
        return executeListCodeRepositories(request);
    }

    @SdkInternalApi
    final ListCodeRepositoriesResult executeListCodeRepositories(ListCodeRepositoriesRequest listCodeRepositoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCodeRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCodeRepositoriesRequest> request = null;
        Response<ListCodeRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCodeRepositoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCodeRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCodeRepositories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCodeRepositoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCodeRepositoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists model compilation jobs that satisfy various filters.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about a particular model
     * compilation job you have created, use <a>DescribeCompilationJob</a>.
     * </p>
     * 
     * @param listCompilationJobsRequest
     * @return Result of the ListCompilationJobs operation returned by the service.
     * @sample AmazonSageMaker.ListCompilationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCompilationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCompilationJobsResult listCompilationJobs(ListCompilationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListCompilationJobs(request);
    }

    @SdkInternalApi
    final ListCompilationJobsResult executeListCompilationJobs(ListCompilationJobsRequest listCompilationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCompilationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCompilationJobsRequest> request = null;
        Response<ListCompilationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCompilationJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCompilationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCompilationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCompilationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCompilationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @sample AmazonSageMaker.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @return Result of the ListEndpointConfigs operation returned by the service.
     * @sample AmazonSageMaker.ListEndpointConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpointConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListEndpointConfigsResult listEndpointConfigs(ListEndpointConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListEndpointConfigs(request);
    }

    @SdkInternalApi
    final ListEndpointConfigsResult executeListEndpointConfigs(ListEndpointConfigsRequest listEndpointConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEndpointConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointConfigsRequest> request = null;
        Response<ListEndpointConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointConfigsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEndpointConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEndpointConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEndpointConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEndpointConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return Result of the ListEndpoints operation returned by the service.
     * @sample AmazonSageMaker.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEndpointsResult listEndpoints(ListEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListEndpoints(request);
    }

    @SdkInternalApi
    final ListEndpointsResult executeListEndpoints(ListEndpointsRequest listEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointsRequest> request = null;
        Response<ListEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the experiments in your account. The list can be filtered to show only experiments that were created in
     * a specific time range. The list can be sorted by experiment name or creation time.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return Result of the ListExperiments operation returned by the service.
     * @sample AmazonSageMaker.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExperimentsResult listExperiments(ListExperimentsRequest request) {
        request = beforeClientExecution(request);
        return executeListExperiments(request);
    }

    @SdkInternalApi
    final ListExperimentsResult executeListExperiments(ListExperimentsRequest listExperimentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExperimentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExperimentsRequest> request = null;
        Response<ListExperimentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExperimentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExperimentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExperiments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExperimentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExperimentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the flow definitions in your account.
     * </p>
     * 
     * @param listFlowDefinitionsRequest
     * @return Result of the ListFlowDefinitions operation returned by the service.
     * @sample AmazonSageMaker.ListFlowDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFlowDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFlowDefinitionsResult listFlowDefinitions(ListFlowDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListFlowDefinitions(request);
    }

    @SdkInternalApi
    final ListFlowDefinitionsResult executeListFlowDefinitions(ListFlowDefinitionsRequest listFlowDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowDefinitionsRequest> request = null;
        Response<ListFlowDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFlowDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlowDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFlowDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the human task user interfaces in your account.
     * </p>
     * 
     * @param listHumanTaskUisRequest
     * @return Result of the ListHumanTaskUis operation returned by the service.
     * @sample AmazonSageMaker.ListHumanTaskUis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHumanTaskUis" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListHumanTaskUisResult listHumanTaskUis(ListHumanTaskUisRequest request) {
        request = beforeClientExecution(request);
        return executeListHumanTaskUis(request);
    }

    @SdkInternalApi
    final ListHumanTaskUisResult executeListHumanTaskUis(ListHumanTaskUisRequest listHumanTaskUisRequest) {

        ExecutionContext executionContext = createExecutionContext(listHumanTaskUisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHumanTaskUisRequest> request = null;
        Response<ListHumanTaskUisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHumanTaskUisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHumanTaskUisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHumanTaskUis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHumanTaskUisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListHumanTaskUisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that describe the hyperparameter tuning jobs
     * launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @return Result of the ListHyperParameterTuningJobs operation returned by the service.
     * @sample AmazonSageMaker.ListHyperParameterTuningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListHyperParameterTuningJobs(request);
    }

    @SdkInternalApi
    final ListHyperParameterTuningJobsResult executeListHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listHyperParameterTuningJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHyperParameterTuningJobsRequest> request = null;
        Response<ListHyperParameterTuningJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHyperParameterTuningJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listHyperParameterTuningJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHyperParameterTuningJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHyperParameterTuningJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListHyperParameterTuningJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @return Result of the ListLabelingJobs operation returned by the service.
     * @sample AmazonSageMaker.ListLabelingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLabelingJobsResult listLabelingJobs(ListLabelingJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListLabelingJobs(request);
    }

    @SdkInternalApi
    final ListLabelingJobsResult executeListLabelingJobs(ListLabelingJobsRequest listLabelingJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLabelingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLabelingJobsRequest> request = null;
        Response<ListLabelingJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLabelingJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLabelingJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLabelingJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLabelingJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLabelingJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @return Result of the ListLabelingJobsForWorkteam operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListLabelingJobsForWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobsForWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLabelingJobsForWorkteamResult listLabelingJobsForWorkteam(ListLabelingJobsForWorkteamRequest request) {
        request = beforeClientExecution(request);
        return executeListLabelingJobsForWorkteam(request);
    }

    @SdkInternalApi
    final ListLabelingJobsForWorkteamResult executeListLabelingJobsForWorkteam(ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest) {

        ExecutionContext executionContext = createExecutionContext(listLabelingJobsForWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLabelingJobsForWorkteamRequest> request = null;
        Response<ListLabelingJobsForWorkteamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLabelingJobsForWorkteamRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLabelingJobsForWorkteamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLabelingJobsForWorkteam");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLabelingJobsForWorkteamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLabelingJobsForWorkteamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @return Result of the ListModelPackages operation returned by the service.
     * @sample AmazonSageMaker.ListModelPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackages" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListModelPackagesResult listModelPackages(ListModelPackagesRequest request) {
        request = beforeClientExecution(request);
        return executeListModelPackages(request);
    }

    @SdkInternalApi
    final ListModelPackagesResult executeListModelPackages(ListModelPackagesRequest listModelPackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listModelPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelPackagesRequest> request = null;
        Response<ListModelPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelPackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listModelPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListModelPackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListModelPackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListModelPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists models created with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @return Result of the ListModels operation returned by the service.
     * @sample AmazonSageMaker.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListModelsResult listModels(ListModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListModels(request);
    }

    @SdkInternalApi
    final ListModelsResult executeListModels(ListModelsRequest listModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelsRequest> request = null;
        Response<ListModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListModelsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns list of all monitoring job executions.
     * </p>
     * 
     * @param listMonitoringExecutionsRequest
     * @return Result of the ListMonitoringExecutions operation returned by the service.
     * @sample AmazonSageMaker.ListMonitoringExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMonitoringExecutionsResult listMonitoringExecutions(ListMonitoringExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListMonitoringExecutions(request);
    }

    @SdkInternalApi
    final ListMonitoringExecutionsResult executeListMonitoringExecutions(ListMonitoringExecutionsRequest listMonitoringExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMonitoringExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitoringExecutionsRequest> request = null;
        Response<ListMonitoringExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitoringExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMonitoringExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMonitoringExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMonitoringExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMonitoringExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns list of all monitoring schedules.
     * </p>
     * 
     * @param listMonitoringSchedulesRequest
     * @return Result of the ListMonitoringSchedules operation returned by the service.
     * @sample AmazonSageMaker.ListMonitoringSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMonitoringSchedulesResult listMonitoringSchedules(ListMonitoringSchedulesRequest request) {
        request = beforeClientExecution(request);
        return executeListMonitoringSchedules(request);
    }

    @SdkInternalApi
    final ListMonitoringSchedulesResult executeListMonitoringSchedules(ListMonitoringSchedulesRequest listMonitoringSchedulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMonitoringSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitoringSchedulesRequest> request = null;
        Response<ListMonitoringSchedulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitoringSchedulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMonitoringSchedulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMonitoringSchedules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMonitoringSchedulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMonitoringSchedulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @return Result of the ListNotebookInstanceLifecycleConfigs operation returned by the service.
     * @sample AmazonSageMaker.ListNotebookInstanceLifecycleConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstanceLifecycleConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNotebookInstanceLifecycleConfigsResult listNotebookInstanceLifecycleConfigs(ListNotebookInstanceLifecycleConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListNotebookInstanceLifecycleConfigs(request);
    }

    @SdkInternalApi
    final ListNotebookInstanceLifecycleConfigsResult executeListNotebookInstanceLifecycleConfigs(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotebookInstanceLifecycleConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotebookInstanceLifecycleConfigsRequest> request = null;
        Response<ListNotebookInstanceLifecycleConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotebookInstanceLifecycleConfigsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listNotebookInstanceLifecycleConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotebookInstanceLifecycleConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotebookInstanceLifecycleConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListNotebookInstanceLifecycleConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @return Result of the ListNotebookInstances operation returned by the service.
     * @sample AmazonSageMaker.ListNotebookInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNotebookInstancesResult listNotebookInstances(ListNotebookInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListNotebookInstances(request);
    }

    @SdkInternalApi
    final ListNotebookInstancesResult executeListNotebookInstances(ListNotebookInstancesRequest listNotebookInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotebookInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotebookInstancesRequest> request = null;
        Response<ListNotebookInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotebookInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNotebookInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotebookInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotebookInstancesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListNotebookInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists processing jobs that satisfy various filters.
     * </p>
     * 
     * @param listProcessingJobsRequest
     * @return Result of the ListProcessingJobs operation returned by the service.
     * @sample AmazonSageMaker.ListProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProcessingJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListProcessingJobsResult listProcessingJobs(ListProcessingJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListProcessingJobs(request);
    }

    @SdkInternalApi
    final ListProcessingJobsResult executeListProcessingJobs(ListProcessingJobsRequest listProcessingJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProcessingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProcessingJobsRequest> request = null;
        Response<ListProcessingJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProcessingJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProcessingJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProcessingJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProcessingJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProcessingJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
     * team satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @return Result of the ListSubscribedWorkteams operation returned by the service.
     * @sample AmazonSageMaker.ListSubscribedWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSubscribedWorkteams"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSubscribedWorkteamsResult listSubscribedWorkteams(ListSubscribedWorkteamsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscribedWorkteams(request);
    }

    @SdkInternalApi
    final ListSubscribedWorkteamsResult executeListSubscribedWorkteams(ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscribedWorkteamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscribedWorkteamsRequest> request = null;
        Response<ListSubscribedWorkteamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscribedWorkteamsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSubscribedWorkteamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscribedWorkteams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubscribedWorkteamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSubscribedWorkteamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @sample AmazonSageMaker.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * 
     * @param listTrainingJobsRequest
     * @return Result of the ListTrainingJobs operation returned by the service.
     * @sample AmazonSageMaker.ListTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTrainingJobsResult listTrainingJobs(ListTrainingJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListTrainingJobs(request);
    }

    @SdkInternalApi
    final ListTrainingJobsResult executeListTrainingJobs(ListTrainingJobsRequest listTrainingJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrainingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrainingJobsRequest> request = null;
        Response<ListTrainingJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrainingJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrainingJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrainingJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrainingJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrainingJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the training jobs that a hyperparameter tuning job
     * launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @return Result of the ListTrainingJobsForHyperParameterTuningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListTrainingJobsForHyperParameterTuningJob
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTrainingJobsForHyperParameterTuningJobResult listTrainingJobsForHyperParameterTuningJob(ListTrainingJobsForHyperParameterTuningJobRequest request) {
        request = beforeClientExecution(request);
        return executeListTrainingJobsForHyperParameterTuningJob(request);
    }

    @SdkInternalApi
    final ListTrainingJobsForHyperParameterTuningJobResult executeListTrainingJobsForHyperParameterTuningJob(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrainingJobsForHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrainingJobsForHyperParameterTuningJobRequest> request = null;
        Response<ListTrainingJobsForHyperParameterTuningJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrainingJobsForHyperParameterTuningJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTrainingJobsForHyperParameterTuningJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrainingJobsForHyperParameterTuningJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrainingJobsForHyperParameterTuningJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListTrainingJobsForHyperParameterTuningJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @return Result of the ListTransformJobs operation returned by the service.
     * @sample AmazonSageMaker.ListTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTransformJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTransformJobsResult listTransformJobs(ListTransformJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListTransformJobs(request);
    }

    @SdkInternalApi
    final ListTransformJobsResult executeListTransformJobs(ListTransformJobsRequest listTransformJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTransformJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTransformJobsRequest> request = null;
        Response<ListTransformJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTransformJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTransformJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTransformJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTransformJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTransformJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the trial components in your account. You can sort the list by trial component name or creation time. You
     * can filter the list to show only components that were created in a specific time range. You can also filter on
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExperimentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TrialName</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrialComponentsRequest
     * @return Result of the ListTrialComponents operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListTrialComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrialComponents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTrialComponentsResult listTrialComponents(ListTrialComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListTrialComponents(request);
    }

    @SdkInternalApi
    final ListTrialComponentsResult executeListTrialComponents(ListTrialComponentsRequest listTrialComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrialComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrialComponentsRequest> request = null;
        Response<ListTrialComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrialComponentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrialComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrialComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrialComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrialComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the trials in your account. Specify an experiment name to limit the list to the trials that are part of
     * that experiment. Specify a trial component name to limit the list to the trials that associated with that trial
     * component. The list can be filtered to show only trials that were created in a specific time range. The list can
     * be sorted by trial name or creation time.
     * </p>
     * 
     * @param listTrialsRequest
     * @return Result of the ListTrials operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListTrials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrials" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTrialsResult listTrials(ListTrialsRequest request) {
        request = beforeClientExecution(request);
        return executeListTrials(request);
    }

    @SdkInternalApi
    final ListTrialsResult executeListTrials(ListTrialsRequest listTrialsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrialsRequest> request = null;
        Response<ListTrialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrialsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrialsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists user profiles.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return Result of the ListUserProfiles operation returned by the service.
     * @sample AmazonSageMaker.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListUserProfiles(request);
    }

    @SdkInternalApi
    final ListUserProfilesResult executeListUserProfiles(ListUserProfilesRequest listUserProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserProfilesRequest> request = null;
        Response<ListUserProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the
     * filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @return Result of the ListWorkteams operation returned by the service.
     * @sample AmazonSageMaker.ListWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkteams" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkteamsResult listWorkteams(ListWorkteamsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkteams(request);
    }

    @SdkInternalApi
    final ListWorkteamsResult executeListWorkteams(ListWorkteamsRequest listWorkteamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkteamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkteamsRequest> request = null;
        Response<ListWorkteamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkteamsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkteamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkteams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkteamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkteamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @return Result of the RenderUiTemplate operation returned by the service.
     * @sample AmazonSageMaker.RenderUiTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RenderUiTemplateResult renderUiTemplate(RenderUiTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeRenderUiTemplate(request);
    }

    @SdkInternalApi
    final RenderUiTemplateResult executeRenderUiTemplate(RenderUiTemplateRequest renderUiTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(renderUiTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RenderUiTemplateRequest> request = null;
        Response<RenderUiTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RenderUiTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(renderUiTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RenderUiTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RenderUiTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RenderUiTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of
     * <code>SearchResult</code> objects in the response. You can sort the search results by any resource property in a
     * ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numeric, text, Boolean, and timestamp.
     * </p>
     * 
     * @param searchRequest
     * @return Result of the Search operation returned by the service.
     * @sample AmazonSageMaker.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchResult search(SearchRequest request) {
        request = beforeClientExecution(request);
        return executeSearch(request);
    }

    @SdkInternalApi
    final SearchResult executeSearch(SearchRequest searchRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRequest> request = null;
        Response<SearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Search");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a previously stopped monitoring schedule.
     * </p>
     * <note>
     * <p>
     * New monitoring schedules are immediately started after creation.
     * </p>
     * </note>
     * 
     * @param startMonitoringScheduleRequest
     * @return Result of the StartMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StartMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMonitoringScheduleResult startMonitoringSchedule(StartMonitoringScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeStartMonitoringSchedule(request);
    }

    @SdkInternalApi
    final StartMonitoringScheduleResult executeStartMonitoringSchedule(StartMonitoringScheduleRequest startMonitoringScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(startMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMonitoringScheduleRequest> request = null;
        Response<StartMonitoringScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMonitoringScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMonitoringScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMonitoringSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMonitoringScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMonitoringScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
     * After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be <code>InService</code> before you can connect to
     * your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @return Result of the StartNotebookInstance operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.StartNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartNotebookInstanceResult startNotebookInstance(StartNotebookInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStartNotebookInstance(request);
    }

    @SdkInternalApi
    final StartNotebookInstanceResult executeStartNotebookInstance(StartNotebookInstanceRequest startNotebookInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(startNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartNotebookInstanceRequest> request = null;
        Response<StartNotebookInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartNotebookInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startNotebookInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartNotebookInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartNotebookInstanceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartNotebookInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A method for forcing the termination of a running job.
     * </p>
     * 
     * @param stopAutoMLJobRequest
     * @return Result of the StopAutoMLJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopAutoMLJobResult stopAutoMLJob(StopAutoMLJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopAutoMLJob(request);
    }

    @SdkInternalApi
    final StopAutoMLJobResult executeStopAutoMLJob(StopAutoMLJobRequest stopAutoMLJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAutoMLJobRequest> request = null;
        Response<StopAutoMLJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAutoMLJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopAutoMLJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopAutoMLJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopAutoMLJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopAutoMLJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a model compilation job.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If
     * the job hasn't stopped, it sends the SIGKILL signal.
     * </p>
     * <p>
     * When it receives a <code>StopCompilationJob</code> request, Amazon SageMaker changes the
     * <a>CompilationJobSummary$CompilationJobStatus</a> of the job to <code>Stopping</code>. After Amazon SageMaker
     * stops the job, it sets the <a>CompilationJobSummary$CompilationJobStatus</a> to <code>Stopped</code>.
     * </p>
     * 
     * @param stopCompilationJobRequest
     * @return Result of the StopCompilationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopCompilationJob(request);
    }

    @SdkInternalApi
    final StopCompilationJobResult executeStopCompilationJob(StopCompilationJobRequest stopCompilationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCompilationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCompilationJobRequest> request = null;
        Response<StopCompilationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCompilationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopCompilationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopCompilationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCompilationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopCompilationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched.
     * </p>
     * <p>
     * All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All
     * data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning
     * job moves to the <code>Stopped</code> state, it releases all reserved resources for the tuning job.
     * </p>
     * 
     * @param stopHyperParameterTuningJobRequest
     * @return Result of the StopHyperParameterTuningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopHyperParameterTuningJobResult stopHyperParameterTuningJob(StopHyperParameterTuningJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopHyperParameterTuningJob(request);
    }

    @SdkInternalApi
    final StopHyperParameterTuningJobResult executeStopHyperParameterTuningJob(StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopHyperParameterTuningJobRequest> request = null;
        Response<StopHyperParameterTuningJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopHyperParameterTuningJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopHyperParameterTuningJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopHyperParameterTuningJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopHyperParameterTuningJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopHyperParameterTuningJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
     * stopped are placed in the Amazon S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @return Result of the StopLabelingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopLabelingJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopLabelingJobResult stopLabelingJob(StopLabelingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopLabelingJob(request);
    }

    @SdkInternalApi
    final StopLabelingJobResult executeStopLabelingJob(StopLabelingJobRequest stopLabelingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopLabelingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopLabelingJobRequest> request = null;
        Response<StopLabelingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopLabelingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopLabelingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopLabelingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopLabelingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopLabelingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a previously started monitoring schedule.
     * </p>
     * 
     * @param stopMonitoringScheduleRequest
     * @return Result of the StopMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopMonitoringScheduleResult stopMonitoringSchedule(StopMonitoringScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeStopMonitoringSchedule(request);
    }

    @SdkInternalApi
    final StopMonitoringScheduleResult executeStopMonitoringSchedule(StopMonitoringScheduleRequest stopMonitoringScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(stopMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopMonitoringScheduleRequest> request = null;
        Response<StopMonitoringScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopMonitoringScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopMonitoringScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopMonitoringSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopMonitoringScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopMonitoringScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
     * volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML
     * compute instance when you call <code>StopNotebookInstance</code>.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has been terminated, call the
     * <code>StartNotebookInstance</code> API. <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @return Result of the StopNotebookInstance operation returned by the service.
     * @sample AmazonSageMaker.StopNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopNotebookInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopNotebookInstanceResult stopNotebookInstance(StopNotebookInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStopNotebookInstance(request);
    }

    @SdkInternalApi
    final StopNotebookInstanceResult executeStopNotebookInstance(StopNotebookInstanceRequest stopNotebookInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(stopNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopNotebookInstanceRequest> request = null;
        Response<StopNotebookInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopNotebookInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopNotebookInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopNotebookInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopNotebookInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopNotebookInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a processing job.
     * </p>
     * 
     * @param stopProcessingJobRequest
     * @return Result of the StopProcessingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopProcessingJobResult stopProcessingJob(StopProcessingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopProcessingJob(request);
    }

    @SdkInternalApi
    final StopProcessingJobResult executeStopProcessingJob(StopProcessingJobRequest stopProcessingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopProcessingJobRequest> request = null;
        Response<StopProcessingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopProcessingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopProcessingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopProcessingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopProcessingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopProcessingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which
     * delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts,
     * so the results of the training is not lost.
     * </p>
     * <p>
     * When it receives a <code>StopTrainingJob</code> request, Amazon SageMaker changes the status of the job to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, it sets the status to <code>Stopped</code>.
     * </p>
     * 
     * @param stopTrainingJobRequest
     * @return Result of the StopTrainingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTrainingJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopTrainingJobResult stopTrainingJob(StopTrainingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopTrainingJob(request);
    }

    @SdkInternalApi
    final StopTrainingJobResult executeStopTrainingJob(StopTrainingJobRequest stopTrainingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTrainingJobRequest> request = null;
        Response<StopTrainingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTrainingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopTrainingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopTrainingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopTrainingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopTrainingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a transform job.
     * </p>
     * <p>
     * When Amazon SageMaker receives a <code>StopTransformJob</code> request, the status of the job changes to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, the status is set to <code>Stopped</code>. When you
     * stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     * </p>
     * 
     * @param stopTransformJobRequest
     * @return Result of the StopTransformJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTransformJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopTransformJobResult stopTransformJob(StopTransformJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopTransformJob(request);
    }

    @SdkInternalApi
    final StopTransformJobResult executeStopTransformJob(StopTransformJobRequest stopTransformJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTransformJobRequest> request = null;
        Response<StopTransformJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTransformJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopTransformJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopTransformJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopTransformJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopTransformJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @return Result of the UpdateCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.UpdateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateCodeRepositoryResult updateCodeRepository(UpdateCodeRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCodeRepository(request);
    }

    @SdkInternalApi
    final UpdateCodeRepositoryResult executeUpdateCodeRepository(UpdateCodeRepositoryRequest updateCodeRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCodeRepositoryRequest> request = null;
        Response<UpdateCodeRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCodeRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCodeRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCodeRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCodeRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCodeRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a domain. Changes will impact all of the people in the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDomainResult updateDomain(UpdateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomain(request);
    }

    @SdkInternalApi
    final UpdateDomainResult executeUpdateDomain(UpdateDomainRequest updateDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainRequest> request = null;
        Response<UpdateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deploys the new <code>EndpointConfig</code> specified in the request, switches to using newly created endpoint,
     * and then deletes resources provisioned for the endpoint using the previous <code>EndpointConfig</code> (there is
     * no availability loss).
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Updating</code>. After updating
     * the endpoint, it sets the status to <code>InService</code>. To check the status of an endpoint, use the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html">DescribeEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @return Result of the UpdateEndpoint operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEndpointResult updateEndpoint(UpdateEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpoint(request);
    }

    @SdkInternalApi
    final UpdateEndpointResult executeUpdateEndpoint(UpdateEndpointRequest updateEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointRequest> request = null;
        Response<UpdateEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant
     * associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to
     * <code>Updating</code>. After updating the endpoint, it sets the status to <code>InService</code>. To check the
     * status of an endpoint, use the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html">DescribeEndpoint</a> API.
     * </p>
     * 
     * @param updateEndpointWeightsAndCapacitiesRequest
     * @return Result of the UpdateEndpointWeightsAndCapacities operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateEndpointWeightsAndCapacities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpointWeightsAndCapacities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEndpointWeightsAndCapacitiesResult updateEndpointWeightsAndCapacities(UpdateEndpointWeightsAndCapacitiesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpointWeightsAndCapacities(request);
    }

    @SdkInternalApi
    final UpdateEndpointWeightsAndCapacitiesResult executeUpdateEndpointWeightsAndCapacities(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointWeightsAndCapacitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointWeightsAndCapacitiesRequest> request = null;
        Response<UpdateEndpointWeightsAndCapacitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointWeightsAndCapacitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEndpointWeightsAndCapacitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEndpointWeightsAndCapacities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointWeightsAndCapacitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEndpointWeightsAndCapacitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds, updates, or removes the description of an experiment. Updates the display name of an experiment.
     * </p>
     * 
     * @param updateExperimentRequest
     * @return Result of the UpdateExperiment operation returned by the service.
     * @throws ConflictException
     *         There was a conflict when you attempted to modify an experiment, trial, or trial component.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateExperimentResult updateExperiment(UpdateExperimentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateExperiment(request);
    }

    @SdkInternalApi
    final UpdateExperimentResult executeUpdateExperiment(UpdateExperimentRequest updateExperimentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateExperimentRequest> request = null;
        Response<UpdateExperimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateExperimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateExperimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateExperiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateExperimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateExperimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a previously created schedule.
     * </p>
     * 
     * @param updateMonitoringScheduleRequest
     * @return Result of the UpdateMonitoringSchedule operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMonitoringScheduleResult updateMonitoringSchedule(UpdateMonitoringScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMonitoringSchedule(request);
    }

    @SdkInternalApi
    final UpdateMonitoringScheduleResult executeUpdateMonitoringSchedule(UpdateMonitoringScheduleRequest updateMonitoringScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMonitoringScheduleRequest> request = null;
        Response<UpdateMonitoringScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMonitoringScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMonitoringScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMonitoringSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMonitoringScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMonitoringScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
     * used for your notebook instance to accommodate changes in your workload requirements.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @return Result of the UpdateNotebookInstance operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNotebookInstanceResult updateNotebookInstance(UpdateNotebookInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotebookInstance(request);
    }

    @SdkInternalApi
    final UpdateNotebookInstanceResult executeUpdateNotebookInstance(UpdateNotebookInstanceRequest updateNotebookInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotebookInstanceRequest> request = null;
        Response<UpdateNotebookInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotebookInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNotebookInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNotebookInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotebookInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNotebookInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @return Result of the UpdateNotebookInstanceLifecycleConfig operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNotebookInstanceLifecycleConfigResult updateNotebookInstanceLifecycleConfig(UpdateNotebookInstanceLifecycleConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotebookInstanceLifecycleConfig(request);
    }

    @SdkInternalApi
    final UpdateNotebookInstanceLifecycleConfigResult executeUpdateNotebookInstanceLifecycleConfig(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotebookInstanceLifecycleConfigRequest> request = null;
        Response<UpdateNotebookInstanceLifecycleConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotebookInstanceLifecycleConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateNotebookInstanceLifecycleConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNotebookInstanceLifecycleConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotebookInstanceLifecycleConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNotebookInstanceLifecycleConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the display name of a trial.
     * </p>
     * 
     * @param updateTrialRequest
     * @return Result of the UpdateTrial operation returned by the service.
     * @throws ConflictException
     *         There was a conflict when you attempted to modify an experiment, trial, or trial component.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTrialResult updateTrial(UpdateTrialRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrial(request);
    }

    @SdkInternalApi
    final UpdateTrialResult executeUpdateTrial(UpdateTrialRequest updateTrialRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrialRequest> request = null;
        Response<UpdateTrialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrialRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrial");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrialResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrialResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates one or more properties of a trial component.
     * </p>
     * 
     * @param updateTrialComponentRequest
     * @return Result of the UpdateTrialComponent operation returned by the service.
     * @throws ConflictException
     *         There was a conflict when you attempted to modify an experiment, trial, or trial component.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateTrialComponentResult updateTrialComponent(UpdateTrialComponentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrialComponent(request);
    }

    @SdkInternalApi
    final UpdateTrialComponentResult executeUpdateTrialComponent(UpdateTrialComponentRequest updateTrialComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrialComponentRequest> request = null;
        Response<UpdateTrialComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrialComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrialComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrialComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrialComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrialComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a user profile.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserProfile(request);
    }

    @SdkInternalApi
    final UpdateUserProfileResult executeUpdateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserProfileRequest> request = null;
        Response<UpdateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restricts access to tasks assigned to workers in the specified workforce to those within specific ranges of IP
     * addresses. You specify allowed IP addresses by creating a list of up to four <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>.
     * </p>
     * <p>
     * By default, a workforce isn't restricted to specific IP addresses. If you specify a range of IP addresses,
     * workers who attempt to access tasks using any IP address outside the specified range are denied access and get a
     * <code>Not Found</code> error message on the worker portal. After restricting access with this operation, you can
     * see the allowed IP values for a private workforce with the operation.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param updateWorkforceRequest
     * @return Result of the UpdateWorkforce operation returned by the service.
     * @sample AmazonSageMaker.UpdateWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkforceResult updateWorkforce(UpdateWorkforceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkforce(request);
    }

    @SdkInternalApi
    final UpdateWorkforceResult executeUpdateWorkforce(UpdateWorkforceRequest updateWorkforceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkforceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkforceRequest> request = null;
        Response<UpdateWorkforceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkforceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkforceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkforce");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkforceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkforceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @return Result of the UpdateWorkteam operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkteamResult updateWorkteam(UpdateWorkteamRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkteam(request);
    }

    @SdkInternalApi
    final UpdateWorkteamResult executeUpdateWorkteam(UpdateWorkteamRequest updateWorkteamRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkteamRequest> request = null;
        Response<UpdateWorkteamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkteamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkteamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkteam");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkteamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkteamResultJsonUnmarshaller());
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

    @Override
    public AmazonSageMakerWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonSageMakerWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
