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
package com.amazonaws.services.appregistry;

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

import com.amazonaws.services.appregistry.AWSAppRegistryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appregistry.model.*;
import com.amazonaws.services.appregistry.model.transform.*;

/**
 * Client for accessing AppRegistry. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * AWS Service Catalog AppRegistry enables organizations to understand the application context of their AWS resources.
 * AppRegistry provides a repository of your applications, their resources, and the application metadata that you use
 * within your enterprise.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppRegistryClient extends AmazonWebServiceClient implements AWSAppRegistry {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAppRegistry.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "servicecatalog";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appregistry.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appregistry.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appregistry.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appregistry.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appregistry.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appregistry.model.AWSAppRegistryException.class));

    public static AWSAppRegistryClientBuilder builder() {
        return AWSAppRegistryClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AppRegistry using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppRegistryClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AppRegistry using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppRegistryClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("servicecatalog-appregistry.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appregistry/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appregistry/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates an attribute group with an application to augment the application's metadata with the group's
     * attributes. This feature enables applications to be described with user-defined details that are
     * machine-readable, such as third-party integrations.
     * </p>
     * 
     * @param associateAttributeGroupRequest
     * @return Result of the AssociateAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @sample AWSAppRegistry.AssociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/AssociateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateAttributeGroupResult associateAttributeGroup(AssociateAttributeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAttributeGroup(request);
    }

    @SdkInternalApi
    final AssociateAttributeGroupResult executeAssociateAttributeGroup(AssociateAttributeGroupRequest associateAttributeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAttributeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAttributeGroupRequest> request = null;
        Response<AssociateAttributeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAttributeGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateAttributeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAttributeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAttributeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateAttributeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a resource with an application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param associateResourceRequest
     * @return Result of the AssociateResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @sample AWSAppRegistry.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/AssociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateResourceResult associateResource(AssociateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResource(request);
    }

    @SdkInternalApi
    final AssociateResourceResult executeAssociateResource(AssociateResourceRequest associateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResourceRequest> request = null;
        Response<AssociateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new application that is the top-level node in a hierarchy of related cloud resource abstractions.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new attribute group as a container for user-defined attributes. This feature enables users to have full
     * control over their cloud application's metadata in a rich machine-readable format to facilitate integration with
     * automated workflows and third-party tools.
     * </p>
     * 
     * @param createAttributeGroupRequest
     * @return Result of the CreateAttributeGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.CreateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/CreateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAttributeGroupResult createAttributeGroup(CreateAttributeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAttributeGroup(request);
    }

    @SdkInternalApi
    final CreateAttributeGroupResult executeCreateAttributeGroup(CreateAttributeGroupRequest createAttributeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createAttributeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAttributeGroupRequest> request = null;
        Response<CreateAttributeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAttributeGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAttributeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAttributeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAttributeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAttributeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an application that is specified either by its application ID or name. All associated attribute groups
     * and resources must be disassociated from it before deleting an application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an attribute group, specified either by its attribute group ID or name.
     * </p>
     * 
     * @param deleteAttributeGroupRequest
     * @return Result of the DeleteAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DeleteAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DeleteAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAttributeGroupResult deleteAttributeGroup(DeleteAttributeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAttributeGroup(request);
    }

    @SdkInternalApi
    final DeleteAttributeGroupResult executeDeleteAttributeGroup(DeleteAttributeGroupRequest deleteAttributeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAttributeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttributeGroupRequest> request = null;
        Response<DeleteAttributeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttributeGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAttributeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAttributeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAttributeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAttributeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an attribute group from an application to remove the extra attributes contained in the attribute
     * group from the application's metadata. This operation reverts <code>AssociateAttributeGroup</code>.
     * </p>
     * 
     * @param disassociateAttributeGroupRequest
     * @return Result of the DisassociateAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DisassociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DisassociateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateAttributeGroupResult disassociateAttributeGroup(DisassociateAttributeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAttributeGroup(request);
    }

    @SdkInternalApi
    final DisassociateAttributeGroupResult executeDisassociateAttributeGroup(DisassociateAttributeGroupRequest disassociateAttributeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAttributeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAttributeGroupRequest> request = null;
        Response<DisassociateAttributeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAttributeGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateAttributeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAttributeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAttributeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateAttributeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a resource from application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @return Result of the DisassociateResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DisassociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateResourceResult disassociateResource(DisassociateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResource(request);
    }

    @SdkInternalApi
    final DisassociateResourceResult executeDisassociateResource(DisassociateResourceRequest disassociateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResourceRequest> request = null;
        Response<DisassociateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata information about one of your applications. The application can be specified either by its
     * unique ID or by its name (which is unique within one account in one region at a given point in time). Specify by
     * ID in automated workflows if you want to make sure that the exact same application is returned or a
     * <code>ResourceNotFoundException</code> is thrown, avoiding the ABA addressing problem.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplication(request);
    }

    @SdkInternalApi
    final GetApplicationResult executeGetApplication(GetApplicationRequest getApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an attribute group, either by its name or its ID. The attribute group can be specified either by its
     * unique ID or by its name.
     * </p>
     * 
     * @param getAttributeGroupRequest
     * @return Result of the GetAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.GetAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAttributeGroupResult getAttributeGroup(GetAttributeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetAttributeGroup(request);
    }

    @SdkInternalApi
    final GetAttributeGroupResult executeGetAttributeGroup(GetAttributeGroupRequest getAttributeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getAttributeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttributeGroupRequest> request = null;
        Response<GetAttributeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttributeGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAttributeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAttributeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAttributeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAttributeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all of your applications. Results are paginated.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all attribute groups that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedAttributeGroupsRequest
     * @return Result of the ListAssociatedAttributeGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListAssociatedAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListAssociatedAttributeGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssociatedAttributeGroupsResult listAssociatedAttributeGroups(ListAssociatedAttributeGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociatedAttributeGroups(request);
    }

    @SdkInternalApi
    final ListAssociatedAttributeGroupsResult executeListAssociatedAttributeGroups(ListAssociatedAttributeGroupsRequest listAssociatedAttributeGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociatedAttributeGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedAttributeGroupsRequest> request = null;
        Response<ListAssociatedAttributeGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedAttributeGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssociatedAttributeGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociatedAttributeGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociatedAttributeGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssociatedAttributeGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all resources that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedResourcesRequest
     * @return Result of the ListAssociatedResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListAssociatedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListAssociatedResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssociatedResourcesResult listAssociatedResources(ListAssociatedResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociatedResources(request);
    }

    @SdkInternalApi
    final ListAssociatedResourcesResult executeListAssociatedResources(ListAssociatedResourcesRequest listAssociatedResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociatedResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedResourcesRequest> request = null;
        Response<ListAssociatedResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssociatedResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociatedResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociatedResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssociatedResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all attribute groups which you have access to. Results are paginated.
     * </p>
     * 
     * @param listAttributeGroupsRequest
     * @return Result of the ListAttributeGroups operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListAttributeGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAttributeGroupsResult listAttributeGroups(ListAttributeGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListAttributeGroups(request);
    }

    @SdkInternalApi
    final ListAttributeGroupsResult executeListAttributeGroups(ListAttributeGroupsRequest listAttributeGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttributeGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttributeGroupsRequest> request = null;
        Response<ListAttributeGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttributeGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttributeGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttributeGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttributeGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttributeGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
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
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
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
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
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
     * Updates an existing application with new attributes.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing attribute group with new details.
     * </p>
     * 
     * @param updateAttributeGroupRequest
     * @return Result of the UpdateAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.UpdateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/UpdateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAttributeGroupResult updateAttributeGroup(UpdateAttributeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAttributeGroup(request);
    }

    @SdkInternalApi
    final UpdateAttributeGroupResult executeUpdateAttributeGroup(UpdateAttributeGroupRequest updateAttributeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAttributeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAttributeGroupRequest> request = null;
        Response<UpdateAttributeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAttributeGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAttributeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog AppRegistry");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAttributeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAttributeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAttributeGroupResultJsonUnmarshaller());
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
