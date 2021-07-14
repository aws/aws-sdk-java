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
package com.amazonaws.services.healthlake;

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

import com.amazonaws.services.healthlake.AmazonHealthLakeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.healthlake.model.*;
import com.amazonaws.services.healthlake.model.transform.*;

/**
 * Client for accessing HealthLake. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon HealthLake is a HIPAA eligibile service that allows customers to store, transform, query, and analyze their
 * FHIR-formatted data in a consistent fashion in the cloud.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonHealthLakeClient extends AmazonWebServiceClient implements AmazonHealthLake {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonHealthLake.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "healthlake";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.healthlake.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.healthlake.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.healthlake.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.healthlake.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.healthlake.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.healthlake.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.healthlake.model.AmazonHealthLakeException.class));

    public static AmazonHealthLakeClientBuilder builder() {
        return AmazonHealthLakeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on HealthLake using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonHealthLakeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on HealthLake using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonHealthLakeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("healthlake.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/healthlake/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/healthlake/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a Data Store that can ingest and export FHIR formatted data.
     * </p>
     * 
     * @param createFHIRDatastoreRequest
     * @return Result of the CreateFHIRDatastore operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.CreateFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateFHIRDatastoreResult createFHIRDatastore(CreateFHIRDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFHIRDatastore(request);
    }

    @SdkInternalApi
    final CreateFHIRDatastoreResult executeCreateFHIRDatastore(CreateFHIRDatastoreRequest createFHIRDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createFHIRDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFHIRDatastoreRequest> request = null;
        Response<CreateFHIRDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFHIRDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFHIRDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFHIRDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFHIRDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFHIRDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Data Store.
     * </p>
     * 
     * @param deleteFHIRDatastoreRequest
     * @return Result of the DeleteFHIRDatastore operation returned by the service.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ConflictException
     *         The Data Store is in a transition state and the user requested action can not be performed.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DeleteFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DeleteFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFHIRDatastoreResult deleteFHIRDatastore(DeleteFHIRDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFHIRDatastore(request);
    }

    @SdkInternalApi
    final DeleteFHIRDatastoreResult executeDeleteFHIRDatastore(DeleteFHIRDatastoreRequest deleteFHIRDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFHIRDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFHIRDatastoreRequest> request = null;
        Response<DeleteFHIRDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFHIRDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFHIRDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFHIRDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFHIRDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFHIRDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with the FHIR Data Store, including the Data Store ID, Data Store ARN, Data Store
     * name, Data Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     * 
     * @param describeFHIRDatastoreRequest
     * @return Result of the DescribeFHIRDatastore operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DescribeFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFHIRDatastoreResult describeFHIRDatastore(DescribeFHIRDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFHIRDatastore(request);
    }

    @SdkInternalApi
    final DescribeFHIRDatastoreResult executeDescribeFHIRDatastore(DescribeFHIRDatastoreRequest describeFHIRDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFHIRDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFHIRDatastoreRequest> request = null;
        Response<DescribeFHIRDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFHIRDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFHIRDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFHIRDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFHIRDatastoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeFHIRDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRExportJobRequest
     * @return Result of the DescribeFHIRExportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DescribeFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFHIRExportJobResult describeFHIRExportJob(DescribeFHIRExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFHIRExportJob(request);
    }

    @SdkInternalApi
    final DescribeFHIRExportJobResult executeDescribeFHIRExportJob(DescribeFHIRExportJobRequest describeFHIRExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFHIRExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFHIRExportJobRequest> request = null;
        Response<DescribeFHIRExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFHIRExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFHIRExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFHIRExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFHIRExportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeFHIRExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRImportJobRequest
     * @return Result of the DescribeFHIRImportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DescribeFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFHIRImportJobResult describeFHIRImportJob(DescribeFHIRImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFHIRImportJob(request);
    }

    @SdkInternalApi
    final DescribeFHIRImportJobResult executeDescribeFHIRImportJob(DescribeFHIRImportJobRequest describeFHIRImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFHIRImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFHIRImportJobRequest> request = null;
        Response<DescribeFHIRImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFHIRImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFHIRImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFHIRImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFHIRImportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeFHIRImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all FHIR Data Stores that are in the user’s account, regardless of Data Store status.
     * </p>
     * 
     * @param listFHIRDatastoresRequest
     * @return Result of the ListFHIRDatastores operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.ListFHIRDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFHIRDatastoresResult listFHIRDatastores(ListFHIRDatastoresRequest request) {
        request = beforeClientExecution(request);
        return executeListFHIRDatastores(request);
    }

    @SdkInternalApi
    final ListFHIRDatastoresResult executeListFHIRDatastores(ListFHIRDatastoresRequest listFHIRDatastoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listFHIRDatastoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFHIRDatastoresRequest> request = null;
        Response<ListFHIRDatastoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFHIRDatastoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFHIRDatastoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFHIRDatastores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFHIRDatastoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFHIRDatastoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all FHIR export jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRExportJobsRequest
     * @return Result of the ListFHIRExportJobs operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.ListFHIRExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFHIRExportJobsResult listFHIRExportJobs(ListFHIRExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListFHIRExportJobs(request);
    }

    @SdkInternalApi
    final ListFHIRExportJobsResult executeListFHIRExportJobs(ListFHIRExportJobsRequest listFHIRExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFHIRExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFHIRExportJobsRequest> request = null;
        Response<ListFHIRExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFHIRExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFHIRExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFHIRExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFHIRExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFHIRExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all FHIR import jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRImportJobsRequest
     * @return Result of the ListFHIRImportJobs operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.ListFHIRImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFHIRImportJobsResult listFHIRImportJobs(ListFHIRImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListFHIRImportJobs(request);
    }

    @SdkInternalApi
    final ListFHIRImportJobsResult executeListFHIRImportJobs(ListFHIRImportJobsRequest listFHIRImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFHIRImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFHIRImportJobsRequest> request = null;
        Response<ListFHIRImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFHIRImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFHIRImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFHIRImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFHIRImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFHIRImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all existing tags associated with a Data Store.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @sample AmazonHealthLake.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
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
     * Begins a FHIR export job.
     * </p>
     * 
     * @param startFHIRExportJobRequest
     * @return Result of the StartFHIRExportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.StartFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartFHIRExportJobResult startFHIRExportJob(StartFHIRExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartFHIRExportJob(request);
    }

    @SdkInternalApi
    final StartFHIRExportJobResult executeStartFHIRExportJob(StartFHIRExportJobRequest startFHIRExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startFHIRExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFHIRExportJobRequest> request = null;
        Response<StartFHIRExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFHIRExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFHIRExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFHIRExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFHIRExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFHIRExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Begins a FHIR Import job.
     * </p>
     * 
     * @param startFHIRImportJobRequest
     * @return Result of the StartFHIRImportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.StartFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartFHIRImportJobResult startFHIRImportJob(StartFHIRImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartFHIRImportJob(request);
    }

    @SdkInternalApi
    final StartFHIRImportJobResult executeStartFHIRImportJob(StartFHIRImportJobRequest startFHIRImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startFHIRImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFHIRImportJobRequest> request = null;
        Response<StartFHIRImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFHIRImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFHIRImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFHIRImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFHIRImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFHIRImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a user specifed key and value tag to a Data Store.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @sample AmazonHealthLake.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
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
     * Removes tags from a Data Store.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @sample AmazonHealthLake.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "HealthLake");
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
