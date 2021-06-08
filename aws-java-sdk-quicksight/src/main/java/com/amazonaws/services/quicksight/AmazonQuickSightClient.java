/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight;

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

import com.amazonaws.services.quicksight.AmazonQuickSightClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.services.quicksight.model.transform.*;

/**
 * Client for accessing Amazon QuickSight. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon QuickSight API Reference</fullname>
 * <p>
 * Amazon QuickSight is a fully managed, serverless business intelligence service for the AWS Cloud that makes it easy
 * to extend data and insights to every user in your organization. This API reference contains documentation for a
 * programming interface that you can use to manage Amazon QuickSight.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonQuickSightClient extends AmazonWebServiceClient implements AmazonQuickSight {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonQuickSight.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "quicksight";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QuickSightUserNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.QuickSightUserNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdentityTypeNotSupportedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.IdentityTypeNotSupportedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SessionLifetimeInMinutesInvalidException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.SessionLifetimeInMinutesInvalidExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedPricingPlanException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.UnsupportedPricingPlanExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.ResourceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.ResourceExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DomainNotWhitelistedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.DomainNotWhitelistedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionNotMetException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.PreconditionNotMetExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentUpdatingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.ConcurrentUpdatingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedUserEditionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.quicksight.model.transform.UnsupportedUserEditionExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.quicksight.model.AmazonQuickSightException.class));

    public static AmazonQuickSightClientBuilder builder() {
        return AmazonQuickSightClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon QuickSight using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonQuickSightClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon QuickSight using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonQuickSightClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("quicksight.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/quicksight/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/quicksight/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels an ongoing ingestion of data into SPICE.
     * </p>
     * 
     * @param cancelIngestionRequest
     * @return Result of the CancelIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CancelIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CancelIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelIngestionResult cancelIngestion(CancelIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelIngestion(request);
    }

    @SdkInternalApi
    final CancelIngestionResult executeCancelIngestion(CancelIngestionRequest cancelIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelIngestionRequest> request = null;
        Response<CancelIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates Amazon QuickSight customizations the current AWS Region. Currently, you can add a custom default theme by
     * using the <code>CreateAccountCustomization</code> or <code>UpdateAccountCustomization</code> API operation. To
     * further customize QuickSight by removing QuickSight sample assets and videos for all new users, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/customizing-quicksight.html">Customizing QuickSight</a>
     * in the <i>Amazon QuickSight User Guide.</i>
     * </p>
     * <p>
     * You can create customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace
     * instead. Customizations that apply to a namespace always override customizations that apply to an AWS account. To
     * find out which customizations apply, use the <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * <p>
     * Before you use the <code>CreateAccountCustomization</code> API operation to add a theme as the namespace default,
     * make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme
     * isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the
     * current permissions by using the <code> <a>DescribeThemePermissions</a> </code> API operation. To share the
     * theme, grant permissions by using the <code> <a>UpdateThemePermissions</a> </code> API operation.
     * </p>
     * 
     * @param createAccountCustomizationRequest
     * @return Result of the CreateAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccountCustomizationResult createAccountCustomization(CreateAccountCustomizationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccountCustomization(request);
    }

    @SdkInternalApi
    final CreateAccountCustomizationResult executeCreateAccountCustomization(CreateAccountCustomizationRequest createAccountCustomizationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccountCustomizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccountCustomizationRequest> request = null;
        Response<CreateAccountCustomizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountCustomizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAccountCustomizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccountCustomization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccountCustomizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAccountCustomizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an analysis in Amazon QuickSight.
     * </p>
     * 
     * @param createAnalysisRequest
     * @return Result of the CreateAnalysis operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAnalysisResult createAnalysis(CreateAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAnalysis(request);
    }

    @SdkInternalApi
    final CreateAnalysisResult executeCreateAnalysis(CreateAnalysisRequest createAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(createAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAnalysisRequest> request = null;
        Response<CreateAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a dashboard from a template. To first create a template, see the <code> <a>CreateTemplate</a> </code> API
     * operation.
     * </p>
     * <p>
     * A dashboard is an entity in QuickSight that identifies QuickSight reports, created from analyses. You can share
     * QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. If you have
     * the correct permissions, you can create a dashboard from a template that exists in a different AWS account.
     * </p>
     * 
     * @param createDashboardRequest
     * @return Result of the CreateDashboard operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDashboardResult createDashboard(CreateDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDashboard(request);
    }

    @SdkInternalApi
    final CreateDashboardResult executeCreateDashboard(CreateDashboardRequest createDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(createDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDashboardRequest> request = null;
        Response<CreateDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a dataset.
     * </p>
     * 
     * @param createDataSetRequest
     * @return Result of the CreateDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataSetResult createDataSet(CreateDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSet(request);
    }

    @SdkInternalApi
    final CreateDataSetResult executeCreateDataSet(CreateDataSetRequest createDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSetRequest> request = null;
        Response<CreateDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDataSourceResult createDataSource(CreateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSource(request);
    }

    @SdkInternalApi
    final CreateDataSourceResult executeCreateDataSource(CreateDataSourceRequest createDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceRequest> request = null;
        Response<CreateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon QuickSight group.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
     * .
     * </p>
     * <p>
     * The response is a group object.
     * </p>
     * 
     * @param createGroupRequest
     *        The request object for this operation.
     * @return Result of the CreateGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroup(request);
    }

    @SdkInternalApi
    final CreateGroupResult executeCreateGroup(CreateGroupRequest createGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @return Result of the CreateGroupMembership operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGroupMembershipResult createGroupMembership(CreateGroupMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroupMembership(request);
    }

    @SdkInternalApi
    final CreateGroupMembershipResult executeCreateGroupMembership(CreateGroupMembershipRequest createGroupMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupMembershipRequest> request = null;
        Response<CreateGroupMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroupMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupMembershipResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateGroupMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy
     * assignment is attached to the specified groups or users of Amazon QuickSight. Assignment names are unique per AWS
     * account. To avoid overwriting rules in other namespaces, use assignment names that are unique.
     * </p>
     * 
     * @param createIAMPolicyAssignmentRequest
     * @return Result of the CreateIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIAMPolicyAssignmentResult createIAMPolicyAssignment(CreateIAMPolicyAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIAMPolicyAssignment(request);
    }

    @SdkInternalApi
    final CreateIAMPolicyAssignmentResult executeCreateIAMPolicyAssignment(CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIAMPolicyAssignmentRequest> request = null;
        Response<CreateIAMPolicyAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIAMPolicyAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createIAMPolicyAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIAMPolicyAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIAMPolicyAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIAMPolicyAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and starts a new SPICE ingestion on a dataset
     * </p>
     * <p>
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an
     * example, see <a href="http://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a> in the AWS Knowledge Center. Tags
     * are visible on the tagged dataset, but not on the ingestion resource.
     * </p>
     * 
     * @param createIngestionRequest
     * @return Result of the CreateIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIngestionResult createIngestion(CreateIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIngestion(request);
    }

    @SdkInternalApi
    final CreateIngestionResult executeCreateIngestion(CreateIngestionRequest createIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(createIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIngestionRequest> request = null;
        Response<CreateIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * (Enterprise edition only) Creates a new namespace for you to use with Amazon QuickSight.
     * </p>
     * <p>
     * A namespace allows you to isolate the QuickSight users and groups that are registered for that namespace. Users
     * that access the namespace can share assets only with other users or groups in the same namespace. They can't see
     * users and groups in other namespaces. You can create a namespace after your AWS account is subscribed to
     * QuickSight. The namespace must be unique within the AWS account. By default, there is a limit of 100 namespaces
     * per AWS account. To increase your limit, create a ticket with AWS Support.
     * </p>
     * 
     * @param createNamespaceRequest
     * @return Result of the CreateNamespace operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateNamespaceResult createNamespace(CreateNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNamespace(request);
    }

    @SdkInternalApi
    final CreateNamespaceResult executeCreateNamespace(CreateNamespaceRequest createNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNamespaceRequest> request = null;
        Response<CreateNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a template from an existing QuickSight analysis or template. You can use the resulting template to create
     * a dashboard.
     * </p>
     * <p>
     * A <i>template</i> is an entity in QuickSight that encapsulates the metadata required to create an analysis and
     * that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace
     * the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset
     * placeholders with datasets that follow the same schema that was used to create the source analysis and template.
     * </p>
     * 
     * @param createTemplateRequest
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTemplateResult createTemplate(CreateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTemplate(request);
    }

    @SdkInternalApi
    final CreateTemplateResult executeCreateTemplate(CreateTemplateRequest createTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateRequest> request = null;
        Response<CreateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a template alias for a template.
     * </p>
     * 
     * @param createTemplateAliasRequest
     * @return Result of the CreateTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTemplateAliasResult createTemplateAlias(CreateTemplateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTemplateAlias(request);
    }

    @SdkInternalApi
    final CreateTemplateAliasResult executeCreateTemplateAlias(CreateTemplateAliasRequest createTemplateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateAliasRequest> request = null;
        Response<CreateTemplateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTemplateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTemplateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTemplateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTemplateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a theme.
     * </p>
     * <p>
     * A <i>theme</i> is set of configuration options for color and layout. Themes apply to analyses and dashboards. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html">Using Themes in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param createThemeRequest
     * @return Result of the CreateTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateThemeResult createTheme(CreateThemeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTheme(request);
    }

    @SdkInternalApi
    final CreateThemeResult executeCreateTheme(CreateThemeRequest createThemeRequest) {

        ExecutionContext executionContext = createExecutionContext(createThemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThemeRequest> request = null;
        Response<CreateThemeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThemeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createThemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTheme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateThemeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateThemeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a theme alias for a theme.
     * </p>
     * 
     * @param createThemeAliasRequest
     * @return Result of the CreateThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateThemeAliasResult createThemeAlias(CreateThemeAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateThemeAlias(request);
    }

    @SdkInternalApi
    final CreateThemeAliasResult executeCreateThemeAlias(CreateThemeAliasRequest createThemeAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createThemeAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThemeAliasRequest> request = null;
        Response<CreateThemeAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThemeAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createThemeAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateThemeAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateThemeAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateThemeAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all Amazon QuickSight customizations in this AWS Region for the specified AWS account and QuickSight
     * namespace.
     * </p>
     * 
     * @param deleteAccountCustomizationRequest
     * @return Result of the DeleteAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccountCustomizationResult deleteAccountCustomization(DeleteAccountCustomizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountCustomization(request);
    }

    @SdkInternalApi
    final DeleteAccountCustomizationResult executeDeleteAccountCustomization(DeleteAccountCustomizationRequest deleteAccountCustomizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccountCustomizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountCustomizationRequest> request = null;
        Response<DeleteAccountCustomizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountCustomizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAccountCustomizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountCustomization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccountCustomizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAccountCustomizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can
     * restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. QuickSight
     * attaches a <code>DeletionTime</code> stamp to the response that specifies the end of the recovery window. At the
     * end of the recovery window, QuickSight deletes the analysis permanently.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use the <code>RestoreAnalysis</code> API operation to remove the
     * <code>DeletionTime</code> stamp and cancel the deletion of the analysis. The analysis remains visible in the API
     * until it's deleted, so you can describe it but you can't make a template from it.
     * </p>
     * <p>
     * An analysis that's scheduled for deletion isn't accessible in the QuickSight console. To access it in the
     * console, restore it. Deleting an analysis doesn't delete the dashboards that you publish from it.
     * </p>
     * 
     * @param deleteAnalysisRequest
     * @return Result of the DeleteAnalysis operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAnalysisResult deleteAnalysis(DeleteAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnalysis(request);
    }

    @SdkInternalApi
    final DeleteAnalysisResult executeDeleteAnalysis(DeleteAnalysisRequest deleteAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnalysisRequest> request = null;
        Response<DeleteAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dashboard.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return Result of the DeleteDashboard operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDashboardResult deleteDashboard(DeleteDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDashboard(request);
    }

    @SdkInternalApi
    final DeleteDashboardResult executeDeleteDashboard(DeleteDashboardRequest deleteDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDashboardRequest> request = null;
        Response<DeleteDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dataset.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @return Result of the DeleteDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDataSetResult deleteDataSet(DeleteDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataSet(request);
    }

    @SdkInternalApi
    final DeleteDataSetResult executeDeleteDataSet(DeleteDataSetRequest deleteDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSetRequest> request = null;
        Response<DeleteDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data
     * source.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataSource(request);
    }

    @SdkInternalApi
    final DeleteDataSourceResult executeDeleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSourceRequest> request = null;
        Response<DeleteDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a user group from Amazon QuickSight.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a user from a group so that the user is no longer a member of the group.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @return Result of the DeleteGroupMembership operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGroupMembershipResult deleteGroupMembership(DeleteGroupMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroupMembership(request);
    }

    @SdkInternalApi
    final DeleteGroupMembershipResult executeDeleteGroupMembership(DeleteGroupMembershipRequest deleteGroupMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupMembershipRequest> request = null;
        Response<DeleteGroupMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroupMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupMembershipResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteGroupMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing IAM policy assignment.
     * </p>
     * 
     * @param deleteIAMPolicyAssignmentRequest
     * @return Result of the DeleteIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIAMPolicyAssignmentResult deleteIAMPolicyAssignment(DeleteIAMPolicyAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIAMPolicyAssignment(request);
    }

    @SdkInternalApi
    final DeleteIAMPolicyAssignmentResult executeDeleteIAMPolicyAssignment(DeleteIAMPolicyAssignmentRequest deleteIAMPolicyAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIAMPolicyAssignmentRequest> request = null;
        Response<DeleteIAMPolicyAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIAMPolicyAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteIAMPolicyAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIAMPolicyAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIAMPolicyAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIAMPolicyAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous
     * process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these
     * assets, you use the API operations for the relevant asset.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNamespace(request);
    }

    @SdkInternalApi
    final DeleteNamespaceResult executeDeleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamespaceRequest> request = null;
        Response<DeleteNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a template.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return Result of the DeleteTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTemplateResult deleteTemplate(DeleteTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTemplate(request);
    }

    @SdkInternalApi
    final DeleteTemplateResult executeDeleteTemplate(DeleteTemplateRequest deleteTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateRequest> request = null;
        Response<DeleteTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the
     * version of the template that the alias points to.
     * </p>
     * 
     * @param deleteTemplateAliasRequest
     * @return Result of the DeleteTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTemplateAliasResult deleteTemplateAlias(DeleteTemplateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTemplateAlias(request);
    }

    @SdkInternalApi
    final DeleteTemplateAliasResult executeDeleteTemplateAlias(DeleteTemplateAliasRequest deleteTemplateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateAliasRequest> request = null;
        Response<DeleteTemplateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTemplateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTemplateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTemplateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTemplateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a theme.
     * </p>
     * 
     * @param deleteThemeRequest
     * @return Result of the DeleteTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTheme" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteThemeResult deleteTheme(DeleteThemeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTheme(request);
    }

    @SdkInternalApi
    final DeleteThemeResult executeDeleteTheme(DeleteThemeRequest deleteThemeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteThemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThemeRequest> request = null;
        Response<DeleteThemeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThemeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteThemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTheme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteThemeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteThemeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you
     * delete the version of the theme that the alias points to.
     * </p>
     * 
     * @param deleteThemeAliasRequest
     * @return Result of the DeleteThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteThemeAliasResult deleteThemeAlias(DeleteThemeAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteThemeAlias(request);
    }

    @SdkInternalApi
    final DeleteThemeAliasResult executeDeleteThemeAlias(DeleteThemeAliasRequest deleteThemeAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteThemeAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThemeAliasRequest> request = null;
        Response<DeleteThemeAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThemeAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteThemeAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteThemeAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteThemeAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteThemeAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management
     * (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user identified by its principal ID.
     * </p>
     * 
     * @param deleteUserByPrincipalIdRequest
     * @return Result of the DeleteUserByPrincipalId operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteUserByPrincipalId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUserByPrincipalId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserByPrincipalIdResult deleteUserByPrincipalId(DeleteUserByPrincipalIdRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserByPrincipalId(request);
    }

    @SdkInternalApi
    final DeleteUserByPrincipalIdResult executeDeleteUserByPrincipalId(DeleteUserByPrincipalIdRequest deleteUserByPrincipalIdRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserByPrincipalIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserByPrincipalIdRequest> request = null;
        Response<DeleteUserByPrincipalIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserByPrincipalIdRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteUserByPrincipalIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserByPrincipalId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserByPrincipalIdResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteUserByPrincipalIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the customizations associated with the provided AWS account and Amazon QuickSight namespace in an AWS
     * Region. The QuickSight console evaluates which customizations to apply by running this API operation with the
     * <code>Resolved</code> flag included.
     * </p>
     * <p>
     * To determine what customizations display when you run this command, it can help to visualize the relationship of
     * the entities involved.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS Account</code> - The AWS account exists at the top of the hierarchy. It has the potential to use all of
     * the AWS Regions and AWS Services. When you subscribe to QuickSight, you choose one AWS Region to use as your home
     * Region. That's where your free SPICE capacity is located. You can use QuickSight in any supported AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS Region</code> - In each AWS Region where you sign in to QuickSight at least once, QuickSight acts as a
     * separate instance of the same service. If you have a user directory, it resides in us-east-1, which is the US
     * East (N. Virginia). Generally speaking, these users have access to QuickSight in any AWS Region, unless they are
     * constrained to a namespace.
     * </p>
     * <p>
     * To run the command in a different AWS Region, you change your Region settings. If you're using the AWS CLI, you
     * can use one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-options.html">command line
     * options</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-profiles.html">named profiles</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Run <code>aws configure</code> to change your default AWS Region. Use Enter to key the same settings for your
     * keys. For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html">Configuring the AWS CLI</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code> - A QuickSight namespace is a partition that contains users and assets (data sources,
     * datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also
     * be part of the same namespace. People who share a namespace are completely isolated from users and assets in
     * other namespaces, even if they are in the same AWS account and AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Applied customizations</code> - Within an AWS Region, a set of QuickSight customizations can apply to an
     * AWS account or to a namespace. Settings that you apply to a namespace override settings that you apply to an AWS
     * account. All settings are isolated to a single AWS Region. To apply them in other AWS Regions, run the
     * <code>CreateAccountCustomization</code> command in each AWS Region where you want to apply the same
     * customizations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountCustomizationRequest
     * @return Result of the DescribeAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountCustomizationResult describeAccountCustomization(DescribeAccountCustomizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountCustomization(request);
    }

    @SdkInternalApi
    final DescribeAccountCustomizationResult executeDescribeAccountCustomization(DescribeAccountCustomizationRequest describeAccountCustomizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountCustomizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountCustomizationRequest> request = null;
        Response<DescribeAccountCustomizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountCustomizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountCustomizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountCustomization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountCustomizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountCustomizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the settings that were used when your QuickSight subscription was first created in this AWS account.
     * </p>
     * 
     * @param describeAccountSettingsRequest
     * @return Result of the DescribeAccountSettings operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountSettingsResult describeAccountSettings(DescribeAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountSettings(request);
    }

    @SdkInternalApi
    final DescribeAccountSettingsResult executeDescribeAccountSettings(DescribeAccountSettingsRequest describeAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountSettingsRequest> request = null;
        Response<DescribeAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a summary of the metadata for an analysis.
     * </p>
     * 
     * @param describeAnalysisRequest
     * @return Result of the DescribeAnalysis operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAnalysisResult describeAnalysis(DescribeAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAnalysis(request);
    }

    @SdkInternalApi
    final DescribeAnalysisResult executeDescribeAnalysis(DescribeAnalysisRequest describeAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnalysisRequest> request = null;
        Response<DescribeAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the read and write permissions for an analysis.
     * </p>
     * 
     * @param describeAnalysisPermissionsRequest
     * @return Result of the DescribeAnalysisPermissions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAnalysisPermissionsResult describeAnalysisPermissions(DescribeAnalysisPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAnalysisPermissions(request);
    }

    @SdkInternalApi
    final DescribeAnalysisPermissionsResult executeDescribeAnalysisPermissions(DescribeAnalysisPermissionsRequest describeAnalysisPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAnalysisPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnalysisPermissionsRequest> request = null;
        Response<DescribeAnalysisPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnalysisPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAnalysisPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAnalysisPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAnalysisPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAnalysisPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a summary for a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return Result of the DescribeDashboard operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDashboard(request);
    }

    @SdkInternalApi
    final DescribeDashboardResult executeDescribeDashboard(DescribeDashboardRequest describeDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDashboardRequest> request = null;
        Response<DescribeDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes read and write permissions for a dashboard.
     * </p>
     * 
     * @param describeDashboardPermissionsRequest
     * @return Result of the DescribeDashboardPermissions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDashboardPermissions(request);
    }

    @SdkInternalApi
    final DescribeDashboardPermissionsResult executeDescribeDashboardPermissions(DescribeDashboardPermissionsRequest describeDashboardPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDashboardPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDashboardPermissionsRequest> request = null;
        Response<DescribeDashboardPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDashboardPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDashboardPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDashboardPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDashboardPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDashboardPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a dataset.
     * </p>
     * 
     * @param describeDataSetRequest
     * @return Result of the DescribeDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDataSetResult describeDataSet(DescribeDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataSet(request);
    }

    @SdkInternalApi
    final DescribeDataSetResult executeDescribeDataSet(DescribeDataSetRequest describeDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSetRequest> request = null;
        Response<DescribeDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param describeDataSetPermissionsRequest
     * @return Result of the DescribeDataSetPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDataSetPermissionsResult describeDataSetPermissions(DescribeDataSetPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataSetPermissions(request);
    }

    @SdkInternalApi
    final DescribeDataSetPermissionsResult executeDescribeDataSetPermissions(DescribeDataSetPermissionsRequest describeDataSetPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataSetPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSetPermissionsRequest> request = null;
        Response<DescribeDataSetPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSetPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDataSetPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataSetPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataSetPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDataSetPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return Result of the DescribeDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDataSourceResult describeDataSource(DescribeDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataSource(request);
    }

    @SdkInternalApi
    final DescribeDataSourceResult executeDescribeDataSource(DescribeDataSourceRequest describeDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSourceRequest> request = null;
        Response<DescribeDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the resource permissions for a data source.
     * </p>
     * 
     * @param describeDataSourcePermissionsRequest
     * @return Result of the DescribeDataSourcePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDataSourcePermissionsResult describeDataSourcePermissions(DescribeDataSourcePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataSourcePermissions(request);
    }

    @SdkInternalApi
    final DescribeDataSourcePermissionsResult executeDescribeDataSourcePermissions(DescribeDataSourcePermissionsRequest describeDataSourcePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataSourcePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSourcePermissionsRequest> request = null;
        Response<DescribeDataSourcePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSourcePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDataSourcePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataSourcePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataSourcePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDataSourcePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeGroupRequest
     * @return Result of the DescribeGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeGroupResult describeGroup(DescribeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGroup(request);
    }

    @SdkInternalApi
    final DescribeGroupResult executeDescribeGroup(DescribeGroupRequest describeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGroupRequest> request = null;
        Response<DescribeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing IAM policy assignment, as specified by the assignment name.
     * </p>
     * 
     * @param describeIAMPolicyAssignmentRequest
     * @return Result of the DescribeIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeIAMPolicyAssignmentResult describeIAMPolicyAssignment(DescribeIAMPolicyAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIAMPolicyAssignment(request);
    }

    @SdkInternalApi
    final DescribeIAMPolicyAssignmentResult executeDescribeIAMPolicyAssignment(DescribeIAMPolicyAssignmentRequest describeIAMPolicyAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIAMPolicyAssignmentRequest> request = null;
        Response<DescribeIAMPolicyAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIAMPolicyAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeIAMPolicyAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIAMPolicyAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIAMPolicyAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeIAMPolicyAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a SPICE ingestion.
     * </p>
     * 
     * @param describeIngestionRequest
     * @return Result of the DescribeIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIngestion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeIngestionResult describeIngestion(DescribeIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIngestion(request);
    }

    @SdkInternalApi
    final DescribeIngestionResult executeDescribeIngestion(DescribeIngestionRequest describeIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIngestionRequest> request = null;
        Response<DescribeIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current namespace.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @return Result of the DescribeNamespace operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeNamespaceResult describeNamespace(DescribeNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNamespace(request);
    }

    @SdkInternalApi
    final DescribeNamespaceResult executeDescribeNamespace(DescribeNamespaceRequest describeNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNamespaceRequest> request = null;
        Response<DescribeNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a template's metadata.
     * </p>
     * 
     * @param describeTemplateRequest
     * @return Result of the DescribeTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTemplateResult describeTemplate(DescribeTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTemplate(request);
    }

    @SdkInternalApi
    final DescribeTemplateResult executeDescribeTemplate(DescribeTemplateRequest describeTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTemplateRequest> request = null;
        Response<DescribeTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the template alias for a template.
     * </p>
     * 
     * @param describeTemplateAliasRequest
     * @return Result of the DescribeTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTemplateAliasResult describeTemplateAlias(DescribeTemplateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTemplateAlias(request);
    }

    @SdkInternalApi
    final DescribeTemplateAliasResult executeDescribeTemplateAlias(DescribeTemplateAliasRequest describeTemplateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTemplateAliasRequest> request = null;
        Response<DescribeTemplateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTemplateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTemplateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTemplateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTemplateAliasResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeTemplateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes read and write permissions on a template.
     * </p>
     * 
     * @param describeTemplatePermissionsRequest
     * @return Result of the DescribeTemplatePermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTemplatePermissionsResult describeTemplatePermissions(DescribeTemplatePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTemplatePermissions(request);
    }

    @SdkInternalApi
    final DescribeTemplatePermissionsResult executeDescribeTemplatePermissions(DescribeTemplatePermissionsRequest describeTemplatePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTemplatePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTemplatePermissionsRequest> request = null;
        Response<DescribeTemplatePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTemplatePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTemplatePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTemplatePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTemplatePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTemplatePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a theme.
     * </p>
     * 
     * @param describeThemeRequest
     * @return Result of the DescribeTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTheme" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeThemeResult describeTheme(DescribeThemeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTheme(request);
    }

    @SdkInternalApi
    final DescribeThemeResult executeDescribeTheme(DescribeThemeRequest describeThemeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThemeRequest> request = null;
        Response<DescribeThemeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThemeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeThemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTheme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThemeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeThemeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the alias for a theme.
     * </p>
     * 
     * @param describeThemeAliasRequest
     * @return Result of the DescribeThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeThemeAliasResult describeThemeAlias(DescribeThemeAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeThemeAlias(request);
    }

    @SdkInternalApi
    final DescribeThemeAliasResult executeDescribeThemeAlias(DescribeThemeAliasRequest describeThemeAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThemeAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThemeAliasRequest> request = null;
        Response<DescribeThemeAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThemeAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeThemeAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeThemeAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThemeAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeThemeAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the read and write permissions for a theme.
     * </p>
     * 
     * @param describeThemePermissionsRequest
     * @return Result of the DescribeThemePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeThemePermissionsResult describeThemePermissions(DescribeThemePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeThemePermissions(request);
    }

    @SdkInternalApi
    final DescribeThemePermissionsResult executeDescribeThemePermissions(DescribeThemePermissionsRequest describeThemePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThemePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThemePermissionsRequest> request = null;
        Response<DescribeThemePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThemePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeThemePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeThemePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThemePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeThemePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a user, given the user name.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUserResult describeUser(DescribeUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUser(request);
    }

    @SdkInternalApi
    final DescribeUserResult executeDescribeUser(DescribeUserRequest describeUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a session URL and authorization code that you can use to embed an Amazon QuickSight read-only dashboard
     * in your web server code. Before you use this command, make sure that you have configured the dashboards and
     * permissions.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the server, not from the user's browser. The
     * following rules apply to the combination of URL and authorization code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * They must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * They can be used one time only.
     * </p>
     * </li>
     * <li>
     * <p>
     * They are valid for 5 minutes after you run this command.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resulting user session is valid for 10 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics.html">Embedded Analytics</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param getDashboardEmbedUrlRequest
     * @return Result of the GetDashboardEmbedUrl operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws DomainNotWhitelistedException
     *         The domain specified isn't on the allow list. All domains for embedded dashboards must be added to the
     *         approved list by an Amazon QuickSight admin.
     * @throws QuickSightUserNotFoundException
     *         The user with the provided name isn't found. This error can happen in any operation that requires finding
     *         a user based on a provided user name, such as <code>DeleteUser</code>, <code>DescribeUser</code>, and so
     *         on.
     * @throws IdentityTypeNotSupportedException
     *         The identity type specified isn't supported. Supported identity types include <code>IAM</code> and
     *         <code>QUICKSIGHT</code>.
     * @throws SessionLifetimeInMinutesInvalidException
     *         The number of minutes specified for the lifetime of a session isn't valid. The session lifetime must be
     *         15-600 minutes.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws UnsupportedPricingPlanException
     *         This error indicates that you are calling an embedding operation in Amazon QuickSight without the
     *         required pricing plan on your AWS account. Before you can use embedding for anonymous users, a QuickSight
     *         administrator needs to add capacity pricing to QuickSight. You can do this on the <b>Manage
     *         QuickSight</b> page. </p>
     *         <p>
     *         After capacity pricing is added, you can use the <a>GetDashboardEmbedUrl</a> API operation with the
     *         <code>--identity-type ANONYMOUS</code> option.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.GetDashboardEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetDashboardEmbedUrl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDashboardEmbedUrlResult getDashboardEmbedUrl(GetDashboardEmbedUrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetDashboardEmbedUrl(request);
    }

    @SdkInternalApi
    final GetDashboardEmbedUrlResult executeGetDashboardEmbedUrl(GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getDashboardEmbedUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDashboardEmbedUrlRequest> request = null;
        Response<GetDashboardEmbedUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDashboardEmbedUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDashboardEmbedUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDashboardEmbedUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDashboardEmbedUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDashboardEmbedUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a session URL and authorization code that you can use to embed the Amazon QuickSight console in your
     * web server code. Use <code>GetSessionEmbedUrl</code> where you want to provide an authoring portal that allows
     * users to create data sources, datasets, analyses, and dashboards. The users who access an embedded QuickSight
     * console need belong to the author or admin security cohort. If you want to restrict permissions to some of these
     * features, add a custom permissions profile to the user with the <code> <a>UpdateUser</a> </code> API operation.
     * Use <code> <a>RegisterUser</a> </code> API operation to add a new user with a custom permission profile attached.
     * For more information, see the following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-the-quicksight-console.html">Embedding the
     * Amazon QuickSight Console</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getSessionEmbedUrlRequest
     * @return Result of the GetSessionEmbedUrl operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws QuickSightUserNotFoundException
     *         The user with the provided name isn't found. This error can happen in any operation that requires finding
     *         a user based on a provided user name, such as <code>DeleteUser</code>, <code>DescribeUser</code>, and so
     *         on.
     * @throws SessionLifetimeInMinutesInvalidException
     *         The number of minutes specified for the lifetime of a session isn't valid. The session lifetime must be
     *         15-600 minutes.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.GetSessionEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetSessionEmbedUrl" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSessionEmbedUrlResult getSessionEmbedUrl(GetSessionEmbedUrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetSessionEmbedUrl(request);
    }

    @SdkInternalApi
    final GetSessionEmbedUrlResult executeGetSessionEmbedUrl(GetSessionEmbedUrlRequest getSessionEmbedUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionEmbedUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionEmbedUrlRequest> request = null;
        Response<GetSessionEmbedUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionEmbedUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSessionEmbedUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSessionEmbedUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSessionEmbedUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSessionEmbedUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon QuickSight analyses that exist in the specified AWS account.
     * </p>
     * 
     * @param listAnalysesRequest
     * @return Result of the ListAnalyses operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAnalysesResult listAnalyses(ListAnalysesRequest request) {
        request = beforeClientExecution(request);
        return executeListAnalyses(request);
    }

    @SdkInternalApi
    final ListAnalysesResult executeListAnalyses(ListAnalysesRequest listAnalysesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnalysesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnalysesRequest> request = null;
        Response<ListAnalysesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnalysesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnalysesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnalyses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnalysesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAnalysesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the versions of the dashboards in the QuickSight subscription.
     * </p>
     * 
     * @param listDashboardVersionsRequest
     * @return Result of the ListDashboardVersions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDashboardVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboardVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDashboardVersionsResult listDashboardVersions(ListDashboardVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDashboardVersions(request);
    }

    @SdkInternalApi
    final ListDashboardVersionsResult executeListDashboardVersions(ListDashboardVersionsRequest listDashboardVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDashboardVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDashboardVersionsRequest> request = null;
        Response<ListDashboardVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDashboardVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDashboardVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDashboardVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDashboardVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDashboardVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists dashboards in an AWS account.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return Result of the ListDashboards operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDashboardsResult listDashboards(ListDashboardsRequest request) {
        request = beforeClientExecution(request);
        return executeListDashboards(request);
    }

    @SdkInternalApi
    final ListDashboardsResult executeListDashboards(ListDashboardsRequest listDashboardsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDashboardsRequest> request = null;
        Response<ListDashboardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDashboardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDashboardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDashboards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDashboardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDashboardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the datasets belonging to the current AWS account in an AWS Region.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return Result of the ListDataSets operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataSetsResult listDataSets(ListDataSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSets(request);
    }

    @SdkInternalApi
    final ListDataSetsResult executeListDataSets(ListDataSetsRequest listDataSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSetsRequest> request = null;
        Response<ListDataSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists data sources in current AWS Region that belong to this AWS account.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataSourcesResult listDataSources(ListDataSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSources(request);
    }

    @SdkInternalApi
    final ListDataSourcesResult executeListDataSources(ListDataSourcesRequest listDataSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourcesRequest> request = null;
        Response<ListDataSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists member users in a group.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @return Result of the ListGroupMemberships operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGroupMembershipsResult listGroupMemberships(ListGroupMembershipsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupMemberships(request);
    }

    @SdkInternalApi
    final ListGroupMembershipsResult executeListGroupMemberships(ListGroupMembershipsRequest listGroupMembershipsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupMembershipsRequest> request = null;
        Response<ListGroupMembershipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupMembershipsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupMembershipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupMemberships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupMembershipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupMembershipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all user groups in Amazon QuickSight.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroups(request);
    }

    @SdkInternalApi
    final ListGroupsResult executeListGroups(ListGroupsRequest listGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists IAM policy assignments in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsRequest
     * @return Result of the ListIAMPolicyAssignments operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListIAMPolicyAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIAMPolicyAssignmentsResult listIAMPolicyAssignments(ListIAMPolicyAssignmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListIAMPolicyAssignments(request);
    }

    @SdkInternalApi
    final ListIAMPolicyAssignmentsResult executeListIAMPolicyAssignments(ListIAMPolicyAssignmentsRequest listIAMPolicyAssignmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIAMPolicyAssignmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIAMPolicyAssignmentsRequest> request = null;
        Response<ListIAMPolicyAssignmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIAMPolicyAssignmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listIAMPolicyAssignmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIAMPolicyAssignments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIAMPolicyAssignmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListIAMPolicyAssignmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to
     * the specified user and group or groups that the user belongs to.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsForUserRequest
     * @return Result of the ListIAMPolicyAssignmentsForUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListIAMPolicyAssignmentsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignmentsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIAMPolicyAssignmentsForUserResult listIAMPolicyAssignmentsForUser(ListIAMPolicyAssignmentsForUserRequest request) {
        request = beforeClientExecution(request);
        return executeListIAMPolicyAssignmentsForUser(request);
    }

    @SdkInternalApi
    final ListIAMPolicyAssignmentsForUserResult executeListIAMPolicyAssignmentsForUser(
            ListIAMPolicyAssignmentsForUserRequest listIAMPolicyAssignmentsForUserRequest) {

        ExecutionContext executionContext = createExecutionContext(listIAMPolicyAssignmentsForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIAMPolicyAssignmentsForUserRequest> request = null;
        Response<ListIAMPolicyAssignmentsForUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIAMPolicyAssignmentsForUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listIAMPolicyAssignmentsForUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIAMPolicyAssignmentsForUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIAMPolicyAssignmentsForUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListIAMPolicyAssignmentsForUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the history of SPICE ingestions for a dataset.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return Result of the ListIngestions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIngestionsResult listIngestions(ListIngestionsRequest request) {
        request = beforeClientExecution(request);
        return executeListIngestions(request);
    }

    @SdkInternalApi
    final ListIngestionsResult executeListIngestions(ListIngestionsRequest listIngestionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIngestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIngestionsRequest> request = null;
        Response<ListIngestionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIngestionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIngestionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIngestions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIngestionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIngestionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the namespaces for the specified AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return Result of the ListNamespaces operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListNamespaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListNamespacesResult listNamespaces(ListNamespacesRequest request) {
        request = beforeClientExecution(request);
        return executeListNamespaces(request);
    }

    @SdkInternalApi
    final ListNamespacesResult executeListNamespaces(ListNamespacesRequest listNamespacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNamespacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamespacesRequest> request = null;
        Response<ListNamespacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamespacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNamespacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNamespaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNamespacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNamespacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
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
     * Lists all the aliases of a template.
     * </p>
     * 
     * @param listTemplateAliasesRequest
     * @return Result of the ListTemplateAliases operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTemplateAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTemplateAliasesResult listTemplateAliases(ListTemplateAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateAliases(request);
    }

    @SdkInternalApi
    final ListTemplateAliasesResult executeListTemplateAliases(ListTemplateAliasesRequest listTemplateAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateAliasesRequest> request = null;
        Response<ListTemplateAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplateAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplateAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the versions of the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @return Result of the ListTemplateVersions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTemplateVersionsResult listTemplateVersions(ListTemplateVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateVersions(request);
    }

    @SdkInternalApi
    final ListTemplateVersionsResult executeListTemplateVersions(ListTemplateVersionsRequest listTemplateVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateVersionsRequest> request = null;
        Response<ListTemplateVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplateVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplateVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTemplatesResult listTemplates(ListTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplates(request);
    }

    @SdkInternalApi
    final ListTemplatesResult executeListTemplates(ListTemplatesRequest listTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplatesRequest> request = null;
        Response<ListTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the aliases of a theme.
     * </p>
     * 
     * @param listThemeAliasesRequest
     * @return Result of the ListThemeAliases operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListThemeAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListThemeAliasesResult listThemeAliases(ListThemeAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListThemeAliases(request);
    }

    @SdkInternalApi
    final ListThemeAliasesResult executeListThemeAliases(ListThemeAliasesRequest listThemeAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listThemeAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThemeAliasesRequest> request = null;
        Response<ListThemeAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThemeAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThemeAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThemeAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThemeAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThemeAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the versions of the themes in the current AWS account.
     * </p>
     * 
     * @param listThemeVersionsRequest
     * @return Result of the ListThemeVersions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListThemeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListThemeVersionsResult listThemeVersions(ListThemeVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListThemeVersions(request);
    }

    @SdkInternalApi
    final ListThemeVersionsResult executeListThemeVersions(ListThemeVersionsRequest listThemeVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listThemeVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThemeVersionsRequest> request = null;
        Response<ListThemeVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThemeVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThemeVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThemeVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThemeVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThemeVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the themes in the current AWS account.
     * </p>
     * 
     * @param listThemesRequest
     * @return Result of the ListThemes operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListThemesResult listThemes(ListThemesRequest request) {
        request = beforeClientExecution(request);
        return executeListThemes(request);
    }

    @SdkInternalApi
    final ListThemesResult executeListThemes(ListThemesRequest listThemesRequest) {

        ExecutionContext executionContext = createExecutionContext(listThemesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThemesRequest> request = null;
        Response<ListThemesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThemesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThemesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThemes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThemesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThemesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
     * </p>
     * 
     * @param listUserGroupsRequest
     * @return Result of the ListUserGroups operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListUserGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUserGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUserGroupsResult listUserGroups(ListUserGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserGroups(request);
    }

    @SdkInternalApi
    final ListUserGroupsResult executeListUserGroups(ListUserGroupsRequest listUserGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserGroupsRequest> request = null;
        Response<ListUserGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all of the Amazon QuickSight users belonging to this account.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListUsers(request);
    }

    @SdkInternalApi
    final ListUsersResult executeListUsers(ListUsersRequest listUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM)
     * identity or role specified in the request.
     * </p>
     * 
     * @param registerUserRequest
     * @return Result of the RegisterUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.RegisterUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisterUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RegisterUserResult registerUser(RegisterUserRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterUser(request);
    }

    @SdkInternalApi
    final RegisterUserResult executeRegisterUser(RegisterUserRequest registerUserRequest) {

        ExecutionContext executionContext = createExecutionContext(registerUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterUserRequest> request = null;
        Response<RegisterUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores an analysis.
     * </p>
     * 
     * @param restoreAnalysisRequest
     * @return Result of the RestoreAnalysis operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.RestoreAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RestoreAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RestoreAnalysisResult restoreAnalysis(RestoreAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreAnalysis(request);
    }

    @SdkInternalApi
    final RestoreAnalysisResult executeRestoreAnalysis(RestoreAnalysisRequest restoreAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreAnalysisRequest> request = null;
        Response<RestoreAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for analyses that belong to the user specified in the filter.
     * </p>
     * 
     * @param searchAnalysesRequest
     * @return Result of the SearchAnalyses operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.SearchAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchAnalysesResult searchAnalyses(SearchAnalysesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchAnalyses(request);
    }

    @SdkInternalApi
    final SearchAnalysesResult executeSearchAnalyses(SearchAnalysesRequest searchAnalysesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchAnalysesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAnalysesRequest> request = null;
        Response<SearchAnalysesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAnalysesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchAnalysesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchAnalyses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchAnalysesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchAnalysesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for dashboards that belong to a user.
     * </p>
     * 
     * @param searchDashboardsRequest
     * @return Result of the SearchDashboards operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.SearchDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDashboards" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchDashboardsResult searchDashboards(SearchDashboardsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchDashboards(request);
    }

    @SdkInternalApi
    final SearchDashboardsResult executeSearchDashboards(SearchDashboardsRequest searchDashboardsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchDashboardsRequest> request = null;
        Response<SearchDashboardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchDashboardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchDashboardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchDashboards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchDashboardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchDashboardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified QuickSight resource.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values. You can use the
     * <code>TagResource</code> operation with a resource that already has tags. If you specify a new tag key for the
     * resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is
     * already associated with the resource, the new tag value that you specify replaces the previous value for that
     * tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource. QuickSight supports tagging on data set, data source,
     * dashboard, and template.
     * </p>
     * <p>
     * Tagging for QuickSight works in a similar way to tagging for other AWS services, except for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use tags to track AWS costs for QuickSight. This restriction is because QuickSight costs are based on
     * users and SPICE capacity, which aren't taggable resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
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
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
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
     * Updates Amazon QuickSight customizations the current AWS Region. Currently, the only customization you can use is
     * a theme.
     * </p>
     * <p>
     * You can use customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace
     * instead. Customizations that apply to a namespace override customizations that apply to an AWS account. To find
     * out which customizations apply, use the <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * 
     * @param updateAccountCustomizationRequest
     * @return Result of the UpdateAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountCustomizationResult updateAccountCustomization(UpdateAccountCustomizationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountCustomization(request);
    }

    @SdkInternalApi
    final UpdateAccountCustomizationResult executeUpdateAccountCustomization(UpdateAccountCustomizationRequest updateAccountCustomizationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountCustomizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountCustomizationRequest> request = null;
        Response<UpdateAccountCustomizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountCustomizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAccountCustomizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountCustomization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountCustomizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAccountCustomizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Amazon QuickSight settings in your AWS account.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountSettings(request);
    }

    @SdkInternalApi
    final UpdateAccountSettingsResult executeUpdateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountSettingsRequest> request = null;
        Response<UpdateAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an analysis in Amazon QuickSight
     * </p>
     * 
     * @param updateAnalysisRequest
     * @return Result of the UpdateAnalysis operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAnalysisResult updateAnalysis(UpdateAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnalysis(request);
    }

    @SdkInternalApi
    final UpdateAnalysisResult executeUpdateAnalysis(UpdateAnalysisRequest updateAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnalysisRequest> request = null;
        Response<UpdateAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the read and write permissions for an analysis.
     * </p>
     * 
     * @param updateAnalysisPermissionsRequest
     * @return Result of the UpdateAnalysisPermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAnalysisPermissionsResult updateAnalysisPermissions(UpdateAnalysisPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnalysisPermissions(request);
    }

    @SdkInternalApi
    final UpdateAnalysisPermissionsResult executeUpdateAnalysisPermissions(UpdateAnalysisPermissionsRequest updateAnalysisPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnalysisPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnalysisPermissionsRequest> request = null;
        Response<UpdateAnalysisPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnalysisPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAnalysisPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnalysisPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnalysisPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAnalysisPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a dashboard in an AWS account.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return Result of the UpdateDashboard operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDashboardResult updateDashboard(UpdateDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDashboard(request);
    }

    @SdkInternalApi
    final UpdateDashboardResult executeUpdateDashboard(UpdateDashboardRequest updateDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardRequest> request = null;
        Response<UpdateDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates read and write permissions on a dashboard.
     * </p>
     * 
     * @param updateDashboardPermissionsRequest
     * @return Result of the UpdateDashboardPermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDashboardPermissionsResult updateDashboardPermissions(UpdateDashboardPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDashboardPermissions(request);
    }

    @SdkInternalApi
    final UpdateDashboardPermissionsResult executeUpdateDashboardPermissions(UpdateDashboardPermissionsRequest updateDashboardPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDashboardPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardPermissionsRequest> request = null;
        Response<UpdateDashboardPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDashboardPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDashboardPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDashboardPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDashboardPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the published version of a dashboard.
     * </p>
     * 
     * @param updateDashboardPublishedVersionRequest
     * @return Result of the UpdateDashboardPublishedVersion operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDashboardPublishedVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPublishedVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDashboardPublishedVersionResult updateDashboardPublishedVersion(UpdateDashboardPublishedVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDashboardPublishedVersion(request);
    }

    @SdkInternalApi
    final UpdateDashboardPublishedVersionResult executeUpdateDashboardPublishedVersion(
            UpdateDashboardPublishedVersionRequest updateDashboardPublishedVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDashboardPublishedVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardPublishedVersionRequest> request = null;
        Response<UpdateDashboardPublishedVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardPublishedVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDashboardPublishedVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDashboardPublishedVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDashboardPublishedVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDashboardPublishedVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a dataset.
     * </p>
     * 
     * @param updateDataSetRequest
     * @return Result of the UpdateDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDataSetResult updateDataSet(UpdateDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSet(request);
    }

    @SdkInternalApi
    final UpdateDataSetResult executeUpdateDataSet(UpdateDataSetRequest updateDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSetRequest> request = null;
        Response<UpdateDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param updateDataSetPermissionsRequest
     * @return Result of the UpdateDataSetPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDataSetPermissionsResult updateDataSetPermissions(UpdateDataSetPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSetPermissions(request);
    }

    @SdkInternalApi
    final UpdateDataSetPermissionsResult executeUpdateDataSetPermissions(UpdateDataSetPermissionsRequest updateDataSetPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSetPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSetPermissionsRequest> request = null;
        Response<UpdateDataSetPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSetPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDataSetPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSetPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSetPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDataSetPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSource(request);
    }

    @SdkInternalApi
    final UpdateDataSourceResult executeUpdateDataSource(UpdateDataSourceRequest updateDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourceRequest> request = null;
        Response<UpdateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the permissions to a data source.
     * </p>
     * 
     * @param updateDataSourcePermissionsRequest
     * @return Result of the UpdateDataSourcePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSourcePermissions(request);
    }

    @SdkInternalApi
    final UpdateDataSourcePermissionsResult executeUpdateDataSourcePermissions(UpdateDataSourcePermissionsRequest updateDataSourcePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSourcePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourcePermissionsRequest> request = null;
        Response<UpdateDataSourcePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourcePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDataSourcePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSourcePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSourcePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDataSourcePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes a group description.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGroup(request);
    }

    @SdkInternalApi
    final UpdateGroupResult executeUpdateGroup(UpdateGroupRequest updateGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupRequest> request = null;
        Response<UpdateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that
     * are specified in the request. This overwrites all of the users included in <code>Identities</code>.
     * </p>
     * 
     * @param updateIAMPolicyAssignmentRequest
     * @return Result of the UpdateIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIAMPolicyAssignmentResult updateIAMPolicyAssignment(UpdateIAMPolicyAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIAMPolicyAssignment(request);
    }

    @SdkInternalApi
    final UpdateIAMPolicyAssignmentResult executeUpdateIAMPolicyAssignment(UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIAMPolicyAssignmentRequest> request = null;
        Response<UpdateIAMPolicyAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIAMPolicyAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateIAMPolicyAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIAMPolicyAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIAMPolicyAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIAMPolicyAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a template from an existing Amazon QuickSight analysis or another template.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTemplateResult updateTemplate(UpdateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplate(request);
    }

    @SdkInternalApi
    final UpdateTemplateResult executeUpdateTemplate(UpdateTemplateRequest updateTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateRequest> request = null;
        Response<UpdateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the template alias of a template.
     * </p>
     * 
     * @param updateTemplateAliasRequest
     * @return Result of the UpdateTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateTemplateAliasResult updateTemplateAlias(UpdateTemplateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplateAlias(request);
    }

    @SdkInternalApi
    final UpdateTemplateAliasResult executeUpdateTemplateAlias(UpdateTemplateAliasRequest updateTemplateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateAliasRequest> request = null;
        Response<UpdateTemplateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTemplateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTemplateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTemplateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the resource permissions for a template.
     * </p>
     * 
     * @param updateTemplatePermissionsRequest
     * @return Result of the UpdateTemplatePermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTemplatePermissionsResult updateTemplatePermissions(UpdateTemplatePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplatePermissions(request);
    }

    @SdkInternalApi
    final UpdateTemplatePermissionsResult executeUpdateTemplatePermissions(UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplatePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplatePermissionsRequest> request = null;
        Response<UpdateTemplatePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplatePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateTemplatePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplatePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTemplatePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateTemplatePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @return Result of the UpdateTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateThemeResult updateTheme(UpdateThemeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTheme(request);
    }

    @SdkInternalApi
    final UpdateThemeResult executeUpdateTheme(UpdateThemeRequest updateThemeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThemeRequest> request = null;
        Response<UpdateThemeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThemeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateThemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTheme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThemeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateThemeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an alias of a theme.
     * </p>
     * 
     * @param updateThemeAliasRequest
     * @return Result of the UpdateThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateThemeAliasResult updateThemeAlias(UpdateThemeAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateThemeAlias(request);
    }

    @SdkInternalApi
    final UpdateThemeAliasResult executeUpdateThemeAlias(UpdateThemeAliasRequest updateThemeAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThemeAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThemeAliasRequest> request = null;
        Response<UpdateThemeAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThemeAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateThemeAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateThemeAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThemeAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateThemeAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the resource permissions for a theme. Permissions apply to the action to grant or revoke permissions on,
     * for example <code>"quicksight:DescribeTheme"</code>.
     * </p>
     * <p>
     * Theme permissions apply in groupings. Valid groupings include the following for the three levels of permissions,
     * which are user, owner, or no permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"quicksight:DescribeTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeVersions"</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"quicksight:DescribeTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeVersions"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DeleteTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:CreateThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DeleteThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateThemePermissions"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemePermissions"</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateThemePermissionsRequest
     * @return Result of the UpdateThemePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateThemePermissionsResult updateThemePermissions(UpdateThemePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateThemePermissions(request);
    }

    @SdkInternalApi
    final UpdateThemePermissionsResult executeUpdateThemePermissions(UpdateThemePermissionsRequest updateThemePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThemePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThemePermissionsRequest> request = null;
        Response<UpdateThemePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThemePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateThemePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateThemePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThemePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateThemePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon QuickSight user.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUser(request);
    }

    @SdkInternalApi
    final UpdateUserResult executeUpdateUser(UpdateUserRequest updateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QuickSight");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserResultJsonUnmarshaller());
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
