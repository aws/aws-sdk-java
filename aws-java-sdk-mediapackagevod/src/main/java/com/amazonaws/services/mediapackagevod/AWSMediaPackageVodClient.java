/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagevod;

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

import com.amazonaws.services.mediapackagevod.AWSMediaPackageVodClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediapackagevod.model.*;
import com.amazonaws.services.mediapackagevod.model.transform.*;

/**
 * Client for accessing MediaPackage Vod. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * AWS Elemental MediaPackage VOD
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaPackageVodClient extends AmazonWebServiceClient implements AWSMediaPackageVod {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaPackageVod.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediapackage-vod";

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
                            new JsonErrorShapeMetadata().withErrorCode("UnprocessableEntityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagevod.model.transform.UnprocessableEntityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagevod.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagevod.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagevod.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagevod.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagevod.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediapackagevod.model.AWSMediaPackageVodException.class));

    public static AWSMediaPackageVodClientBuilder builder() {
        return AWSMediaPackageVodClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaPackage Vod using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageVodClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaPackage Vod using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageVodClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mediapackage-vod.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediapackagevod/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediapackagevod/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Creates a new MediaPackage VOD Asset resource.
     * 
     * @param createAssetRequest
     *        A new MediaPackage VOD Asset configuration.
     * @return Result of the CreateAsset operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreateAsset" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAssetResult createAsset(CreateAssetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAsset(request);
    }

    @SdkInternalApi
    final CreateAssetResult executeCreateAsset(CreateAssetRequest createAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetRequest> request = null;
        Response<CreateAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param createPackagingConfigurationRequest
     *        A new MediaPackage VOD PackagingConfiguration resource configuration.
     * @return Result of the CreatePackagingConfiguration operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.CreatePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePackagingConfigurationResult createPackagingConfiguration(CreatePackagingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePackagingConfiguration(request);
    }

    @SdkInternalApi
    final CreatePackagingConfigurationResult executeCreatePackagingConfiguration(CreatePackagingConfigurationRequest createPackagingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createPackagingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePackagingConfigurationRequest> request = null;
        Response<CreatePackagingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePackagingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPackagingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePackagingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePackagingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePackagingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new MediaPackage VOD PackagingGroup resource.
     * 
     * @param createPackagingGroupRequest
     *        A new MediaPackage VOD PackagingGroup resource configuration.
     * @return Result of the CreatePackagingGroup operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.CreatePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePackagingGroupResult createPackagingGroup(CreatePackagingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePackagingGroup(request);
    }

    @SdkInternalApi
    final CreatePackagingGroupResult executeCreatePackagingGroup(CreatePackagingGroupRequest createPackagingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createPackagingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePackagingGroupRequest> request = null;
        Response<CreatePackagingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePackagingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPackagingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePackagingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePackagingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePackagingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an existing MediaPackage VOD Asset resource.
     * 
     * @param deleteAssetRequest
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeleteAsset" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAssetResult deleteAsset(DeleteAssetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAsset(request);
    }

    @SdkInternalApi
    final DeleteAssetResult executeDeleteAsset(DeleteAssetRequest deleteAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetRequest> request = null;
        Response<DeleteAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param deletePackagingConfigurationRequest
     * @return Result of the DeletePackagingConfiguration operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DeletePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePackagingConfigurationResult deletePackagingConfiguration(DeletePackagingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePackagingConfiguration(request);
    }

    @SdkInternalApi
    final DeletePackagingConfigurationResult executeDeletePackagingConfiguration(DeletePackagingConfigurationRequest deletePackagingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePackagingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackagingConfigurationRequest> request = null;
        Response<DeletePackagingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackagingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePackagingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePackagingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePackagingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePackagingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a MediaPackage VOD PackagingGroup resource.
     * 
     * @param deletePackagingGroupRequest
     * @return Result of the DeletePackagingGroup operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DeletePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePackagingGroupResult deletePackagingGroup(DeletePackagingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePackagingGroup(request);
    }

    @SdkInternalApi
    final DeletePackagingGroupResult executeDeletePackagingGroup(DeletePackagingGroupRequest deletePackagingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePackagingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackagingGroupRequest> request = null;
        Response<DeletePackagingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackagingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePackagingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePackagingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePackagingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePackagingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a description of a MediaPackage VOD Asset resource.
     * 
     * @param describeAssetRequest
     * @return Result of the DescribeAsset operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribeAsset" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAssetResult describeAsset(DescribeAssetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAsset(request);
    }

    @SdkInternalApi
    final DescribeAssetResult executeDescribeAsset(DescribeAssetRequest describeAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssetRequest> request = null;
        Response<DescribeAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param describePackagingConfigurationRequest
     * @return Result of the DescribePackagingConfiguration operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DescribePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePackagingConfigurationResult describePackagingConfiguration(DescribePackagingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackagingConfiguration(request);
    }

    @SdkInternalApi
    final DescribePackagingConfigurationResult executeDescribePackagingConfiguration(DescribePackagingConfigurationRequest describePackagingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackagingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackagingConfigurationRequest> request = null;
        Response<DescribePackagingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackagingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePackagingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackagingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackagingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePackagingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a description of a MediaPackage VOD PackagingGroup resource.
     * 
     * @param describePackagingGroupRequest
     * @return Result of the DescribePackagingGroup operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DescribePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePackagingGroupResult describePackagingGroup(DescribePackagingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackagingGroup(request);
    }

    @SdkInternalApi
    final DescribePackagingGroupResult executeDescribePackagingGroup(DescribePackagingGroupRequest describePackagingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackagingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackagingGroupRequest> request = null;
        Response<DescribePackagingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackagingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePackagingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackagingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackagingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePackagingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a collection of MediaPackage VOD Asset resources.
     * 
     * @param listAssetsRequest
     * @return Result of the ListAssets operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListAssets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssetsResult listAssets(ListAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssets(request);
    }

    @SdkInternalApi
    final ListAssetsResult executeListAssets(ListAssetsRequest listAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetsRequest> request = null;
        Response<ListAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
     * 
     * @param listPackagingConfigurationsRequest
     * @return Result of the ListPackagingConfigurations operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.ListPackagingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPackagingConfigurationsResult listPackagingConfigurations(ListPackagingConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListPackagingConfigurations(request);
    }

    @SdkInternalApi
    final ListPackagingConfigurationsResult executeListPackagingConfigurations(ListPackagingConfigurationsRequest listPackagingConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackagingConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagingConfigurationsRequest> request = null;
        Response<ListPackagingConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagingConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPackagingConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackagingConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackagingConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPackagingConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a collection of MediaPackage VOD PackagingGroup resources.
     * 
     * @param listPackagingGroupsRequest
     * @return Result of the ListPackagingGroups operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.ListPackagingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPackagingGroupsResult listPackagingGroups(ListPackagingGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListPackagingGroups(request);
    }

    @SdkInternalApi
    final ListPackagingGroupsResult executeListPackagingGroups(ListPackagingGroupsRequest listPackagingGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackagingGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagingGroupsRequest> request = null;
        Response<ListPackagingGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagingGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPackagingGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage Vod");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackagingGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackagingGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPackagingGroupsResultJsonUnmarshaller());
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
