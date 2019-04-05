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
package com.amazonaws.services.mediastore;

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

import com.amazonaws.services.mediastore.AWSMediaStoreClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediastore.model.*;
import com.amazonaws.services.mediastore.model.transform.*;

/**
 * Client for accessing MediaStore. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * An AWS Elemental MediaStore container is a namespace that holds folders and objects. You use a container endpoint to
 * create, read, and delete objects.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaStoreClient extends AmazonWebServiceClient implements AWSMediaStore {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaStore.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediastore";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ContainerNotFoundException").withModeledClass(
                                    com.amazonaws.services.mediastore.model.ContainerNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ContainerInUseException").withModeledClass(
                                    com.amazonaws.services.mediastore.model.ContainerInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyNotFoundException").withModeledClass(
                                    com.amazonaws.services.mediastore.model.PolicyNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CorsPolicyNotFoundException").withModeledClass(
                                    com.amazonaws.services.mediastore.model.CorsPolicyNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.mediastore.model.InternalServerErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.mediastore.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediastore.model.AWSMediaStoreException.class));

    public static AWSMediaStoreClientBuilder builder() {
        return AWSMediaStoreClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaStore using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaStoreClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaStore using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaStoreClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mediastore.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediastore/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediastore/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
     * </p>
     * 
     * @param createContainerRequest
     * @return Result of the CreateContainer operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws LimitExceededException
     *         A service limit has been exceeded.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.CreateContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CreateContainer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateContainerResult createContainer(CreateContainerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContainer(request);
    }

    @SdkInternalApi
    final CreateContainerResult executeCreateContainer(CreateContainerRequest createContainerRequest) {

        ExecutionContext executionContext = createExecutionContext(createContainerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContainerRequest> request = null;
        Response<CreateContainerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContainerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContainerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContainer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContainerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContainerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified container. Before you make a <code>DeleteContainer</code> request, delete any objects in
     * the container or in any folders in the container. You can delete only empty containers.
     * </p>
     * 
     * @param deleteContainerRequest
     * @return Result of the DeleteContainer operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteContainerResult deleteContainer(DeleteContainerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContainer(request);
    }

    @SdkInternalApi
    final DeleteContainerResult executeDeleteContainer(DeleteContainerRequest deleteContainerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContainerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContainerRequest> request = null;
        Response<DeleteContainerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContainerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContainerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContainer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContainerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContainerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the access policy that is associated with the specified container.
     * </p>
     * 
     * @param deleteContainerPolicyRequest
     * @return Result of the DeleteContainerPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteContainerPolicyResult deleteContainerPolicy(DeleteContainerPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContainerPolicy(request);
    }

    @SdkInternalApi
    final DeleteContainerPolicyResult executeDeleteContainerPolicy(DeleteContainerPolicyRequest deleteContainerPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContainerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContainerPolicyRequest> request = null;
        Response<DeleteContainerPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContainerPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContainerPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContainerPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContainerPolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteContainerPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:DeleteCorsPolicy</code> action.
     * The container owner has this permission by default and can grant this permission to others.
     * </p>
     * 
     * @param deleteCorsPolicyRequest
     * @return Result of the DeleteCorsPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws CorsPolicyNotFoundException
     *         The CORS policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteCorsPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCorsPolicyResult deleteCorsPolicy(DeleteCorsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCorsPolicy(request);
    }

    @SdkInternalApi
    final DeleteCorsPolicyResult executeDeleteCorsPolicy(DeleteCorsPolicyRequest deleteCorsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCorsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCorsPolicyRequest> request = null;
        Response<DeleteCorsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCorsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCorsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCorsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCorsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCorsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return Result of the DeleteLifecyclePolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
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
     * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a
     * container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint
     * does not change after it has been assigned. The <code>DescribeContainer</code> request returns a single
     * <code>Container</code> object based on <code>ContainerName</code>. To return all <code>Container</code> objects
     * that are associated with a specified AWS account, use <a>ListContainers</a>.
     * </p>
     * 
     * @param describeContainerRequest
     * @return Result of the DescribeContainer operation returned by the service.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DescribeContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DescribeContainer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeContainerResult describeContainer(DescribeContainerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContainer(request);
    }

    @SdkInternalApi
    final DescribeContainerResult executeDescribeContainer(DescribeContainerRequest describeContainerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContainerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContainerRequest> request = null;
        Response<DescribeContainerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContainerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeContainerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContainer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContainerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeContainerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the access policy for the specified container. For information about the data that is included in an
     * access policy, see the <a href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management
     * User Guide</a>.
     * </p>
     * 
     * @param getContainerPolicyRequest
     * @return Result of the GetContainerPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.GetContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContainerPolicyResult getContainerPolicy(GetContainerPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerPolicy(request);
    }

    @SdkInternalApi
    final GetContainerPolicyResult executeGetContainerPolicy(GetContainerPolicyRequest getContainerPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerPolicyRequest> request = null;
        Response<GetContainerPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContainerPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContainerPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:GetCorsPolicy</code> action. By
     * default, the container owner has this permission and can grant it to others.
     * </p>
     * 
     * @param getCorsPolicyRequest
     * @return Result of the GetCorsPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws CorsPolicyNotFoundException
     *         The CORS policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.GetCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCorsPolicyResult getCorsPolicy(GetCorsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetCorsPolicy(request);
    }

    @SdkInternalApi
    final GetCorsPolicyResult executeGetCorsPolicy(GetCorsPolicyRequest getCorsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getCorsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCorsPolicyRequest> request = null;
        Response<GetCorsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCorsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCorsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCorsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCorsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCorsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the object lifecycle policy that is assigned to a container.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return Result of the GetLifecyclePolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
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
     * Lists the properties of all containers in AWS Elemental MediaStore.
     * </p>
     * <p>
     * You can query to receive all the containers in one response. Or you can include the <code>MaxResults</code>
     * parameter to receive a limited number of containers in each response. In this case, the response includes a
     * token. To get the next set of containers, send the command again, this time with the <code>NextToken</code>
     * parameter (with the returned token as its value). The next set of responses appears, with a token if there are
     * still more containers to receive.
     * </p>
     * <p>
     * See also <a>DescribeContainer</a>, which gets the properties of one container.
     * </p>
     * 
     * @param listContainersRequest
     * @return Result of the ListContainers operation returned by the service.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.ListContainers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/ListContainers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListContainersResult listContainers(ListContainersRequest request) {
        request = beforeClientExecution(request);
        return executeListContainers(request);
    }

    @SdkInternalApi
    final ListContainersResult executeListContainers(ListContainersRequest listContainersRequest) {

        ExecutionContext executionContext = createExecutionContext(listContainersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContainersRequest> request = null;
        Response<ListContainersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContainersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContainersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContainers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContainersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListContainersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an access policy for the specified container to restrict the users and clients that can access it. For
     * information about the data that is included in an access policy, see the <a
     * href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management User Guide</a>.
     * </p>
     * <p>
     * For this release of the REST API, you can create only one policy for a container. If you enter
     * <code>PutContainerPolicy</code> twice, the second command modifies the existing policy.
     * </p>
     * 
     * @param putContainerPolicyRequest
     * @return Result of the PutContainerPolicy operation returned by the service.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.PutContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutContainerPolicyResult putContainerPolicy(PutContainerPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutContainerPolicy(request);
    }

    @SdkInternalApi
    final PutContainerPolicyResult executePutContainerPolicy(PutContainerPolicyRequest putContainerPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putContainerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutContainerPolicyRequest> request = null;
        Response<PutContainerPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutContainerPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putContainerPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutContainerPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutContainerPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutContainerPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service
     * cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to
     * access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
     * capability.
     * </p>
     * <p>
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules
     * that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to
     * 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses
     * the first applicable rule listed.
     * </p>
     * <p>
     * To learn more about CORS, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html">Cross-Origin Resource Sharing (CORS) in
     * AWS Elemental MediaStore</a>.
     * </p>
     * 
     * @param putCorsPolicyRequest
     * @return Result of the PutCorsPolicy operation returned by the service.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.PutCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutCorsPolicyResult putCorsPolicy(PutCorsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutCorsPolicy(request);
    }

    @SdkInternalApi
    final PutCorsPolicyResult executePutCorsPolicy(PutCorsPolicyRequest putCorsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putCorsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutCorsPolicyRequest> request = null;
        Response<PutCorsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutCorsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putCorsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutCorsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutCorsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutCorsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the
     * service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take
     * effect.
     * </p>
     * <p>
     * For information about how to construct an object lifecycle policy, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html">Components of
     * an Object Lifecycle Policy</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @return Result of the PutLifecyclePolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.PutLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutLifecyclePolicyResult putLifecyclePolicy(PutLifecyclePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutLifecyclePolicy(request);
    }

    @SdkInternalApi
    final PutLifecyclePolicyResult executePutLifecyclePolicy(PutLifecyclePolicyRequest putLifecyclePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecyclePolicyRequest> request = null;
        Response<PutLifecyclePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLifecyclePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLifecyclePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLifecyclePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLifecyclePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutLifecyclePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts access logging on the specified container. When you enable access logging on a container, MediaStore
     * delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param startAccessLoggingRequest
     * @return Result of the StartAccessLogging operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.StartAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StartAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartAccessLoggingResult startAccessLogging(StartAccessLoggingRequest request) {
        request = beforeClientExecution(request);
        return executeStartAccessLogging(request);
    }

    @SdkInternalApi
    final StartAccessLoggingResult executeStartAccessLogging(StartAccessLoggingRequest startAccessLoggingRequest) {

        ExecutionContext executionContext = createExecutionContext(startAccessLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAccessLoggingRequest> request = null;
        Response<StartAccessLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAccessLoggingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAccessLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAccessLogging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAccessLoggingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartAccessLoggingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops
     * sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
     * </p>
     * 
     * @param stopAccessLoggingRequest
     * @return Result of the StopAccessLogging operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.StopAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StopAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopAccessLoggingResult stopAccessLogging(StopAccessLoggingRequest request) {
        request = beforeClientExecution(request);
        return executeStopAccessLogging(request);
    }

    @SdkInternalApi
    final StopAccessLoggingResult executeStopAccessLogging(StopAccessLoggingRequest stopAccessLoggingRequest) {

        ExecutionContext executionContext = createExecutionContext(stopAccessLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAccessLoggingRequest> request = null;
        Response<StopAccessLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAccessLoggingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopAccessLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopAccessLogging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopAccessLoggingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopAccessLoggingResultJsonUnmarshaller());
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
