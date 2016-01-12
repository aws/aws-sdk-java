/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kms;

import com.amazonaws.services.kms.model.*;

/**
 * Interface for accessing KMS asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Key Management Service</fullname>
 * <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key management web
 * service. This guide describes the AWS KMS operations that you can call
 * programmatically. For general information about AWS KMS, see the <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/">AWS Key
 * Management Service Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .Net, iOS, Android, etc.).
 * The SDKs provide a convenient way to create programmatic access to AWS KMS
 * and other AWS services. For example, the SDKs take care of tasks such as
 * signing requests (see below), managing errors, and retrying requests
 * automatically. For more information about the AWS SDKs, including how to
 * download and install them, see <a href="http://aws.amazon.com/tools/">Tools
 * for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to AWS
 * KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS
 * 1.2. Clients must also support cipher suites with Perfect Forward Secrecy
 * (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
 * Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support
 * these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We
 * strongly recommend that you <i>do not</i> use your AWS account access key ID
 * and secret key for everyday work with AWS KMS. Instead, use the access key ID
 * and secret access key for an IAM user, or you can use the AWS Security Token
 * Service to generate temporary security credentials that you can use to sign
 * requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and
 * related events for your AWS account and delivers them to an Amazon S3 bucket
 * that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it
 * was made, and so on. To learn more about CloudTrail, including how to turn it
 * on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS
 * CloudTrail User Guide</a>.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the
 * following:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"
 * >AWS Security Credentials</a> - This topic provides general information about
 * the types of credentials used for accessing AWS.</li>
 * <li><a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/">AWS Security
 * Token Service</a> - This guide describes how to create and use temporary
 * security credentials.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
 * >Signing AWS API Requests</a> - This set of topics walks you through the
 * process of signing a request using an access key ID and a secret access key.</li>
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the most useful
 * for most applications. You will likely perform actions other than these, such
 * as creating keys and assigning policies, by using the console.
 * </p>
 * <ul>
 * <li><a>Encrypt</a></li>
 * <li><a>Decrypt</a></li>
 * <li><a>GenerateDataKey</a></li>
 * <li><a>GenerateDataKeyWithoutPlaintext</a></li>
 * </ul>
 */
public interface AWSKMSAsync extends AWSKMS {

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this operation
     * is successful, the CMK is set to the <code>Disabled</code> state. To
     * enable a CMK, use <a>EnableKey</a>.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK, go
     * to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @return A Java Future containing the result of the CancelKeyDeletion
     *         operation returned by the service.
     * @sample AWSKMSAsync.CancelKeyDeletion
     */
    java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(
            CancelKeyDeletionRequest cancelKeyDeletionRequest);

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this operation
     * is successful, the CMK is set to the <code>Disabled</code> state. To
     * enable a CMK, use <a>EnableKey</a>.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK, go
     * to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelKeyDeletion
     *         operation returned by the service.
     * @sample AWSKMSAsyncHandler.CancelKeyDeletion
     */
    java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(
            CancelKeyDeletionRequest cancelKeyDeletionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler);

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be used to
     * identify a key and should be unique. The console enforces a one-to-one
     * mapping between the alias and a key. An alias name can contain only
     * alphanumeric characters, forward slashes (/), underscores (_), and dashes
     * (-). An alias must start with the word "alias" followed by a forward
     * slash (alias/). An alias that begins with "aws" after the forward slash
     * (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     * @sample AWSKMSAsync.CreateAlias
     */
    java.util.concurrent.Future<Void> createAliasAsync(
            CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be used to
     * identify a key and should be unique. The console enforces a one-to-one
     * mapping between the alias and a key. An alias name can contain only
     * alphanumeric characters, forward slashes (/), underscores (_), and dashes
     * (-). An alias must start with the word "alias" followed by a forward
     * slash (alias/). An alias that begins with "aws" after the forward slash
     * (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.CreateAlias
     */
    java.util.concurrent.Future<Void> createAliasAsync(
            CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, Void> asyncHandler);

    /**
     * <p>
     * Adds a grant to a key to specify who can use the key and under what
     * conditions. Grants are alternate permission mechanisms to key policies.
     * </p>
     * <p>
     * For more information about grants, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"
     * >Grants</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param createGrantRequest
     * @return A Java Future containing the result of the CreateGrant operation
     *         returned by the service.
     * @sample AWSKMSAsync.CreateGrant
     */
    java.util.concurrent.Future<CreateGrantResult> createGrantAsync(
            CreateGrantRequest createGrantRequest);

    /**
     * <p>
     * Adds a grant to a key to specify who can use the key and under what
     * conditions. Grants are alternate permission mechanisms to key policies.
     * </p>
     * <p>
     * For more information about grants, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"
     * >Grants</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param createGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGrant operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.CreateGrant
     */
    java.util.concurrent.Future<CreateGrantResult> createGrantAsync(
            CreateGrantRequest createGrantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler);

    /**
     * <p>
     * Creates a customer master key. Customer master keys can be used to
     * encrypt small amounts of data (less than 4K) directly, but they are most
     * commonly used to encrypt or envelope data keys that are then used to
     * encrypt customer data. For more information about data keys, see
     * <a>GenerateDataKey</a> and <a>GenerateDataKeyWithoutPlaintext</a>.
     * </p>
     * 
     * @param createKeyRequest
     * @return A Java Future containing the result of the CreateKey operation
     *         returned by the service.
     * @sample AWSKMSAsync.CreateKey
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            CreateKeyRequest createKeyRequest);

    /**
     * <p>
     * Creates a customer master key. Customer master keys can be used to
     * encrypt small amounts of data (less than 4K) directly, but they are most
     * commonly used to encrypt or envelope data keys that are then used to
     * encrypt customer data. For more information about data keys, see
     * <a>GenerateDataKey</a> and <a>GenerateDataKeyWithoutPlaintext</a>.
     * </p>
     * 
     * @param createKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKey operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.CreateKey
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            CreateKeyRequest createKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateKey operation.
     *
     * @see #createKeyAsync(CreateKeyRequest)
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync();

    /**
     * Simplified method form for invoking the CreateKey operation with an
     * AsyncHandler.
     *
     * @see #createKeyAsync(CreateKeyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler);

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using any of the following functions:
     * <ul>
     * <li><a>GenerateDataKey</a></li>
     * <li><a>GenerateDataKeyWithoutPlaintext</a></li>
     * <li><a>Encrypt</a></li>
     * </ul>
     * </p>
     * <p>
     * Note that if a caller has been granted access permissions to all keys
     * (through, for example, IAM user policies that grant <code>Decrypt</code>
     * permission on all resources), then ciphertext encrypted by using keys in
     * other accounts where the key grants access to the caller can be
     * decrypted. To remedy this, we recommend that you do not grant
     * <code>Decrypt</code> access in an IAM user policy. Instead grant
     * <code>Decrypt</code> access only in key policies. If you must grant
     * <code>Decrypt</code> access in an IAM user policy, you should scope the
     * resource to specific keys or to specific trusted accounts.
     * </p>
     * 
     * @param decryptRequest
     * @return A Java Future containing the result of the Decrypt operation
     *         returned by the service.
     * @sample AWSKMSAsync.Decrypt
     */
    java.util.concurrent.Future<DecryptResult> decryptAsync(
            DecryptRequest decryptRequest);

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using any of the following functions:
     * <ul>
     * <li><a>GenerateDataKey</a></li>
     * <li><a>GenerateDataKeyWithoutPlaintext</a></li>
     * <li><a>Encrypt</a></li>
     * </ul>
     * </p>
     * <p>
     * Note that if a caller has been granted access permissions to all keys
     * (through, for example, IAM user policies that grant <code>Decrypt</code>
     * permission on all resources), then ciphertext encrypted by using keys in
     * other accounts where the key grants access to the caller can be
     * decrypted. To remedy this, we recommend that you do not grant
     * <code>Decrypt</code> access in an IAM user policy. Instead grant
     * <code>Decrypt</code> access only in key policies. If you must grant
     * <code>Decrypt</code> access in an IAM user policy, you should scope the
     * resource to specific keys or to specific trusted accounts.
     * </p>
     * 
     * @param decryptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Decrypt operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.Decrypt
     */
    java.util.concurrent.Future<DecryptResult> decryptAsync(
            DecryptRequest decryptRequest,
            com.amazonaws.handlers.AsyncHandler<DecryptRequest, DecryptResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @sample AWSKMSAsync.DeleteAlias
     */
    java.util.concurrent.Future<Void> deleteAliasAsync(
            DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.DeleteAlias
     */
    java.util.concurrent.Future<Void> deleteAliasAsync(
            DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, Void> asyncHandler);

    /**
     * <p>
     * Provides detailed information about the specified customer master key.
     * </p>
     * 
     * @param describeKeyRequest
     * @return A Java Future containing the result of the DescribeKey operation
     *         returned by the service.
     * @sample AWSKMSAsync.DescribeKey
     */
    java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(
            DescribeKeyRequest describeKeyRequest);

    /**
     * <p>
     * Provides detailed information about the specified customer master key.
     * </p>
     * 
     * @param describeKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeKey operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.DescribeKey
     */
    java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(
            DescribeKeyRequest describeKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler);

    /**
     * <p>
     * Sets the state of a master key to disabled, thereby preventing its use
     * for cryptographic operations. For more information about how key state
     * affects the use of a master key, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @sample AWSKMSAsync.DisableKey
     */
    java.util.concurrent.Future<Void> disableKeyAsync(
            DisableKeyRequest disableKeyRequest);

    /**
     * <p>
     * Sets the state of a master key to disabled, thereby preventing its use
     * for cryptographic operations. For more information about how key state
     * affects the use of a master key, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.DisableKey
     */
    java.util.concurrent.Future<Void> disableKeyAsync(
            DisableKeyRequest disableKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRequest, Void> asyncHandler);

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @sample AWSKMSAsync.DisableKeyRotation
     */
    java.util.concurrent.Future<Void> disableKeyRotationAsync(
            DisableKeyRotationRequest disableKeyRotationRequest);

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.DisableKeyRotation
     */
    java.util.concurrent.Future<Void> disableKeyRotationAsync(
            DisableKeyRotationRequest disableKeyRotationRequest,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRotationRequest, Void> asyncHandler);

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     * 
     * @param enableKeyRequest
     * @sample AWSKMSAsync.EnableKey
     */
    java.util.concurrent.Future<Void> enableKeyAsync(
            EnableKeyRequest enableKeyRequest);

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     * 
     * @param enableKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.EnableKey
     */
    java.util.concurrent.Future<Void> enableKeyAsync(
            EnableKeyRequest enableKeyRequest,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRequest, Void> asyncHandler);

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @sample AWSKMSAsync.EnableKeyRotation
     */
    java.util.concurrent.Future<Void> enableKeyRotationAsync(
            EnableKeyRotationRequest enableKeyRotationRequest);

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.EnableKeyRotation
     */
    java.util.concurrent.Future<Void> enableKeyRotationAsync(
            EnableKeyRotationRequest enableKeyRotationRequest,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRotationRequest, Void> asyncHandler);

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key. The
     * <code>Encrypt</code> function has two primary use cases:
     * <ul>
     * <li>You can encrypt up to 4 KB of arbitrary data such as an RSA key, a
     * database password, or other sensitive customer information.</li>
     * <li>If you are moving encrypted data from one region to another, you can
     * use this API to encrypt in the new region the plaintext data key that was
     * used to encrypt the data in the original region. This provides you with
     * an encrypted copy of the data key that can be decrypted in the new region
     * and used there to decrypt the encrypted data.</li>
     * </ul>
     * </p>
     * <p>
     * Unless you are moving encrypted data from one region to another, you
     * don't use this function to encrypt a generated data key within a region.
     * You retrieve data keys already encrypted by calling the
     * <a>GenerateDataKey</a> or <a>GenerateDataKeyWithoutPlaintext</a>
     * function. Data keys don't need to be encrypted again by calling
     * <code>Encrypt</code>.
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use the
     * <code>GenerateDataKey</code> function to return a plaintext data
     * encryption key and a copy of the key encrypted under the customer master
     * key (CMK) of your choosing.
     * </p>
     * 
     * @param encryptRequest
     * @return A Java Future containing the result of the Encrypt operation
     *         returned by the service.
     * @sample AWSKMSAsync.Encrypt
     */
    java.util.concurrent.Future<EncryptResult> encryptAsync(
            EncryptRequest encryptRequest);

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key. The
     * <code>Encrypt</code> function has two primary use cases:
     * <ul>
     * <li>You can encrypt up to 4 KB of arbitrary data such as an RSA key, a
     * database password, or other sensitive customer information.</li>
     * <li>If you are moving encrypted data from one region to another, you can
     * use this API to encrypt in the new region the plaintext data key that was
     * used to encrypt the data in the original region. This provides you with
     * an encrypted copy of the data key that can be decrypted in the new region
     * and used there to decrypt the encrypted data.</li>
     * </ul>
     * </p>
     * <p>
     * Unless you are moving encrypted data from one region to another, you
     * don't use this function to encrypt a generated data key within a region.
     * You retrieve data keys already encrypted by calling the
     * <a>GenerateDataKey</a> or <a>GenerateDataKeyWithoutPlaintext</a>
     * function. Data keys don't need to be encrypted again by calling
     * <code>Encrypt</code>.
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use the
     * <code>GenerateDataKey</code> function to return a plaintext data
     * encryption key and a copy of the key encrypted under the customer master
     * key (CMK) of your choosing.
     * </p>
     * 
     * @param encryptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Encrypt operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.Encrypt
     */
    java.util.concurrent.Future<EncryptResult> encryptAsync(
            EncryptRequest encryptRequest,
            com.amazonaws.handlers.AsyncHandler<EncryptRequest, EncryptResult> asyncHandler);

    /**
     * <p>
     * Generates a data key that you can use in your application to locally
     * encrypt data. This call returns a plaintext version of the key in the
     * <code>Plaintext</code> field of the response object and an encrypted copy
     * of the key in the <code>CiphertextBlob</code> field. The key is encrypted
     * by using the master key specified by the <code>KeyId</code> field. To
     * decrypt the encrypted key, pass it to the <code>Decrypt</code> API.
     * </p>
     * <p>
     * We recommend that you use the following pattern to locally encrypt data:
     * call the <code>GenerateDataKey</code> API, use the key returned in the
     * <code>Plaintext</code> response field to locally encrypt data, and then
     * erase the plaintext data key from memory. Store the encrypted data key
     * (contained in the <code>CiphertextBlob</code> field) alongside of the
     * locally encrypted data.
     * </p>
     * <note>You should not call the <code>Encrypt</code> function to re-encrypt
     * your data keys within a region. <code>GenerateDataKey</code> always
     * returns the data key encrypted and tied to the customer master key that
     * will be used to decrypt it. There is no need to decrypt it twice. </note>
     * <p>
     * If you decide to use the optional <code>EncryptionContext</code>
     * parameter, you must also store the context in full or at least store
     * enough information along with the encrypted data to be able to
     * reconstruct the context when submitting the ciphertext to the
     * <code>Decrypt</code> API. It is a good practice to choose a context that
     * you can reconstruct on the fly to better secure the ciphertext. For more
     * information about how this parameter is used, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     * >Encryption Context</a>.
     * </p>
     * <p>
     * To decrypt data, pass the encrypted data key to the <code>Decrypt</code>
     * API. <code>Decrypt</code> uses the associated master key to decrypt the
     * encrypted data key and returns it as plaintext. Use the plaintext data
     * key to locally decrypt your data and then erase the key from memory. You
     * must specify the encryption context, if any, that you specified when you
     * generated the key. The encryption context is logged by CloudTrail, and
     * you can use this log to help track the use of particular data.
     * </p>
     * 
     * @param generateDataKeyRequest
     * @return A Java Future containing the result of the GenerateDataKey
     *         operation returned by the service.
     * @sample AWSKMSAsync.GenerateDataKey
     */
    java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(
            GenerateDataKeyRequest generateDataKeyRequest);

    /**
     * <p>
     * Generates a data key that you can use in your application to locally
     * encrypt data. This call returns a plaintext version of the key in the
     * <code>Plaintext</code> field of the response object and an encrypted copy
     * of the key in the <code>CiphertextBlob</code> field. The key is encrypted
     * by using the master key specified by the <code>KeyId</code> field. To
     * decrypt the encrypted key, pass it to the <code>Decrypt</code> API.
     * </p>
     * <p>
     * We recommend that you use the following pattern to locally encrypt data:
     * call the <code>GenerateDataKey</code> API, use the key returned in the
     * <code>Plaintext</code> response field to locally encrypt data, and then
     * erase the plaintext data key from memory. Store the encrypted data key
     * (contained in the <code>CiphertextBlob</code> field) alongside of the
     * locally encrypted data.
     * </p>
     * <note>You should not call the <code>Encrypt</code> function to re-encrypt
     * your data keys within a region. <code>GenerateDataKey</code> always
     * returns the data key encrypted and tied to the customer master key that
     * will be used to decrypt it. There is no need to decrypt it twice. </note>
     * <p>
     * If you decide to use the optional <code>EncryptionContext</code>
     * parameter, you must also store the context in full or at least store
     * enough information along with the encrypted data to be able to
     * reconstruct the context when submitting the ciphertext to the
     * <code>Decrypt</code> API. It is a good practice to choose a context that
     * you can reconstruct on the fly to better secure the ciphertext. For more
     * information about how this parameter is used, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     * >Encryption Context</a>.
     * </p>
     * <p>
     * To decrypt data, pass the encrypted data key to the <code>Decrypt</code>
     * API. <code>Decrypt</code> uses the associated master key to decrypt the
     * encrypted data key and returns it as plaintext. Use the plaintext data
     * key to locally decrypt your data and then erase the key from memory. You
     * must specify the encryption context, if any, that you specified when you
     * generated the key. The encryption context is logged by CloudTrail, and
     * you can use this log to help track the use of particular data.
     * </p>
     * 
     * @param generateDataKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateDataKey
     *         operation returned by the service.
     * @sample AWSKMSAsyncHandler.GenerateDataKey
     */
    java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(
            GenerateDataKeyRequest generateDataKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler);

    /**
     * <p>
     * Returns a data key encrypted by a customer master key without the
     * plaintext copy of that key. Otherwise, this API functions exactly like
     * <a>GenerateDataKey</a>. You can use this API to, for example, satisfy an
     * audit requirement that an encrypted key be made available without
     * exposing the plaintext copy of that key.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @return A Java Future containing the result of the
     *         GenerateDataKeyWithoutPlaintext operation returned by the
     *         service.
     * @sample AWSKMSAsync.GenerateDataKeyWithoutPlaintext
     */
    java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest);

    /**
     * <p>
     * Returns a data key encrypted by a customer master key without the
     * plaintext copy of that key. Otherwise, this API functions exactly like
     * <a>GenerateDataKey</a>. You can use this API to, for example, satisfy an
     * audit requirement that an encrypted key be made available without
     * exposing the plaintext copy of that key.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GenerateDataKeyWithoutPlaintext operation returned by the
     *         service.
     * @sample AWSKMSAsyncHandler.GenerateDataKeyWithoutPlaintext
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
     * @return A Java Future containing the result of the GenerateRandom
     *         operation returned by the service.
     * @sample AWSKMSAsync.GenerateRandom
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            GenerateRandomRequest generateRandomRequest);

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @param generateRandomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateRandom
     *         operation returned by the service.
     * @sample AWSKMSAsyncHandler.GenerateRandom
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            GenerateRandomRequest generateRandomRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler);

    /**
     * Simplified method form for invoking the GenerateRandom operation.
     *
     * @see #generateRandomAsync(GenerateRandomRequest)
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync();

    /**
     * Simplified method form for invoking the GenerateRandom operation with an
     * AsyncHandler.
     *
     * @see #generateRandomAsync(GenerateRandomRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler);

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @return A Java Future containing the result of the GetKeyPolicy operation
     *         returned by the service.
     * @sample AWSKMSAsync.GetKeyPolicy
     */
    java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(
            GetKeyPolicyRequest getKeyPolicyRequest);

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPolicy operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.GetKeyPolicy
     */
    java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(
            GetKeyPolicyRequest getKeyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is enabled
     * for the specified key.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @return A Java Future containing the result of the GetKeyRotationStatus
     *         operation returned by the service.
     * @sample AWSKMSAsync.GetKeyRotationStatus
     */
    java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(
            GetKeyRotationStatusRequest getKeyRotationStatusRequest);

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is enabled
     * for the specified key.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyRotationStatus
     *         operation returned by the service.
     * @sample AWSKMSAsyncHandler.GetKeyRotationStatus
     */
    java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(
            GetKeyRotationStatusRequest getKeyRotationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler);

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation
     *         returned by the service.
     * @sample AWSKMSAsync.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @param listAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAliases operation.
     *
     * @see #listAliasesAsync(ListAliasesRequest)
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync();

    /**
     * Simplified method form for invoking the ListAliases operation with an
     * AsyncHandler.
     *
     * @see #listAliasesAsync(ListAliasesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     * 
     * @param listGrantsRequest
     * @return A Java Future containing the result of the ListGrants operation
     *         returned by the service.
     * @sample AWSKMSAsync.ListGrants
     */
    java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(
            ListGrantsRequest listGrantsRequest);

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     * 
     * @param listGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGrants operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.ListGrants
     */
    java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(
            ListGrantsRequest listGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @return A Java Future containing the result of the ListKeyPolicies
     *         operation returned by the service.
     * @sample AWSKMSAsync.ListKeyPolicies
     */
    java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(
            ListKeyPoliciesRequest listKeyPoliciesRequest);

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeyPolicies
     *         operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListKeyPolicies
     */
    java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(
            ListKeyPoliciesRequest listKeyPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @param listKeysRequest
     * @return A Java Future containing the result of the ListKeys operation
     *         returned by the service.
     * @sample AWSKMSAsync.ListKeys
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            ListKeysRequest listKeysRequest);

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @param listKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeys operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.ListKeys
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            ListKeysRequest listKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListKeys operation.
     *
     * @see #listKeysAsync(ListKeysRequest)
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync();

    /**
     * Simplified method form for invoking the ListKeys operation with an
     * AsyncHandler.
     *
     * @see #listKeysAsync(ListKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all grants for which the grant's
     * <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To
     * retire a grant, use <a>RetireGrant</a>.
     * </p>
     * 
     * @param listRetirableGrantsRequest
     * @return A Java Future containing the result of the ListRetirableGrants
     *         operation returned by the service.
     * @sample AWSKMSAsync.ListRetirableGrants
     */
    java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(
            ListRetirableGrantsRequest listRetirableGrantsRequest);

    /**
     * <p>
     * Returns a list of all grants for which the grant's
     * <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To
     * retire a grant, use <a>RetireGrant</a>.
     * </p>
     * 
     * @param listRetirableGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRetirableGrants
     *         operation returned by the service.
     * @sample AWSKMSAsyncHandler.ListRetirableGrants
     */
    java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(
            ListRetirableGrantsRequest listRetirableGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler);

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @sample AWSKMSAsync.PutKeyPolicy
     */
    java.util.concurrent.Future<Void> putKeyPolicyAsync(
            PutKeyPolicyRequest putKeyPolicyRequest);

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.PutKeyPolicy
     */
    java.util.concurrent.Future<Void> putKeyPolicyAsync(
            PutKeyPolicyRequest putKeyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutKeyPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key without
     * exposing the plaintext of the data on the client side. The data is first
     * decrypted and then encrypted. This operation can also be used to change
     * the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other actions, <code>ReEncrypt</code> is authorized twice - once
     * as <code>ReEncryptFrom</code> on the source key and once as
     * <code>ReEncryptTo</code> on the destination key. We therefore recommend
     * that you include the <code>"action":"kms:ReEncrypt*"</code> statement in
     * your key policies to permit re-encryption from or to the key. The
     * statement is included automatically when you authorize use of the key
     * through the console but must be included manually when you set a policy
     * by using the <a>PutKeyPolicy</a> function.
     * </p>
     * 
     * @param reEncryptRequest
     * @return A Java Future containing the result of the ReEncrypt operation
     *         returned by the service.
     * @sample AWSKMSAsync.ReEncrypt
     */
    java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(
            ReEncryptRequest reEncryptRequest);

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key without
     * exposing the plaintext of the data on the client side. The data is first
     * decrypted and then encrypted. This operation can also be used to change
     * the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other actions, <code>ReEncrypt</code> is authorized twice - once
     * as <code>ReEncryptFrom</code> on the source key and once as
     * <code>ReEncryptTo</code> on the destination key. We therefore recommend
     * that you include the <code>"action":"kms:ReEncrypt*"</code> statement in
     * your key policies to permit re-encryption from or to the key. The
     * statement is included automatically when you authorize use of the key
     * through the console but must be included manually when you set a policy
     * by using the <a>PutKeyPolicy</a> function.
     * </p>
     * 
     * @param reEncryptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReEncrypt operation
     *         returned by the service.
     * @sample AWSKMSAsyncHandler.ReEncrypt
     */
    java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(
            ReEncryptRequest reEncryptRequest,
            com.amazonaws.handlers.AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler);

    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it. The following are permitted to call this
     * API:
     * <ul>
     * <li>The account that created the grant</li>
     * <li>The <code>RetiringPrincipal</code>, if present</li>
     * <li>The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is a
     * grantee operation</li>
     * </ul>
     * The grant to retire must be identified by its grant token or by a
     * combination of the key ARN and the grant ID. A grant token is a unique
     * variable-length base64-encoded string. A grant ID is a 64 character
     * unique identifier of a grant. Both are returned by the
     * <code>CreateGrant</code> function.
     * </p>
     * 
     * @param retireGrantRequest
     * @sample AWSKMSAsync.RetireGrant
     */
    java.util.concurrent.Future<Void> retireGrantAsync(
            RetireGrantRequest retireGrantRequest);

    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it. The following are permitted to call this
     * API:
     * <ul>
     * <li>The account that created the grant</li>
     * <li>The <code>RetiringPrincipal</code>, if present</li>
     * <li>The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is a
     * grantee operation</li>
     * </ul>
     * The grant to retire must be identified by its grant token or by a
     * combination of the key ARN and the grant ID. A grant token is a unique
     * variable-length base64-encoded string. A grant ID is a 64 character
     * unique identifier of a grant. Both are returned by the
     * <code>CreateGrant</code> function.
     * </p>
     * 
     * @param retireGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.RetireGrant
     */
    java.util.concurrent.Future<Void> retireGrantAsync(
            RetireGrantRequest retireGrantRequest,
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the RetireGrant operation.
     *
     * @see #retireGrantAsync(RetireGrantRequest)
     */
    java.util.concurrent.Future<Void> retireGrantAsync();

    /**
     * Simplified method form for invoking the RetireGrant operation with an
     * AsyncHandler.
     *
     * @see #retireGrantAsync(RetireGrantRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> retireGrantAsync(
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, Void> asyncHandler);

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations that
     * depend on it.
     * </p>
     * 
     * @param revokeGrantRequest
     * @sample AWSKMSAsync.RevokeGrant
     */
    java.util.concurrent.Future<Void> revokeGrantAsync(
            RevokeGrantRequest revokeGrantRequest);

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations that
     * depend on it.
     * </p>
     * 
     * @param revokeGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.RevokeGrant
     */
    java.util.concurrent.Future<Void> revokeGrantAsync(
            RevokeGrantRequest revokeGrantRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeGrantRequest, Void> asyncHandler);

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may provide a
     * waiting period, specified in days, before deletion occurs. If you do not
     * provide a waiting period, the default period of 30 days is used. When
     * this operation is successful, the state of the CMK changes to
     * <code>PendingDeletion</code>. Before the waiting period ends, you can use
     * <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the
     * waiting period ends, AWS KMS deletes the CMK and all AWS KMS data
     * associated with it, including all aliases that point to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When
     * a CMK is deleted, all data that was encrypted under the CMK is rendered
     * unrecoverable. To restrict the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * For more information about scheduling a CMK for deletion, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @return A Java Future containing the result of the ScheduleKeyDeletion
     *         operation returned by the service.
     * @sample AWSKMSAsync.ScheduleKeyDeletion
     */
    java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(
            ScheduleKeyDeletionRequest scheduleKeyDeletionRequest);

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may provide a
     * waiting period, specified in days, before deletion occurs. If you do not
     * provide a waiting period, the default period of 30 days is used. When
     * this operation is successful, the state of the CMK changes to
     * <code>PendingDeletion</code>. Before the waiting period ends, you can use
     * <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the
     * waiting period ends, AWS KMS deletes the CMK and all AWS KMS data
     * associated with it, including all aliases that point to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When
     * a CMK is deleted, all data that was encrypted under the CMK is rendered
     * unrecoverable. To restrict the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * For more information about scheduling a CMK for deletion, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ScheduleKeyDeletion
     *         operation returned by the service.
     * @sample AWSKMSAsyncHandler.ScheduleKeyDeletion
     */
    java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(
            ScheduleKeyDeletionRequest scheduleKeyDeletionRequest,
            com.amazonaws.handlers.AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler);

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be mapped to
     * and unmapped from an existing key without changing the properties of the
     * key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward slashes
     * (/), underscores (_), and dashes (-). An alias must start with the word
     * "alias" followed by a forward slash (alias/). An alias that begins with
     * "aws" after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * 
     * @param updateAliasRequest
     * @sample AWSKMSAsync.UpdateAlias
     */
    java.util.concurrent.Future<Void> updateAliasAsync(
            UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be mapped to
     * and unmapped from an existing key without changing the properties of the
     * key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward slashes
     * (/), underscores (_), and dashes (-). An alias must start with the word
     * "alias" followed by a forward slash (alias/). An alias that begins with
     * "aws" after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * 
     * @param updateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.UpdateAlias
     */
    java.util.concurrent.Future<Void> updateAliasAsync(
            UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @sample AWSKMSAsync.UpdateKeyDescription
     */
    java.util.concurrent.Future<Void> updateKeyDescriptionAsync(
            UpdateKeyDescriptionRequest updateKeyDescriptionRequest);

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSKMSAsyncHandler.UpdateKeyDescription
     */
    java.util.concurrent.Future<Void> updateKeyDescriptionAsync(
            UpdateKeyDescriptionRequest updateKeyDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKeyDescriptionRequest, Void> asyncHandler);

}
