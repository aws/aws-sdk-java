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
package com.amazonaws.services.resourcegroupstaggingapi;

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

import com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;
import com.amazonaws.services.resourcegroupstaggingapi.model.transform.*;

/**
 * Client for accessing AWS Resource Groups Tagging API. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <fullname>Resource Groups Tagging API</fullname>
 * <p>
 * This guide describes the API operations for the resource groups tagging.
 * </p>
 * <p>
 * A tag is a label that you assign to an AWS resource. A tag consists of a key and a value, both of which you define.
 * For example, if you have two Amazon EC2 instances, you might assign both a tag key of "Stack." But the value of
 * "Stack" might be "Testing" for one and "Production" for the other.
 * </p>
 * <p>
 * Tagging can help you organize your resources and enables you to simplify resource management, access management and
 * cost allocation. For more information about tagging, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html">Working with Tag Editor</a> and <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/resource-groups.html">Working with Resource
 * Groups</a>. For more information about permissions you need to use the resource groups tagging APIs, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-resource-groups.html"
 * >Obtaining Permissions for Resource Groups </a> and <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
 * Permissions for Tagging </a>.
 * </p>
 * <p>
 * You can use the resource groups tagging APIs to complete the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tag and untag supported resources located in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * Use tag-based filters to search for resources located in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing tag keys in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing values for the specified key in the specified region for the AWS account
 * </p>
 * </li>
 * </ul>
 * <p>
 * Not all resources can have tags. For a lists of resources that you can tag, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/supported-resources.html">Supported Resources</a> in
 * the <i>AWS Resource Groups and Tag Editor User Guide</i>.
 * </p>
 * <p>
 * To make full use of the resource groups tagging APIs, you might need additional IAM permissions, including permission
 * to access the resources of individual services as well as permission to view and apply tags to those resources. For
 * more information, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
 * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceGroupsTaggingAPIClient extends AmazonWebServiceClient implements AWSResourceGroupsTaggingAPI {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSResourceGroupsTaggingAPI.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "tagging";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.ThrottledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PaginationTokenExpiredException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.PaginationTokenExpiredException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.resourcegroupstaggingapi.model.AWSResourceGroupsTaggingAPIException.class));

    public static AWSResourceGroupsTaggingAPIClientBuilder builder() {
        return AWSResourceGroupsTaggingAPIClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resource Groups Tagging API using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsTaggingAPIClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resource Groups Tagging API using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsTaggingAPIClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("tagging.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/resourcegroupstaggingapi/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/resourcegroupstaggingapi/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the
     * specified region for the AWS account. The tags and the resource types that you specify in the request are known
     * as <i>filters</i>. The response includes all tags that are associated with the requested resources. If no filter
     * is provided, this action returns a paginated resource list with the associated tags.
     * </p>
     * 
     * @param getResourcesRequest
     * @return Result of the GetResources operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws PaginationTokenExpiredException
     *         A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the
     *         specified <code>PaginationToken</code> has expired.
     * @sample AWSResourceGroupsTaggingAPI.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourcesResult getResources(GetResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeGetResources(request);
    }

    @SdkInternalApi
    final GetResourcesResult executeGetResources(GetResourcesRequest getResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcesRequest> request = null;
        Response<GetResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all tag keys in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagKeysRequest
     * @return Result of the GetTagKeys operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws PaginationTokenExpiredException
     *         A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the
     *         specified <code>PaginationToken</code> has expired.
     * @sample AWSResourceGroupsTaggingAPI.GetTagKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagKeys"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTagKeysResult getTagKeys(GetTagKeysRequest request) {
        request = beforeClientExecution(request);
        return executeGetTagKeys(request);
    }

    @SdkInternalApi
    final GetTagKeysResult executeGetTagKeys(GetTagKeysRequest getTagKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagKeysRequest> request = null;
        Response<GetTagKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTagKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagKeysResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all tag values for the specified key in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagValuesRequest
     * @return Result of the GetTagValues operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws PaginationTokenExpiredException
     *         A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the
     *         specified <code>PaginationToken</code> has expired.
     * @sample AWSResourceGroupsTaggingAPI.GetTagValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagValues"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTagValuesResult getTagValues(GetTagValuesRequest request) {
        request = beforeClientExecution(request);
        return executeGetTagValues(request);
    }

    @SdkInternalApi
    final GetTagValuesResult executeGetTagValues(GetTagValuesRequest getTagValuesRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagValuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagValuesRequest> request = null;
        Response<GetTagValuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagValuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagValuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTagValues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagValuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagValuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies one or more tags to the specified resources. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources can have tags. For a list of resources that support tagging, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/supported-resources.html">Supported Resources</a>
     * in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-restrictions">Tag Restrictions</a>
     * in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
     * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourcesRequest
     * @return Result of the TagResources operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.TagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/TagResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TagResourcesResult tagResources(TagResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeTagResources(request);
    }

    @SdkInternalApi
    final TagResourcesResult executeTagResources(TagResourcesRequest tagResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourcesRequest> request = null;
        Response<TagResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that
     * key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were
     * already removed. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to
     * as well as permissions for removing tags. For more information, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
     * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified region for the AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param untagResourcesRequest
     * @return Result of the UntagResources operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.UntagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/UntagResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UntagResourcesResult untagResources(UntagResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResources(request);
    }

    @SdkInternalApi
    final UntagResourcesResult executeUntagResources(UntagResourcesRequest untagResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourcesRequest> request = null;
        Response<UntagResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourcesResultJsonUnmarshaller());
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
