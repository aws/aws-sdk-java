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
package com.amazonaws.services.panorama;

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

import com.amazonaws.services.panorama.AWSPanoramaClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.services.panorama.model.transform.*;

/**
 * Client for accessing Panorama. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * <fullname>AWS Panorama</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Panorama API Reference</i>. For an introduction to the service, see <a
 * href="https://docs.aws.amazon.com/panorama/latest/dev/panorama-welcome.html">What is AWS Panorama?</a> in the <i>AWS
 * Panorama Developer Guide</i>.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPanoramaClient extends AmazonWebServiceClient implements AWSPanorama {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSPanorama.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "panorama";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.panorama.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.panorama.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.panorama.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.panorama.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.panorama.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.panorama.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.panorama.model.AWSPanoramaException.class));

    public static AWSPanoramaClientBuilder builder() {
        return AWSPanoramaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Panorama using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPanoramaClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Panorama using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPanoramaClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("panorama.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/panorama/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/panorama/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an application instance and deploys it to a device.
     * </p>
     * 
     * @param createApplicationInstanceRequest
     * @return Result of the CreateApplicationInstance operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ServiceQuotaExceededException
     *         The request would cause a limit to be exceeded.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreateApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationInstanceResult createApplicationInstance(CreateApplicationInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplicationInstance(request);
    }

    @SdkInternalApi
    final CreateApplicationInstanceResult executeCreateApplicationInstance(CreateApplicationInstanceRequest createApplicationInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationInstanceRequest> request = null;
        Response<CreateApplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createApplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplicationInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateApplicationInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a job to run on one or more devices. A job can update a device's software or reboot it.
     * </p>
     * 
     * @param createJobForDevicesRequest
     * @return Result of the CreateJobForDevices operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreateJobForDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateJobForDevices" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateJobForDevicesResult createJobForDevices(CreateJobForDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJobForDevices(request);
    }

    @SdkInternalApi
    final CreateJobForDevicesResult executeCreateJobForDevices(CreateJobForDevicesRequest createJobForDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobForDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobForDevicesRequest> request = null;
        Response<CreateJobForDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobForDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobForDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJobForDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobForDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobForDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a camera stream node.
     * </p>
     * 
     * @param createNodeFromTemplateJobRequest
     * @return Result of the CreateNodeFromTemplateJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreateNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNodeFromTemplateJobResult createNodeFromTemplateJob(CreateNodeFromTemplateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNodeFromTemplateJob(request);
    }

    @SdkInternalApi
    final CreateNodeFromTemplateJobResult executeCreateNodeFromTemplateJob(CreateNodeFromTemplateJobRequest createNodeFromTemplateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createNodeFromTemplateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNodeFromTemplateJobRequest> request = null;
        Response<CreateNodeFromTemplateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNodeFromTemplateJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createNodeFromTemplateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNodeFromTemplateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNodeFromTemplateJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateNodeFromTemplateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a package and storage location in an Amazon S3 access point.
     * </p>
     * 
     * @param createPackageRequest
     * @return Result of the CreatePackage operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreatePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePackageResult createPackage(CreatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePackage(request);
    }

    @SdkInternalApi
    final CreatePackageResult executeCreatePackage(CreatePackageRequest createPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(createPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePackageRequest> request = null;
        Response<CreatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a node package.
     * </p>
     * 
     * @param createPackageImportJobRequest
     * @return Result of the CreatePackageImportJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreatePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePackageImportJobResult createPackageImportJob(CreatePackageImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePackageImportJob(request);
    }

    @SdkInternalApi
    final CreatePackageImportJobResult executeCreatePackageImportJob(CreatePackageImportJobRequest createPackageImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createPackageImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePackageImportJobRequest> request = null;
        Response<CreatePackageImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePackageImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPackageImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePackageImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePackageImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePackageImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a device.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeleteDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDeviceResult deleteDevice(DeleteDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDevice(request);
    }

    @SdkInternalApi
    final DeleteDeviceResult executeDeleteDevice(DeleteDeviceRequest deleteDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceRequest> request = null;
        Response<DeleteDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a package.
     * </p>
     * <note>
     * <p>
     * To delete a package, you need permission to call <code>s3:DeleteObject</code> in addition to permissions for the
     * AWS Panorama API.
     * </p>
     * </note>
     * 
     * @param deletePackageRequest
     * @return Result of the DeletePackage operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DeletePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeletePackage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePackageResult deletePackage(DeletePackageRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePackage(request);
    }

    @SdkInternalApi
    final DeletePackageResult executeDeletePackage(DeletePackageRequest deletePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackageRequest> request = null;
        Response<DeletePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters a package version.
     * </p>
     * 
     * @param deregisterPackageVersionRequest
     * @return Result of the DeregisterPackageVersion operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DeregisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeregisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterPackageVersionResult deregisterPackageVersion(DeregisterPackageVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterPackageVersion(request);
    }

    @SdkInternalApi
    final DeregisterPackageVersionResult executeDeregisterPackageVersion(DeregisterPackageVersionRequest deregisterPackageVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterPackageVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterPackageVersionRequest> request = null;
        Response<DeregisterPackageVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterPackageVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterPackageVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterPackageVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterPackageVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterPackageVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an application instance on a device.
     * </p>
     * 
     * @param describeApplicationInstanceRequest
     * @return Result of the DescribeApplicationInstance operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationInstanceResult describeApplicationInstance(DescribeApplicationInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicationInstance(request);
    }

    @SdkInternalApi
    final DescribeApplicationInstanceResult executeDescribeApplicationInstance(DescribeApplicationInstanceRequest describeApplicationInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationInstanceRequest> request = null;
        Response<DescribeApplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeApplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicationInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeApplicationInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an application instance's configuration manifest.
     * </p>
     * 
     * @param describeApplicationInstanceDetailsRequest
     * @return Result of the DescribeApplicationInstanceDetails operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeApplicationInstanceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstanceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationInstanceDetailsResult describeApplicationInstanceDetails(DescribeApplicationInstanceDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicationInstanceDetails(request);
    }

    @SdkInternalApi
    final DescribeApplicationInstanceDetailsResult executeDescribeApplicationInstanceDetails(
            DescribeApplicationInstanceDetailsRequest describeApplicationInstanceDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationInstanceDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationInstanceDetailsRequest> request = null;
        Response<DescribeApplicationInstanceDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationInstanceDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeApplicationInstanceDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicationInstanceDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationInstanceDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeApplicationInstanceDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDeviceResult describeDevice(DescribeDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDevice(request);
    }

    @SdkInternalApi
    final DescribeDeviceResult executeDescribeDevice(DescribeDeviceRequest describeDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeviceRequest> request = null;
        Response<DescribeDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a device job.
     * </p>
     * 
     * @param describeDeviceJobRequest
     * @return Result of the DescribeDeviceJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeDeviceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDeviceJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDeviceJobResult describeDeviceJob(DescribeDeviceJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeviceJob(request);
    }

    @SdkInternalApi
    final DescribeDeviceJobResult executeDescribeDeviceJob(DescribeDeviceJobRequest describeDeviceJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeviceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeviceJobRequest> request = null;
        Response<DescribeDeviceJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeviceJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeviceJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeviceJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeviceJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDeviceJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a node.
     * </p>
     * 
     * @param describeNodeRequest
     * @return Result of the DescribeNode operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeNodeResult describeNode(DescribeNodeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNode(request);
    }

    @SdkInternalApi
    final DescribeNodeResult executeDescribeNode(DescribeNodeRequest describeNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNodeRequest> request = null;
        Response<DescribeNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a job to create a camera stream node.
     * </p>
     * 
     * @param describeNodeFromTemplateJobRequest
     * @return Result of the DescribeNodeFromTemplateJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNodeFromTemplateJobResult describeNodeFromTemplateJob(DescribeNodeFromTemplateJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNodeFromTemplateJob(request);
    }

    @SdkInternalApi
    final DescribeNodeFromTemplateJobResult executeDescribeNodeFromTemplateJob(DescribeNodeFromTemplateJobRequest describeNodeFromTemplateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNodeFromTemplateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNodeFromTemplateJobRequest> request = null;
        Response<DescribeNodeFromTemplateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNodeFromTemplateJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNodeFromTemplateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNodeFromTemplateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNodeFromTemplateJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeNodeFromTemplateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a package.
     * </p>
     * 
     * @param describePackageRequest
     * @return Result of the DescribePackage operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePackageResult describePackage(DescribePackageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackage(request);
    }

    @SdkInternalApi
    final DescribePackageResult executeDescribePackage(DescribePackageRequest describePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackageRequest> request = null;
        Response<DescribePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a package import job.
     * </p>
     * 
     * @param describePackageImportJobRequest
     * @return Result of the DescribePackageImportJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePackageImportJobResult describePackageImportJob(DescribePackageImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackageImportJob(request);
    }

    @SdkInternalApi
    final DescribePackageImportJobResult executeDescribePackageImportJob(DescribePackageImportJobRequest describePackageImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackageImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackageImportJobRequest> request = null;
        Response<DescribePackageImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackageImportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePackageImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackageImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackageImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePackageImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @return Result of the DescribePackageVersion operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribePackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePackageVersionResult describePackageVersion(DescribePackageVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackageVersion(request);
    }

    @SdkInternalApi
    final DescribePackageVersionResult executeDescribePackageVersion(DescribePackageVersionRequest describePackageVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackageVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackageVersionRequest> request = null;
        Response<DescribePackageVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackageVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePackageVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackageVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackageVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePackageVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of application instance dependencies.
     * </p>
     * 
     * @param listApplicationInstanceDependenciesRequest
     * @return Result of the ListApplicationInstanceDependencies operation returned by the service.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListApplicationInstanceDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationInstanceDependenciesResult listApplicationInstanceDependencies(ListApplicationInstanceDependenciesRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationInstanceDependencies(request);
    }

    @SdkInternalApi
    final ListApplicationInstanceDependenciesResult executeListApplicationInstanceDependencies(
            ListApplicationInstanceDependenciesRequest listApplicationInstanceDependenciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationInstanceDependenciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationInstanceDependenciesRequest> request = null;
        Response<ListApplicationInstanceDependenciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationInstanceDependenciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationInstanceDependenciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationInstanceDependencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationInstanceDependenciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationInstanceDependenciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of application node instances.
     * </p>
     * 
     * @param listApplicationInstanceNodeInstancesRequest
     * @return Result of the ListApplicationInstanceNodeInstances operation returned by the service.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationInstanceNodeInstancesResult listApplicationInstanceNodeInstances(ListApplicationInstanceNodeInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationInstanceNodeInstances(request);
    }

    @SdkInternalApi
    final ListApplicationInstanceNodeInstancesResult executeListApplicationInstanceNodeInstances(
            ListApplicationInstanceNodeInstancesRequest listApplicationInstanceNodeInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationInstanceNodeInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationInstanceNodeInstancesRequest> request = null;
        Response<ListApplicationInstanceNodeInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationInstanceNodeInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationInstanceNodeInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationInstanceNodeInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationInstanceNodeInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationInstanceNodeInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of application instances.
     * </p>
     * 
     * @param listApplicationInstancesRequest
     * @return Result of the ListApplicationInstances operation returned by the service.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListApplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationInstancesResult listApplicationInstances(ListApplicationInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationInstances(request);
    }

    @SdkInternalApi
    final ListApplicationInstancesResult executeListApplicationInstances(ListApplicationInstancesRequest listApplicationInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationInstancesRequest> request = null;
        Response<ListApplicationInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListDevices(request);
    }

    @SdkInternalApi
    final ListDevicesResult executeListDevices(ListDevicesRequest listDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of jobs.
     * </p>
     * 
     * @param listDevicesJobsRequest
     * @return Result of the ListDevicesJobs operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListDevicesJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevicesJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDevicesJobsResult listDevicesJobs(ListDevicesJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDevicesJobs(request);
    }

    @SdkInternalApi
    final ListDevicesJobsResult executeListDevicesJobs(ListDevicesJobsRequest listDevicesJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicesJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesJobsRequest> request = null;
        Response<ListDevicesJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicesJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevicesJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicesJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicesJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of camera stream node jobs.
     * </p>
     * 
     * @param listNodeFromTemplateJobsRequest
     * @return Result of the ListNodeFromTemplateJobs operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListNodeFromTemplateJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodeFromTemplateJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNodeFromTemplateJobsResult listNodeFromTemplateJobs(ListNodeFromTemplateJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListNodeFromTemplateJobs(request);
    }

    @SdkInternalApi
    final ListNodeFromTemplateJobsResult executeListNodeFromTemplateJobs(ListNodeFromTemplateJobsRequest listNodeFromTemplateJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNodeFromTemplateJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNodeFromTemplateJobsRequest> request = null;
        Response<ListNodeFromTemplateJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNodeFromTemplateJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listNodeFromTemplateJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNodeFromTemplateJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNodeFromTemplateJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListNodeFromTemplateJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of nodes.
     * </p>
     * 
     * @param listNodesRequest
     * @return Result of the ListNodes operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListNodesResult listNodes(ListNodesRequest request) {
        request = beforeClientExecution(request);
        return executeListNodes(request);
    }

    @SdkInternalApi
    final ListNodesResult executeListNodes(ListNodesRequest listNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNodesRequest> request = null;
        Response<ListNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNodesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of package import jobs.
     * </p>
     * 
     * @param listPackageImportJobsRequest
     * @return Result of the ListPackageImportJobs operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListPackageImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackageImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPackageImportJobsResult listPackageImportJobs(ListPackageImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListPackageImportJobs(request);
    }

    @SdkInternalApi
    final ListPackageImportJobsResult executeListPackageImportJobs(ListPackageImportJobsRequest listPackageImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackageImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackageImportJobsRequest> request = null;
        Response<ListPackageImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackageImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPackageImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackageImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackageImportJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPackageImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of packages.
     * </p>
     * 
     * @param listPackagesRequest
     * @return Result of the ListPackages operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPackagesResult listPackages(ListPackagesRequest request) {
        request = beforeClientExecution(request);
        return executeListPackages(request);
    }

    @SdkInternalApi
    final ListPackagesResult executeListPackages(ListPackagesRequest listPackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagesRequest> request = null;
        Response<ListPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
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
     * Creates a device and returns a configuration archive. The configuration archive is a ZIP file that contains a
     * provisioning certificate that is valid for 5 minutes. Name the configuration archive
     * <code>certificates-omni_<i>device-name</i>.zip</code> and transfer it to the device within 5 minutes. Use the
     * included USB storage device and connect it to the USB 3.0 port next to the HDMI output.
     * </p>
     * 
     * @param provisionDeviceRequest
     * @return Result of the ProvisionDevice operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ServiceQuotaExceededException
     *         The request would cause a limit to be exceeded.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ProvisionDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ProvisionDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ProvisionDeviceResult provisionDevice(ProvisionDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeProvisionDevice(request);
    }

    @SdkInternalApi
    final ProvisionDeviceResult executeProvisionDevice(ProvisionDeviceRequest provisionDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(provisionDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ProvisionDeviceRequest> request = null;
        Response<ProvisionDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ProvisionDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(provisionDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ProvisionDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ProvisionDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ProvisionDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a package version.
     * </p>
     * 
     * @param registerPackageVersionRequest
     * @return Result of the RegisterPackageVersion operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.RegisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RegisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterPackageVersionResult registerPackageVersion(RegisterPackageVersionRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterPackageVersion(request);
    }

    @SdkInternalApi
    final RegisterPackageVersionResult executeRegisterPackageVersion(RegisterPackageVersionRequest registerPackageVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(registerPackageVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterPackageVersionRequest> request = null;
        Response<RegisterPackageVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterPackageVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerPackageVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterPackageVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterPackageVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterPackageVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an application instance.
     * </p>
     * 
     * @param removeApplicationInstanceRequest
     * @return Result of the RemoveApplicationInstance operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.RemoveApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RemoveApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveApplicationInstanceResult removeApplicationInstance(RemoveApplicationInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveApplicationInstance(request);
    }

    @SdkInternalApi
    final RemoveApplicationInstanceResult executeRemoveApplicationInstance(RemoveApplicationInstanceRequest removeApplicationInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeApplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveApplicationInstanceRequest> request = null;
        Response<RemoveApplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveApplicationInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeApplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveApplicationInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveApplicationInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveApplicationInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Signal camera nodes to stop or resume.
     * </p>
     * 
     * @param signalApplicationInstanceNodeInstancesRequest
     * @return Result of the SignalApplicationInstanceNodeInstances operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ServiceQuotaExceededException
     *         The request would cause a limit to be exceeded.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.SignalApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/SignalApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SignalApplicationInstanceNodeInstancesResult signalApplicationInstanceNodeInstances(SignalApplicationInstanceNodeInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeSignalApplicationInstanceNodeInstances(request);
    }

    @SdkInternalApi
    final SignalApplicationInstanceNodeInstancesResult executeSignalApplicationInstanceNodeInstances(
            SignalApplicationInstanceNodeInstancesRequest signalApplicationInstanceNodeInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(signalApplicationInstanceNodeInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignalApplicationInstanceNodeInstancesRequest> request = null;
        Response<SignalApplicationInstanceNodeInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignalApplicationInstanceNodeInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(signalApplicationInstanceNodeInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SignalApplicationInstanceNodeInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SignalApplicationInstanceNodeInstancesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SignalApplicationInstanceNodeInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
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
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
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
     * Updates a device's metadata.
     * </p>
     * 
     * @param updateDeviceMetadataRequest
     * @return Result of the UpdateDeviceMetadata operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.UpdateDeviceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UpdateDeviceMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDeviceMetadataResult updateDeviceMetadata(UpdateDeviceMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDeviceMetadata(request);
    }

    @SdkInternalApi
    final UpdateDeviceMetadataResult executeUpdateDeviceMetadata(UpdateDeviceMetadataRequest updateDeviceMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceMetadataRequest> request = null;
        Response<UpdateDeviceMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Panorama");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDeviceMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceMetadataResultJsonUnmarshaller());
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
