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
 * <fullname>AWS Backup</fullname>
 * <p>
 * AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup
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
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingParameterValueException").withModeledClass(
                                    com.amazonaws.services.backup.model.MissingParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.backup.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.backup.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.backup.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyFailureException").withModeledClass(
                                    com.amazonaws.services.backup.model.DependencyFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.backup.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.backup.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.backup.model.ServiceUnavailableException.class))
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
     * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery
     * points of resources.
     * </p>
     * <p>
     * If you call <code>CreateBackupPlan</code> with a plan that already exists, the existing <code>backupPlanId</code>
     * is returned.
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
     * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included
     * by specifying patterns for a <code>ListOfTags</code> and selected <code>Resources</code>.
     * </p>
     * <p>
     * For example, consider the following patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Resources: "arn:aws:ec2:region:account-id:volume/volume-id"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"department"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"finance"</code>
     * </p>
     * <p>
     * <code>ConditionType:"StringEquals"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"importance"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"critical"</code>
     * </p>
     * <p>
     * <code>ConditionType:"StringEquals"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as
     * <code>"department=finance"</code>, <code>"importance=critical"</code>, in addition to an EBS volume with the
     * specified volume Id.
     * </p>
     * <p>
     * Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't
     * be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put
     * together using the OR operator. In other words, all patterns that match are selected for backup.
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
     * Sensitive data, such as passport numbers, should not be included the name of a backup vault.
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
     * Deletes the recovery point specified by a recovery point ID.
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
     * Returns metadata associated with creating a backup of a resource.
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
     *         A dependent AWS service or resource returned an error to the AWS Backup service, and the action cannot be
     *         completed.
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
     * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name
     * (ARN), and the AWS service type of the saved resource.
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
     *         A dependent AWS service or resource returned an error to the AWS Backup service, and the action cannot be
     *         completed.
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
     * Returns the body of a backup plan in JSON format, in addition to plan metadata.
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
     * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was
     * created with. The second set lists the metadata key-value pairs that are required to restore the recovery point.
     * </p>
     * <p>
     * These sets can be the same, or the restore metadata set can contain different values if the target service to be
     * restored has changed since the recovery point was created and now requires additional or different information in
     * order to be restored.
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
     * Returns the AWS resource types supported by AWS Backup.
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
     * Returns metadata about your backup jobs.
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
     * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and
     * deletion dates, version IDs, plan names, and creator request IDs.
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
     * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an
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
     * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name
     * (ARN).
     * </p>
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
     * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the
     * recovery process.
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
     * Starts a job to create a one-time backup of the specified resource.
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
     * Recovers the saved resource identified by an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If
     * the ARN of a recovery point is supplied, then that recovery point is restored.
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
     * Replaces the body of a saved backup plan identified by its <code>backupPlanId</code> with the input document in
     * JSON format. The new version is uniquely identified by a <code>VersionId</code>.
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
     * Sets the transition lifecycle of a recovery point.
     * </p>
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param updateRecoveryPointLifecycleRequest
     * @return Result of the UpdateRecoveryPointLifecycle operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
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
