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
package com.amazonaws.services.resourcegroups;

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

import com.amazonaws.services.resourcegroups.AWSResourceGroupsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.resourcegroups.model.*;
import com.amazonaws.services.resourcegroups.model.transform.*;

/**
 * Client for accessing Resource Groups. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS Resource Groups</fullname>
 * <p>
 * AWS Resource Groups lets you organize AWS resources such as Amazon EC2 instances, Amazon Relational Database Service
 * databases, and Amazon S3 buckets into groups using criteria that you define as tags. A resource group is a collection
 * of resources that match the resource types specified in a query, and share one or more tags or portions of tags. You
 * can create a group of resources based on their roles in your cloud infrastructure, lifecycle stages, regions,
 * application layers, or virtually any criteria. Resource groups enable you to automate management tasks, such as those
 * in AWS Systems Manager Automation documents, on tag-related resources in AWS Systems Manager. Groups of tagged
 * resources also let you quickly view a custom console in AWS Systems Manager that shows AWS Config compliance and
 * other monitoring data about member resources.
 * </p>
 * <p>
 * To create a resource group, build a resource query, and specify tags that identify the criteria that members of the
 * group have in common. Tags are key-value pairs.
 * </p>
 * <p>
 * For more information about Resource Groups, see the <a
 * href="https://docs.aws.amazon.com/ARG/latest/userguide/welcome.html">AWS Resource Groups User Guide</a>.
 * </p>
 * <p>
 * AWS Resource Groups uses a REST-compliant API that you can use to perform the following types of operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create, Read, Update, and Delete (CRUD) operations on resource groups and resource query entities
 * </p>
 * </li>
 * <li>
 * <p>
 * Applying, editing, and removing tags from resource groups
 * </p>
 * </li>
 * <li>
 * <p>
 * Resolving resource group member ARNs so they can be returned as search results
 * </p>
 * </li>
 * <li>
 * <p>
 * Getting data about resources that are members of a group
 * </p>
 * </li>
 * <li>
 * <p>
 * Searching AWS resources based on a resource query
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceGroupsClient extends AmazonWebServiceClient implements AWSResourceGroups {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSResourceGroups.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "resource-groups";

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
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.resourcegroups.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.resourcegroups.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.resourcegroups.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MethodNotAllowedException").withModeledClass(
                                    com.amazonaws.services.resourcegroups.model.MethodNotAllowedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.resourcegroups.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.resourcegroups.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.resourcegroups.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.resourcegroups.model.AWSResourceGroupsException.class));

    public static AWSResourceGroupsClientBuilder builder() {
        return AWSResourceGroupsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Resource Groups using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Resource Groups using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("resource-groups.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/resourcegroups/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/resourcegroups/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a group with a specified name, description, and resource query.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/CreateGroup" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
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
     * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the
     * group; it only deletes the group structure.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/DeleteGroup" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
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
     * Returns information about a specified resource group.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroup(request);
    }

    @SdkInternalApi
    final GetGroupResult executeGetGroup(GetGroupRequest getGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupRequest> request = null;
        Response<GetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the resource query associated with the specified resource group.
     * </p>
     * 
     * @param getGroupQueryRequest
     * @return Result of the GetGroupQuery operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.GetGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupQuery" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetGroupQueryResult getGroupQuery(GetGroupQueryRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroupQuery(request);
    }

    @SdkInternalApi
    final GetGroupQueryResult executeGetGroupQuery(GetGroupQueryRequest getGroupQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupQueryRequest> request = null;
        Response<GetGroupQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroupQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags that are associated with a resource group, specified by an ARN.
     * </p>
     * 
     * @param getTagsRequest
     * @return Result of the GetTags operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTagsResult getTags(GetTagsRequest request) {
        request = beforeClientExecution(request);
        return executeGetTags(request);
    }

    @SdkInternalApi
    final GetTagsResult executeGetTags(GetTagsRequest getTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagsRequest> request = null;
        Response<GetTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of ARNs of resources that are members of a specified resource group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @return Result of the ListGroupResources operation returned by the service.
     * @throws UnauthorizedException
     *         The request has not been applied because it lacks valid authentication credentials for the target
     *         resource.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGroupResourcesResult listGroupResources(ListGroupResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupResources(request);
    }

    @SdkInternalApi
    final ListGroupResourcesResult executeListGroupResources(ListGroupResourcesRequest listGroupResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupResourcesRequest> request = null;
        Response<ListGroupResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of existing resource groups in your account.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
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
     * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a
     * resource query in a CreateGroup or UpdateGroupQuery operation.
     * </p>
     * 
     * @param searchResourcesRequest
     * @return Result of the SearchResources operation returned by the service.
     * @throws UnauthorizedException
     *         The request has not been applied because it lacks valid authentication credentials for the target
     *         resource.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.SearchResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/SearchResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchResourcesResult searchResources(SearchResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchResources(request);
    }

    @SdkInternalApi
    final SearchResourcesResult executeSearchResources(SearchResourcesRequest searchResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchResourcesRequest> request = null;
        Response<SearchResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they
     * are not specified in the request parameters.
     * </p>
     * 
     * @param tagRequest
     * @return Result of the Tag operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.Tag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Tag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResult tag(TagRequest request) {
        request = beforeClientExecution(request);
        return executeTag(request);
    }

    @SdkInternalApi
    final TagResult executeTag(TagRequest tagRequest) {

        ExecutionContext executionContext = createExecutionContext(tagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagRequest> request = null;
        Response<TagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Tag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes specified tags from a specified resource.
     * </p>
     * 
     * @param untagRequest
     * @return Result of the Untag operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.Untag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Untag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResult untag(UntagRequest request) {
        request = beforeClientExecution(request);
        return executeUntag(request);
    }

    @SdkInternalApi
    final UntagResult executeUntag(UntagRequest untagRequest) {

        ExecutionContext executionContext = createExecutionContext(untagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagRequest> request = null;
        Response<UntagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Untag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroup" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
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
     * Updates the resource query of a group.
     * </p>
     * 
     * @param updateGroupQueryRequest
     * @return Result of the UpdateGroupQuery operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.UpdateGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroupQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGroupQueryResult updateGroupQuery(UpdateGroupQueryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGroupQuery(request);
    }

    @SdkInternalApi
    final UpdateGroupQueryResult executeUpdateGroupQuery(UpdateGroupQueryRequest updateGroupQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGroupQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupQueryRequest> request = null;
        Response<UpdateGroupQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGroupQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGroupQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGroupQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGroupQueryResultJsonUnmarshaller());
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
