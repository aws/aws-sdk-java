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
package com.amazonaws.services.greengrassv2;

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

import com.amazonaws.services.greengrassv2.AWSGreengrassV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.greengrassv2.model.*;
import com.amazonaws.services.greengrassv2.model.transform.*;

/**
 * Client for accessing AWS GreengrassV2. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS IoT Greengrass brings local compute, messaging, data management, sync, and ML inference capabilities to edge
 * devices. This enables devices to collect and analyze data closer to the source of information, react autonomously to
 * local events, and communicate securely with each other on local networks. Local devices can also communicate securely
 * with AWS IoT Core and export IoT data to the AWS Cloud. AWS IoT Greengrass developers can use AWS Lambda functions
 * and components to create and deploy applications to fleets of edge devices for local operation.
 * </p>
 * <p>
 * AWS IoT Greengrass Version 2 provides a new major version of the AWS IoT Greengrass Core software, new APIs, and a
 * new console. Use this API reference to learn how to use the AWS IoT Greengrass V2 API operations to manage
 * components, manage deployments, and core devices.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/what-is-iot-greengrass.html">What is AWS IoT
 * Greengrass?</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGreengrassV2Client extends AmazonWebServiceClient implements AWSGreengrassV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSGreengrassV2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "greengrass";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.greengrassv2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.greengrassv2.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.greengrassv2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.greengrassv2.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.greengrassv2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.greengrassv2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.greengrassv2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.greengrassv2.model.AWSGreengrassV2Exception.class));

    public static AWSGreengrassV2ClientBuilder builder() {
        return AWSGreengrassV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS GreengrassV2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGreengrassV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS GreengrassV2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGreengrassV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("greengrass.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/greengrassv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/greengrassv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a deployment. This operation cancels the deployment for devices that haven't yet received it. If a device
     * already received the deployment, this operation doesn't change anything for that device.
     * </p>
     * 
     * @param cancelDeploymentRequest
     * @return Result of the CancelDeployment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.CancelDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CancelDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelDeploymentResult cancelDeployment(CancelDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCancelDeployment(request);
    }

    @SdkInternalApi
    final CancelDeploymentResult executeCancelDeployment(CancelDeploymentRequest cancelDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelDeploymentRequest> request = null;
        Response<CancelDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a component. Components are software that run on AWS IoT Greengrass core devices. After you develop and
     * test a component on your core device, you can use this operation to upload your component to AWS IoT Greengrass.
     * Then, you can deploy the component to other core devices.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Create components from recipes</b>
     * </p>
     * <p>
     * Create a component from a recipe, which is a file that defines the component's metadata, parameters,
     * dependencies, lifecycle, artifacts, and platform capability. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/component-recipe-reference.html">AWS IoT
     * Greengrass component recipe reference</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * <p>
     * To create a component from a recipe, specify <code>inlineRecipe</code> when you call this operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create components from Lambda functions</b>
     * </p>
     * <p>
     * Create a component from an AWS Lambda function that runs on AWS IoT Greengrass. This creates a recipe and
     * artifacts from the Lambda function's deployment package. You can use this operation to migrate Lambda functions
     * from AWS IoT Greengrass V1 to AWS IoT Greengrass V2.
     * </p>
     * <p>
     * This function only accepts Lambda functions that use the following runtimes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Python 2.7 – <code>python2.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Python 3.7 – <code>python3.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Python 3.8 – <code>python3.8</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Java 8 – <code>java8</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Node.js 10 – <code>nodejs10.x</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Node.js 12 – <code>nodejs12.x</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a component from a Lambda function, specify <code>lambdaFunction</code> when you call this operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createComponentVersionRequest
     * @return Result of the CreateComponentVersion operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         Your request exceeds a service quota. For example, you might have the maximum number of components that
     *         you can create.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.CreateComponentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateComponentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateComponentVersionResult createComponentVersion(CreateComponentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComponentVersion(request);
    }

    @SdkInternalApi
    final CreateComponentVersionResult executeCreateComponentVersion(CreateComponentVersionRequest createComponentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createComponentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComponentVersionRequest> request = null;
        Response<CreateComponentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComponentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createComponentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComponentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateComponentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateComponentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a continuous deployment for a target, which is a AWS IoT Greengrass core device or group of core devices.
     * When you add a new core device to a group of core devices that has a deployment, AWS IoT Greengrass deploys that
     * group's deployment to the new device.
     * </p>
     * <p>
     * You can define one deployment for each target. When you create a new deployment for a target that has an existing
     * deployment, you replace the previous deployment. AWS IoT Greengrass applies the new deployment to the target
     * devices.
     * </p>
     * <p>
     * Every deployment has a revision number that indicates how many deployment revisions you define for a target. Use
     * this operation to create a new revision of an existing deployment. This operation returns the revision number of
     * the new deployment when you create it.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/latest/developerguide/create-deployments.html">Create
     * deployments</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeployment(request);
    }

    @SdkInternalApi
    final CreateDeploymentResult executeCreateDeployment(CreateDeploymentRequest createDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a version of a component from AWS IoT Greengrass.
     * </p>
     * <note>
     * <p>
     * This operation deletes the component's recipe and artifacts. As a result, deployments that refer to this
     * component version will fail. If you have deployments that use this component version, you can remove the
     * component from the deployment or update the deployment to use a valid version.
     * </p>
     * </note>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteComponentResult deleteComponent(DeleteComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteComponent(request);
    }

    @SdkInternalApi
    final DeleteComponentResult executeDeleteComponent(DeleteComponentRequest deleteComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteComponentRequest> request = null;
        Response<DeleteComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a AWS IoT Greengrass core device, which is an AWS IoT thing. This operation removes the core device from
     * the list of core devices. This operation doesn't delete the AWS IoT thing. For more information about how to
     * delete the AWS IoT thing, see <a
     * href="https://docs.aws.amazon.com/iot/latest/apireference/API_DeleteThing.html">DeleteThing</a> in the <i>AWS IoT
     * API Reference</i>.
     * </p>
     * 
     * @param deleteCoreDeviceRequest
     * @return Result of the DeleteCoreDevice operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSGreengrassV2.DeleteCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteCoreDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCoreDeviceResult deleteCoreDevice(DeleteCoreDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCoreDevice(request);
    }

    @SdkInternalApi
    final DeleteCoreDeviceResult executeDeleteCoreDevice(DeleteCoreDeviceRequest deleteCoreDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCoreDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCoreDeviceRequest> request = null;
        Response<DeleteCoreDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCoreDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCoreDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCoreDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCoreDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCoreDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata for a version of a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @return Result of the DescribeComponent operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DescribeComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeComponentResult describeComponent(DescribeComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComponent(request);
    }

    @SdkInternalApi
    final DescribeComponentResult executeDescribeComponent(DescribeComponentRequest describeComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComponentRequest> request = null;
        Response<DescribeComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the recipe for a version of a component. Core devices can call this operation to identify the artifacts and
     * requirements to install a component.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetComponentResult getComponent(GetComponentRequest request) {
        request = beforeClientExecution(request);
        return executeGetComponent(request);
    }

    @SdkInternalApi
    final GetComponentResult executeGetComponent(GetComponentRequest getComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(getComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentRequest> request = null;
        Response<GetComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the pre-signed URL to a component artifact in an S3 bucket. Core devices can call this operation to identify
     * the URL that they can use to download an artifact to install.
     * </p>
     * 
     * @param getComponentVersionArtifactRequest
     * @return Result of the GetComponentVersionArtifact operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.GetComponentVersionArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponentVersionArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetComponentVersionArtifactResult getComponentVersionArtifact(GetComponentVersionArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeGetComponentVersionArtifact(request);
    }

    @SdkInternalApi
    final GetComponentVersionArtifactResult executeGetComponentVersionArtifact(GetComponentVersionArtifactRequest getComponentVersionArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(getComponentVersionArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentVersionArtifactRequest> request = null;
        Response<GetComponentVersionArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentVersionArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getComponentVersionArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComponentVersionArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComponentVersionArtifactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetComponentVersionArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata for a AWS IoT Greengrass core device.
     * </p>
     * 
     * @param getCoreDeviceRequest
     * @return Result of the GetCoreDevice operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.GetCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetCoreDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCoreDeviceResult getCoreDevice(GetCoreDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeGetCoreDevice(request);
    }

    @SdkInternalApi
    final GetCoreDeviceResult executeGetCoreDevice(GetCoreDeviceRequest getCoreDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(getCoreDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCoreDeviceRequest> request = null;
        Response<GetCoreDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCoreDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCoreDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCoreDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCoreDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCoreDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a deployment. Deployments define the components that run on AWS IoT Greengrass core devices.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeployment(request);
    }

    @SdkInternalApi
    final GetDeploymentResult executeGetDeployment(GetDeploymentRequest getDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of all versions for a component.
     * </p>
     * 
     * @param listComponentVersionsRequest
     * @return Result of the ListComponentVersions operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.ListComponentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListComponentVersionsResult listComponentVersions(ListComponentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListComponentVersions(request);
    }

    @SdkInternalApi
    final ListComponentVersionsResult executeListComponentVersions(ListComponentVersionsRequest listComponentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listComponentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentVersionsRequest> request = null;
        Response<ListComponentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComponentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComponentVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComponentVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListComponentVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of component summaries. This list includes components that you have permission to
     * view.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListComponentsResult listComponents(ListComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListComponents(request);
    }

    @SdkInternalApi
    final ListComponentsResult executeListComponents(ListComponentsRequest listComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentsRequest> request = null;
        Response<ListComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of AWS IoT Greengrass core devices.
     * </p>
     * 
     * @param listCoreDevicesRequest
     * @return Result of the ListCoreDevices operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListCoreDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListCoreDevices" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCoreDevicesResult listCoreDevices(ListCoreDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListCoreDevices(request);
    }

    @SdkInternalApi
    final ListCoreDevicesResult executeListCoreDevices(ListCoreDevicesRequest listCoreDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCoreDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCoreDevicesRequest> request = null;
        Response<ListCoreDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCoreDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCoreDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCoreDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCoreDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCoreDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of deployments.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeployments(request);
    }

    @SdkInternalApi
    final ListDeploymentsResult executeListDeployments(ListDeploymentsRequest listDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of deployment jobs that AWS IoT Greengrass sends to AWS IoT Greengrass core devices.
     * </p>
     * 
     * @param listEffectiveDeploymentsRequest
     * @return Result of the ListEffectiveDeployments operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListEffectiveDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListEffectiveDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEffectiveDeploymentsResult listEffectiveDeployments(ListEffectiveDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeListEffectiveDeployments(request);
    }

    @SdkInternalApi
    final ListEffectiveDeploymentsResult executeListEffectiveDeployments(ListEffectiveDeploymentsRequest listEffectiveDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEffectiveDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEffectiveDeploymentsRequest> request = null;
        Response<ListEffectiveDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEffectiveDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEffectiveDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEffectiveDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEffectiveDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEffectiveDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of the components that a AWS IoT Greengrass core device runs.
     * </p>
     * 
     * @param listInstalledComponentsRequest
     * @return Result of the ListInstalledComponents operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListInstalledComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListInstalledComponents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInstalledComponentsResult listInstalledComponents(ListInstalledComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListInstalledComponents(request);
    }

    @SdkInternalApi
    final ListInstalledComponentsResult executeListInstalledComponents(ListInstalledComponentsRequest listInstalledComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstalledComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstalledComponentsRequest> request = null;
        Response<ListInstalledComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstalledComponentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInstalledComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstalledComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstalledComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInstalledComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of tags for an AWS IoT Greengrass resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSGreengrassV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
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
     * Retrieves a list of components that meet the component, version, and platform requirements of a deployment. AWS
     * IoT Greengrass core devices call this operation when they receive a deployment to identify the components to
     * install.
     * </p>
     * <p>
     * This operation identifies components that meet all dependency requirements for a deployment. If the requirements
     * conflict, then this operation returns an error and the deployment fails. For example, this occurs if component
     * <code>A</code> requires version <code>&gt;2.0.0</code> and component <code>B</code> requires version
     * <code>&lt;2.0.0</code> of a component dependency.
     * </p>
     * <p>
     * When you specify the component candidates to resolve, AWS IoT Greengrass compares each component's digest from
     * the core device with the component's digest in the AWS Cloud. If the digests don't match, then AWS IoT Greengrass
     * specifies to use the version from the AWS Cloud.
     * </p>
     * <important>
     * <p>
     * To use this operation, you must use the data plane API endpoint and authenticate with an AWS IoT device
     * certificate. For more information, see <a
     * href="https://docs.aws.amazon.com/https:/docs.aws.amazon.com/general/latest/gr/greengrass.html">AWS IoT
     * Greengrass endpoints and quotas</a>.
     * </p>
     * </important>
     * 
     * @param resolveComponentCandidatesRequest
     * @return Result of the ResolveComponentCandidates operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSGreengrassV2.ResolveComponentCandidates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ResolveComponentCandidates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResolveComponentCandidatesResult resolveComponentCandidates(ResolveComponentCandidatesRequest request) {
        request = beforeClientExecution(request);
        return executeResolveComponentCandidates(request);
    }

    @SdkInternalApi
    final ResolveComponentCandidatesResult executeResolveComponentCandidates(ResolveComponentCandidatesRequest resolveComponentCandidatesRequest) {

        ExecutionContext executionContext = createExecutionContext(resolveComponentCandidatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveComponentCandidatesRequest> request = null;
        Response<ResolveComponentCandidatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveComponentCandidatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(resolveComponentCandidatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResolveComponentCandidates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResolveComponentCandidatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ResolveComponentCandidatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to an AWS IoT Greengrass resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSGreengrassV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
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
     * Removes a tag from an AWS IoT Greengrass resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         AWS IoT Greengrass can't process your request right now. Try again later.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSGreengrassV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GreengrassV2");
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
