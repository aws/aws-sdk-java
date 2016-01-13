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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kms.model.*;

/**
 * Interface for accessing KMS.
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
public interface AWSKMS {

    /**
     * Overrides the default endpoint for this client
     * ("https://kms.us-east-1.amazonaws.com/"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "kms.us-east-1.amazonaws.com/") or a full URL, including the protocol
     * (ex: "https://kms.us-east-1.amazonaws.com/"). If the protocol is not
     * specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "kms.us-east-1.amazonaws.com/") or a full URL,
     *        including the protocol (ex:
     *        "https://kms.us-east-1.amazonaws.com/") of the region specific AWS
     *        endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSKMS#setEndpoint(String)}, sets the regional
     * endpoint for this client's service calls. Callers can use this method to
     * control which AWS region they want to work with.
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
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @return Result of the CancelKeyDeletion operation returned by the
     *         service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CancelKeyDeletion
     */
    CancelKeyDeletionResult cancelKeyDeletion(
            CancelKeyDeletionRequest cancelKeyDeletionRequest);

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
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws AlreadyExistsException
     *         The request was rejected because it attempted to create a
     *         resource that already exists.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidAliasNameException
     *         The request was rejected because the specified alias name is not
     *         valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CreateAlias
     */
    void createAlias(CreateAliasRequest createAliasRequest);

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
     * @return Result of the CreateGrant operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CreateGrant
     */
    CreateGrantResult createGrant(CreateGrantRequest createGrantRequest);

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
     * @return Result of the CreateKey operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not
     *         syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not
     *         supported.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @sample AWSKMS.CreateKey
     */
    CreateKeyResult createKey(CreateKeyRequest createKeyRequest);

    /**
     * Simplified method form for invoking the CreateKey operation.
     *
     * @see #createKey(CreateKeyRequest)
     */
    CreateKeyResult createKey();

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
     * @return Result of the Decrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidCiphertextException
     *         The request was rejected because the specified ciphertext has
     *         been corrupted or is otherwise invalid.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.Decrypt
     */
    DecryptResult decrypt(DecryptRequest decryptRequest);

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DeleteAlias
     */
    void deleteAlias(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Provides detailed information about the specified customer master key.
     * </p>
     * 
     * @param describeKeyRequest
     * @return Result of the DescribeKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.DescribeKey
     */
    DescribeKeyResult describeKey(DescribeKeyRequest describeKeyRequest);

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
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DisableKey
     */
    void disableKey(DisableKeyRequest disableKeyRequest);

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DisableKeyRotation
     */
    void disableKeyRotation(DisableKeyRotationRequest disableKeyRotationRequest);

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     * 
     * @param enableKeyRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.EnableKey
     */
    void enableKey(EnableKeyRequest enableKeyRequest);

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.EnableKeyRotation
     */
    void enableKeyRotation(EnableKeyRotationRequest enableKeyRotationRequest);

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
     * @return Result of the Encrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.Encrypt
     */
    EncryptResult encrypt(EncryptRequest encryptRequest);

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
     * @return Result of the GenerateDataKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GenerateDataKey
     */
    GenerateDataKeyResult generateDataKey(
            GenerateDataKeyRequest generateDataKeyRequest);

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
     * @return Result of the GenerateDataKeyWithoutPlaintext operation returned
     *         by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GenerateDataKeyWithoutPlaintext
     */
    GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest);

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @param generateRandomRequest
     * @return Result of the GenerateRandom operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.GenerateRandom
     */
    GenerateRandomResult generateRandom(
            GenerateRandomRequest generateRandomRequest);

    /**
     * Simplified method form for invoking the GenerateRandom operation.
     *
     * @see #generateRandom(GenerateRandomRequest)
     */
    GenerateRandomResult generateRandom();

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @return Result of the GetKeyPolicy operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GetKeyPolicy
     */
    GetKeyPolicyResult getKeyPolicy(GetKeyPolicyRequest getKeyPolicyRequest);

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is enabled
     * for the specified key.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @return Result of the GetKeyRotationStatus operation returned by the
     *         service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GetKeyRotationStatus
     */
    GetKeyRotationStatusResult getKeyRotationStatus(
            GetKeyRotationStatusRequest getKeyRotationStatusRequest);

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where
     *         pagination should next begin is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.ListAliases
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest);

    /**
     * Simplified method form for invoking the ListAliases operation.
     *
     * @see #listAliases(ListAliasesRequest)
     */
    ListAliasesResult listAliases();

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     * 
     * @param listGrantsRequest
     * @return Result of the ListGrants operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where
     *         pagination should next begin is not valid.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ListGrants
     */
    ListGrantsResult listGrants(ListGrantsRequest listGrantsRequest);

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @return Result of the ListKeyPolicies operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ListKeyPolicies
     */
    ListKeyPoliciesResult listKeyPolicies(
            ListKeyPoliciesRequest listKeyPoliciesRequest);

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @param listKeysRequest
     * @return Result of the ListKeys operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.ListKeys
     */
    ListKeysResult listKeys(ListKeysRequest listKeysRequest);

    /**
     * Simplified method form for invoking the ListKeys operation.
     *
     * @see #listKeys(ListKeysRequest)
     */
    ListKeysResult listKeys();

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
     * @return Result of the ListRetirableGrants operation returned by the
     *         service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where
     *         pagination should next begin is not valid.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.ListRetirableGrants
     */
    ListRetirableGrantsResult listRetirableGrants(
            ListRetirableGrantsRequest listRetirableGrantsRequest);

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not
     *         syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not
     *         supported.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.PutKeyPolicy
     */
    void putKeyPolicy(PutKeyPolicyRequest putKeyPolicyRequest);

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
     * @return Result of the ReEncrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidCiphertextException
     *         The request was rejected because the specified ciphertext has
     *         been corrupted or is otherwise invalid.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ReEncrypt
     */
    ReEncryptResult reEncrypt(ReEncryptRequest reEncryptRequest);

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
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified
     *         <code>GrantId</code> is not valid.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.RetireGrant
     */
    void retireGrant(RetireGrantRequest retireGrantRequest);

    /**
     * Simplified method form for invoking the RetireGrant operation.
     *
     * @see #retireGrant(RetireGrantRequest)
     */
    void retireGrant();

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations that
     * depend on it.
     * </p>
     * 
     * @param revokeGrantRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified
     *         <code>GrantId</code> is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.RevokeGrant
     */
    void revokeGrant(RevokeGrantRequest revokeGrantRequest);

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
     * @return Result of the ScheduleKeyDeletion operation returned by the
     *         service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ScheduleKeyDeletion
     */
    ScheduleKeyDeletionResult scheduleKeyDeletion(
            ScheduleKeyDeletionRequest scheduleKeyDeletionRequest);

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
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.UpdateAlias
     */
    void updateAlias(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.UpdateKeyDescription
     */
    void updateKeyDescription(
            UpdateKeyDescriptionRequest updateKeyDescriptionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
