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
package com.amazonaws.services.iot;

import com.amazonaws.services.iot.model.*;

/**
 * Interface for accessing AWS IoT asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the AWS cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and
 * integration with other services, organize resources associated with each
 * thing (Thing Registry), configure logging, and create and manage policies and
 * credentials to authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"
 * >Developer Guide</a>.
 * </p>
 */
public interface AWSIotAsync extends AWSIot {

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the
     * certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * 
     * @param acceptCertificateTransferRequest
     *        The input for the AcceptCertificateTransfer operation.
     * @sample AWSIotAsync.AcceptCertificateTransfer
     */
    java.util.concurrent.Future<Void> acceptCertificateTransferAsync(
            AcceptCertificateTransferRequest acceptCertificateTransferRequest);

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the
     * certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * 
     * @param acceptCertificateTransferRequest
     *        The input for the AcceptCertificateTransfer operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.AcceptCertificateTransfer
     */
    java.util.concurrent.Future<Void> acceptCertificateTransferAsync(
            AcceptCertificateTransferRequest acceptCertificateTransferRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptCertificateTransferRequest, Void> asyncHandler);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or
     * other credential).
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @sample AWSIotAsync.AttachPrincipalPolicy
     */
    java.util.concurrent.Future<Void> attachPrincipalPolicyAsync(
            AttachPrincipalPolicyRequest attachPrincipalPolicyRequest);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or
     * other credential).
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.AttachPrincipalPolicy
     */
    java.util.concurrent.Future<Void> attachPrincipalPolicyAsync(
            AttachPrincipalPolicyRequest attachPrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachPrincipalPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Attaches the specified principal to the specified thing.
     * </p>
     * 
     * @param attachThingPrincipalRequest
     *        The input for the AttachThingPrincipal operation.
     * @return A Java Future containing the result of the AttachThingPrincipal
     *         operation returned by the service.
     * @sample AWSIotAsync.AttachThingPrincipal
     */
    java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(
            AttachThingPrincipalRequest attachThingPrincipalRequest);

    /**
     * <p>
     * Attaches the specified principal to the specified thing.
     * </p>
     * 
     * @param attachThingPrincipalRequest
     *        The input for the AttachThingPrincipal operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachThingPrincipal
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.AttachThingPrincipal
     */
    java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(
            AttachThingPrincipalRequest attachThingPrincipalRequest,
            com.amazonaws.handlers.AsyncHandler<AttachThingPrincipalRequest, AttachThingPrincipalResult> asyncHandler);

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to
     * cancel a transfer (transfer destinations can use
     * <a>RejectCertificateTransfer</a> instead). After transfer, AWS IoT
     * returns the certificate to the source account in the INACTIVE state. Once
     * the destination account has accepted the transfer, the transfer may no
     * longer be cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate
     * changes from PENDING_TRANSFER to INACTIVE.
     * </p>
     * 
     * @param cancelCertificateTransferRequest
     *        The input for the CancelCertificateTransfer operation.
     * @sample AWSIotAsync.CancelCertificateTransfer
     */
    java.util.concurrent.Future<Void> cancelCertificateTransferAsync(
            CancelCertificateTransferRequest cancelCertificateTransferRequest);

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to
     * cancel a transfer (transfer destinations can use
     * <a>RejectCertificateTransfer</a> instead). After transfer, AWS IoT
     * returns the certificate to the source account in the INACTIVE state. Once
     * the destination account has accepted the transfer, the transfer may no
     * longer be cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate
     * changes from PENDING_TRANSFER to INACTIVE.
     * </p>
     * 
     * @param cancelCertificateTransferRequest
     *        The input for the CancelCertificateTransfer operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.CancelCertificateTransfer
     */
    java.util.concurrent.Future<Void> cancelCertificateTransferAsync(
            CancelCertificateTransferRequest cancelCertificateTransferRequest,
            com.amazonaws.handlers.AsyncHandler<CancelCertificateTransferRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR) results in
     * a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory
     * and copying multiple .csr files into that directory and specifying that
     * directory on the command line. The following commands show how to create
     * a batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory
     * my-csr-directory:
     * </p>
     * &gt;
     * <p>
     * On Linux and OSX, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR
     * filename to the aws iot create-certificate-from-csr AWS CLI command to
     * create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be
     * run in parallel to speed up the certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in
     * my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/$_}
     * </p>
     * <p>
     * On Windows Command Prompt, the command to create certificates for all
     * CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest
     *        The input for the CreateCertificateFromCsr operation.
     * @return A Java Future containing the result of the
     *         CreateCertificateFromCsr operation returned by the service.
     * @sample AWSIotAsync.CreateCertificateFromCsr
     */
    java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(
            CreateCertificateFromCsrRequest createCertificateFromCsrRequest);

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR) results in
     * a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory
     * and copying multiple .csr files into that directory and specifying that
     * directory on the command line. The following commands show how to create
     * a batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory
     * my-csr-directory:
     * </p>
     * &gt;
     * <p>
     * On Linux and OSX, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR
     * filename to the aws iot create-certificate-from-csr AWS CLI command to
     * create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be
     * run in parallel to speed up the certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in
     * my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/$_}
     * </p>
     * <p>
     * On Windows Command Prompt, the command to create certificates for all
     * CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest
     *        The input for the CreateCertificateFromCsr operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateCertificateFromCsr operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateCertificateFromCsr
     */
    java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(
            CreateCertificateFromCsrRequest createCertificateFromCsrRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCertificateFromCsrRequest, CreateCertificateFromCsrResult> asyncHandler);

    /**
     * <p>
     * Creates a 2048 bit RSA key pair and issues an X.509 certificate using the
     * issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this
     * certificate. It is important to keep track of the private key.
     * </p>
     * 
     * @param createKeysAndCertificateRequest
     *        The input for the CreateKeysAndCertificate operation.
     * @return A Java Future containing the result of the
     *         CreateKeysAndCertificate operation returned by the service.
     * @sample AWSIotAsync.CreateKeysAndCertificate
     */
    java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(
            CreateKeysAndCertificateRequest createKeysAndCertificateRequest);

    /**
     * <p>
     * Creates a 2048 bit RSA key pair and issues an X.509 certificate using the
     * issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this
     * certificate. It is important to keep track of the private key.
     * </p>
     * 
     * @param createKeysAndCertificateRequest
     *        The input for the CreateKeysAndCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateKeysAndCertificate operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateKeysAndCertificate
     */
    java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(
            CreateKeysAndCertificateRequest createKeysAndCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeysAndCertificateRequest, CreateKeysAndCertificateResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation
     * creates a policy version with a version identifier of <b>1</b> and sets
     * <b>1</b> as the policy's default version.
     * </p>
     * 
     * @param createPolicyRequest
     *        The input for the CreatePolicy operation.
     * @return A Java Future containing the result of the CreatePolicy operation
     *         returned by the service.
     * @sample AWSIotAsync.CreatePolicy
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation
     * creates a policy version with a version identifier of <b>1</b> and sets
     * <b>1</b> as the policy's default version.
     * </p>
     * 
     * @param createPolicyRequest
     *        The input for the CreatePolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicy operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.CreatePolicy
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest createPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a
     * policy, create a new policy version. A managed policy can have up to five
     * versions. If the policy has five versions, you must delete an existing
     * version using <a>DeletePolicyVersion</a> before you create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version; that is, the version that
     * is in effect for the certificates that the policy is attached to.
     * </p>
     * 
     * @param createPolicyVersionRequest
     *        The input for the CreatePolicyVersion operation.
     * @return A Java Future containing the result of the CreatePolicyVersion
     *         operation returned by the service.
     * @sample AWSIotAsync.CreatePolicyVersion
     */
    java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest createPolicyVersionRequest);

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a
     * policy, create a new policy version. A managed policy can have up to five
     * versions. If the policy has five versions, you must delete an existing
     * version using <a>DeletePolicyVersion</a> before you create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version; that is, the version that
     * is in effect for the certificates that the policy is attached to.
     * </p>
     * 
     * @param createPolicyVersionRequest
     *        The input for the CreatePolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicyVersion
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.CreatePolicyVersion
     */
    java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest createPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a thing in the thing registry.
     * </p>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @return A Java Future containing the result of the CreateThing operation
     *         returned by the service.
     * @sample AWSIotAsync.CreateThing
     */
    java.util.concurrent.Future<CreateThingResult> createThingAsync(
            CreateThingRequest createThingRequest);

    /**
     * <p>
     * Creates a thing in the thing registry.
     * </p>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThing operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.CreateThing
     */
    java.util.concurrent.Future<CreateThingResult> createThingAsync(
            CreateThingRequest createThingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThingRequest, CreateThingResult> asyncHandler);

    /**
     * <p>
     * Creates a rule.
     * </p>
     * 
     * @param createTopicRuleRequest
     *        The input for the CreateTopicRule operation.
     * @sample AWSIotAsync.CreateTopicRule
     */
    java.util.concurrent.Future<Void> createTopicRuleAsync(
            CreateTopicRuleRequest createTopicRuleRequest);

    /**
     * <p>
     * Creates a rule.
     * </p>
     * 
     * @param createTopicRuleRequest
     *        The input for the CreateTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.CreateTopicRule
     */
    java.util.concurrent.Future<Void> createTopicRuleAsync(
            CreateTopicRuleRequest createTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRuleRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or if
     * its status is set to ACTIVE. To delete a certificate, first detach all
     * policies using the <a>DetachPrincipalPolicy</a> API. Next use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE
     * status.
     * </p>
     * 
     * @param deleteCertificateRequest
     *        The input for the DeleteCertificate operation.
     * @sample AWSIotAsync.DeleteCertificate
     */
    java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or if
     * its status is set to ACTIVE. To delete a certificate, first detach all
     * policies using the <a>DetachPrincipalPolicy</a> API. Next use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE
     * status.
     * </p>
     * 
     * @param deleteCertificateRequest
     *        The input for the DeleteCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.DeleteCertificate
     */
    java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions and/or it is
     * attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, delete all non-default versions of the policy using
     * the DeletePolicyVersion API, detach the policy from any certificate using
     * the DetachPrincipalPolicy API, and then use the DeletePolicy API to
     * delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
     * </p>
     * 
     * @param deletePolicyRequest
     *        The input for the DeletePolicy operation.
     * @sample AWSIotAsync.DeletePolicy
     */
    java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions and/or it is
     * attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, delete all non-default versions of the policy using
     * the DeletePolicyVersion API, detach the policy from any certificate using
     * the DetachPrincipalPolicy API, and then use the DeletePolicy API to
     * delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
     * </p>
     * 
     * @param deletePolicyRequest
     *        The input for the DeletePolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.DeletePolicy
     */
    java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete
     * the default version of a policy using this API. To delete the default
     * version of a policy, use <a>DeletePolicy</a>. To find out which version
     * of a policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     *        The input for the DeletePolicyVersion operation.
     * @sample AWSIotAsync.DeletePolicyVersion
     */
    java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest deletePolicyVersionRequest);

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete
     * the default version of a policy using this API. To delete the default
     * version of a policy, use <a>DeletePolicy</a>. To find out which version
     * of a policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     *        The input for the DeletePolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.DeletePolicyVersion
     */
    java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest deletePolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified thing from the Thing Registry.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @return A Java Future containing the result of the DeleteThing operation
     *         returned by the service.
     * @sample AWSIotAsync.DeleteThing
     */
    java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(
            DeleteThingRequest deleteThingRequest);

    /**
     * <p>
     * Deletes the specified thing from the Thing Registry.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThing operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.DeleteThing
     */
    java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(
            DeleteThingRequest deleteThingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThingRequest, DeleteThingResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest
     *        The input for the DeleteTopicRule operation.
     * @sample AWSIotAsync.DeleteTopicRule
     */
    java.util.concurrent.Future<Void> deleteTopicRuleAsync(
            DeleteTopicRuleRequest deleteTopicRuleRequest);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest
     *        The input for the DeleteTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.DeleteTopicRule
     */
    java.util.concurrent.Future<Void> deleteTopicRuleAsync(
            DeleteTopicRuleRequest deleteTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRuleRequest, Void> asyncHandler);

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     *        The input for the DescribeCertificate operation.
     * @return A Java Future containing the result of the DescribeCertificate
     *         operation returned by the service.
     * @sample AWSIotAsync.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     *        The input for the DescribeCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificate
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest describeCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler);

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the call.
     * You specify the following URI when updating state information for your
     * thing: https://<i>endpoint</i>/things/<i>thingName</i>/shadow.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @return A Java Future containing the result of the DescribeEndpoint
     *         operation returned by the service.
     * @sample AWSIotAsync.DescribeEndpoint
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(
            DescribeEndpointRequest describeEndpointRequest);

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the call.
     * You specify the following URI when updating state information for your
     * thing: https://<i>endpoint</i>/things/<i>thingName</i>/shadow.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoint
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeEndpoint
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(
            DescribeEndpointRequest describeEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest
     *        The input for the DescribeThing operation.
     * @return A Java Future containing the result of the DescribeThing
     *         operation returned by the service.
     * @sample AWSIotAsync.DescribeThing
     */
    java.util.concurrent.Future<DescribeThingResult> describeThingAsync(
            DescribeThingRequest describeThingRequest);

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest
     *        The input for the DescribeThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThing
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeThing
     */
    java.util.concurrent.Future<DescribeThingResult> describeThingAsync(
            DescribeThingRequest describeThingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThingRequest, DescribeThingResult> asyncHandler);

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @sample AWSIotAsync.DetachPrincipalPolicy
     */
    java.util.concurrent.Future<Void> detachPrincipalPolicyAsync(
            DetachPrincipalPolicyRequest detachPrincipalPolicyRequest);

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.DetachPrincipalPolicy
     */
    java.util.concurrent.Future<Void> detachPrincipalPolicyAsync(
            DetachPrincipalPolicyRequest detachPrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachPrincipalPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @return A Java Future containing the result of the DetachThingPrincipal
     *         operation returned by the service.
     * @sample AWSIotAsync.DetachThingPrincipal
     */
    java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(
            DetachThingPrincipalRequest detachThingPrincipalRequest);

    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachThingPrincipal
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.DetachThingPrincipal
     */
    java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(
            DetachThingPrincipalRequest detachThingPrincipalRequest,
            com.amazonaws.handlers.AsyncHandler<DetachThingPrincipalRequest, DetachThingPrincipalResult> asyncHandler);

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     *        The input for the GetLoggingOptions operation.
     * @return A Java Future containing the result of the GetLoggingOptions
     *         operation returned by the service.
     * @sample AWSIotAsync.GetLoggingOptions
     */
    java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(
            GetLoggingOptionsRequest getLoggingOptionsRequest);

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     *        The input for the GetLoggingOptions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggingOptions
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.GetLoggingOptions
     */
    java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(
            GetLoggingOptionsRequest getLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggingOptionsRequest, GetLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified policy with the policy document of
     * the default version.
     * </p>
     * 
     * @param getPolicyRequest
     *        The input for the GetPolicy operation.
     * @return A Java Future containing the result of the GetPolicy operation
     *         returned by the service.
     * @sample AWSIotAsync.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Gets information about the specified policy with the policy document of
     * the default version.
     * </p>
     * 
     * @param getPolicyRequest
     *        The input for the GetPolicy operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * 
     * @param getPolicyVersionRequest
     *        The input for the GetPolicyVersion operation.
     * @return A Java Future containing the result of the GetPolicyVersion
     *         operation returned by the service.
     * @sample AWSIotAsync.GetPolicyVersion
     */
    java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest getPolicyVersionRequest);

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * 
     * @param getPolicyVersionRequest
     *        The input for the GetPolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicyVersion
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.GetPolicyVersion
     */
    java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest getPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     * 
     * @param getTopicRuleRequest
     *        The input for the GetTopicRule operation.
     * @return A Java Future containing the result of the GetTopicRule operation
     *         returned by the service.
     * @sample AWSIotAsync.GetTopicRule
     */
    java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(
            GetTopicRuleRequest getTopicRuleRequest);

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     * 
     * @param getTopicRuleRequest
     *        The input for the GetTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTopicRule operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.GetTopicRule
     */
    java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(
            GetTopicRuleRequest getTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetTopicRuleRequest, GetTopicRuleResult> asyncHandler);

    /**
     * <p>
     * Lists your certificates.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can
     * retrieve additional results using the returned marker.
     * </p>
     * 
     * @param listCertificatesRequest
     *        The input for the ListCertificates operation.
     * @return A Java Future containing the result of the ListCertificates
     *         operation returned by the service.
     * @sample AWSIotAsync.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Lists your certificates.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can
     * retrieve additional results using the returned marker.
     * </p>
     * 
     * @param listCertificatesRequest
     *        The input for the ListCertificates operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificates
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest listCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler);

    /**
     * <p>
     * Lists your policies.
     * </p>
     * 
     * @param listPoliciesRequest
     *        The input for the ListPolicies operation.
     * @return A Java Future containing the result of the ListPolicies operation
     *         returned by the service.
     * @sample AWSIotAsync.ListPolicies
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Lists your policies.
     * </p>
     * 
     * @param listPoliciesRequest
     *        The input for the ListPolicies operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicies operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.ListPolicies
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest listPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the versions of the specified policy, and identifies the default
     * version.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     *        The input for the ListPolicyVersions operation.
     * @return A Java Future containing the result of the ListPolicyVersions
     *         operation returned by the service.
     * @sample AWSIotAsync.ListPolicyVersions
     */
    java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest listPolicyVersionsRequest);

    /**
     * <p>
     * Lists the versions of the specified policy, and identifies the default
     * version.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     *        The input for the ListPolicyVersions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicyVersions
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPolicyVersions
     */
    java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest listPolicyVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an
     * Amazon Cognito identity, the ID needs to be in <a href=
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >Amazon Cognito Identity format</a>.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @return A Java Future containing the result of the ListPrincipalPolicies
     *         operation returned by the service.
     * @sample AWSIotAsync.ListPrincipalPolicies
     */
    java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(
            ListPrincipalPoliciesRequest listPrincipalPoliciesRequest);

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an
     * Amazon Cognito identity, the ID needs to be in <a href=
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >Amazon Cognito Identity format</a>.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrincipalPolicies
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPrincipalPolicies
     */
    java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(
            ListPrincipalPoliciesRequest listPrincipalPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalPoliciesRequest, ListPrincipalPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     * 
     * @param listPrincipalThingsRequest
     *        The input for the ListPrincipalThings operation.
     * @return A Java Future containing the result of the ListPrincipalThings
     *         operation returned by the service.
     * @sample AWSIotAsync.ListPrincipalThings
     */
    java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(
            ListPrincipalThingsRequest listPrincipalThingsRequest);

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     * 
     * @param listPrincipalThingsRequest
     *        The input for the ListPrincipalThings operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrincipalThings
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.ListPrincipalThings
     */
    java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(
            ListPrincipalThingsRequest listPrincipalThingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalThingsRequest, ListPrincipalThingsResult> asyncHandler);

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     * 
     * @param listThingPrincipalsRequest
     *        The input for the ListThingPrincipal operation.
     * @return A Java Future containing the result of the ListThingPrincipals
     *         operation returned by the service.
     * @sample AWSIotAsync.ListThingPrincipals
     */
    java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(
            ListThingPrincipalsRequest listThingPrincipalsRequest);

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     * 
     * @param listThingPrincipalsRequest
     *        The input for the ListThingPrincipal operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingPrincipals
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingPrincipals
     */
    java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(
            ListThingPrincipalsRequest listThingPrincipalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingPrincipalsRequest, ListThingPrincipalsResult> asyncHandler);

    /**
     * <p>
     * Lists your things. You can pass an AttributeName and/or AttributeValue to
     * filter your things. For example:
     * "ListThings where AttributeName=Color and AttributeValue=Red"
     * </p>
     * 
     * @param listThingsRequest
     *        The input for the ListThings operation.
     * @return A Java Future containing the result of the ListThings operation
     *         returned by the service.
     * @sample AWSIotAsync.ListThings
     */
    java.util.concurrent.Future<ListThingsResult> listThingsAsync(
            ListThingsRequest listThingsRequest);

    /**
     * <p>
     * Lists your things. You can pass an AttributeName and/or AttributeValue to
     * filter your things. For example:
     * "ListThings where AttributeName=Color and AttributeValue=Red"
     * </p>
     * 
     * @param listThingsRequest
     *        The input for the ListThings operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThings operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.ListThings
     */
    java.util.concurrent.Future<ListThingsResult> listThingsAsync(
            ListThingsRequest listThingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingsRequest, ListThingsResult> asyncHandler);

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest
     *        The input for the ListTopicRules operation.
     * @return A Java Future containing the result of the ListTopicRules
     *         operation returned by the service.
     * @sample AWSIotAsync.ListTopicRules
     */
    java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(
            ListTopicRulesRequest listTopicRulesRequest);

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest
     *        The input for the ListTopicRules operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTopicRules
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.ListTopicRules
     */
    java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(
            ListTopicRulesRequest listTopicRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTopicRulesRequest, ListTopicRulesResult> asyncHandler);

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a
     * certificate transfer, the certificate status changes from
     * <b>PENDING_TRANFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. Once
     * called, the certificate will be returned to the source's account in the
     * INACTIVE state.
     * </p>
     * 
     * @param rejectCertificateTransferRequest
     *        The input for the RejectCertificateTransfer operation.
     * @sample AWSIotAsync.RejectCertificateTransfer
     */
    java.util.concurrent.Future<Void> rejectCertificateTransferAsync(
            RejectCertificateTransferRequest rejectCertificateTransferRequest);

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a
     * certificate transfer, the certificate status changes from
     * <b>PENDING_TRANFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. Once
     * called, the certificate will be returned to the source's account in the
     * INACTIVE state.
     * </p>
     * 
     * @param rejectCertificateTransferRequest
     *        The input for the RejectCertificateTransfer operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.RejectCertificateTransfer
     */
    java.util.concurrent.Future<Void> rejectCertificateTransferAsync(
            RejectCertificateTransferRequest rejectCertificateTransferRequest,
            com.amazonaws.handlers.AsyncHandler<RejectCertificateTransferRequest, Void> asyncHandler);

    /**
     * <p>
     * Replaces the specified rule. You must specify all parameters for the new
     * rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest
     *        The input for the ReplaceTopicRule operation.
     * @sample AWSIotAsync.ReplaceTopicRule
     */
    java.util.concurrent.Future<Void> replaceTopicRuleAsync(
            ReplaceTopicRuleRequest replaceTopicRuleRequest);

    /**
     * <p>
     * Replaces the specified rule. You must specify all parameters for the new
     * rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest
     *        The input for the ReplaceTopicRule operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.ReplaceTopicRule
     */
    java.util.concurrent.Future<Void> replaceTopicRuleAsync(
            ReplaceTopicRuleRequest replaceTopicRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ReplaceTopicRuleRequest, Void> asyncHandler);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates that
     * the policy is attached to. To list the principals the policy is attached
     * to, use the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     *        The input for the SetDefaultPolicyVersion operation.
     * @sample AWSIotAsync.SetDefaultPolicyVersion
     */
    java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates that
     * the policy is attached to. To list the principals the policy is attached
     * to, use the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     *        The input for the SetDefaultPolicyVersion operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.SetDefaultPolicyVersion
     */
    java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, Void> asyncHandler);

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * 
     * @param setLoggingOptionsRequest
     *        The input for the SetLoggingOptions operation.
     * @sample AWSIotAsync.SetLoggingOptions
     */
    java.util.concurrent.Future<Void> setLoggingOptionsAsync(
            SetLoggingOptionsRequest setLoggingOptionsRequest);

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * 
     * @param setLoggingOptionsRequest
     *        The input for the SetLoggingOptions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.SetLoggingOptions
     */
    java.util.concurrent.Future<Void> setLoggingOptionsAsync(
            SetLoggingOptionsRequest setLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<SetLoggingOptionsRequest, Void> asyncHandler);

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account, it is up
     * to the caller to notify the transfer target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. It can
     * be deactivated using the UpdateCertificate API.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. These can be
     * detached using the DetachPrincipalPolicy API.
     * </p>
     * 
     * @param transferCertificateRequest
     *        The input for the TransferCertificate operation.
     * @return A Java Future containing the result of the TransferCertificate
     *         operation returned by the service.
     * @sample AWSIotAsync.TransferCertificate
     */
    java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(
            TransferCertificateRequest transferCertificateRequest);

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account, it is up
     * to the caller to notify the transfer target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. It can
     * be deactivated using the UpdateCertificate API.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. These can be
     * detached using the DetachPrincipalPolicy API.
     * </p>
     * 
     * @param transferCertificateRequest
     *        The input for the TransferCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TransferCertificate
     *         operation returned by the service.
     * @sample AWSIotAsyncHandler.TransferCertificate
     */
    java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(
            TransferCertificateRequest transferCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<TransferCertificateRequest, TransferCertificateResult> asyncHandler);

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is
     * idempotent.
     * </p>
     * <p>
     * Moving a cert from the ACTIVE state (including REVOKED) will NOT
     * disconnect currently-connected devices, although these devices will be
     * unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS
     * IoT using a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     *        The input for the UpdateCertificate operation.
     * @sample AWSIotAsync.UpdateCertificate
     */
    java.util.concurrent.Future<Void> updateCertificateAsync(
            UpdateCertificateRequest updateCertificateRequest);

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is
     * idempotent.
     * </p>
     * <p>
     * Moving a cert from the ACTIVE state (including REVOKED) will NOT
     * disconnect currently-connected devices, although these devices will be
     * unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS
     * IoT using a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     *        The input for the UpdateCertificate operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSIotAsyncHandler.UpdateCertificate
     */
    java.util.concurrent.Future<Void> updateCertificateAsync(
            UpdateCertificateRequest updateCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCertificateRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @return A Java Future containing the result of the UpdateThing operation
     *         returned by the service.
     * @sample AWSIotAsync.UpdateThing
     */
    java.util.concurrent.Future<UpdateThingResult> updateThingAsync(
            UpdateThingRequest updateThingRequest);

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThing operation
     *         returned by the service.
     * @sample AWSIotAsyncHandler.UpdateThing
     */
    java.util.concurrent.Future<UpdateThingResult> updateThingAsync(
            UpdateThingRequest updateThingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThingRequest, UpdateThingResult> asyncHandler);

}
