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
package com.amazonaws.services.resourceexplorer2;

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

import com.amazonaws.services.resourceexplorer2.AWSResourceExplorer2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.resourceexplorer2.model.*;
import com.amazonaws.services.resourceexplorer2.model.transform.*;

/**
 * Client for accessing AWS Resource Explorer. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Resource Explorer is a resource search and discovery service. By using Resource Explorer, you can
 * explore your resources using an internet search engine-like experience. Examples of resources include Amazon
 * Relational Database Service (Amazon RDS) instances, Amazon Simple Storage Service (Amazon S3) buckets, or Amazon
 * DynamoDB tables. You can search for your resources using resource metadata like names, tags, and IDs. Resource
 * Explorer can search across all of the Amazon Web Services Regions in your account in which you turn the service on,
 * to simplify your cross-Region workloads.
 * </p>
 * <p>
 * Resource Explorer scans the resources in each of the Amazon Web Services Regions in your Amazon Web Services account
 * in which you turn on Resource Explorer. Resource Explorer <a href=
 * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/getting-started-terms-and-concepts.html#term-index"
 * >creates and maintains an index</a> in each Region, with the details of that Region's resources.
 * </p>
 * <p>
 * You can <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">search
 * across all of the indexed Regions in your account</a> by designating one of your Amazon Web Services Regions to
 * contain the aggregator index for the account. When you <a
 * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region-turn-on.html">promote a
 * local index in a Region to become the aggregator index for the account</a>, Resource Explorer automatically
 * replicates the index information from all local indexes in the other Regions to the aggregator index. Therefore, the
 * Region with the aggregator index has a copy of all resource information for all Regions in the account where you
 * turned on Resource Explorer. As a result, views in the aggregator index Region include resources from all of the
 * indexed Regions in your account.
 * </p>
 * <p>
 * For more information about Amazon Web Services Resource Explorer, including how to enable and configure the service,
 * see the <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/">Amazon Web Services Resource
 * Explorer User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceExplorer2Client extends AmazonWebServiceClient implements AWSResourceExplorer2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSResourceExplorer2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "resource-explorer-2";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourceexplorer2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.resourceexplorer2.model.AWSResourceExplorer2Exception.class));

    public static AWSResourceExplorer2ClientBuilder builder() {
        return AWSResourceExplorer2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resource Explorer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceExplorer2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resource Explorer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceExplorer2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("resource-explorer-2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/resourceexplorer2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/resourceexplorer2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sets the specified view as the default for the Amazon Web Services Region in which you call this operation. When
     * a user performs a <a>Search</a> that doesn't explicitly specify which view to use, then Amazon Web Services
     * Resource Explorer automatically chooses this default view for searches performed in this Amazon Web Services
     * Region.
     * </p>
     * <p>
     * If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a
     * view with every <code>Search</code> operation performed in that Region.
     * </p>
     * 
     * @param associateDefaultViewRequest
     * @return Result of the AssociateDefaultView operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.AssociateDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/AssociateDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateDefaultViewResult associateDefaultView(AssociateDefaultViewRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDefaultView(request);
    }

    @SdkInternalApi
    final AssociateDefaultViewResult executeAssociateDefaultView(AssociateDefaultViewRequest associateDefaultViewRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDefaultViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDefaultViewRequest> request = null;
        Response<AssociateDefaultViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDefaultViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateDefaultViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDefaultView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDefaultViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateDefaultViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about a list of views.
     * </p>
     * 
     * @param batchGetViewRequest
     * @return Result of the BatchGetView operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.BatchGetView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/BatchGetView"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetViewResult batchGetView(BatchGetViewRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetView(request);
    }

    @SdkInternalApi
    final BatchGetViewResult executeBatchGetView(BatchGetViewRequest batchGetViewRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetViewRequest> request = null;
        Response<BatchGetViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Turns on Amazon Web Services Resource Explorer in the Amazon Web Services Region in which you called this
     * operation by creating an index. Resource Explorer begins discovering the resources in this Region and stores the
     * details about the resources in the index so that they can be queried by using the <a>Search</a> operation. You
     * can create only one index in a Region.
     * </p>
     * <note>
     * <p>
     * This operation creates only a <i>local</i> index. To promote the local index in one Amazon Web Services Region
     * into the aggregator index for the Amazon Web Services account, use the <a>UpdateIndexType</a> operation. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a> in the <i>Amazon Web Services Resource Explorer User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * For more details about what happens when you turn on Resource Explorer in an Amazon Web Services Region, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-service-activate.html">Turn on
     * Resource Explorer to index your resources in an Amazon Web Services Region</a> in the <i>Amazon Web Services
     * Resource Explorer User Guide</i>.
     * </p>
     * <p>
     * If this is the first Amazon Web Services Region in which you've created an index for Resource Explorer, then this
     * operation also <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/security_iam_service-linked-roles.html"
     * >creates a service-linked role</a> in your Amazon Web Services account that allows Resource Explorer to enumerate
     * your resources to populate the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Action</b>: <code>resource-explorer-2:CreateIndex</code>
     * </p>
     * <p>
     * <b>Resource</b>: The ARN of the index (as it will exist after the operation completes) in the Amazon Web Services
     * Region and account in which you're trying to create the index. Use the wildcard character (<code>*</code>) at the
     * end of the string to match the eventual UUID. For example, the following <code>Resource</code> element restricts
     * the role or user to creating an index in only the <code>us-east-2</code> Region of the specified account.
     * </p>
     * <p>
     * <code>"Resource": "arn:aws:resource-explorer-2:us-west-2:<i>&lt;account-id&gt;</i>:index/*"</code>
     * </p>
     * <p>
     * Alternatively, you can use <code>"Resource": "*"</code> to allow the role or user to create an index in any
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Action</b>: <code>iam:CreateServiceLinkedRole</code>
     * </p>
     * <p>
     * <b>Resource</b>: No specific resource (*).
     * </p>
     * <p>
     * This permission is required only the first time you create an index to turn on Resource Explorer in the account.
     * Resource Explorer uses this to create the <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/security_iam_service-linked-roles.html"
     * >service-linked role needed to index the resources in your account</a>. Resource Explorer uses the same
     * service-linked role for all additional indexes you create afterwards.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ConflictException
     *         You tried to create a new view or index when one already exists, and you either didn't specify or
     *         specified a different idempotency token as the original request.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateIndex"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIndexResult createIndex(CreateIndexRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIndex(request);
    }

    @SdkInternalApi
    final CreateIndexResult executeCreateIndex(CreateIndexRequest createIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(createIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIndexRequest> request = null;
        Response<CreateIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a view that users can query by using the <a>Search</a> operation. Results from queries that you make
     * using this view include only resources that match the view's <code>Filters</code>. For more information about
     * Amazon Web Services Resource Explorer views, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views.html">Managing views</a> in the
     * <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * <p>
     * Only the principals with an IAM identity-based policy that grants <code>Allow</code> to the <code>Search</code>
     * action on a <code>Resource</code> with the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name (ARN)</a>
     * of this view can <a>Search</a> using views you create with this operation.
     * </p>
     * 
     * @param createViewRequest
     * @return Result of the CreateView operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ConflictException
     *         You tried to create a new view or index when one already exists, and you either didn't specify or
     *         specified a different idempotency token as the original request.
     * @throws ServiceQuotaExceededException
     *         The request failed because it exceeds a service quota.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.CreateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateView" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateViewResult createView(CreateViewRequest request) {
        request = beforeClientExecution(request);
        return executeCreateView(request);
    }

    @SdkInternalApi
    final CreateViewResult executeCreateView(CreateViewRequest createViewRequest) {

        ExecutionContext executionContext = createExecutionContext(createViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateViewRequest> request = null;
        Response<CreateViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateViewResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified index and turns off Amazon Web Services Resource Explorer in the specified Amazon Web
     * Services Region. When you delete an index, Resource Explorer stops discovering and indexing resources in that
     * Region. Resource Explorer also deletes all views in that Region. These actions occur as asynchronous background
     * tasks. You can check to see when the actions are complete by using the <a>GetIndex</a> operation and checking the
     * <code>Status</code> response value.
     * </p>
     * <note>
     * <p>
     * If the index you delete is the aggregator index for the Amazon Web Services account, you must wait 24 hours
     * before you can promote another local index to be the aggregator index for the account. Users can't perform
     * account-wide searches using Resource Explorer until another aggregator index is configured.
     * </p>
     * </note>
     * 
     * @param deleteIndexRequest
     * @return Result of the DeleteIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DeleteIndex"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIndexResult deleteIndex(DeleteIndexRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIndex(request);
    }

    @SdkInternalApi
    final DeleteIndexResult executeDeleteIndex(DeleteIndexRequest deleteIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIndexRequest> request = null;
        Response<DeleteIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified view.
     * </p>
     * <p>
     * If the specified view is the default view for its Amazon Web Services Region, then all <a>Search</a> operations
     * in that Region must explicitly specify the view to use until you configure a new default by calling the
     * <a>AssociateDefaultView</a> operation.
     * </p>
     * 
     * @param deleteViewRequest
     * @return Result of the DeleteView operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.DeleteView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DeleteView" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteViewResult deleteView(DeleteViewRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteView(request);
    }

    @SdkInternalApi
    final DeleteViewResult executeDeleteView(DeleteViewRequest deleteViewRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteViewRequest> request = null;
        Response<DeleteViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteViewResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * After you call this operation, the affected Amazon Web Services Region no longer has a default view. All
     * <a>Search</a> operations in that Region must explicitly specify a view or the operation fails. You can configure
     * a new default by calling the <a>AssociateDefaultView</a> operation.
     * </p>
     * <p>
     * If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a
     * view with every <code>Search</code> operation performed in that Region.
     * </p>
     * 
     * @param disassociateDefaultViewRequest
     * @return Result of the DisassociateDefaultView operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.DisassociateDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DisassociateDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateDefaultViewResult disassociateDefaultView(DisassociateDefaultViewRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDefaultView(request);
    }

    @SdkInternalApi
    final DisassociateDefaultViewResult executeDisassociateDefaultView(DisassociateDefaultViewRequest disassociateDefaultViewRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDefaultViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDefaultViewRequest> request = null;
        Response<DisassociateDefaultViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDefaultViewRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateDefaultViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDefaultView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDefaultViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateDefaultViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Amazon Resource Name (ARN) of the view that is the default for the Amazon Web Services Region in
     * which you call this operation. You can then call <a>GetView</a> to retrieve the details of that view.
     * </p>
     * 
     * @param getDefaultViewRequest
     * @return Result of the GetDefaultView operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.GetDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDefaultViewResult getDefaultView(GetDefaultViewRequest request) {
        request = beforeClientExecution(request);
        return executeGetDefaultView(request);
    }

    @SdkInternalApi
    final GetDefaultViewResult executeGetDefaultView(GetDefaultViewRequest getDefaultViewRequest) {

        ExecutionContext executionContext = createExecutionContext(getDefaultViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDefaultViewRequest> request = null;
        Response<GetDefaultViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDefaultViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDefaultViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDefaultView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDefaultViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDefaultViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about the Amazon Web Services Resource Explorer index in the Amazon Web Services Region in
     * which you invoked the operation.
     * </p>
     * 
     * @param getIndexRequest
     * @return Result of the GetIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.GetIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetIndex" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetIndexResult getIndex(GetIndexRequest request) {
        request = beforeClientExecution(request);
        return executeGetIndex(request);
    }

    @SdkInternalApi
    final GetIndexResult executeGetIndex(GetIndexRequest getIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(getIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIndexRequest> request = null;
        Response<GetIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIndexResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details of the specified view.
     * </p>
     * 
     * @param getViewRequest
     * @return Result of the GetView operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.GetView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetView" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetViewResult getView(GetViewRequest request) {
        request = beforeClientExecution(request);
        return executeGetView(request);
    }

    @SdkInternalApi
    final GetViewResult executeGetView(GetViewRequest getViewRequest) {

        ExecutionContext executionContext = createExecutionContext(getViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetViewRequest> request = null;
        Response<GetViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetViewResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all of the indexes in Amazon Web Services Regions that are currently collecting resource
     * information for Amazon Web Services Resource Explorer.
     * </p>
     * 
     * @param listIndexesRequest
     * @return Result of the ListIndexes operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.ListIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListIndexes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIndexesResult listIndexes(ListIndexesRequest request) {
        request = beforeClientExecution(request);
        return executeListIndexes(request);
    }

    @SdkInternalApi
    final ListIndexesResult executeListIndexes(ListIndexesRequest listIndexesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIndexesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIndexesRequest> request = null;
        Response<ListIndexesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIndexesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIndexesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIndexes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIndexesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIndexesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all resource types currently supported by Amazon Web Services Resource Explorer.
     * </p>
     * 
     * @param listSupportedResourceTypesRequest
     * @return Result of the ListSupportedResourceTypes operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.ListSupportedResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListSupportedResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSupportedResourceTypesResult listSupportedResourceTypes(ListSupportedResourceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListSupportedResourceTypes(request);
    }

    @SdkInternalApi
    final ListSupportedResourceTypesResult executeListSupportedResourceTypes(ListSupportedResourceTypesRequest listSupportedResourceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSupportedResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSupportedResourceTypesRequest> request = null;
        Response<ListSupportedResourceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSupportedResourceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSupportedResourceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSupportedResourceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSupportedResourceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSupportedResourceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that are attached to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
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
     * Lists the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> of the views available in the Amazon Web Services Region in which you call this operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a paginated
     * operation. These operations can occasionally return an empty set of results even when there are more results
     * available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i> when there are no
     * more results to display.
     * </p>
     * </note>
     * 
     * @param listViewsRequest
     * @return Result of the ListViews operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.ListViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListViews" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListViewsResult listViews(ListViewsRequest request) {
        request = beforeClientExecution(request);
        return executeListViews(request);
    }

    @SdkInternalApi
    final ListViewsResult executeListViews(ListViewsRequest listViewsRequest) {

        ExecutionContext executionContext = createExecutionContext(listViewsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListViewsRequest> request = null;
        Response<ListViewsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListViewsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listViewsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListViews");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListViewsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListViewsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for resources and displays details about all resources that match the specified criteria. You must
     * specify a query string.
     * </p>
     * <p>
     * All search queries must use a view. If you don't explicitly specify a view, then Amazon Web Services Resource
     * Explorer uses the default view for the Amazon Web Services Region in which you call this operation. The results
     * are the logical intersection of the results that match both the <code>QueryString</code> parameter supplied to
     * this operation and the <code>SearchFilter</code> parameter attached to the view.
     * </p>
     * <p>
     * For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search query
     * syntax reference for Resource Explorer</a>.
     * </p>
     * <p>
     * If your search results are empty, or are missing results that you think should be there, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/troubleshooting_search.html">Troubleshooting
     * Resource Explorer search</a>.
     * </p>
     * 
     * @param searchRequest
     * @return Result of the Search operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/Search" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchResult search(SearchRequest request) {
        request = beforeClientExecution(request);
        return executeSearch(request);
    }

    @SdkInternalApi
    final SearchResult executeSearch(SearchRequest searchRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRequest> request = null;
        Response<SearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Search");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tag key and value pairs to an Amazon Web Services Resource Explorer view or index.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ConflictException
     *         You tried to create a new view or index when one already exists, and you either didn't specify or
     *         specified a different idempotency token as the original request.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
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
     * Removes one or more tag key and value pairs from an Amazon Web Services Resource Explorer view or index.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
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
     * Changes the type of the index from one of the following types to the other. For more information about indexes
     * and the role they perform in Amazon Web Services Resource Explorer, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a> in the <i>Amazon Web Services Resource Explorer User
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>AGGREGATOR</code> index type</b>
     * </p>
     * <p>
     * The index contains information about resources from all Amazon Web Services Regions in the Amazon Web Services
     * account in which you've created a Resource Explorer index. Resource information from all other Regions is
     * replicated to this Region's index.
     * </p>
     * <p>
     * When you change the index type to <code>AGGREGATOR</code>, Resource Explorer turns on replication of all
     * discovered resource information from the other Amazon Web Services Regions in your account to this index. You can
     * then, from this Region only, perform resource search queries that span all Amazon Web Services Regions in the
     * Amazon Web Services account. Turning on replication from all other Regions is performed by asynchronous
     * background tasks. You can check the status of the asynchronous tasks by using the <a>GetIndex</a> operation. When
     * the asynchronous tasks complete, the <code>Status</code> response of that operation changes from
     * <code>UPDATING</code> to <code>ACTIVE</code>. After that, you can start to see results from other Amazon Web
     * Services Regions in query results. However, it can take several hours for replication from all other Regions to
     * complete.
     * </p>
     * <important>
     * <p>
     * You can have only one aggregator index per Amazon Web Services account. Before you can promote a different index
     * to be the aggregator index for the account, you must first demote the existing aggregator index to type
     * <code>LOCAL</code>.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b> <code>LOCAL</code> index type</b>
     * </p>
     * <p>
     * The index contains information about resources in only the Amazon Web Services Region in which the index exists.
     * If an aggregator index in another Region exists, then information in this local index is replicated to the
     * aggregator index.
     * </p>
     * <p>
     * When you change the index type to <code>LOCAL</code>, Resource Explorer turns off the replication of resource
     * information from all other Amazon Web Services Regions in the Amazon Web Services account to this Region. The
     * aggregator index remains in the <code>UPDATING</code> state until all replication with other Regions successfully
     * stops. You can check the status of the asynchronous task by using the <a>GetIndex</a> operation. When Resource
     * Explorer successfully stops all replication with other Regions, the <code>Status</code> response of that
     * operation changes from <code>UPDATING</code> to <code>ACTIVE</code>. Separately, the resource information from
     * other Regions that was previously stored in the index is deleted within 30 days by another background task. Until
     * that asynchronous task completes, some results from other Regions can continue to appear in search results.
     * </p>
     * <important>
     * <p>
     * After you demote an aggregator index to a local index, you must wait 24 hours before you can promote another
     * index to be the new aggregator index for the account.
     * </p>
     * </important></li>
     * </ul>
     * 
     * @param updateIndexTypeRequest
     * @return Result of the UpdateIndexType operation returned by the service.
     * @throws ResourceNotFoundException
     *         You specified a resource that doesn't exist. Check the ID or ARN that you used to identity the resource,
     *         and try again.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ConflictException
     *         You tried to create a new view or index when one already exists, and you either didn't specify or
     *         specified a different idempotency token as the original request.
     * @throws ServiceQuotaExceededException
     *         The request failed because it exceeds a service quota.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.UpdateIndexType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateIndexType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIndexTypeResult updateIndexType(UpdateIndexTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIndexType(request);
    }

    @SdkInternalApi
    final UpdateIndexTypeResult executeUpdateIndexType(UpdateIndexTypeRequest updateIndexTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIndexTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIndexTypeRequest> request = null;
        Response<UpdateIndexTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIndexTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIndexTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIndexType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIndexTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIndexTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies some of the details of a view. You can change the filter string and the list of included properties. You
     * can't change the name of the view.
     * </p>
     * 
     * @param updateViewRequest
     * @return Result of the UpdateView operation returned by the service.
     * @throws InternalServerException
     *         The request failed because of internal service error. Try your request again later.
     * @throws ValidationException
     *         You provided an invalid value for one of the operation's parameters. Check the syntax for the operation,
     *         and try again.
     * @throws ServiceQuotaExceededException
     *         The request failed because it exceeds a service quota.
     * @throws UnauthorizedException
     *         The principal making the request isn't permitted to perform the operation.
     * @throws ThrottlingException
     *         The request failed because you exceeded a rate limit for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/arexug/mainline/quotas.html">Quotas for Resource Explorer</a>.
     * @throws AccessDeniedException
     *         The credentials that you used to call this operation don't have the minimum required permissions.
     * @sample AWSResourceExplorer2.UpdateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateView" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateViewResult updateView(UpdateViewRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateView(request);
    }

    @SdkInternalApi
    final UpdateViewResult executeUpdateView(UpdateViewRequest updateViewRequest) {

        ExecutionContext executionContext = createExecutionContext(updateViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateViewRequest> request = null;
        Response<UpdateViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Explorer 2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateViewResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateViewResultJsonUnmarshaller());
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
