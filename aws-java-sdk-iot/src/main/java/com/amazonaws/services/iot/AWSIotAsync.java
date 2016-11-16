/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot;

import com.amazonaws.services.iot.model.*;

/**
 * Interface for accessing AWS IoT asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iot.AbstractAWSIotAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between Internet-connected things (such as sensors, actuators,
 * embedded devices, or smart appliances) and the AWS cloud. You can discover your custom IoT-Data endpoint to
 * communicate with, configure rules for data processing and integration with other services, organize resources
 * associated with each thing (Thing Registry), configure logging, and create and manage policies and credentials to
 * authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html">Developer Guide</a>.
 * </p>
 */
public interface AWSIotAsync extends AWSIot {

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * 
     * @param acceptCertificateTransferRequest
     *        The input for the AcceptCertificateTransfer operation.
     * @return A Java Future containing the result of the AcceptCertificateTransfer operation returned by the service.
     * @sample AWSIotAsync.AcceptCertificateTransfer
     */
    java.util.concurrent.Future<AcceptCertificateTransferResult> acceptCertificateTransferAsync(
            AcceptCertificateTransferRequest acceptCertificateTransferRequest);

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * 
     * @param acceptCertificateTransferRequest
     *        The input for the AcceptCertificateTransfer operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptCertificateTransfer operation returned by the service.
     * @sample AWSIotAsyncHandler.AcceptCertificateTransfer
     */
    java.util.concurrent.Future<AcceptCertificateTransferResult> acceptCertificateTransferAsync(
            AcceptCertificateTransferRequest acceptCertificateTransferRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptCertificateTransferRequest, AcceptCertificateTransferResult> asyncHandler);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or other credential).
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @return A Java Future containing the result of the AttachPrincipalPolicy operation returned by the service.
     * @sample AWSIotAsync.AttachPrincipalPolicy
     */
    java.util.concurrent.Future<AttachPrincipalPolicyResult> attachPrincipalPolicyAsync(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or other credential).
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachPrincipalPolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.AttachPrincipalPolicy
     */
    java.util.concurrent.Future<AttachPrincipalPolicyResult> attachPrincipalPolicyAsync(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachPrincipalPolicyRequest, AttachPrincipalPolicyResult> asyncHandler);

    /**
     * <p>
     * Attaches the specified principal to the specified thing.
     * </p>
     * 
     * @param attachThingPrincipalRequest
     *        The input for the AttachThingPrincipal operation.
     * @return A Java Future containing the result of the AttachThingPrincipal operation returned by the service.
     * @sample AWSIotAsync.AttachThingPrincipal
     */
    java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(AttachThingPrincipalRequest attachThingPrincipalRequest);

    /**
     * <p>
     * Attaches the specified principal to the specified thing.
     * </p>
     * 
     * @param attachThingPrincipalRequest
     *        The input for the AttachThingPrincipal operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachThingPrincipal operation returned by the service.
     * @sample AWSIotAsyncHandler.AttachThingPrincipal
     */
    java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(AttachThingPrincipalRequest attachThingPrincipalRequest,
            com.amazonaws.handlers.AsyncHandler<AttachThingPrincipalRequest, AttachThingPrincipalResult> asyncHandler);

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations
     * can use <a>RejectCertificateTransfer</a> instead.) After transfer, AWS IoT returns the certificate to the source
     * account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be
     * cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to
     * INACTIVE.
     * </p>
     * 
     * @param cancelCertificateTransferRequest
     *        The input for the CancelCertificateTransfer operation.
     * @return A Java Future containing the result of the CancelCertificateTransfer operation returned by the service.
     * @sample AWSIotAsync.CancelCertificateTransfer
     */
    java.util.concurrent.Future<CancelCertificateTransferResult> cancelCertificateTransferAsync(
            CancelCertificateTransferRequest cancelCertificateTransferRequest);

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations
     * can use <a>RejectCertificateTransfer</a> instead.) After transfer, AWS IoT returns the certificate to the source
     * account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be
     * cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to
     * INACTIVE.
     * </p>
     * 
     * @param cancelCertificateTransferRequest
     *        The input for the CancelCertificateTransfer operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelCertificateTransfer operation returned by the service.
     * @sample AWSIotAsyncHandler.CancelCertificateTransfer
     */
    java.util.concurrent.Future<CancelCertificateTransferResult> cancelCertificateTransferAsync(
            CancelCertificateTransferRequest cancelCertificateTransferRequest,
            com.amazonaws.handlers.AsyncHandler<CancelCertificateTransferRequest, CancelCertificateTransferResult> asyncHandler);

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR) results in a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that
     * directory, and then specifying that directory on the command line. The following commands show how to create a
     * batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory my-csr-directory:
     * </p>
     * <p>
     * On Linux and OS X, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot
     * create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the
     * certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/$_}
     * </p>
     * <p>
     * On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest
     *        The input for the CreateCertificateFromCsr operation.
     * @return A Java Future containing the result of the CreateCertificateFromCsr operation returned by the service.
     * @sample AWSIotAsync.CreateCertificateFromCsr
     */
    java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(CreateCertificateFromCsrRequest createCertificateFromCsrRequest);

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR) results in a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that
     * directory, and then specifying that directory on the command line. The following commands show how to create a
     * batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory my-csr-directory:
     * </p>
     * <p>
     * On Linux and OS X, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot
     * create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the
     * certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/$_}
     * </p>
     * <p>
     * On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest
     *        The input for the CreateCertificateFromCsr operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCertificateFromCsr operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateCertificateFromCsr
     */
    java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(CreateCertificateFromCsrRequest createCertificateFromCsrRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCertificateFromCsrRequest, CreateCertificateFromCsrResult> asyncHandler);

    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this certificate, so it is important to keep
     * it in a secure location.
     * </p>
     * 
     * @param createKeysAndCertificateRequest
     *        The input for the CreateKeysAndCertificate operation.
     * @return A Java Future containing the result of the CreateKeysAndCertificate operation returned by the service.
     * @sample AWSIotAsync.CreateKeysAndCertificate
     */
    java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(CreateKeysAndCertificateRequest createKeysAndCertificateRequest);

    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this certificate, so it is important to keep
     * it in a secure location.
     * </p>
     * 
     * @param createKeysAndCertificateRequest
     *        The input for the CreateKeysAndCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKeysAndCertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateKeysAndCertificate
     */
    java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(CreateKeysAndCertificateRequest createKeysAndCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeysAndCertificateRequest, CreateKeysAndCertificateResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation creates a policy version with a version
     * identifier of <b>1</b> and sets <b>1</b> as the policy's default version.
     * </p>
     * 
     * @param createPolicyRequest
     *        The input for the CreatePolicy operation.
     * @return A Java Future containing the result of the CreatePolicy operation returned by the service.
     * @sample AWSIotAsync.CreatePolicy
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation creates a policy version with a version
     * identifier of <b>1</b> and sets <b>1</b> as the policy's default version.
     * </p>
     * 
     * @param createPolicyRequest
     *        The input for the CreatePolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.CreatePolicy
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest createPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed
     * policy can have up to five versions. If the policy has five versions, you must use <a>DeletePolicyVersion</a> to
     * delete an existing version before you create a new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version. The default version is the operative
     * version (that is, the version that is in effect for the certificates to which the policy is attached).
     * </p>
     * 
     * @param createPolicyVersionRequest
     *        The input for the CreatePolicyVersion operation.
     * @return A Java Future containing the result of the CreatePolicyVersion operation returned by the service.
     * @sample AWSIotAsync.CreatePolicyVersion
     */
    java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(CreatePolicyVersionRequest createPolicyVersionRequest);

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed
     * policy can have up to five versions. If the policy has five versions, you must use <a>DeletePolicyVersion</a> to
     * delete an existing version before you create a new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version. The default version is the operative
     * version (that is, the version that is in effect for the certificates to which the policy is attached).
     * </p>
     * 
     * @param createPolicyVersionRequest
     *        The input for the CreatePolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicyVersion operation returned by the service.
     * @sample AWSIotAsyncHandler.CreatePolicyVersion
     */
    java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(CreatePolicyVersionRequest createPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a thing record in the thing registry.
     * </p>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @return A Java Future containing the result of the CreateThing operation returned by the service.
     * @sample AWSIotAsync.CreateThing
     */
    java.util.concurrent.Future<CreateThingResult> createThingAsync(CreateThingRequest createThingRequest);

    /**
     * <p>
     * Creates a thing record in the thing registry.
     * </p>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThing operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateThing
     */
    java.util.concurrent.Future<CreateThingResult> createThingAsync(CreateThingRequest createThingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThingRequest, CreateThingResult> asyncHandler);

    /**
     * <p>
     * Creates a new thing type.
     * </p>
     * 
     * @param createThingTypeRequest
     *        The input for the CreateThingType operation.
     * @return A Java Future containing the result of the CreateThingType operation returned by the service.
     * @sample AWSIotAsync.CreateThingType
     */
    java.util.concurrent.Future<CreateThingTypeResult> createThingTypeAsync(CreateThingTypeRequest createThingTypeRequest);

    /**
     * <p>
     * Creates a new thing type.
     * </p>
     * 
     * @param createThingTypeRequest
     *        The input for the CreateThingType operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThingType operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateThingType
     */
    java.util.concurrent.Future<CreateThingTypeResult> createThingTypeAsync(CreateThingTypeRequest createThingTypeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThingTypeRequest, CreateThingTypeResult> asyncHandler);

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will
     * be able to access data processed by the rule.
     * </p>
     * 
     * @param createTopicRuleRequest
     *        The input for the CreateTopicRule operation.
     * @return A Java Future containing the result of the CreateTopicRule operation returned by the service.
     * @sample AWSIotAsync.CreateTopicRule
     */
    java.util.concurrent.Future<CreateTopicRuleResult> createTopicRuleAsync(CreateTopicRuleRequest createTopicRuleRequest);

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will
     * be able to access data processed by the rule.
     * </p>
     * 
     * @param createTopicRuleRequest
     *        The input for the CreateTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTopicRule operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateTopicRule
     */
    java.util.concurrent.Future<CreateTopicRuleResult> createTopicRuleAsync(CreateTopicRuleRequest createTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRuleRequest, CreateTopicRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a registered CA certificate.
     * </p>
     * 
     * @param deleteCACertificateRequest
     *        Input for the DeleteCACertificate operation.
     * @return A Java Future containing the result of the DeleteCACertificate operation returned by the service.
     * @sample AWSIotAsync.DeleteCACertificate
     */
    java.util.concurrent.Future<DeleteCACertificateResult> deleteCACertificateAsync(DeleteCACertificateRequest deleteCACertificateRequest);

    /**
     * <p>
     * Deletes a registered CA certificate.
     * </p>
     * 
     * @param deleteCACertificateRequest
     *        Input for the DeleteCACertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCACertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteCACertificate
     */
    java.util.concurrent.Future<DeleteCACertificateResult> deleteCACertificateAsync(DeleteCACertificateRequest deleteCACertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCACertificateRequest, DeleteCACertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a
     * certificate, first use the <a>DetachPrincipalPolicy</a> API to detach all policies. Next, use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE status.
     * </p>
     * 
     * @param deleteCertificateRequest
     *        The input for the DeleteCertificate operation.
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSIotAsync.DeleteCertificate
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a
     * certificate, first use the <a>DetachPrincipalPolicy</a> API to detach all policies. Next, use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE status.
     * </p>
     * 
     * @param deleteCertificateRequest
     *        The input for the DeleteCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteCertificate
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions or it is attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the
     * DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete
     * the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is deleted with it.
     * </p>
     * 
     * @param deletePolicyRequest
     *        The input for the DeletePolicy operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSIotAsync.DeletePolicy
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions or it is attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the
     * DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete
     * the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is deleted with it.
     * </p>
     * 
     * @param deletePolicyRequest
     *        The input for the DeletePolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.DeletePolicy
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using
     * this API. To delete the default version of a policy, use <a>DeletePolicy</a>. To find out which version of a
     * policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     *        The input for the DeletePolicyVersion operation.
     * @return A Java Future containing the result of the DeletePolicyVersion operation returned by the service.
     * @sample AWSIotAsync.DeletePolicyVersion
     */
    java.util.concurrent.Future<DeletePolicyVersionResult> deletePolicyVersionAsync(DeletePolicyVersionRequest deletePolicyVersionRequest);

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using
     * this API. To delete the default version of a policy, use <a>DeletePolicy</a>. To find out which version of a
     * policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     *        The input for the DeletePolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicyVersion operation returned by the service.
     * @sample AWSIotAsyncHandler.DeletePolicyVersion
     */
    java.util.concurrent.Future<DeletePolicyVersionResult> deletePolicyVersionAsync(DeletePolicyVersionRequest deletePolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, DeletePolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes a CA certificate registration code.
     * </p>
     * 
     * @param deleteRegistrationCodeRequest
     *        The input for the DeleteRegistrationCode operation.
     * @return A Java Future containing the result of the DeleteRegistrationCode operation returned by the service.
     * @sample AWSIotAsync.DeleteRegistrationCode
     */
    java.util.concurrent.Future<DeleteRegistrationCodeResult> deleteRegistrationCodeAsync(DeleteRegistrationCodeRequest deleteRegistrationCodeRequest);

    /**
     * <p>
     * Deletes a CA certificate registration code.
     * </p>
     * 
     * @param deleteRegistrationCodeRequest
     *        The input for the DeleteRegistrationCode operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegistrationCode operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteRegistrationCode
     */
    java.util.concurrent.Future<DeleteRegistrationCodeResult> deleteRegistrationCodeAsync(DeleteRegistrationCodeRequest deleteRegistrationCodeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegistrationCodeRequest, DeleteRegistrationCodeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified thing.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @return A Java Future containing the result of the DeleteThing operation returned by the service.
     * @sample AWSIotAsync.DeleteThing
     */
    java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(DeleteThingRequest deleteThingRequest);

    /**
     * <p>
     * Deletes the specified thing.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThing operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteThing
     */
    java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(DeleteThingRequest deleteThingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThingRequest, DeleteThingResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified thing type . You cannot delete a thing type if it has things associated with it. To delete
     * a thing type, first mark it as deprecated by calling <a>DeprecateThingType</a>, then remove any associated things
     * by calling <a>UpdateThing</a> to change the thing type on any associated thing, and finally use
     * <a>DeleteThingType</a> to delete the thing type.
     * </p>
     * 
     * @param deleteThingTypeRequest
     *        The input for the DeleteThingType operation.
     * @return A Java Future containing the result of the DeleteThingType operation returned by the service.
     * @sample AWSIotAsync.DeleteThingType
     */
    java.util.concurrent.Future<DeleteThingTypeResult> deleteThingTypeAsync(DeleteThingTypeRequest deleteThingTypeRequest);

    /**
     * <p>
     * Deletes the specified thing type . You cannot delete a thing type if it has things associated with it. To delete
     * a thing type, first mark it as deprecated by calling <a>DeprecateThingType</a>, then remove any associated things
     * by calling <a>UpdateThing</a> to change the thing type on any associated thing, and finally use
     * <a>DeleteThingType</a> to delete the thing type.
     * </p>
     * 
     * @param deleteThingTypeRequest
     *        The input for the DeleteThingType operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThingType operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteThingType
     */
    java.util.concurrent.Future<DeleteThingTypeResult> deleteThingTypeAsync(DeleteThingTypeRequest deleteThingTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThingTypeRequest, DeleteThingTypeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest
     *        The input for the DeleteTopicRule operation.
     * @return A Java Future containing the result of the DeleteTopicRule operation returned by the service.
     * @sample AWSIotAsync.DeleteTopicRule
     */
    java.util.concurrent.Future<DeleteTopicRuleResult> deleteTopicRuleAsync(DeleteTopicRuleRequest deleteTopicRuleRequest);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest
     *        The input for the DeleteTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTopicRule operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteTopicRule
     */
    java.util.concurrent.Future<DeleteTopicRuleResult> deleteTopicRuleAsync(DeleteTopicRuleRequest deleteTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRuleRequest, DeleteTopicRuleResult> asyncHandler);

    /**
     * <p>
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     * </p>
     * 
     * @param deprecateThingTypeRequest
     *        The input for the DeprecateThingType operation.
     * @return A Java Future containing the result of the DeprecateThingType operation returned by the service.
     * @sample AWSIotAsync.DeprecateThingType
     */
    java.util.concurrent.Future<DeprecateThingTypeResult> deprecateThingTypeAsync(DeprecateThingTypeRequest deprecateThingTypeRequest);

    /**
     * <p>
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     * </p>
     * 
     * @param deprecateThingTypeRequest
     *        The input for the DeprecateThingType operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeprecateThingType operation returned by the service.
     * @sample AWSIotAsyncHandler.DeprecateThingType
     */
    java.util.concurrent.Future<DeprecateThingTypeResult> deprecateThingTypeAsync(DeprecateThingTypeRequest deprecateThingTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeprecateThingTypeRequest, DeprecateThingTypeResult> asyncHandler);

    /**
     * <p>
     * Describes a registered CA certificate.
     * </p>
     * 
     * @param describeCACertificateRequest
     *        The input for the DescribeCACertificate operation.
     * @return A Java Future containing the result of the DescribeCACertificate operation returned by the service.
     * @sample AWSIotAsync.DescribeCACertificate
     */
    java.util.concurrent.Future<DescribeCACertificateResult> describeCACertificateAsync(DescribeCACertificateRequest describeCACertificateRequest);

    /**
     * <p>
     * Describes a registered CA certificate.
     * </p>
     * 
     * @param describeCACertificateRequest
     *        The input for the DescribeCACertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCACertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeCACertificate
     */
    java.util.concurrent.Future<DescribeCACertificateResult> describeCACertificateAsync(DescribeCACertificateRequest describeCACertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCACertificateRequest, DescribeCACertificateResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     *        The input for the DescribeCertificate operation.
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSIotAsync.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     *        The input for the DescribeCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler);

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the call.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @return A Java Future containing the result of the DescribeEndpoint operation returned by the service.
     * @sample AWSIotAsync.DescribeEndpoint
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest describeEndpointRequest);

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the call.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoint operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeEndpoint
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest describeEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest
     *        The input for the DescribeThing operation.
     * @return A Java Future containing the result of the DescribeThing operation returned by the service.
     * @sample AWSIotAsync.DescribeThing
     */
    java.util.concurrent.Future<DescribeThingResult> describeThingAsync(DescribeThingRequest describeThingRequest);

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest
     *        The input for the DescribeThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThing operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeThing
     */
    java.util.concurrent.Future<DescribeThingResult> describeThingAsync(DescribeThingRequest describeThingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThingRequest, DescribeThingResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified thing type.
     * </p>
     * 
     * @param describeThingTypeRequest
     *        The input for the DescribeThingType operation.
     * @return A Java Future containing the result of the DescribeThingType operation returned by the service.
     * @sample AWSIotAsync.DescribeThingType
     */
    java.util.concurrent.Future<DescribeThingTypeResult> describeThingTypeAsync(DescribeThingTypeRequest describeThingTypeRequest);

    /**
     * <p>
     * Gets information about the specified thing type.
     * </p>
     * 
     * @param describeThingTypeRequest
     *        The input for the DescribeThingType operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThingType operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeThingType
     */
    java.util.concurrent.Future<DescribeThingTypeResult> describeThingTypeAsync(DescribeThingTypeRequest describeThingTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThingTypeRequest, DescribeThingTypeResult> asyncHandler);

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @return A Java Future containing the result of the DetachPrincipalPolicy operation returned by the service.
     * @sample AWSIotAsync.DetachPrincipalPolicy
     */
    java.util.concurrent.Future<DetachPrincipalPolicyResult> detachPrincipalPolicyAsync(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest);

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachPrincipalPolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.DetachPrincipalPolicy
     */
    java.util.concurrent.Future<DetachPrincipalPolicyResult> detachPrincipalPolicyAsync(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachPrincipalPolicyRequest, DetachPrincipalPolicyResult> asyncHandler);

    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @return A Java Future containing the result of the DetachThingPrincipal operation returned by the service.
     * @sample AWSIotAsync.DetachThingPrincipal
     */
    java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(DetachThingPrincipalRequest detachThingPrincipalRequest);

    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachThingPrincipal operation returned by the service.
     * @sample AWSIotAsyncHandler.DetachThingPrincipal
     */
    java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(DetachThingPrincipalRequest detachThingPrincipalRequest,
            com.amazonaws.handlers.AsyncHandler<DetachThingPrincipalRequest, DetachThingPrincipalResult> asyncHandler);

    /**
     * <p>
     * Disables the specified rule.
     * </p>
     * 
     * @param disableTopicRuleRequest
     *        The input for the DisableTopicRuleRequest operation.
     * @return A Java Future containing the result of the DisableTopicRule operation returned by the service.
     * @sample AWSIotAsync.DisableTopicRule
     */
    java.util.concurrent.Future<DisableTopicRuleResult> disableTopicRuleAsync(DisableTopicRuleRequest disableTopicRuleRequest);

    /**
     * <p>
     * Disables the specified rule.
     * </p>
     * 
     * @param disableTopicRuleRequest
     *        The input for the DisableTopicRuleRequest operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableTopicRule operation returned by the service.
     * @sample AWSIotAsyncHandler.DisableTopicRule
     */
    java.util.concurrent.Future<DisableTopicRuleResult> disableTopicRuleAsync(DisableTopicRuleRequest disableTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DisableTopicRuleRequest, DisableTopicRuleResult> asyncHandler);

    /**
     * <p>
     * Enables the specified rule.
     * </p>
     * 
     * @param enableTopicRuleRequest
     *        The input for the EnableTopicRuleRequest operation.
     * @return A Java Future containing the result of the EnableTopicRule operation returned by the service.
     * @sample AWSIotAsync.EnableTopicRule
     */
    java.util.concurrent.Future<EnableTopicRuleResult> enableTopicRuleAsync(EnableTopicRuleRequest enableTopicRuleRequest);

    /**
     * <p>
     * Enables the specified rule.
     * </p>
     * 
     * @param enableTopicRuleRequest
     *        The input for the EnableTopicRuleRequest operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableTopicRule operation returned by the service.
     * @sample AWSIotAsyncHandler.EnableTopicRule
     */
    java.util.concurrent.Future<EnableTopicRuleResult> enableTopicRuleAsync(EnableTopicRuleRequest enableTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<EnableTopicRuleRequest, EnableTopicRuleResult> asyncHandler);

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     *        The input for the GetLoggingOptions operation.
     * @return A Java Future containing the result of the GetLoggingOptions operation returned by the service.
     * @sample AWSIotAsync.GetLoggingOptions
     */
    java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(GetLoggingOptionsRequest getLoggingOptionsRequest);

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     *        The input for the GetLoggingOptions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggingOptions operation returned by the service.
     * @sample AWSIotAsyncHandler.GetLoggingOptions
     */
    java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(GetLoggingOptionsRequest getLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggingOptionsRequest, GetLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified policy with the policy document of the default version.
     * </p>
     * 
     * @param getPolicyRequest
     *        The input for the GetPolicy operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSIotAsync.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Gets information about the specified policy with the policy document of the default version.
     * </p>
     * 
     * @param getPolicyRequest
     *        The input for the GetPolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * 
     * @param getPolicyVersionRequest
     *        The input for the GetPolicyVersion operation.
     * @return A Java Future containing the result of the GetPolicyVersion operation returned by the service.
     * @sample AWSIotAsync.GetPolicyVersion
     */
    java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(GetPolicyVersionRequest getPolicyVersionRequest);

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * 
     * @param getPolicyVersionRequest
     *        The input for the GetPolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicyVersion operation returned by the service.
     * @sample AWSIotAsyncHandler.GetPolicyVersion
     */
    java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(GetPolicyVersionRequest getPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Gets a registration code used to register a CA certificate with AWS IoT.
     * </p>
     * 
     * @param getRegistrationCodeRequest
     *        The input to the GetRegistrationCode operation.
     * @return A Java Future containing the result of the GetRegistrationCode operation returned by the service.
     * @sample AWSIotAsync.GetRegistrationCode
     */
    java.util.concurrent.Future<GetRegistrationCodeResult> getRegistrationCodeAsync(GetRegistrationCodeRequest getRegistrationCodeRequest);

    /**
     * <p>
     * Gets a registration code used to register a CA certificate with AWS IoT.
     * </p>
     * 
     * @param getRegistrationCodeRequest
     *        The input to the GetRegistrationCode operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegistrationCode operation returned by the service.
     * @sample AWSIotAsyncHandler.GetRegistrationCode
     */
    java.util.concurrent.Future<GetRegistrationCodeResult> getRegistrationCodeAsync(GetRegistrationCodeRequest getRegistrationCodeRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegistrationCodeRequest, GetRegistrationCodeResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     * 
     * @param getTopicRuleRequest
     *        The input for the GetTopicRule operation.
     * @return A Java Future containing the result of the GetTopicRule operation returned by the service.
     * @sample AWSIotAsync.GetTopicRule
     */
    java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(GetTopicRuleRequest getTopicRuleRequest);

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     * 
     * @param getTopicRuleRequest
     *        The input for the GetTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTopicRule operation returned by the service.
     * @sample AWSIotAsyncHandler.GetTopicRule
     */
    java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(GetTopicRuleRequest getTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetTopicRuleRequest, GetTopicRuleResult> asyncHandler);

    /**
     * <p>
     * Lists the CA certificates registered for your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * 
     * @param listCACertificatesRequest
     *        Input for the ListCACertificates operation.
     * @return A Java Future containing the result of the ListCACertificates operation returned by the service.
     * @sample AWSIotAsync.ListCACertificates
     */
    java.util.concurrent.Future<ListCACertificatesResult> listCACertificatesAsync(ListCACertificatesRequest listCACertificatesRequest);

    /**
     * <p>
     * Lists the CA certificates registered for your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * 
     * @param listCACertificatesRequest
     *        Input for the ListCACertificates operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCACertificates operation returned by the service.
     * @sample AWSIotAsyncHandler.ListCACertificates
     */
    java.util.concurrent.Future<ListCACertificatesResult> listCACertificatesAsync(ListCACertificatesRequest listCACertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCACertificatesRequest, ListCACertificatesResult> asyncHandler);

    /**
     * <p>
     * Lists the certificates registered in your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * 
     * @param listCertificatesRequest
     *        The input for the ListCertificates operation.
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSIotAsync.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Lists the certificates registered in your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * 
     * @param listCertificatesRequest
     *        The input for the ListCertificates operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSIotAsyncHandler.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler);

    /**
     * <p>
     * List the device certificates signed by the specified CA certificate.
     * </p>
     * 
     * @param listCertificatesByCARequest
     *        The input to the ListCertificatesByCA operation.
     * @return A Java Future containing the result of the ListCertificatesByCA operation returned by the service.
     * @sample AWSIotAsync.ListCertificatesByCA
     */
    java.util.concurrent.Future<ListCertificatesByCAResult> listCertificatesByCAAsync(ListCertificatesByCARequest listCertificatesByCARequest);

    /**
     * <p>
     * List the device certificates signed by the specified CA certificate.
     * </p>
     * 
     * @param listCertificatesByCARequest
     *        The input to the ListCertificatesByCA operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificatesByCA operation returned by the service.
     * @sample AWSIotAsyncHandler.ListCertificatesByCA
     */
    java.util.concurrent.Future<ListCertificatesByCAResult> listCertificatesByCAAsync(ListCertificatesByCARequest listCertificatesByCARequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesByCARequest, ListCertificatesByCAResult> asyncHandler);

    /**
     * <p>
     * Lists certificates that are being transfered but not yet accepted.
     * </p>
     * 
     * @param listOutgoingCertificatesRequest
     *        The input to the ListOutgoingCertificates operation.
     * @return A Java Future containing the result of the ListOutgoingCertificates operation returned by the service.
     * @sample AWSIotAsync.ListOutgoingCertificates
     */
    java.util.concurrent.Future<ListOutgoingCertificatesResult> listOutgoingCertificatesAsync(ListOutgoingCertificatesRequest listOutgoingCertificatesRequest);

    /**
     * <p>
     * Lists certificates that are being transfered but not yet accepted.
     * </p>
     * 
     * @param listOutgoingCertificatesRequest
     *        The input to the ListOutgoingCertificates operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOutgoingCertificates operation returned by the service.
     * @sample AWSIotAsyncHandler.ListOutgoingCertificates
     */
    java.util.concurrent.Future<ListOutgoingCertificatesResult> listOutgoingCertificatesAsync(ListOutgoingCertificatesRequest listOutgoingCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListOutgoingCertificatesRequest, ListOutgoingCertificatesResult> asyncHandler);

    /**
     * <p>
     * Lists your policies.
     * </p>
     * 
     * @param listPoliciesRequest
     *        The input for the ListPolicies operation.
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AWSIotAsync.ListPolicies
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Lists your policies.
     * </p>
     * 
     * @param listPoliciesRequest
     *        The input for the ListPolicies operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPolicies
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the principals associated with the specified policy.
     * </p>
     * 
     * @param listPolicyPrincipalsRequest
     *        The input for the ListPolicyPrincipals operation.
     * @return A Java Future containing the result of the ListPolicyPrincipals operation returned by the service.
     * @sample AWSIotAsync.ListPolicyPrincipals
     */
    java.util.concurrent.Future<ListPolicyPrincipalsResult> listPolicyPrincipalsAsync(ListPolicyPrincipalsRequest listPolicyPrincipalsRequest);

    /**
     * <p>
     * Lists the principals associated with the specified policy.
     * </p>
     * 
     * @param listPolicyPrincipalsRequest
     *        The input for the ListPolicyPrincipals operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicyPrincipals operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPolicyPrincipals
     */
    java.util.concurrent.Future<ListPolicyPrincipalsResult> listPolicyPrincipalsAsync(ListPolicyPrincipalsRequest listPolicyPrincipalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPolicyPrincipalsRequest, ListPolicyPrincipalsResult> asyncHandler);

    /**
     * <p>
     * Lists the versions of the specified policy and identifies the default version.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     *        The input for the ListPolicyVersions operation.
     * @return A Java Future containing the result of the ListPolicyVersions operation returned by the service.
     * @sample AWSIotAsync.ListPolicyVersions
     */
    java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(ListPolicyVersionsRequest listPolicyVersionsRequest);

    /**
     * <p>
     * Lists the versions of the specified policy and identifies the default version.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     *        The input for the ListPolicyVersions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicyVersions operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPolicyVersions
     */
    java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(ListPolicyVersionsRequest listPolicyVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in <a
     * href=
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @return A Java Future containing the result of the ListPrincipalPolicies operation returned by the service.
     * @sample AWSIotAsync.ListPrincipalPolicies
     */
    java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest);

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in <a
     * href=
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrincipalPolicies operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPrincipalPolicies
     */
    java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalPoliciesRequest, ListPrincipalPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     * 
     * @param listPrincipalThingsRequest
     *        The input for the ListPrincipalThings operation.
     * @return A Java Future containing the result of the ListPrincipalThings operation returned by the service.
     * @sample AWSIotAsync.ListPrincipalThings
     */
    java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(ListPrincipalThingsRequest listPrincipalThingsRequest);

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     * 
     * @param listPrincipalThingsRequest
     *        The input for the ListPrincipalThings operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrincipalThings operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPrincipalThings
     */
    java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(ListPrincipalThingsRequest listPrincipalThingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalThingsRequest, ListPrincipalThingsResult> asyncHandler);

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     * 
     * @param listThingPrincipalsRequest
     *        The input for the ListThingPrincipal operation.
     * @return A Java Future containing the result of the ListThingPrincipals operation returned by the service.
     * @sample AWSIotAsync.ListThingPrincipals
     */
    java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(ListThingPrincipalsRequest listThingPrincipalsRequest);

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     * 
     * @param listThingPrincipalsRequest
     *        The input for the ListThingPrincipal operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingPrincipals operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingPrincipals
     */
    java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(ListThingPrincipalsRequest listThingPrincipalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingPrincipalsRequest, ListThingPrincipalsResult> asyncHandler);

    /**
     * <p>
     * Lists the existing thing types.
     * </p>
     * 
     * @param listThingTypesRequest
     *        The input for the ListThingTypes operation.
     * @return A Java Future containing the result of the ListThingTypes operation returned by the service.
     * @sample AWSIotAsync.ListThingTypes
     */
    java.util.concurrent.Future<ListThingTypesResult> listThingTypesAsync(ListThingTypesRequest listThingTypesRequest);

    /**
     * <p>
     * Lists the existing thing types.
     * </p>
     * 
     * @param listThingTypesRequest
     *        The input for the ListThingTypes operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingTypes operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingTypes
     */
    java.util.concurrent.Future<ListThingTypesResult> listThingTypesAsync(ListThingTypesRequest listThingTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingTypesRequest, ListThingTypesResult> asyncHandler);

    /**
     * <p>
     * Lists your things. Use the <b>attributeName</b> and <b>attributeValue</b> parameters to filter your things. For
     * example, calling <code>ListThings</code> with attributeName=Color and attributeValue=Red retrieves all things in
     * the registry that contain an attribute <b>Color</b> with the value <b>Red</b>.
     * </p>
     * 
     * @param listThingsRequest
     *        The input for the ListThings operation.
     * @return A Java Future containing the result of the ListThings operation returned by the service.
     * @sample AWSIotAsync.ListThings
     */
    java.util.concurrent.Future<ListThingsResult> listThingsAsync(ListThingsRequest listThingsRequest);

    /**
     * <p>
     * Lists your things. Use the <b>attributeName</b> and <b>attributeValue</b> parameters to filter your things. For
     * example, calling <code>ListThings</code> with attributeName=Color and attributeValue=Red retrieves all things in
     * the registry that contain an attribute <b>Color</b> with the value <b>Red</b>.
     * </p>
     * 
     * @param listThingsRequest
     *        The input for the ListThings operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThings operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThings
     */
    java.util.concurrent.Future<ListThingsResult> listThingsAsync(ListThingsRequest listThingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingsRequest, ListThingsResult> asyncHandler);

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest
     *        The input for the ListTopicRules operation.
     * @return A Java Future containing the result of the ListTopicRules operation returned by the service.
     * @sample AWSIotAsync.ListTopicRules
     */
    java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(ListTopicRulesRequest listTopicRulesRequest);

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest
     *        The input for the ListTopicRules operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTopicRules operation returned by the service.
     * @sample AWSIotAsyncHandler.ListTopicRules
     */
    java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(ListTopicRulesRequest listTopicRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTopicRulesRequest, ListTopicRulesResult> asyncHandler);

    /**
     * <p>
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
     * can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
     * subject field and public key. This enables you to have up to 10 certificate authorities sign your device
     * certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you
     * register your device certificates with the RegisterCertificate API.
     * </p>
     * 
     * @param registerCACertificateRequest
     *        The input to the RegisterCACertificate operation.
     * @return A Java Future containing the result of the RegisterCACertificate operation returned by the service.
     * @sample AWSIotAsync.RegisterCACertificate
     */
    java.util.concurrent.Future<RegisterCACertificateResult> registerCACertificateAsync(RegisterCACertificateRequest registerCACertificateRequest);

    /**
     * <p>
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
     * can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
     * subject field and public key. This enables you to have up to 10 certificate authorities sign your device
     * certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you
     * register your device certificates with the RegisterCertificate API.
     * </p>
     * 
     * @param registerCACertificateRequest
     *        The input to the RegisterCACertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterCACertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.RegisterCACertificate
     */
    java.util.concurrent.Future<RegisterCACertificateResult> registerCACertificateAsync(RegisterCACertificateRequest registerCACertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterCACertificateRequest, RegisterCACertificateResult> asyncHandler);

    /**
     * <p>
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject
     * field, you must specify the CA certificate that was used to sign the device certificate being registered.
     * </p>
     * 
     * @param registerCertificateRequest
     *        The input to the RegisterCertificate operation.
     * @return A Java Future containing the result of the RegisterCertificate operation returned by the service.
     * @sample AWSIotAsync.RegisterCertificate
     */
    java.util.concurrent.Future<RegisterCertificateResult> registerCertificateAsync(RegisterCertificateRequest registerCertificateRequest);

    /**
     * <p>
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject
     * field, you must specify the CA certificate that was used to sign the device certificate being registered.
     * </p>
     * 
     * @param registerCertificateRequest
     *        The input to the RegisterCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterCertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.RegisterCertificate
     */
    java.util.concurrent.Future<RegisterCertificateResult> registerCertificateAsync(RegisterCertificateRequest registerCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterCertificateRequest, RegisterCertificateResult> asyncHandler);

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status
     * changes from <b>PENDING_TRANSFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After it is called, the certificate will be
     * returned to the source's account in the INACTIVE state.
     * </p>
     * 
     * @param rejectCertificateTransferRequest
     *        The input for the RejectCertificateTransfer operation.
     * @return A Java Future containing the result of the RejectCertificateTransfer operation returned by the service.
     * @sample AWSIotAsync.RejectCertificateTransfer
     */
    java.util.concurrent.Future<RejectCertificateTransferResult> rejectCertificateTransferAsync(
            RejectCertificateTransferRequest rejectCertificateTransferRequest);

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status
     * changes from <b>PENDING_TRANSFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After it is called, the certificate will be
     * returned to the source's account in the INACTIVE state.
     * </p>
     * 
     * @param rejectCertificateTransferRequest
     *        The input for the RejectCertificateTransfer operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectCertificateTransfer operation returned by the service.
     * @sample AWSIotAsyncHandler.RejectCertificateTransfer
     */
    java.util.concurrent.Future<RejectCertificateTransferResult> rejectCertificateTransferAsync(
            RejectCertificateTransferRequest rejectCertificateTransferRequest,
            com.amazonaws.handlers.AsyncHandler<RejectCertificateTransferRequest, RejectCertificateTransferResult> asyncHandler);

    /**
     * <p>
     * Replaces the specified rule. You must specify all parameters for the new rule. Creating rules is an
     * administrator-level action. Any user who has permission to create rules will be able to access data processed by
     * the rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest
     *        The input for the ReplaceTopicRule operation.
     * @return A Java Future containing the result of the ReplaceTopicRule operation returned by the service.
     * @sample AWSIotAsync.ReplaceTopicRule
     */
    java.util.concurrent.Future<ReplaceTopicRuleResult> replaceTopicRuleAsync(ReplaceTopicRuleRequest replaceTopicRuleRequest);

    /**
     * <p>
     * Replaces the specified rule. You must specify all parameters for the new rule. Creating rules is an
     * administrator-level action. Any user who has permission to create rules will be able to access data processed by
     * the rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest
     *        The input for the ReplaceTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplaceTopicRule operation returned by the service.
     * @sample AWSIotAsyncHandler.ReplaceTopicRule
     */
    java.util.concurrent.Future<ReplaceTopicRuleResult> replaceTopicRuleAsync(ReplaceTopicRuleRequest replaceTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ReplaceTopicRuleRequest, ReplaceTopicRuleResult> asyncHandler);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action
     * affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
     * the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     *        The input for the SetDefaultPolicyVersion operation.
     * @return A Java Future containing the result of the SetDefaultPolicyVersion operation returned by the service.
     * @sample AWSIotAsync.SetDefaultPolicyVersion
     */
    java.util.concurrent.Future<SetDefaultPolicyVersionResult> setDefaultPolicyVersionAsync(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action
     * affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
     * the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     *        The input for the SetDefaultPolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDefaultPolicyVersion operation returned by the service.
     * @sample AWSIotAsyncHandler.SetDefaultPolicyVersion
     */
    java.util.concurrent.Future<SetDefaultPolicyVersionResult> setDefaultPolicyVersionAsync(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, SetDefaultPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * 
     * @param setLoggingOptionsRequest
     *        The input for the SetLoggingOptions operation.
     * @return A Java Future containing the result of the SetLoggingOptions operation returned by the service.
     * @sample AWSIotAsync.SetLoggingOptions
     */
    java.util.concurrent.Future<SetLoggingOptionsResult> setLoggingOptionsAsync(SetLoggingOptionsRequest setLoggingOptionsRequest);

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * 
     * @param setLoggingOptionsRequest
     *        The input for the SetLoggingOptions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetLoggingOptions operation returned by the service.
     * @sample AWSIotAsyncHandler.SetLoggingOptions
     */
    java.util.concurrent.Future<SetLoggingOptionsResult> setLoggingOptionsAsync(SetLoggingOptionsRequest setLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<SetLoggingOptionsRequest, SetLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer
     * target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to
     * deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach
     * them.
     * </p>
     * 
     * @param transferCertificateRequest
     *        The input for the TransferCertificate operation.
     * @return A Java Future containing the result of the TransferCertificate operation returned by the service.
     * @sample AWSIotAsync.TransferCertificate
     */
    java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(TransferCertificateRequest transferCertificateRequest);

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer
     * target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to
     * deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach
     * them.
     * </p>
     * 
     * @param transferCertificateRequest
     *        The input for the TransferCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TransferCertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.TransferCertificate
     */
    java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(TransferCertificateRequest transferCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<TransferCertificateRequest, TransferCertificateResult> asyncHandler);

    /**
     * <p>
     * Updates a registered CA certificate.
     * </p>
     * 
     * @param updateCACertificateRequest
     *        The input to the UpdateCACertificate operation.
     * @return A Java Future containing the result of the UpdateCACertificate operation returned by the service.
     * @sample AWSIotAsync.UpdateCACertificate
     */
    java.util.concurrent.Future<UpdateCACertificateResult> updateCACertificateAsync(UpdateCACertificateRequest updateCACertificateRequest);

    /**
     * <p>
     * Updates a registered CA certificate.
     * </p>
     * 
     * @param updateCACertificateRequest
     *        The input to the UpdateCACertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCACertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateCACertificate
     */
    java.util.concurrent.Future<UpdateCACertificateResult> updateCACertificateAsync(UpdateCACertificateRequest updateCACertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCACertificateRequest, UpdateCACertificateResult> asyncHandler);

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is idempotent.
     * </p>
     * <p>
     * Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices,
     * but these devices will be unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     *        The input for the UpdateCertificate operation.
     * @return A Java Future containing the result of the UpdateCertificate operation returned by the service.
     * @sample AWSIotAsync.UpdateCertificate
     */
    java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(UpdateCertificateRequest updateCertificateRequest);

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is idempotent.
     * </p>
     * <p>
     * Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices,
     * but these devices will be unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     *        The input for the UpdateCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateCertificate
     */
    java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(UpdateCertificateRequest updateCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCertificateRequest, UpdateCertificateResult> asyncHandler);

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @return A Java Future containing the result of the UpdateThing operation returned by the service.
     * @sample AWSIotAsync.UpdateThing
     */
    java.util.concurrent.Future<UpdateThingResult> updateThingAsync(UpdateThingRequest updateThingRequest);

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThing operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateThing
     */
    java.util.concurrent.Future<UpdateThingResult> updateThingAsync(UpdateThingRequest updateThingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThingRequest, UpdateThingResult> asyncHandler);

}
