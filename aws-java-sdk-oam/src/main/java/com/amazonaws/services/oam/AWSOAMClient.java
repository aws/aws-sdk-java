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
package com.amazonaws.services.oam;

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

import com.amazonaws.services.oam.AWSOAMClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.oam.model.*;
import com.amazonaws.services.oam.model.transform.*;

/**
 * Client for accessing CloudWatch Observability Access Manager. All service calls made using this client are blocking,
 * and will not return until the service call completes.
 * <p>
 * <p>
 * Use Amazon CloudWatch Observability Access Manager to create and manage links between source accounts and monitoring
 * accounts by using <i>CloudWatch cross-account observability</i>. With CloudWatch cross-account observability, you can
 * monitor and troubleshoot applications that span multiple accounts within a Region. Seamlessly search, visualize, and
 * analyze your metrics, logs, and traces in any of the linked accounts without account boundaries.
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;Set up one or more Amazon Web Services accounts as &lt;i&gt;monitoring accounts&lt;/i&gt; and link them with multiple &lt;i&gt;source accounts&lt;/i&gt;. A monitoring account is a central Amazon Web Services account that can view and interact with observability data generated from source accounts. A source account is an individual Amazon Web Services account that generates observability data for the resources that reside in it. Source accounts share their observability data with the monitoring account. The shared observability data can include metrics in Amazon CloudWatch, logs in Amazon CloudWatch Logs, and traces in X-Ray.&lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOAMClient extends AmazonWebServiceClient implements AWSOAM {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOAM.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "oam";

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
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingRequiredParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.MissingRequiredParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.oam.model.transform.InternalServiceExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.oam.model.AWSOAMException.class));

    public static AWSOAMClientBuilder builder() {
        return AWSOAMClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch Observability Access Manager using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOAMClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch Observability Access Manager using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOAMClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("oam.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/oam/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/oam/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a link between a source account and a sink that you have created in a monitoring account.
     * </p>
     * <p>
     * Before you create a link, you must create a sink in the monitoring account and create a sink policy in that
     * account. The sink policy must permit the source account to link to it. You can grant permission to source
     * accounts by granting permission to an entire organization or to individual accounts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a> and <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html">PutSinkPolicy</a>.
     * </p>
     * <p>
     * Each monitoring account can be linked to as many as 100,000 source accounts.
     * </p>
     * <p>
     * Each source account can be linked to as many as five monitoring accounts.
     * </p>
     * 
     * @param createLinkRequest
     * @return Result of the CreateLink operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @sample AWSOAM.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLinkResult createLink(CreateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLink(request);
    }

    @SdkInternalApi
    final CreateLinkResult executeCreateLink(CreateLinkRequest createLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(createLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLinkRequest> request = null;
        Response<CreateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this to create a <i>sink</i> in the current account, so that it can be used as a monitoring account in
     * CloudWatch cross-account observability. A sink is a resource that represents an attachment point in a monitoring
     * account. Source accounts can link to the sink to send observability data.
     * </p>
     * <p>
     * After you create a sink, you must create a sink policy that allows source accounts to attach to it. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html">PutSinkPolicy</a>.
     * </p>
     * <p>
     * Each account can contain one sink. If you delete a sink, you can then create a new one in that account.
     * </p>
     * 
     * @param createSinkRequest
     * @return Result of the CreateSink operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @sample AWSOAM.CreateSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateSink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSinkResult createSink(CreateSinkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSink(request);
    }

    @SdkInternalApi
    final CreateSinkResult executeCreateSink(CreateSinkRequest createSinkRequest) {

        ExecutionContext executionContext = createExecutionContext(createSinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSinkRequest> request = null;
        Response<CreateSinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a link between a monitoring account sink and a source account. You must run this operation in the source
     * account.
     * </p>
     * 
     * @param deleteLinkRequest
     * @return Result of the DeleteLink operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLinkResult deleteLink(DeleteLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLink(request);
    }

    @SdkInternalApi
    final DeleteLinkResult executeDeleteLink(DeleteLinkRequest deleteLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLinkRequest> request = null;
        Response<DeleteLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a sink. You must delete all links to a sink before you can delete that sink.
     * </p>
     * 
     * @param deleteSinkRequest
     * @return Result of the DeleteSink operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.DeleteSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/DeleteSink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSinkResult deleteSink(DeleteSinkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSink(request);
    }

    @SdkInternalApi
    final DeleteSinkResult executeDeleteSink(DeleteSinkRequest deleteSinkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSinkRequest> request = null;
        Response<DeleteSinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns complete information about one link.
     * </p>
     * <p>
     * To use this operation, provide the link ARN. To retrieve a list of link ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListLinks.html">ListLinks</a>.
     * </p>
     * 
     * @param getLinkRequest
     * @return Result of the GetLink operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.GetLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLinkResult getLink(GetLinkRequest request) {
        request = beforeClientExecution(request);
        return executeGetLink(request);
    }

    @SdkInternalApi
    final GetLinkResult executeGetLink(GetLinkRequest getLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(getLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLinkRequest> request = null;
        Response<GetLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns complete information about one monitoring account sink.
     * </p>
     * <p>
     * To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a>.
     * </p>
     * 
     * @param getSinkRequest
     * @return Result of the GetSink operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.GetSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetSink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSinkResult getSink(GetSinkRequest request) {
        request = beforeClientExecution(request);
        return executeGetSink(request);
    }

    @SdkInternalApi
    final GetSinkResult executeGetSink(GetSinkRequest getSinkRequest) {

        ExecutionContext executionContext = createExecutionContext(getSinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSinkRequest> request = null;
        Response<GetSinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current sink policy attached to this sink. The sink policy specifies what accounts can attach to this
     * sink as source accounts, and what types of data they can share.
     * </p>
     * 
     * @param getSinkPolicyRequest
     * @return Result of the GetSinkPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.GetSinkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetSinkPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSinkPolicyResult getSinkPolicy(GetSinkPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetSinkPolicy(request);
    }

    @SdkInternalApi
    final GetSinkPolicyResult executeGetSinkPolicy(GetSinkPolicyRequest getSinkPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getSinkPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSinkPolicyRequest> request = null;
        Response<GetSinkPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSinkPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSinkPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSinkPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSinkPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSinkPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of source account links that are linked to this monitoring account sink.
     * </p>
     * <p>
     * To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a>.
     * </p>
     * <p>
     * To find a list of links for one source account, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListLinks.html">ListLinks</a>.
     * </p>
     * 
     * @param listAttachedLinksRequest
     * @return Result of the ListAttachedLinks operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.ListAttachedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListAttachedLinks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAttachedLinksResult listAttachedLinks(ListAttachedLinksRequest request) {
        request = beforeClientExecution(request);
        return executeListAttachedLinks(request);
    }

    @SdkInternalApi
    final ListAttachedLinksResult executeListAttachedLinks(ListAttachedLinksRequest listAttachedLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttachedLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedLinksRequest> request = null;
        Response<ListAttachedLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttachedLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttachedLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttachedLinksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttachedLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation in a source account to return a list of links to monitoring account sinks that this source
     * account has.
     * </p>
     * <p>
     * To find a list of links for one monitoring account sink, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListAttachedLinks.html">ListAttachedLinks</a> from
     * within the monitoring account.
     * </p>
     * 
     * @param listLinksRequest
     * @return Result of the ListLinks operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.ListLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListLinks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLinksResult listLinks(ListLinksRequest request) {
        request = beforeClientExecution(request);
        return executeListLinks(request);
    }

    @SdkInternalApi
    final ListLinksResult executeListLinks(ListLinksRequest listLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(listLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLinksRequest> request = null;
        Response<ListLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLinksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation in a monitoring account to return the list of sinks created in that account.
     * </p>
     * 
     * @param listSinksRequest
     * @return Result of the ListSinks operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.ListSinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListSinks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSinksResult listSinks(ListSinksRequest request) {
        request = beforeClientExecution(request);
        return executeListSinks(request);
    }

    @SdkInternalApi
    final ListSinksResult executeListSinks(ListSinksRequest listSinksRequest) {

        ExecutionContext executionContext = createExecutionContext(listSinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSinksRequest> request = null;
        Response<ListSinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSinksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with a resource. Both sinks and links support tagging.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
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
     * Creates or updates the resource policy that grants permissions to source accounts to link to the monitoring
     * account sink. When you create a sink policy, you can grant permissions to all accounts in an organization or to
     * individual accounts.
     * </p>
     * <p>
     * You can also use a sink policy to limit the types of data that is shared. The three types that you can allow or
     * deny are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Metrics</b> - Specify with <code>AWS::CloudWatch::Metric</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Log groups</b> - Specify with <code>AWS::Logs::LogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Traces</b> - Specify with <code>AWS::XRay::Trace</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * See the examples in this section to see how to specify permitted source accounts and data types.
     * </p>
     * 
     * @param putSinkPolicyRequest
     * @return Result of the PutSinkPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.PutSinkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/PutSinkPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutSinkPolicyResult putSinkPolicy(PutSinkPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutSinkPolicy(request);
    }

    @SdkInternalApi
    final PutSinkPolicyResult executePutSinkPolicy(PutSinkPolicyRequest putSinkPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putSinkPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSinkPolicyRequest> request = null;
        Response<PutSinkPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSinkPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSinkPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSinkPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSinkPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutSinkPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource. Both sinks and links can be tagged.
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
     * key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key
     * that is already associated with the alarm, the new tag value that you specify replaces the previous value for
     * that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <important>
     * <p>
     * Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have
     * the <code>oam:ResourceTag</code> permission. The <code>iam:ResourceTag</code> permission does not allow you to
     * tag and untag links and sinks.
     * </p>
     * </important>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws TooManyTagsException
     *         A resource can have no more than 50 tags.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
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
     * Removes one or more tags from the specified resource.
     * </p>
     * <important>
     * <p>
     * Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have
     * the <code>oam:ResourceTag</code> permission. The <code>iam:TagResource</code> permission does not allow you to
     * tag and untag links and sinks.
     * </p>
     * </important>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
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
     * Use this operation to change what types of data are shared from a source account to its linked monitoring account
     * sink. You can't change the sink or change the monitoring account with this operation.
     * </p>
     * <p>
     * To update the list of tags associated with the sink, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateLinkRequest
     * @return Result of the UpdateLink operation returned by the service.
     * @throws InternalServiceException
     *         Unexpected error while processing the request. Retry the request.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing from the request.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSOAM.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLinkResult updateLink(UpdateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLink(request);
    }

    @SdkInternalApi
    final UpdateLinkResult executeUpdateLink(UpdateLinkRequest updateLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLinkRequest> request = null;
        Response<UpdateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLinkResultJsonUnmarshaller());
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
