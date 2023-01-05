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
package com.amazonaws.services.appconfigdata;

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

import com.amazonaws.services.appconfigdata.AWSAppConfigDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appconfigdata.model.*;
import com.amazonaws.services.appconfigdata.model.transform.*;

/**
 * Client for accessing AWS AppConfig Data. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AppConfig Data provides the data plane APIs your application uses to retrieve configuration data. Here's how it
 * works:
 * </p>
 * <p>
 * Your application retrieves configuration data by first establishing a configuration session using the AppConfig Data
 * <a>StartConfigurationSession</a> API action. Your session's client then makes periodic calls to
 * <a>GetLatestConfiguration</a> to check for and retrieve the latest data available.
 * </p>
 * <p>
 * When calling <code>StartConfigurationSession</code>, your code sends the following information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Identifiers (ID or name) of an AppConfig application, environment, and configuration profile that the session tracks.
 * </p>
 * </li>
 * <li>
 * <p>
 * (Optional) The minimum amount of time the session's client must wait between calls to
 * <code>GetLatestConfiguration</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In response, AppConfig provides an <code>InitialConfigurationToken</code> to be given to the session's client and
 * used the first time it calls <code>GetLatestConfiguration</code> for that session.
 * </p>
 * <p>
 * When calling <code>GetLatestConfiguration</code>, your client code sends the most recent
 * <code>ConfigurationToken</code> value it has and receives in response:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>NextPollConfigurationToken</code>: the <code>ConfigurationToken</code> value to use on the next call to
 * <code>GetLatestConfiguration</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NextPollIntervalInSeconds</code>: the duration the client should wait before making its next call to
 * <code>GetLatestConfiguration</code>. This duration may vary over the course of the session, so it should be used
 * instead of the value sent on the <code>StartConfigurationSession</code> call.
 * </p>
 * </li>
 * <li>
 * <p>
 * The configuration: the latest data intended for the session. This may be empty if the client already has the latest
 * version of the configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information and to view example CLI commands that show how to retrieve a configuration using the AppConfig
 * Data <code>StartConfigurationSession</code> and <code>GetLatestConfiguration</code> API actions, see <a
 * href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-retrieving-the-configuration">Receiving the
 * configuration</a> in the <i>AppConfig User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppConfigDataClient extends AmazonWebServiceClient implements AWSAppConfigData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAppConfigData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "appconfig";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appconfigdata.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appconfigdata.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appconfigdata.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appconfigdata.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appconfigdata.model.AWSAppConfigDataException.class));

    public static AWSAppConfigDataClientBuilder builder() {
        return AWSAppConfigDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS AppConfig Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppConfigDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS AppConfig Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppConfigDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("appconfigdata.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appconfigdata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appconfigdata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves the latest deployed configuration. This API may return empty configuration data if the client already
     * has the latest version. For more information about this API action and to view example CLI commands that show how
     * to use it with the <a>StartConfigurationSession</a> API action, see <a
     * href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-retrieving-the-configuration">Receiving the
     * configuration</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Note the following important information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each configuration token is only valid for one call to <code>GetLatestConfiguration</code>. The
     * <code>GetLatestConfiguration</code> response includes a <code>NextPollConfigurationToken</code> that should
     * always replace the token used for the just-completed call in preparation for the next one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetLatestConfiguration</code> is a priced call. For more information, see <a
     * href="https://aws.amazon.com/systems-manager/pricing/">Pricing</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param getLatestConfigurationRequest
     * @return Result of the GetLatestConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         There was an internal failure in the service.
     * @sample AWSAppConfigData.GetLatestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLatestConfigurationResult getLatestConfiguration(GetLatestConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLatestConfiguration(request);
    }

    @SdkInternalApi
    final GetLatestConfigurationResult executeGetLatestConfiguration(GetLatestConfigurationRequest getLatestConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLatestConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLatestConfigurationRequest> request = null;
        Response<GetLatestConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLatestConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLatestConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppConfigData");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLatestConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLatestConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new GetLatestConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a configuration session used to retrieve a deployed configuration. For more information about this API
     * action and to view example CLI commands that show how to use it with the <a>GetLatestConfiguration</a> API
     * action, see <a
     * href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-retrieving-the-configuration">Receiving the
     * configuration</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param startConfigurationSessionRequest
     * @return Result of the StartConfigurationSession operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         There was an internal failure in the service.
     * @sample AWSAppConfigData.StartConfigurationSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartConfigurationSessionResult startConfigurationSession(StartConfigurationSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStartConfigurationSession(request);
    }

    @SdkInternalApi
    final StartConfigurationSessionResult executeStartConfigurationSession(StartConfigurationSessionRequest startConfigurationSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(startConfigurationSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConfigurationSessionRequest> request = null;
        Response<StartConfigurationSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConfigurationSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startConfigurationSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppConfigData");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartConfigurationSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartConfigurationSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartConfigurationSessionResultJsonUnmarshaller());
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
