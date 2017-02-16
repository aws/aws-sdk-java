/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms;

import javax.annotation.Generated;

import com.amazonaws.services.kms.model.*;

/**
 * Interface for accessing KMS asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kms.AbstractAWSKMSAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Key Management Service</fullname>
 * <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key management web service. This guide describes the AWS
 * KMS operations that you can call programmatically. For general information about AWS KMS, see the <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/">AWS Key Management Service Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS KMS and other
 * AWS services. For example, the SDKs take care of tasks such as signing requests (see below), managing errors, and
 * retrying requests automatically. For more information about the AWS SDKs, including how to download and install them,
 * see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to AWS KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS 1.2. Clients must also support cipher
 * suites with Perfect Forward Secrecy (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
 * Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We strongly recommend that you <i>do
 * not</i> use your AWS account (root) access key ID and secret key for everyday work with AWS KMS. Instead, use the
 * access key ID and secret access key for an IAM user, or you can use the AWS Security Token Service to generate
 * temporary security credentials that you can use to sign requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and related events for your AWS account and
 * delivers them to an Amazon S3 bucket that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it was made, and so on. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS CloudTrail User Guide</a>.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">AWS Security Credentials</a> -
 * This topic provides general information about the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>
 * - This section of the <i>IAM User Guide</i> describes how to create and use temporary security credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a> - This set of topics walks you through the process of signing a request using an access key ID and a
 * secret access key.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the most useful for most applications. You will likely
 * perform actions other than these, such as creating keys and assigning policies, by using the console.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>Encrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Decrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyWithoutPlaintext</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSKMSAsync extends AWSKMS {

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the
     * <code>Disabled</code> state. To enable a CMK, use <a>EnableKey</a>.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @return A Java Future containing the result of the CancelKeyDeletion operation returned by the service.
     * @sample AWSKMSAsync.CancelKeyDeletion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CancelKeyDeletion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest cancelKeyDeletionRequest);

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the
     * <code>Disabled</code> state. To enable a CMK, use <a>EnableKey</a>.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelKeyDeletion operation returned by the service.
     * @sample AWSKMSAsyncHandler.CancelKeyDeletion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CancelKeyDeletion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest cancelKeyDeletionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler);

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be used to identify a key and should be unique.
     * The console enforces a one-to-one mapping between the alias and a key. An alias name can contain only
     * alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word
     * "alias" followed by a forward slash (alias/). An alias that begins with "aws" after the forward slash
     * (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSKMSAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be used to identify a key and should be unique.
     * The console enforces a one-to-one mapping between the alias and a key. An alias name can contain only
     * alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word
     * "alias" followed by a forward slash (alias/). An alias that begins with "aws" after the forward slash
     * (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSKMSAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Adds a grant to a key to specify who can use the key and under what conditions. Grants are alternate permission
     * mechanisms to key policies.
     * </p>
     * <p>
     * For more information about grants, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param createGrantRequest
     * @return A Java Future containing the result of the CreateGrant operation returned by the service.
     * @sample AWSKMSAsync.CreateGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest createGrantRequest);

    /**
     * <p>
     * Adds a grant to a key to specify who can use the key and under what conditions. Grants are alternate permission
     * mechanisms to key policies.
     * </p>
     * <p>
     * For more information about grants, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param createGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGrant operation returned by the service.
     * @sample AWSKMSAsyncHandler.CreateGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest createGrantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler);

    /**
     * <p>
     * Creates a customer master key (CMK).
     * </p>
     * <p>
     * You can use a CMK to encrypt small amounts of data (4 KiB or less) directly, but CMKs are more commonly used to
     * encrypt data encryption keys (DEKs), which are used to encrypt raw data. For more information about DEKs and the
     * difference between CMKs and DEKs, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <a>GenerateDataKey</a> operation
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * Concepts</a> in the <i>AWS Key Management Service Developer Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createKeyRequest
     * @return A Java Future containing the result of the CreateKey operation returned by the service.
     * @sample AWSKMSAsync.CreateKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest createKeyRequest);

    /**
     * <p>
     * Creates a customer master key (CMK).
     * </p>
     * <p>
     * You can use a CMK to encrypt small amounts of data (4 KiB or less) directly, but CMKs are more commonly used to
     * encrypt data encryption keys (DEKs), which are used to encrypt raw data. For more information about DEKs and the
     * difference between CMKs and DEKs, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <a>GenerateDataKey</a> operation
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * Concepts</a> in the <i>AWS Key Management Service Developer Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKey operation returned by the service.
     * @sample AWSKMSAsyncHandler.CreateKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest createKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateKey operation.
     *
     * @see #createKeyAsync(CreateKeyRequest)
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync();

    /**
     * Simplified method form for invoking the CreateKey operation with an AsyncHandler.
     *
     * @see #createKeyAsync(CreateKeyRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler);

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following
     * functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GenerateDataKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyWithoutPlaintext</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Encrypt</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if a caller has been granted access permissions to all keys (through, for example, IAM user policies
     * that grant <code>Decrypt</code> permission on all resources), then ciphertext encrypted by using keys in other
     * accounts where the key grants access to the caller can be decrypted. To remedy this, we recommend that you do not
     * grant <code>Decrypt</code> access in an IAM user policy. Instead grant <code>Decrypt</code> access only in key
     * policies. If you must grant <code>Decrypt</code> access in an IAM user policy, you should scope the resource to
     * specific keys or to specific trusted accounts.
     * </p>
     * 
     * @param decryptRequest
     * @return A Java Future containing the result of the Decrypt operation returned by the service.
     * @sample AWSKMSAsync.Decrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Decrypt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DecryptResult> decryptAsync(DecryptRequest decryptRequest);

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following
     * functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GenerateDataKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyWithoutPlaintext</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Encrypt</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if a caller has been granted access permissions to all keys (through, for example, IAM user policies
     * that grant <code>Decrypt</code> permission on all resources), then ciphertext encrypted by using keys in other
     * accounts where the key grants access to the caller can be decrypted. To remedy this, we recommend that you do not
     * grant <code>Decrypt</code> access in an IAM user policy. Instead grant <code>Decrypt</code> access only in key
     * policies. If you must grant <code>Decrypt</code> access in an IAM user policy, you should scope the resource to
     * specific keys or to specific trusted accounts.
     * </p>
     * 
     * @param decryptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Decrypt operation returned by the service.
     * @sample AWSKMSAsyncHandler.Decrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Decrypt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DecryptResult> decryptAsync(DecryptRequest decryptRequest,
            com.amazonaws.handlers.AsyncHandler<DecryptRequest, DecryptResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSKMSAsync.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSKMSAsyncHandler.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes key material that you previously imported and makes the specified customer master key (CMK) unusable. For
     * more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the specified CMK is in the <code>PendingDeletion</code> state, this operation does not change the CMK's
     * state. Otherwise, it changes the CMK's state to <code>PendingImport</code>.
     * </p>
     * <p>
     * After you delete key material, you can use <a>ImportKeyMaterial</a> to reimport the same key material into the
     * CMK.
     * </p>
     * 
     * @param deleteImportedKeyMaterialRequest
     * @return A Java Future containing the result of the DeleteImportedKeyMaterial operation returned by the service.
     * @sample AWSKMSAsync.DeleteImportedKeyMaterial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeleteImportedKeyMaterial" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImportedKeyMaterialResult> deleteImportedKeyMaterialAsync(
            DeleteImportedKeyMaterialRequest deleteImportedKeyMaterialRequest);

    /**
     * <p>
     * Deletes key material that you previously imported and makes the specified customer master key (CMK) unusable. For
     * more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the specified CMK is in the <code>PendingDeletion</code> state, this operation does not change the CMK's
     * state. Otherwise, it changes the CMK's state to <code>PendingImport</code>.
     * </p>
     * <p>
     * After you delete key material, you can use <a>ImportKeyMaterial</a> to reimport the same key material into the
     * CMK.
     * </p>
     * 
     * @param deleteImportedKeyMaterialRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImportedKeyMaterial operation returned by the service.
     * @sample AWSKMSAsyncHandler.DeleteImportedKeyMaterial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeleteImportedKeyMaterial" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImportedKeyMaterialResult> deleteImportedKeyMaterialAsync(
            DeleteImportedKeyMaterialRequest deleteImportedKeyMaterialRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResult> asyncHandler);

    /**
     * <p>
     * Provides detailed information about the specified customer master key.
     * </p>
     * 
     * @param describeKeyRequest
     * @return A Java Future containing the result of the DescribeKey operation returned by the service.
     * @sample AWSKMSAsync.DescribeKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DescribeKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest describeKeyRequest);

    /**
     * <p>
     * Provides detailed information about the specified customer master key.
     * </p>
     * 
     * @param describeKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeKey operation returned by the service.
     * @sample AWSKMSAsyncHandler.DescribeKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DescribeKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest describeKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler);

    /**
     * <p>
     * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic
     * operations. For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @return A Java Future containing the result of the DisableKey operation returned by the service.
     * @sample AWSKMSAsync.DisableKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisableKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableKeyResult> disableKeyAsync(DisableKeyRequest disableKeyRequest);

    /**
     * <p>
     * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic
     * operations. For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableKey operation returned by the service.
     * @sample AWSKMSAsyncHandler.DisableKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisableKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableKeyResult> disableKeyAsync(DisableKeyRequest disableKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRequest, DisableKeyResult> asyncHandler);

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @return A Java Future containing the result of the DisableKeyRotation operation returned by the service.
     * @sample AWSKMSAsync.DisableKeyRotation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisableKeyRotation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableKeyRotationResult> disableKeyRotationAsync(DisableKeyRotationRequest disableKeyRotationRequest);

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableKeyRotation operation returned by the service.
     * @sample AWSKMSAsyncHandler.DisableKeyRotation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisableKeyRotation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableKeyRotationResult> disableKeyRotationAsync(DisableKeyRotationRequest disableKeyRotationRequest,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRotationRequest, DisableKeyRotationResult> asyncHandler);

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     * 
     * @param enableKeyRequest
     * @return A Java Future containing the result of the EnableKey operation returned by the service.
     * @sample AWSKMSAsync.EnableKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/EnableKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableKeyResult> enableKeyAsync(EnableKeyRequest enableKeyRequest);

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     * 
     * @param enableKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableKey operation returned by the service.
     * @sample AWSKMSAsyncHandler.EnableKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/EnableKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableKeyResult> enableKeyAsync(EnableKeyRequest enableKeyRequest,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRequest, EnableKeyResult> asyncHandler);

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @return A Java Future containing the result of the EnableKeyRotation operation returned by the service.
     * @sample AWSKMSAsync.EnableKeyRotation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/EnableKeyRotation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableKeyRotationResult> enableKeyRotationAsync(EnableKeyRotationRequest enableKeyRotationRequest);

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableKeyRotation operation returned by the service.
     * @sample AWSKMSAsyncHandler.EnableKeyRotation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/EnableKeyRotation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableKeyRotationResult> enableKeyRotationAsync(EnableKeyRotationRequest enableKeyRotationRequest,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRotationRequest, EnableKeyRotationResult> asyncHandler);

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key. The <code>Encrypt</code> function has two
     * primary use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can encrypt up to 4 KB of arbitrary data such as an RSA key, a database password, or other sensitive customer
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are moving encrypted data from one region to another, you can use this API to encrypt in the new region
     * the plaintext data key that was used to encrypt the data in the original region. This provides you with an
     * encrypted copy of the data key that can be decrypted in the new region and used there to decrypt the encrypted
     * data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Unless you are moving encrypted data from one region to another, you don't use this function to encrypt a
     * generated data key within a region. You retrieve data keys already encrypted by calling the
     * <a>GenerateDataKey</a> or <a>GenerateDataKeyWithoutPlaintext</a> function. Data keys don't need to be encrypted
     * again by calling <code>Encrypt</code>.
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use the <code>GenerateDataKey</code> function to
     * return a plaintext data encryption key and a copy of the key encrypted under the customer master key (CMK) of
     * your choosing.
     * </p>
     * 
     * @param encryptRequest
     * @return A Java Future containing the result of the Encrypt operation returned by the service.
     * @sample AWSKMSAsync.Encrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Encrypt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EncryptResult> encryptAsync(EncryptRequest encryptRequest);

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key. The <code>Encrypt</code> function has two
     * primary use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can encrypt up to 4 KB of arbitrary data such as an RSA key, a database password, or other sensitive customer
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are moving encrypted data from one region to another, you can use this API to encrypt in the new region
     * the plaintext data key that was used to encrypt the data in the original region. This provides you with an
     * encrypted copy of the data key that can be decrypted in the new region and used there to decrypt the encrypted
     * data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Unless you are moving encrypted data from one region to another, you don't use this function to encrypt a
     * generated data key within a region. You retrieve data keys already encrypted by calling the
     * <a>GenerateDataKey</a> or <a>GenerateDataKeyWithoutPlaintext</a> function. Data keys don't need to be encrypted
     * again by calling <code>Encrypt</code>.
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use the <code>GenerateDataKey</code> function to
     * return a plaintext data encryption key and a copy of the key encrypted under the customer master key (CMK) of
     * your choosing.
     * </p>
     * 
     * @param encryptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Encrypt operation returned by the service.
     * @sample AWSKMSAsyncHandler.Encrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Encrypt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EncryptResult> encryptAsync(EncryptRequest encryptRequest,
            com.amazonaws.handlers.AsyncHandler<EncryptRequest, EncryptResult> asyncHandler);

    /**
     * <p>
     * Returns a data encryption key that you can use in your application to encrypt data locally.
     * </p>
     * <p>
     * You must specify the customer master key (CMK) under which to generate the data key. You must also specify the
     * length of the data key using either the <code>KeySpec</code> or <code>NumberOfBytes</code> field. You must
     * specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we
     * recommend that you use <code>KeySpec</code>.
     * </p>
     * <p>
     * This operation returns a plaintext copy of the data key in the <code>Plaintext</code> field of the response, and
     * an encrypted copy of the data key in the <code>CiphertextBlob</code> field. The data key is encrypted under the
     * CMK specified in the <code>KeyId</code> field of the request.
     * </p>
     * <p>
     * We recommend that you use the following pattern to encrypt data locally in your application:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use this operation (<code>GenerateDataKey</code>) to retrieve a data encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data encryption key (returned in the <code>Plaintext</code> field of the response) to encrypt
     * data locally, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * <li>
     * <p>
     * Store the encrypted data key (returned in the <code>CiphertextBlob</code> field of the response) alongside the
     * locally encrypted data.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To decrypt data locally:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the <a>Decrypt</a> operation to decrypt the encrypted data key into a plaintext copy of the data key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To return only an encrypted copy of the data key, use <a>GenerateDataKeyWithoutPlaintext</a>. To return an
     * arbitrary unpredictable byte string, use <a>GenerateRandom</a>.
     * </p>
     * <p>
     * If you use the optional <code>EncryptionContext</code> field, you must store at least enough information to be
     * able to reconstruct the full encryption context when you later send the ciphertext to the <a>Decrypt</a>
     * operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better
     * secure the ciphertext. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param generateDataKeyRequest
     * @return A Java Future containing the result of the GenerateDataKey operation returned by the service.
     * @sample AWSKMSAsync.GenerateDataKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest generateDataKeyRequest);

    /**
     * <p>
     * Returns a data encryption key that you can use in your application to encrypt data locally.
     * </p>
     * <p>
     * You must specify the customer master key (CMK) under which to generate the data key. You must also specify the
     * length of the data key using either the <code>KeySpec</code> or <code>NumberOfBytes</code> field. You must
     * specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we
     * recommend that you use <code>KeySpec</code>.
     * </p>
     * <p>
     * This operation returns a plaintext copy of the data key in the <code>Plaintext</code> field of the response, and
     * an encrypted copy of the data key in the <code>CiphertextBlob</code> field. The data key is encrypted under the
     * CMK specified in the <code>KeyId</code> field of the request.
     * </p>
     * <p>
     * We recommend that you use the following pattern to encrypt data locally in your application:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use this operation (<code>GenerateDataKey</code>) to retrieve a data encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data encryption key (returned in the <code>Plaintext</code> field of the response) to encrypt
     * data locally, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * <li>
     * <p>
     * Store the encrypted data key (returned in the <code>CiphertextBlob</code> field of the response) alongside the
     * locally encrypted data.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To decrypt data locally:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the <a>Decrypt</a> operation to decrypt the encrypted data key into a plaintext copy of the data key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To return only an encrypted copy of the data key, use <a>GenerateDataKeyWithoutPlaintext</a>. To return an
     * arbitrary unpredictable byte string, use <a>GenerateRandom</a>.
     * </p>
     * <p>
     * If you use the optional <code>EncryptionContext</code> field, you must store at least enough information to be
     * able to reconstruct the full encryption context when you later send the ciphertext to the <a>Decrypt</a>
     * operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better
     * secure the ciphertext. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param generateDataKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateDataKey operation returned by the service.
     * @sample AWSKMSAsyncHandler.GenerateDataKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest generateDataKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler);

    /**
     * <p>
     * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to
     * <a>GenerateDataKey</a> but returns only the encrypted copy of the data key.
     * </p>
     * <p>
     * This operation is useful in a system that has multiple components with different degrees of trust. For example,
     * consider a system that stores encrypted data in containers. Each container stores the encrypted data and an
     * encrypted copy of the data key. One component of the system, called the <i>control plane</i>, creates new
     * containers. When it creates a new container, it uses this operation (<code>GenerateDataKeyWithoutPlaintext</code>
     * ) to get an encrypted data key and then stores it in the container. Later, a different component of the system,
     * called the <i>data plane</i>, puts encrypted data into the containers. To do this, it passes the encrypted data
     * key to the <a>Decrypt</a> operation, then uses the returned plaintext data key to encrypt data, and finally
     * stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @return A Java Future containing the result of the GenerateDataKeyWithoutPlaintext operation returned by the
     *         service.
     * @sample AWSKMSAsync.GenerateDataKeyWithoutPlaintext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKeyWithoutPlaintext"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest);

    /**
     * <p>
     * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to
     * <a>GenerateDataKey</a> but returns only the encrypted copy of the data key.
     * </p>
     * <p>
     * This operation is useful in a system that has multiple components with different degrees of trust. For example,
     * consider a system that stores encrypted data in containers. Each container stores the encrypted data and an
     * encrypted copy of the data key. One component of the system, called the <i>control plane</i>, creates new
     * containers. When it creates a new container, it uses this operation (<code>GenerateDataKeyWithoutPlaintext</code>
     * ) to get an encrypted data key and then stores it in the container. Later, a different component of the system,
     * called the <i>data plane</i>, puts encrypted data into the containers. To do this, it passes the encrypted data
     * key to the <a>Decrypt</a> operation, then uses the returned plaintext data key to encrypt data, and finally
     * stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateDataKeyWithoutPlaintext operation returned by the
     *         service.
     * @sample AWSKMSAsyncHandler.GenerateDataKeyWithoutPlaintext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKeyWithoutPlaintext"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler);

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @param generateRandomRequest
     * @return A Java Future containing the result of the GenerateRandom operation returned by the service.
     * @sample AWSKMSAsync.GenerateRandom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateRandom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest generateRandomRequest);

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @param generateRandomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateRandom operation returned by the service.
     * @sample AWSKMSAsyncHandler.GenerateRandom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateRandom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest generateRandomRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler);

    /**
     * Simplified method form for invoking the GenerateRandom operation.
     *
     * @see #generateRandomAsync(GenerateRandomRequest)
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync();

    /**
     * Simplified method form for invoking the GenerateRandom operation with an AsyncHandler.
     *
     * @see #generateRandomAsync(GenerateRandomRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler);

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @return A Java Future containing the result of the GetKeyPolicy operation returned by the service.
     * @sample AWSKMSAsync.GetKeyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest getKeyPolicyRequest);

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPolicy operation returned by the service.
     * @sample AWSKMSAsyncHandler.GetKeyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest getKeyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is enabled for the specified key.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @return A Java Future containing the result of the GetKeyRotationStatus operation returned by the service.
     * @sample AWSKMSAsync.GetKeyRotationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyRotationStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest getKeyRotationStatusRequest);

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is enabled for the specified key.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyRotationStatus operation returned by the service.
     * @sample AWSKMSAsyncHandler.GetKeyRotationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyRotationStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest getKeyRotationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the items you need in order to import key material into AWS KMS from your existing key management
     * infrastructure. For more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>. You must also specify the wrapping algorithm and type of
     * wrapping key (public key) that you will use to encrypt the key material.
     * </p>
     * <p>
     * This operation returns a public key and an import token. Use the public key to encrypt the key material. Store
     * the import token to send with a subsequent <a>ImportKeyMaterial</a> request. The public key and import token from
     * the same response must be used together. These items are valid for 24 hours, after which they cannot be used for
     * a subsequent <a>ImportKeyMaterial</a> request. To retrieve new ones, send another
     * <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @param getParametersForImportRequest
     * @return A Java Future containing the result of the GetParametersForImport operation returned by the service.
     * @sample AWSKMSAsync.GetParametersForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetParametersForImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest getParametersForImportRequest);

    /**
     * <p>
     * Returns the items you need in order to import key material into AWS KMS from your existing key management
     * infrastructure. For more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>. You must also specify the wrapping algorithm and type of
     * wrapping key (public key) that you will use to encrypt the key material.
     * </p>
     * <p>
     * This operation returns a public key and an import token. Use the public key to encrypt the key material. Store
     * the import token to send with a subsequent <a>ImportKeyMaterial</a> request. The public key and import token from
     * the same response must be used together. These items are valid for 24 hours, after which they cannot be used for
     * a subsequent <a>ImportKeyMaterial</a> request. To retrieve new ones, send another
     * <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @param getParametersForImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParametersForImport operation returned by the service.
     * @sample AWSKMSAsyncHandler.GetParametersForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetParametersForImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest getParametersForImportRequest,
            com.amazonaws.handlers.AsyncHandler<GetParametersForImportRequest, GetParametersForImportResult> asyncHandler);

    /**
     * <p>
     * Imports key material into an AWS KMS customer master key (CMK) from your existing key management infrastructure.
     * For more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the CMK to import the key material into. This CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>. You must also send an import token and the encrypted key material. Send the import token
     * that you received in the same <a>GetParametersForImport</a> response that contained the public key that you used
     * to encrypt the key material. You must also specify whether the key material expires and if so, when. When the key
     * material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you can
     * reimport the same key material. If you set an expiration date, you can change it only by reimporting the same key
     * material and specifying a new expiration date.
     * </p>
     * <p>
     * When this operation is successful, the specified CMK's key state changes to <code>Enabled</code>, and you can use
     * the CMK.
     * </p>
     * <p>
     * After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but
     * you cannot import different key material.
     * </p>
     * 
     * @param importKeyMaterialRequest
     * @return A Java Future containing the result of the ImportKeyMaterial operation returned by the service.
     * @sample AWSKMSAsync.ImportKeyMaterial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ImportKeyMaterial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyMaterialResult> importKeyMaterialAsync(ImportKeyMaterialRequest importKeyMaterialRequest);

    /**
     * <p>
     * Imports key material into an AWS KMS customer master key (CMK) from your existing key management infrastructure.
     * For more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the CMK to import the key material into. This CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>. You must also send an import token and the encrypted key material. Send the import token
     * that you received in the same <a>GetParametersForImport</a> response that contained the public key that you used
     * to encrypt the key material. You must also specify whether the key material expires and if so, when. When the key
     * material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you can
     * reimport the same key material. If you set an expiration date, you can change it only by reimporting the same key
     * material and specifying a new expiration date.
     * </p>
     * <p>
     * When this operation is successful, the specified CMK's key state changes to <code>Enabled</code>, and you can use
     * the CMK.
     * </p>
     * <p>
     * After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but
     * you cannot import different key material.
     * </p>
     * 
     * @param importKeyMaterialRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportKeyMaterial operation returned by the service.
     * @sample AWSKMSAsyncHandler.ImportKeyMaterial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ImportKeyMaterial" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyMaterialResult> importKeyMaterialAsync(ImportKeyMaterialRequest importKeyMaterialRequest,
            com.amazonaws.handlers.AsyncHandler<ImportKeyMaterialRequest, ImportKeyMaterialResult> asyncHandler);

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSKMSAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @param listAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAliases operation.
     *
     * @see #listAliasesAsync(ListAliasesRequest)
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync();

    /**
     * Simplified method form for invoking the ListAliases operation with an AsyncHandler.
     *
     * @see #listAliasesAsync(ListAliasesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     * 
     * @param listGrantsRequest
     * @return A Java Future containing the result of the ListGrants operation returned by the service.
     * @sample AWSKMSAsync.ListGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListGrants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest listGrantsRequest);

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     * 
     * @param listGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGrants operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListGrants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest listGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @return A Java Future containing the result of the ListKeyPolicies operation returned by the service.
     * @sample AWSKMSAsync.ListKeyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListKeyPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest listKeyPoliciesRequest);

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeyPolicies operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListKeyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListKeyPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest listKeyPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @param listKeysRequest
     * @return A Java Future containing the result of the ListKeys operation returned by the service.
     * @sample AWSKMSAsync.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest);

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @param listKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeys operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListKeys operation.
     *
     * @see #listKeysAsync(ListKeysRequest)
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync();

    /**
     * Simplified method form for invoking the ListKeys operation with an AsyncHandler.
     *
     * @see #listKeysAsync(ListKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all tags for the specified customer master key (CMK).
     * </p>
     * 
     * @param listResourceTagsRequest
     * @return A Java Future containing the result of the ListResourceTags operation returned by the service.
     * @sample AWSKMSAsync.ListResourceTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListResourceTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceTagsResult> listResourceTagsAsync(ListResourceTagsRequest listResourceTagsRequest);

    /**
     * <p>
     * Returns a list of all tags for the specified customer master key (CMK).
     * </p>
     * 
     * @param listResourceTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceTags operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListResourceTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListResourceTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceTagsResult> listResourceTagsAsync(ListResourceTagsRequest listResourceTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceTagsRequest, ListResourceTagsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all grants for which the grant's <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To retire a grant, use <a>RetireGrant</a>.
     * </p>
     * 
     * @param listRetirableGrantsRequest
     * @return A Java Future containing the result of the ListRetirableGrants operation returned by the service.
     * @sample AWSKMSAsync.ListRetirableGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListRetirableGrants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest listRetirableGrantsRequest);

    /**
     * <p>
     * Returns a list of all grants for which the grant's <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To retire a grant, use <a>RetireGrant</a>.
     * </p>
     * 
     * @param listRetirableGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRetirableGrants operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListRetirableGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListRetirableGrants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest listRetirableGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler);

    /**
     * <p>
     * Attaches a key policy to the specified customer master key (CMK).
     * </p>
     * <p>
     * For more information about key policies, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key Policies</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @return A Java Future containing the result of the PutKeyPolicy operation returned by the service.
     * @sample AWSKMSAsync.PutKeyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/PutKeyPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutKeyPolicyResult> putKeyPolicyAsync(PutKeyPolicyRequest putKeyPolicyRequest);

    /**
     * <p>
     * Attaches a key policy to the specified customer master key (CMK).
     * </p>
     * <p>
     * For more information about key policies, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key Policies</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutKeyPolicy operation returned by the service.
     * @sample AWSKMSAsyncHandler.PutKeyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/PutKeyPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutKeyPolicyResult> putKeyPolicyAsync(PutKeyPolicyRequest putKeyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutKeyPolicyRequest, PutKeyPolicyResult> asyncHandler);

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data
     * on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change
     * the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other operations, <code>ReEncrypt</code> is authorized twice, once as <code>ReEncryptFrom</code> on the
     * source CMK and once as <code>ReEncryptTo</code> on the destination CMK. We recommend that you include the
     * <code>"kms:ReEncrypt*"</code> permission in your <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key policies</a> to permit
     * reencryption from or to the CMK. This permission is automatically included in the key policy when you create a
     * CMK through the console, but you must include it manually when you create a CMK programmatically or when you set
     * a key policy with the <a>PutKeyPolicy</a> operation.
     * </p>
     * 
     * @param reEncryptRequest
     * @return A Java Future containing the result of the ReEncrypt operation returned by the service.
     * @sample AWSKMSAsync.ReEncrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ReEncrypt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest reEncryptRequest);

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data
     * on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change
     * the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other operations, <code>ReEncrypt</code> is authorized twice, once as <code>ReEncryptFrom</code> on the
     * source CMK and once as <code>ReEncryptTo</code> on the destination CMK. We recommend that you include the
     * <code>"kms:ReEncrypt*"</code> permission in your <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key policies</a> to permit
     * reencryption from or to the CMK. This permission is automatically included in the key policy when you create a
     * CMK through the console, but you must include it manually when you create a CMK programmatically or when you set
     * a key policy with the <a>PutKeyPolicy</a> operation.
     * </p>
     * 
     * @param reEncryptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReEncrypt operation returned by the service.
     * @sample AWSKMSAsyncHandler.ReEncrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ReEncrypt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest reEncryptRequest,
            com.amazonaws.handlers.AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler);

    /**
     * <p>
     * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when
     * you intend to actively deny operations that depend on it. The following are permitted to call this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The AWS account (root user) under which the grant was created
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RetiringPrincipal</code>, if present in the grant
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is an operation specified in the grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon
     * Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded
     * string. A grant ID is a 64 character unique identifier of a grant. The <a>CreateGrant</a> operation returns both.
     * </p>
     * 
     * @param retireGrantRequest
     * @return A Java Future containing the result of the RetireGrant operation returned by the service.
     * @sample AWSKMSAsync.RetireGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RetireGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(RetireGrantRequest retireGrantRequest);

    /**
     * <p>
     * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when
     * you intend to actively deny operations that depend on it. The following are permitted to call this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The AWS account (root user) under which the grant was created
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RetiringPrincipal</code>, if present in the grant
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is an operation specified in the grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon
     * Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded
     * string. A grant ID is a 64 character unique identifier of a grant. The <a>CreateGrant</a> operation returns both.
     * </p>
     * 
     * @param retireGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetireGrant operation returned by the service.
     * @sample AWSKMSAsyncHandler.RetireGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RetireGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(RetireGrantRequest retireGrantRequest,
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, RetireGrantResult> asyncHandler);

    /**
     * Simplified method form for invoking the RetireGrant operation.
     *
     * @see #retireGrantAsync(RetireGrantRequest)
     */
    java.util.concurrent.Future<RetireGrantResult> retireGrantAsync();

    /**
     * Simplified method form for invoking the RetireGrant operation with an AsyncHandler.
     *
     * @see #retireGrantAsync(RetireGrantRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, RetireGrantResult> asyncHandler);

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations that depend on it.
     * </p>
     * 
     * @param revokeGrantRequest
     * @return A Java Future containing the result of the RevokeGrant operation returned by the service.
     * @sample AWSKMSAsync.RevokeGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RevokeGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RevokeGrantResult> revokeGrantAsync(RevokeGrantRequest revokeGrantRequest);

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations that depend on it.
     * </p>
     * 
     * @param revokeGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeGrant operation returned by the service.
     * @sample AWSKMSAsyncHandler.RevokeGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RevokeGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RevokeGrantResult> revokeGrantAsync(RevokeGrantRequest revokeGrantRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeGrantRequest, RevokeGrantResult> asyncHandler);

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days,
     * before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this
     * operation is successful, the state of the CMK changes to <code>PendingDeletion</code>. Before the waiting period
     * ends, you can use <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the waiting period ends, AWS
     * KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was
     * encrypted under the CMK is rendered unrecoverable. To restrict the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * For more information about scheduling a CMK for deletion, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @return A Java Future containing the result of the ScheduleKeyDeletion operation returned by the service.
     * @sample AWSKMSAsync.ScheduleKeyDeletion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ScheduleKeyDeletion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest scheduleKeyDeletionRequest);

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days,
     * before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this
     * operation is successful, the state of the CMK changes to <code>PendingDeletion</code>. Before the waiting period
     * ends, you can use <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the waiting period ends, AWS
     * KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was
     * encrypted under the CMK is rendered unrecoverable. To restrict the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * For more information about scheduling a CMK for deletion, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ScheduleKeyDeletion operation returned by the service.
     * @sample AWSKMSAsyncHandler.ScheduleKeyDeletion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ScheduleKeyDeletion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest scheduleKeyDeletionRequest,
            com.amazonaws.handlers.AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified customer master key (CMK).
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty (null) strings.
     * </p>
     * <p>
     * You cannot use the same tag key more than once per CMK. For example, consider a CMK with one tag whose tag key is
     * <code>Purpose</code> and tag value is <code>Test</code>. If you send a <code>TagResource</code> request for this
     * CMK with a tag key of <code>Purpose</code> and a tag value of <code>Prod</code>, it does not create a second tag.
     * Instead, the original tag is overwritten with the new tag value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSKMSAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified customer master key (CMK).
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty (null) strings.
     * </p>
     * <p>
     * You cannot use the same tag key more than once per CMK. For example, consider a CMK with one tag whose tag key is
     * <code>Purpose</code> and tag value is <code>Test</code>. If you send a <code>TagResource</code> request for this
     * CMK with a tag key of <code>Purpose</code> and a tag value of <code>Prod</code>, it does not create a second tag.
     * Instead, the original tag is overwritten with the new tag value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSKMSAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tag or tags from the specified customer master key (CMK).
     * </p>
     * <p>
     * To remove a tag, you specify the tag key for each tag to remove. You do not specify the tag value. To overwrite
     * the tag value for an existing tag, use <a>TagResource</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSKMSAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tag or tags from the specified customer master key (CMK).
     * </p>
     * <p>
     * To remove a tag, you specify the tag key for each tag to remove. You do not specify the tag value. To overwrite
     * the tag value for an existing tag, use <a>TagResource</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSKMSAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be mapped to and unmapped from an existing key
     * without changing the properties of the key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An
     * alias must start with the word "alias" followed by a forward slash (alias/). An alias that begins with "aws"
     * after the forward slash (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and the same region.
     * </p>
     * 
     * @param updateAliasRequest
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSKMSAsync.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be mapped to and unmapped from an existing key
     * without changing the properties of the key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An
     * alias must start with the word "alias" followed by a forward slash (alias/). An alias that begins with "aws"
     * after the forward slash (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and the same region.
     * </p>
     * 
     * @param updateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSKMSAsyncHandler.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * Updates the description of a customer master key (CMK).
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @return A Java Future containing the result of the UpdateKeyDescription operation returned by the service.
     * @sample AWSKMSAsync.UpdateKeyDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateKeyDescription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeyDescriptionResult> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest updateKeyDescriptionRequest);

    /**
     * <p>
     * Updates the description of a customer master key (CMK).
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKeyDescription operation returned by the service.
     * @sample AWSKMSAsyncHandler.UpdateKeyDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateKeyDescription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeyDescriptionResult> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest updateKeyDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResult> asyncHandler);

}
