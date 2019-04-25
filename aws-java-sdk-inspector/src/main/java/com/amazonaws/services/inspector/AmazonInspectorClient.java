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
package com.amazonaws.services.inspector;

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

import com.amazonaws.services.inspector.AmazonInspectorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.services.inspector.model.transform.*;

/**
 * Client for accessing Amazon Inspector. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"> Amazon Inspector User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonInspectorClient extends AmazonWebServiceClient implements AmazonInspector {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonInspector.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "inspector";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssessmentRunInProgressException").withModeledClass(
                                    com.amazonaws.services.inspector.model.AssessmentRunInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedFeatureException").withModeledClass(
                                    com.amazonaws.services.inspector.model.UnsupportedFeatureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.inspector.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceTemporarilyUnavailableException").withModeledClass(
                                    com.amazonaws.services.inspector.model.ServiceTemporarilyUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.inspector.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.inspector.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchEntityException").withModeledClass(
                                    com.amazonaws.services.inspector.model.NoSuchEntityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AgentsAlreadyRunningAssessmentException").withModeledClass(
                                    com.amazonaws.services.inspector.model.AgentsAlreadyRunningAssessmentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreviewGenerationInProgressException").withModeledClass(
                                    com.amazonaws.services.inspector.model.PreviewGenerationInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCrossAccountRoleException").withModeledClass(
                                    com.amazonaws.services.inspector.model.InvalidCrossAccountRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withModeledClass(
                                    com.amazonaws.services.inspector.model.InternalException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.inspector.model.AmazonInspectorException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector. A credentials provider chain will be used
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
     * @deprecated use {@link AmazonInspectorClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonInspectorClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonInspectorClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonInspectorClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonInspectorClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonInspectorClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonInspectorClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonInspectorClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonInspectorClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonInspectorClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonInspectorClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonInspectorClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonInspectorClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonInspectorClientBuilder builder() {
        return AmazonInspectorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonInspectorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonInspectorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://inspector.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/inspector/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/inspector/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
     * </p>
     * 
     * @param addAttributesToFindingsRequest
     * @return Result of the AddAttributesToFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.AddAttributesToFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AddAttributesToFindings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddAttributesToFindingsResult addAttributesToFindings(AddAttributesToFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeAddAttributesToFindings(request);
    }

    @SdkInternalApi
    final AddAttributesToFindingsResult executeAddAttributesToFindings(AddAttributesToFindingsRequest addAttributesToFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(addAttributesToFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddAttributesToFindingsRequest> request = null;
        Response<AddAttributesToFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddAttributesToFindingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addAttributesToFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddAttributesToFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddAttributesToFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddAttributesToFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new assessment target using the ARN of the resource group that is generated by
     * <a>CreateResourceGroup</a>. If resourceGroupArn is not specified, all EC2 instances in the current AWS account
     * and region are included in the assessment target. If the <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_slr.html">service-linked role</a> isn’t
     * already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access
     * to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS
     * account. You can run up to 500 concurrent agents per AWS account. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_applications.html"> Amazon Inspector
     * Assessment Targets</a>.
     * </p>
     * 
     * @param createAssessmentTargetRequest
     * @return Result of the CreateAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.CreateAssessmentTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateAssessmentTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAssessmentTargetResult createAssessmentTarget(CreateAssessmentTargetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssessmentTarget(request);
    }

    @SdkInternalApi
    final CreateAssessmentTargetResult executeCreateAssessmentTarget(CreateAssessmentTargetRequest createAssessmentTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentTargetRequest> request = null;
        Response<CreateAssessmentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssessmentTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssessmentTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssessmentTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target.
     * If the <a href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_slr.html">service-linked
     * role</a> isn’t already registered, this action also creates and registers a service-linked role to grant Amazon
     * Inspector access to AWS Services needed to perform security assessments.
     * </p>
     * 
     * @param createAssessmentTemplateRequest
     * @return Result of the CreateAssessmentTemplate operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.CreateAssessmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateAssessmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAssessmentTemplateResult createAssessmentTemplate(CreateAssessmentTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssessmentTemplate(request);
    }

    @SdkInternalApi
    final CreateAssessmentTemplateResult executeCreateAssessmentTemplate(CreateAssessmentTemplateRequest createAssessmentTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssessmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentTemplateRequest> request = null;
        Response<CreateAssessmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAssessmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssessmentTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssessmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssessmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview
     * lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment.
     * </p>
     * 
     * @param createExclusionsPreviewRequest
     * @return Result of the CreateExclusionsPreview operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PreviewGenerationInProgressException
     *         The request is rejected. The specified assessment template is currently generating an exclusions preview.
     * @throws InternalException
     *         Internal server error.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.CreateExclusionsPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateExclusionsPreview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateExclusionsPreviewResult createExclusionsPreview(CreateExclusionsPreviewRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExclusionsPreview(request);
    }

    @SdkInternalApi
    final CreateExclusionsPreviewResult executeCreateExclusionsPreview(CreateExclusionsPreviewRequest createExclusionsPreviewRequest) {

        ExecutionContext executionContext = createExecutionContext(createExclusionsPreviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExclusionsPreviewRequest> request = null;
        Response<CreateExclusionsPreviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExclusionsPreviewRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createExclusionsPreviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExclusionsPreview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExclusionsPreviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateExclusionsPreviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2
     * instances to be included in an Amazon Inspector assessment target. The created resource group is then used to
     * create an Amazon Inspector assessment target. For more information, see <a>CreateAssessmentTarget</a>.
     * </p>
     * 
     * @param createResourceGroupRequest
     * @return Result of the CreateResourceGroup operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.CreateResourceGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateResourceGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateResourceGroupResult createResourceGroup(CreateResourceGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResourceGroup(request);
    }

    @SdkInternalApi
    final CreateResourceGroupResult executeCreateResourceGroup(CreateResourceGroupRequest createResourceGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceGroupRequest> request = null;
        Response<CreateResourceGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResourceGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment run that is specified by the ARN of the assessment run.
     * </p>
     * 
     * @param deleteAssessmentRunRequest
     * @return Result of the DeleteAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.DeleteAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DeleteAssessmentRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAssessmentRunResult deleteAssessmentRun(DeleteAssessmentRunRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssessmentRun(request);
    }

    @SdkInternalApi
    final DeleteAssessmentRunResult executeDeleteAssessmentRun(DeleteAssessmentRunRequest deleteAssessmentRunRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentRunRequest> request = null;
        Response<DeleteAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssessmentRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * 
     * @param deleteAssessmentTargetRequest
     * @return Result of the DeleteAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.DeleteAssessmentTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DeleteAssessmentTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAssessmentTargetResult deleteAssessmentTarget(DeleteAssessmentTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssessmentTarget(request);
    }

    @SdkInternalApi
    final DeleteAssessmentTargetResult executeDeleteAssessmentTarget(DeleteAssessmentTargetRequest deleteAssessmentTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentTargetRequest> request = null;
        Response<DeleteAssessmentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssessmentTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssessmentTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment template that is specified by the ARN of the assessment template.
     * </p>
     * 
     * @param deleteAssessmentTemplateRequest
     * @return Result of the DeleteAssessmentTemplate operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.DeleteAssessmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DeleteAssessmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAssessmentTemplateResult deleteAssessmentTemplate(DeleteAssessmentTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssessmentTemplate(request);
    }

    @SdkInternalApi
    final DeleteAssessmentTemplateResult executeDeleteAssessmentTemplate(DeleteAssessmentTemplateRequest deleteAssessmentTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssessmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentTemplateRequest> request = null;
        Response<DeleteAssessmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAssessmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssessmentTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssessmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param describeAssessmentRunsRequest
     * @return Result of the DescribeAssessmentRuns operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeAssessmentRuns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAssessmentRunsResult describeAssessmentRuns(DescribeAssessmentRunsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssessmentRuns(request);
    }

    @SdkInternalApi
    final DescribeAssessmentRunsResult executeDescribeAssessmentRuns(DescribeAssessmentRunsRequest describeAssessmentRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssessmentRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentRunsRequest> request = null;
        Response<DescribeAssessmentRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssessmentRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssessmentRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssessmentRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssessmentRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment targets that are specified by the ARNs of the assessment targets.
     * </p>
     * 
     * @param describeAssessmentTargetsRequest
     * @return Result of the DescribeAssessmentTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeAssessmentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAssessmentTargetsResult describeAssessmentTargets(DescribeAssessmentTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssessmentTargets(request);
    }

    @SdkInternalApi
    final DescribeAssessmentTargetsResult executeDescribeAssessmentTargets(DescribeAssessmentTargetsRequest describeAssessmentTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssessmentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentTargetsRequest> request = null;
        Response<DescribeAssessmentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentTargetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAssessmentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssessmentTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssessmentTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssessmentTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment templates that are specified by the ARNs of the assessment templates.
     * </p>
     * 
     * @param describeAssessmentTemplatesRequest
     * @return Result of the DescribeAssessmentTemplates operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeAssessmentTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAssessmentTemplatesResult describeAssessmentTemplates(DescribeAssessmentTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssessmentTemplates(request);
    }

    @SdkInternalApi
    final DescribeAssessmentTemplatesResult executeDescribeAssessmentTemplates(DescribeAssessmentTemplatesRequest describeAssessmentTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssessmentTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentTemplatesRequest> request = null;
        Response<DescribeAssessmentTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAssessmentTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssessmentTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssessmentTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssessmentTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the IAM role that enables Amazon Inspector to access your AWS account.
     * </p>
     * 
     * @param describeCrossAccountAccessRoleRequest
     * @return Result of the DescribeCrossAccountAccessRole operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonInspector.DescribeCrossAccountAccessRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeCrossAccountAccessRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(DescribeCrossAccountAccessRoleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCrossAccountAccessRole(request);
    }

    @SdkInternalApi
    final DescribeCrossAccountAccessRoleResult executeDescribeCrossAccountAccessRole(DescribeCrossAccountAccessRoleRequest describeCrossAccountAccessRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCrossAccountAccessRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCrossAccountAccessRoleRequest> request = null;
        Response<DescribeCrossAccountAccessRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCrossAccountAccessRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCrossAccountAccessRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCrossAccountAccessRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCrossAccountAccessRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCrossAccountAccessRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the exclusions that are specified by the exclusions' ARNs.
     * </p>
     * 
     * @param describeExclusionsRequest
     * @return Result of the DescribeExclusions operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeExclusions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeExclusions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeExclusionsResult describeExclusions(DescribeExclusionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExclusions(request);
    }

    @SdkInternalApi
    final DescribeExclusionsResult executeDescribeExclusions(DescribeExclusionsRequest describeExclusionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExclusionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExclusionsRequest> request = null;
        Response<DescribeExclusionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExclusionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExclusionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExclusions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExclusionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExclusionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the findings that are specified by the ARNs of the findings.
     * </p>
     * 
     * @param describeFindingsRequest
     * @return Result of the DescribeFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFindingsResult describeFindings(DescribeFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFindings(request);
    }

    @SdkInternalApi
    final DescribeFindingsResult executeDescribeFindings(DescribeFindingsRequest describeFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFindingsRequest> request = null;
        Response<DescribeFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the resource groups that are specified by the ARNs of the resource groups.
     * </p>
     * 
     * @param describeResourceGroupsRequest
     * @return Result of the DescribeResourceGroups operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeResourceGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeResourceGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResourceGroupsResult describeResourceGroups(DescribeResourceGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourceGroups(request);
    }

    @SdkInternalApi
    final DescribeResourceGroupsResult executeDescribeResourceGroups(DescribeResourceGroupsRequest describeResourceGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceGroupsRequest> request = null;
        Response<DescribeResourceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeResourceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourceGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourceGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourceGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the rules packages that are specified by the ARNs of the rules packages.
     * </p>
     * 
     * @param describeRulesPackagesRequest
     * @return Result of the DescribeRulesPackages operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeRulesPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeRulesPackages"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRulesPackagesResult describeRulesPackages(DescribeRulesPackagesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRulesPackages(request);
    }

    @SdkInternalApi
    final DescribeRulesPackagesResult executeDescribeRulesPackages(DescribeRulesPackagesRequest describeRulesPackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRulesPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRulesPackagesRequest> request = null;
        Response<DescribeRulesPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRulesPackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRulesPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRulesPackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRulesPackagesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeRulesPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Produces an assessment report that includes detailed and comprehensive results of a specified assessment run.
     * </p>
     * 
     * @param getAssessmentReportRequest
     * @return Result of the GetAssessmentReport operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws UnsupportedFeatureException
     *         Used by the <a>GetAssessmentReport</a> API. The request was rejected because you tried to generate a
     *         report for an assessment run that existed before reporting was supported in Amazon Inspector. You can
     *         only generate reports for assessment runs that took place or will take place after generating reports in
     *         Amazon Inspector became available.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.GetAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetAssessmentReport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAssessmentReportResult getAssessmentReport(GetAssessmentReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssessmentReport(request);
    }

    @SdkInternalApi
    final GetAssessmentReportResult executeGetAssessmentReport(GetAssessmentReportRequest getAssessmentReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssessmentReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssessmentReportRequest> request = null;
        Response<GetAssessmentReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssessmentReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssessmentReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssessmentReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssessmentReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssessmentReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can
     * obtain the preview token by running the CreateExclusionsPreview API.
     * </p>
     * 
     * @param getExclusionsPreviewRequest
     * @return Result of the GetExclusionsPreview operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InternalException
     *         Internal server error.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.GetExclusionsPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetExclusionsPreview" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetExclusionsPreviewResult getExclusionsPreview(GetExclusionsPreviewRequest request) {
        request = beforeClientExecution(request);
        return executeGetExclusionsPreview(request);
    }

    @SdkInternalApi
    final GetExclusionsPreviewResult executeGetExclusionsPreview(GetExclusionsPreviewRequest getExclusionsPreviewRequest) {

        ExecutionContext executionContext = createExecutionContext(getExclusionsPreviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExclusionsPreviewRequest> request = null;
        Response<GetExclusionsPreviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExclusionsPreviewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExclusionsPreviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExclusionsPreview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExclusionsPreviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExclusionsPreviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Information about the data that is collected for the specified assessment run.
     * </p>
     * 
     * @param getTelemetryMetadataRequest
     * @return Result of the GetTelemetryMetadata operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.GetTelemetryMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetTelemetryMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTelemetryMetadataResult getTelemetryMetadata(GetTelemetryMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetTelemetryMetadata(request);
    }

    @SdkInternalApi
    final GetTelemetryMetadataResult executeGetTelemetryMetadata(GetTelemetryMetadataRequest getTelemetryMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getTelemetryMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTelemetryMetadataRequest> request = null;
        Response<GetTelemetryMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTelemetryMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTelemetryMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTelemetryMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTelemetryMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTelemetryMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param listAssessmentRunAgentsRequest
     * @return Result of the ListAssessmentRunAgents operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentRunAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListAssessmentRunAgents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssessmentRunAgentsResult listAssessmentRunAgents(ListAssessmentRunAgentsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentRunAgents(request);
    }

    @SdkInternalApi
    final ListAssessmentRunAgentsResult executeListAssessmentRunAgents(ListAssessmentRunAgentsRequest listAssessmentRunAgentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentRunAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentRunAgentsRequest> request = null;
        Response<ListAssessmentRunAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentRunAgentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssessmentRunAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentRunAgents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentRunAgentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssessmentRunAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the
     * assessment templates.
     * </p>
     * 
     * @param listAssessmentRunsRequest
     * @return Result of the ListAssessmentRuns operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListAssessmentRuns" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssessmentRunsResult listAssessmentRuns(ListAssessmentRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentRuns(request);
    }

    @SdkInternalApi
    final ListAssessmentRunsResult executeListAssessmentRuns(ListAssessmentRunsRequest listAssessmentRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentRunsRequest> request = null;
        Response<ListAssessmentRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssessmentRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets,
     * see <a href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_applications.html">Amazon Inspector
     * Assessment Targets</a>.
     * </p>
     * 
     * @param listAssessmentTargetsRequest
     * @return Result of the ListAssessmentTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.ListAssessmentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListAssessmentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssessmentTargetsResult listAssessmentTargets(ListAssessmentTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentTargets(request);
    }

    @SdkInternalApi
    final ListAssessmentTargetsResult executeListAssessmentTargets(ListAssessmentTargetsRequest listAssessmentTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentTargetsRequest> request = null;
        Response<ListAssessmentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentTargetsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAssessmentTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the
     * assessment targets.
     * </p>
     * 
     * @param listAssessmentTemplatesRequest
     * @return Result of the ListAssessmentTemplates operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListAssessmentTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentTemplates(request);
    }

    @SdkInternalApi
    final ListAssessmentTemplatesResult executeListAssessmentTemplates(ListAssessmentTemplatesRequest listAssessmentTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentTemplatesRequest> request = null;
        Response<ListAssessmentTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssessmentTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssessmentTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment
     * template. For more information, see <a>SubscribeToEvent</a> and <a>UnsubscribeFromEvent</a>.
     * </p>
     * 
     * @param listEventSubscriptionsRequest
     * @return Result of the ListEventSubscriptions operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEventSubscriptionsResult listEventSubscriptions(ListEventSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListEventSubscriptions(request);
    }

    @SdkInternalApi
    final ListEventSubscriptionsResult executeListEventSubscriptions(ListEventSubscriptionsRequest listEventSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventSubscriptionsRequest> request = null;
        Response<ListEventSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEventSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List exclusions that are generated by the assessment run.
     * </p>
     * 
     * @param listExclusionsRequest
     * @return Result of the ListExclusions operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListExclusions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListExclusions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExclusionsResult listExclusions(ListExclusionsRequest request) {
        request = beforeClientExecution(request);
        return executeListExclusions(request);
    }

    @SdkInternalApi
    final ListExclusionsResult executeListExclusions(ListExclusionsRequest listExclusionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExclusionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExclusionsRequest> request = null;
        Response<ListExclusionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExclusionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExclusionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExclusions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExclusionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExclusionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFindingsResult listFindings(ListFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeListFindings(request);
    }

    @SdkInternalApi
    final ListFindingsResult executeListFindings(ListFindingsRequest listFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsRequest> request = null;
        Response<ListFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available Amazon Inspector rules packages.
     * </p>
     * 
     * @param listRulesPackagesRequest
     * @return Result of the ListRulesPackages operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.ListRulesPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListRulesPackages" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRulesPackagesResult listRulesPackages(ListRulesPackagesRequest request) {
        request = beforeClientExecution(request);
        return executeListRulesPackages(request);
    }

    @SdkInternalApi
    final ListRulesPackagesResult executeListRulesPackages(ListRulesPackagesRequest listRulesPackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRulesPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesPackagesRequest> request = null;
        Response<ListRulesPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesPackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRulesPackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesPackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with an assessment template.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
     * </p>
     * 
     * @param previewAgentsRequest
     * @return Result of the PreviewAgents operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @sample AmazonInspector.PreviewAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/PreviewAgents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PreviewAgentsResult previewAgents(PreviewAgentsRequest request) {
        request = beforeClientExecution(request);
        return executePreviewAgents(request);
    }

    @SdkInternalApi
    final PreviewAgentsResult executePreviewAgents(PreviewAgentsRequest previewAgentsRequest) {

        ExecutionContext executionContext = createExecutionContext(previewAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PreviewAgentsRequest> request = null;
        Response<PreviewAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PreviewAgentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(previewAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PreviewAgents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PreviewAgentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PreviewAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     * assessments.
     * </p>
     * 
     * @param registerCrossAccountAccessRoleRequest
     * @return Result of the RegisterCrossAccountAccessRole operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.RegisterCrossAccountAccessRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/RegisterCrossAccountAccessRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterCrossAccountAccessRoleResult registerCrossAccountAccessRole(RegisterCrossAccountAccessRoleRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterCrossAccountAccessRole(request);
    }

    @SdkInternalApi
    final RegisterCrossAccountAccessRoleResult executeRegisterCrossAccountAccessRole(RegisterCrossAccountAccessRoleRequest registerCrossAccountAccessRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(registerCrossAccountAccessRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCrossAccountAccessRoleRequest> request = null;
        Response<RegisterCrossAccountAccessRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterCrossAccountAccessRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerCrossAccountAccessRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterCrossAccountAccessRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterCrossAccountAccessRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterCrossAccountAccessRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings
     * where an attribute with the specified key exists.
     * </p>
     * 
     * @param removeAttributesFromFindingsRequest
     * @return Result of the RemoveAttributesFromFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.RemoveAttributesFromFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/RemoveAttributesFromFindings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveAttributesFromFindingsResult removeAttributesFromFindings(RemoveAttributesFromFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveAttributesFromFindings(request);
    }

    @SdkInternalApi
    final RemoveAttributesFromFindingsResult executeRemoveAttributesFromFindings(RemoveAttributesFromFindingsRequest removeAttributesFromFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeAttributesFromFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAttributesFromFindingsRequest> request = null;
        Response<RemoveAttributesFromFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAttributesFromFindingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeAttributesFromFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveAttributesFromFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveAttributesFromFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveAttributesFromFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment
     * template.
     * </p>
     * 
     * @param setTagsForResourceRequest
     * @return Result of the SetTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.SetTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/SetTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeSetTagsForResource(request);
    }

    @SdkInternalApi
    final SetTagsForResourceResult executeSetTagsForResource(SetTagsForResourceRequest setTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(setTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTagsForResourceRequest> request = null;
        Response<SetTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you
     * must not exceed the limit of running up to 500 concurrent agents per AWS account.
     * </p>
     * 
     * @param startAssessmentRunRequest
     * @return Result of the StartAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @throws AgentsAlreadyRunningAssessmentException
     *         You started an assessment run, but one of the instances is already participating in another assessment
     *         run.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.StartAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/StartAssessmentRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartAssessmentRunResult startAssessmentRun(StartAssessmentRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartAssessmentRun(request);
    }

    @SdkInternalApi
    final StartAssessmentRunResult executeStartAssessmentRun(StartAssessmentRunRequest startAssessmentRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAssessmentRunRequest> request = null;
        Response<StartAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAssessmentRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAssessmentRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the assessment run that is specified by the ARN of the assessment run.
     * </p>
     * 
     * @param stopAssessmentRunRequest
     * @return Result of the StopAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.StopAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/StopAssessmentRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopAssessmentRunResult stopAssessmentRun(StopAssessmentRunRequest request) {
        request = beforeClientExecution(request);
        return executeStopAssessmentRun(request);
    }

    @SdkInternalApi
    final StopAssessmentRunResult executeStopAssessmentRun(StopAssessmentRunRequest stopAssessmentRunRequest) {

        ExecutionContext executionContext = createExecutionContext(stopAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAssessmentRunRequest> request = null;
        Response<StopAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAssessmentRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopAssessmentRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
     * a specified SNS topic.
     * </p>
     * 
     * @param subscribeToEventRequest
     * @return Result of the SubscribeToEvent operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.SubscribeToEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/SubscribeToEvent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SubscribeToEventResult subscribeToEvent(SubscribeToEventRequest request) {
        request = beforeClientExecution(request);
        return executeSubscribeToEvent(request);
    }

    @SdkInternalApi
    final SubscribeToEventResult executeSubscribeToEvent(SubscribeToEventRequest subscribeToEventRequest) {

        ExecutionContext executionContext = createExecutionContext(subscribeToEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeToEventRequest> request = null;
        Response<SubscribeToEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeToEventRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(subscribeToEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubscribeToEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubscribeToEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SubscribeToEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
     * a specified SNS topic.
     * </p>
     * 
     * @param unsubscribeFromEventRequest
     * @return Result of the UnsubscribeFromEvent operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.UnsubscribeFromEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/UnsubscribeFromEvent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UnsubscribeFromEventResult unsubscribeFromEvent(UnsubscribeFromEventRequest request) {
        request = beforeClientExecution(request);
        return executeUnsubscribeFromEvent(request);
    }

    @SdkInternalApi
    final UnsubscribeFromEventResult executeUnsubscribeFromEvent(UnsubscribeFromEventRequest unsubscribeFromEventRequest) {

        ExecutionContext executionContext = createExecutionContext(unsubscribeFromEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeFromEventRequest> request = null;
        Response<UnsubscribeFromEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeFromEventRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unsubscribeFromEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnsubscribeFromEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnsubscribeFromEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnsubscribeFromEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * <p>
     * If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the
     * assessment target.
     * </p>
     * 
     * @param updateAssessmentTargetRequest
     * @return Result of the UpdateAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws ServiceTemporarilyUnavailableException
     *         The serice is temporary unavailable.
     * @sample AmazonInspector.UpdateAssessmentTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/UpdateAssessmentTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssessmentTarget(request);
    }

    @SdkInternalApi
    final UpdateAssessmentTargetResult executeUpdateAssessmentTarget(UpdateAssessmentTargetRequest updateAssessmentTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentTargetRequest> request = null;
        Response<UpdateAssessmentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssessmentTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssessmentTargetResultJsonUnmarshaller());
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
