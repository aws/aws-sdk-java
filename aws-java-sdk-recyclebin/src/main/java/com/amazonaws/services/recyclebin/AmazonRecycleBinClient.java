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
package com.amazonaws.services.recyclebin;

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

import com.amazonaws.services.recyclebin.AmazonRecycleBinClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.recyclebin.model.*;
import com.amazonaws.services.recyclebin.model.transform.*;

/**
 * Client for accessing Amazon Recycle Bin. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * This is the <i>Recycle Bin API Reference</i>. This documentation provides descriptions and syntax for each of the
 * actions and data types in Recycle Bin.
 * </p>
 * <p>
 * Recycle Bin is a resource recovery feature that enables you to restore accidentally deleted snapshots and EBS-backed
 * AMIs. When using Recycle Bin, if your resources are deleted, they are retained in the Recycle Bin for a time period
 * that you specify.
 * </p>
 * <p>
 * You can restore a resource from the Recycle Bin at any time before its retention period expires. After you restore a
 * resource from the Recycle Bin, the resource is removed from the Recycle Bin, and you can then use it in the same way
 * you use any other resource of that type in your account. If the retention period expires and the resource is not
 * restored, the resource is permanently deleted from the Recycle Bin and is no longer available for recovery. For more
 * information about Recycle Bin, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-recycle-bin.html"> Recycle Bin</a> in the
 * <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRecycleBinClient extends AmazonWebServiceClient implements AmazonRecycleBin {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRecycleBin.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "rbin";

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
                                    com.amazonaws.services.recyclebin.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.recyclebin.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.recyclebin.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.recyclebin.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.recyclebin.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.recyclebin.model.AmazonRecycleBinException.class));

    public static AmazonRecycleBinClientBuilder builder() {
        return AmazonRecycleBinClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Recycle Bin using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRecycleBinClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Recycle Bin using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRecycleBinClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("rbin.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/recyclebin/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/recyclebin/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-create-rule"
     * > Create Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota for the number of tags per resource to be exceeded.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @sample AmazonRecycleBin.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRule(request);
    }

    @SdkInternalApi
    final CreateRuleResult executeCreateRule(CreateRuleRequest createRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-delete-rule"
     * > Delete Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRule(request);
    }

    @SdkInternalApi
    final DeleteRuleResult executeDeleteRule(DeleteRuleRequest deleteRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Recycle Bin retention rule.
     * </p>
     * 
     * @param getRuleRequest
     * @return Result of the GetRule operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonRecycleBin.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRuleResult getRule(GetRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetRule(request);
    }

    @SdkInternalApi
    final GetRuleResult executeGetRule(GetRuleRequest getRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRuleRequest> request = null;
        Response<GetRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Recycle Bin retention rules in the Region.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @sample AmazonRecycleBin.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRulesResult listRules(ListRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListRules(request);
    }

    @SdkInternalApi
    final ListRulesResult executeListRules(ListRulesRequest listRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags assigned to a retention rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonRecycleBin.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
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
     * Locks a retention rule. A locked retention rule can't be modified or deleted.
     * </p>
     * 
     * @param lockRuleRequest
     * @return Result of the LockRule operation returned by the service.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.LockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/LockRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public LockRuleResult lockRule(LockRuleRequest request) {
        request = beforeClientExecution(request);
        return executeLockRule(request);
    }

    @SdkInternalApi
    final LockRuleResult executeLockRule(LockRuleRequest lockRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(lockRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LockRuleRequest> request = null;
        Response<LockRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LockRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(lockRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LockRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LockRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new LockRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns tags to the specified retention rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota for the number of tags per resource to be exceeded.
     * @sample AmazonRecycleBin.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
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
     * Unlocks a retention rule. After a retention rule is unlocked, it can be modified or deleted only after the unlock
     * delay period expires.
     * </p>
     * 
     * @param unlockRuleRequest
     * @return Result of the UnlockRule operation returned by the service.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.UnlockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UnlockRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnlockRuleResult unlockRule(UnlockRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUnlockRule(request);
    }

    @SdkInternalApi
    final UnlockRuleResult executeUnlockRule(UnlockRuleRequest unlockRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(unlockRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlockRuleRequest> request = null;
        Response<UnlockRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlockRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unlockRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnlockRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnlockRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnlockRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unassigns a tag from a retention rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonRecycleBin.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
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
     * Updates an existing Recycle Bin retention rule. You can update a retention rule's description, resource tags, and
     * retention period at any time after creation. You can't update a retention rule's resource type after creation.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-update-rule"
     * > Update Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRuleResult updateRule(UpdateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRule(request);
    }

    @SdkInternalApi
    final UpdateRuleResult executeUpdateRule(UpdateRuleRequest updateRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleRequest> request = null;
        Response<UpdateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "rbin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleResultJsonUnmarshaller());
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
