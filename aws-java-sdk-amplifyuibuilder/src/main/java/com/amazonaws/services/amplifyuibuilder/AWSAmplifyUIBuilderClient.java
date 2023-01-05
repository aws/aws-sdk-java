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
package com.amazonaws.services.amplifyuibuilder;

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

import com.amazonaws.services.amplifyuibuilder.AWSAmplifyUIBuilderClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.services.amplifyuibuilder.model.transform.*;

/**
 * Client for accessing AWS Amplify UI Builder. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * The Amplify UI Builder API provides a programmatic interface for creating and configuring user interface (UI)
 * component libraries and themes for use in your Amplify applications. You can then connect these UI components to an
 * application's backend Amazon Web Services resources.
 * </p>
 * <p>
 * You can also use the Amplify Studio visual designer to create UI components and model data for an app. For more
 * information, see <a href="https://docs.amplify.aws/console/adminui/intro">Introduction</a> in the <i>Amplify
 * Docs</i>.
 * </p>
 * <p>
 * The Amplify Framework is a comprehensive set of SDKs, libraries, tools, and documentation for client app development.
 * For more information, see the <a href="https://docs.amplify.aws/">Amplify Framework</a>. For more information about
 * deploying an Amplify application to Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html">Amplify User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAmplifyUIBuilderClient extends AmazonWebServiceClient implements AWSAmplifyUIBuilder {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAmplifyUIBuilder.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "amplifyuibuilder";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifyuibuilder.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifyuibuilder.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifyuibuilder.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifyuibuilder.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifyuibuilder.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifyuibuilder.model.transform.ResourceConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.amplifyuibuilder.model.AWSAmplifyUIBuilderException.class));

    public static AWSAmplifyUIBuilderClientBuilder builder() {
        return AWSAmplifyUIBuilderClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Amplify UI Builder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyUIBuilderClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Amplify UI Builder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyUIBuilderClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("amplifyuibuilder.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/amplifyuibuilder/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/amplifyuibuilder/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new component for an Amplify app.
     * </p>
     * 
     * @param createComponentRequest
     * @return Result of the CreateComponent operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateComponentResult createComponent(CreateComponentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComponent(request);
    }

    @SdkInternalApi
    final CreateComponentResult executeCreateComponent(CreateComponentRequest createComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(createComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComponentRequest> request = null;
        Response<CreateComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new form for an Amplify app.
     * </p>
     * 
     * @param createFormRequest
     * @return Result of the CreateForm operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.CreateForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateFormResult createForm(CreateFormRequest request) {
        request = beforeClientExecution(request);
        return executeCreateForm(request);
    }

    @SdkInternalApi
    final CreateFormResult executeCreateForm(CreateFormRequest createFormRequest) {

        ExecutionContext executionContext = createExecutionContext(createFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFormRequest> request = null;
        Response<CreateFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFormResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a theme to apply to the components in an Amplify app.
     * </p>
     * 
     * @param createThemeRequest
     * @return Result of the CreateTheme operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateTheme" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
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
     * Deletes a component from an Amplify app.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteComponentResult deleteComponent(DeleteComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteComponent(request);
    }

    @SdkInternalApi
    final DeleteComponentResult executeDeleteComponent(DeleteComponentRequest deleteComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteComponentRequest> request = null;
        Response<DeleteComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a form from an Amplify app.
     * </p>
     * 
     * @param deleteFormRequest
     * @return Result of the DeleteForm operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.DeleteForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFormResult deleteForm(DeleteFormRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteForm(request);
    }

    @SdkInternalApi
    final DeleteFormResult executeDeleteForm(DeleteFormRequest deleteFormRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFormRequest> request = null;
        Response<DeleteFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFormResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a theme from an Amplify app.
     * </p>
     * 
     * @param deleteThemeRequest
     * @return Result of the DeleteTheme operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteTheme" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
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
     * Exchanges an access code for a token.
     * </p>
     * 
     * @param exchangeCodeForTokenRequest
     * @return Result of the ExchangeCodeForToken operation returned by the service.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExchangeCodeForToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExchangeCodeForToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExchangeCodeForTokenResult exchangeCodeForToken(ExchangeCodeForTokenRequest request) {
        request = beforeClientExecution(request);
        return executeExchangeCodeForToken(request);
    }

    @SdkInternalApi
    final ExchangeCodeForTokenResult executeExchangeCodeForToken(ExchangeCodeForTokenRequest exchangeCodeForTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(exchangeCodeForTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExchangeCodeForTokenRequest> request = null;
        Response<ExchangeCodeForTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExchangeCodeForTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exchangeCodeForTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExchangeCodeForToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExchangeCodeForTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExchangeCodeForTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports component configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportComponentsRequest
     * @return Result of the ExportComponents operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExportComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportComponents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportComponentsResult exportComponents(ExportComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeExportComponents(request);
    }

    @SdkInternalApi
    final ExportComponentsResult executeExportComponents(ExportComponentsRequest exportComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(exportComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportComponentsRequest> request = null;
        Response<ExportComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportComponentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports form configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportFormsRequest
     * @return Result of the ExportForms operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExportForms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportForms" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ExportFormsResult exportForms(ExportFormsRequest request) {
        request = beforeClientExecution(request);
        return executeExportForms(request);
    }

    @SdkInternalApi
    final ExportFormsResult executeExportForms(ExportFormsRequest exportFormsRequest) {

        ExecutionContext executionContext = createExecutionContext(exportFormsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportFormsRequest> request = null;
        Response<ExportFormsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportFormsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportFormsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportForms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportFormsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportFormsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports theme configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportThemesRequest
     * @return Result of the ExportThemes operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExportThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportThemes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ExportThemesResult exportThemes(ExportThemesRequest request) {
        request = beforeClientExecution(request);
        return executeExportThemes(request);
    }

    @SdkInternalApi
    final ExportThemesResult executeExportThemes(ExportThemesRequest exportThemesRequest) {

        ExecutionContext executionContext = createExecutionContext(exportThemesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportThemesRequest> request = null;
        Response<ExportThemesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportThemesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportThemesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportThemes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportThemesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportThemesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an existing component for an Amplify app.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetComponentResult getComponent(GetComponentRequest request) {
        request = beforeClientExecution(request);
        return executeGetComponent(request);
    }

    @SdkInternalApi
    final GetComponentResult executeGetComponent(GetComponentRequest getComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(getComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentRequest> request = null;
        Response<GetComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an existing form for an Amplify app.
     * </p>
     * 
     * @param getFormRequest
     * @return Result of the GetForm operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.GetForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetForm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFormResult getForm(GetFormRequest request) {
        request = beforeClientExecution(request);
        return executeGetForm(request);
    }

    @SdkInternalApi
    final GetFormResult executeGetForm(GetFormRequest getFormRequest) {

        ExecutionContext executionContext = createExecutionContext(getFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFormRequest> request = null;
        Response<GetFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFormResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns existing metadata for an Amplify app.
     * </p>
     * 
     * @param getMetadataRequest
     * @return Result of the GetMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You don't have permission to perform this operation.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.GetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMetadataResult getMetadata(GetMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetMetadata(request);
    }

    @SdkInternalApi
    final GetMetadataResult executeGetMetadata(GetMetadataRequest getMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetadataRequest> request = null;
        Response<GetMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an existing theme for an Amplify app.
     * </p>
     * 
     * @param getThemeRequest
     * @return Result of the GetTheme operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.GetTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetTheme" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetThemeResult getTheme(GetThemeRequest request) {
        request = beforeClientExecution(request);
        return executeGetTheme(request);
    }

    @SdkInternalApi
    final GetThemeResult executeGetTheme(GetThemeRequest getThemeRequest) {

        ExecutionContext executionContext = createExecutionContext(getThemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetThemeRequest> request = null;
        Response<GetThemeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetThemeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getThemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTheme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetThemeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetThemeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of components for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListComponentsResult listComponents(ListComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListComponents(request);
    }

    @SdkInternalApi
    final ListComponentsResult executeListComponents(ListComponentsRequest listComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentsRequest> request = null;
        Response<ListComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of forms for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listFormsRequest
     * @return Result of the ListForms operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ListForms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListForms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFormsResult listForms(ListFormsRequest request) {
        request = beforeClientExecution(request);
        return executeListForms(request);
    }

    @SdkInternalApi
    final ListFormsResult executeListForms(ListFormsRequest listFormsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFormsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFormsRequest> request = null;
        Response<ListFormsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFormsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFormsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListForms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFormsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFormsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of themes for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listThemesRequest
     * @return Result of the ListThemes operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListThemes" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
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
     * Stores the metadata information about a feature on a form or view.
     * </p>
     * 
     * @param putMetadataFlagRequest
     * @return Result of the PutMetadataFlag operation returned by the service.
     * @throws UnauthorizedException
     *         You don't have permission to perform this operation.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.PutMetadataFlag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/PutMetadataFlag"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutMetadataFlagResult putMetadataFlag(PutMetadataFlagRequest request) {
        request = beforeClientExecution(request);
        return executePutMetadataFlag(request);
    }

    @SdkInternalApi
    final PutMetadataFlagResult executePutMetadataFlag(PutMetadataFlagRequest putMetadataFlagRequest) {

        ExecutionContext executionContext = createExecutionContext(putMetadataFlagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetadataFlagRequest> request = null;
        Response<PutMetadataFlagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetadataFlagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMetadataFlagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMetadataFlag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMetadataFlagResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutMetadataFlagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Refreshes a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshTokenRequest
     * @return Result of the RefreshToken operation returned by the service.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.RefreshToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/RefreshToken" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RefreshTokenResult refreshToken(RefreshTokenRequest request) {
        request = beforeClientExecution(request);
        return executeRefreshToken(request);
    }

    @SdkInternalApi
    final RefreshTokenResult executeRefreshToken(RefreshTokenRequest refreshTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(refreshTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshTokenRequest> request = null;
        Response<RefreshTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(refreshTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RefreshToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RefreshTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RefreshTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing component.
     * </p>
     * 
     * @param updateComponentRequest
     * @return Result of the UpdateComponent operation returned by the service.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateComponentResult updateComponent(UpdateComponentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateComponent(request);
    }

    @SdkInternalApi
    final UpdateComponentResult executeUpdateComponent(UpdateComponentRequest updateComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateComponentRequest> request = null;
        Response<UpdateComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing form.
     * </p>
     * 
     * @param updateFormRequest
     * @return Result of the UpdateForm operation returned by the service.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.UpdateForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFormResult updateForm(UpdateFormRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateForm(request);
    }

    @SdkInternalApi
    final UpdateFormResult executeUpdateForm(UpdateFormRequest updateFormRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFormRequest> request = null;
        Response<UpdateFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFormResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @return Result of the UpdateTheme operation returned by the service.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateTheme" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyUIBuilder");
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
