/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.tnb;

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

import com.amazonaws.services.tnb.AWSTnbClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.tnb.model.*;

import com.amazonaws.services.tnb.model.transform.*;

/**
 * Client for accessing AWS Telco Network Builder. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Telco Network Builder (TNB) is a network automation service that helps you deploy and manage
 * telecom networks. AWS TNB helps you with the lifecycle management of your telecommunication network functions
 * throughout planning, deployment, and post-deployment activities.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSTnbClient extends AmazonWebServiceClient implements AWSTnb {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSTnb.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "tnb";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.tnb.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.tnb.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.tnb.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.tnb.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.tnb.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.tnb.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.tnb.model.AWSTnbException.class));

    public static AWSTnbClientBuilder builder() {
        return AWSTnbClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Telco Network Builder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSTnbClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Telco Network Builder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSTnbClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("tnb.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/tnb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/tnb/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a network operation.
     * </p>
     * <p>
     * A network operation is any operation that is done to your network, such as network instance instantiation or
     * termination.
     * </p>
     * 
     * @param cancelSolNetworkOperationRequest
     * @return Result of the CancelSolNetworkOperation operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CancelSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CancelSolNetworkOperation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelSolNetworkOperationResult cancelSolNetworkOperation(CancelSolNetworkOperationRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSolNetworkOperation(request);
    }

    @SdkInternalApi
    final CancelSolNetworkOperationResult executeCancelSolNetworkOperation(CancelSolNetworkOperationRequest cancelSolNetworkOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelSolNetworkOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSolNetworkOperationRequest> request = null;
        Response<CancelSolNetworkOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSolNetworkOperationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelSolNetworkOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSolNetworkOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelSolNetworkOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelSolNetworkOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network. For more information, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/ug/function-packages.html">Function packages</a> in the <i>Amazon
     * Web Services Telco Network Builder User Guide</i>.
     * </p>
     * <p>
     * Creating a function package is the first step for creating a network in AWS TNB. This request creates an empty
     * container with an ID. The next step is to upload the actual CSAR zip file into that empty container. To upload
     * function package content, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolFunctionPackageContent.html"
     * >PutSolFunctionPackageContent</a>.
     * </p>
     * 
     * @param createSolFunctionPackageRequest
     * @return Result of the CreateSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CreateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSolFunctionPackageResult createSolFunctionPackage(CreateSolFunctionPackageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSolFunctionPackage(request);
    }

    @SdkInternalApi
    final CreateSolFunctionPackageResult executeCreateSolFunctionPackage(CreateSolFunctionPackageRequest createSolFunctionPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(createSolFunctionPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSolFunctionPackageRequest> request = null;
        Response<CreateSolFunctionPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSolFunctionPackageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSolFunctionPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSolFunctionPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSolFunctionPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSolFunctionPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed. Creating a network instance is the
     * third step after creating a network package. For more information about network instances, <a
     * href="https://docs.aws.amazon.com/tnb/latest/ug/network-instances.html">Network instances</a> in the <i>Amazon
     * Web Services Telco Network Builder User Guide</i>.
     * </p>
     * <p>
     * Once you create a network instance, you can instantiate it. To instantiate a network, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_InstantiateSolNetworkInstance.html"
     * >InstantiateSolNetworkInstance</a>.
     * </p>
     * 
     * @param createSolNetworkInstanceRequest
     * @return Result of the CreateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CreateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSolNetworkInstanceResult createSolNetworkInstance(CreateSolNetworkInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSolNetworkInstance(request);
    }

    @SdkInternalApi
    final CreateSolNetworkInstanceResult executeCreateSolNetworkInstance(CreateSolNetworkInstanceRequest createSolNetworkInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createSolNetworkInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSolNetworkInstanceRequest> request = null;
        Response<CreateSolNetworkInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSolNetworkInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSolNetworkInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSolNetworkInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSolNetworkInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSolNetworkInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on. For more information, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/ug/network-instances.html">Network instances</a> in the <i>Amazon
     * Web Services Telco Network Builder User Guide</i>.
     * </p>
     * <p>
     * A network package consists of a network service descriptor (NSD) file (required) and any additional files
     * (optional), such as scripts specific to your needs. For example, if you have multiple function packages in your
     * network package, you can use the NSD to define which network functions should run in certain VPCs, subnets, or
     * EKS clusters.
     * </p>
     * <p>
     * This request creates an empty network package container with an ID. Once you create a network package, you can
     * upload the network package content using <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolNetworkPackageContent.html"
     * >PutSolNetworkPackageContent</a>.
     * </p>
     * 
     * @param createSolNetworkPackageRequest
     * @return Result of the CreateSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CreateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSolNetworkPackageResult createSolNetworkPackage(CreateSolNetworkPackageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSolNetworkPackage(request);
    }

    @SdkInternalApi
    final CreateSolNetworkPackageResult executeCreateSolNetworkPackage(CreateSolNetworkPackageRequest createSolNetworkPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(createSolNetworkPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSolNetworkPackageRequest> request = null;
        Response<CreateSolNetworkPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSolNetworkPackageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSolNetworkPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSolNetworkPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSolNetworkPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSolNetworkPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * <p>
     * To delete a function package, the package must be in a disabled state. To disable a function package, see <a
     * href=
     * "https://docs.aws.amazon.com/tnb/latest/APIReference/API_UpdateSolFunctionPackage.html">UpdateSolFunctionPackage
     * </a>.
     * </p>
     * 
     * @param deleteSolFunctionPackageRequest
     * @return Result of the DeleteSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.DeleteSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSolFunctionPackageResult deleteSolFunctionPackage(DeleteSolFunctionPackageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSolFunctionPackage(request);
    }

    @SdkInternalApi
    final DeleteSolFunctionPackageResult executeDeleteSolFunctionPackage(DeleteSolFunctionPackageRequest deleteSolFunctionPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSolFunctionPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSolFunctionPackageRequest> request = null;
        Response<DeleteSolFunctionPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSolFunctionPackageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSolFunctionPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSolFunctionPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSolFunctionPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSolFunctionPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * <p>
     * To delete a network instance, the instance must be in a stopped or terminated state. To terminate a network
     * instance, see <a href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_TerminateSolNetworkInstance.html">
     * TerminateSolNetworkInstance</a>.
     * </p>
     * 
     * @param deleteSolNetworkInstanceRequest
     * @return Result of the DeleteSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.DeleteSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSolNetworkInstanceResult deleteSolNetworkInstance(DeleteSolNetworkInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSolNetworkInstance(request);
    }

    @SdkInternalApi
    final DeleteSolNetworkInstanceResult executeDeleteSolNetworkInstance(DeleteSolNetworkInstanceRequest deleteSolNetworkInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSolNetworkInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSolNetworkInstanceRequest> request = null;
        Response<DeleteSolNetworkInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSolNetworkInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSolNetworkInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSolNetworkInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSolNetworkInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSolNetworkInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * <p>
     * To delete a network package, the package must be in a disable state. To disable a network package, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_UpdateSolNetworkPackage.html"
     * >UpdateSolNetworkPackage</a>.
     * </p>
     * 
     * @param deleteSolNetworkPackageRequest
     * @return Result of the DeleteSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.DeleteSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSolNetworkPackageResult deleteSolNetworkPackage(DeleteSolNetworkPackageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSolNetworkPackage(request);
    }

    @SdkInternalApi
    final DeleteSolNetworkPackageResult executeDeleteSolNetworkPackage(DeleteSolNetworkPackageRequest deleteSolNetworkPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSolNetworkPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSolNetworkPackageRequest> request = null;
        Response<DeleteSolNetworkPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSolNetworkPackageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSolNetworkPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSolNetworkPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSolNetworkPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSolNetworkPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a network function instance, including the instantation state and metadata from the function
     * package descriptor in the network function package.
     * </p>
     * <p>
     * A network function instance is a function in a function package .
     * </p>
     * 
     * @param getSolFunctionInstanceRequest
     * @return Result of the GetSolFunctionInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSolFunctionInstanceResult getSolFunctionInstance(GetSolFunctionInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolFunctionInstance(request);
    }

    @SdkInternalApi
    final GetSolFunctionInstanceResult executeGetSolFunctionInstance(GetSolFunctionInstanceRequest getSolFunctionInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolFunctionInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolFunctionInstanceRequest> request = null;
        Response<GetSolFunctionInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolFunctionInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSolFunctionInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolFunctionInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolFunctionInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSolFunctionInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of an individual function package, such as the operational state and whether the package is in
     * use.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network..
     * </p>
     * 
     * @param getSolFunctionPackageRequest
     * @return Result of the GetSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSolFunctionPackageResult getSolFunctionPackage(GetSolFunctionPackageRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolFunctionPackage(request);
    }

    @SdkInternalApi
    final GetSolFunctionPackageResult executeGetSolFunctionPackage(GetSolFunctionPackageRequest getSolFunctionPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolFunctionPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolFunctionPackageRequest> request = null;
        Response<GetSolFunctionPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolFunctionPackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSolFunctionPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolFunctionPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolFunctionPackageResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSolFunctionPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the contents of a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param getSolFunctionPackageContentRequest
     * @return Result of the GetSolFunctionPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSolFunctionPackageContentResult getSolFunctionPackageContent(GetSolFunctionPackageContentRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolFunctionPackageContent(request);
    }

    @SdkInternalApi
    final GetSolFunctionPackageContentResult executeGetSolFunctionPackageContent(GetSolFunctionPackageContentRequest getSolFunctionPackageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolFunctionPackageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolFunctionPackageContentRequest> request = null;
        Response<GetSolFunctionPackageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolFunctionPackageContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSolFunctionPackageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolFunctionPackageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolFunctionPackageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new GetSolFunctionPackageContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a function package descriptor in a function package.
     * </p>
     * <p>
     * A function package descriptor is a .yaml file in a function package that uses the TOSCA standard to describe how
     * the network function in the function package should run on your network.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param getSolFunctionPackageDescriptorRequest
     * @return Result of the GetSolFunctionPackageDescriptor operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSolFunctionPackageDescriptorResult getSolFunctionPackageDescriptor(GetSolFunctionPackageDescriptorRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolFunctionPackageDescriptor(request);
    }

    @SdkInternalApi
    final GetSolFunctionPackageDescriptorResult executeGetSolFunctionPackageDescriptor(
            GetSolFunctionPackageDescriptorRequest getSolFunctionPackageDescriptorRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolFunctionPackageDescriptorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolFunctionPackageDescriptorRequest> request = null;
        Response<GetSolFunctionPackageDescriptorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolFunctionPackageDescriptorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSolFunctionPackageDescriptorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolFunctionPackageDescriptor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolFunctionPackageDescriptorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new GetSolFunctionPackageDescriptorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of the network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * 
     * @param getSolNetworkInstanceRequest
     * @return Result of the GetSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSolNetworkInstanceResult getSolNetworkInstance(GetSolNetworkInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolNetworkInstance(request);
    }

    @SdkInternalApi
    final GetSolNetworkInstanceResult executeGetSolNetworkInstance(GetSolNetworkInstanceRequest getSolNetworkInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolNetworkInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolNetworkInstanceRequest> request = null;
        Response<GetSolNetworkInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolNetworkInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSolNetworkInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolNetworkInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolNetworkInstanceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSolNetworkInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a network operation, including the tasks involved in the network operation and the status of
     * the tasks.
     * </p>
     * <p>
     * A network operation is any operation that is done to your network, such as network instance instantiation or
     * termination.
     * </p>
     * 
     * @param getSolNetworkOperationRequest
     * @return Result of the GetSolNetworkOperation operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkOperation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSolNetworkOperationResult getSolNetworkOperation(GetSolNetworkOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolNetworkOperation(request);
    }

    @SdkInternalApi
    final GetSolNetworkOperationResult executeGetSolNetworkOperation(GetSolNetworkOperationRequest getSolNetworkOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolNetworkOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolNetworkOperationRequest> request = null;
        Response<GetSolNetworkOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolNetworkOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSolNetworkOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolNetworkOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolNetworkOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSolNetworkOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param getSolNetworkPackageRequest
     * @return Result of the GetSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSolNetworkPackageResult getSolNetworkPackage(GetSolNetworkPackageRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolNetworkPackage(request);
    }

    @SdkInternalApi
    final GetSolNetworkPackageResult executeGetSolNetworkPackage(GetSolNetworkPackageRequest getSolNetworkPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolNetworkPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolNetworkPackageRequest> request = null;
        Response<GetSolNetworkPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolNetworkPackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSolNetworkPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolNetworkPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolNetworkPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSolNetworkPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the contents of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param getSolNetworkPackageContentRequest
     * @return Result of the GetSolNetworkPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSolNetworkPackageContentResult getSolNetworkPackageContent(GetSolNetworkPackageContentRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolNetworkPackageContent(request);
    }

    @SdkInternalApi
    final GetSolNetworkPackageContentResult executeGetSolNetworkPackageContent(GetSolNetworkPackageContentRequest getSolNetworkPackageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolNetworkPackageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolNetworkPackageContentRequest> request = null;
        Response<GetSolNetworkPackageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolNetworkPackageContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSolNetworkPackageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolNetworkPackageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolNetworkPackageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new GetSolNetworkPackageContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the content of the network service descriptor.
     * </p>
     * <p>
     * A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the
     * network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network
     * functions on.
     * </p>
     * 
     * @param getSolNetworkPackageDescriptorRequest
     * @return Result of the GetSolNetworkPackageDescriptor operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSolNetworkPackageDescriptorResult getSolNetworkPackageDescriptor(GetSolNetworkPackageDescriptorRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolNetworkPackageDescriptor(request);
    }

    @SdkInternalApi
    final GetSolNetworkPackageDescriptorResult executeGetSolNetworkPackageDescriptor(GetSolNetworkPackageDescriptorRequest getSolNetworkPackageDescriptorRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolNetworkPackageDescriptorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolNetworkPackageDescriptorRequest> request = null;
        Response<GetSolNetworkPackageDescriptorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolNetworkPackageDescriptorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSolNetworkPackageDescriptorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolNetworkPackageDescriptor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolNetworkPackageDescriptorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new GetSolNetworkPackageDescriptorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Instantiates a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * <p>
     * Before you can instantiate a network instance, you have to create a network instance. For more information, see
     * <a href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_CreateSolNetworkInstance.html">
     * CreateSolNetworkInstance</a>.
     * </p>
     * 
     * @param instantiateSolNetworkInstanceRequest
     * @return Result of the InstantiateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.InstantiateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/InstantiateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public InstantiateSolNetworkInstanceResult instantiateSolNetworkInstance(InstantiateSolNetworkInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeInstantiateSolNetworkInstance(request);
    }

    @SdkInternalApi
    final InstantiateSolNetworkInstanceResult executeInstantiateSolNetworkInstance(InstantiateSolNetworkInstanceRequest instantiateSolNetworkInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(instantiateSolNetworkInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InstantiateSolNetworkInstanceRequest> request = null;
        Response<InstantiateSolNetworkInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InstantiateSolNetworkInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(instantiateSolNetworkInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InstantiateSolNetworkInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InstantiateSolNetworkInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new InstantiateSolNetworkInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists network function instances.
     * </p>
     * <p>
     * A network function instance is a function in a function package .
     * </p>
     * 
     * @param listSolFunctionInstancesRequest
     * @return Result of the ListSolFunctionInstances operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolFunctionInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSolFunctionInstancesResult listSolFunctionInstances(ListSolFunctionInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListSolFunctionInstances(request);
    }

    @SdkInternalApi
    final ListSolFunctionInstancesResult executeListSolFunctionInstances(ListSolFunctionInstancesRequest listSolFunctionInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSolFunctionInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolFunctionInstancesRequest> request = null;
        Response<ListSolFunctionInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolFunctionInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSolFunctionInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSolFunctionInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSolFunctionInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSolFunctionInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about function packages.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param listSolFunctionPackagesRequest
     * @return Result of the ListSolFunctionPackages operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolFunctionPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionPackages" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSolFunctionPackagesResult listSolFunctionPackages(ListSolFunctionPackagesRequest request) {
        request = beforeClientExecution(request);
        return executeListSolFunctionPackages(request);
    }

    @SdkInternalApi
    final ListSolFunctionPackagesResult executeListSolFunctionPackages(ListSolFunctionPackagesRequest listSolFunctionPackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSolFunctionPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolFunctionPackagesRequest> request = null;
        Response<ListSolFunctionPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolFunctionPackagesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSolFunctionPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSolFunctionPackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSolFunctionPackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSolFunctionPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your network instances.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * 
     * @param listSolNetworkInstancesRequest
     * @return Result of the ListSolNetworkInstances operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolNetworkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSolNetworkInstancesResult listSolNetworkInstances(ListSolNetworkInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListSolNetworkInstances(request);
    }

    @SdkInternalApi
    final ListSolNetworkInstancesResult executeListSolNetworkInstances(ListSolNetworkInstancesRequest listSolNetworkInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSolNetworkInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolNetworkInstancesRequest> request = null;
        Response<ListSolNetworkInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolNetworkInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSolNetworkInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSolNetworkInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSolNetworkInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSolNetworkInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists details for a network operation, including when the operation started and the status of the operation.
     * </p>
     * <p>
     * A network operation is any operation that is done to your network, such as network instance instantiation or
     * termination.
     * </p>
     * 
     * @param listSolNetworkOperationsRequest
     * @return Result of the ListSolNetworkOperations operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolNetworkOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkOperations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSolNetworkOperationsResult listSolNetworkOperations(ListSolNetworkOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSolNetworkOperations(request);
    }

    @SdkInternalApi
    final ListSolNetworkOperationsResult executeListSolNetworkOperations(ListSolNetworkOperationsRequest listSolNetworkOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSolNetworkOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolNetworkOperationsRequest> request = null;
        Response<ListSolNetworkOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolNetworkOperationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSolNetworkOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSolNetworkOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSolNetworkOperationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSolNetworkOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists network packages.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param listSolNetworkPackagesRequest
     * @return Result of the ListSolNetworkPackages operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolNetworkPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkPackages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSolNetworkPackagesResult listSolNetworkPackages(ListSolNetworkPackagesRequest request) {
        request = beforeClientExecution(request);
        return executeListSolNetworkPackages(request);
    }

    @SdkInternalApi
    final ListSolNetworkPackagesResult executeListSolNetworkPackages(ListSolNetworkPackagesRequest listSolNetworkPackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSolNetworkPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolNetworkPackagesRequest> request = null;
        Response<ListSolNetworkPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolNetworkPackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSolNetworkPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSolNetworkPackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSolNetworkPackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSolNetworkPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags for AWS TNB resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
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
     * Uploads the contents of a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param putSolFunctionPackageContentRequest
     * @return Result of the PutSolFunctionPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.PutSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutSolFunctionPackageContentResult putSolFunctionPackageContent(PutSolFunctionPackageContentRequest request) {
        request = beforeClientExecution(request);
        return executePutSolFunctionPackageContent(request);
    }

    @SdkInternalApi
    final PutSolFunctionPackageContentResult executePutSolFunctionPackageContent(PutSolFunctionPackageContentRequest putSolFunctionPackageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(putSolFunctionPackageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSolFunctionPackageContentRequest> request = null;
        Response<PutSolFunctionPackageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSolFunctionPackageContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putSolFunctionPackageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSolFunctionPackageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSolFunctionPackageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutSolFunctionPackageContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads the contents of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param putSolNetworkPackageContentRequest
     * @return Result of the PutSolNetworkPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.PutSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutSolNetworkPackageContentResult putSolNetworkPackageContent(PutSolNetworkPackageContentRequest request) {
        request = beforeClientExecution(request);
        return executePutSolNetworkPackageContent(request);
    }

    @SdkInternalApi
    final PutSolNetworkPackageContentResult executePutSolNetworkPackageContent(PutSolNetworkPackageContentRequest putSolNetworkPackageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(putSolNetworkPackageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSolNetworkPackageContentRequest> request = null;
        Response<PutSolNetworkPackageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSolNetworkPackageContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putSolNetworkPackageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSolNetworkPackageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSolNetworkPackageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutSolNetworkPackageContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags an AWS TNB resource.
     * </p>
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
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
     * Terminates a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * <p>
     * You must terminate a network instance before you can delete it.
     * </p>
     * 
     * @param terminateSolNetworkInstanceRequest
     * @return Result of the TerminateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.TerminateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TerminateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TerminateSolNetworkInstanceResult terminateSolNetworkInstance(TerminateSolNetworkInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateSolNetworkInstance(request);
    }

    @SdkInternalApi
    final TerminateSolNetworkInstanceResult executeTerminateSolNetworkInstance(TerminateSolNetworkInstanceRequest terminateSolNetworkInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateSolNetworkInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateSolNetworkInstanceRequest> request = null;
        Response<TerminateSolNetworkInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateSolNetworkInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(terminateSolNetworkInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateSolNetworkInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateSolNetworkInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TerminateSolNetworkInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Untags an AWS TNB resource.
     * </p>
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
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
     * Updates the operational state of function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param updateSolFunctionPackageRequest
     * @return Result of the UpdateSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UpdateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSolFunctionPackageResult updateSolFunctionPackage(UpdateSolFunctionPackageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSolFunctionPackage(request);
    }

    @SdkInternalApi
    final UpdateSolFunctionPackageResult executeUpdateSolFunctionPackage(UpdateSolFunctionPackageRequest updateSolFunctionPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSolFunctionPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSolFunctionPackageRequest> request = null;
        Response<UpdateSolFunctionPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSolFunctionPackageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSolFunctionPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSolFunctionPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSolFunctionPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSolFunctionPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * 
     * @param updateSolNetworkInstanceRequest
     * @return Result of the UpdateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UpdateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSolNetworkInstanceResult updateSolNetworkInstance(UpdateSolNetworkInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSolNetworkInstance(request);
    }

    @SdkInternalApi
    final UpdateSolNetworkInstanceResult executeUpdateSolNetworkInstance(UpdateSolNetworkInstanceRequest updateSolNetworkInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSolNetworkInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSolNetworkInstanceRequest> request = null;
        Response<UpdateSolNetworkInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSolNetworkInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSolNetworkInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSolNetworkInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSolNetworkInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSolNetworkInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the operational state of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * <p>
     * A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the
     * network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network
     * functions on.
     * </p>
     * 
     * @param updateSolNetworkPackageRequest
     * @return Result of the UpdateSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UpdateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSolNetworkPackageResult updateSolNetworkPackage(UpdateSolNetworkPackageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSolNetworkPackage(request);
    }

    @SdkInternalApi
    final UpdateSolNetworkPackageResult executeUpdateSolNetworkPackage(UpdateSolNetworkPackageRequest updateSolNetworkPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSolNetworkPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSolNetworkPackageRequest> request = null;
        Response<UpdateSolNetworkPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSolNetworkPackageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSolNetworkPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSolNetworkPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSolNetworkPackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSolNetworkPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates function package content. This can be used as a dry run before uploading function package content with
     * <a href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolFunctionPackageContent.html">
     * PutSolFunctionPackageContent</a>.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param validateSolFunctionPackageContentRequest
     * @return Result of the ValidateSolFunctionPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ValidateSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateSolFunctionPackageContentResult validateSolFunctionPackageContent(ValidateSolFunctionPackageContentRequest request) {
        request = beforeClientExecution(request);
        return executeValidateSolFunctionPackageContent(request);
    }

    @SdkInternalApi
    final ValidateSolFunctionPackageContentResult executeValidateSolFunctionPackageContent(
            ValidateSolFunctionPackageContentRequest validateSolFunctionPackageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(validateSolFunctionPackageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateSolFunctionPackageContentRequest> request = null;
        Response<ValidateSolFunctionPackageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateSolFunctionPackageContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(validateSolFunctionPackageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateSolFunctionPackageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateSolFunctionPackageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidateSolFunctionPackageContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates network package content. This can be used as a dry run before uploading network package content with <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolNetworkPackageContent.html">
     * PutSolNetworkPackageContent</a>.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param validateSolNetworkPackageContentRequest
     * @return Result of the ValidateSolNetworkPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ValidateSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateSolNetworkPackageContentResult validateSolNetworkPackageContent(ValidateSolNetworkPackageContentRequest request) {
        request = beforeClientExecution(request);
        return executeValidateSolNetworkPackageContent(request);
    }

    @SdkInternalApi
    final ValidateSolNetworkPackageContentResult executeValidateSolNetworkPackageContent(
            ValidateSolNetworkPackageContentRequest validateSolNetworkPackageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(validateSolNetworkPackageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateSolNetworkPackageContentRequest> request = null;
        Response<ValidateSolNetworkPackageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateSolNetworkPackageContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(validateSolNetworkPackageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "tnb");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateSolNetworkPackageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateSolNetworkPackageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidateSolNetworkPackageContentResultJsonUnmarshaller());
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
