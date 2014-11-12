/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Key Management Service (KMS) is an encryption and key management
 * web service. This guide describes the KMS actions that you can call
 * programmatically. For general information about KMS, see (need an
 * address here). For the KMS developer guide, see (need address here).
 * </p>
 * <p>
 * <b>NOTE:</b> AWS provides SDKs that consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby,
 * .Net, iOS, Android, etc.). The SDKs provide a convenient way to create
 * programmatic access to KMS and AWS. For example, the SDKs take care of
 * tasks such as signing requests (see below), managing errors, and
 * retrying requests automatically. For more information about the AWS
 * SDKs, including how to download and install them, see Tools for Amazon
 * Web Services.
 * </p>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls
 * to KMS. However, you can also use the KMS Query API to make to make
 * direct calls to the KMS web service.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access
 * key. We strongly recommend that you do not use your AWS account access
 * key ID and secret key for everyday work with KMS. Instead, use the
 * access key ID and secret access key for an IAM user, or you can use
 * the AWS Security Token Service to generate temporary security
 * credentials that you can use to sign requests.
 * </p>
 * <p>
 * All KMS operations require
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 </a>
 * .
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * KMS supports AWS CloudTrail, a service that records AWS API calls and
 * related events for your AWS account and delivers them to an Amazon S3
 * bucket that you specify. By using the information collected by
 * CloudTrail, you can determine what requests were made to KMS, who made
 * the request, when it was made, and so on. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see
 * the
 * <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/whatiscloudtrail.html"> AWS CloudTrail User Guide </a>
 * 
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
 * . This topic provides general information about the types of
 * credentials used for accessing AWS. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/"> AWS Security Token Service </a>
 * . This guide describes how to create and use temporary security
 * credentials. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a>
 * . This set of topics walks you through the process of signing a
 * request using an access key ID and a secret access key. </li>
 * 
 * </ul>
 */
public interface AWSKMSAsync extends AWSKMS {
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
     * Generates a secure data key. Data keys are used to encrypt and
     * decrypt data. They are wrapped by customer master keys.
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
     * Generates a secure data key. Data keys are used to encrypt and
     * decrypt data. They are wrapped by customer master keys.
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
     * Adds a grant to a key to specify who can access the key and under
     * what conditions. Grants are alternate permission mechanisms to key
     * policies. If absent, access to the key is evaluated based on IAM
     * policies attached to the user. By default, grants do not expire.
     * Grants can be listed, retired, or revoked as indicated by the
     * following APIs. Typically, when you are finished using a grant, you
     * retire it. When you want to end a grant immediately, revoke it. For
     * more information about grants, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"> Grants </a>
     * . <ol> <li> ListGrants </li>
     * <li> RetireGrant </li>
     * <li> RevokeGrant </li>
     * </ol>
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
     * Adds a grant to a key to specify who can access the key and under
     * what conditions. Grants are alternate permission mechanisms to key
     * policies. If absent, access to the key is evaluated based on IAM
     * policies attached to the user. By default, grants do not expire.
     * Grants can be listed, retired, or revoked as indicated by the
     * following APIs. Typically, when you are finished using a grant, you
     * retire it. When you want to end a grant immediately, revoke it. For
     * more information about grants, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"> Grants </a>
     * . <ol> <li> ListGrants </li>
     * <li> RetireGrant </li>
     * <li> RevokeGrant </li>
     * </ol>
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
     * Returns a key wrapped by a customer master key without the plaintext
     * copy of that key. To retrieve the plaintext, see GenerateDataKey.
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
     * Returns a key wrapped by a customer master key without the plaintext
     * copy of that key. To retrieve the plaintext, see GenerateDataKey.
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
     * Deletes the specified alias.
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
     * Deletes the specified alias.
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
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it.
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
     * operations that depend on it.
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
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using the Encrypt function.
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
     * encrypted by using the Encrypt function.
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
     * Creates a display name for a customer master key. An alias can be
     * used to identify a key and should be unique. The console enforces a
     * one-to-one mapping between the alias and a key. An alias name can
     * contain only alphanumeric characters, forward slashes (/), underscores
     * (_), and dashes (-). An alias must start with the word "alias"
     * followed by a forward slash (alias/). An alias that begins with "aws"
     * after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
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
     * Encrypts data on the server side with a new customer master key
     * without exposing the plaintext of the data on the client side. The
     * data is first decrypted and then encrypted. This operation can also be
     * used to change the encryption context of a ciphertext.
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
     * Marks a key as enabled, thereby permitting its use. You can have up
     * to 25 enabled keys at one time.
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
     * Marks a key as enabled, thereby permitting its use. You can have up
     * to 25 enabled keys at one time.
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
     * Marks a key as disabled, thereby preventing its use.
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
     * Marks a key as disabled, thereby preventing its use.
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
}
        