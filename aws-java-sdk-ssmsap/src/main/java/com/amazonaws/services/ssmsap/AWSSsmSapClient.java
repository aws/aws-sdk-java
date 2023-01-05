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
package com.amazonaws.services.ssmsap;

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

import com.amazonaws.services.ssmsap.AWSSsmSapClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ssmsap.model.*;
import com.amazonaws.services.ssmsap.model.transform.*;

/**
 * Client for accessing SsmSap. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for AWS
 * Systems Manager for SAP. The topic for each action shows the API request parameters and responses.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSsmSapClient extends AmazonWebServiceClient implements AWSSsmSap {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSsmSap.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ssm-sap";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmsap.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmsap.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmsap.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmsap.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ssmsap.model.AWSSsmSapException.class));

    public static AWSSsmSapClientBuilder builder() {
        return AWSSsmSapClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SsmSap using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSsmSapClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SsmSap using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSsmSapClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ssm-sap.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ssmsap/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ssmsap/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Removes permissions associated with the target database.
     * </p>
     * 
     * @param deleteResourcePermissionRequest
     * @return Result of the DeleteResourcePermission operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.DeleteResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeleteResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePermissionResult deleteResourcePermission(DeleteResourcePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePermission(request);
    }

    @SdkInternalApi
    final DeleteResourcePermissionResult executeDeleteResourcePermission(DeleteResourcePermissionRequest deleteResourcePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePermissionRequest> request = null;
        Response<DeleteResourcePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteResourcePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteResourcePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregister an SAP application with AWS Systems Manager for SAP. This action does not aﬀect the existing setup of
     * your SAP workloads on Amazon EC2.
     * </p>
     * 
     * @param deregisterApplicationRequest
     * @return Result of the DeregisterApplication operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.DeregisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeregisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterApplicationResult deregisterApplication(DeregisterApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterApplication(request);
    }

    @SdkInternalApi
    final DeregisterApplicationResult executeDeregisterApplication(DeregisterApplicationRequest deregisterApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterApplicationRequest> request = null;
        Response<DeregisterApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterApplicationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeregisterApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an application registered with AWS Systems Manager for SAP. It also returns the components of the
     * application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetApplication" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
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
     * Gets the component of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetComponent" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
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
     * Gets the SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return Result of the GetDatabase operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDatabaseResult getDatabase(GetDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatabase(request);
    }

    @SdkInternalApi
    final GetDatabaseResult executeGetDatabase(GetDatabaseRequest getDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabaseRequest> request = null;
        Response<GetDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of an operation by specifying the operation ID.
     * </p>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOperationResult getOperation(GetOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperation(request);
    }

    @SdkInternalApi
    final GetOperationResult executeGetOperation(GetOperationRequest getOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationRequest> request = null;
        Response<GetOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets permissions associated with the target database.
     * </p>
     * 
     * @param getResourcePermissionRequest
     * @return Result of the GetResourcePermission operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetResourcePermissionResult getResourcePermission(GetResourcePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePermission(request);
    }

    @SdkInternalApi
    final GetResourcePermissionResult executeGetResourcePermission(GetResourcePermissionRequest getResourcePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePermissionRequest> request = null;
        Response<GetResourcePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePermissionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetResourcePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the applications registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListApplications" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
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
     * Lists all the components registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListComponents" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
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
     * Lists the SAP HANA databases of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDatabasesResult listDatabases(ListDatabasesRequest request) {
        request = beforeClientExecution(request);
        return executeListDatabases(request);
    }

    @SdkInternalApi
    final ListDatabasesResult executeListDatabases(ListDatabasesRequest listDatabasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatabasesRequest> request = null;
        Response<ListDatabasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatabasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatabasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatabases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags on an SAP HANA application and/or database registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSsmSap.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
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
     * Adds permissions to the target database.
     * </p>
     * 
     * @param putResourcePermissionRequest
     * @return Result of the PutResourcePermission operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.PutResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/PutResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutResourcePermissionResult putResourcePermission(PutResourcePermissionRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePermission(request);
    }

    @SdkInternalApi
    final PutResourcePermissionResult executePutResourcePermission(PutResourcePermissionRequest putResourcePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePermissionRequest> request = null;
        Response<PutResourcePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePermissionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutResourcePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Register an SAP application with AWS Systems Manager for SAP. You must meet the following requirements before
     * registering.
     * </p>
     * <p>
     * The SAP application you want to register with AWS Systems Manager for SAP is running on Amazon EC2.
     * </p>
     * <p>
     * AWS Systems Manager Agent must be setup on an Amazon EC2 instance along with the required IAM permissions.
     * </p>
     * <p>
     * Amazon EC2 instance(s) must have access to the secrets created in AWS Secrets Manager to manage SAP applications
     * and components.
     * </p>
     * 
     * @param registerApplicationRequest
     * @return Result of the RegisterApplication operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSSsmSap.RegisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/RegisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterApplicationResult registerApplication(RegisterApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterApplication(request);
    }

    @SdkInternalApi
    final RegisterApplicationResult executeRegisterApplication(RegisterApplicationRequest registerApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(registerApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterApplicationRequest> request = null;
        Response<RegisterApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates tag for a resource by specifying the ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSsmSap.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
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
     * Delete the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSsmSap.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
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
     * <p/>
     * 
     * @param updateApplicationSettingsRequest
     * @return Result of the UpdateApplicationSettings operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplicationSettings(request);
    }

    @SdkInternalApi
    final UpdateApplicationSettingsResult executeUpdateApplicationSettings(UpdateApplicationSettingsRequest updateApplicationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationSettingsRequest> request = null;
        Response<UpdateApplicationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateApplicationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Ssm Sap");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplicationSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateApplicationSettingsResultJsonUnmarshaller());
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
