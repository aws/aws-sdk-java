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
package com.amazonaws.services.iotthingsgraph;

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

import com.amazonaws.services.iotthingsgraph.AWSIoTThingsGraphClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotthingsgraph.model.*;
import com.amazonaws.services.iotthingsgraph.model.transform.*;

/**
 * Client for accessing AWS IoT Things Graph. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS IoT Things Graph</fullname>
 * <p>
 * AWS IoT Things Graph provides an integrated set of tools that enable developers to connect devices and services that
 * use different standards, such as units of measure and communication protocols. AWS IoT Things Graph makes it possible
 * to build IoT applications with little to no code by connecting devices and services and defining how they interact at
 * an abstract level.
 * </p>
 * <p>
 * For more information about how AWS IoT Things Graph works, see the <a
 * href="https://docs.aws.amazon.com/thingsgraph/latest/ug/iot-tg-whatis.html">User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTThingsGraphClient extends AmazonWebServiceClient implements AWSIoTThingsGraph {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTThingsGraph.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotthingsgraph";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotthingsgraph.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotthingsgraph.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotthingsgraph.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotthingsgraph.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotthingsgraph.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotthingsgraph.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotthingsgraph.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotthingsgraph.model.AWSIoTThingsGraphException.class));

    public static AWSIoTThingsGraphClientBuilder builder() {
        return AWSIoTThingsGraphClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Things Graph using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTThingsGraphClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Things Graph using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTThingsGraphClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("iotthingsgraph.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotthingsgraph/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotthingsgraph/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a device with a concrete thing that is in the user's registry.
     * </p>
     * <p>
     * A thing can be associated with only one device at a time. If you associate a thing with a new device id, its
     * previous association will be removed.
     * </p>
     * 
     * @param associateEntityToThingRequest
     * @return Result of the AssociateEntityToThing operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.AssociateEntityToThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/AssociateEntityToThing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateEntityToThingResult associateEntityToThing(AssociateEntityToThingRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateEntityToThing(request);
    }

    @SdkInternalApi
    final AssociateEntityToThingResult executeAssociateEntityToThing(AssociateEntityToThingRequest associateEntityToThingRequest) {

        ExecutionContext executionContext = createExecutionContext(associateEntityToThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateEntityToThingRequest> request = null;
        Response<AssociateEntityToThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateEntityToThingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateEntityToThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateEntityToThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateEntityToThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateEntityToThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace
     * contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is
     * validated against the entities in the latest version of the user's namespace unless another namespace version is
     * specified in the request.
     * </p>
     * 
     * @param createFlowTemplateRequest
     * @return Result of the CreateFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.CreateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFlowTemplateResult createFlowTemplate(CreateFlowTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFlowTemplate(request);
    }

    @SdkInternalApi
    final CreateFlowTemplateResult executeCreateFlowTemplate(CreateFlowTemplateRequest createFlowTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createFlowTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowTemplateRequest> request = null;
        Response<CreateFlowTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFlowTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFlowTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFlowTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFlowTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a system instance.
     * </p>
     * <p>
     * This action validates the system instance, prepares the deployment-related resources. For Greengrass deployments,
     * it updates the Greengrass group that is specified by the <code>greengrassGroupName</code> parameter. It also adds
     * a file to the S3 bucket specified by the <code>s3BucketName</code> parameter. You need to call
     * <code>DeploySystemInstance</code> after running this action.
     * </p>
     * <p>
     * For Greengrass deployments, since this action modifies and adds resources to a Greengrass group and an S3 bucket
     * on the caller's behalf, the calling identity must have write permissions to both the specified Greengrass group
     * and S3 bucket. Otherwise, the call will fail with an authorization error.
     * </p>
     * <p>
     * For cloud deployments, this action requires a <code>flowActionsRoleArn</code> value. This is an IAM role that has
     * permissions to access AWS services, such as AWS Lambda and AWS IoT, that the flow uses when it executes.
     * </p>
     * <p>
     * If the definition document doesn't specify a version of the user's namespace, the latest version will be used by
     * default.
     * </p>
     * 
     * @param createSystemInstanceRequest
     * @return Result of the CreateSystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @sample AWSIoTThingsGraph.CreateSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSystemInstanceResult createSystemInstance(CreateSystemInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSystemInstance(request);
    }

    @SdkInternalApi
    final CreateSystemInstanceResult executeCreateSystemInstance(CreateSystemInstanceRequest createSystemInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createSystemInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSystemInstanceRequest> request = null;
        Response<CreateSystemInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSystemInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSystemInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSystemInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSystemInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSystemInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a system. The system is validated against the entities in the latest version of the user's namespace
     * unless another namespace version is specified in the request.
     * </p>
     * 
     * @param createSystemTemplateRequest
     * @return Result of the CreateSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.CreateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSystemTemplateResult createSystemTemplate(CreateSystemTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSystemTemplate(request);
    }

    @SdkInternalApi
    final CreateSystemTemplateResult executeCreateSystemTemplate(CreateSystemTemplateRequest createSystemTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createSystemTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSystemTemplateRequest> request = null;
        Response<CreateSystemTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSystemTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSystemTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSystemTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSystemTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSystemTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy.
     * Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow
     * taken at the time of deployment).
     * </p>
     * 
     * @param deleteFlowTemplateRequest
     * @return Result of the DeleteFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeleteFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFlowTemplateResult deleteFlowTemplate(DeleteFlowTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFlowTemplate(request);
    }

    @SdkInternalApi
    final DeleteFlowTemplateResult executeDeleteFlowTemplate(DeleteFlowTemplateRequest deleteFlowTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFlowTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowTemplateRequest> request = null;
        Response<DeleteFlowTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFlowTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFlowTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFlowTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFlowTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and
     * flows that use entities in the namespace before performing this action.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNamespace(request);
    }

    @SdkInternalApi
    final DeleteNamespaceResult executeDeleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamespaceRequest> request = null;
        Response<DeleteNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can
     * be deleted.
     * </p>
     * <p>
     * Users can create a new system instance that has the same ID as a deleted system instance.
     * </p>
     * 
     * @param deleteSystemInstanceRequest
     * @return Result of the DeleteSystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeleteSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSystemInstanceResult deleteSystemInstance(DeleteSystemInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSystemInstance(request);
    }

    @SdkInternalApi
    final DeleteSystemInstanceResult executeDeleteSystemInstance(DeleteSystemInstanceRequest deleteSystemInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSystemInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSystemInstanceRequest> request = null;
        Response<DeleteSystemInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSystemInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSystemInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSystemInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSystemInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSystemInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain
     * the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
     * </p>
     * 
     * @param deleteSystemTemplateRequest
     * @return Result of the DeleteSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeleteSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSystemTemplateResult deleteSystemTemplate(DeleteSystemTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSystemTemplate(request);
    }

    @SdkInternalApi
    final DeleteSystemTemplateResult executeDeleteSystemTemplate(DeleteSystemTemplateRequest deleteSystemTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSystemTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSystemTemplateRequest> request = null;
        Response<DeleteSystemTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSystemTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSystemTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSystemTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSystemTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSystemTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <b>Greengrass and Cloud Deployments</b>
     * </p>
     * <p>
     * Deploys the system instance to the target specified in <code>CreateSystemInstance</code>.
     * </p>
     * <p>
     * <b>Greengrass Deployments</b>
     * </p>
     * <p>
     * If the system or any workflows and entities have been updated before this action is called, then the deployment
     * will create a new Amazon Simple Storage Service resource file and then deploy it.
     * </p>
     * <p>
     * Since this action creates a Greengrass deployment on the caller's behalf, the calling identity must have write
     * permissions to the specified Greengrass group. Otherwise, the call will fail with an authorization error.
     * </p>
     * <p>
     * For information about the artifacts that get added to your Greengrass core device when you use this API, see <a
     * href="https://docs.aws.amazon.com/thingsgraph/latest/ug/iot-tg-greengrass.html">AWS IoT Things Graph and AWS IoT
     * Greengrass</a>.
     * </p>
     * 
     * @param deploySystemInstanceRequest
     * @return Result of the DeploySystemInstance operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeploySystemInstanceResult deploySystemInstance(DeploySystemInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeploySystemInstance(request);
    }

    @SdkInternalApi
    final DeploySystemInstanceResult executeDeploySystemInstance(DeploySystemInstanceRequest deploySystemInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deploySystemInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeploySystemInstanceRequest> request = null;
        Response<DeploySystemInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeploySystemInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deploySystemInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeploySystemInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeploySystemInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeploySystemInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be
     * deployed, but existing deployments will continue to run.
     * </p>
     * 
     * @param deprecateFlowTemplateRequest
     * @return Result of the DeprecateFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.DeprecateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeprecateFlowTemplateResult deprecateFlowTemplate(DeprecateFlowTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeprecateFlowTemplate(request);
    }

    @SdkInternalApi
    final DeprecateFlowTemplateResult executeDeprecateFlowTemplate(DeprecateFlowTemplateRequest deprecateFlowTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deprecateFlowTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprecateFlowTemplateRequest> request = null;
        Response<DeprecateFlowTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprecateFlowTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deprecateFlowTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeprecateFlowTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeprecateFlowTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeprecateFlowTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecates the specified system.
     * </p>
     * 
     * @param deprecateSystemTemplateRequest
     * @return Result of the DeprecateSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.DeprecateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeprecateSystemTemplateResult deprecateSystemTemplate(DeprecateSystemTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeprecateSystemTemplate(request);
    }

    @SdkInternalApi
    final DeprecateSystemTemplateResult executeDeprecateSystemTemplate(DeprecateSystemTemplateRequest deprecateSystemTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deprecateSystemTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprecateSystemTemplateRequest> request = null;
        Response<DeprecateSystemTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprecateSystemTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deprecateSystemTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeprecateSystemTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeprecateSystemTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeprecateSystemTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the latest version of the user's namespace and the public version that it is tracking.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @return Result of the DescribeNamespace operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DescribeNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNamespaceResult describeNamespace(DescribeNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNamespace(request);
    }

    @SdkInternalApi
    final DescribeNamespaceResult executeDescribeNamespace(DescribeNamespaceRequest describeNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNamespaceRequest> request = null;
        Response<DescribeNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to
     * dissociate because only one entity of a particular type can be associated with a thing.
     * </p>
     * 
     * @param dissociateEntityFromThingRequest
     * @return Result of the DissociateEntityFromThing operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.DissociateEntityFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DissociateEntityFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DissociateEntityFromThingResult dissociateEntityFromThing(DissociateEntityFromThingRequest request) {
        request = beforeClientExecution(request);
        return executeDissociateEntityFromThing(request);
    }

    @SdkInternalApi
    final DissociateEntityFromThingResult executeDissociateEntityFromThing(DissociateEntityFromThingRequest dissociateEntityFromThingRequest) {

        ExecutionContext executionContext = createExecutionContext(dissociateEntityFromThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DissociateEntityFromThingRequest> request = null;
        Response<DissociateEntityFromThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DissociateEntityFromThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(dissociateEntityFromThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DissociateEntityFromThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DissociateEntityFromThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DissociateEntityFromThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets definitions of the specified entities. Uses the latest version of the user's namespace by default. This API
     * returns the following TDM entities.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Properties
     * </p>
     * </li>
     * <li>
     * <p>
     * States
     * </p>
     * </li>
     * <li>
     * <p>
     * Events
     * </p>
     * </li>
     * <li>
     * <p>
     * Actions
     * </p>
     * </li>
     * <li>
     * <p>
     * Capabilities
     * </p>
     * </li>
     * <li>
     * <p>
     * Mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Devices
     * </p>
     * </li>
     * <li>
     * <p>
     * Device Models
     * </p>
     * </li>
     * <li>
     * <p>
     * Services
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action doesn't return definitions for systems, flows, and deployments.
     * </p>
     * 
     * @param getEntitiesRequest
     * @return Result of the GetEntities operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.GetEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetEntities" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEntitiesResult getEntities(GetEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeGetEntities(request);
    }

    @SdkInternalApi
    final GetEntitiesResult executeGetEntities(GetEntitiesRequest getEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(getEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEntitiesRequest> request = null;
        Response<GetEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the latest version of the <code>DefinitionDocument</code> and <code>FlowTemplateSummary</code> for the
     * specified workflow.
     * </p>
     * 
     * @param getFlowTemplateRequest
     * @return Result of the GetFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetFlowTemplateResult getFlowTemplate(GetFlowTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetFlowTemplate(request);
    }

    @SdkInternalApi
    final GetFlowTemplateResult executeGetFlowTemplate(GetFlowTemplateRequest getFlowTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getFlowTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFlowTemplateRequest> request = null;
        Response<GetFlowTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFlowTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFlowTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFlowTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFlowTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFlowTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been
     * deprecated, this action will return revisions that occurred before the deprecation. This action won't work for
     * workflows that have been deleted.
     * </p>
     * 
     * @param getFlowTemplateRevisionsRequest
     * @return Result of the GetFlowTemplateRevisions operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetFlowTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFlowTemplateRevisionsResult getFlowTemplateRevisions(GetFlowTemplateRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetFlowTemplateRevisions(request);
    }

    @SdkInternalApi
    final GetFlowTemplateRevisionsResult executeGetFlowTemplateRevisions(GetFlowTemplateRevisionsRequest getFlowTemplateRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getFlowTemplateRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFlowTemplateRevisionsRequest> request = null;
        Response<GetFlowTemplateRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFlowTemplateRevisionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getFlowTemplateRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFlowTemplateRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFlowTemplateRevisionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFlowTemplateRevisionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of a namespace deletion task.
     * </p>
     * 
     * @param getNamespaceDeletionStatusRequest
     * @return Result of the GetNamespaceDeletionStatus operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.GetNamespaceDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetNamespaceDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNamespaceDeletionStatusResult getNamespaceDeletionStatus(GetNamespaceDeletionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetNamespaceDeletionStatus(request);
    }

    @SdkInternalApi
    final GetNamespaceDeletionStatusResult executeGetNamespaceDeletionStatus(GetNamespaceDeletionStatusRequest getNamespaceDeletionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getNamespaceDeletionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNamespaceDeletionStatusRequest> request = null;
        Response<GetNamespaceDeletionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNamespaceDeletionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getNamespaceDeletionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNamespaceDeletionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNamespaceDeletionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetNamespaceDeletionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a system instance.
     * </p>
     * 
     * @param getSystemInstanceRequest
     * @return Result of the GetSystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSystemInstanceResult getSystemInstance(GetSystemInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetSystemInstance(request);
    }

    @SdkInternalApi
    final GetSystemInstanceResult executeGetSystemInstance(GetSystemInstanceRequest getSystemInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getSystemInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSystemInstanceRequest> request = null;
        Response<GetSystemInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSystemInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSystemInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSystemInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSystemInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSystemInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a system.
     * </p>
     * 
     * @param getSystemTemplateRequest
     * @return Result of the GetSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSystemTemplateResult getSystemTemplate(GetSystemTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetSystemTemplate(request);
    }

    @SdkInternalApi
    final GetSystemTemplateResult executeGetSystemTemplate(GetSystemTemplateRequest getSystemTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getSystemTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSystemTemplateRequest> request = null;
        Response<GetSystemTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSystemTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSystemTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSystemTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSystemTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSystemTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system
     * has been deprecated, this action will return the revisions that occurred before its deprecation. This action
     * won't work with systems that have been deleted.
     * </p>
     * 
     * @param getSystemTemplateRevisionsRequest
     * @return Result of the GetSystemTemplateRevisions operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetSystemTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSystemTemplateRevisionsResult getSystemTemplateRevisions(GetSystemTemplateRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSystemTemplateRevisions(request);
    }

    @SdkInternalApi
    final GetSystemTemplateRevisionsResult executeGetSystemTemplateRevisions(GetSystemTemplateRevisionsRequest getSystemTemplateRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSystemTemplateRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSystemTemplateRevisionsRequest> request = null;
        Response<GetSystemTemplateRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSystemTemplateRevisionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSystemTemplateRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSystemTemplateRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSystemTemplateRevisionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSystemTemplateRevisionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of the specified upload.
     * </p>
     * 
     * @param getUploadStatusRequest
     * @return Result of the GetUploadStatus operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.GetUploadStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetUploadStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetUploadStatusResult getUploadStatus(GetUploadStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetUploadStatus(request);
    }

    @SdkInternalApi
    final GetUploadStatusResult executeGetUploadStatus(GetUploadStatusRequest getUploadStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getUploadStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUploadStatusRequest> request = null;
        Response<GetUploadStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUploadStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUploadStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUploadStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUploadStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUploadStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of objects that contain information about events in a flow execution.
     * </p>
     * 
     * @param listFlowExecutionMessagesRequest
     * @return Result of the ListFlowExecutionMessages operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.ListFlowExecutionMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListFlowExecutionMessages"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFlowExecutionMessagesResult listFlowExecutionMessages(ListFlowExecutionMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeListFlowExecutionMessages(request);
    }

    @SdkInternalApi
    final ListFlowExecutionMessagesResult executeListFlowExecutionMessages(ListFlowExecutionMessagesRequest listFlowExecutionMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowExecutionMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowExecutionMessagesRequest> request = null;
        Response<ListFlowExecutionMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowExecutionMessagesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listFlowExecutionMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlowExecutionMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowExecutionMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListFlowExecutionMessagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags on an AWS IoT Things Graph resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
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
     * Searches for entities of the specified type. You can search for entities in your namespace and the public
     * namespace that you're tracking.
     * </p>
     * 
     * @param searchEntitiesRequest
     * @return Result of the SearchEntities operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.SearchEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchEntities" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchEntitiesResult searchEntities(SearchEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchEntities(request);
    }

    @SdkInternalApi
    final SearchEntitiesResult executeSearchEntities(SearchEntitiesRequest searchEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchEntitiesRequest> request = null;
        Response<SearchEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for AWS IoT Things Graph workflow execution instances.
     * </p>
     * 
     * @param searchFlowExecutionsRequest
     * @return Result of the SearchFlowExecutions operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.SearchFlowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchFlowExecutionsResult searchFlowExecutions(SearchFlowExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchFlowExecutions(request);
    }

    @SdkInternalApi
    final SearchFlowExecutionsResult executeSearchFlowExecutions(SearchFlowExecutionsRequest searchFlowExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchFlowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFlowExecutionsRequest> request = null;
        Response<SearchFlowExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFlowExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchFlowExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchFlowExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchFlowExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchFlowExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for summary information about workflows.
     * </p>
     * 
     * @param searchFlowTemplatesRequest
     * @return Result of the SearchFlowTemplates operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.SearchFlowTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchFlowTemplatesResult searchFlowTemplates(SearchFlowTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchFlowTemplates(request);
    }

    @SdkInternalApi
    final SearchFlowTemplatesResult executeSearchFlowTemplates(SearchFlowTemplatesRequest searchFlowTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchFlowTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFlowTemplatesRequest> request = null;
        Response<SearchFlowTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFlowTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchFlowTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchFlowTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchFlowTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchFlowTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for system instances in the user's account.
     * </p>
     * 
     * @param searchSystemInstancesRequest
     * @return Result of the SearchSystemInstances operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.SearchSystemInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchSystemInstancesResult searchSystemInstances(SearchSystemInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSystemInstances(request);
    }

    @SdkInternalApi
    final SearchSystemInstancesResult executeSearchSystemInstances(SearchSystemInstancesRequest searchSystemInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchSystemInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSystemInstancesRequest> request = null;
        Response<SearchSystemInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSystemInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchSystemInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSystemInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchSystemInstancesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SearchSystemInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to
     * return only systems that use the specified workflow.
     * </p>
     * 
     * @param searchSystemTemplatesRequest
     * @return Result of the SearchSystemTemplates operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.SearchSystemTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchSystemTemplatesResult searchSystemTemplates(SearchSystemTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSystemTemplates(request);
    }

    @SdkInternalApi
    final SearchSystemTemplatesResult executeSearchSystemTemplates(SearchSystemTemplatesRequest searchSystemTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchSystemTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSystemTemplatesRequest> request = null;
        Response<SearchSystemTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSystemTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchSystemTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSystemTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchSystemTemplatesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SearchSystemTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for things associated with the specified entity. You can search by both device and device model.
     * </p>
     * <p>
     * For example, if two different devices, camera1 and camera2, implement the camera device model, the user can
     * associate thing1 to camera1 and thing2 to camera2. <code>SearchThings(camera2)</code> will return only thing2,
     * but <code>SearchThings(camera)</code> will return both thing1 and thing2.
     * </p>
     * <p>
     * This action searches for exact matches and doesn't perform partial text matching.
     * </p>
     * 
     * @param searchThingsRequest
     * @return Result of the SearchThings operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.SearchThings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchThings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchThingsResult searchThings(SearchThingsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchThings(request);
    }

    @SdkInternalApi
    final SearchThingsResult executeSearchThings(SearchThingsRequest searchThingsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchThingsRequest> request = null;
        Response<SearchThingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchThingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchThingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchThings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchThingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchThingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a tag for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
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
     * Removes a system instance from its target (Cloud or Greengrass).
     * </p>
     * 
     * @param undeploySystemInstanceRequest
     * @return Result of the UndeploySystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.UndeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UndeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UndeploySystemInstanceResult undeploySystemInstance(UndeploySystemInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUndeploySystemInstance(request);
    }

    @SdkInternalApi
    final UndeploySystemInstanceResult executeUndeploySystemInstance(UndeploySystemInstanceRequest undeploySystemInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(undeploySystemInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UndeploySystemInstanceRequest> request = null;
        Response<UndeploySystemInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UndeploySystemInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(undeploySystemInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UndeploySystemInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UndeploySystemInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UndeploySystemInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
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
     * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the
     * changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new
     * workflow with a different ID), and update the copy. The workflow can contain only entities in the specified
     * namespace.
     * </p>
     * 
     * @param updateFlowTemplateRequest
     * @return Result of the UpdateFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.UpdateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFlowTemplateResult updateFlowTemplate(UpdateFlowTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlowTemplate(request);
    }

    @SdkInternalApi
    final UpdateFlowTemplateResult executeUpdateFlowTemplate(UpdateFlowTemplateRequest updateFlowTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowTemplateRequest> request = null;
        Response<UpdateFlowTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlowTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFlowTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that
     * uses the system will see the changes in the system when it is redeployed.
     * </p>
     * 
     * @param updateSystemTemplateRequest
     * @return Result of the UpdateSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.UpdateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSystemTemplateResult updateSystemTemplate(UpdateSystemTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSystemTemplate(request);
    }

    @SdkInternalApi
    final UpdateSystemTemplateResult executeUpdateSystemTemplate(UpdateSystemTemplateRequest updateSystemTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSystemTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSystemTemplateRequest> request = null;
        Response<UpdateSystemTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSystemTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSystemTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSystemTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSystemTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSystemTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Asynchronously uploads one or more entity definitions to the user's namespace. The <code>document</code>
     * parameter is required if <code>syncWithPublicNamespace</code> and <code>deleteExistingEntites</code> are false.
     * If the <code>syncWithPublicNamespace</code> parameter is set to <code>true</code>, the user's namespace will
     * synchronize with the latest version of the public namespace. If <code>deprecateExistingEntities</code> is set to
     * true, all entities in the latest version will be deleted before the new <code>DefinitionDocument</code> is
     * uploaded.
     * </p>
     * <p>
     * When a user uploads entity definitions for the first time, the service creates a new namespace for the user. The
     * new namespace tracks the public namespace. Currently users can have only one namespace. The namespace version
     * increments whenever a user uploads entity definitions that are backwards-incompatible and whenever a user sets
     * the <code>syncWithPublicNamespace</code> parameter or the <code>deprecateExistingEntities</code> parameter to
     * <code>true</code>.
     * </p>
     * <p>
     * The IDs for all of the entities should be in URN format. Each entity must be in the user's namespace. Users can't
     * create entities in the public namespace, but entity definitions can refer to entities in the public namespace.
     * </p>
     * <p>
     * Valid entities are <code>Device</code>, <code>DeviceModel</code>, <code>Service</code>, <code>Capability</code>,
     * <code>State</code>, <code>Action</code>, <code>Event</code>, <code>Property</code>, <code>Mapping</code>,
     * <code>Enum</code>.
     * </p>
     * 
     * @param uploadEntityDefinitionsRequest
     * @return Result of the UploadEntityDefinitions operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.UploadEntityDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UploadEntityDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UploadEntityDefinitionsResult uploadEntityDefinitions(UploadEntityDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeUploadEntityDefinitions(request);
    }

    @SdkInternalApi
    final UploadEntityDefinitionsResult executeUploadEntityDefinitions(UploadEntityDefinitionsRequest uploadEntityDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(uploadEntityDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadEntityDefinitionsRequest> request = null;
        Response<UploadEntityDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadEntityDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(uploadEntityDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTThingsGraph");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadEntityDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UploadEntityDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UploadEntityDefinitionsResultJsonUnmarshaller());
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
