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
package com.amazonaws.services.keyspaces;

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

import com.amazonaws.services.keyspaces.AmazonKeyspacesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.keyspaces.model.*;
import com.amazonaws.services.keyspaces.model.transform.*;

/**
 * Client for accessing Amazon Keyspaces. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Keyspaces (for Apache Cassandra) is a scalable, highly available, and managed Apache Cassandra-compatible
 * database service. Amazon Keyspaces makes it easy to migrate, run, and scale Cassandra workloads in the Amazon Web
 * Services Cloud. With just a few clicks on the Amazon Web Services Management Console or a few lines of code, you can
 * create keyspaces and tables in Amazon Keyspaces, without deploying any infrastructure or installing software.
 * </p>
 * <p>
 * In addition to supporting Cassandra Query Language (CQL) requests via open-source Cassandra drivers, Amazon Keyspaces
 * supports data definition language (DDL) operations to manage keyspaces and tables using the Amazon Web Services SDK
 * and CLI. This API reference describes the supported DDL operations in detail.
 * </p>
 * <p>
 * For the list of all supported CQL APIs, see <a
 * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cassandra-apis.html">Supported Cassandra APIs,
 * operations, and data types in Amazon Keyspaces</a> in the <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * <p>
 * To learn how Amazon Keyspaces API actions are recorded with CloudTrail, see <a href=
 * "https://docs.aws.amazon.com/keyspaces/latest/devguide/logging-using-cloudtrail.html#service-name-info-in-cloudtrail"
 * >Amazon Keyspaces information in CloudTrail</a> in the <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * <p>
 * For more information about Amazon Web Services APIs, for example how to implement retry logic or how to sign Amazon
 * Web Services API requests, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-apis.html">Amazon Web
 * Services APIs</a> in the <i>General Reference</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKeyspacesClient extends AmazonWebServiceClient implements AmazonKeyspaces {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKeyspaces.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cassandra";

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
                                    com.amazonaws.services.keyspaces.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.keyspaces.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.keyspaces.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.keyspaces.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.keyspaces.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.keyspaces.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.keyspaces.model.AmazonKeyspacesException.class));

    public static AmazonKeyspacesClientBuilder builder() {
        return AmazonKeyspacesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Keyspaces using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKeyspacesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Keyspaces using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKeyspacesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cassandra.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/keyspaces/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/keyspaces/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * The <code>CreateKeyspace</code> operation adds a new keyspace to your account. In an Amazon Web Services account,
     * keyspace names must be unique within each Region.
     * </p>
     * <p>
     * <code>CreateKeyspace</code> is an asynchronous operation. You can monitor the creation status of the new keyspace
     * by using the <code>GetKeyspace</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-keyspaces.html#keyspaces-create"
     * >Creating keyspaces</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param createKeyspaceRequest
     * @return Result of the CreateKeyspace operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonKeyspaces.CreateKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateKeyspaceResult createKeyspace(CreateKeyspaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKeyspace(request);
    }

    @SdkInternalApi
    final CreateKeyspaceResult executeCreateKeyspace(CreateKeyspaceRequest createKeyspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createKeyspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyspaceRequest> request = null;
        Response<CreateKeyspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createKeyspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateKeyspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateKeyspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateKeyspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateTable</code> operation adds a new table to the specified keyspace. Within a keyspace, table names
     * must be unique.
     * </p>
     * <p>
     * <code>CreateTable</code> is an asynchronous operation. When the request is received, the status of the table is
     * set to <code>CREATING</code>. You can monitor the creation status of the new table by using the
     * <code>GetTable</code> operation, which returns the current <code>status</code> of the table. You can start using
     * a table when the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html#tables-create">Creating
     * tables</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param createTableRequest
     * @return Result of the CreateTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTableResult createTable(CreateTableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTable(request);
    }

    @SdkInternalApi
    final CreateTableResult executeCreateTable(CreateTableRequest createTableRequest) {

        ExecutionContext executionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTableRequest> request = null;
        Response<CreateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DeleteKeyspace</code> operation deletes a keyspace and all of its tables.
     * </p>
     * 
     * @param deleteKeyspaceRequest
     * @return Result of the DeleteKeyspace operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.DeleteKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteKeyspaceResult deleteKeyspace(DeleteKeyspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKeyspace(request);
    }

    @SdkInternalApi
    final DeleteKeyspaceResult executeDeleteKeyspace(DeleteKeyspaceRequest deleteKeyspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKeyspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKeyspaceRequest> request = null;
        Response<DeleteKeyspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKeyspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKeyspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKeyspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKeyspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKeyspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DeleteTable</code> operation deletes a table and all of its data. After a <code>DeleteTable</code>
     * request is received, the specified table is in the <code>DELETING</code> state until Amazon Keyspaces completes
     * the deletion. If the table is in the <code>ACTIVE</code> state, you can delete it. If a table is either in the
     * <code>CREATING</code> or <code>UPDATING</code> states, then Amazon Keyspaces returns a
     * <code>ResourceInUseException</code>. If the specified table does not exist, Amazon Keyspaces returns a
     * <code>ResourceNotFoundException</code>. If the table is already in the <code>DELETING</code> state, no error is
     * returned.
     * </p>
     * 
     * @param deleteTableRequest
     * @return Result of the DeleteTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTableResult deleteTable(DeleteTableRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTable(request);
    }

    @SdkInternalApi
    final DeleteTableResult executeDeleteTable(DeleteTableRequest deleteTableRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableRequest> request = null;
        Response<DeleteTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the name and the Amazon Resource Name (ARN) of the specified table.
     * </p>
     * 
     * @param getKeyspaceRequest
     * @return Result of the GetKeyspace operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.GetKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyspaceResult getKeyspace(GetKeyspaceRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyspace(request);
    }

    @SdkInternalApi
    final GetKeyspaceResult executeGetKeyspace(GetKeyspaceRequest getKeyspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyspaceRequest> request = null;
        Response<GetKeyspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKeyspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the table, including the table's name and current status, the keyspace name,
     * configuration settings, and metadata.
     * </p>
     * <p>
     * To read table metadata using <code>GetTable</code>, <code>Select</code> action permissions for the table and
     * system tables are required to complete the operation.
     * </p>
     * 
     * @param getTableRequest
     * @return Result of the GetTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTableResult getTable(GetTableRequest request) {
        request = beforeClientExecution(request);
        return executeGetTable(request);
    }

    @SdkInternalApi
    final GetTableResult executeGetTable(GetTableRequest getTableRequest) {

        ExecutionContext executionContext = createExecutionContext(getTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableRequest> request = null;
        Response<GetTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTableResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of keyspaces.
     * </p>
     * 
     * @param listKeyspacesRequest
     * @return Result of the ListKeyspaces operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.ListKeyspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListKeyspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListKeyspacesResult listKeyspaces(ListKeyspacesRequest request) {
        request = beforeClientExecution(request);
        return executeListKeyspaces(request);
    }

    @SdkInternalApi
    final ListKeyspacesResult executeListKeyspaces(ListKeyspacesRequest listKeyspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listKeyspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyspacesRequest> request = null;
        Response<ListKeyspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listKeyspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKeyspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKeyspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListKeyspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tables for a specified keyspace.
     * </p>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTablesResult listTables(ListTablesRequest request) {
        request = beforeClientExecution(request);
        return executeListTables(request);
    }

    @SdkInternalApi
    final ListTablesResult executeListTables(ListTablesRequest listTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTablesRequest> request = null;
        Response<ListTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTablesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Keyspaces resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
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
     * Restores the specified table to the specified point in time within the <code>earliest_restorable_timestamp</code>
     * and the current time. For more information about restore points, see <a href=
     * "https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery_HowItWorks.html#howitworks_backup_window"
     * > Time window for PITR continuous backups</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.
     * </p>
     * <p>
     * When you restore using point in time recovery, Amazon Keyspaces restores your source table's schema and data to
     * the state based on the selected timestamp <code>(day:hour:minute:second)</code> to a new table. The Time to Live
     * (TTL) settings are also restored to the state based on the selected timestamp.
     * </p>
     * <p>
     * In addition to the table's schema, data, and TTL settings, <code>RestoreTable</code> restores the capacity mode,
     * encryption, and point-in-time recovery settings from the source table. Unlike the table's schema data and TTL
     * settings, which are restored based on the selected timestamp, these settings are always restored based on the
     * table's settings as of the current time or when the table was deleted.
     * </p>
     * <p>
     * You can also overwrite these settings during restore:
     * </p>
     * <p>
     * • Read/write capacity mode
     * </p>
     * <p>
     * • Provisioned throughput capacity settings
     * </p>
     * <p>
     * • Point-in-time (PITR) settings
     * </p>
     * <p>
     * • Tags
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery_HowItWorks.html#howitworks_backup_settings"
     * >PITR restore settings</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * Note that the following settings are not restored, and you must configure them manually for the new table:
     * </p>
     * <p>
     * • Automatic scaling policies (for tables that use provisioned capacity mode)
     * </p>
     * <p>
     * • Identity and Access Management (IAM) policies
     * </p>
     * <p>
     * • Amazon CloudWatch metrics and alarms
     * </p>
     * 
     * @param restoreTableRequest
     * @return Result of the RestoreTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.RestoreTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/RestoreTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RestoreTableResult restoreTable(RestoreTableRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreTable(request);
    }

    @SdkInternalApi
    final RestoreTableResult executeRestoreTable(RestoreTableRequest restoreTableRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreTableRequest> request = null;
        Response<RestoreTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a set of tags with a Amazon Keyspaces resource. You can then activate these user-defined tags so that
     * they appear on the Cost Management Console for cost allocation tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * For IAM policy examples that show how to control access to Amazon Keyspaces resources based on tags, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/security_iam_id-based-policy-examples-tags">Amazon
     * Keyspaces resource access based on tags</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
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
     * Removes the association of tags from a Amazon Keyspaces resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
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
     * Adds new columns to the table or updates one of the table's settings, for example capacity mode, encryption,
     * point-in-time recovery, or ttl settings. Note that you can only update one specific table setting per update
     * operation.
     * </p>
     * 
     * @param updateTableRequest
     * @return Result of the UpdateTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTableResult updateTable(UpdateTableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTable(request);
    }

    @SdkInternalApi
    final UpdateTableResult executeUpdateTable(UpdateTableRequest updateTableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTableRequest> request = null;
        Response<UpdateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Keyspaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTableResultJsonUnmarshaller());
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
