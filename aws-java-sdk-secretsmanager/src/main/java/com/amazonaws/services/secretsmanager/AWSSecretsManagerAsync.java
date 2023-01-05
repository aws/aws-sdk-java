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

import javax.annotation.Generated;

import com.amazonaws.services.secretsmanager.model.*;

/**
 * Interface for accessing AWS Secrets Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.secretsmanager.AbstractAWSSecretsManagerAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSecretsManagerAsync extends AWSSecretsManager {

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
     * @return A Java Future containing the result of the CancelRotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.CancelRotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CancelRotateSecret"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(CancelRotateSecretRequest cancelRotateSecretRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelRotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.CancelRotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CancelRotateSecret"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(CancelRotateSecretRequest cancelRotateSecretRequest,
            com.amazonaws.handlers.AsyncHandler<CancelRotateSecretRequest, CancelRotateSecretResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.CreateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CreateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecretResult> createSecretAsync(CreateSecretRequest createSecretRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.CreateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CreateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecretResult> createSecretAsync(CreateSecretRequest createSecretRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecretRequest, CreateSecretResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.DeleteSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(DeleteSecretRequest deleteSecretRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.DeleteSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(DeleteSecretRequest deleteSecretRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecretRequest, DeleteSecretResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.DescribeSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DescribeSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(DescribeSecretRequest describeSecretRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.DescribeSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DescribeSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(DescribeSecretRequest describeSecretRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecretRequest, DescribeSecretResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRandomPassword operation returned by the service.
     * @sample AWSSecretsManagerAsync.GetRandomPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetRandomPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(GetRandomPasswordRequest getRandomPasswordRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRandomPassword operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.GetRandomPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetRandomPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(GetRandomPasswordRequest getRandomPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<GetRandomPasswordRequest, GetRandomPasswordResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsync.GetSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(GetSecretValueRequest getSecretValueRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.GetSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(GetSecretValueRequest getSecretValueRequest,
            com.amazonaws.handlers.AsyncHandler<GetSecretValueRequest, GetSecretValueResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListSecretVersionIds operation returned by the service.
     * @sample AWSSecretsManagerAsync.ListSecretVersionIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecretVersionIds"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(ListSecretVersionIdsRequest listSecretVersionIdsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecretVersionIds operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ListSecretVersionIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecretVersionIds"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(ListSecretVersionIdsRequest listSecretVersionIdsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecretVersionIdsRequest, ListSecretVersionIdsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListSecrets operation returned by the service.
     * @sample AWSSecretsManagerAsync.ListSecrets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecrets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(ListSecretsRequest listSecretsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecrets operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ListSecrets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecrets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(ListSecretsRequest listSecretsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecretsRequest, ListSecretsResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsync.PutSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(PutSecretValueRequest putSecretValueRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.PutSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(PutSecretValueRequest putSecretValueRequest,
            com.amazonaws.handlers.AsyncHandler<PutSecretValueRequest, PutSecretValueResult> asyncHandler);

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
     * @return A Java Future containing the result of the RemoveRegionsFromReplication operation returned by the
     *         service.
     * @sample AWSSecretsManagerAsync.RemoveRegionsFromReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RemoveRegionsFromReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRegionsFromReplicationResult> removeRegionsFromReplicationAsync(
            RemoveRegionsFromReplicationRequest removeRegionsFromReplicationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveRegionsFromReplication operation returned by the
     *         service.
     * @sample AWSSecretsManagerAsyncHandler.RemoveRegionsFromReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RemoveRegionsFromReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRegionsFromReplicationResult> removeRegionsFromReplicationAsync(
            RemoveRegionsFromReplicationRequest removeRegionsFromReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveRegionsFromReplicationRequest, RemoveRegionsFromReplicationResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReplicateSecretToRegions operation returned by the service.
     * @sample AWSSecretsManagerAsync.ReplicateSecretToRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicateSecretToRegions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicateSecretToRegionsResult> replicateSecretToRegionsAsync(ReplicateSecretToRegionsRequest replicateSecretToRegionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplicateSecretToRegions operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ReplicateSecretToRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicateSecretToRegions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicateSecretToRegionsResult> replicateSecretToRegionsAsync(ReplicateSecretToRegionsRequest replicateSecretToRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<ReplicateSecretToRegionsRequest, ReplicateSecretToRegionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the RestoreSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.RestoreSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RestoreSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(RestoreSecretRequest restoreSecretRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.RestoreSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RestoreSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(RestoreSecretRequest restoreSecretRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreSecretRequest, RestoreSecretResult> asyncHandler);

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
     * @return A Java Future containing the result of the RotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.RotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(RotateSecretRequest rotateSecretRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.RotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(RotateSecretRequest rotateSecretRequest,
            com.amazonaws.handlers.AsyncHandler<RotateSecretRequest, RotateSecretResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopReplicationToReplica operation returned by the service.
     * @sample AWSSecretsManagerAsync.StopReplicationToReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/StopReplicationToReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationToReplicaResult> stopReplicationToReplicaAsync(StopReplicationToReplicaRequest stopReplicationToReplicaRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopReplicationToReplica operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.StopReplicationToReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/StopReplicationToReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationToReplicaResult> stopReplicationToReplicaAsync(StopReplicationToReplicaRequest stopReplicationToReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<StopReplicationToReplicaRequest, StopReplicationToReplicaResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecretsManagerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecretsManagerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.UpdateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(UpdateSecretRequest updateSecretRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.UpdateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(UpdateSecretRequest updateSecretRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecretRequest, UpdateSecretResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSecretVersionStage operation returned by the service.
     * @sample AWSSecretsManagerAsync.UpdateSecretVersionStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecretVersionStage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(UpdateSecretVersionStageRequest updateSecretVersionStageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecretVersionStage operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.UpdateSecretVersionStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecretVersionStage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(UpdateSecretVersionStageRequest updateSecretVersionStageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecretVersionStageRequest, UpdateSecretVersionStageResult> asyncHandler);

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
     * @return A Java Future containing the result of the ValidateResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.ValidateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateResourcePolicyResult> validateResourcePolicyAsync(ValidateResourcePolicyRequest validateResourcePolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ValidateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateResourcePolicyResult> validateResourcePolicyAsync(ValidateResourcePolicyRequest validateResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateResourcePolicyRequest, ValidateResourcePolicyResult> asyncHandler);

}
