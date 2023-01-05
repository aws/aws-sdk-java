/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently;

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

import com.amazonaws.services.cloudwatchevidently.AmazonCloudWatchEvidentlyClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudwatchevidently.model.*;
import com.amazonaws.services.cloudwatchevidently.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch Evidently. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * You can use Amazon CloudWatch Evidently to safely validate new features by serving them to a specified percentage of
 * your users while you roll out the feature. You can monitor the performance of the new feature to help you decide when
 * to ramp up traffic to your users. This helps you reduce risk and identify unintended consequences before you fully
 * launch the feature.
 * </p>
 * <p>
 * You can also conduct A/B experiments to make feature design decisions based on evidence and data. An experiment can
 * test as many as five variations at once. Evidently collects experiment data and analyzes it using statistical
 * methods. It also provides clear recommendations about which variations perform better. You can test both user-facing
 * features and backend features.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudWatchEvidentlyClient extends AmazonWebServiceClient implements AmazonCloudWatchEvidently {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudWatchEvidently.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "evidently";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchevidently.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudwatchevidently.model.AmazonCloudWatchEvidentlyException.class));

    public static AmazonCloudWatchEvidentlyClientBuilder builder() {
        return AmazonCloudWatchEvidentlyClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Evidently using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchEvidentlyClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Evidently using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchEvidentlyClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("evidently.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudwatchevidently/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudwatchevidently/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This operation assigns feature variation to user sessions. For each user session, you pass in an
     * <code>entityID</code> that represents the user. Evidently then checks the evaluation rules and assigns the
     * variation.
     * </p>
     * <p>
     * The first rules that are evaluated are the override rules. If the user's <code>entityID</code> matches an
     * override rule, the user is served the variation specified by that rule.
     * </p>
     * <p>
     * Next, if there is a launch of the feature, the user might be assigned to a variation in the launch. The chance of
     * this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch,
     * the variation they are served depends on the allocation of the various feature variations used for the launch.
     * </p>
     * <p>
     * If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be
     * assigned to a variation in the experiment. The chance of this depends on the percentage of users that are
     * allocated to that experiment. If the user is enrolled in the experiment, the variation they are served depends on
     * the allocation of the various feature variations used for the experiment.
     * </p>
     * <p>
     * If the user is not assigned to a launch or experiment, they are served the default variation.
     * </p>
     * 
     * @param batchEvaluateFeatureRequest
     * @return Result of the BatchEvaluateFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.BatchEvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/BatchEvaluateFeature" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchEvaluateFeatureResult batchEvaluateFeature(BatchEvaluateFeatureRequest request) {
        request = beforeClientExecution(request);
        return executeBatchEvaluateFeature(request);
    }

    @SdkInternalApi
    final BatchEvaluateFeatureResult executeBatchEvaluateFeature(BatchEvaluateFeatureRequest batchEvaluateFeatureRequest) {

        ExecutionContext executionContext = createExecutionContext(batchEvaluateFeatureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchEvaluateFeatureRequest> request = null;
        Response<BatchEvaluateFeatureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchEvaluateFeatureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchEvaluateFeatureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchEvaluateFeature");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "dataplane.";
                String resolvedHostPrefix = String.format("dataplane.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchEvaluateFeatureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchEvaluateFeatureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Evidently <i>experiment</i>. Before you create an experiment, you must create the feature to use for
     * the experiment.
     * </p>
     * <p>
     * An experiment helps you make feature design decisions based on evidence and data. An experiment can test as many
     * as five variations at once. Evidently collects experiment data and analyzes it by statistical methods, and
     * provides clear recommendations about which variations perform better.
     * </p>
     * <p>
     * You can optionally specify a <code>segment</code> to have the experiment consider only certain audience types in
     * the experiment, such as using only user sessions from a certain location or who use a certain internet browser.
     * </p>
     * <p>
     * Don't use this operation to update an existing experiment. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateExperiment.html"
     * >UpdateExperiment</a>.
     * </p>
     * 
     * @param createExperimentRequest
     * @return Result of the CreateExperiment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateExperiment" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Creates an Evidently <i>feature</i> that you want to launch or test. You can define up to five variations of a
     * feature, and use these variations in your launches and experiments. A feature must be created in a project. For
     * information about creating a project, see <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateProject.html"
     * >CreateProject</a>.
     * </p>
     * <p>
     * Don't use this operation to update an existing feature. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateFeature.html"
     * >UpdateFeature</a>.
     * </p>
     * 
     * @param createFeatureRequest
     * @return Result of the CreateFeature operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFeatureResult createFeature(CreateFeatureRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFeature(request);
    }

    @SdkInternalApi
    final CreateFeatureResult executeCreateFeature(CreateFeatureRequest createFeatureRequest) {

        ExecutionContext executionContext = createExecutionContext(createFeatureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFeatureRequest> request = null;
        Response<CreateFeatureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFeatureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFeatureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFeature");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFeatureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFeatureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <i>launch</i> of a given feature. Before you create a launch, you must create the feature to use for
     * the launch.
     * </p>
     * <p>
     * You can use a launch to safely validate new features by serving them to a specified percentage of your users
     * while you roll out the feature. You can monitor the performance of the new feature to help you decide when to
     * ramp up traffic to more users. This helps you reduce risk and identify unintended consequences before you fully
     * launch the feature.
     * </p>
     * <p>
     * Don't use this operation to update an existing launch. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateLaunch.html"
     * >UpdateLaunch</a>.
     * </p>
     * 
     * @param createLaunchRequest
     * @return Result of the CreateLaunch operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLaunchResult createLaunch(CreateLaunchRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLaunch(request);
    }

    @SdkInternalApi
    final CreateLaunchResult executeCreateLaunch(CreateLaunchRequest createLaunchRequest) {

        ExecutionContext executionContext = createExecutionContext(createLaunchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLaunchRequest> request = null;
        Response<CreateLaunchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLaunchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLaunchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLaunch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLaunchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLaunchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a project, which is the logical object in Evidently that can contain features, launches, and experiments.
     * Use projects to group similar features together.
     * </p>
     * <p>
     * To update an existing project, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateProject.html"
     * >UpdateProject</a>.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateProject" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Use this operation to define a <i>segment</i> of your audience. A segment is a portion of your audience that
     * share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser
     * users in Europe who also fit other criteria that your application collects, such as age.
     * </p>
     * <p>
     * Using a segment in an experiment limits that experiment to evaluate only the users who match the segment
     * criteria. Using one or more segments in a launch allows you to define different traffic splits for the different
     * audience segments.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For more information about segment pattern syntax, see &lt;a href=&quot;https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html&quot;&gt; Segment rule pattern syntax&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The pattern that you define for a segment is matched against the value of &lt;code&gt;evaluationContext&lt;/code&gt;, which is passed into Evidently in the &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html&quot;&gt;EvaluateFeature&lt;/a&gt; operation, when Evidently assigns a feature variation to a user.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param createSegmentRequest
     * @return Result of the CreateSegment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSegmentResult createSegment(CreateSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSegment(request);
    }

    @SdkInternalApi
    final CreateSegmentResult executeCreateSegment(CreateSegmentRequest createSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSegmentRequest> request = null;
        Response<CreateSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSegment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Evidently experiment. The feature used for the experiment is not deleted.
     * </p>
     * <p>
     * To stop an experiment without deleting it, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_StopExperiment.html"
     * >StopExperiment</a>.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @return Result of the DeleteExperiment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceUnavailableException
     *         The service was unavailable. Retry the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteExperiment" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Deletes an Evidently feature.
     * </p>
     * 
     * @param deleteFeatureRequest
     * @return Result of the DeleteFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteFeature" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFeatureResult deleteFeature(DeleteFeatureRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFeature(request);
    }

    @SdkInternalApi
    final DeleteFeatureResult executeDeleteFeature(DeleteFeatureRequest deleteFeatureRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFeatureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFeatureRequest> request = null;
        Response<DeleteFeatureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFeatureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFeatureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFeature");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFeatureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFeatureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Evidently launch. The feature used for the launch is not deleted.
     * </p>
     * <p>
     * To stop a launch without deleting it, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_StopLaunch.html">StopLaunch</a>.
     * </p>
     * 
     * @param deleteLaunchRequest
     * @return Result of the DeleteLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLaunchResult deleteLaunch(DeleteLaunchRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLaunch(request);
    }

    @SdkInternalApi
    final DeleteLaunchResult executeDeleteLaunch(DeleteLaunchRequest deleteLaunchRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLaunchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLaunchRequest> request = null;
        Response<DeleteLaunchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLaunchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLaunchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLaunch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLaunchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLaunchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Evidently project. Before you can delete a project, you must delete all the features that the project
     * contains. To delete a feature, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_DeleteFeature.html"
     * >DeleteFeature</a>.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteProject" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Deletes a segment. You can't delete a segment that is being used in a launch or experiment, even if that launch
     * or experiment is not currently running.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @return Result of the DeleteSegment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSegmentResult deleteSegment(DeleteSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSegment(request);
    }

    @SdkInternalApi
    final DeleteSegmentResult executeDeleteSegment(DeleteSegmentRequest deleteSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSegmentRequest> request = null;
        Response<DeleteSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSegment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation assigns a feature variation to one given user session. You pass in an <code>entityID</code> that
     * represents the user. Evidently then checks the evaluation rules and assigns the variation.
     * </p>
     * <p>
     * The first rules that are evaluated are the override rules. If the user's <code>entityID</code> matches an
     * override rule, the user is served the variation specified by that rule.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If there is a current launch with this feature that uses segment overrides, and if the user session's &lt;code&gt;evaluationContext&lt;/code&gt; matches a segment rule defined in a segment override, the configuration in the segment overrides is used. For more information about segments, see &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateSegment.html&quot;&gt;CreateSegment&lt;/a&gt; and &lt;a href=&quot;https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html&quot;&gt;Use segments to focus your audience&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If there is a launch with no segment overrides, the user might be assigned to a variation in the launch. The chance of this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch, the variation they are served depends on the allocation of the various feature variations used for the launch.&lt;/p&gt; &lt;p&gt;If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be assigned to a variation in the experiment. The chance of this depends on the percentage of users that are allocated to that experiment.&lt;/p&gt; &lt;p&gt;If the experiment uses a segment, then only user sessions with &lt;code&gt;evaluationContext&lt;/code&gt; values that match the segment rule are used in the experiment.&lt;/p&gt; &lt;p&gt;If the user is enrolled in the experiment, the variation they are served depends on the allocation of the various feature variations used for the experiment. &lt;/p&gt; &lt;p&gt;If the user is not assigned to a launch or experiment, they are served the default variation.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param evaluateFeatureRequest
     * @return Result of the EvaluateFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.EvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EvaluateFeatureResult evaluateFeature(EvaluateFeatureRequest request) {
        request = beforeClientExecution(request);
        return executeEvaluateFeature(request);
    }

    @SdkInternalApi
    final EvaluateFeatureResult executeEvaluateFeature(EvaluateFeatureRequest evaluateFeatureRequest) {

        ExecutionContext executionContext = createExecutionContext(evaluateFeatureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EvaluateFeatureRequest> request = null;
        Response<EvaluateFeatureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EvaluateFeatureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(evaluateFeatureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EvaluateFeature");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "dataplane.";
                String resolvedHostPrefix = String.format("dataplane.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EvaluateFeatureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EvaluateFeatureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details about one experiment. You must already know the experiment name. To retrieve a list of
     * experiments in your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListExperiments.html"
     * >ListExperiments</a>.
     * </p>
     * 
     * @param getExperimentRequest
     * @return Result of the GetExperiment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetExperimentResult getExperiment(GetExperimentRequest request) {
        request = beforeClientExecution(request);
        return executeGetExperiment(request);
    }

    @SdkInternalApi
    final GetExperimentResult executeGetExperiment(GetExperimentRequest getExperimentRequest) {

        ExecutionContext executionContext = createExecutionContext(getExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExperimentRequest> request = null;
        Response<GetExperimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExperimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExperimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExperiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExperimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExperimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the results of a running or completed experiment. No results are available until there have been 100
     * events for each variation and at least 10 minutes have passed since the start of the experiment. To increase the
     * statistical power, Evidently performs an additional offline p-value analysis at the end of the experiment.
     * Offline p-value analysis can detect statistical significance in some cases where the anytime p-values used during
     * the experiment do not find statistical significance.
     * </p>
     * <p>
     * Experiment results are available up to 63 days after the start of the experiment. They are not available after
     * that because of CloudWatch data retention policies.
     * </p>
     * 
     * @param getExperimentResultsRequest
     * @return Result of the GetExperimentResults operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetExperimentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperimentResults" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetExperimentResultsResult getExperimentResults(GetExperimentResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetExperimentResults(request);
    }

    @SdkInternalApi
    final GetExperimentResultsResult executeGetExperimentResults(GetExperimentResultsRequest getExperimentResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getExperimentResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExperimentResultsRequest> request = null;
        Response<GetExperimentResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExperimentResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExperimentResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExperimentResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExperimentResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExperimentResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details about one feature. You must already know the feature name. To retrieve a list of features in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListFeatures.html"
     * >ListFeatures</a>.
     * </p>
     * 
     * @param getFeatureRequest
     * @return Result of the GetFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetFeature" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFeatureResult getFeature(GetFeatureRequest request) {
        request = beforeClientExecution(request);
        return executeGetFeature(request);
    }

    @SdkInternalApi
    final GetFeatureResult executeGetFeature(GetFeatureRequest getFeatureRequest) {

        ExecutionContext executionContext = createExecutionContext(getFeatureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFeatureRequest> request = null;
        Response<GetFeatureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFeatureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFeatureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFeature");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFeatureResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFeatureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details about one launch. You must already know the launch name. To retrieve a list of launches in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListLaunches.html"
     * >ListLaunches</a>.
     * </p>
     * 
     * @param getLaunchRequest
     * @return Result of the GetLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLaunchResult getLaunch(GetLaunchRequest request) {
        request = beforeClientExecution(request);
        return executeGetLaunch(request);
    }

    @SdkInternalApi
    final GetLaunchResult executeGetLaunch(GetLaunchRequest getLaunchRequest) {

        ExecutionContext executionContext = createExecutionContext(getLaunchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLaunchRequest> request = null;
        Response<GetLaunchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLaunchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLaunchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLaunch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLaunchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLaunchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details about one launch. You must already know the project name. To retrieve a list of projects in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListProjects.html"
     * >ListProjects</a>.
     * </p>
     * 
     * @param getProjectRequest
     * @return Result of the GetProject operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProjectResult getProject(GetProjectRequest request) {
        request = beforeClientExecution(request);
        return executeGetProject(request);
    }

    @SdkInternalApi
    final GetProjectResult executeGetProject(GetProjectRequest getProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(getProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProjectRequest> request = null;
        Response<GetProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified segment. Specify the segment you want to view by specifying its ARN.
     * </p>
     * 
     * @param getSegmentRequest
     * @return Result of the GetSegment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSegmentResult getSegment(GetSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegment(request);
    }

    @SdkInternalApi
    final GetSegmentResult executeGetSegment(GetSegmentRequest getSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentRequest> request = null;
        Response<GetSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration details about all the experiments in the specified project.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return Result of the ListExperiments operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListExperiments" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Returns configuration details about all the features in the specified project.
     * </p>
     * 
     * @param listFeaturesRequest
     * @return Result of the ListFeatures operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListFeatures" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFeaturesResult listFeatures(ListFeaturesRequest request) {
        request = beforeClientExecution(request);
        return executeListFeatures(request);
    }

    @SdkInternalApi
    final ListFeaturesResult executeListFeatures(ListFeaturesRequest listFeaturesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFeaturesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFeaturesRequest> request = null;
        Response<ListFeaturesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFeaturesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFeaturesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFeatures");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFeaturesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFeaturesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration details about all the launches in the specified project.
     * </p>
     * 
     * @param listLaunchesRequest
     * @return Result of the ListLaunches operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListLaunches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListLaunches" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLaunchesResult listLaunches(ListLaunchesRequest request) {
        request = beforeClientExecution(request);
        return executeListLaunches(request);
    }

    @SdkInternalApi
    final ListLaunchesResult executeListLaunches(ListLaunchesRequest listLaunchesRequest) {

        ExecutionContext executionContext = createExecutionContext(listLaunchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLaunchesRequest> request = null;
        Response<ListLaunchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLaunchesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLaunchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLaunches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLaunchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLaunchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration details about all the projects in the current Region in your account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListProjects" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Use this operation to find which experiments or launches are using a specified segment.
     * </p>
     * 
     * @param listSegmentReferencesRequest
     * @return Result of the ListSegmentReferences operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListSegmentReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegmentReferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSegmentReferencesResult listSegmentReferences(ListSegmentReferencesRequest request) {
        request = beforeClientExecution(request);
        return executeListSegmentReferences(request);
    }

    @SdkInternalApi
    final ListSegmentReferencesResult executeListSegmentReferences(ListSegmentReferencesRequest listSegmentReferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSegmentReferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSegmentReferencesRequest> request = null;
        Response<ListSegmentReferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSegmentReferencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSegmentReferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSegmentReferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSegmentReferencesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListSegmentReferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of audience segments that you have created in your account in this Region.
     * </p>
     * 
     * @param listSegmentsRequest
     * @return Result of the ListSegments operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSegmentsResult listSegments(ListSegmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListSegments(request);
    }

    @SdkInternalApi
    final ListSegmentsResult executeListSegments(ListSegmentsRequest listSegmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSegmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSegmentsRequest> request = null;
        Response<ListSegmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSegmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSegmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSegments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSegmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSegmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with an Evidently resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AmazonCloudWatchEvidently.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Sends performance events to Evidently. These events can be used to evaluate a launch or an experiment.
     * </p>
     * 
     * @param putProjectEventsRequest
     * @return Result of the PutProjectEvents operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.PutProjectEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/PutProjectEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutProjectEventsResult putProjectEvents(PutProjectEventsRequest request) {
        request = beforeClientExecution(request);
        return executePutProjectEvents(request);
    }

    @SdkInternalApi
    final PutProjectEventsResult executePutProjectEvents(PutProjectEventsRequest putProjectEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(putProjectEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutProjectEventsRequest> request = null;
        Response<PutProjectEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutProjectEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putProjectEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutProjectEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "dataplane.";
                String resolvedHostPrefix = String.format("dataplane.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutProjectEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutProjectEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an existing experiment. To create an experiment, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateExperiment.html"
     * >CreateExperiment</a>.
     * </p>
     * 
     * @param startExperimentRequest
     * @return Result of the StartExperiment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StartExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartExperimentResult startExperiment(StartExperimentRequest request) {
        request = beforeClientExecution(request);
        return executeStartExperiment(request);
    }

    @SdkInternalApi
    final StartExperimentResult executeStartExperiment(StartExperimentRequest startExperimentRequest) {

        ExecutionContext executionContext = createExecutionContext(startExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartExperimentRequest> request = null;
        Response<StartExperimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartExperimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startExperimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartExperiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartExperimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartExperimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an existing launch. To create a launch, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateLaunch.html"
     * >CreateLaunch</a>.
     * </p>
     * 
     * @param startLaunchRequest
     * @return Result of the StartLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StartLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartLaunchResult startLaunch(StartLaunchRequest request) {
        request = beforeClientExecution(request);
        return executeStartLaunch(request);
    }

    @SdkInternalApi
    final StartLaunchResult executeStartLaunch(StartLaunchRequest startLaunchRequest) {

        ExecutionContext executionContext = createExecutionContext(startLaunchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLaunchRequest> request = null;
        Response<StartLaunchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLaunchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startLaunchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartLaunch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartLaunchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartLaunchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an experiment that is currently running. If you stop an experiment, you can't resume it or restart it.
     * </p>
     * 
     * @param stopExperimentRequest
     * @return Result of the StopExperiment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StopExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopExperimentResult stopExperiment(StopExperimentRequest request) {
        request = beforeClientExecution(request);
        return executeStopExperiment(request);
    }

    @SdkInternalApi
    final StopExperimentResult executeStopExperiment(StopExperimentRequest stopExperimentRequest) {

        ExecutionContext executionContext = createExecutionContext(stopExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopExperimentRequest> request = null;
        Response<StopExperimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopExperimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopExperimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopExperiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopExperimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopExperimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a launch that is currently running. After you stop a launch, you will not be able to resume it or restart
     * it. Also, it will not be evaluated as a rule for traffic allocation, and the traffic that was allocated to the
     * launch will instead be available to the feature's experiment, if there is one. Otherwise, all traffic will be
     * served the default variation after the launch is stopped.
     * </p>
     * 
     * @param stopLaunchRequest
     * @return Result of the StopLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StopLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopLaunchResult stopLaunch(StopLaunchRequest request) {
        request = beforeClientExecution(request);
        return executeStopLaunch(request);
    }

    @SdkInternalApi
    final StopLaunchResult executeStopLaunch(StopLaunchRequest stopLaunchRequest) {

        ExecutionContext executionContext = createExecutionContext(stopLaunchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopLaunchRequest> request = null;
        Response<StopLaunchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopLaunchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopLaunchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopLaunch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopLaunchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopLaunchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch Evidently resource. Projects, features,
     * launches, and experiments can be tagged.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AmazonCloudWatchEvidently.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to test a rules pattern that you plan to use to create an audience segment. For more
     * information about segments, see <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateSegment.html"
     * >CreateSegment</a>.
     * </p>
     * 
     * @param testSegmentPatternRequest
     * @return Result of the TestSegmentPattern operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.TestSegmentPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TestSegmentPattern" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TestSegmentPatternResult testSegmentPattern(TestSegmentPatternRequest request) {
        request = beforeClientExecution(request);
        return executeTestSegmentPattern(request);
    }

    @SdkInternalApi
    final TestSegmentPatternResult executeTestSegmentPattern(TestSegmentPatternRequest testSegmentPatternRequest) {

        ExecutionContext executionContext = createExecutionContext(testSegmentPatternRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestSegmentPatternRequest> request = null;
        Response<TestSegmentPatternResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestSegmentPatternRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testSegmentPatternRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestSegmentPattern");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestSegmentPatternResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestSegmentPatternResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AmazonCloudWatchEvidently.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Evidently experiment.
     * </p>
     * <p>
     * Don't use this operation to update an experiment's tag. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateExperimentRequest
     * @return Result of the UpdateExperiment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateExperiment" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Updates an existing feature.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing feature. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateFeatureRequest
     * @return Result of the UpdateFeature operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFeatureResult updateFeature(UpdateFeatureRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFeature(request);
    }

    @SdkInternalApi
    final UpdateFeatureResult executeUpdateFeature(UpdateFeatureRequest updateFeatureRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFeatureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFeatureRequest> request = null;
        Response<UpdateFeatureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFeatureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFeatureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFeature");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFeatureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFeatureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a launch of a given feature.
     * </p>
     * <p>
     * Don't use this operation to update the tags of an existing launch. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateLaunchRequest
     * @return Result of the UpdateLaunch operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLaunchResult updateLaunch(UpdateLaunchRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLaunch(request);
    }

    @SdkInternalApi
    final UpdateLaunchResult executeUpdateLaunch(UpdateLaunchRequest updateLaunchRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLaunchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLaunchRequest> request = null;
        Response<UpdateLaunchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLaunchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLaunchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLaunch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLaunchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLaunchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description of an existing project.
     * </p>
     * <p>
     * To create a new project, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateProject.html"
     * >CreateProject</a>.
     * </p>
     * <p>
     * Don't use this operation to update the data storage options of a project. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateProjectDataDelivery.html"
     * >UpdateProjectDataDelivery</a>.
     * </p>
     * <p>
     * Don't use this operation to update the tags of a project. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProject" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
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
     * Updates the data storage options for this project. If you store evaluation events, you an keep them and analyze
     * them on your own. If you choose not to store evaluation events, Evidently deletes them after using them to
     * produce metrics and other experiment results that you can view.
     * </p>
     * <p>
     * You can't specify both <code>cloudWatchLogs</code> and <code>s3Destination</code> in the same operation.
     * </p>
     * 
     * @param updateProjectDataDeliveryRequest
     * @return Result of the UpdateProjectDataDelivery operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateProjectDataDelivery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProjectDataDelivery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProjectDataDeliveryResult updateProjectDataDelivery(UpdateProjectDataDeliveryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProjectDataDelivery(request);
    }

    @SdkInternalApi
    final UpdateProjectDataDeliveryResult executeUpdateProjectDataDelivery(UpdateProjectDataDeliveryRequest updateProjectDataDeliveryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectDataDeliveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectDataDeliveryRequest> request = null;
        Response<UpdateProjectDataDeliveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectDataDeliveryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateProjectDataDeliveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Evidently");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProjectDataDelivery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectDataDeliveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateProjectDataDeliveryResultJsonUnmarshaller());
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
    public void shutdown() {
        super.shutdown();
    }

}
