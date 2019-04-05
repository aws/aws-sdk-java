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
package com.amazonaws.services.dlm;

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

import com.amazonaws.services.dlm.AmazonDLMClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.services.dlm.model.transform.*;

/**
 * Client for accessing Amazon DLM. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Data Lifecycle Manager</fullname>
 * <p>
 * With Amazon Data Lifecycle Manager, you can manage the lifecycle of your AWS resources. You create lifecycle
 * policies, which are used to automate operations on the specified resources.
 * </p>
 * <p>
 * Amazon DLM supports Amazon EBS volumes and snapshots. For information about using Amazon DLM with Amazon EBS, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html">Automating the Amazon EBS Snapshot
 * Lifecycle</a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDLMClient extends AmazonWebServiceClient implements AmazonDLM {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDLM.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dlm";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.dlm.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.dlm.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withModeledClass(
                                    com.amazonaws.services.dlm.model.InternalServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.dlm.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.dlm.model.AmazonDLMException.class));

    public static AmazonDLMClientBuilder builder() {
        return AmazonDLMClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DLM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDLMClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DLM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDLMClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("dlm.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/dlm/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/dlm/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle
     * policies.
     * </p>
     * 
     * @param createLifecyclePolicyRequest
     * @return Result of the CreateLifecyclePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         Bad request. The request is missing required parameters or has invalid parameters.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @sample AmazonDLM.CreateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLifecyclePolicyResult createLifecyclePolicy(CreateLifecyclePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLifecyclePolicy(request);
    }

    @SdkInternalApi
    final CreateLifecyclePolicyResult executeCreateLifecyclePolicy(CreateLifecyclePolicyRequest createLifecyclePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLifecyclePolicyRequest> request = null;
        Response<CreateLifecyclePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLifecyclePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLifecyclePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DLM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLifecyclePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLifecyclePolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateLifecyclePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return Result of the DeleteLifecyclePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/DeleteLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLifecyclePolicy(request);
    }

    @SdkInternalApi
    final DeleteLifecyclePolicyResult executeDeleteLifecyclePolicy(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLifecyclePolicyRequest> request = null;
        Response<DeleteLifecyclePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLifecyclePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLifecyclePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DLM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLifecyclePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLifecyclePolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteLifecyclePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all or the specified data lifecycle policies.
     * </p>
     * <p>
     * To get complete information about a policy, use <a>GetLifecyclePolicy</a>.
     * </p>
     * 
     * @param getLifecyclePoliciesRequest
     * @return Result of the GetLifecyclePolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InvalidRequestException
     *         Bad request. The request is missing required parameters or has invalid parameters.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.GetLifecyclePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLifecyclePoliciesResult getLifecyclePolicies(GetLifecyclePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeGetLifecyclePolicies(request);
    }

    @SdkInternalApi
    final GetLifecyclePoliciesResult executeGetLifecyclePolicies(GetLifecyclePoliciesRequest getLifecyclePoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(getLifecyclePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLifecyclePoliciesRequest> request = null;
        Response<GetLifecyclePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLifecyclePoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLifecyclePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DLM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLifecyclePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLifecyclePoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLifecyclePoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about the specified lifecycle policy.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return Result of the GetLifecyclePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetLifecyclePolicy(request);
    }

    @SdkInternalApi
    final GetLifecyclePolicyResult executeGetLifecyclePolicy(GetLifecyclePolicyRequest getLifecyclePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLifecyclePolicyRequest> request = null;
        Response<GetLifecyclePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLifecyclePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLifecyclePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DLM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLifecyclePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLifecyclePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLifecyclePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified lifecycle policy.
     * </p>
     * 
     * @param updateLifecyclePolicyRequest
     * @return Result of the UpdateLifecyclePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InvalidRequestException
     *         Bad request. The request is missing required parameters or has invalid parameters.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.UpdateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/UpdateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLifecyclePolicyResult updateLifecyclePolicy(UpdateLifecyclePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLifecyclePolicy(request);
    }

    @SdkInternalApi
    final UpdateLifecyclePolicyResult executeUpdateLifecyclePolicy(UpdateLifecyclePolicyRequest updateLifecyclePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLifecyclePolicyRequest> request = null;
        Response<UpdateLifecyclePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLifecyclePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLifecyclePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DLM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLifecyclePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLifecyclePolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateLifecyclePolicyResultJsonUnmarshaller());
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
