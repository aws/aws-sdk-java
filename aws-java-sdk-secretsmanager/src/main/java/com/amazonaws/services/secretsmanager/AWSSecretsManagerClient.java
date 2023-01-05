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
package com.amazonaws.services.secretsmanager;

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

import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.secretsmanager.model.*;
import com.amazonaws.services.secretsmanager.model.transform.*;

/**
 * Client for accessing AWS Secrets Manager. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon Web Services Secrets Manager</fullname>
 * <p>
 * Amazon Web Services Secrets Manager provides a service to enable you to store, manage, and retrieve, secrets.
 * </p>
 * <p>
 * This guide provides descriptions of the Secrets Manager API. For more information about using this service, see the
 * <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/introduction.html">Amazon Web Services Secrets
 * Manager User Guide</a>.
 * </p>
 * <p>
 * <b>API Version</b>
 * </p>
 * <p>
 * This version of the Secrets Manager API Reference documents the Secrets Manager API version 2017-10-17.
 * </p>
 * <p>
 * <b>Support and Feedback for Amazon Web Services Secrets Manager</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:awssecretsmanager-feedback@amazon.com">awssecretsmanager-feedback@amazon.com</a>, or post your feedback
 * and questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=296">Amazon Web Services Secrets
 * Manager Discussion Forum</a>. For more information about the Amazon Web Services Discussion Forums, see <a
 * href="http://forums.aws.amazon.com/help.jspa">Forums Help</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * Amazon Web Services Secrets Manager supports Amazon Web Services CloudTrail, a service that records Amazon Web
 * Services API calls for your Amazon Web Services account and delivers log files to an Amazon S3 bucket. By using
 * information that's collected by Amazon Web Services CloudTrail, you can determine the requests successfully made to
 * Secrets Manager, who made the request, when it was made, and so on. For more about Amazon Web Services Secrets
 * Manager and support for Amazon Web Services CloudTrail, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/monitoring.html#monitoring_cloudtrail">Logging
 * Amazon Web Services Secrets Manager Events with Amazon Web Services CloudTrail</a> in the <i>Amazon Web Services
 * Secrets Manager User Guide</i>. To learn more about CloudTrail, including enabling it and find your log files, see
 * the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">Amazon
 * Web Services CloudTrail User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecretsManagerClient extends AmazonWebServiceClient implements AWSSecretsManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSecretsManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "secretsmanager";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EncryptionFailure").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.EncryptionFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PublicPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.PublicPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyDocumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.MalformedPolicyDocumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DecryptionFailure").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.DecryptionFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceError").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.ResourceExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionNotMetException").withExceptionUnmarshaller(
                                    com.amazonaws.services.secretsmanager.model.transform.PreconditionNotMetExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.secretsmanager.model.AWSSecretsManagerException.class));

    public static AWSSecretsManagerClientBuilder builder() {
        return AWSSecretsManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Secrets Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecretsManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Secrets Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecretsManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("secretsmanager.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/secretsmanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/secretsmanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Turns off automatic rotation, and if a rotation is currently in progress, cancels the rotation.
     * </p>
     * <p>
     * If you cancel a rotation in progress, it can leave the <code>VersionStage</code> labels in an unexpected state.
     * You might need to remove the staging label <code>AWSPENDING</code> from the partially created version. You also
     * need to determine whether to roll back to the previous version of the secret by moving the staging label
     * <code>AWSCURRENT</code> to the version that has <code>AWSPENDING</code>. To determine which version has a
     * specific staging label, call <a>ListSecretVersionIds</a>. Then use <a>UpdateSecretVersionStage</a> to change
     * staging labels. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     * <p>
     * To turn on automatic rotation again, call <a>RotateSecret</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:CancelRotateSecret</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param cancelRotateSecretRequest
     * @return Result of the CancelRotateSecret operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @sample AWSSecretsManager.CancelRotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CancelRotateSecret"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelRotateSecretResult cancelRotateSecret(CancelRotateSecretRequest request) {
        request = beforeClientExecution(request);
        return executeCancelRotateSecret(request);
    }

    @SdkInternalApi
    final CancelRotateSecretResult executeCancelRotateSecret(CancelRotateSecretRequest cancelRotateSecretRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelRotateSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelRotateSecretRequest> request = null;
        Response<CancelRotateSecretResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelRotateSecretRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelRotateSecretRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelRotateSecret");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelRotateSecretResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelRotateSecretResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new secret. A <i>secret</i> can be a password, a set of credentials such as a user name and password,
     * an OAuth token, or other secret information that you store in an encrypted form in Secrets Manager. The secret
     * also includes the connection information to access a database or other service, which Secrets Manager doesn't
     * encrypt. A secret in Secrets Manager consists of both the protected secret data and the important information
     * needed to manage the secret.
     * </p>
     * <p>
     * For information about creating a secret in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_create-basic-secret.html">Create a
     * secret</a>.
     * </p>
     * <p>
     * To create a secret, you can provide the secret value to be encrypted in either the <code>SecretString</code>
     * parameter or the <code>SecretBinary</code> parameter, but not both. If you include <code>SecretString</code> or
     * <code>SecretBinary</code> then Secrets Manager creates an initial secret version and automatically attaches the
     * staging label <code>AWSCURRENT</code> to it.
     * </p>
     * <p>
     * For database credentials you want to rotate, for Secrets Manager to be able to rotate the secret, you must make
     * sure the JSON you store in the <code>SecretString</code> matches the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html">JSON
     * structure of a database secret</a>.
     * </p>
     * <p>
     * If you don't specify an KMS encryption key, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed KMS
     * key.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters except <code>SecretBinary</code> or <code>SecretString</code> because it might be logged.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:CreateSecret</code>. If you include tags in the secret, you
     * also need <code>secretsmanager:TagResource</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * <p>
     * To encrypt the secret with a KMS key other than <code>aws/secretsmanager</code>, you need
     * <code>kms:GenerateDataKey</code> and <code>kms:Decrypt</code> permission to the key.
     * </p>
     * 
     * @param createSecretRequest
     * @return Result of the CreateSecret operation returned by the service.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws LimitExceededException
     *         The request failed because it would exceed one of the Secrets Manager quotas.
     * @throws EncryptionFailureException
     *         Secrets Manager can't encrypt the protected secret text using the provided KMS key. Check that the KMS
     *         key is available, enabled, and not in an invalid state. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your KMS
     *         key</a>.
     * @throws ResourceExistsException
     *         A resource with the ID you requested already exists.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws MalformedPolicyDocumentException
     *         The resource policy has syntax errors.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws PreconditionNotMetException
     *         The request failed because you did not complete all the prerequisite steps.
     * @throws DecryptionFailureException
     *         Secrets Manager can't decrypt the protected secret text using the provided KMS key.
     * @sample AWSSecretsManager.CreateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CreateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSecretResult createSecret(CreateSecretRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSecret(request);
    }

    @SdkInternalApi
    final CreateSecretResult executeCreateSecret(CreateSecretRequest createSecretRequest) {

        ExecutionContext executionContext = createExecutionContext(createSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecretRequest> request = null;
        Response<CreateSecretResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecretRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSecretRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSecret");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSecretResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSecretResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the resource-based permission policy attached to the secret. To attach a policy to a secret, use
     * <a>PutResourcePolicy</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:DeleteResourcePolicy</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @sample AWSSecretsManager.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a secret and all of its versions. You can specify a recovery window during which you can restore the
     * secret. The minimum recovery window is 7 days. The default recovery window is 30 days. Secrets Manager attaches a
     * <code>DeletionDate</code> stamp to the secret that specifies the end of the recovery window. At the end of the
     * recovery window, Secrets Manager deletes the secret permanently.
     * </p>
     * <p>
     * You can't delete a primary secret that is replicated to other Regions. You must first delete the replicas using
     * <a>RemoveRegionsFromReplication</a>, and then delete the primary secret. When you delete a replica, it is deleted
     * immediately.
     * </p>
     * <p>
     * You can't directly delete a version of a secret. Instead, you remove all staging labels from the version using
     * <a>UpdateSecretVersionStage</a>. This marks the version as deprecated, and then Secrets Manager can automatically
     * delete the version in the background.
     * </p>
     * <p>
     * To determine whether an application still uses a secret, you can create an Amazon CloudWatch alarm to alert you
     * to any attempts to access a secret during the recovery window. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/monitoring_cloudwatch_deleted-secrets.html">
     * Monitor secrets scheduled for deletion</a>.
     * </p>
     * <p>
     * Secrets Manager performs the permanent secret deletion at the end of the waiting period as a background task with
     * low priority. There is no guarantee of a specific time after the recovery window for the permanent delete to
     * occur.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use <a>RestoreSecret</a> to remove the <code>DeletionDate</code>
     * and cancel the deletion of the secret.
     * </p>
     * <p>
     * When a secret is scheduled for deletion, you cannot retrieve the secret value. You must first cancel the deletion
     * with <a>RestoreSecret</a> and then you can retrieve the secret.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:DeleteSecret</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param deleteSecretRequest
     * @return Result of the DeleteSecret operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.DeleteSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSecretResult deleteSecret(DeleteSecretRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSecret(request);
    }

    @SdkInternalApi
    final DeleteSecretResult executeDeleteSecret(DeleteSecretRequest deleteSecretRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecretRequest> request = null;
        Response<DeleteSecretResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecretRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSecretRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSecret");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSecretResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSecretResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a secret. It does not include the encrypted secret value. Secrets Manager only returns
     * fields that have a value in the response.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:DescribeSecret</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param describeSecretRequest
     * @return Result of the DescribeSecret operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @sample AWSSecretsManager.DescribeSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DescribeSecret" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeSecretResult describeSecret(DescribeSecretRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSecret(request);
    }

    @SdkInternalApi
    final DescribeSecretResult executeDescribeSecret(DescribeSecretRequest describeSecretRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecretRequest> request = null;
        Response<DescribeSecretResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecretRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSecretRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSecret");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSecretResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSecretResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a random password. We recommend that you specify the maximum length and include every character type
     * that the system you are generating a password for can support.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:GetRandomPassword</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param getRandomPasswordRequest
     * @return Result of the GetRandomPassword operation returned by the service.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.GetRandomPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetRandomPassword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRandomPasswordResult getRandomPassword(GetRandomPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeGetRandomPassword(request);
    }

    @SdkInternalApi
    final GetRandomPasswordResult executeGetRandomPassword(GetRandomPasswordRequest getRandomPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(getRandomPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRandomPasswordRequest> request = null;
        Response<GetRandomPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRandomPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRandomPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRandomPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRandomPasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRandomPasswordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the JSON text of the resource-based policy document attached to the secret. For more information about
     * permissions policies attached to a secret, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-policies.html"
     * >Permissions policies attached to a secret</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:GetResourcePolicy</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @sample AWSSecretsManager.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePolicy(request);
    }

    @SdkInternalApi
    final GetResourcePolicyResult executeGetResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the contents of the encrypted fields <code>SecretString</code> or <code>SecretBinary</code> from the
     * specified version of a secret, whichever contains content.
     * </p>
     * <p>
     * We recommend that you cache your secret values by using client-side caching. Caching secrets improves speed and
     * reduces your costs. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieving-secrets.html">Cache secrets for your
     * applications</a>.
     * </p>
     * <p>
     * To retrieve the previous version of a secret, use <code>VersionStage</code> and specify AWSPREVIOUS. To revert to
     * the previous version of a secret, call <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/secretsmanager/update-secret-version-stage.html"
     * >UpdateSecretVersionStage</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:GetSecretValue</code>. If the secret is encrypted using a
     * customer-managed key instead of the Amazon Web Services managed key <code>aws/secretsmanager</code>, then you
     * also need <code>kms:Decrypt</code> permissions for that key. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param getSecretValueRequest
     * @return Result of the GetSecretValue operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws DecryptionFailureException
     *         Secrets Manager can't decrypt the protected secret text using the provided KMS key.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.GetSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSecretValueResult getSecretValue(GetSecretValueRequest request) {
        request = beforeClientExecution(request);
        return executeGetSecretValue(request);
    }

    @SdkInternalApi
    final GetSecretValueResult executeGetSecretValue(GetSecretValueRequest getSecretValueRequest) {

        ExecutionContext executionContext = createExecutionContext(getSecretValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSecretValueRequest> request = null;
        Response<GetSecretValueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSecretValueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSecretValueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSecretValue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSecretValueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSecretValueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the versions of a secret. Secrets Manager uses staging labels to indicate the different versions of a
     * secret. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version"> Secrets
     * Manager concepts: Versions</a>.
     * </p>
     * <p>
     * To list the secrets in the account, use <a>ListSecrets</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:ListSecretVersionIds</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param listSecretVersionIdsRequest
     * @return Result of the ListSecretVersionIds operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is invalid.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @sample AWSSecretsManager.ListSecretVersionIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecretVersionIds"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSecretVersionIdsResult listSecretVersionIds(ListSecretVersionIdsRequest request) {
        request = beforeClientExecution(request);
        return executeListSecretVersionIds(request);
    }

    @SdkInternalApi
    final ListSecretVersionIdsResult executeListSecretVersionIds(ListSecretVersionIdsRequest listSecretVersionIdsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecretVersionIdsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecretVersionIdsRequest> request = null;
        Response<ListSecretVersionIdsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecretVersionIdsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecretVersionIdsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecretVersionIds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecretVersionIdsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecretVersionIdsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the secrets that are stored by Secrets Manager in the Amazon Web Services account, not including secrets
     * that are marked for deletion. To see secrets marked for deletion, use the Secrets Manager console.
     * </p>
     * <p>
     * ListSecrets is eventually consistent, however it might not reflect changes from the last five minutes. To get the
     * latest information for a specific secret, use <a>DescribeSecret</a>.
     * </p>
     * <p>
     * To list the versions of a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * <p>
     * To get the secret value from <code>SecretString</code> or <code>SecretBinary</code>, call <a>GetSecretValue</a>.
     * </p>
     * <p>
     * For information about finding secrets in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_search-secret.html">Find secrets in
     * Secrets Manager</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:ListSecrets</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param listSecretsRequest
     * @return Result of the ListSecrets operation returned by the service.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.ListSecrets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecrets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSecretsResult listSecrets(ListSecretsRequest request) {
        request = beforeClientExecution(request);
        return executeListSecrets(request);
    }

    @SdkInternalApi
    final ListSecretsResult executeListSecrets(ListSecretsRequest listSecretsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecretsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecretsRequest> request = null;
        Response<ListSecretsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecretsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecretsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecrets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecretsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecretsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a resource-based permission policy to a secret. A resource-based policy is optional. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control for Secrets Manager</a>
     * </p>
     * <p>
     * For information about attaching a policy in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html"
     * >Attach a permissions policy to a secret</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:PutResourcePolicy</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The resource policy has syntax errors.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws PublicPolicyException
     *         The <code>BlockPublicPolicy</code> parameter is set to true, and the resource policy did not prevent
     *         broad access to the secret.
     * @sample AWSSecretsManager.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePolicy(request);
    }

    @SdkInternalApi
    final PutResourcePolicyResult executePutResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version with a new encrypted secret value and attaches it to the secret. The version can contain a
     * new <code>SecretString</code> value or a new <code>SecretBinary</code> value.
     * </p>
     * <p>
     * We recommend you avoid calling <code>PutSecretValue</code> at a sustained rate of more than once every 10
     * minutes. When you update the secret value, Secrets Manager creates a new version of the secret. Secrets Manager
     * removes outdated versions when there are more than 100, but it does not remove versions created less than 24
     * hours ago. If you call <code>PutSecretValue</code> more than once every 10 minutes, you create more versions than
     * Secrets Manager removes, and you will reach the quota for secret versions.
     * </p>
     * <p>
     * You can specify the staging labels to attach to the new version in <code>VersionStages</code>. If you don't
     * include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version. If this operation creates the first version for the secret, then Secrets
     * Manager automatically attaches the staging label <code>AWSCURRENT</code> to it. If this operation moves the
     * staging label <code>AWSCURRENT</code> from another version to this version, then Secrets Manager also
     * automatically moves the staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was
     * removed from.
     * </p>
     * <p>
     * This operation is idempotent. If you call this operation with a <code>ClientRequestToken</code> that matches an
     * existing version's VersionId, and you specify the same secret data, the operation succeeds but does nothing.
     * However, if the secret data is different, then the operation fails because you can't modify an existing version;
     * you can only create new ones.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters except <code>SecretBinary</code> or <code>SecretString</code> because it might be logged.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:PutSecretValue</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param putSecretValueRequest
     * @return Result of the PutSecretValue operation returned by the service.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws LimitExceededException
     *         The request failed because it would exceed one of the Secrets Manager quotas.
     * @throws EncryptionFailureException
     *         Secrets Manager can't encrypt the protected secret text using the provided KMS key. Check that the KMS
     *         key is available, enabled, and not in an invalid state. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your KMS
     *         key</a>.
     * @throws ResourceExistsException
     *         A resource with the ID you requested already exists.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws DecryptionFailureException
     *         Secrets Manager can't decrypt the protected secret text using the provided KMS key.
     * @sample AWSSecretsManager.PutSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutSecretValueResult putSecretValue(PutSecretValueRequest request) {
        request = beforeClientExecution(request);
        return executePutSecretValue(request);
    }

    @SdkInternalApi
    final PutSecretValueResult executePutSecretValue(PutSecretValueRequest putSecretValueRequest) {

        ExecutionContext executionContext = createExecutionContext(putSecretValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSecretValueRequest> request = null;
        Response<PutSecretValueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSecretValueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSecretValueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSecretValue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSecretValueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutSecretValueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a secret that is replicated to other Regions, deletes the secret replicas from the Regions you specify.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:RemoveRegionsFromReplication</code>. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param removeRegionsFromReplicationRequest
     * @return Result of the RemoveRegionsFromReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.RemoveRegionsFromReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RemoveRegionsFromReplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveRegionsFromReplicationResult removeRegionsFromReplication(RemoveRegionsFromReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveRegionsFromReplication(request);
    }

    @SdkInternalApi
    final RemoveRegionsFromReplicationResult executeRemoveRegionsFromReplication(RemoveRegionsFromReplicationRequest removeRegionsFromReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(removeRegionsFromReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveRegionsFromReplicationRequest> request = null;
        Response<RemoveRegionsFromReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveRegionsFromReplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeRegionsFromReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveRegionsFromReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveRegionsFromReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveRegionsFromReplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replicates the secret to a new Regions. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/create-manage-multi-region-secrets.html"
     * >Multi-Region secrets</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:ReplicateSecretToRegions</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param replicateSecretToRegionsRequest
     * @return Result of the ReplicateSecretToRegions operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.ReplicateSecretToRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicateSecretToRegions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplicateSecretToRegionsResult replicateSecretToRegions(ReplicateSecretToRegionsRequest request) {
        request = beforeClientExecution(request);
        return executeReplicateSecretToRegions(request);
    }

    @SdkInternalApi
    final ReplicateSecretToRegionsResult executeReplicateSecretToRegions(ReplicateSecretToRegionsRequest replicateSecretToRegionsRequest) {

        ExecutionContext executionContext = createExecutionContext(replicateSecretToRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplicateSecretToRegionsRequest> request = null;
        Response<ReplicateSecretToRegionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplicateSecretToRegionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(replicateSecretToRegionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReplicateSecretToRegions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReplicateSecretToRegionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ReplicateSecretToRegionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the scheduled deletion of a secret by removing the <code>DeletedDate</code> time stamp. You can access a
     * secret again after it has been restored.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:RestoreSecret</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param restoreSecretRequest
     * @return Result of the RestoreSecret operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.RestoreSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RestoreSecret" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RestoreSecretResult restoreSecret(RestoreSecretRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreSecret(request);
    }

    @SdkInternalApi
    final RestoreSecretResult executeRestoreSecret(RestoreSecretRequest restoreSecretRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreSecretRequest> request = null;
        Response<RestoreSecretResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreSecretRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreSecretRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreSecret");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreSecretResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreSecretResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures and starts the asynchronous process of rotating the secret. For more information about rotation, see
     * <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html">Rotate secrets</a>.
     * </p>
     * <p>
     * If you include the configuration parameters, the operation sets the values for the secret and then immediately
     * starts a rotation. If you don't include the configuration parameters, the operation starts a rotation with the
     * values already stored in the secret.
     * </p>
     * <p>
     * For database credentials you want to rotate, for Secrets Manager to be able to rotate the secret, you must make
     * sure the secret value is in the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html"> JSON
     * structure of a database secret</a>. In particular, if you want to use the <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users"
     * > alternating users strategy</a>, your secret must contain the ARN of a superuser secret.
     * </p>
     * <p>
     * To configure rotation, you also need the ARN of an Amazon Web Services Lambda function and the schedule for the
     * rotation. The Lambda rotation function creates a new version of the secret and creates or updates the credentials
     * on the database or service to match. After testing the new credentials, the function marks the new secret version
     * with the staging label <code>AWSCURRENT</code>. Then anyone who retrieves the secret gets the new version. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     * <p>
     * You can create the Lambda rotation function based on the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html"
     * >rotation function templates</a> that Secrets Manager provides. Choose a template that matches your <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html">Rotation
     * strategy</a>.
     * </p>
     * <p>
     * When rotation is successful, the <code>AWSPENDING</code> staging label might be attached to the same version as
     * the <code>AWSCURRENT</code> version, or it might not be attached to any version. If the <code>AWSPENDING</code>
     * staging label is present but not attached to the same version as <code>AWSCURRENT</code>, then any later
     * invocation of <code>RotateSecret</code> assumes that a previous rotation request is still in progress and returns
     * an error.
     * </p>
     * <p>
     * When rotation is unsuccessful, the <code>AWSPENDING</code> staging label might be attached to an empty secret
     * version. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot_rotation.html">Troubleshoot
     * rotation</a> in the <i>Secrets Manager User Guide</i>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:RotateSecret</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>. You also need <code>lambda:InvokeFunction</code> permissions on the rotation
     * function. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html"
     * > Permissions for rotation</a>.
     * </p>
     * 
     * @param rotateSecretRequest
     * @return Result of the RotateSecret operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @sample AWSSecretsManager.RotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RotateSecretResult rotateSecret(RotateSecretRequest request) {
        request = beforeClientExecution(request);
        return executeRotateSecret(request);
    }

    @SdkInternalApi
    final RotateSecretResult executeRotateSecret(RotateSecretRequest rotateSecretRequest) {

        ExecutionContext executionContext = createExecutionContext(rotateSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RotateSecretRequest> request = null;
        Response<RotateSecretResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RotateSecretRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rotateSecretRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RotateSecret");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RotateSecretResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RotateSecretResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the link between the replica secret and the primary secret and promotes the replica to a primary secret
     * in the replica Region.
     * </p>
     * <p>
     * You must call this operation from the Region in which you want to promote the replica to a primary secret.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:StopReplicationToReplica</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param stopReplicationToReplicaRequest
     * @return Result of the StopReplicationToReplica operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.StopReplicationToReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/StopReplicationToReplica"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopReplicationToReplicaResult stopReplicationToReplica(StopReplicationToReplicaRequest request) {
        request = beforeClientExecution(request);
        return executeStopReplicationToReplica(request);
    }

    @SdkInternalApi
    final StopReplicationToReplicaResult executeStopReplicationToReplica(StopReplicationToReplicaRequest stopReplicationToReplicaRequest) {

        ExecutionContext executionContext = createExecutionContext(stopReplicationToReplicaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopReplicationToReplicaRequest> request = null;
        Response<StopReplicationToReplicaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopReplicationToReplicaRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopReplicationToReplicaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopReplicationToReplica");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopReplicationToReplicaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopReplicationToReplicaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches tags to a secret. Tags consist of a key name and a value. Tags are part of the secret's metadata. They
     * are not associated with specific versions of the secret. This operation appends tags to the existing list of
     * tags.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you use tags as part of your security strategy, then adding or removing a tag can change permissions. If
     * successfully completing this operation would result in you losing your permissions for this secret, then the
     * operation is blocked and returns an Access Denied error.
     * </p>
     * </important>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:TagResource</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
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
     * Removes specific tags from a secret.
     * </p>
     * <p>
     * This operation is idempotent. If a requested tag is not attached to the secret, no error is returned and the
     * secret metadata is unchanged.
     * </p>
     * <important>
     * <p>
     * If you use tags as part of your security strategy, then removing a tag can change permissions. If successfully
     * completing this operation would result in you losing your permissions for this secret, then the operation is
     * blocked and returns an Access Denied error.
     * </p>
     * </important>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:UntagResource</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
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
     * Modifies the details of a secret, including metadata and the secret value. To change the secret value, you can
     * also use <a>PutSecretValue</a>.
     * </p>
     * <p>
     * To change the rotation configuration of a secret, use <a>RotateSecret</a> instead.
     * </p>
     * <p>
     * We recommend you avoid calling <code>UpdateSecret</code> at a sustained rate of more than once every 10 minutes.
     * When you call <code>UpdateSecret</code> to update the secret value, Secrets Manager creates a new version of the
     * secret. Secrets Manager removes outdated versions when there are more than 100, but it does not remove versions
     * created less than 24 hours ago. If you update the secret value more than once every 10 minutes, you create more
     * versions than Secrets Manager removes, and you will reach the quota for secret versions.
     * </p>
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code> to create a new secret version, Secrets
     * Manager automatically moves the staging label <code>AWSCURRENT</code> to the new version. Then it attaches the
     * label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * If you call this operation with a <code>ClientRequestToken</code> that matches an existing version's
     * <code>VersionId</code>, the operation results in an error. You can't modify an existing version, you can only
     * create a new version. To remove a version, remove all staging labels from it. See
     * <a>UpdateSecretVersionStage</a>.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters except <code>SecretBinary</code> or <code>SecretString</code> because it might be logged.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:UpdateSecret</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>. If you use a customer managed key, you must also have
     * <code>kms:GenerateDataKey</code> and <code>kms:Decrypt</code> permissions on the key. For more information, see
     * <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/security-encryption.html"> Secret encryption
     * and decryption</a>.
     * </p>
     * 
     * @param updateSecretRequest
     * @return Result of the UpdateSecret operation returned by the service.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws LimitExceededException
     *         The request failed because it would exceed one of the Secrets Manager quotas.
     * @throws EncryptionFailureException
     *         Secrets Manager can't encrypt the protected secret text using the provided KMS key. Check that the KMS
     *         key is available, enabled, and not in an invalid state. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your KMS
     *         key</a>.
     * @throws ResourceExistsException
     *         A resource with the ID you requested already exists.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws MalformedPolicyDocumentException
     *         The resource policy has syntax errors.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws PreconditionNotMetException
     *         The request failed because you did not complete all the prerequisite steps.
     * @throws DecryptionFailureException
     *         Secrets Manager can't decrypt the protected secret text using the provided KMS key.
     * @sample AWSSecretsManager.UpdateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSecretResult updateSecret(UpdateSecretRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecret(request);
    }

    @SdkInternalApi
    final UpdateSecretResult executeUpdateSecret(UpdateSecretRequest updateSecretRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecretRequest> request = null;
        Response<UpdateSecretResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecretRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSecretRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecret");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecretResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSecretResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the staging labels attached to a version of a secret. Secrets Manager uses staging labels to track a
     * version as it progresses through the secret rotation process. Each staging label can be attached to only one
     * version at a time. To add a staging label to a version when it is already attached to another version, Secrets
     * Manager first removes it from the other version first and then attaches it to this one. For more information
     * about versions and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version">Concepts:
     * Version</a>.
     * </p>
     * <p>
     * The staging labels that you specify in the <code>VersionStage</code> parameter are added to the existing list of
     * staging labels for the version.
     * </p>
     * <p>
     * You can move the <code>AWSCURRENT</code> staging label to this version by including it in this call.
     * </p>
     * <note>
     * <p>
     * Whenever you move <code>AWSCURRENT</code>, Secrets Manager automatically moves the label <code>AWSPREVIOUS</code>
     * to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * </note>
     * <p>
     * If this action results in the last label being removed from a version, then the version is considered to be
     * 'deprecated' and can be deleted by Secrets Manager.
     * </p>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:UpdateSecretVersionStage</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param updateSecretVersionStageRequest
     * @return Result of the UpdateSecretVersionStage operation returned by the service.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @throws LimitExceededException
     *         The request failed because it would exceed one of the Secrets Manager quotas.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @sample AWSSecretsManager.UpdateSecretVersionStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecretVersionStage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSecretVersionStageResult updateSecretVersionStage(UpdateSecretVersionStageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecretVersionStage(request);
    }

    @SdkInternalApi
    final UpdateSecretVersionStageResult executeUpdateSecretVersionStage(UpdateSecretVersionStageRequest updateSecretVersionStageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecretVersionStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecretVersionStageRequest> request = null;
        Response<UpdateSecretVersionStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecretVersionStageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSecretVersionStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecretVersionStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecretVersionStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSecretVersionStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates that a resource policy does not grant a wide range of principals access to your secret. A
     * resource-based policy is optional for secrets.
     * </p>
     * <p>
     * The API performs three checks when validating the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sends a call to <a href=
     * "https://aws.amazon.com/blogs/security/protect-sensitive-data-in-the-cloud-with-automated-reasoning-zelkova/"
     * >Zelkova</a>, an automated reasoning engine, to ensure your resource policy does not allow broad access to your
     * secret, for example policies that use a wildcard for the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * Checks for correct syntax in a policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verifies the policy does not lock out a caller.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Secrets Manager generates a CloudTrail log entry when you call this action. Do not include sensitive information
     * in request parameters because it might be logged. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieve-ct-entries.html">Logging Secrets
     * Manager events with CloudTrail</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>secretsmanager:ValidateResourcePolicy</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#reference_iam-permissions_actions"
     * > IAM policy actions for Secrets Manager</a> and <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control in Secrets Manager</a>.
     * </p>
     * 
     * @param validateResourcePolicyRequest
     * @return Result of the ValidateResourcePolicy operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The resource policy has syntax errors.
     * @throws ResourceNotFoundException
     *         Secrets Manager can't find the resource that you asked for.
     * @throws InvalidParameterException
     *         The parameter name or value is invalid.
     * @throws InternalServiceErrorException
     *         An error occurred on the server side.
     * @throws InvalidRequestException
     *         A parameter value is not valid for the current state of the resource.</p>
     *         <p>
     *         Possible causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The secret is scheduled for deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and
     *         you didn't include such an ARN as a parameter in this call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The secret is managed by another service, and you must use that service to update it. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     *         </p>
     *         </li>
     * @sample AWSSecretsManager.ValidateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateResourcePolicyResult validateResourcePolicy(ValidateResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeValidateResourcePolicy(request);
    }

    @SdkInternalApi
    final ValidateResourcePolicyResult executeValidateResourcePolicy(ValidateResourcePolicyRequest validateResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(validateResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateResourcePolicyRequest> request = null;
        Response<ValidateResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(validateResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Secrets Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidateResourcePolicyResultJsonUnmarshaller());
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
