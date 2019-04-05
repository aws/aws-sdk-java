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
 * <fullname>AWS Secrets Manager API Reference</fullname>
 * <p>
 * AWS Secrets Manager is a web service that enables you to store, manage, and retrieve, secrets.
 * </p>
 * <p>
 * This guide provides descriptions of the Secrets Manager API. For more information about using this service, see the
 * <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/introduction.html">AWS Secrets Manager User
 * Guide</a>.
 * </p>
 * <p>
 * <b>API Version</b>
 * </p>
 * <p>
 * This version of the Secrets Manager API Reference documents the Secrets Manager API version 2017-10-17.
 * </p>
 * <note>
 * <p>
 * As an alternative to using the API directly, you can use one of the AWS SDKs, which consist of libraries and sample
 * code for various programming languages and platforms (such as Java, Ruby, .NET, iOS, and Android). The SDKs provide a
 * convenient way to create programmatic access to AWS Secrets Manager. For example, the SDKs take care of
 * cryptographically signing requests, managing errors, and retrying requests automatically. For more information about
 * the AWS SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon
 * Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to Secrets Manager. However, you also can use
 * the Secrets Manager HTTP Query API to make direct calls to the Secrets Manager web service. To learn more about the
 * Secrets Manager HTTP Query API, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/query-requests.html">Making Query Requests</a> in
 * the <i>AWS Secrets Manager User Guide</i>.
 * </p>
 * <p>
 * Secrets Manager supports GET and POST requests for all actions. That is, the API doesn't require you to use GET for
 * some actions and POST for others. However, GET requests are subject to the limitation size of a URL. Therefore, for
 * operations that require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Support and Feedback for AWS Secrets Manager</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:awssecretsmanager-feedback@amazon.com">awssecretsmanager-feedback@amazon.com</a>, or post your feedback
 * and questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=296">AWS Secrets Manager Discussion
 * Forum</a>. For more information about the AWS Discussion Forums, see <a
 * href="http://forums.aws.amazon.com/help.jspa">Forums Help</a>.
 * </p>
 * <p>
 * <b>How examples are presented</b>
 * </p>
 * <p>
 * The JSON that AWS Secrets Manager expects as your request parameters and that the service returns as a response to
 * HTTP query requests are single, long strings without line breaks or white space formatting. The JSON shown in the
 * examples is formatted with both line breaks and white space to improve readability. When example input parameters
 * would also result in long strings that extend beyond the screen, we insert line breaks to enhance readability. You
 * should always submit the input as a single JSON text string.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS Secrets Manager supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers
 * log files to an Amazon S3 bucket. By using information that's collected by AWS CloudTrail, you can determine which
 * requests were successfully made to Secrets Manager, who made the request, when it was made, and so on. For more about
 * AWS Secrets Manager and its support for AWS CloudTrail, see <a
 * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/monitoring.html#monitoring_cloudtrail">Logging AWS
 * Secrets Manager Events with AWS CloudTrail</a> in the <i>AWS Secrets Manager User Guide</i>. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSecretsManagerAsync extends AWSSecretsManager {

    /**
     * <p>
     * Disables automatic scheduled rotation and cancels the rotation of a secret if one is currently in progress.
     * </p>
     * <p>
     * To re-enable scheduled rotation, call <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a
     * value greater than 0. This will immediately rotate your secret and then enable the automatic schedule.
     * </p>
     * <note>
     * <p>
     * If you cancel a rotation that is in progress, it can leave the <code>VersionStage</code> labels in an unexpected
     * state. Depending on what step of the rotation was in progress, you might need to remove the staging label
     * <code>AWSPENDING</code> from the partially created version, specified by the <code>VersionId</code> response
     * value. You should also evaluate the partially rotated new version to see if it should be deleted, which you can
     * do by removing all staging labels from the new version's <code>VersionStage</code> field.
     * </p>
     * </note>
     * <p>
     * To successfully start a rotation, the staging label <code>AWSPENDING</code> must be in one of the following
     * states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not be attached to any version at all
     * </p>
     * </li>
     * <li>
     * <p>
     * Attached to the same version as the staging label <code>AWSCURRENT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the staging label <code>AWSPENDING</code> is attached to a different version than the version with
     * <code>AWSCURRENT</code> then the attempt to rotate fails.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:CancelRotateSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure rotation for a secret or to manually trigger a rotation, use <a>RotateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the rotation configuration details for a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the versions currently associated with a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Disables automatic scheduled rotation and cancels the rotation of a secret if one is currently in progress.
     * </p>
     * <p>
     * To re-enable scheduled rotation, call <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a
     * value greater than 0. This will immediately rotate your secret and then enable the automatic schedule.
     * </p>
     * <note>
     * <p>
     * If you cancel a rotation that is in progress, it can leave the <code>VersionStage</code> labels in an unexpected
     * state. Depending on what step of the rotation was in progress, you might need to remove the staging label
     * <code>AWSPENDING</code> from the partially created version, specified by the <code>VersionId</code> response
     * value. You should also evaluate the partially rotated new version to see if it should be deleted, which you can
     * do by removing all staging labels from the new version's <code>VersionStage</code> field.
     * </p>
     * </note>
     * <p>
     * To successfully start a rotation, the staging label <code>AWSPENDING</code> must be in one of the following
     * states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not be attached to any version at all
     * </p>
     * </li>
     * <li>
     * <p>
     * Attached to the same version as the staging label <code>AWSCURRENT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the staging label <code>AWSPENDING</code> is attached to a different version than the version with
     * <code>AWSCURRENT</code> then the attempt to rotate fails.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:CancelRotateSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure rotation for a secret or to manually trigger a rotation, use <a>RotateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the rotation configuration details for a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the versions currently associated with a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Creates a new secret. A secret in Secrets Manager consists of both the protected secret data and the important
     * information needed to manage the secret.
     * </p>
     * <p>
     * Secrets Manager stores the encrypted secret data in one of a collection of "versions" associated with the secret.
     * Each version contains a copy of the encrypted secret data. Each version is associated with one or more
     * "staging labels" that identify where the version is in the rotation cycle. The
     * <code>SecretVersionsToStages</code> field of the secret contains the mapping of staging labels to the active
     * versions of the secret. Versions without a staging label are considered deprecated and are not included in the
     * list.
     * </p>
     * <p>
     * You provide the secret data to be encrypted by putting text in either the <code>SecretString</code> parameter or
     * binary data in the <code>SecretBinary</code> parameter, but not both. If you include <code>SecretString</code> or
     * <code>SecretBinary</code> then Secrets Manager also creates an initial secret version and automatically attaches
     * the staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you call an operation that needs to encrypt or decrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a
     * AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the
     * alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager
     * creates it for you automatically. All users and roles in the same AWS account automatically have access to use
     * the default CMK. Note that if an Secrets Manager API call results in AWS having to create the account's
     * AWS-managed CMK, it can result in a one-time significant delay in returning the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the secret is in a different AWS account from the credentials calling an API that requires encryption or
     * decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the
     * default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the
     * secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call
     * an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from
     * a different account then the AWS KMS key policy must grant cross-account access to that other account's user or
     * role for both the kms:GenerateDataKey and kms:Decrypt operations.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:CreateSecret
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not
     * need this permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this
     * permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * <li>
     * <p>
     * secretsmanager:TagResource - needed only if you include the <code>Tags</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To delete a secret, use <a>DeleteSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To modify an existing secret, use <a>UpdateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a new version of a secret, use <a>PutSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the encrypted secure string and secure binary values, use <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all other details for a secret, use <a>DescribeSecret</a>. This does not include the encrypted secure
     * string and secure binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the list of secret versions associated with the current secret, use <a>DescribeSecret</a> and examine
     * the <code>SecretVersionsToStages</code> response value.
     * </p>
     * </li>
     * </ul>
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
     * Creates a new secret. A secret in Secrets Manager consists of both the protected secret data and the important
     * information needed to manage the secret.
     * </p>
     * <p>
     * Secrets Manager stores the encrypted secret data in one of a collection of "versions" associated with the secret.
     * Each version contains a copy of the encrypted secret data. Each version is associated with one or more
     * "staging labels" that identify where the version is in the rotation cycle. The
     * <code>SecretVersionsToStages</code> field of the secret contains the mapping of staging labels to the active
     * versions of the secret. Versions without a staging label are considered deprecated and are not included in the
     * list.
     * </p>
     * <p>
     * You provide the secret data to be encrypted by putting text in either the <code>SecretString</code> parameter or
     * binary data in the <code>SecretBinary</code> parameter, but not both. If you include <code>SecretString</code> or
     * <code>SecretBinary</code> then Secrets Manager also creates an initial secret version and automatically attaches
     * the staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you call an operation that needs to encrypt or decrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a
     * AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the
     * alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager
     * creates it for you automatically. All users and roles in the same AWS account automatically have access to use
     * the default CMK. Note that if an Secrets Manager API call results in AWS having to create the account's
     * AWS-managed CMK, it can result in a one-time significant delay in returning the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the secret is in a different AWS account from the credentials calling an API that requires encryption or
     * decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the
     * default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the
     * secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call
     * an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from
     * a different account then the AWS KMS key policy must grant cross-account access to that other account's user or
     * role for both the kms:GenerateDataKey and kms:Decrypt operations.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:CreateSecret
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not
     * need this permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this
     * permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * <li>
     * <p>
     * secretsmanager:TagResource - needed only if you include the <code>Tags</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To delete a secret, use <a>DeleteSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To modify an existing secret, use <a>UpdateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a new version of a secret, use <a>PutSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the encrypted secure string and secure binary values, use <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all other details for a secret, use <a>DescribeSecret</a>. This does not include the encrypted secure
     * string and secure binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the list of secret versions associated with the current secret, use <a>DescribeSecret</a> and examine
     * the <code>SecretVersionsToStages</code> response value.
     * </p>
     * </li>
     * </ul>
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
     * Deletes the resource-based permission policy that's attached to the secret.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:DeleteResourcePolicy
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To attach a resource policy to a secret, use <a>PutResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the current resource-based policy that's attached to a secret, use <a>GetResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Deletes the resource-based permission policy that's attached to the secret.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:DeleteResourcePolicy
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To attach a resource policy to a secret, use <a>PutResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the current resource-based policy that's attached to a secret, use <a>GetResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Deletes an entire secret and all of its versions. You can optionally include a recovery window during which you
     * can restore the secret. If you don't specify a recovery window value, the operation defaults to 30 days. Secrets
     * Manager attaches a <code>DeletionDate</code> stamp to the secret that specifies the end of the recovery window.
     * At the end of the recovery window, Secrets Manager deletes the secret permanently.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use <a>RestoreSecret</a> to remove the <code>DeletionDate</code>
     * and cancel the deletion of the secret.
     * </p>
     * <p>
     * You cannot access the encrypted secret information in any secret that is scheduled for deletion. If you need to
     * access that information, you must cancel the deletion with <a>RestoreSecret</a> and then retrieve the
     * information.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * There is no explicit operation to delete a version of a secret. Instead, remove all staging labels from the
     * <code>VersionStage</code> field of a version. That marks the version as deprecated and allows Secrets Manager to
     * delete it as needed. Versions that do not have any staging labels do not show up in <a>ListSecretVersionIds</a>
     * unless you specify <code>IncludeDeprecated</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The permanent secret deletion at the end of the waiting period is performed as a background task with low
     * priority. There is no guarantee of a specific time after the recovery window for the actual delete operation to
     * occur.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:DeleteSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To cancel deletion of a version of a secret before the recovery window has expired, use <a>RestoreSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Deletes an entire secret and all of its versions. You can optionally include a recovery window during which you
     * can restore the secret. If you don't specify a recovery window value, the operation defaults to 30 days. Secrets
     * Manager attaches a <code>DeletionDate</code> stamp to the secret that specifies the end of the recovery window.
     * At the end of the recovery window, Secrets Manager deletes the secret permanently.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use <a>RestoreSecret</a> to remove the <code>DeletionDate</code>
     * and cancel the deletion of the secret.
     * </p>
     * <p>
     * You cannot access the encrypted secret information in any secret that is scheduled for deletion. If you need to
     * access that information, you must cancel the deletion with <a>RestoreSecret</a> and then retrieve the
     * information.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * There is no explicit operation to delete a version of a secret. Instead, remove all staging labels from the
     * <code>VersionStage</code> field of a version. That marks the version as deprecated and allows Secrets Manager to
     * delete it as needed. Versions that do not have any staging labels do not show up in <a>ListSecretVersionIds</a>
     * unless you specify <code>IncludeDeprecated</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The permanent secret deletion at the end of the waiting period is performed as a background task with low
     * priority. There is no guarantee of a specific time after the recovery window for the actual delete operation to
     * occur.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:DeleteSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To cancel deletion of a version of a secret before the recovery window has expired, use <a>RestoreSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Retrieves the details of a secret. It does not include the encrypted fields. Only those fields that are populated
     * with a value are returned in the response.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:DescribeSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To modify a secret, use <a>UpdateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the encrypted secret information in a version of the secret, use <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the secrets in the AWS account, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Retrieves the details of a secret. It does not include the encrypted fields. Only those fields that are populated
     * with a value are returned in the response.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:DescribeSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To modify a secret, use <a>UpdateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the encrypted secret information in a version of the secret, use <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the secrets in the AWS account, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Generates a random password of the specified complexity. This operation is intended for use in the Lambda
     * rotation function. Per best practice, we recommend that you specify the maximum length and include every
     * character type that the system you are generating a password for can support.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:GetRandomPassword
     * </p>
     * </li>
     * </ul>
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
     * Generates a random password of the specified complexity. This operation is intended for use in the Lambda
     * rotation function. Per best practice, we recommend that you specify the maximum length and include every
     * character type that the system you are generating a password for can support.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:GetRandomPassword
     * </p>
     * </li>
     * </ul>
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
     * Retrieves the JSON text of the resource-based policy document that's attached to the specified secret. The JSON
     * request string input and response output are shown formatted with white space and line breaks for better
     * readability. Submit your input as a single line JSON string.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:GetResourcePolicy
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To attach a resource policy to a secret, use <a>PutResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete the resource-based policy that's attached to a secret, use <a>DeleteResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Retrieves the JSON text of the resource-based policy document that's attached to the specified secret. The JSON
     * request string input and response output are shown formatted with white space and line breaks for better
     * readability. Submit your input as a single line JSON string.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:GetResourcePolicy
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To attach a resource policy to a secret, use <a>PutResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete the resource-based policy that's attached to a secret, use <a>DeleteResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:GetSecretValue
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt - required only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this
     * permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a new version of the secret with different encrypted information, use <a>PutSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the non-encrypted details for the secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:GetSecretValue
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt - required only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this
     * permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a new version of the secret with different encrypted information, use <a>PutSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve the non-encrypted details for the secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Lists all of the versions attached to the specified secret. The output does not include the
     * <code>SecretString</code> or <code>SecretBinary</code> fields. By default, the list includes only versions that
     * have at least one staging label in <code>VersionStage</code> attached.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can occasionally return an empty or shorter than expected list of results even when there are
     * more results available. When this happens, the <code>NextToken</code> response parameter contains a value to pass
     * to the next call to the same API to request the next part of the list.
     * </p>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:ListSecretVersionIds
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To list the secrets in an account, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Lists all of the versions attached to the specified secret. The output does not include the
     * <code>SecretString</code> or <code>SecretBinary</code> fields. By default, the list includes only versions that
     * have at least one staging label in <code>VersionStage</code> attached.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can occasionally return an empty or shorter than expected list of results even when there are
     * more results available. When this happens, the <code>NextToken</code> response parameter contains a value to pass
     * to the next call to the same API to request the next part of the list.
     * </p>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:ListSecretVersionIds
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To list the secrets in an account, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Lists all of the secrets that are stored by Secrets Manager in the AWS account. To list the versions currently
     * stored for a specific secret, use <a>ListSecretVersionIds</a>. The encrypted fields <code>SecretString</code> and
     * <code>SecretBinary</code> are not included in the output. To get that information, call the <a>GetSecretValue</a>
     * operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can occasionally return an empty or shorter than expected list of results even when there are
     * more results available. When this happens, the <code>NextToken</code> response parameter contains a value to pass
     * to the next call to the same API to request the next part of the list.
     * </p>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:ListSecrets
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Lists all of the secrets that are stored by Secrets Manager in the AWS account. To list the versions currently
     * stored for a specific secret, use <a>ListSecretVersionIds</a>. The encrypted fields <code>SecretString</code> and
     * <code>SecretBinary</code> are not included in the output. To get that information, call the <a>GetSecretValue</a>
     * operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can occasionally return an empty or shorter than expected list of results even when there are
     * more results available. When this happens, the <code>NextToken</code> response parameter contains a value to pass
     * to the next call to the same API to request the next part of the list.
     * </p>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:ListSecrets
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Attaches the contents of the specified resource-based permission policy to a secret. A resource-based policy is
     * optional. Alternatively, you can use IAM identity-based policies that specify the secret's Amazon Resource Name
     * (ARN) in the policy statement's <code>Resources</code> element. You can also use a combination of both
     * identity-based and resource-based policies. The affected users and roles receive the permissions that are
     * permitted by all of the relevant policies. For more information, see <a
     * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html"
     * >Using Resource-Based Policies for AWS Secrets Manager</a>. For the complete description of the AWS policy syntax
     * and grammar, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON
     * Policy Reference</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:PutResourcePolicy
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the resource policy that's attached to a secret, use <a>GetResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete the resource-based policy that's attached to a secret, use <a>DeleteResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Attaches the contents of the specified resource-based permission policy to a secret. A resource-based policy is
     * optional. Alternatively, you can use IAM identity-based policies that specify the secret's Amazon Resource Name
     * (ARN) in the policy statement's <code>Resources</code> element. You can also use a combination of both
     * identity-based and resource-based policies. The affected users and roles receive the permissions that are
     * permitted by all of the relevant policies. For more information, see <a
     * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html"
     * >Using Resource-Based Policies for AWS Secrets Manager</a>. For the complete description of the AWS policy syntax
     * and grammar, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON
     * Policy Reference</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:PutResourcePolicy
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the resource policy that's attached to a secret, use <a>GetResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete the resource-based policy that's attached to a secret, use <a>DeleteResourcePolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list all of the currently available secrets, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * </ul>
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
     * Stores a new encrypted secret value in the specified secret. To do this, the operation creates a new version and
     * attaches it to the secret. The version can contain a new <code>SecretString</code> value or a new
     * <code>SecretBinary</code> value. You can also specify the staging labels that are initially attached to the new
     * version.
     * </p>
     * <note>
     * <p>
     * The Secrets Manager console uses only the <code>SecretString</code> field. To add binary data to a secret with
     * the <code>SecretBinary</code> field you must use the AWS CLI or one of the AWS SDKs.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If this operation creates the first version for the secret then Secrets Manager automatically attaches the
     * staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * If another version of this secret already exists, then this operation does not automatically move any staging
     * labels other than those that you explicitly specify in the <code>VersionStages</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this operation moves the staging label <code>AWSCURRENT</code> from another version to this version (because
     * you included it in the <code>StagingLabels</code> parameter) then Secrets Manager also automatically moves the
     * staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation is idempotent. If a version with a <code>VersionId</code> with the same value as the
     * <code>ClientRequestToken</code> parameter already exists and you specify the same secret data, the operation
     * succeeds but does nothing. However, if the secret data is different, then the operation fails because you cannot
     * modify an existing version; you can only create new ones.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you call an operation that needs to encrypt or decrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a
     * AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the
     * alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager
     * creates it for you automatically. All users and roles in the same AWS account automatically have access to use
     * the default CMK. Note that if an Secrets Manager API call results in AWS having to create the account's
     * AWS-managed CMK, it can result in a one-time significant delay in returning the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the secret is in a different AWS account from the credentials calling an API that requires encryption or
     * decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the
     * default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the
     * secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call
     * an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from
     * a different account then the AWS KMS key policy must grant cross-account access to that other account's user or
     * role for both the kms:GenerateDataKey and kms:Decrypt operations.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:PutSecretValue
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not
     * need this permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the encrypted value you store in the version of a secret, use <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the details for a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Stores a new encrypted secret value in the specified secret. To do this, the operation creates a new version and
     * attaches it to the secret. The version can contain a new <code>SecretString</code> value or a new
     * <code>SecretBinary</code> value. You can also specify the staging labels that are initially attached to the new
     * version.
     * </p>
     * <note>
     * <p>
     * The Secrets Manager console uses only the <code>SecretString</code> field. To add binary data to a secret with
     * the <code>SecretBinary</code> field you must use the AWS CLI or one of the AWS SDKs.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If this operation creates the first version for the secret then Secrets Manager automatically attaches the
     * staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * If another version of this secret already exists, then this operation does not automatically move any staging
     * labels other than those that you explicitly specify in the <code>VersionStages</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this operation moves the staging label <code>AWSCURRENT</code> from another version to this version (because
     * you included it in the <code>StagingLabels</code> parameter) then Secrets Manager also automatically moves the
     * staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation is idempotent. If a version with a <code>VersionId</code> with the same value as the
     * <code>ClientRequestToken</code> parameter already exists and you specify the same secret data, the operation
     * succeeds but does nothing. However, if the secret data is different, then the operation fails because you cannot
     * modify an existing version; you can only create new ones.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you call an operation that needs to encrypt or decrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a
     * AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the
     * alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager
     * creates it for you automatically. All users and roles in the same AWS account automatically have access to use
     * the default CMK. Note that if an Secrets Manager API call results in AWS having to create the account's
     * AWS-managed CMK, it can result in a one-time significant delay in returning the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the secret is in a different AWS account from the credentials calling an API that requires encryption or
     * decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the
     * default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the
     * secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call
     * an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from
     * a different account then the AWS KMS key policy must grant cross-account access to that other account's user or
     * role for both the kms:GenerateDataKey and kms:Decrypt operations.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:PutSecretValue
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not
     * need this permission to use the account's default AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the encrypted value you store in the version of a secret, use <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the details for a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Cancels the scheduled deletion of a secret by removing the <code>DeletedDate</code> time stamp. This makes the
     * secret accessible to query once again.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:RestoreSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To delete a secret, use <a>DeleteSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Cancels the scheduled deletion of a secret by removing the <code>DeletedDate</code> time stamp. This makes the
     * secret accessible to query once again.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:RestoreSecret
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To delete a secret, use <a>DeleteSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Configures and starts the asynchronous process of rotating this secret. If you include the configuration
     * parameters, the operation sets those values for the secret and then immediately starts a rotation. If you do not
     * include the configuration parameters, the operation starts a rotation with the values already stored in the
     * secret. After the rotation completes, the protected service and its clients all use the new version of the
     * secret.
     * </p>
     * <p>
     * This required configuration information includes the ARN of an AWS Lambda function and the time between scheduled
     * rotations. The Lambda rotation function creates a new version of the secret and creates or updates the
     * credentials on the protected service to match. After testing the new credentials, the function marks the new
     * secret with the staging label <code>AWSCURRENT</code> so that your clients all immediately begin to use the new
     * version. For more information about rotating secrets and how to configure a Lambda function to rotate the secrets
     * for your protected service, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html">Rotating Secrets in AWS
     * Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * <p>
     * Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date
     * by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the
     * hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards
     * the top of the hour and influenced by a variety of factors that help distribute load.
     * </p>
     * <p>
     * The rotation function must end with the versions of the secret in one of two states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>AWSPENDING</code> and <code>AWSCURRENT</code> staging labels are attached to the same version of the
     * secret, or
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSPENDING</code> staging label is not attached to any version of the secret.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If instead the <code>AWSPENDING</code> staging label is present but is not attached to the same version as
     * <code>AWSCURRENT</code> then any later invocation of <code>RotateSecret</code> assumes that a previous rotation
     * request is still in progress and returns an error.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:RotateSecret
     * </p>
     * </li>
     * <li>
     * <p>
     * lambda:InvokeFunction (on the function specified in the secret's metadata)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To list the secrets in your account, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the details for a version of a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a new version of a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To attach staging labels to or remove staging labels from a version of a secret, use
     * <a>UpdateSecretVersionStage</a>.
     * </p>
     * </li>
     * </ul>
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
     * Configures and starts the asynchronous process of rotating this secret. If you include the configuration
     * parameters, the operation sets those values for the secret and then immediately starts a rotation. If you do not
     * include the configuration parameters, the operation starts a rotation with the values already stored in the
     * secret. After the rotation completes, the protected service and its clients all use the new version of the
     * secret.
     * </p>
     * <p>
     * This required configuration information includes the ARN of an AWS Lambda function and the time between scheduled
     * rotations. The Lambda rotation function creates a new version of the secret and creates or updates the
     * credentials on the protected service to match. After testing the new credentials, the function marks the new
     * secret with the staging label <code>AWSCURRENT</code> so that your clients all immediately begin to use the new
     * version. For more information about rotating secrets and how to configure a Lambda function to rotate the secrets
     * for your protected service, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html">Rotating Secrets in AWS
     * Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * <p>
     * Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date
     * by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the
     * hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards
     * the top of the hour and influenced by a variety of factors that help distribute load.
     * </p>
     * <p>
     * The rotation function must end with the versions of the secret in one of two states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>AWSPENDING</code> and <code>AWSCURRENT</code> staging labels are attached to the same version of the
     * secret, or
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSPENDING</code> staging label is not attached to any version of the secret.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If instead the <code>AWSPENDING</code> staging label is present but is not attached to the same version as
     * <code>AWSCURRENT</code> then any later invocation of <code>RotateSecret</code> assumes that a previous rotation
     * request is still in progress and returns an error.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:RotateSecret
     * </p>
     * </li>
     * <li>
     * <p>
     * lambda:InvokeFunction (on the function specified in the secret's metadata)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To list the secrets in your account, use <a>ListSecrets</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the details for a version of a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a new version of a secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To attach staging labels to or remove staging labels from a version of a secret, use
     * <a>UpdateSecretVersionStage</a>.
     * </p>
     * </li>
     * </ul>
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
     * Attaches one or more tags, each consisting of a key name and a value, to the specified secret. Tags are part of
     * the secret's overall metadata, and are not associated with any specific version of the secret. This operation
     * only appends tags to the existing list of tags. To remove tags, you must use <a>UntagResource</a>.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret—50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length—127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length—255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because it is reserved for AWS use. You can't
     * edit or delete tag names or values with this prefix. Tags with this prefix do not count against your tags per
     * secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema will be used across multiple services and resources, remember that other services might
     * have restrictions on allowed characters. Generally allowed characters are: letters, spaces, and numbers
     * representable in UTF-8, plus the following special characters: + - = . _ : / @.
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:TagResource
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove one or more tags from the collection attached to a secret, use <a>UntagResource</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To view the list of tags attached to a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Attaches one or more tags, each consisting of a key name and a value, to the specified secret. Tags are part of
     * the secret's overall metadata, and are not associated with any specific version of the secret. This operation
     * only appends tags to the existing list of tags. To remove tags, you must use <a>UntagResource</a>.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret—50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length—127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length—255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because it is reserved for AWS use. You can't
     * edit or delete tag names or values with this prefix. Tags with this prefix do not count against your tags per
     * secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema will be used across multiple services and resources, remember that other services might
     * have restrictions on allowed characters. Generally allowed characters are: letters, spaces, and numbers
     * representable in UTF-8, plus the following special characters: + - = . _ : / @.
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:TagResource
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove one or more tags from the collection attached to a secret, use <a>UntagResource</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To view the list of tags attached to a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Removes one or more tags from the specified secret.
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:UntagResource
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add one or more tags to the collection attached to a secret, use <a>TagResource</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To view the list of tags attached to a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Removes one or more tags from the specified secret.
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:UntagResource
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add one or more tags to the collection attached to a secret, use <a>TagResource</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To view the list of tags attached to a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * </ul>
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
     * Modifies many of the details of the specified secret. If you include a <code>ClientRequestToken</code> and
     * <i>either</i> <code>SecretString</code> or <code>SecretBinary</code> then it also creates a new version attached
     * to the secret.
     * </p>
     * <p>
     * To modify the rotation configuration of a secret, use <a>RotateSecret</a> instead.
     * </p>
     * <note>
     * <p>
     * The Secrets Manager console uses only the <code>SecretString</code> parameter and therefore limits you to
     * encrypting and storing only a text string. To encrypt and store binary data as part of the version of a secret,
     * you must use either the AWS CLI or one of the AWS SDKs.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If a version with a <code>VersionId</code> with the same value as the <code>ClientRequestToken</code> parameter
     * already exists, the operation results in an error. You cannot modify an existing version, you can only create a
     * new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code> to create a new secret version, Secrets
     * Manager automatically attaches the staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you call an operation that needs to encrypt or decrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a
     * AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the
     * alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager
     * creates it for you automatically. All users and roles in the same AWS account automatically have access to use
     * the default CMK. Note that if an Secrets Manager API call results in AWS having to create the account's
     * AWS-managed CMK, it can result in a one-time significant delay in returning the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the secret is in a different AWS account from the credentials calling an API that requires encryption or
     * decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the
     * default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the
     * secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call
     * an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from
     * a different account then the AWS KMS key policy must grant cross-account access to that other account's user or
     * role for both the kms:GenerateDataKey and kms:Decrypt operations.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:UpdateSecret
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey - needed only if you use a custom AWS KMS key to encrypt the secret. You do not need this
     * permission to use the account's AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt - needed only if you use a custom AWS KMS key to encrypt the secret. You do not need this permission
     * to use the account's AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a new secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add only a new version to an existing secret, use <a>PutSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the details for a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list the versions contained in a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Modifies many of the details of the specified secret. If you include a <code>ClientRequestToken</code> and
     * <i>either</i> <code>SecretString</code> or <code>SecretBinary</code> then it also creates a new version attached
     * to the secret.
     * </p>
     * <p>
     * To modify the rotation configuration of a secret, use <a>RotateSecret</a> instead.
     * </p>
     * <note>
     * <p>
     * The Secrets Manager console uses only the <code>SecretString</code> parameter and therefore limits you to
     * encrypting and storing only a text string. To encrypt and store binary data as part of the version of a secret,
     * you must use either the AWS CLI or one of the AWS SDKs.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If a version with a <code>VersionId</code> with the same value as the <code>ClientRequestToken</code> parameter
     * already exists, the operation results in an error. You cannot modify an existing version, you can only create a
     * new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code> to create a new secret version, Secrets
     * Manager automatically attaches the staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you call an operation that needs to encrypt or decrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a
     * AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the
     * alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager
     * creates it for you automatically. All users and roles in the same AWS account automatically have access to use
     * the default CMK. Note that if an Secrets Manager API call results in AWS having to create the account's
     * AWS-managed CMK, it can result in a one-time significant delay in returning the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the secret is in a different AWS account from the credentials calling an API that requires encryption or
     * decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the
     * default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the
     * secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call
     * an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from
     * a different account then the AWS KMS key policy must grant cross-account access to that other account's user or
     * role for both the kms:GenerateDataKey and kms:Decrypt operations.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:UpdateSecret
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey - needed only if you use a custom AWS KMS key to encrypt the secret. You do not need this
     * permission to use the account's AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt - needed only if you use a custom AWS KMS key to encrypt the secret. You do not need this permission
     * to use the account's AWS managed CMK for Secrets Manager.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a new secret, use <a>CreateSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add only a new version to an existing secret, use <a>PutSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get the details for a secret, use <a>DescribeSecret</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To list the versions contained in a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * </li>
     * </ul>
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
     * Modifies the staging labels attached to a version of a secret. Staging labels are used to track a version as it
     * progresses through the secret rotation process. You can attach a staging label to only one version of a secret at
     * a time. If a staging label to be added is already attached to another version, then it is moved--removed from the
     * other version first and then attached to this one. For more information about staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/terms-concepts.html#term_staging-label">Staging
     * Labels</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * <p>
     * The staging labels that you specify in the <code>VersionStage</code> parameter are added to the existing list of
     * staging labels--they don't replace it.
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:UpdateSecretVersionStage
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get the list of staging labels that are currently associated with a version of a secret, use
     * <code> <a>DescribeSecret</a> </code> and examine the <code>SecretVersionsToStages</code> response value.
     * </p>
     * </li>
     * </ul>
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
     * Modifies the staging labels attached to a version of a secret. Staging labels are used to track a version as it
     * progresses through the secret rotation process. You can attach a staging label to only one version of a secret at
     * a time. If a staging label to be added is already attached to another version, then it is moved--removed from the
     * other version first and then attached to this one. For more information about staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/terms-concepts.html#term_staging-label">Staging
     * Labels</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * <p>
     * The staging labels that you specify in the <code>VersionStage</code> parameter are added to the existing list of
     * staging labels--they don't replace it.
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
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * secretsmanager:UpdateSecretVersionStage
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get the list of staging labels that are currently associated with a version of a secret, use
     * <code> <a>DescribeSecret</a> </code> and examine the <code>SecretVersionsToStages</code> response value.
     * </p>
     * </li>
     * </ul>
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

}
