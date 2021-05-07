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
package com.amazonaws.services.lakeformation;

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

import com.amazonaws.services.lakeformation.AWSLakeFormationClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lakeformation.model.*;
import com.amazonaws.services.lakeformation.model.transform.*;

/**
 * Client for accessing AWS Lake Formation. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS Lake Formation</fullname>
 * <p>
 * Defines the public endpoint for the AWS Lake Formation service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLakeFormationClient extends AmazonWebServiceClient implements AWSLakeFormation {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLakeFormation.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lakeformation";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNumberLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.ResourceNumberLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.AlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntityNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.EntityNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GlueEncryptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.GlueEncryptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.OperationTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lakeformation.model.transform.InternalServiceExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lakeformation.model.AWSLakeFormationException.class));

    public static AWSLakeFormationClientBuilder builder() {
        return AWSLakeFormationClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lake Formation using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLakeFormationClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lake Formation using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLakeFormationClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lakeformation.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lakeformation/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lakeformation/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Attaches one or more tags to an existing resource.
     * </p>
     * 
     * @param addLFTagsToResourceRequest
     * @return Result of the AddLFTagsToResource operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.AddLFTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddLFTagsToResourceResult addLFTagsToResource(AddLFTagsToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddLFTagsToResource(request);
    }

    @SdkInternalApi
    final AddLFTagsToResourceResult executeAddLFTagsToResource(AddLFTagsToResourceRequest addLFTagsToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addLFTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddLFTagsToResourceRequest> request = null;
        Response<AddLFTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddLFTagsToResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addLFTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddLFTagsToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddLFTagsToResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddLFTagsToResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Batch operation to grant permissions to the principal.
     * </p>
     * 
     * @param batchGrantPermissionsRequest
     * @return Result of the BatchGrantPermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.BatchGrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchGrantPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGrantPermissionsResult batchGrantPermissions(BatchGrantPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGrantPermissions(request);
    }

    @SdkInternalApi
    final BatchGrantPermissionsResult executeBatchGrantPermissions(BatchGrantPermissionsRequest batchGrantPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGrantPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGrantPermissionsRequest> request = null;
        Response<BatchGrantPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGrantPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGrantPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGrantPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGrantPermissionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchGrantPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Batch operation to revoke permissions from the principal.
     * </p>
     * 
     * @param batchRevokePermissionsRequest
     * @return Result of the BatchRevokePermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.BatchRevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchRevokePermissionsResult batchRevokePermissions(BatchRevokePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchRevokePermissions(request);
    }

    @SdkInternalApi
    final BatchRevokePermissionsResult executeBatchRevokePermissions(BatchRevokePermissionsRequest batchRevokePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchRevokePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchRevokePermissionsRequest> request = null;
        Response<BatchRevokePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchRevokePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchRevokePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchRevokePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchRevokePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchRevokePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a tag with the specified name and values.
     * </p>
     * 
     * @param createLFTagRequest
     * @return Result of the CreateLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.CreateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLFTagResult createLFTag(CreateLFTagRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLFTag(request);
    }

    @SdkInternalApi
    final CreateLFTagResult executeCreateLFTag(CreateLFTagRequest createLFTagRequest) {

        ExecutionContext executionContext = createExecutionContext(createLFTagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLFTagRequest> request = null;
        Response<CreateLFTagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLFTagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLFTagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLFTag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLFTagResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLFTagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified tag key name. If the attribute key does not exist or the tag does not exist, then the
     * operation will not do anything. If the attribute key exists, then the operation checks if any resources are
     * tagged with this attribute key, if yes, the API throws a 400 Exception with the message "Delete not allowed" as
     * the tag key is still attached with resources. You can consider untagging resources with this tag key.
     * </p>
     * 
     * @param deleteLFTagRequest
     * @return Result of the DeleteLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.DeleteLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLFTagResult deleteLFTag(DeleteLFTagRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLFTag(request);
    }

    @SdkInternalApi
    final DeleteLFTagResult executeDeleteLFTag(DeleteLFTagRequest deleteLFTagRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLFTagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLFTagRequest> request = null;
        Response<DeleteLFTagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLFTagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLFTagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLFTag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLFTagResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLFTagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * When you deregister a path, Lake Formation removes the path from the inline policy attached to your
     * service-linked role.
     * </p>
     * 
     * @param deregisterResourceRequest
     * @return Result of the DeregisterResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.DeregisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeregisterResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterResourceResult deregisterResource(DeregisterResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterResource(request);
    }

    @SdkInternalApi
    final DeregisterResourceResult executeDeregisterResource(DeregisterResourceRequest deregisterResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterResourceRequest> request = null;
        Response<DeregisterResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current data access role for the given resource registered in AWS Lake Formation.
     * </p>
     * 
     * @param describeResourceRequest
     * @return Result of the DescribeResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeResourceResult describeResource(DescribeResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResource(request);
    }

    @SdkInternalApi
    final DescribeResourceResult executeDescribeResource(DescribeResourceRequest describeResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceRequest> request = null;
        Response<DescribeResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake.
     * </p>
     * 
     * @param getDataLakeSettingsRequest
     * @return Result of the GetDataLakeSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.GetDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDataLakeSettingsResult getDataLakeSettings(GetDataLakeSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataLakeSettings(request);
    }

    @SdkInternalApi
    final GetDataLakeSettingsResult executeGetDataLakeSettings(GetDataLakeSettingsRequest getDataLakeSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataLakeSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataLakeSettingsRequest> request = null;
        Response<GetDataLakeSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataLakeSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataLakeSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataLakeSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataLakeSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataLakeSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3.
     * <code>GetEffectivePermissionsForPath</code> will not return databases and tables if the catalog is encrypted.
     * </p>
     * 
     * @param getEffectivePermissionsForPathRequest
     * @return Result of the GetEffectivePermissionsForPath operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.GetEffectivePermissionsForPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEffectivePermissionsForPathResult getEffectivePermissionsForPath(GetEffectivePermissionsForPathRequest request) {
        request = beforeClientExecution(request);
        return executeGetEffectivePermissionsForPath(request);
    }

    @SdkInternalApi
    final GetEffectivePermissionsForPathResult executeGetEffectivePermissionsForPath(GetEffectivePermissionsForPathRequest getEffectivePermissionsForPathRequest) {

        ExecutionContext executionContext = createExecutionContext(getEffectivePermissionsForPathRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEffectivePermissionsForPathRequest> request = null;
        Response<GetEffectivePermissionsForPathResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEffectivePermissionsForPathRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEffectivePermissionsForPathRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEffectivePermissionsForPath");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEffectivePermissionsForPathResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEffectivePermissionsForPathResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a tag definition.
     * </p>
     * 
     * @param getLFTagRequest
     * @return Result of the GetLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.GetLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLFTagResult getLFTag(GetLFTagRequest request) {
        request = beforeClientExecution(request);
        return executeGetLFTag(request);
    }

    @SdkInternalApi
    final GetLFTagResult executeGetLFTag(GetLFTagRequest getLFTagRequest) {

        ExecutionContext executionContext = createExecutionContext(getLFTagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLFTagRequest> request = null;
        Response<GetLFTagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLFTagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLFTagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLFTag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLFTagResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLFTagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the tags applied to a resource.
     * </p>
     * 
     * @param getResourceLFTagsRequest
     * @return Result of the GetResourceLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.GetResourceLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceLFTagsResult getResourceLFTags(GetResourceLFTagsRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceLFTags(request);
    }

    @SdkInternalApi
    final GetResourceLFTagsResult executeGetResourceLFTags(GetResourceLFTagsRequest getResourceLFTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceLFTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceLFTagsRequest> request = null;
        Response<GetResourceLFTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceLFTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceLFTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceLFTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceLFTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourceLFTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param grantPermissionsRequest
     * @return Result of the GrantPermissions operation returned by the service.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.GrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GrantPermissionsResult grantPermissions(GrantPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeGrantPermissions(request);
    }

    @SdkInternalApi
    final GrantPermissionsResult executeGrantPermissions(GrantPermissionsRequest grantPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(grantPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GrantPermissionsRequest> request = null;
        Response<GrantPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GrantPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(grantPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GrantPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GrantPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GrantPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags that the requester has permission to view.
     * </p>
     * 
     * @param listLFTagsRequest
     * @return Result of the ListLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.ListLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLFTagsResult listLFTags(ListLFTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListLFTags(request);
    }

    @SdkInternalApi
    final ListLFTagsResult executeListLFTags(ListLFTagsRequest listLFTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLFTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLFTagsRequest> request = null;
        Response<ListLFTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLFTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLFTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLFTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLFTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLFTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For
     * example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER.
     * </p>
     * <p>
     * This operation returns only those permissions that have been explicitly granted.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return Result of the ListPermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPermissionsResult listPermissions(ListPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissions(request);
    }

    @SdkInternalApi
    final ListPermissionsResult executeListPermissions(ListPermissionsRequest listPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionsRequest> request = null;
        Response<ListPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resources registered to be managed by the Data Catalog.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListResourcesResult listResources(ListResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListResources(request);
    }

    @SdkInternalApi
    final ListResourcesResult executeListResources(ListResourcesRequest listResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesRequest> request = null;
        Response<ListResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation.
     * For more information on admin privileges, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/lake-formation-permissions.html">Granting Lake
     * Formation Permissions</a>.
     * </p>
     * <p>
     * This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the
     * current list and add the new admin to that list and pass that list in this API.
     * </p>
     * 
     * @param putDataLakeSettingsRequest
     * @return Result of the PutDataLakeSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.PutDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PutDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDataLakeSettingsResult putDataLakeSettings(PutDataLakeSettingsRequest request) {
        request = beforeClientExecution(request);
        return executePutDataLakeSettings(request);
    }

    @SdkInternalApi
    final PutDataLakeSettingsResult executePutDataLakeSettings(PutDataLakeSettingsRequest putDataLakeSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(putDataLakeSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDataLakeSettingsRequest> request = null;
        Response<PutDataLakeSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDataLakeSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDataLakeSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDataLakeSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDataLakeSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDataLakeSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that
     * you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role.
     * When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your
     * behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When
     * you register subsequent paths, Lake Formation adds the path to the existing policy.
     * </p>
     * <p>
     * The following request registers a new location and gives AWS Lake Formation permission to use the service-linked
     * role to access that location.
     * </p>
     * <p>
     * <code>ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true</code>
     * </p>
     * <p>
     * If <code>UseServiceLinkedRole</code> is not set to true, you must provide or set the <code>RoleArn</code>:
     * </p>
     * <p>
     * <code>arn:aws:iam::12345:role/my-data-access-role</code>
     * </p>
     * 
     * @param registerResourceRequest
     * @return Result of the RegisterResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @sample AWSLakeFormation.RegisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterResourceResult registerResource(RegisterResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterResource(request);
    }

    @SdkInternalApi
    final RegisterResourceResult executeRegisterResource(RegisterResourceRequest registerResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterResourceRequest> request = null;
        Response<RegisterResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag columns,
     * use the column inclusion list in <code>tableWithColumns</code> to specify column input.
     * </p>
     * 
     * @param removeLFTagsFromResourceRequest
     * @return Result of the RemoveLFTagsFromResource operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.RemoveLFTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RemoveLFTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveLFTagsFromResourceResult removeLFTagsFromResource(RemoveLFTagsFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveLFTagsFromResource(request);
    }

    @SdkInternalApi
    final RemoveLFTagsFromResourceResult executeRemoveLFTagsFromResource(RemoveLFTagsFromResourceRequest removeLFTagsFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeLFTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveLFTagsFromResourceRequest> request = null;
        Response<RemoveLFTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveLFTagsFromResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeLFTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveLFTagsFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveLFTagsFromResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveLFTagsFromResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * 
     * @param revokePermissionsRequest
     * @return Result of the RevokePermissions operation returned by the service.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.RevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RevokePermissionsResult revokePermissions(RevokePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeRevokePermissions(request);
    }

    @SdkInternalApi
    final RevokePermissionsResult executeRevokePermissions(RevokePermissionsRequest revokePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(revokePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokePermissionsRequest> request = null;
        Response<RevokePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation allows a search on <code>DATABASE</code> resources by <code>TagCondition</code>. This operation is
     * used by admins who want to grant user permissions on certain <code>TagConditions</code>. Before making a grant,
     * the admin can use <code>SearchDatabasesByTags</code> to find all resources where the given
     * <code>TagConditions</code> are valid to verify whether the returned resources can be shared.
     * </p>
     * 
     * @param searchDatabasesByLFTagsRequest
     * @return Result of the SearchDatabasesByLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.SearchDatabasesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchDatabasesByLFTagsResult searchDatabasesByLFTags(SearchDatabasesByLFTagsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchDatabasesByLFTags(request);
    }

    @SdkInternalApi
    final SearchDatabasesByLFTagsResult executeSearchDatabasesByLFTags(SearchDatabasesByLFTagsRequest searchDatabasesByLFTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchDatabasesByLFTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchDatabasesByLFTagsRequest> request = null;
        Response<SearchDatabasesByLFTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchDatabasesByLFTagsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchDatabasesByLFTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchDatabasesByLFTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchDatabasesByLFTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchDatabasesByLFTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation allows a search on <code>TABLE</code> resources by <code>LFTag</code>s. This will be used by
     * admins who want to grant user permissions on certain LFTags. Before making a grant, the admin can use
     * <code>SearchTablesByLFTags</code> to find all resources where the given <code>LFTag</code>s are valid to verify
     * whether the returned resources can be shared.
     * </p>
     * 
     * @param searchTablesByLFTagsRequest
     * @return Result of the SearchTablesByLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.SearchTablesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchTablesByLFTagsResult searchTablesByLFTags(SearchTablesByLFTagsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchTablesByLFTags(request);
    }

    @SdkInternalApi
    final SearchTablesByLFTagsResult executeSearchTablesByLFTags(SearchTablesByLFTagsRequest searchTablesByLFTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchTablesByLFTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchTablesByLFTagsRequest> request = null;
        Response<SearchTablesByLFTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchTablesByLFTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchTablesByLFTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchTablesByLFTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchTablesByLFTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchTablesByLFTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the list of possible values for the specified tag key. If the tag does not exist, the operation throws an
     * EntityNotFoundException. The values in the delete key values will be deleted from list of possible values. If any
     * value in the delete key values is attached to a resource, then API errors out with a 400 Exception -
     * "Update not allowed". Untag the attribute before deleting the tag key's value.
     * </p>
     * 
     * @param updateLFTagRequest
     * @return Result of the UpdateLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.UpdateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLFTagResult updateLFTag(UpdateLFTagRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLFTag(request);
    }

    @SdkInternalApi
    final UpdateLFTagResult executeUpdateLFTag(UpdateLFTagRequest updateLFTagRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLFTagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLFTagRequest> request = null;
        Response<UpdateLFTagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLFTagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLFTagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLFTag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLFTagResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLFTagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the data access role used for vending access to the given (registered) resource in AWS Lake Formation.
     * </p>
     * 
     * @param updateResourceRequest
     * @return Result of the UpdateResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateResourceResult updateResource(UpdateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResource(request);
    }

    @SdkInternalApi
    final UpdateResourceResult executeUpdateResource(UpdateResourceRequest updateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceRequest> request = null;
        Response<UpdateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LakeFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourceResultJsonUnmarshaller());
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
