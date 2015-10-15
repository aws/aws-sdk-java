/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.kms.model.*;

/**
 * Interface for accessing AWSKMS asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Key Management Service <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key
 * management web service. This guide describes the AWS KMS operations
 * that you can call programmatically. For general information about AWS
 * KMS, see the
 * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/"> AWS Key Management Service Developer Guide </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b> AWS provides SDKs that consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby,
 * .Net, iOS, Android, etc.). The SDKs provide a convenient way to create
 * programmatic access to AWS KMS and other AWS services. For example,
 * the SDKs take care of tasks such as signing requests (see below),
 * managing errors, and retrying requests automatically. For more
 * information about the AWS SDKs, including how to download and install
 * them, see Tools for Amazon Web Services.
 * </p>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls
 * to AWS KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend
 * TLS 1.2. Clients must also support cipher suites with Perfect Forward
 * Secrecy (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve
 * Ephemeral Diffie-Hellman (ECDHE). Most modern systems such as Java 7
 * and later support these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access
 * key. We strongly recommend that you <i>do not</i> use your AWS account
 * access key ID and secret key for everyday work with AWS KMS. Instead,
 * use the access key ID and secret access key for an IAM user, or you
 * can use the AWS Security Token Service to generate temporary security
 * credentials that you can use to sign requests.
 * </p>
 * <p>
 * All AWS KMS operations require
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 </a>
 * .
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and
 * related events for your AWS account and delivers them to an Amazon S3
 * bucket that you specify. By using the information collected by
 * CloudTrail, you can determine what requests were made to AWS KMS, who
 * made the request, when it was made, and so on. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see
 * the
 * <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/"> AWS CloudTrail User Guide </a>
 * .
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the
 * following:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"> AWS Security Credentials </a>
 * - This topic provides general information about the types of
 * credentials used for accessing AWS. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/"> AWS Security Token Service </a>
 * - This guide describes how to create and use temporary security
 * credentials. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a>
 * - This set of topics walks you through the process of signing a
 * request using an access key ID and a secret access key. </li>
 * 
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the
 * most useful for most applications. You will likely perform actions
 * other than these, such as creating keys and assigning policies, by
 * using the console.
 * </p>
 * 
 * <ul>
 * <li> Encrypt </li>
 * <li> Decrypt </li>
 * <li> GenerateDataKey </li>
 * <li> GenerateDataKeyWithoutPlaintext </li>
 * 
 * </ul>
 */
public interface AWSKMSAsync extends AWSKMS {
    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may
     * provide a waiting period, specified in days, before deletion occurs.
     * If you do not provide a waiting period, the default period of 30 days
     * is used. When this operation is successful, the state of the CMK
     * changes to <code>PendingDeletion</code> . Before the waiting period
     * ends, you can use CancelKeyDeletion to cancel the deletion of the CMK.
     * After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS
     * data associated with it, including all aliases that point to it.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Deleting a CMK is a destructive and potentially
     * dangerous operation. When a CMK is deleted, all data that was
     * encrypted under the CMK is rendered unrecoverable. To restrict the use
     * of a CMK without deleting it, use DisableKey.
     * </p>
     * <p>
     * For more information about scheduling a CMK for deletion, go to
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"> Deleting Customer Master Keys </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param scheduleKeyDeletionRequest Container for the necessary
     *           parameters to execute the ScheduleKeyDeletion operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ScheduleKeyDeletion service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest scheduleKeyDeletionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may
     * provide a waiting period, specified in days, before deletion occurs.
     * If you do not provide a waiting period, the default period of 30 days
     * is used. When this operation is successful, the state of the CMK
     * changes to <code>PendingDeletion</code> . Before the waiting period
     * ends, you can use CancelKeyDeletion to cancel the deletion of the CMK.
     * After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS
     * data associated with it, including all aliases that point to it.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Deleting a CMK is a destructive and potentially
     * dangerous operation. When a CMK is deleted, all data that was
     * encrypted under the CMK is rendered unrecoverable. To restrict the use
     * of a CMK without deleting it, use DisableKey.
     * </p>
     * <p>
     * For more information about scheduling a CMK for deletion, go to
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"> Deleting Customer Master Keys </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param scheduleKeyDeletionRequest Container for the necessary
     *           parameters to execute the ScheduleKeyDeletion operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ScheduleKeyDeletion service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest scheduleKeyDeletionRequest,
            AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a customer master key. Customer master keys can be used to
     * encrypt small amounts of data (less than 4K) directly, but they are
     * most commonly used to encrypt or envelope data keys that are then used
     * to encrypt customer data. For more information about data keys, see
     * GenerateDataKey and GenerateDataKeyWithoutPlaintext.
     * </p>
     *
     * @param createKeyRequest Container for the necessary parameters to
     *           execute the CreateKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateKeyResult> createKeyAsync(CreateKeyRequest createKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a customer master key. Customer master keys can be used to
     * encrypt small amounts of data (less than 4K) directly, but they are
     * most commonly used to encrypt or envelope data keys that are then used
     * to encrypt customer data. For more information about data keys, see
     * GenerateDataKey and GenerateDataKeyWithoutPlaintext.
     * </p>
     *
     * @param createKeyRequest Container for the necessary parameters to
     *           execute the CreateKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateKeyResult> createKeyAsync(CreateKeyRequest createKeyRequest,
            AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key.
     * The <code>Encrypt</code> function has two primary use cases:
     * <ul>
     * <li>You can encrypt up to 4 KB of arbitrary data such as an RSA key,
     * a database password, or other sensitive customer information.</li>
     * <li>If you are moving encrypted data from one region to another, you
     * can use this API to encrypt in the new region the plaintext data key
     * that was used to encrypt the data in the original region. This
     * provides you with an encrypted copy of the data key that can be
     * decrypted in the new region and used there to decrypt the encrypted
     * data. </li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * Unless you are moving encrypted data from one region to another, you
     * don't use this function to encrypt a generated data key within a
     * region. You retrieve data keys already encrypted by calling the
     * GenerateDataKey or GenerateDataKeyWithoutPlaintext function. Data keys
     * don't need to be encrypted again by calling <code>Encrypt</code> .
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use
     * the <code>GenerateDataKey</code> function to return a plaintext data
     * encryption key and a copy of the key encrypted under the customer
     * master key (CMK) of your choosing.
     * </p>
     *
     * @param encryptRequest Container for the necessary parameters to
     *           execute the Encrypt operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the Encrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EncryptResult> encryptAsync(EncryptRequest encryptRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key.
     * The <code>Encrypt</code> function has two primary use cases:
     * <ul>
     * <li>You can encrypt up to 4 KB of arbitrary data such as an RSA key,
     * a database password, or other sensitive customer information.</li>
     * <li>If you are moving encrypted data from one region to another, you
     * can use this API to encrypt in the new region the plaintext data key
     * that was used to encrypt the data in the original region. This
     * provides you with an encrypted copy of the data key that can be
     * decrypted in the new region and used there to decrypt the encrypted
     * data. </li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * Unless you are moving encrypted data from one region to another, you
     * don't use this function to encrypt a generated data key within a
     * region. You retrieve data keys already encrypted by calling the
     * GenerateDataKey or GenerateDataKeyWithoutPlaintext function. Data keys
     * don't need to be encrypted again by calling <code>Encrypt</code> .
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use
     * the <code>GenerateDataKey</code> function to return a plaintext data
     * encryption key and a copy of the key encrypted under the customer
     * master key (CMK) of your choosing.
     * </p>
     *
     * @param encryptRequest Container for the necessary parameters to
     *           execute the Encrypt operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Encrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EncryptResult> encryptAsync(EncryptRequest encryptRequest,
            AsyncHandler<EncryptRequest, EncryptResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     *
     * @param getKeyPolicyRequest Container for the necessary parameters to
     *           execute the GetKeyPolicy operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest getKeyPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     *
     * @param getKeyPolicyRequest Container for the necessary parameters to
     *           execute the GetKeyPolicy operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest getKeyPolicyRequest,
            AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     *
     * @param listKeysRequest Container for the necessary parameters to
     *           execute the ListKeys operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the ListKeys
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     *
     * @param listKeysRequest Container for the necessary parameters to
     *           execute the ListKeys operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ListKeys
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest,
            AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     *
     * @param updateKeyDescriptionRequest Container for the necessary
     *           parameters to execute the UpdateKeyDescription operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateKeyDescription service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest updateKeyDescriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     *
     * @param updateKeyDescriptionRequest Container for the necessary
     *           parameters to execute the UpdateKeyDescription operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateKeyDescription service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest updateKeyDescriptionRequest,
            AsyncHandler<UpdateKeyDescriptionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a data key that you can use in your application to locally
     * encrypt data. This call returns a plaintext version of the key in the
     * <code>Plaintext</code> field of the response object and an encrypted
     * copy of the key in the <code>CiphertextBlob</code> field. The key is
     * encrypted by using the master key specified by the <code>KeyId</code>
     * field. To decrypt the encrypted key, pass it to the
     * <code>Decrypt</code> API.
     * </p>
     * <p>
     * We recommend that you use the following pattern to locally encrypt
     * data: call the <code>GenerateDataKey</code> API, use the key returned
     * in the <code>Plaintext</code> response field to locally encrypt data,
     * and then erase the plaintext data key from memory. Store the encrypted
     * data key (contained in the <code>CiphertextBlob</code> field)
     * alongside of the locally encrypted data.
     * </p>
     * <p>
     * <b>NOTE:</b>You should not call the Encrypt function to re-encrypt
     * your data keys within a region. GenerateDataKey always returns the
     * data key encrypted and tied to the customer master key that will be
     * used to decrypt it. There is no need to decrypt it twice.
     * </p>
     * <p>
     * If you decide to use the optional <code>EncryptionContext</code>
     * parameter, you must also store the context in full or at least store
     * enough information along with the encrypted data to be able to
     * reconstruct the context when submitting the ciphertext to the
     * <code>Decrypt</code> API. It is a good practice to choose a context
     * that you can reconstruct on the fly to better secure the ciphertext.
     * For more information about how this parameter is used, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"> Encryption Context </a>
     * .
     * </p>
     * <p>
     * To decrypt data, pass the encrypted data key to the
     * <code>Decrypt</code> API. <code>Decrypt</code> uses the associated
     * master key to decrypt the encrypted data key and returns it as
     * plaintext. Use the plaintext data key to locally decrypt your data and
     * then erase the key from memory. You must specify the encryption
     * context, if any, that you specified when you generated the key. The
     * encryption context is logged by CloudTrail, and you can use this log
     * to help track the use of particular data.
     * </p>
     *
     * @param generateDataKeyRequest Container for the necessary parameters
     *           to execute the GenerateDataKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest generateDataKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a data key that you can use in your application to locally
     * encrypt data. This call returns a plaintext version of the key in the
     * <code>Plaintext</code> field of the response object and an encrypted
     * copy of the key in the <code>CiphertextBlob</code> field. The key is
     * encrypted by using the master key specified by the <code>KeyId</code>
     * field. To decrypt the encrypted key, pass it to the
     * <code>Decrypt</code> API.
     * </p>
     * <p>
     * We recommend that you use the following pattern to locally encrypt
     * data: call the <code>GenerateDataKey</code> API, use the key returned
     * in the <code>Plaintext</code> response field to locally encrypt data,
     * and then erase the plaintext data key from memory. Store the encrypted
     * data key (contained in the <code>CiphertextBlob</code> field)
     * alongside of the locally encrypted data.
     * </p>
     * <p>
     * <b>NOTE:</b>You should not call the Encrypt function to re-encrypt
     * your data keys within a region. GenerateDataKey always returns the
     * data key encrypted and tied to the customer master key that will be
     * used to decrypt it. There is no need to decrypt it twice.
     * </p>
     * <p>
     * If you decide to use the optional <code>EncryptionContext</code>
     * parameter, you must also store the context in full or at least store
     * enough information along with the encrypted data to be able to
     * reconstruct the context when submitting the ciphertext to the
     * <code>Decrypt</code> API. It is a good practice to choose a context
     * that you can reconstruct on the fly to better secure the ciphertext.
     * For more information about how this parameter is used, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"> Encryption Context </a>
     * .
     * </p>
     * <p>
     * To decrypt data, pass the encrypted data key to the
     * <code>Decrypt</code> API. <code>Decrypt</code> uses the associated
     * master key to decrypt the encrypted data key and returns it as
     * plaintext. Use the plaintext data key to locally decrypt your data and
     * then erase the key from memory. You must specify the encryption
     * context, if any, that you specified when you generated the key. The
     * encryption context is logged by CloudTrail, and you can use this log
     * to help track the use of particular data.
     * </p>
     *
     * @param generateDataKeyRequest Container for the necessary parameters
     *           to execute the GenerateDataKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest generateDataKeyRequest,
            AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a grant to a key to specify who can use the key and under what
     * conditions. Grants are alternate permission mechanisms to key
     * policies.
     * </p>
     * <p>
     * For more information about grants, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"> Grants </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param createGrantRequest Container for the necessary parameters to
     *           execute the CreateGrant operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateGrantResult> createGrantAsync(CreateGrantRequest createGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a grant to a key to specify who can use the key and under what
     * conditions. Grants are alternate permission mechanisms to key
     * policies.
     * </p>
     * <p>
     * For more information about grants, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"> Grants </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param createGrantRequest Container for the necessary parameters to
     *           execute the CreateGrant operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateGrantResult> createGrantAsync(CreateGrantRequest createGrantRequest,
            AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a data key encrypted by a customer master key without the
     * plaintext copy of that key. Otherwise, this API functions exactly like
     * GenerateDataKey. You can use this API to, for example, satisfy an
     * audit requirement that an encrypted key be made available without
     * exposing the plaintext copy of that key.
     * </p>
     *
     * @param generateDataKeyWithoutPlaintextRequest Container for the
     *           necessary parameters to execute the GenerateDataKeyWithoutPlaintext
     *           operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKeyWithoutPlaintext service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a data key encrypted by a customer master key without the
     * plaintext copy of that key. Otherwise, this API functions exactly like
     * GenerateDataKey. You can use this API to, for example, satisfy an
     * audit requirement that an encrypted key be made available without
     * exposing the plaintext copy of that key.
     * </p>
     *
     * @param generateDataKeyWithoutPlaintextRequest Container for the
     *           necessary parameters to execute the GenerateDataKeyWithoutPlaintext
     *           operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKeyWithoutPlaintext service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest,
            AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call
     * UpdateAlias.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call
     * UpdateAlias.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            AsyncHandler<DeleteAliasRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be
     * mapped to and unmapped from an existing key without changing the
     * properties of the key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward
     * slashes (/), underscores (_), and dashes (-). An alias must start with
     * the word "alias" followed by a forward slash (alias/). An alias that
     * begins with "aws" after the forward slash (alias/aws...) is reserved
     * by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account
     * and the same region.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAliasAsync(UpdateAliasRequest updateAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be
     * mapped to and unmapped from an existing key without changing the
     * properties of the key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward
     * slashes (/), underscores (_), and dashes (-). An alias must start with
     * the word "alias" followed by a forward slash (alias/). An alias that
     * begins with "aws" after the forward slash (alias/aws...) is reserved
     * by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account
     * and the same region.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            AsyncHandler<UpdateAliasRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     *
     * @param enableKeyRotationRequest Container for the necessary parameters
     *           to execute the EnableKeyRotation operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyRotationAsync(EnableKeyRotationRequest enableKeyRotationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     *
     * @param enableKeyRotationRequest Container for the necessary parameters
     *           to execute the EnableKeyRotation operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyRotationAsync(EnableKeyRotationRequest enableKeyRotationRequest,
            AsyncHandler<EnableKeyRotationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of all grants for which the grant's
     * <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To
     * retire a grant, use RetireGrant.
     * </p>
     *
     * @param listRetirableGrantsRequest Container for the necessary
     *           parameters to execute the ListRetirableGrants operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ListRetirableGrants service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest listRetirableGrantsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of all grants for which the grant's
     * <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To
     * retire a grant, use RetireGrant.
     * </p>
     *
     * @param listRetirableGrantsRequest Container for the necessary
     *           parameters to execute the ListRetirableGrants operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListRetirableGrants service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest listRetirableGrantsRequest,
            AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it. The following are permitted to call this
     * API:
     * <ul>
     * <li>The account that created the grant</li>
     * <li>The <code>RetiringPrincipal</code> , if present</li>
     * <li>The <code>GranteePrincipal</code> , if <code>RetireGrant</code>
     * is a grantee operation</li>
     * 
     * </ul>
     * The grant to retire must be identified by its grant token or by a
     * combination of the key ARN and the grant ID. A grant token is a unique
     * variable-length base64-encoded string. A grant ID is a 64 character
     * unique identifier of a grant. Both are returned by the
     * <code>CreateGrant</code> function.
     * </p>
     *
     * @param retireGrantRequest Container for the necessary parameters to
     *           execute the RetireGrant operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         RetireGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> retireGrantAsync(RetireGrantRequest retireGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it. The following are permitted to call this
     * API:
     * <ul>
     * <li>The account that created the grant</li>
     * <li>The <code>RetiringPrincipal</code> , if present</li>
     * <li>The <code>GranteePrincipal</code> , if <code>RetireGrant</code>
     * is a grantee operation</li>
     * 
     * </ul>
     * The grant to retire must be identified by its grant token or by a
     * combination of the key ARN and the grant ID. A grant token is a unique
     * variable-length base64-encoded string. A grant ID is a 64 character
     * unique identifier of a grant. Both are returned by the
     * <code>CreateGrant</code> function.
     * </p>
     *
     * @param retireGrantRequest Container for the necessary parameters to
     *           execute the RetireGrant operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RetireGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> retireGrantAsync(RetireGrantRequest retireGrantRequest,
            AsyncHandler<RetireGrantRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides detailed information about the specified customer master
     * key.
     * </p>
     *
     * @param describeKeyRequest Container for the necessary parameters to
     *           execute the DescribeKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest describeKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides detailed information about the specified customer master
     * key.
     * </p>
     *
     * @param describeKeyRequest Container for the necessary parameters to
     *           execute the DescribeKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest describeKeyRequest,
            AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     *
     * @param listGrantsRequest Container for the necessary parameters to
     *           execute the ListGrants operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ListGrants service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest listGrantsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     *
     * @param listGrantsRequest Container for the necessary parameters to
     *           execute the ListGrants operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListGrants service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest listGrantsRequest,
            AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     *
     * @param generateRandomRequest Container for the necessary parameters to
     *           execute the GenerateRandom operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateRandom service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest generateRandomRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     *
     * @param generateRandomRequest Container for the necessary parameters to
     *           execute the GenerateRandom operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateRandom service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest generateRandomRequest,
            AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using any of the following functions:
     * <ul>
     * <li> GenerateDataKey </li>
     * <li> GenerateDataKeyWithoutPlaintext </li>
     * <li> Encrypt </li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * Note that if a caller has been granted access permissions to all keys
     * (through, for example, IAM user policies that grant
     * <code>Decrypt</code> permission on all resources), then ciphertext
     * encrypted by using keys in other accounts where the key grants access
     * to the caller can be decrypted. To remedy this, we recommend that you
     * do not grant <code>Decrypt</code> access in an IAM user policy.
     * Instead grant <code>Decrypt</code> access only in key policies. If you
     * must grant <code>Decrypt</code> access in an IAM user policy, you
     * should scope the resource to specific keys or to specific trusted
     * accounts.
     * </p>
     *
     * @param decryptRequest Container for the necessary parameters to
     *           execute the Decrypt operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the Decrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DecryptResult> decryptAsync(DecryptRequest decryptRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using any of the following functions:
     * <ul>
     * <li> GenerateDataKey </li>
     * <li> GenerateDataKeyWithoutPlaintext </li>
     * <li> Encrypt </li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * Note that if a caller has been granted access permissions to all keys
     * (through, for example, IAM user policies that grant
     * <code>Decrypt</code> permission on all resources), then ciphertext
     * encrypted by using keys in other accounts where the key grants access
     * to the caller can be decrypted. To remedy this, we recommend that you
     * do not grant <code>Decrypt</code> access in an IAM user policy.
     * Instead grant <code>Decrypt</code> access only in key policies. If you
     * must grant <code>Decrypt</code> access in an IAM user policy, you
     * should scope the resource to specific keys or to specific trusted
     * accounts.
     * </p>
     *
     * @param decryptRequest Container for the necessary parameters to
     *           execute the Decrypt operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Decrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DecryptResult> decryptAsync(DecryptRequest decryptRequest,
            AsyncHandler<DecryptRequest, DecryptResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is
     * enabled for the specified key.
     * </p>
     *
     * @param getKeyRotationStatusRequest Container for the necessary
     *           parameters to execute the GetKeyRotationStatus operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyRotationStatus service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest getKeyRotationStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is
     * enabled for the specified key.
     * </p>
     *
     * @param getKeyRotationStatusRequest Container for the necessary
     *           parameters to execute the GetKeyRotationStatus operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyRotationStatus service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest getKeyRotationStatusRequest,
            AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     *
     * @param listKeyPoliciesRequest Container for the necessary parameters
     *           to execute the ListKeyPolicies operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ListKeyPolicies service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest listKeyPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     *
     * @param listKeyPoliciesRequest Container for the necessary parameters
     *           to execute the ListKeyPolicies operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListKeyPolicies service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest listKeyPoliciesRequest,
            AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     *
     * @param disableKeyRotationRequest Container for the necessary
     *           parameters to execute the DisableKeyRotation operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyRotationAsync(DisableKeyRotationRequest disableKeyRotationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     *
     * @param disableKeyRotationRequest Container for the necessary
     *           parameters to execute the DisableKeyRotation operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyRotationAsync(DisableKeyRotationRequest disableKeyRotationRequest,
            AsyncHandler<DisableKeyRotationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be
     * used to identify a key and should be unique. The console enforces a
     * one-to-one mapping between the alias and a key. An alias name can
     * contain only alphanumeric characters, forward slashes (/), underscores
     * (_), and dashes (-). An alias must start with the word "alias"
     * followed by a forward slash (alias/). An alias that begins with "aws"
     * after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account
     * and the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call UpdateAlias.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAliasAsync(CreateAliasRequest createAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be
     * used to identify a key and should be unique. The console enforces a
     * one-to-one mapping between the alias and a key. An alias name can
     * contain only alphanumeric characters, forward slashes (/), underscores
     * (_), and dashes (-). An alias must start with the word "alias"
     * followed by a forward slash (alias/). An alias that begins with "aws"
     * after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account
     * and the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call UpdateAlias.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAliasAsync(CreateAliasRequest createAliasRequest,
            AsyncHandler<CreateAliasRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this
     * operation is successful, the CMK is set to the <code>Disabled</code>
     * state. To enable a CMK, use EnableKey.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a
     * CMK, go to
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"> Deleting Customer Master Keys </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param cancelKeyDeletionRequest Container for the necessary parameters
     *           to execute the CancelKeyDeletion operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         CancelKeyDeletion service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest cancelKeyDeletionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this
     * operation is successful, the CMK is set to the <code>Disabled</code>
     * state. To enable a CMK, use EnableKey.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a
     * CMK, go to
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"> Deleting Customer Master Keys </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param cancelKeyDeletionRequest Container for the necessary parameters
     *           to execute the CancelKeyDeletion operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelKeyDeletion service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest cancelKeyDeletionRequest,
            AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations
     * that depend on it.
     * </p>
     *
     * @param revokeGrantRequest Container for the necessary parameters to
     *           execute the RevokeGrant operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeGrantAsync(RevokeGrantRequest revokeGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations
     * that depend on it.
     * </p>
     *
     * @param revokeGrantRequest Container for the necessary parameters to
     *           execute the RevokeGrant operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeGrantAsync(RevokeGrantRequest revokeGrantRequest,
            AsyncHandler<RevokeGrantRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     *
     * @param putKeyPolicyRequest Container for the necessary parameters to
     *           execute the PutKeyPolicy operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         PutKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putKeyPolicyAsync(PutKeyPolicyRequest putKeyPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     *
     * @param putKeyPolicyRequest Container for the necessary parameters to
     *           execute the PutKeyPolicy operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putKeyPolicyAsync(PutKeyPolicyRequest putKeyPolicyRequest,
            AsyncHandler<PutKeyPolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     *
     * @param enableKeyRequest Container for the necessary parameters to
     *           execute the EnableKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyAsync(EnableKeyRequest enableKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     *
     * @param enableKeyRequest Container for the necessary parameters to
     *           execute the EnableKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyAsync(EnableKeyRequest enableKeyRequest,
            AsyncHandler<EnableKeyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the state of a master key to disabled, thereby preventing its
     * use for cryptographic operations. For more information about how key
     * state affects the use of a master key, go to
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"> How Key State Affects the Use of a Customer Master Key </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param disableKeyRequest Container for the necessary parameters to
     *           execute the DisableKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyAsync(DisableKeyRequest disableKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the state of a master key to disabled, thereby preventing its
     * use for cryptographic operations. For more information about how key
     * state affects the use of a master key, go to
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"> How Key State Affects the Use of a Customer Master Key </a>
     * in the <i>AWS Key Management Service Developer Guide</i> .
     * </p>
     *
     * @param disableKeyRequest Container for the necessary parameters to
     *           execute the DisableKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyAsync(DisableKeyRequest disableKeyRequest,
            AsyncHandler<DisableKeyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key
     * without exposing the plaintext of the data on the client side. The
     * data is first decrypted and then encrypted. This operation can also be
     * used to change the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other actions, <code>ReEncrypt</code> is authorized twice -
     * once as <code>ReEncryptFrom</code> on the source key and once as
     * <code>ReEncryptTo</code> on the destination key. We therefore
     * recommend that you include the <code>"action":"kms:ReEncrypt*"</code>
     * statement in your key policies to permit re-encryption from or to the
     * key. The statement is included automatically when you authorize use of
     * the key through the console but must be included manually when you set
     * a policy by using the PutKeyPolicy function.
     * </p>
     *
     * @param reEncryptRequest Container for the necessary parameters to
     *           execute the ReEncrypt operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ReEncrypt service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest reEncryptRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key
     * without exposing the plaintext of the data on the client side. The
     * data is first decrypted and then encrypted. This operation can also be
     * used to change the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other actions, <code>ReEncrypt</code> is authorized twice -
     * once as <code>ReEncryptFrom</code> on the source key and once as
     * <code>ReEncryptTo</code> on the destination key. We therefore
     * recommend that you include the <code>"action":"kms:ReEncrypt*"</code>
     * statement in your key policies to permit re-encryption from or to the
     * key. The statement is included automatically when you authorize use of
     * the key through the console but must be included manually when you set
     * a policy by using the PutKeyPolicy function.
     * </p>
     *
     * @param reEncryptRequest Container for the necessary parameters to
     *           execute the ReEncrypt operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReEncrypt service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest reEncryptRequest,
            AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        