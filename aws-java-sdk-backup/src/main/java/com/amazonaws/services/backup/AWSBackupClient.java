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
package com.amazonaws.services.backup;

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

import com.amazonaws.services.backup.AWSBackupClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.services.backup.model.transform.*;

/**
 * Client for accessing AWS Backup. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Backup</fullname>
 * <p>
 * Backup is a unified backup service designed to protect Amazon Web Services services and their associated data. Backup
 * simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and
 * auditing.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBackupClient extends AmazonWebServiceClient implements AWSBackup {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBackup.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "backup";

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
                            new JsonErrorShapeMetadata().withErrorCode("MissingParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.MissingParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.DependencyFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.AlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.InvalidResourceStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backup.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.backup.model.AWSBackupException.class));

    public static AWSBackupClientBuilder builder() {
        return AWSBackupClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Backup using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBackupClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Backup using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBackupClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("backup.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/backup/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/backup/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This action removes the specified legal hold on a recovery point. This action can only be performed by a user
     * with sufficient permissions.
     * </p>
     * 
     * @param cancelLegalHoldRequest
     * @return Result of the CancelLegalHold operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws InvalidResourceStateException
     *         Backup is already performing an action on this recovery point. It can't perform the action you requested
     *         until the first action finishes. Try again later.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.CancelLegalHold
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CancelLegalHold" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelLegalHoldResult cancelLegalHold(CancelLegalHoldRequest request) {
        request = beforeClientExecution(request);
        return executeCancelLegalHold(request);
    }

    @SdkInternalApi
    final CancelLegalHoldResult executeCancelLegalHold(CancelLegalHoldRequest cancelLegalHoldRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelLegalHoldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelLegalHoldRequest> request = null;
        Response<CancelLegalHoldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelLegalHoldRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelLegalHoldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelLegalHold");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelLegalHoldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelLegalHoldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a backup plan using a backup plan name and backup rules. A backup plan is a document that contains
     * information that Backup uses to schedule tasks that create recovery points for resources.
     * </p>
     * <p>
     * If you call <code>CreateBackupPlan</code> with a plan that already exists, you receive an
     * <code>AlreadyExistsException</code> exception.
     * </p>
     * 
     * @param createBackupPlanRequest
     * @return Result of the CreateBackupPlan operation returned by the service.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.CreateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBackupPlanResult createBackupPlan(CreateBackupPlanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackupPlan(request);
    }

    @SdkInternalApi
    final CreateBackupPlanResult executeCreateBackupPlan(CreateBackupPlanRequest createBackupPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupPlanRequest> request = null;
        Response<CreateBackupPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackupPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackupPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackupPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackupPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a JSON document that specifies a set of resources to assign to a backup plan. For examples, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-json"
     * >Assigning resources programmatically</a>.
     * </p>
     * 
     * @param createBackupSelectionRequest
     * @return Result of the CreateBackupSelection operation returned by the service.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.CreateBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateBackupSelectionResult createBackupSelection(CreateBackupSelectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackupSelection(request);
    }

    @SdkInternalApi
    final CreateBackupSelectionResult executeCreateBackupSelection(CreateBackupSelectionRequest createBackupSelectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackupSelectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupSelectionRequest> request = null;
        Response<CreateBackupSelectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupSelectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackupSelectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackupSelection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackupSelectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateBackupSelectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a logical container where backups are stored. A <code>CreateBackupVault</code> request includes a name,
     * optionally one or more resource tags, an encryption key, and a request ID.
     * </p>
     * <note>
     * <p>
     * Do not include sensitive data, such as passport numbers, in the name of a backup vault.
     * </p>
     * </note>
     * 
     * @param createBackupVaultRequest
     * @return Result of the CreateBackupVault operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @sample AWSBackup.CreateBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBackupVaultResult createBackupVault(CreateBackupVaultRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackupVault(request);
    }

    @SdkInternalApi
    final CreateBackupVaultResult executeCreateBackupVault(CreateBackupVaultRequest createBackupVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupVaultRequest> request = null;
        Response<CreateBackupVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackupVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackupVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackupVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackupVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a framework with one or more controls. A framework is a collection of controls that you can use to
     * evaluate your backup practices. By using pre-built customizable controls to define your policies, you can
     * evaluate whether your backup practices comply with your policies and which resources are not yet in compliance.
     * </p>
     * 
     * @param createFrameworkRequest
     * @return Result of the CreateFramework operation returned by the service.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.CreateFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateFramework" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFrameworkResult createFramework(CreateFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFramework(request);
    }

    @SdkInternalApi
    final CreateFrameworkResult executeCreateFramework(CreateFrameworkRequest createFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFrameworkRequest> request = null;
        Response<CreateFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action creates a legal hold on a recovery point (backup). A legal hold is a restraint on altering or
     * deleting a backup until an authorized user cancels the legal hold. Any actions to delete or disassociate a
     * recovery point will fail with an error if one or more active legal holds are on the recovery point.
     * </p>
     * 
     * @param createLegalHoldRequest
     * @return Result of the CreateLegalHold operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @sample AWSBackup.CreateLegalHold
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateLegalHold" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLegalHoldResult createLegalHold(CreateLegalHoldRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLegalHold(request);
    }

    @SdkInternalApi
    final CreateLegalHoldResult executeCreateLegalHold(CreateLegalHoldRequest createLegalHoldRequest) {

        ExecutionContext executionContext = createExecutionContext(createLegalHoldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLegalHoldRequest> request = null;
        Response<CreateLegalHoldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLegalHoldRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLegalHoldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLegalHold");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLegalHoldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLegalHoldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a report plan. A report plan is a document that contains information about the contents of the report and
     * where Backup will deliver it.
     * </p>
     * <p>
     * If you call <code>CreateReportPlan</code> with a plan that already exists, you receive an
     * <code>AlreadyExistsException</code> exception.
     * </p>
     * 
     * @param createReportPlanRequest
     * @return Result of the CreateReportPlan operation returned by the service.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @sample AWSBackup.CreateReportPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateReportPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateReportPlanResult createReportPlan(CreateReportPlanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReportPlan(request);
    }

    @SdkInternalApi
    final CreateReportPlanResult executeCreateReportPlan(CreateReportPlanRequest createReportPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(createReportPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReportPlanRequest> request = null;
        Response<CreateReportPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReportPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createReportPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReportPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReportPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateReportPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been
     * deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will
     * still exist.
     * </p>
     * 
     * @param deleteBackupPlanRequest
     * @return Result of the DeleteBackupPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DeleteBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBackupPlanResult deleteBackupPlan(DeleteBackupPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackupPlan(request);
    }

    @SdkInternalApi
    final DeleteBackupPlanResult executeDeleteBackupPlan(DeleteBackupPlanRequest deleteBackupPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupPlanRequest> request = null;
        Response<DeleteBackupPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackupPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackupPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the resource selection associated with a backup plan that is specified by the <code>SelectionId</code>.
     * </p>
     * 
     * @param deleteBackupSelectionRequest
     * @return Result of the DeleteBackupSelection operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DeleteBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBackupSelectionResult deleteBackupSelection(DeleteBackupSelectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackupSelection(request);
    }

    @SdkInternalApi
    final DeleteBackupSelectionResult executeDeleteBackupSelection(DeleteBackupSelectionRequest deleteBackupSelectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupSelectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupSelectionRequest> request = null;
        Response<DeleteBackupSelectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupSelectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupSelectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackupSelection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupSelectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteBackupSelectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
     * </p>
     * 
     * @param deleteBackupVaultRequest
     * @return Result of the DeleteBackupVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DeleteBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBackupVaultResult deleteBackupVault(DeleteBackupVaultRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackupVault(request);
    }

    @SdkInternalApi
    final DeleteBackupVaultResult executeDeleteBackupVault(DeleteBackupVaultRequest deleteBackupVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupVaultRequest> request = null;
        Response<DeleteBackupVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackupVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackupVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the policy document that manages permissions on a backup vault.
     * </p>
     * 
     * @param deleteBackupVaultAccessPolicyRequest
     * @return Result of the DeleteBackupVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DeleteBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBackupVaultAccessPolicyResult deleteBackupVaultAccessPolicy(DeleteBackupVaultAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackupVaultAccessPolicy(request);
    }

    @SdkInternalApi
    final DeleteBackupVaultAccessPolicyResult executeDeleteBackupVaultAccessPolicy(DeleteBackupVaultAccessPolicyRequest deleteBackupVaultAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupVaultAccessPolicyRequest> request = null;
        Response<DeleteBackupVaultAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupVaultAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBackupVaultAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackupVaultAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupVaultAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBackupVaultAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes Backup Vault Lock from a backup vault specified by a backup vault name.
     * </p>
     * <p>
     * If the Vault Lock configuration is immutable, then you cannot delete Vault Lock using API operations, and you
     * will receive an <code>InvalidRequestException</code> if you attempt to do so. For more information, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html">Vault Lock</a> in the <i>Backup
     * Developer Guide</i>.
     * </p>
     * 
     * @param deleteBackupVaultLockConfigurationRequest
     * @return Result of the DeleteBackupVaultLockConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DeleteBackupVaultLockConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultLockConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBackupVaultLockConfigurationResult deleteBackupVaultLockConfiguration(DeleteBackupVaultLockConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackupVaultLockConfiguration(request);
    }

    @SdkInternalApi
    final DeleteBackupVaultLockConfigurationResult executeDeleteBackupVaultLockConfiguration(
            DeleteBackupVaultLockConfigurationRequest deleteBackupVaultLockConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupVaultLockConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupVaultLockConfigurationRequest> request = null;
        Response<DeleteBackupVaultLockConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupVaultLockConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBackupVaultLockConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackupVaultLockConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupVaultLockConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBackupVaultLockConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes event notifications for the specified backup vault.
     * </p>
     * 
     * @param deleteBackupVaultNotificationsRequest
     * @return Result of the DeleteBackupVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DeleteBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBackupVaultNotificationsResult deleteBackupVaultNotifications(DeleteBackupVaultNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackupVaultNotifications(request);
    }

    @SdkInternalApi
    final DeleteBackupVaultNotificationsResult executeDeleteBackupVaultNotifications(DeleteBackupVaultNotificationsRequest deleteBackupVaultNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupVaultNotificationsRequest> request = null;
        Response<DeleteBackupVaultNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupVaultNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBackupVaultNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackupVaultNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupVaultNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBackupVaultNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the framework specified by a framework name.
     * </p>
     * 
     * @param deleteFrameworkRequest
     * @return Result of the DeleteFramework operation returned by the service.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ConflictException
     *         Backup can't perform the action that you requested until it finishes performing a previous action. Try
     *         again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.DeleteFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteFramework" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFrameworkResult deleteFramework(DeleteFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFramework(request);
    }

    @SdkInternalApi
    final DeleteFrameworkResult executeDeleteFramework(DeleteFrameworkRequest deleteFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFrameworkRequest> request = null;
        Response<DeleteFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the recovery point specified by a recovery point ID.
     * </p>
     * <p>
     * If the recovery point ID belongs to a continuous backup, calling this endpoint deletes the existing continuous
     * backup and stops future continuous backup.
     * </p>
     * <p>
     * When an IAM role's permissions are insufficient to call this API, the service sends back an HTTP 200 response
     * with an empty HTTP body, but the recovery point is not deleted. Instead, it enters an <code>EXPIRED</code> state.
     * </p>
     * <p>
     * <code>EXPIRED</code> recovery points can be deleted with this API once the IAM role has the
     * <code>iam:CreateServiceLinkedRole</code> action. To learn more about adding this role, see <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/deleting-backups.html#deleting-backups-troubleshooting">
     * Troubleshooting manual deletions</a>.
     * </p>
     * <p>
     * If the user or role is deleted or the permission within the role is removed, the deletion will not be successful
     * and will enter an <code>EXPIRED</code> state.
     * </p>
     * 
     * @param deleteRecoveryPointRequest
     * @return Result of the DeleteRecoveryPoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidResourceStateException
     *         Backup is already performing an action on this recovery point. It can't perform the action you requested
     *         until the first action finishes. Try again later.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DeleteRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteRecoveryPoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRecoveryPointResult deleteRecoveryPoint(DeleteRecoveryPointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRecoveryPoint(request);
    }

    @SdkInternalApi
    final DeleteRecoveryPointResult executeDeleteRecoveryPoint(DeleteRecoveryPointRequest deleteRecoveryPointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecoveryPointRequest> request = null;
        Response<DeleteRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecoveryPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRecoveryPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRecoveryPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRecoveryPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the report plan specified by a report plan name.
     * </p>
     * 
     * @param deleteReportPlanRequest
     * @return Result of the DeleteReportPlan operation returned by the service.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ConflictException
     *         Backup can't perform the action that you requested until it finishes performing a previous action. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.DeleteReportPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteReportPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReportPlanResult deleteReportPlan(DeleteReportPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReportPlan(request);
    }

    @SdkInternalApi
    final DeleteReportPlanResult executeDeleteReportPlan(DeleteReportPlanRequest deleteReportPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReportPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReportPlanRequest> request = null;
        Response<DeleteReportPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReportPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReportPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReportPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReportPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReportPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns backup job details for the specified <code>BackupJobId</code>.
     * </p>
     * 
     * @param describeBackupJobRequest
     * @return Result of the DescribeBackupJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws DependencyFailureException
     *         A dependent Amazon Web Services service or resource returned an error to the Backup service, and the
     *         action cannot be completed.
     * @sample AWSBackup.DescribeBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBackupJobResult describeBackupJob(DescribeBackupJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBackupJob(request);
    }

    @SdkInternalApi
    final DescribeBackupJobResult executeDescribeBackupJob(DescribeBackupJobRequest describeBackupJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBackupJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupJobRequest> request = null;
        Response<DescribeBackupJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBackupJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBackupJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBackupJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBackupJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about a backup vault specified by its name.
     * </p>
     * 
     * @param describeBackupVaultRequest
     * @return Result of the DescribeBackupVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBackupVaultResult describeBackupVault(DescribeBackupVaultRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBackupVault(request);
    }

    @SdkInternalApi
    final DescribeBackupVaultResult executeDescribeBackupVault(DescribeBackupVaultRequest describeBackupVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupVaultRequest> request = null;
        Response<DescribeBackupVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBackupVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBackupVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBackupVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBackupVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata associated with creating a copy of a resource.
     * </p>
     * 
     * @param describeCopyJobRequest
     * @return Result of the DescribeCopyJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeCopyJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeCopyJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeCopyJobResult describeCopyJob(DescribeCopyJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCopyJob(request);
    }

    @SdkInternalApi
    final DescribeCopyJobResult executeDescribeCopyJob(DescribeCopyJobRequest describeCopyJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCopyJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCopyJobRequest> request = null;
        Response<DescribeCopyJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCopyJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCopyJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCopyJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCopyJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCopyJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the framework details for the specified <code>FrameworkName</code>.
     * </p>
     * 
     * @param describeFrameworkRequest
     * @return Result of the DescribeFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeFramework" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFrameworkResult describeFramework(DescribeFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFramework(request);
    }

    @SdkInternalApi
    final DescribeFrameworkResult executeDescribeFramework(DescribeFrameworkRequest describeFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFrameworkRequest> request = null;
        Response<DescribeFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes whether the Amazon Web Services account is opted in to cross-account backup. Returns an error if the
     * account is not a member of an Organizations organization. Example:
     * <code>describe-global-settings --region us-west-2</code>
     * </p>
     * 
     * @param describeGlobalSettingsRequest
     * @return Result of the DescribeGlobalSettings operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeGlobalSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeGlobalSettingsResult describeGlobalSettings(DescribeGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGlobalSettings(request);
    }

    @SdkInternalApi
    final DescribeGlobalSettingsResult executeDescribeGlobalSettings(DescribeGlobalSettingsRequest describeGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalSettingsRequest> request = null;
        Response<DescribeGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a saved resource, including the last time it was backed up, its Amazon Resource Name
     * (ARN), and the Amazon Web Services service type of the saved resource.
     * </p>
     * 
     * @param describeProtectedResourceRequest
     * @return Result of the DescribeProtectedResource operation returned by the service.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.DescribeProtectedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeProtectedResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProtectedResourceResult describeProtectedResource(DescribeProtectedResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProtectedResource(request);
    }

    @SdkInternalApi
    final DescribeProtectedResourceResult executeDescribeProtectedResource(DescribeProtectedResourceRequest describeProtectedResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProtectedResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProtectedResourceRequest> request = null;
        Response<DescribeProtectedResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProtectedResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeProtectedResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProtectedResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProtectedResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProtectedResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
     * </p>
     * 
     * @param describeRecoveryPointRequest
     * @return Result of the DescribeRecoveryPoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRecoveryPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRecoveryPointResult describeRecoveryPoint(DescribeRecoveryPointRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecoveryPoint(request);
    }

    @SdkInternalApi
    final DescribeRecoveryPointResult executeDescribeRecoveryPoint(DescribeRecoveryPointRequest describeRecoveryPointRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecoveryPointRequest> request = null;
        Response<DescribeRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecoveryPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecoveryPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecoveryPointResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeRecoveryPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current service opt-in settings for the Region. If service opt-in is enabled for a service, Backup
     * tries to protect that service's resources in this Region, when the resource is included in an on-demand backup or
     * scheduled backup plan. Otherwise, Backup does not try to protect that service's resources in this Region.
     * </p>
     * 
     * @param describeRegionSettingsRequest
     * @return Result of the DescribeRegionSettings operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeRegionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRegionSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRegionSettingsResult describeRegionSettings(DescribeRegionSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRegionSettings(request);
    }

    @SdkInternalApi
    final DescribeRegionSettingsResult executeDescribeRegionSettings(DescribeRegionSettingsRequest describeRegionSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRegionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRegionSettingsRequest> request = null;
        Response<DescribeRegionSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRegionSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRegionSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRegionSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRegionSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRegionSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details associated with creating a report as specified by its <code>ReportJobId</code>.
     * </p>
     * 
     * @param describeReportJobRequest
     * @return Result of the DescribeReportJob operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.DescribeReportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeReportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeReportJobResult describeReportJob(DescribeReportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReportJob(request);
    }

    @SdkInternalApi
    final DescribeReportJobResult executeDescribeReportJob(DescribeReportJobRequest describeReportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReportJobRequest> request = null;
        Response<DescribeReportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeReportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeReportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all report plans for an Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * 
     * @param describeReportPlanRequest
     * @return Result of the DescribeReportPlan operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeReportPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeReportPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeReportPlanResult describeReportPlan(DescribeReportPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReportPlan(request);
    }

    @SdkInternalApi
    final DescribeReportPlanResult executeDescribeReportPlan(DescribeReportPlanRequest describeReportPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReportPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReportPlanRequest> request = null;
        Response<DescribeReportPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReportPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeReportPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReportPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReportPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeReportPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata associated with a restore job that is specified by a job ID.
     * </p>
     * 
     * @param describeRestoreJobRequest
     * @return Result of the DescribeRestoreJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws DependencyFailureException
     *         A dependent Amazon Web Services service or resource returned an error to the Backup service, and the
     *         action cannot be completed.
     * @sample AWSBackup.DescribeRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRestoreJobResult describeRestoreJob(DescribeRestoreJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRestoreJob(request);
    }

    @SdkInternalApi
    final DescribeRestoreJobResult executeDescribeRestoreJob(DescribeRestoreJobRequest describeRestoreJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRestoreJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRestoreJobRequest> request = null;
        Response<DescribeRestoreJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRestoreJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRestoreJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRestoreJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRestoreJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRestoreJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified continuous backup recovery point from Backup and releases control of that continuous backup
     * to the source service, such as Amazon RDS. The source service will continue to create and retain continuous
     * backups using the lifecycle that you specified in your original backup plan.
     * </p>
     * <p>
     * Does not support snapshot backup recovery points.
     * </p>
     * 
     * @param disassociateRecoveryPointRequest
     * @return Result of the DisassociateRecoveryPoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidResourceStateException
     *         Backup is already performing an action on this recovery point. It can't perform the action you requested
     *         until the first action finishes. Try again later.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DisassociateRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DisassociateRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateRecoveryPointResult disassociateRecoveryPoint(DisassociateRecoveryPointRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateRecoveryPoint(request);
    }

    @SdkInternalApi
    final DisassociateRecoveryPointResult executeDisassociateRecoveryPoint(DisassociateRecoveryPointRequest disassociateRecoveryPointRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateRecoveryPointRequest> request = null;
        Response<DisassociateRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateRecoveryPointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateRecoveryPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateRecoveryPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateRecoveryPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action to a specific child (nested) recovery point removes the relationship between the specified recovery
     * point and its parent (composite) recovery point.
     * </p>
     * 
     * @param disassociateRecoveryPointFromParentRequest
     * @return Result of the DisassociateRecoveryPointFromParent operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DisassociateRecoveryPointFromParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DisassociateRecoveryPointFromParent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateRecoveryPointFromParentResult disassociateRecoveryPointFromParent(DisassociateRecoveryPointFromParentRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateRecoveryPointFromParent(request);
    }

    @SdkInternalApi
    final DisassociateRecoveryPointFromParentResult executeDisassociateRecoveryPointFromParent(
            DisassociateRecoveryPointFromParentRequest disassociateRecoveryPointFromParentRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateRecoveryPointFromParentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateRecoveryPointFromParentRequest> request = null;
        Response<DisassociateRecoveryPointFromParentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateRecoveryPointFromParentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateRecoveryPointFromParentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateRecoveryPointFromParent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateRecoveryPointFromParentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateRecoveryPointFromParentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the backup plan that is specified by the plan ID as a backup template.
     * </p>
     * 
     * @param exportBackupPlanTemplateRequest
     * @return Result of the ExportBackupPlanTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.ExportBackupPlanTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ExportBackupPlanTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportBackupPlanTemplateResult exportBackupPlanTemplate(ExportBackupPlanTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeExportBackupPlanTemplate(request);
    }

    @SdkInternalApi
    final ExportBackupPlanTemplateResult executeExportBackupPlanTemplate(ExportBackupPlanTemplateRequest exportBackupPlanTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(exportBackupPlanTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportBackupPlanTemplateRequest> request = null;
        Response<ExportBackupPlanTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportBackupPlanTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(exportBackupPlanTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportBackupPlanTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportBackupPlanTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExportBackupPlanTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns <code>BackupPlan</code> details for the specified <code>BackupPlanId</code>. The details are the body of
     * a backup plan in JSON format, in addition to plan metadata.
     * </p>
     * 
     * @param getBackupPlanRequest
     * @return Result of the GetBackupPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBackupPlanResult getBackupPlan(GetBackupPlanRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackupPlan(request);
    }

    @SdkInternalApi
    final GetBackupPlanResult executeGetBackupPlan(GetBackupPlanRequest getBackupPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupPlanRequest> request = null;
        Response<GetBackupPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackupPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackupPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackupPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBackupPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a valid JSON document specifying a backup plan or an error.
     * </p>
     * 
     * @param getBackupPlanFromJSONRequest
     * @return Result of the GetBackupPlanFromJSON operation returned by the service.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.GetBackupPlanFromJSON
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromJSON" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBackupPlanFromJSONResult getBackupPlanFromJSON(GetBackupPlanFromJSONRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackupPlanFromJSON(request);
    }

    @SdkInternalApi
    final GetBackupPlanFromJSONResult executeGetBackupPlanFromJSON(GetBackupPlanFromJSONRequest getBackupPlanFromJSONRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackupPlanFromJSONRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupPlanFromJSONRequest> request = null;
        Response<GetBackupPlanFromJSONResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupPlanFromJSONRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackupPlanFromJSONRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackupPlanFromJSON");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackupPlanFromJSONResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetBackupPlanFromJSONResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the template specified by its <code>templateId</code> as a backup plan.
     * </p>
     * 
     * @param getBackupPlanFromTemplateRequest
     * @return Result of the GetBackupPlanFromTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.GetBackupPlanFromTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBackupPlanFromTemplateResult getBackupPlanFromTemplate(GetBackupPlanFromTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackupPlanFromTemplate(request);
    }

    @SdkInternalApi
    final GetBackupPlanFromTemplateResult executeGetBackupPlanFromTemplate(GetBackupPlanFromTemplateRequest getBackupPlanFromTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackupPlanFromTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupPlanFromTemplateRequest> request = null;
        Response<GetBackupPlanFromTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupPlanFromTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getBackupPlanFromTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackupPlanFromTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackupPlanFromTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBackupPlanFromTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated
     * with a backup plan.
     * </p>
     * 
     * @param getBackupSelectionRequest
     * @return Result of the GetBackupSelection operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupSelection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBackupSelectionResult getBackupSelection(GetBackupSelectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackupSelection(request);
    }

    @SdkInternalApi
    final GetBackupSelectionResult executeGetBackupSelection(GetBackupSelectionRequest getBackupSelectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackupSelectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupSelectionRequest> request = null;
        Response<GetBackupSelectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupSelectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackupSelectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackupSelection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackupSelectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBackupSelectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the access policy document that is associated with the named backup vault.
     * </p>
     * 
     * @param getBackupVaultAccessPolicyRequest
     * @return Result of the GetBackupVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBackupVaultAccessPolicyResult getBackupVaultAccessPolicy(GetBackupVaultAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackupVaultAccessPolicy(request);
    }

    @SdkInternalApi
    final GetBackupVaultAccessPolicyResult executeGetBackupVaultAccessPolicy(GetBackupVaultAccessPolicyRequest getBackupVaultAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackupVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupVaultAccessPolicyRequest> request = null;
        Response<GetBackupVaultAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupVaultAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getBackupVaultAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackupVaultAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackupVaultAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBackupVaultAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns event notifications for the specified backup vault.
     * </p>
     * 
     * @param getBackupVaultNotificationsRequest
     * @return Result of the GetBackupVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBackupVaultNotificationsResult getBackupVaultNotifications(GetBackupVaultNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackupVaultNotifications(request);
    }

    @SdkInternalApi
    final GetBackupVaultNotificationsResult executeGetBackupVaultNotifications(GetBackupVaultNotificationsRequest getBackupVaultNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackupVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupVaultNotificationsRequest> request = null;
        Response<GetBackupVaultNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupVaultNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getBackupVaultNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackupVaultNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackupVaultNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBackupVaultNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action returns details for a specified legal hold. The details are the body of a legal hold in JSON format,
     * in addition to metadata.
     * </p>
     * 
     * @param getLegalHoldRequest
     * @return Result of the GetLegalHold operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.GetLegalHold
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetLegalHold" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLegalHoldResult getLegalHold(GetLegalHoldRequest request) {
        request = beforeClientExecution(request);
        return executeGetLegalHold(request);
    }

    @SdkInternalApi
    final GetLegalHoldResult executeGetLegalHold(GetLegalHoldRequest getLegalHoldRequest) {

        ExecutionContext executionContext = createExecutionContext(getLegalHoldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLegalHoldRequest> request = null;
        Response<GetLegalHoldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLegalHoldRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLegalHoldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLegalHold");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLegalHoldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLegalHoldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a set of metadata key-value pairs that were used to create the backup.
     * </p>
     * 
     * @param getRecoveryPointRestoreMetadataRequest
     * @return Result of the GetRecoveryPointRestoreMetadata operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetRecoveryPointRestoreMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRecoveryPointRestoreMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecoveryPointRestoreMetadataResult getRecoveryPointRestoreMetadata(GetRecoveryPointRestoreMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecoveryPointRestoreMetadata(request);
    }

    @SdkInternalApi
    final GetRecoveryPointRestoreMetadataResult executeGetRecoveryPointRestoreMetadata(
            GetRecoveryPointRestoreMetadataRequest getRecoveryPointRestoreMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecoveryPointRestoreMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecoveryPointRestoreMetadataRequest> request = null;
        Response<GetRecoveryPointRestoreMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecoveryPointRestoreMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRecoveryPointRestoreMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecoveryPointRestoreMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecoveryPointRestoreMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRecoveryPointRestoreMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the Amazon Web Services resource types supported by Backup.
     * </p>
     * 
     * @param getSupportedResourceTypesRequest
     * @return Result of the GetSupportedResourceTypes operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetSupportedResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetSupportedResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSupportedResourceTypesResult getSupportedResourceTypes(GetSupportedResourceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSupportedResourceTypes(request);
    }

    @SdkInternalApi
    final GetSupportedResourceTypesResult executeGetSupportedResourceTypes(GetSupportedResourceTypesRequest getSupportedResourceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSupportedResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSupportedResourceTypesRequest> request = null;
        Response<GetSupportedResourceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSupportedResourceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSupportedResourceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSupportedResourceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSupportedResourceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSupportedResourceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of existing backup jobs for an authenticated account for the last 30 days. For a longer period of
     * time, consider using these <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">monitoring tools</a>.
     * </p>
     * 
     * @param listBackupJobsRequest
     * @return Result of the ListBackupJobs operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBackupJobsResult listBackupJobs(ListBackupJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListBackupJobs(request);
    }

    @SdkInternalApi
    final ListBackupJobsResult executeListBackupJobs(ListBackupJobsRequest listBackupJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackupJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupJobsRequest> request = null;
        Response<ListBackupJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBackupJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackupJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackupJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBackupJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and
     * deletion dates.
     * </p>
     * 
     * @param listBackupPlanTemplatesRequest
     * @return Result of the ListBackupPlanTemplates operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.ListBackupPlanTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBackupPlanTemplatesResult listBackupPlanTemplates(ListBackupPlanTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListBackupPlanTemplates(request);
    }

    @SdkInternalApi
    final ListBackupPlanTemplatesResult executeListBackupPlanTemplates(ListBackupPlanTemplatesRequest listBackupPlanTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackupPlanTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupPlanTemplatesRequest> request = null;
        Response<ListBackupPlanTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupPlanTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listBackupPlanTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackupPlanTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackupPlanTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBackupPlanTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation
     * and deletion dates, plan names, and version IDs.
     * </p>
     * 
     * @param listBackupPlanVersionsRequest
     * @return Result of the ListBackupPlanVersions operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupPlanVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBackupPlanVersionsResult listBackupPlanVersions(ListBackupPlanVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListBackupPlanVersions(request);
    }

    @SdkInternalApi
    final ListBackupPlanVersionsResult executeListBackupPlanVersions(ListBackupPlanVersionsRequest listBackupPlanVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackupPlanVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupPlanVersionsRequest> request = null;
        Response<ListBackupPlanVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupPlanVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBackupPlanVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackupPlanVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackupPlanVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBackupPlanVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all active backup plans for an authenticated account. The list contains information such as
     * Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request
     * IDs.
     * </p>
     * 
     * @param listBackupPlansRequest
     * @return Result of the ListBackupPlans operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlans" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBackupPlansResult listBackupPlans(ListBackupPlansRequest request) {
        request = beforeClientExecution(request);
        return executeListBackupPlans(request);
    }

    @SdkInternalApi
    final ListBackupPlansResult executeListBackupPlans(ListBackupPlansRequest listBackupPlansRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackupPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupPlansRequest> request = null;
        Response<ListBackupPlansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupPlansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBackupPlansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackupPlans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackupPlansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBackupPlansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array containing metadata of the resources associated with the target backup plan.
     * </p>
     * 
     * @param listBackupSelectionsRequest
     * @return Result of the ListBackupSelections operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupSelections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupSelections" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBackupSelectionsResult listBackupSelections(ListBackupSelectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListBackupSelections(request);
    }

    @SdkInternalApi
    final ListBackupSelectionsResult executeListBackupSelections(ListBackupSelectionsRequest listBackupSelectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackupSelectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupSelectionsRequest> request = null;
        Response<ListBackupSelectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupSelectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBackupSelectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackupSelections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackupSelectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBackupSelectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of recovery point storage containers along with information about them.
     * </p>
     * 
     * @param listBackupVaultsRequest
     * @return Result of the ListBackupVaults operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupVaults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupVaults" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBackupVaultsResult listBackupVaults(ListBackupVaultsRequest request) {
        request = beforeClientExecution(request);
        return executeListBackupVaults(request);
    }

    @SdkInternalApi
    final ListBackupVaultsResult executeListBackupVaults(ListBackupVaultsRequest listBackupVaultsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackupVaultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupVaultsRequest> request = null;
        Response<ListBackupVaultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupVaultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBackupVaultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackupVaults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackupVaultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBackupVaultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about your copy jobs.
     * </p>
     * 
     * @param listCopyJobsRequest
     * @return Result of the ListCopyJobs operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListCopyJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListCopyJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCopyJobsResult listCopyJobs(ListCopyJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListCopyJobs(request);
    }

    @SdkInternalApi
    final ListCopyJobsResult executeListCopyJobs(ListCopyJobsRequest listCopyJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCopyJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCopyJobsRequest> request = null;
        Response<ListCopyJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCopyJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCopyJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCopyJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCopyJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCopyJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all frameworks for an Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * 
     * @param listFrameworksRequest
     * @return Result of the ListFrameworks operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListFrameworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListFrameworks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFrameworksResult listFrameworks(ListFrameworksRequest request) {
        request = beforeClientExecution(request);
        return executeListFrameworks(request);
    }

    @SdkInternalApi
    final ListFrameworksResult executeListFrameworks(ListFrameworksRequest listFrameworksRequest) {

        ExecutionContext executionContext = createExecutionContext(listFrameworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFrameworksRequest> request = null;
        Response<ListFrameworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFrameworksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFrameworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFrameworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFrameworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFrameworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action returns metadata about active and previous legal holds.
     * </p>
     * 
     * @param listLegalHoldsRequest
     * @return Result of the ListLegalHolds operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListLegalHolds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListLegalHolds" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLegalHoldsResult listLegalHolds(ListLegalHoldsRequest request) {
        request = beforeClientExecution(request);
        return executeListLegalHolds(request);
    }

    @SdkInternalApi
    final ListLegalHoldsResult executeListLegalHolds(ListLegalHoldsRequest listLegalHoldsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLegalHoldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLegalHoldsRequest> request = null;
        Response<ListLegalHoldsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLegalHoldsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLegalHoldsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLegalHolds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLegalHoldsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLegalHoldsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of resources successfully backed up by Backup, including the time the resource was saved, an
     * Amazon Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * 
     * @param listProtectedResourcesRequest
     * @return Result of the ListProtectedResources operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListProtectedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListProtectedResources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListProtectedResourcesResult listProtectedResources(ListProtectedResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListProtectedResources(request);
    }

    @SdkInternalApi
    final ListProtectedResourcesResult executeListProtectedResources(ListProtectedResourcesRequest listProtectedResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProtectedResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProtectedResourcesRequest> request = null;
        Response<ListProtectedResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProtectedResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProtectedResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProtectedResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProtectedResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProtectedResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about the recovery points stored in a backup vault.
     * </p>
     * 
     * @param listRecoveryPointsByBackupVaultRequest
     * @return Result of the ListRecoveryPointsByBackupVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListRecoveryPointsByBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByBackupVault"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecoveryPointsByBackupVaultResult listRecoveryPointsByBackupVault(ListRecoveryPointsByBackupVaultRequest request) {
        request = beforeClientExecution(request);
        return executeListRecoveryPointsByBackupVault(request);
    }

    @SdkInternalApi
    final ListRecoveryPointsByBackupVaultResult executeListRecoveryPointsByBackupVault(
            ListRecoveryPointsByBackupVaultRequest listRecoveryPointsByBackupVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecoveryPointsByBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecoveryPointsByBackupVaultRequest> request = null;
        Response<ListRecoveryPointsByBackupVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecoveryPointsByBackupVaultRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRecoveryPointsByBackupVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecoveryPointsByBackupVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecoveryPointsByBackupVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRecoveryPointsByBackupVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action returns recovery point ARNs (Amazon Resource Names) of the specified legal hold.
     * </p>
     * 
     * @param listRecoveryPointsByLegalHoldRequest
     * @return Result of the ListRecoveryPointsByLegalHold operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListRecoveryPointsByLegalHold
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByLegalHold"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecoveryPointsByLegalHoldResult listRecoveryPointsByLegalHold(ListRecoveryPointsByLegalHoldRequest request) {
        request = beforeClientExecution(request);
        return executeListRecoveryPointsByLegalHold(request);
    }

    @SdkInternalApi
    final ListRecoveryPointsByLegalHoldResult executeListRecoveryPointsByLegalHold(ListRecoveryPointsByLegalHoldRequest listRecoveryPointsByLegalHoldRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecoveryPointsByLegalHoldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecoveryPointsByLegalHoldRequest> request = null;
        Response<ListRecoveryPointsByLegalHoldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecoveryPointsByLegalHoldRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRecoveryPointsByLegalHoldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecoveryPointsByLegalHold");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecoveryPointsByLegalHoldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRecoveryPointsByLegalHoldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about all the recovery points of the type specified by a resource Amazon Resource
     * Name (ARN).
     * </p>
     * <note>
     * <p>
     * For Amazon EFS and Amazon EC2, this action only lists recovery points created by Backup.
     * </p>
     * </note>
     * 
     * @param listRecoveryPointsByResourceRequest
     * @return Result of the ListRecoveryPointsByResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListRecoveryPointsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecoveryPointsByResourceResult listRecoveryPointsByResource(ListRecoveryPointsByResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListRecoveryPointsByResource(request);
    }

    @SdkInternalApi
    final ListRecoveryPointsByResourceResult executeListRecoveryPointsByResource(ListRecoveryPointsByResourceRequest listRecoveryPointsByResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecoveryPointsByResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecoveryPointsByResourceRequest> request = null;
        Response<ListRecoveryPointsByResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecoveryPointsByResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRecoveryPointsByResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecoveryPointsByResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecoveryPointsByResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRecoveryPointsByResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about your report jobs.
     * </p>
     * 
     * @param listReportJobsRequest
     * @return Result of the ListReportJobs operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.ListReportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListReportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReportJobsResult listReportJobs(ListReportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListReportJobs(request);
    }

    @SdkInternalApi
    final ListReportJobsResult executeListReportJobs(ListReportJobsRequest listReportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReportJobsRequest> request = null;
        Response<ListReportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of your report plans. For detailed information about a single report plan, use
     * <code>DescribeReportPlan</code>.
     * </p>
     * 
     * @param listReportPlansRequest
     * @return Result of the ListReportPlans operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListReportPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListReportPlans" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReportPlansResult listReportPlans(ListReportPlansRequest request) {
        request = beforeClientExecution(request);
        return executeListReportPlans(request);
    }

    @SdkInternalApi
    final ListReportPlansResult executeListReportPlans(ListReportPlansRequest listReportPlansRequest) {

        ExecutionContext executionContext = createExecutionContext(listReportPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReportPlansRequest> request = null;
        Response<ListReportPlansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReportPlansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReportPlansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReportPlans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReportPlansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReportPlansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of jobs that Backup initiated to restore a saved resource, including details about the recovery
     * process.
     * </p>
     * 
     * @param listRestoreJobsRequest
     * @return Result of the ListRestoreJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListRestoreJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRestoreJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRestoreJobsResult listRestoreJobs(ListRestoreJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListRestoreJobs(request);
    }

    @SdkInternalApi
    final ListRestoreJobsResult executeListRestoreJobs(ListRestoreJobsRequest listRestoreJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRestoreJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRestoreJobsRequest> request = null;
        Response<ListRestoreJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRestoreJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRestoreJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRestoreJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRestoreJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRestoreJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
     * </p>
     * <p>
     * <code>ListTags</code> only works for resource types that support full Backup management of their backups. Those
     * resource types are listed in the "Full Backup management" section of the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource"> Feature
     * availability by resource</a> table.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a
     * backup vault name and an access policy document in JSON format.
     * </p>
     * 
     * @param putBackupVaultAccessPolicyRequest
     * @return Result of the PutBackupVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.PutBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutBackupVaultAccessPolicyResult putBackupVaultAccessPolicy(PutBackupVaultAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutBackupVaultAccessPolicy(request);
    }

    @SdkInternalApi
    final PutBackupVaultAccessPolicyResult executePutBackupVaultAccessPolicy(PutBackupVaultAccessPolicyRequest putBackupVaultAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putBackupVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBackupVaultAccessPolicyRequest> request = null;
        Response<PutBackupVaultAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBackupVaultAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putBackupVaultAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBackupVaultAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutBackupVaultAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutBackupVaultAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies Backup Vault Lock to a backup vault, preventing attempts to delete any recovery point stored in or
     * created in a backup vault. Vault Lock also prevents attempts to update the lifecycle policy that controls the
     * retention period of any recovery point currently stored in a backup vault. If specified, Vault Lock enforces a
     * minimum and maximum retention period for future backup and copy jobs that target a backup vault.
     * </p>
     * <note>
     * <p>
     * Backup Vault Lock has yet to receive a third-party assessment for SEC 17a-4(f) and CFTC.
     * </p>
     * </note>
     * 
     * @param putBackupVaultLockConfigurationRequest
     * @return Result of the PutBackupVaultLockConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.PutBackupVaultLockConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultLockConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutBackupVaultLockConfigurationResult putBackupVaultLockConfiguration(PutBackupVaultLockConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutBackupVaultLockConfiguration(request);
    }

    @SdkInternalApi
    final PutBackupVaultLockConfigurationResult executePutBackupVaultLockConfiguration(
            PutBackupVaultLockConfigurationRequest putBackupVaultLockConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putBackupVaultLockConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBackupVaultLockConfigurationRequest> request = null;
        Response<PutBackupVaultLockConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBackupVaultLockConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putBackupVaultLockConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBackupVaultLockConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutBackupVaultLockConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutBackupVaultLockConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Turns on notifications on a backup vault for the specified topic and events.
     * </p>
     * 
     * @param putBackupVaultNotificationsRequest
     * @return Result of the PutBackupVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.PutBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutBackupVaultNotificationsResult putBackupVaultNotifications(PutBackupVaultNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executePutBackupVaultNotifications(request);
    }

    @SdkInternalApi
    final PutBackupVaultNotificationsResult executePutBackupVaultNotifications(PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(putBackupVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBackupVaultNotificationsRequest> request = null;
        Response<PutBackupVaultNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBackupVaultNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putBackupVaultNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBackupVaultNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutBackupVaultNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutBackupVaultNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an on-demand backup job for the specified resource.
     * </p>
     * 
     * @param startBackupJobRequest
     * @return Result of the StartBackupJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @sample AWSBackup.StartBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartBackupJobResult startBackupJob(StartBackupJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartBackupJob(request);
    }

    @SdkInternalApi
    final StartBackupJobResult executeStartBackupJob(StartBackupJobRequest startBackupJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startBackupJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBackupJobRequest> request = null;
        Response<StartBackupJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBackupJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startBackupJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartBackupJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartBackupJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartBackupJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a job to create a one-time copy of the specified resource.
     * </p>
     * <p>
     * Does not support continuous backups.
     * </p>
     * 
     * @param startCopyJobRequest
     * @return Result of the StartCopyJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.StartCopyJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartCopyJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartCopyJobResult startCopyJob(StartCopyJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartCopyJob(request);
    }

    @SdkInternalApi
    final StartCopyJobResult executeStartCopyJob(StartCopyJobRequest startCopyJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startCopyJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCopyJobRequest> request = null;
        Response<StartCopyJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCopyJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCopyJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCopyJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCopyJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCopyJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an on-demand report job for the specified report plan.
     * </p>
     * 
     * @param startReportJobRequest
     * @return Result of the StartReportJob operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.StartReportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartReportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartReportJobResult startReportJob(StartReportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartReportJob(request);
    }

    @SdkInternalApi
    final StartReportJobResult executeStartReportJob(StartReportJobRequest startReportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startReportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReportJobRequest> request = null;
        Response<StartReportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startReportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartReportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Recovers the saved resource identified by an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param startRestoreJobRequest
     * @return Result of the StartRestoreJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.StartRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartRestoreJobResult startRestoreJob(StartRestoreJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartRestoreJob(request);
    }

    @SdkInternalApi
    final StartRestoreJobResult executeStartRestoreJob(StartRestoreJobRequest startRestoreJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startRestoreJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRestoreJobRequest> request = null;
        Response<StartRestoreJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRestoreJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startRestoreJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRestoreJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRestoreJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartRestoreJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to cancel a job to create a one-time backup of a resource.
     * </p>
     * <p>
     * This action is not supported for the following services: Amazon FSx for Windows File Server, Amazon FSx for
     * Lustre, FSx for ONTAP , Amazon FSx for OpenZFS, Amazon DocumentDB (with MongoDB compatibility), Amazon RDS,
     * Amazon Aurora, and Amazon Neptune.
     * </p>
     * 
     * @param stopBackupJobRequest
     * @return Result of the StopBackupJob operation returned by the service.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.StopBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StopBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopBackupJobResult stopBackupJob(StopBackupJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopBackupJob(request);
    }

    @SdkInternalApi
    final StopBackupJobResult executeStopBackupJob(StopBackupJobRequest stopBackupJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopBackupJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopBackupJobRequest> request = null;
        Response<StopBackupJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopBackupJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopBackupJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopBackupJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopBackupJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopBackupJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @sample AWSBackup.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
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
     * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN)
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
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
     * Updates an existing backup plan identified by its <code>backupPlanId</code> with the input document in JSON
     * format. The new version is uniquely identified by a <code>VersionId</code>.
     * </p>
     * 
     * @param updateBackupPlanRequest
     * @return Result of the UpdateBackupPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.UpdateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBackupPlanResult updateBackupPlan(UpdateBackupPlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBackupPlan(request);
    }

    @SdkInternalApi
    final UpdateBackupPlanResult executeUpdateBackupPlan(UpdateBackupPlanRequest updateBackupPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBackupPlanRequest> request = null;
        Response<UpdateBackupPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBackupPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBackupPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBackupPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBackupPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBackupPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing framework identified by its <code>FrameworkName</code> with the input document in JSON
     * format.
     * </p>
     * 
     * @param updateFrameworkRequest
     * @return Result of the UpdateFramework operation returned by the service.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ConflictException
     *         Backup can't perform the action that you requested until it finishes performing a previous action. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.UpdateFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateFramework" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFrameworkResult updateFramework(UpdateFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFramework(request);
    }

    @SdkInternalApi
    final UpdateFrameworkResult executeUpdateFramework(UpdateFrameworkRequest updateFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFrameworkRequest> request = null;
        Response<UpdateFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates whether the Amazon Web Services account is opted in to cross-account backup. Returns an error if the
     * account is not an Organizations management account. Use the <code>DescribeGlobalSettings</code> API to determine
     * the current settings.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateGlobalSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlobalSettings(request);
    }

    @SdkInternalApi
    final UpdateGlobalSettingsResult executeUpdateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalSettingsRequest> request = null;
        Response<UpdateGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the transition lifecycle of a recovery point.
     * </p>
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “retention” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to
     * cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * <p>
     * Resource types that are able to be transitioned to cold storage are listed in the "Lifecycle to cold storage"
     * section of the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource"> Feature
     * availability by resource</a> table. Backup ignores this expression for other resource types.
     * </p>
     * <p>
     * This operation does not support continuous backups.
     * </p>
     * 
     * @param updateRecoveryPointLifecycleRequest
     * @return Result of the UpdateRecoveryPointLifecycle operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.UpdateRecoveryPointLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRecoveryPointLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRecoveryPointLifecycleResult updateRecoveryPointLifecycle(UpdateRecoveryPointLifecycleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRecoveryPointLifecycle(request);
    }

    @SdkInternalApi
    final UpdateRecoveryPointLifecycleResult executeUpdateRecoveryPointLifecycle(UpdateRecoveryPointLifecycleRequest updateRecoveryPointLifecycleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRecoveryPointLifecycleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecoveryPointLifecycleRequest> request = null;
        Response<UpdateRecoveryPointLifecycleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecoveryPointLifecycleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRecoveryPointLifecycleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRecoveryPointLifecycle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRecoveryPointLifecycleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRecoveryPointLifecycleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the current service opt-in settings for the Region. If service-opt-in is enabled for a service, Backup
     * tries to protect that service's resources in this Region, when the resource is included in an on-demand backup or
     * scheduled backup plan. Otherwise, Backup does not try to protect that service's resources in this Region. Use the
     * <code>DescribeRegionSettings</code> API to determine the resource types that are supported.
     * </p>
     * 
     * @param updateRegionSettingsRequest
     * @return Result of the UpdateRegionSettings operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @sample AWSBackup.UpdateRegionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRegionSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRegionSettingsResult updateRegionSettings(UpdateRegionSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRegionSettings(request);
    }

    @SdkInternalApi
    final UpdateRegionSettingsResult executeUpdateRegionSettings(UpdateRegionSettingsRequest updateRegionSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRegionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRegionSettingsRequest> request = null;
        Response<UpdateRegionSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRegionSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRegionSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRegionSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRegionSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRegionSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing report plan identified by its <code>ReportPlanName</code> with the input document in JSON
     * format.
     * </p>
     * 
     * @param updateReportPlanRequest
     * @return Result of the UpdateReportPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ConflictException
     *         Backup can't perform the action that you requested until it finishes performing a previous action. Try
     *         again later.
     * @sample AWSBackup.UpdateReportPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateReportPlan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateReportPlanResult updateReportPlan(UpdateReportPlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReportPlan(request);
    }

    @SdkInternalApi
    final UpdateReportPlanResult executeUpdateReportPlan(UpdateReportPlanRequest updateReportPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReportPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReportPlanRequest> request = null;
        Response<UpdateReportPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReportPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReportPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReportPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReportPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateReportPlanResultJsonUnmarshaller());
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
