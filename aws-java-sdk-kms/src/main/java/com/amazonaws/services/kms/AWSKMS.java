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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.kms.model.*;

/**
 * Interface for accessing AWSKMS.
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
public interface AWSKMS {

    /**
     * Overrides the default endpoint for this client ("https://kms.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "kms.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://kms.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "kms.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://kms.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSKMS#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
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
     *           execute the CreateKey service method on AWSKMS.
     * 
     * @return The response from the CreateKey service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeyResult createKey(CreateKeyRequest createKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key.
     * </p>
     *
     * @param encryptRequest Container for the necessary parameters to
     *           execute the Encrypt service method on AWSKMS.
     * 
     * @return The response from the Encrypt service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EncryptResult encrypt(EncryptRequest encryptRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     *
     * @param getKeyPolicyRequest Container for the necessary parameters to
     *           execute the GetKeyPolicy service method on AWSKMS.
     * 
     * @return The response from the GetKeyPolicy service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetKeyPolicyResult getKeyPolicy(GetKeyPolicyRequest getKeyPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     *
     * @param updateKeyDescriptionRequest Container for the necessary
     *           parameters to execute the UpdateKeyDescription service method on
     *           AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateKeyDescription(UpdateKeyDescriptionRequest updateKeyDescriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     *
     * @param listKeysRequest Container for the necessary parameters to
     *           execute the ListKeys service method on AWSKMS.
     * 
     * @return The response from the ListKeys service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListKeysResult listKeys(ListKeysRequest listKeysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a secure data key. Data keys are used to encrypt and
     * decrypt data. They are wrapped by customer master keys.
     * </p>
     *
     * @param generateDataKeyRequest Container for the necessary parameters
     *           to execute the GenerateDataKey service method on AWSKMS.
     * 
     * @return The response from the GenerateDataKey service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateDataKeyResult generateDataKey(GenerateDataKeyRequest generateDataKeyRequest) 
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
     *           execute the CreateGrant service method on AWSKMS.
     * 
     * @return The response from the CreateGrant service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateGrantResult createGrant(CreateGrantRequest createGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases service method on AWSKMS.
     * 
     * @return The response from the ListAliases service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a key wrapped by a customer master key without the plaintext
     * copy of that key. To retrieve the plaintext, see GenerateDataKey.
     * </p>
     *
     * @param generateDataKeyWithoutPlaintextRequest Container for the
     *           necessary parameters to execute the GenerateDataKeyWithoutPlaintext
     *           service method on AWSKMS.
     * 
     * @return The response from the GenerateDataKeyWithoutPlaintext service
     *         method, as returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified alias.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAlias(DeleteAliasRequest deleteAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     *
     * @param enableKeyRotationRequest Container for the necessary parameters
     *           to execute the EnableKeyRotation service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableKeyRotation(EnableKeyRotationRequest enableKeyRotationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it.
     * </p>
     *
     * @param retireGrantRequest Container for the necessary parameters to
     *           execute the RetireGrant service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void retireGrant(RetireGrantRequest retireGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides detailed information about the specified customer master
     * key.
     * </p>
     *
     * @param describeKeyRequest Container for the necessary parameters to
     *           execute the DescribeKey service method on AWSKMS.
     * 
     * @return The response from the DescribeKey service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeKeyResult describeKey(DescribeKeyRequest describeKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     *
     * @param listGrantsRequest Container for the necessary parameters to
     *           execute the ListGrants service method on AWSKMS.
     * 
     * @return The response from the ListGrants service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGrantsResult listGrants(ListGrantsRequest listGrantsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using the Encrypt function.
     * </p>
     *
     * @param decryptRequest Container for the necessary parameters to
     *           execute the Decrypt service method on AWSKMS.
     * 
     * @return The response from the Decrypt service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidCiphertextException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DecryptResult decrypt(DecryptRequest decryptRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     *
     * @param generateRandomRequest Container for the necessary parameters to
     *           execute the GenerateRandom service method on AWSKMS.
     * 
     * @return The response from the GenerateRandom service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateRandomResult generateRandom(GenerateRandomRequest generateRandomRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is
     * enabled for the specified key.
     * </p>
     *
     * @param getKeyRotationStatusRequest Container for the necessary
     *           parameters to execute the GetKeyRotationStatus service method on
     *           AWSKMS.
     * 
     * @return The response from the GetKeyRotationStatus service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetKeyRotationStatusResult getKeyRotationStatus(GetKeyRotationStatusRequest getKeyRotationStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     *
     * @param disableKeyRotationRequest Container for the necessary
     *           parameters to execute the DisableKeyRotation service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableKeyRotation(DisableKeyRotationRequest disableKeyRotationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     *
     * @param listKeyPoliciesRequest Container for the necessary parameters
     *           to execute the ListKeyPolicies service method on AWSKMS.
     * 
     * @return The response from the ListKeyPolicies service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListKeyPoliciesResult listKeyPolicies(ListKeyPoliciesRequest listKeyPoliciesRequest) 
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
     *           execute the CreateAlias service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws AlreadyExistsException
     * @throws InvalidAliasNameException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createAlias(CreateAliasRequest createAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     *
     * @param putKeyPolicyRequest Container for the necessary parameters to
     *           execute the PutKeyPolicy service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putKeyPolicy(PutKeyPolicyRequest putKeyPolicyRequest) 
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
     *           execute the ReEncrypt service method on AWSKMS.
     * 
     * @return The response from the ReEncrypt service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidCiphertextException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReEncryptResult reEncrypt(ReEncryptRequest reEncryptRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations
     * that depend on it.
     * </p>
     *
     * @param revokeGrantRequest Container for the necessary parameters to
     *           execute the RevokeGrant service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeGrant(RevokeGrantRequest revokeGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use. You can have up
     * to 25 enabled keys at one time.
     * </p>
     *
     * @param enableKeyRequest Container for the necessary parameters to
     *           execute the EnableKey service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableKey(EnableKeyRequest enableKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Marks a key as disabled, thereby preventing its use.
     * </p>
     *
     * @param disableKeyRequest Container for the necessary parameters to
     *           execute the DisableKey service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableKey(DisableKeyRequest disableKeyRequest) 
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
     * @return The response from the CreateKey service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeyResult createKey() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @return The response from the ListKeys service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListKeysResult listKeys() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @return The response from the ListAliases service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @return The response from the GenerateRandom service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateRandomResult generateRandom() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        