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
package com.amazonaws.services.iot;

import javax.annotation.Generated;

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
 * AWS IoT provides secure, bi-directional communication between Internet-connected devices (such as sensors, actuators,
 * embedded devices, or smart appliances) and the AWS cloud. You can discover your custom IoT-Data endpoint to
 * communicate with, configure rules for data processing and integration with other services, organize resources
 * associated with each device (Registry), configure logging, and create and manage policies and credentials to
 * authenticate devices.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html">Developer Guide</a>.
 * </p>
 * <p>
 * For information about how to use the credentials provider for AWS IoT, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorizing-direct-aws.html">Authorizing Direct Calls to
 * AWS Services</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * Adds a thing to a billing group.
     * </p>
     * 
     * @param addThingToBillingGroupRequest
     * @return A Java Future containing the result of the AddThingToBillingGroup operation returned by the service.
     * @sample AWSIotAsync.AddThingToBillingGroup
     */
    java.util.concurrent.Future<AddThingToBillingGroupResult> addThingToBillingGroupAsync(AddThingToBillingGroupRequest addThingToBillingGroupRequest);

    /**
     * <p>
     * Adds a thing to a billing group.
     * </p>
     * 
     * @param addThingToBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddThingToBillingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.AddThingToBillingGroup
     */
    java.util.concurrent.Future<AddThingToBillingGroupResult> addThingToBillingGroupAsync(AddThingToBillingGroupRequest addThingToBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AddThingToBillingGroupRequest, AddThingToBillingGroupResult> asyncHandler);

    /**
     * <p>
     * Adds a thing to a thing group.
     * </p>
     * 
     * @param addThingToThingGroupRequest
     * @return A Java Future containing the result of the AddThingToThingGroup operation returned by the service.
     * @sample AWSIotAsync.AddThingToThingGroup
     */
    java.util.concurrent.Future<AddThingToThingGroupResult> addThingToThingGroupAsync(AddThingToThingGroupRequest addThingToThingGroupRequest);

    /**
     * <p>
     * Adds a thing to a thing group.
     * </p>
     * 
     * @param addThingToThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddThingToThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.AddThingToThingGroup
     */
    java.util.concurrent.Future<AddThingToThingGroupResult> addThingToThingGroupAsync(AddThingToThingGroupRequest addThingToThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AddThingToThingGroupRequest, AddThingToThingGroupResult> asyncHandler);

    /**
     * <p>
     * Associates a group with a continuous job. The following criteria must be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The job must have been created with the <code>targetSelection</code> field set to "CONTINUOUS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The job status must currently be "IN_PROGRESS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of targets associated with a job must not exceed 100.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateTargetsWithJobRequest
     * @return A Java Future containing the result of the AssociateTargetsWithJob operation returned by the service.
     * @sample AWSIotAsync.AssociateTargetsWithJob
     */
    java.util.concurrent.Future<AssociateTargetsWithJobResult> associateTargetsWithJobAsync(AssociateTargetsWithJobRequest associateTargetsWithJobRequest);

    /**
     * <p>
     * Associates a group with a continuous job. The following criteria must be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The job must have been created with the <code>targetSelection</code> field set to "CONTINUOUS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The job status must currently be "IN_PROGRESS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of targets associated with a job must not exceed 100.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateTargetsWithJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateTargetsWithJob operation returned by the service.
     * @sample AWSIotAsyncHandler.AssociateTargetsWithJob
     */
    java.util.concurrent.Future<AssociateTargetsWithJobResult> associateTargetsWithJobAsync(AssociateTargetsWithJobRequest associateTargetsWithJobRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateTargetsWithJobRequest, AssociateTargetsWithJobResult> asyncHandler);

    /**
     * <p>
     * Attaches a policy to the specified target.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return A Java Future containing the result of the AttachPolicy operation returned by the service.
     * @sample AWSIotAsync.AttachPolicy
     */
    java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest attachPolicyRequest);

    /**
     * <p>
     * Attaches a policy to the specified target.
     * </p>
     * 
     * @param attachPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachPolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.AttachPolicy
     */
    java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest attachPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachPolicyRequest, AttachPolicyResult> asyncHandler);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or other credential).
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>AttachPolicy</a> instead.
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @return A Java Future containing the result of the AttachPrincipalPolicy operation returned by the service.
     * @sample AWSIotAsync.AttachPrincipalPolicy
     */
    @Deprecated
    java.util.concurrent.Future<AttachPrincipalPolicyResult> attachPrincipalPolicyAsync(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or other credential).
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>AttachPolicy</a> instead.
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
    @Deprecated
    java.util.concurrent.Future<AttachPrincipalPolicyResult> attachPrincipalPolicyAsync(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachPrincipalPolicyRequest, AttachPrincipalPolicyResult> asyncHandler);

    /**
     * <p>
     * Associates a Device Defender security profile with a thing group or with this account. Each thing group or
     * account can have up to five security profiles associated with it.
     * </p>
     * 
     * @param attachSecurityProfileRequest
     * @return A Java Future containing the result of the AttachSecurityProfile operation returned by the service.
     * @sample AWSIotAsync.AttachSecurityProfile
     */
    java.util.concurrent.Future<AttachSecurityProfileResult> attachSecurityProfileAsync(AttachSecurityProfileRequest attachSecurityProfileRequest);

    /**
     * <p>
     * Associates a Device Defender security profile with a thing group or with this account. Each thing group or
     * account can have up to five security profiles associated with it.
     * </p>
     * 
     * @param attachSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachSecurityProfile operation returned by the service.
     * @sample AWSIotAsyncHandler.AttachSecurityProfile
     */
    java.util.concurrent.Future<AttachSecurityProfileResult> attachSecurityProfileAsync(AttachSecurityProfileRequest attachSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<AttachSecurityProfileRequest, AttachSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
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
     * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
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
     * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in
     * progress, an "InvalidRequestException" occurs.
     * </p>
     * 
     * @param cancelAuditTaskRequest
     * @return A Java Future containing the result of the CancelAuditTask operation returned by the service.
     * @sample AWSIotAsync.CancelAuditTask
     */
    java.util.concurrent.Future<CancelAuditTaskResult> cancelAuditTaskAsync(CancelAuditTaskRequest cancelAuditTaskRequest);

    /**
     * <p>
     * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in
     * progress, an "InvalidRequestException" occurs.
     * </p>
     * 
     * @param cancelAuditTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelAuditTask operation returned by the service.
     * @sample AWSIotAsyncHandler.CancelAuditTask
     */
    java.util.concurrent.Future<CancelAuditTaskResult> cancelAuditTaskAsync(CancelAuditTaskRequest cancelAuditTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelAuditTaskRequest, CancelAuditTaskResult> asyncHandler);

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
     * Cancels a job.
     * </p>
     * 
     * @param cancelJobRequest
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSIotAsync.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Cancels a job.
     * </p>
     * 
     * @param cancelJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSIotAsyncHandler.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * <p>
     * Cancels the execution of a job for a given thing.
     * </p>
     * 
     * @param cancelJobExecutionRequest
     * @return A Java Future containing the result of the CancelJobExecution operation returned by the service.
     * @sample AWSIotAsync.CancelJobExecution
     */
    java.util.concurrent.Future<CancelJobExecutionResult> cancelJobExecutionAsync(CancelJobExecutionRequest cancelJobExecutionRequest);

    /**
     * <p>
     * Cancels the execution of a job for a given thing.
     * </p>
     * 
     * @param cancelJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJobExecution operation returned by the service.
     * @sample AWSIotAsyncHandler.CancelJobExecution
     */
    java.util.concurrent.Future<CancelJobExecutionResult> cancelJobExecutionAsync(CancelJobExecutionRequest cancelJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobExecutionRequest, CancelJobExecutionResult> asyncHandler);

    /**
     * <p>
     * Clears the default authorizer.
     * </p>
     * 
     * @param clearDefaultAuthorizerRequest
     * @return A Java Future containing the result of the ClearDefaultAuthorizer operation returned by the service.
     * @sample AWSIotAsync.ClearDefaultAuthorizer
     */
    java.util.concurrent.Future<ClearDefaultAuthorizerResult> clearDefaultAuthorizerAsync(ClearDefaultAuthorizerRequest clearDefaultAuthorizerRequest);

    /**
     * <p>
     * Clears the default authorizer.
     * </p>
     * 
     * @param clearDefaultAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ClearDefaultAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.ClearDefaultAuthorizer
     */
    java.util.concurrent.Future<ClearDefaultAuthorizerResult> clearDefaultAuthorizerAsync(ClearDefaultAuthorizerRequest clearDefaultAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<ClearDefaultAuthorizerRequest, ClearDefaultAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Creates an authorizer.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @return A Java Future containing the result of the CreateAuthorizer operation returned by the service.
     * @sample AWSIotAsync.CreateAuthorizer
     */
    java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest createAuthorizerRequest);

    /**
     * <p>
     * Creates an authorizer.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateAuthorizer
     */
    java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest createAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAuthorizerRequest, CreateAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Creates a billing group.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @return A Java Future containing the result of the CreateBillingGroup operation returned by the service.
     * @sample AWSIotAsync.CreateBillingGroup
     */
    java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(CreateBillingGroupRequest createBillingGroupRequest);

    /**
     * <p>
     * Creates a billing group.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBillingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateBillingGroup
     */
    java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(CreateBillingGroupRequest createBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBillingGroupRequest, CreateBillingGroupResult> asyncHandler);

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing request.
     * </p>
     * <p>
     * <b>Note:</b> The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or
     * an ECC key from NIST P-256 or NIST P-384 curves.
     * </p>
     * <p>
     * <b>Note:</b> Reusing the same certificate signing request (CSR) results in a distinct certificate.
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
     * <b>Note:</b> The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or
     * an ECC key from NIST P-256 or NIST P-384 curves.
     * </p>
     * <p>
     * <b>Note:</b> Reusing the same certificate signing request (CSR) results in a distinct certificate.
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
     * Creates a dynamic thing group.
     * </p>
     * 
     * @param createDynamicThingGroupRequest
     * @return A Java Future containing the result of the CreateDynamicThingGroup operation returned by the service.
     * @sample AWSIotAsync.CreateDynamicThingGroup
     */
    java.util.concurrent.Future<CreateDynamicThingGroupResult> createDynamicThingGroupAsync(CreateDynamicThingGroupRequest createDynamicThingGroupRequest);

    /**
     * <p>
     * Creates a dynamic thing group.
     * </p>
     * 
     * @param createDynamicThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDynamicThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateDynamicThingGroup
     */
    java.util.concurrent.Future<CreateDynamicThingGroupResult> createDynamicThingGroupAsync(CreateDynamicThingGroupRequest createDynamicThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDynamicThingGroupRequest, CreateDynamicThingGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a job.
     * </p>
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSIotAsync.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates a job.
     * </p>
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

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
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     * </p>
     * 
     * @param createOTAUpdateRequest
     * @return A Java Future containing the result of the CreateOTAUpdate operation returned by the service.
     * @sample AWSIotAsync.CreateOTAUpdate
     */
    java.util.concurrent.Future<CreateOTAUpdateResult> createOTAUpdateAsync(CreateOTAUpdateRequest createOTAUpdateRequest);

    /**
     * <p>
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     * </p>
     * 
     * @param createOTAUpdateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOTAUpdate operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateOTAUpdate
     */
    java.util.concurrent.Future<CreateOTAUpdateResult> createOTAUpdateAsync(CreateOTAUpdateRequest createOTAUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOTAUpdateRequest, CreateOTAUpdateResult> asyncHandler);

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
     * Creates a role alias.
     * </p>
     * 
     * @param createRoleAliasRequest
     * @return A Java Future containing the result of the CreateRoleAlias operation returned by the service.
     * @sample AWSIotAsync.CreateRoleAlias
     */
    java.util.concurrent.Future<CreateRoleAliasResult> createRoleAliasAsync(CreateRoleAliasRequest createRoleAliasRequest);

    /**
     * <p>
     * Creates a role alias.
     * </p>
     * 
     * @param createRoleAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoleAlias operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateRoleAlias
     */
    java.util.concurrent.Future<CreateRoleAliasResult> createRoleAliasAsync(CreateRoleAliasRequest createRoleAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoleAliasRequest, CreateRoleAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a scheduled audit that is run at a specified time interval.
     * </p>
     * 
     * @param createScheduledAuditRequest
     * @return A Java Future containing the result of the CreateScheduledAudit operation returned by the service.
     * @sample AWSIotAsync.CreateScheduledAudit
     */
    java.util.concurrent.Future<CreateScheduledAuditResult> createScheduledAuditAsync(CreateScheduledAuditRequest createScheduledAuditRequest);

    /**
     * <p>
     * Creates a scheduled audit that is run at a specified time interval.
     * </p>
     * 
     * @param createScheduledAuditRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScheduledAudit operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateScheduledAudit
     */
    java.util.concurrent.Future<CreateScheduledAuditResult> createScheduledAuditAsync(CreateScheduledAuditRequest createScheduledAuditRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScheduledAuditRequest, CreateScheduledAuditResult> asyncHandler);

    /**
     * <p>
     * Creates a Device Defender security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return A Java Future containing the result of the CreateSecurityProfile operation returned by the service.
     * @sample AWSIotAsync.CreateSecurityProfile
     */
    java.util.concurrent.Future<CreateSecurityProfileResult> createSecurityProfileAsync(CreateSecurityProfileRequest createSecurityProfileRequest);

    /**
     * <p>
     * Creates a Device Defender security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecurityProfile operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateSecurityProfile
     */
    java.util.concurrent.Future<CreateSecurityProfileResult> createSecurityProfileAsync(CreateSecurityProfileRequest createSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityProfileRequest, CreateSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
     * chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
     * a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be
     * created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted
     * within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     * </p>
     * 
     * @param createStreamRequest
     * @return A Java Future containing the result of the CreateStream operation returned by the service.
     * @sample AWSIotAsync.CreateStream
     */
    java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest createStreamRequest);

    /**
     * <p>
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
     * chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
     * a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be
     * created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted
     * within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     * </p>
     * 
     * @param createStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStream operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateStream
     */
    java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest createStreamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler);

    /**
     * <p>
     * Creates a thing record in the registry. If this call is made multiple times using the same thing name and
     * configuration, the call will succeed. If this call is made with the same thing name but different configuration a
     * <code>ResourceAlreadyExistsException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html">Authorization</a> for information
     * about authorizing control plane actions.
     * </p>
     * </note>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @return A Java Future containing the result of the CreateThing operation returned by the service.
     * @sample AWSIotAsync.CreateThing
     */
    java.util.concurrent.Future<CreateThingResult> createThingAsync(CreateThingRequest createThingRequest);

    /**
     * <p>
     * Creates a thing record in the registry. If this call is made multiple times using the same thing name and
     * configuration, the call will succeed. If this call is made with the same thing name but different configuration a
     * <code>ResourceAlreadyExistsException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html">Authorization</a> for information
     * about authorizing control plane actions.
     * </p>
     * </note>
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
     * Create a thing group.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html">Authorization</a> for information
     * about authorizing control plane actions.
     * </p>
     * </note>
     * 
     * @param createThingGroupRequest
     * @return A Java Future containing the result of the CreateThingGroup operation returned by the service.
     * @sample AWSIotAsync.CreateThingGroup
     */
    java.util.concurrent.Future<CreateThingGroupResult> createThingGroupAsync(CreateThingGroupRequest createThingGroupRequest);

    /**
     * <p>
     * Create a thing group.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html">Authorization</a> for information
     * about authorizing control plane actions.
     * </p>
     * </note>
     * 
     * @param createThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.CreateThingGroup
     */
    java.util.concurrent.Future<CreateThingGroupResult> createThingGroupAsync(CreateThingGroupRequest createThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThingGroupRequest, CreateThingGroupResult> asyncHandler);

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
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is
     * deleted and all audit checks are reset to disabled.
     * </p>
     * 
     * @param deleteAccountAuditConfigurationRequest
     * @return A Java Future containing the result of the DeleteAccountAuditConfiguration operation returned by the
     *         service.
     * @sample AWSIotAsync.DeleteAccountAuditConfiguration
     */
    java.util.concurrent.Future<DeleteAccountAuditConfigurationResult> deleteAccountAuditConfigurationAsync(
            DeleteAccountAuditConfigurationRequest deleteAccountAuditConfigurationRequest);

    /**
     * <p>
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is
     * deleted and all audit checks are reset to disabled.
     * </p>
     * 
     * @param deleteAccountAuditConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccountAuditConfiguration operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.DeleteAccountAuditConfiguration
     */
    java.util.concurrent.Future<DeleteAccountAuditConfigurationResult> deleteAccountAuditConfigurationAsync(
            DeleteAccountAuditConfigurationRequest deleteAccountAuditConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountAuditConfigurationRequest, DeleteAccountAuditConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @return A Java Future containing the result of the DeleteAuthorizer operation returned by the service.
     * @sample AWSIotAsync.DeleteAuthorizer
     */
    java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest deleteAuthorizerRequest);

    /**
     * <p>
     * Deletes an authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteAuthorizer
     */
    java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest deleteAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAuthorizerRequest, DeleteAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Deletes the billing group.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @return A Java Future containing the result of the DeleteBillingGroup operation returned by the service.
     * @sample AWSIotAsync.DeleteBillingGroup
     */
    java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(DeleteBillingGroupRequest deleteBillingGroupRequest);

    /**
     * <p>
     * Deletes the billing group.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBillingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteBillingGroup
     */
    java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(DeleteBillingGroupRequest deleteBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBillingGroupRequest, DeleteBillingGroupResult> asyncHandler);

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
     * Deletes a dynamic thing group.
     * </p>
     * 
     * @param deleteDynamicThingGroupRequest
     * @return A Java Future containing the result of the DeleteDynamicThingGroup operation returned by the service.
     * @sample AWSIotAsync.DeleteDynamicThingGroup
     */
    java.util.concurrent.Future<DeleteDynamicThingGroupResult> deleteDynamicThingGroupAsync(DeleteDynamicThingGroupRequest deleteDynamicThingGroupRequest);

    /**
     * <p>
     * Deletes a dynamic thing group.
     * </p>
     * 
     * @param deleteDynamicThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDynamicThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteDynamicThingGroup
     */
    java.util.concurrent.Future<DeleteDynamicThingGroupResult> deleteDynamicThingGroupAsync(DeleteDynamicThingGroupRequest deleteDynamicThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDynamicThingGroupRequest, DeleteDynamicThingGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a job and its related job executions.
     * </p>
     * <p>
     * Deleting a job may take time, depending on the number of job executions created for the job and various other
     * factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS".
     * Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error.
     * </p>
     * <p>
     * Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
     * </p>
     * 
     * @param deleteJobRequest
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSIotAsync.DeleteJob
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a job and its related job executions.
     * </p>
     * <p>
     * Deleting a job may take time, depending on the number of job executions created for the job and various other
     * factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS".
     * Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error.
     * </p>
     * <p>
     * Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
     * </p>
     * 
     * @param deleteJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteJob
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a job execution.
     * </p>
     * 
     * @param deleteJobExecutionRequest
     * @return A Java Future containing the result of the DeleteJobExecution operation returned by the service.
     * @sample AWSIotAsync.DeleteJobExecution
     */
    java.util.concurrent.Future<DeleteJobExecutionResult> deleteJobExecutionAsync(DeleteJobExecutionRequest deleteJobExecutionRequest);

    /**
     * <p>
     * Deletes a job execution.
     * </p>
     * 
     * @param deleteJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJobExecution operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteJobExecution
     */
    java.util.concurrent.Future<DeleteJobExecutionResult> deleteJobExecutionAsync(DeleteJobExecutionRequest deleteJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobExecutionRequest, DeleteJobExecutionResult> asyncHandler);

    /**
     * <p>
     * Delete an OTA update.
     * </p>
     * 
     * @param deleteOTAUpdateRequest
     * @return A Java Future containing the result of the DeleteOTAUpdate operation returned by the service.
     * @sample AWSIotAsync.DeleteOTAUpdate
     */
    java.util.concurrent.Future<DeleteOTAUpdateResult> deleteOTAUpdateAsync(DeleteOTAUpdateRequest deleteOTAUpdateRequest);

    /**
     * <p>
     * Delete an OTA update.
     * </p>
     * 
     * @param deleteOTAUpdateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOTAUpdate operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteOTAUpdate
     */
    java.util.concurrent.Future<DeleteOTAUpdateResult> deleteOTAUpdateAsync(DeleteOTAUpdateRequest deleteOTAUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOTAUpdateRequest, DeleteOTAUpdateResult> asyncHandler);

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
     * Deletes a role alias
     * </p>
     * 
     * @param deleteRoleAliasRequest
     * @return A Java Future containing the result of the DeleteRoleAlias operation returned by the service.
     * @sample AWSIotAsync.DeleteRoleAlias
     */
    java.util.concurrent.Future<DeleteRoleAliasResult> deleteRoleAliasAsync(DeleteRoleAliasRequest deleteRoleAliasRequest);

    /**
     * <p>
     * Deletes a role alias
     * </p>
     * 
     * @param deleteRoleAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoleAlias operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteRoleAlias
     */
    java.util.concurrent.Future<DeleteRoleAliasResult> deleteRoleAliasAsync(DeleteRoleAliasRequest deleteRoleAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoleAliasRequest, DeleteRoleAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a scheduled audit.
     * </p>
     * 
     * @param deleteScheduledAuditRequest
     * @return A Java Future containing the result of the DeleteScheduledAudit operation returned by the service.
     * @sample AWSIotAsync.DeleteScheduledAudit
     */
    java.util.concurrent.Future<DeleteScheduledAuditResult> deleteScheduledAuditAsync(DeleteScheduledAuditRequest deleteScheduledAuditRequest);

    /**
     * <p>
     * Deletes a scheduled audit.
     * </p>
     * 
     * @param deleteScheduledAuditRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScheduledAudit operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteScheduledAudit
     */
    java.util.concurrent.Future<DeleteScheduledAuditResult> deleteScheduledAuditAsync(DeleteScheduledAuditRequest deleteScheduledAuditRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledAuditRequest, DeleteScheduledAuditResult> asyncHandler);

    /**
     * <p>
     * Deletes a Device Defender security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return A Java Future containing the result of the DeleteSecurityProfile operation returned by the service.
     * @sample AWSIotAsync.DeleteSecurityProfile
     */
    java.util.concurrent.Future<DeleteSecurityProfileResult> deleteSecurityProfileAsync(DeleteSecurityProfileRequest deleteSecurityProfileRequest);

    /**
     * <p>
     * Deletes a Device Defender security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecurityProfile operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteSecurityProfile
     */
    java.util.concurrent.Future<DeleteSecurityProfileResult> deleteSecurityProfileAsync(DeleteSecurityProfileRequest deleteSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityProfileRequest, DeleteSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a stream.
     * </p>
     * 
     * @param deleteStreamRequest
     * @return A Java Future containing the result of the DeleteStream operation returned by the service.
     * @sample AWSIotAsync.DeleteStream
     */
    java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest deleteStreamRequest);

    /**
     * <p>
     * Deletes a stream.
     * </p>
     * 
     * @param deleteStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStream operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteStream
     */
    java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest deleteStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a
     * thing that doesn't exist.
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
     * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a
     * thing that doesn't exist.
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
     * Deletes a thing group.
     * </p>
     * 
     * @param deleteThingGroupRequest
     * @return A Java Future containing the result of the DeleteThingGroup operation returned by the service.
     * @sample AWSIotAsync.DeleteThingGroup
     */
    java.util.concurrent.Future<DeleteThingGroupResult> deleteThingGroupAsync(DeleteThingGroupRequest deleteThingGroupRequest);

    /**
     * <p>
     * Deletes a thing group.
     * </p>
     * 
     * @param deleteThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteThingGroup
     */
    java.util.concurrent.Future<DeleteThingGroupResult> deleteThingGroupAsync(DeleteThingGroupRequest deleteThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThingGroupRequest, DeleteThingGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a
     * thing type, first mark it as deprecated by calling <a>DeprecateThingType</a>, then remove any associated things
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
     * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a
     * thing type, first mark it as deprecated by calling <a>DeprecateThingType</a>, then remove any associated things
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
     * Deletes the rule.
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
     * Deletes the rule.
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
     * Deletes a logging level.
     * </p>
     * 
     * @param deleteV2LoggingLevelRequest
     * @return A Java Future containing the result of the DeleteV2LoggingLevel operation returned by the service.
     * @sample AWSIotAsync.DeleteV2LoggingLevel
     */
    java.util.concurrent.Future<DeleteV2LoggingLevelResult> deleteV2LoggingLevelAsync(DeleteV2LoggingLevelRequest deleteV2LoggingLevelRequest);

    /**
     * <p>
     * Deletes a logging level.
     * </p>
     * 
     * @param deleteV2LoggingLevelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteV2LoggingLevel operation returned by the service.
     * @sample AWSIotAsyncHandler.DeleteV2LoggingLevel
     */
    java.util.concurrent.Future<DeleteV2LoggingLevelResult> deleteV2LoggingLevelAsync(DeleteV2LoggingLevelRequest deleteV2LoggingLevelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteV2LoggingLevelRequest, DeleteV2LoggingLevelResult> asyncHandler);

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
     * Gets information about the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * 
     * @param describeAccountAuditConfigurationRequest
     * @return A Java Future containing the result of the DescribeAccountAuditConfiguration operation returned by the
     *         service.
     * @sample AWSIotAsync.DescribeAccountAuditConfiguration
     */
    java.util.concurrent.Future<DescribeAccountAuditConfigurationResult> describeAccountAuditConfigurationAsync(
            DescribeAccountAuditConfigurationRequest describeAccountAuditConfigurationRequest);

    /**
     * <p>
     * Gets information about the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * 
     * @param describeAccountAuditConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAuditConfiguration operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.DescribeAccountAuditConfiguration
     */
    java.util.concurrent.Future<DescribeAccountAuditConfigurationResult> describeAccountAuditConfigurationAsync(
            DescribeAccountAuditConfigurationRequest describeAccountAuditConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAuditConfigurationRequest, DescribeAccountAuditConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Device Defender audit.
     * </p>
     * 
     * @param describeAuditTaskRequest
     * @return A Java Future containing the result of the DescribeAuditTask operation returned by the service.
     * @sample AWSIotAsync.DescribeAuditTask
     */
    java.util.concurrent.Future<DescribeAuditTaskResult> describeAuditTaskAsync(DescribeAuditTaskRequest describeAuditTaskRequest);

    /**
     * <p>
     * Gets information about a Device Defender audit.
     * </p>
     * 
     * @param describeAuditTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAuditTask operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeAuditTask
     */
    java.util.concurrent.Future<DescribeAuditTaskResult> describeAuditTaskAsync(DescribeAuditTaskRequest describeAuditTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAuditTaskRequest, DescribeAuditTaskResult> asyncHandler);

    /**
     * <p>
     * Describes an authorizer.
     * </p>
     * 
     * @param describeAuthorizerRequest
     * @return A Java Future containing the result of the DescribeAuthorizer operation returned by the service.
     * @sample AWSIotAsync.DescribeAuthorizer
     */
    java.util.concurrent.Future<DescribeAuthorizerResult> describeAuthorizerAsync(DescribeAuthorizerRequest describeAuthorizerRequest);

    /**
     * <p>
     * Describes an authorizer.
     * </p>
     * 
     * @param describeAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeAuthorizer
     */
    java.util.concurrent.Future<DescribeAuthorizerResult> describeAuthorizerAsync(DescribeAuthorizerRequest describeAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAuthorizerRequest, DescribeAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Returns information about a billing group.
     * </p>
     * 
     * @param describeBillingGroupRequest
     * @return A Java Future containing the result of the DescribeBillingGroup operation returned by the service.
     * @sample AWSIotAsync.DescribeBillingGroup
     */
    java.util.concurrent.Future<DescribeBillingGroupResult> describeBillingGroupAsync(DescribeBillingGroupRequest describeBillingGroupRequest);

    /**
     * <p>
     * Returns information about a billing group.
     * </p>
     * 
     * @param describeBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBillingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeBillingGroup
     */
    java.util.concurrent.Future<DescribeBillingGroupResult> describeBillingGroupAsync(DescribeBillingGroupRequest describeBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBillingGroupRequest, DescribeBillingGroupResult> asyncHandler);

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
     * Describes the default authorizer.
     * </p>
     * 
     * @param describeDefaultAuthorizerRequest
     * @return A Java Future containing the result of the DescribeDefaultAuthorizer operation returned by the service.
     * @sample AWSIotAsync.DescribeDefaultAuthorizer
     */
    java.util.concurrent.Future<DescribeDefaultAuthorizerResult> describeDefaultAuthorizerAsync(
            DescribeDefaultAuthorizerRequest describeDefaultAuthorizerRequest);

    /**
     * <p>
     * Describes the default authorizer.
     * </p>
     * 
     * @param describeDefaultAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDefaultAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeDefaultAuthorizer
     */
    java.util.concurrent.Future<DescribeDefaultAuthorizerResult> describeDefaultAuthorizerAsync(
            DescribeDefaultAuthorizerRequest describeDefaultAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDefaultAuthorizerRequest, DescribeDefaultAuthorizerResult> asyncHandler);

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
     * Describes event configurations.
     * </p>
     * 
     * @param describeEventConfigurationsRequest
     * @return A Java Future containing the result of the DescribeEventConfigurations operation returned by the service.
     * @sample AWSIotAsync.DescribeEventConfigurations
     */
    java.util.concurrent.Future<DescribeEventConfigurationsResult> describeEventConfigurationsAsync(
            DescribeEventConfigurationsRequest describeEventConfigurationsRequest);

    /**
     * <p>
     * Describes event configurations.
     * </p>
     * 
     * @param describeEventConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventConfigurations operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeEventConfigurations
     */
    java.util.concurrent.Future<DescribeEventConfigurationsResult> describeEventConfigurationsAsync(
            DescribeEventConfigurationsRequest describeEventConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventConfigurationsRequest, DescribeEventConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes a search index.
     * </p>
     * 
     * @param describeIndexRequest
     * @return A Java Future containing the result of the DescribeIndex operation returned by the service.
     * @sample AWSIotAsync.DescribeIndex
     */
    java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest describeIndexRequest);

    /**
     * <p>
     * Describes a search index.
     * </p>
     * 
     * @param describeIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIndex operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeIndex
     */
    java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest describeIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIndexRequest, DescribeIndexResult> asyncHandler);

    /**
     * <p>
     * Describes a job.
     * </p>
     * 
     * @param describeJobRequest
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSIotAsync.DescribeJob
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Describes a job.
     * </p>
     * 
     * @param describeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeJob
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler);

    /**
     * <p>
     * Describes a job execution.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @return A Java Future containing the result of the DescribeJobExecution operation returned by the service.
     * @sample AWSIotAsync.DescribeJobExecution
     */
    java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest describeJobExecutionRequest);

    /**
     * <p>
     * Describes a job execution.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobExecution operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeJobExecution
     */
    java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest describeJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobExecutionRequest, DescribeJobExecutionResult> asyncHandler);

    /**
     * <p>
     * Describes a role alias.
     * </p>
     * 
     * @param describeRoleAliasRequest
     * @return A Java Future containing the result of the DescribeRoleAlias operation returned by the service.
     * @sample AWSIotAsync.DescribeRoleAlias
     */
    java.util.concurrent.Future<DescribeRoleAliasResult> describeRoleAliasAsync(DescribeRoleAliasRequest describeRoleAliasRequest);

    /**
     * <p>
     * Describes a role alias.
     * </p>
     * 
     * @param describeRoleAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRoleAlias operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeRoleAlias
     */
    java.util.concurrent.Future<DescribeRoleAliasResult> describeRoleAliasAsync(DescribeRoleAliasRequest describeRoleAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRoleAliasRequest, DescribeRoleAliasResult> asyncHandler);

    /**
     * <p>
     * Gets information about a scheduled audit.
     * </p>
     * 
     * @param describeScheduledAuditRequest
     * @return A Java Future containing the result of the DescribeScheduledAudit operation returned by the service.
     * @sample AWSIotAsync.DescribeScheduledAudit
     */
    java.util.concurrent.Future<DescribeScheduledAuditResult> describeScheduledAuditAsync(DescribeScheduledAuditRequest describeScheduledAuditRequest);

    /**
     * <p>
     * Gets information about a scheduled audit.
     * </p>
     * 
     * @param describeScheduledAuditRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledAudit operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeScheduledAudit
     */
    java.util.concurrent.Future<DescribeScheduledAuditResult> describeScheduledAuditAsync(DescribeScheduledAuditRequest describeScheduledAuditRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledAuditRequest, DescribeScheduledAuditResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Device Defender security profile.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return A Java Future containing the result of the DescribeSecurityProfile operation returned by the service.
     * @sample AWSIotAsync.DescribeSecurityProfile
     */
    java.util.concurrent.Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(DescribeSecurityProfileRequest describeSecurityProfileRequest);

    /**
     * <p>
     * Gets information about a Device Defender security profile.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecurityProfile operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeSecurityProfile
     */
    java.util.concurrent.Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(DescribeSecurityProfileRequest describeSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityProfileRequest, DescribeSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Gets information about a stream.
     * </p>
     * 
     * @param describeStreamRequest
     * @return A Java Future containing the result of the DescribeStream operation returned by the service.
     * @sample AWSIotAsync.DescribeStream
     */
    java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest);

    /**
     * <p>
     * Gets information about a stream.
     * </p>
     * 
     * @param describeStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStream operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeStream
     */
    java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler);

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
     * Describe a thing group.
     * </p>
     * 
     * @param describeThingGroupRequest
     * @return A Java Future containing the result of the DescribeThingGroup operation returned by the service.
     * @sample AWSIotAsync.DescribeThingGroup
     */
    java.util.concurrent.Future<DescribeThingGroupResult> describeThingGroupAsync(DescribeThingGroupRequest describeThingGroupRequest);

    /**
     * <p>
     * Describe a thing group.
     * </p>
     * 
     * @param describeThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.DescribeThingGroup
     */
    java.util.concurrent.Future<DescribeThingGroupResult> describeThingGroupAsync(DescribeThingGroupRequest describeThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThingGroupRequest, DescribeThingGroupResult> asyncHandler);

    /**
     * <p>
     * Describes a bulk thing provisioning task.
     * </p>
     * 
     * @param describeThingRegistrationTaskRequest
     * @return A Java Future containing the result of the DescribeThingRegistrationTask operation returned by the
     *         service.
     * @sample AWSIotAsync.DescribeThingRegistrationTask
     */
    java.util.concurrent.Future<DescribeThingRegistrationTaskResult> describeThingRegistrationTaskAsync(
            DescribeThingRegistrationTaskRequest describeThingRegistrationTaskRequest);

    /**
     * <p>
     * Describes a bulk thing provisioning task.
     * </p>
     * 
     * @param describeThingRegistrationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThingRegistrationTask operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.DescribeThingRegistrationTask
     */
    java.util.concurrent.Future<DescribeThingRegistrationTaskResult> describeThingRegistrationTaskAsync(
            DescribeThingRegistrationTaskRequest describeThingRegistrationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThingRegistrationTaskRequest, DescribeThingRegistrationTaskResult> asyncHandler);

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
     * Detaches a policy from the specified target.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return A Java Future containing the result of the DetachPolicy operation returned by the service.
     * @sample AWSIotAsync.DetachPolicy
     */
    java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest detachPolicyRequest);

    /**
     * <p>
     * Detaches a policy from the specified target.
     * </p>
     * 
     * @param detachPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachPolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.DetachPolicy
     */
    java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest detachPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachPolicyRequest, DetachPolicyResult> asyncHandler);

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>DetachPolicy</a> instead.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @return A Java Future containing the result of the DetachPrincipalPolicy operation returned by the service.
     * @sample AWSIotAsync.DetachPrincipalPolicy
     */
    @Deprecated
    java.util.concurrent.Future<DetachPrincipalPolicyResult> detachPrincipalPolicyAsync(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest);

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>DetachPolicy</a> instead.
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
    @Deprecated
    java.util.concurrent.Future<DetachPrincipalPolicyResult> detachPrincipalPolicyAsync(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachPrincipalPolicyRequest, DetachPrincipalPolicyResult> asyncHandler);

    /**
     * <p>
     * Disassociates a Device Defender security profile from a thing group or from this account.
     * </p>
     * 
     * @param detachSecurityProfileRequest
     * @return A Java Future containing the result of the DetachSecurityProfile operation returned by the service.
     * @sample AWSIotAsync.DetachSecurityProfile
     */
    java.util.concurrent.Future<DetachSecurityProfileResult> detachSecurityProfileAsync(DetachSecurityProfileRequest detachSecurityProfileRequest);

    /**
     * <p>
     * Disassociates a Device Defender security profile from a thing group or from this account.
     * </p>
     * 
     * @param detachSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachSecurityProfile operation returned by the service.
     * @sample AWSIotAsyncHandler.DetachSecurityProfile
     */
    java.util.concurrent.Future<DetachSecurityProfileResult> detachSecurityProfileAsync(DetachSecurityProfileRequest detachSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DetachSecurityProfileRequest, DetachSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * <note>
     * <p>
     * This call is asynchronous. It might take several seconds for the detachment to propagate.
     * </p>
     * </note>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @return A Java Future containing the result of the DetachThingPrincipal operation returned by the service.
     * @sample AWSIotAsync.DetachThingPrincipal
     */
    java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(DetachThingPrincipalRequest detachThingPrincipalRequest);

    /**
     * <p>
     * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * <note>
     * <p>
     * This call is asynchronous. It might take several seconds for the detachment to propagate.
     * </p>
     * </note>
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
     * Disables the rule.
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
     * Disables the rule.
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
     * Enables the rule.
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
     * Enables the rule.
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
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it
     * connects to the AWS IoT device gateway.
     * </p>
     * 
     * @param getEffectivePoliciesRequest
     * @return A Java Future containing the result of the GetEffectivePolicies operation returned by the service.
     * @sample AWSIotAsync.GetEffectivePolicies
     */
    java.util.concurrent.Future<GetEffectivePoliciesResult> getEffectivePoliciesAsync(GetEffectivePoliciesRequest getEffectivePoliciesRequest);

    /**
     * <p>
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it
     * connects to the AWS IoT device gateway.
     * </p>
     * 
     * @param getEffectivePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEffectivePolicies operation returned by the service.
     * @sample AWSIotAsyncHandler.GetEffectivePolicies
     */
    java.util.concurrent.Future<GetEffectivePoliciesResult> getEffectivePoliciesAsync(GetEffectivePoliciesRequest getEffectivePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<GetEffectivePoliciesRequest, GetEffectivePoliciesResult> asyncHandler);

    /**
     * <p>
     * Gets the search configuration.
     * </p>
     * 
     * @param getIndexingConfigurationRequest
     * @return A Java Future containing the result of the GetIndexingConfiguration operation returned by the service.
     * @sample AWSIotAsync.GetIndexingConfiguration
     */
    java.util.concurrent.Future<GetIndexingConfigurationResult> getIndexingConfigurationAsync(GetIndexingConfigurationRequest getIndexingConfigurationRequest);

    /**
     * <p>
     * Gets the search configuration.
     * </p>
     * 
     * @param getIndexingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIndexingConfiguration operation returned by the service.
     * @sample AWSIotAsyncHandler.GetIndexingConfiguration
     */
    java.util.concurrent.Future<GetIndexingConfigurationResult> getIndexingConfigurationAsync(GetIndexingConfigurationRequest getIndexingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetIndexingConfigurationRequest, GetIndexingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets a job document.
     * </p>
     * 
     * @param getJobDocumentRequest
     * @return A Java Future containing the result of the GetJobDocument operation returned by the service.
     * @sample AWSIotAsync.GetJobDocument
     */
    java.util.concurrent.Future<GetJobDocumentResult> getJobDocumentAsync(GetJobDocumentRequest getJobDocumentRequest);

    /**
     * <p>
     * Gets a job document.
     * </p>
     * 
     * @param getJobDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobDocument operation returned by the service.
     * @sample AWSIotAsyncHandler.GetJobDocument
     */
    java.util.concurrent.Future<GetJobDocumentResult> getJobDocumentAsync(GetJobDocumentRequest getJobDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobDocumentRequest, GetJobDocumentResult> asyncHandler);

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * <p>
     * NOTE: use of this command is not recommended. Use <code>GetV2LoggingOptions</code> instead.
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
     * <p>
     * NOTE: use of this command is not recommended. Use <code>GetV2LoggingOptions</code> instead.
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
     * Gets an OTA update.
     * </p>
     * 
     * @param getOTAUpdateRequest
     * @return A Java Future containing the result of the GetOTAUpdate operation returned by the service.
     * @sample AWSIotAsync.GetOTAUpdate
     */
    java.util.concurrent.Future<GetOTAUpdateResult> getOTAUpdateAsync(GetOTAUpdateRequest getOTAUpdateRequest);

    /**
     * <p>
     * Gets an OTA update.
     * </p>
     * 
     * @param getOTAUpdateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOTAUpdate operation returned by the service.
     * @sample AWSIotAsyncHandler.GetOTAUpdate
     */
    java.util.concurrent.Future<GetOTAUpdateResult> getOTAUpdateAsync(GetOTAUpdateRequest getOTAUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<GetOTAUpdateRequest, GetOTAUpdateResult> asyncHandler);

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
     * Gets statistics about things that match the specified query.
     * </p>
     * 
     * @param getStatisticsRequest
     * @return A Java Future containing the result of the GetStatistics operation returned by the service.
     * @sample AWSIotAsync.GetStatistics
     */
    java.util.concurrent.Future<GetStatisticsResult> getStatisticsAsync(GetStatisticsRequest getStatisticsRequest);

    /**
     * <p>
     * Gets statistics about things that match the specified query.
     * </p>
     * 
     * @param getStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStatistics operation returned by the service.
     * @sample AWSIotAsyncHandler.GetStatistics
     */
    java.util.concurrent.Future<GetStatisticsResult> getStatisticsAsync(GetStatisticsRequest getStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetStatisticsRequest, GetStatisticsResult> asyncHandler);

    /**
     * <p>
     * Gets information about the rule.
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
     * Gets information about the rule.
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
     * Gets the fine grained logging options.
     * </p>
     * 
     * @param getV2LoggingOptionsRequest
     * @return A Java Future containing the result of the GetV2LoggingOptions operation returned by the service.
     * @sample AWSIotAsync.GetV2LoggingOptions
     */
    java.util.concurrent.Future<GetV2LoggingOptionsResult> getV2LoggingOptionsAsync(GetV2LoggingOptionsRequest getV2LoggingOptionsRequest);

    /**
     * <p>
     * Gets the fine grained logging options.
     * </p>
     * 
     * @param getV2LoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetV2LoggingOptions operation returned by the service.
     * @sample AWSIotAsyncHandler.GetV2LoggingOptions
     */
    java.util.concurrent.Future<GetV2LoggingOptionsResult> getV2LoggingOptionsAsync(GetV2LoggingOptionsRequest getV2LoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetV2LoggingOptionsRequest, GetV2LoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Lists the active violations for a given Device Defender security profile.
     * </p>
     * 
     * @param listActiveViolationsRequest
     * @return A Java Future containing the result of the ListActiveViolations operation returned by the service.
     * @sample AWSIotAsync.ListActiveViolations
     */
    java.util.concurrent.Future<ListActiveViolationsResult> listActiveViolationsAsync(ListActiveViolationsRequest listActiveViolationsRequest);

    /**
     * <p>
     * Lists the active violations for a given Device Defender security profile.
     * </p>
     * 
     * @param listActiveViolationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActiveViolations operation returned by the service.
     * @sample AWSIotAsyncHandler.ListActiveViolations
     */
    java.util.concurrent.Future<ListActiveViolationsResult> listActiveViolationsAsync(ListActiveViolationsRequest listActiveViolationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListActiveViolationsRequest, ListActiveViolationsResult> asyncHandler);

    /**
     * <p>
     * Lists the policies attached to the specified thing group.
     * </p>
     * 
     * @param listAttachedPoliciesRequest
     * @return A Java Future containing the result of the ListAttachedPolicies operation returned by the service.
     * @sample AWSIotAsync.ListAttachedPolicies
     */
    java.util.concurrent.Future<ListAttachedPoliciesResult> listAttachedPoliciesAsync(ListAttachedPoliciesRequest listAttachedPoliciesRequest);

    /**
     * <p>
     * Lists the policies attached to the specified thing group.
     * </p>
     * 
     * @param listAttachedPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttachedPolicies operation returned by the service.
     * @sample AWSIotAsyncHandler.ListAttachedPolicies
     */
    java.util.concurrent.Future<ListAttachedPoliciesResult> listAttachedPoliciesAsync(ListAttachedPoliciesRequest listAttachedPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttachedPoliciesRequest, ListAttachedPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time
     * period. (Findings are retained for 180 days.)
     * </p>
     * 
     * @param listAuditFindingsRequest
     * @return A Java Future containing the result of the ListAuditFindings operation returned by the service.
     * @sample AWSIotAsync.ListAuditFindings
     */
    java.util.concurrent.Future<ListAuditFindingsResult> listAuditFindingsAsync(ListAuditFindingsRequest listAuditFindingsRequest);

    /**
     * <p>
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time
     * period. (Findings are retained for 180 days.)
     * </p>
     * 
     * @param listAuditFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAuditFindings operation returned by the service.
     * @sample AWSIotAsyncHandler.ListAuditFindings
     */
    java.util.concurrent.Future<ListAuditFindingsResult> listAuditFindingsAsync(ListAuditFindingsRequest listAuditFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAuditFindingsRequest, ListAuditFindingsResult> asyncHandler);

    /**
     * <p>
     * Lists the Device Defender audits that have been performed during a given time period.
     * </p>
     * 
     * @param listAuditTasksRequest
     * @return A Java Future containing the result of the ListAuditTasks operation returned by the service.
     * @sample AWSIotAsync.ListAuditTasks
     */
    java.util.concurrent.Future<ListAuditTasksResult> listAuditTasksAsync(ListAuditTasksRequest listAuditTasksRequest);

    /**
     * <p>
     * Lists the Device Defender audits that have been performed during a given time period.
     * </p>
     * 
     * @param listAuditTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAuditTasks operation returned by the service.
     * @sample AWSIotAsyncHandler.ListAuditTasks
     */
    java.util.concurrent.Future<ListAuditTasksResult> listAuditTasksAsync(ListAuditTasksRequest listAuditTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAuditTasksRequest, ListAuditTasksResult> asyncHandler);

    /**
     * <p>
     * Lists the authorizers registered in your account.
     * </p>
     * 
     * @param listAuthorizersRequest
     * @return A Java Future containing the result of the ListAuthorizers operation returned by the service.
     * @sample AWSIotAsync.ListAuthorizers
     */
    java.util.concurrent.Future<ListAuthorizersResult> listAuthorizersAsync(ListAuthorizersRequest listAuthorizersRequest);

    /**
     * <p>
     * Lists the authorizers registered in your account.
     * </p>
     * 
     * @param listAuthorizersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAuthorizers operation returned by the service.
     * @sample AWSIotAsyncHandler.ListAuthorizers
     */
    java.util.concurrent.Future<ListAuthorizersResult> listAuthorizersAsync(ListAuthorizersRequest listAuthorizersRequest,
            com.amazonaws.handlers.AsyncHandler<ListAuthorizersRequest, ListAuthorizersResult> asyncHandler);

    /**
     * <p>
     * Lists the billing groups you have created.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @return A Java Future containing the result of the ListBillingGroups operation returned by the service.
     * @sample AWSIotAsync.ListBillingGroups
     */
    java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(ListBillingGroupsRequest listBillingGroupsRequest);

    /**
     * <p>
     * Lists the billing groups you have created.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBillingGroups operation returned by the service.
     * @sample AWSIotAsyncHandler.ListBillingGroups
     */
    java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(ListBillingGroupsRequest listBillingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBillingGroupsRequest, ListBillingGroupsResult> asyncHandler);

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
     * Lists the search indices.
     * </p>
     * 
     * @param listIndicesRequest
     * @return A Java Future containing the result of the ListIndices operation returned by the service.
     * @sample AWSIotAsync.ListIndices
     */
    java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest listIndicesRequest);

    /**
     * <p>
     * Lists the search indices.
     * </p>
     * 
     * @param listIndicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIndices operation returned by the service.
     * @sample AWSIotAsyncHandler.ListIndices
     */
    java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest listIndicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIndicesRequest, ListIndicesResult> asyncHandler);

    /**
     * <p>
     * Lists the job executions for a job.
     * </p>
     * 
     * @param listJobExecutionsForJobRequest
     * @return A Java Future containing the result of the ListJobExecutionsForJob operation returned by the service.
     * @sample AWSIotAsync.ListJobExecutionsForJob
     */
    java.util.concurrent.Future<ListJobExecutionsForJobResult> listJobExecutionsForJobAsync(ListJobExecutionsForJobRequest listJobExecutionsForJobRequest);

    /**
     * <p>
     * Lists the job executions for a job.
     * </p>
     * 
     * @param listJobExecutionsForJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobExecutionsForJob operation returned by the service.
     * @sample AWSIotAsyncHandler.ListJobExecutionsForJob
     */
    java.util.concurrent.Future<ListJobExecutionsForJobResult> listJobExecutionsForJobAsync(ListJobExecutionsForJobRequest listJobExecutionsForJobRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobExecutionsForJobRequest, ListJobExecutionsForJobResult> asyncHandler);

    /**
     * <p>
     * Lists the job executions for the specified thing.
     * </p>
     * 
     * @param listJobExecutionsForThingRequest
     * @return A Java Future containing the result of the ListJobExecutionsForThing operation returned by the service.
     * @sample AWSIotAsync.ListJobExecutionsForThing
     */
    java.util.concurrent.Future<ListJobExecutionsForThingResult> listJobExecutionsForThingAsync(
            ListJobExecutionsForThingRequest listJobExecutionsForThingRequest);

    /**
     * <p>
     * Lists the job executions for the specified thing.
     * </p>
     * 
     * @param listJobExecutionsForThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobExecutionsForThing operation returned by the service.
     * @sample AWSIotAsyncHandler.ListJobExecutionsForThing
     */
    java.util.concurrent.Future<ListJobExecutionsForThingResult> listJobExecutionsForThingAsync(
            ListJobExecutionsForThingRequest listJobExecutionsForThingRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobExecutionsForThingRequest, ListJobExecutionsForThingResult> asyncHandler);

    /**
     * <p>
     * Lists jobs.
     * </p>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSIotAsync.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists jobs.
     * </p>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSIotAsyncHandler.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Lists OTA updates.
     * </p>
     * 
     * @param listOTAUpdatesRequest
     * @return A Java Future containing the result of the ListOTAUpdates operation returned by the service.
     * @sample AWSIotAsync.ListOTAUpdates
     */
    java.util.concurrent.Future<ListOTAUpdatesResult> listOTAUpdatesAsync(ListOTAUpdatesRequest listOTAUpdatesRequest);

    /**
     * <p>
     * Lists OTA updates.
     * </p>
     * 
     * @param listOTAUpdatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOTAUpdates operation returned by the service.
     * @sample AWSIotAsyncHandler.ListOTAUpdates
     */
    java.util.concurrent.Future<ListOTAUpdatesResult> listOTAUpdatesAsync(ListOTAUpdatesRequest listOTAUpdatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListOTAUpdatesRequest, ListOTAUpdatesResult> asyncHandler);

    /**
     * <p>
     * Lists certificates that are being transferred but not yet accepted.
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
     * Lists certificates that are being transferred but not yet accepted.
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
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>ListTargetsForPolicy</a> instead.
     * </p>
     * 
     * @param listPolicyPrincipalsRequest
     *        The input for the ListPolicyPrincipals operation.
     * @return A Java Future containing the result of the ListPolicyPrincipals operation returned by the service.
     * @sample AWSIotAsync.ListPolicyPrincipals
     */
    @Deprecated
    java.util.concurrent.Future<ListPolicyPrincipalsResult> listPolicyPrincipalsAsync(ListPolicyPrincipalsRequest listPolicyPrincipalsRequest);

    /**
     * <p>
     * Lists the principals associated with the specified policy.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>ListTargetsForPolicy</a> instead.
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
    @Deprecated
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
     * "https://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>ListAttachedPolicies</a> instead.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @return A Java Future containing the result of the ListPrincipalPolicies operation returned by the service.
     * @sample AWSIotAsync.ListPrincipalPolicies
     */
    @Deprecated
    java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest);

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in <a
     * href=
     * "https://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>ListAttachedPolicies</a> instead.
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
    @Deprecated
    java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalPoliciesRequest, ListPrincipalPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
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
     * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
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
     * Lists the role aliases registered in your account.
     * </p>
     * 
     * @param listRoleAliasesRequest
     * @return A Java Future containing the result of the ListRoleAliases operation returned by the service.
     * @sample AWSIotAsync.ListRoleAliases
     */
    java.util.concurrent.Future<ListRoleAliasesResult> listRoleAliasesAsync(ListRoleAliasesRequest listRoleAliasesRequest);

    /**
     * <p>
     * Lists the role aliases registered in your account.
     * </p>
     * 
     * @param listRoleAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoleAliases operation returned by the service.
     * @sample AWSIotAsyncHandler.ListRoleAliases
     */
    java.util.concurrent.Future<ListRoleAliasesResult> listRoleAliasesAsync(ListRoleAliasesRequest listRoleAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoleAliasesRequest, ListRoleAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists all of your scheduled audits.
     * </p>
     * 
     * @param listScheduledAuditsRequest
     * @return A Java Future containing the result of the ListScheduledAudits operation returned by the service.
     * @sample AWSIotAsync.ListScheduledAudits
     */
    java.util.concurrent.Future<ListScheduledAuditsResult> listScheduledAuditsAsync(ListScheduledAuditsRequest listScheduledAuditsRequest);

    /**
     * <p>
     * Lists all of your scheduled audits.
     * </p>
     * 
     * @param listScheduledAuditsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListScheduledAudits operation returned by the service.
     * @sample AWSIotAsyncHandler.ListScheduledAudits
     */
    java.util.concurrent.Future<ListScheduledAuditsResult> listScheduledAuditsAsync(ListScheduledAuditsRequest listScheduledAuditsRequest,
            com.amazonaws.handlers.AsyncHandler<ListScheduledAuditsRequest, ListScheduledAuditsResult> asyncHandler);

    /**
     * <p>
     * Lists the Device Defender security profiles you have created. You can use filters to list only those security
     * profiles associated with a thing group or only those associated with your account.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return A Java Future containing the result of the ListSecurityProfiles operation returned by the service.
     * @sample AWSIotAsync.ListSecurityProfiles
     */
    java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(ListSecurityProfilesRequest listSecurityProfilesRequest);

    /**
     * <p>
     * Lists the Device Defender security profiles you have created. You can use filters to list only those security
     * profiles associated with a thing group or only those associated with your account.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityProfiles operation returned by the service.
     * @sample AWSIotAsyncHandler.ListSecurityProfiles
     */
    java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(ListSecurityProfilesRequest listSecurityProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the Device Defender security profiles attached to a target (thing group).
     * </p>
     * 
     * @param listSecurityProfilesForTargetRequest
     * @return A Java Future containing the result of the ListSecurityProfilesForTarget operation returned by the
     *         service.
     * @sample AWSIotAsync.ListSecurityProfilesForTarget
     */
    java.util.concurrent.Future<ListSecurityProfilesForTargetResult> listSecurityProfilesForTargetAsync(
            ListSecurityProfilesForTargetRequest listSecurityProfilesForTargetRequest);

    /**
     * <p>
     * Lists the Device Defender security profiles attached to a target (thing group).
     * </p>
     * 
     * @param listSecurityProfilesForTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityProfilesForTarget operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.ListSecurityProfilesForTarget
     */
    java.util.concurrent.Future<ListSecurityProfilesForTargetResult> listSecurityProfilesForTargetAsync(
            ListSecurityProfilesForTargetRequest listSecurityProfilesForTargetRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityProfilesForTargetRequest, ListSecurityProfilesForTargetResult> asyncHandler);

    /**
     * <p>
     * Lists all of the streams in your AWS account.
     * </p>
     * 
     * @param listStreamsRequest
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AWSIotAsync.ListStreams
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Lists all of the streams in your AWS account.
     * </p>
     * 
     * @param listStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AWSIotAsyncHandler.ListStreams
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIotAsync.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIotAsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * List targets for the specified policy.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return A Java Future containing the result of the ListTargetsForPolicy operation returned by the service.
     * @sample AWSIotAsync.ListTargetsForPolicy
     */
    java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(ListTargetsForPolicyRequest listTargetsForPolicyRequest);

    /**
     * <p>
     * List targets for the specified policy.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetsForPolicy operation returned by the service.
     * @sample AWSIotAsyncHandler.ListTargetsForPolicy
     */
    java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(ListTargetsForPolicyRequest listTargetsForPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsForPolicyRequest, ListTargetsForPolicyResult> asyncHandler);

    /**
     * <p>
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     * </p>
     * 
     * @param listTargetsForSecurityProfileRequest
     * @return A Java Future containing the result of the ListTargetsForSecurityProfile operation returned by the
     *         service.
     * @sample AWSIotAsync.ListTargetsForSecurityProfile
     */
    java.util.concurrent.Future<ListTargetsForSecurityProfileResult> listTargetsForSecurityProfileAsync(
            ListTargetsForSecurityProfileRequest listTargetsForSecurityProfileRequest);

    /**
     * <p>
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     * </p>
     * 
     * @param listTargetsForSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetsForSecurityProfile operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.ListTargetsForSecurityProfile
     */
    java.util.concurrent.Future<ListTargetsForSecurityProfileResult> listTargetsForSecurityProfileAsync(
            ListTargetsForSecurityProfileRequest listTargetsForSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsForSecurityProfileRequest, ListTargetsForSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * List the thing groups in your account.
     * </p>
     * 
     * @param listThingGroupsRequest
     * @return A Java Future containing the result of the ListThingGroups operation returned by the service.
     * @sample AWSIotAsync.ListThingGroups
     */
    java.util.concurrent.Future<ListThingGroupsResult> listThingGroupsAsync(ListThingGroupsRequest listThingGroupsRequest);

    /**
     * <p>
     * List the thing groups in your account.
     * </p>
     * 
     * @param listThingGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingGroups operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingGroups
     */
    java.util.concurrent.Future<ListThingGroupsResult> listThingGroupsAsync(ListThingGroupsRequest listThingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingGroupsRequest, ListThingGroupsResult> asyncHandler);

    /**
     * <p>
     * List the thing groups to which the specified thing belongs.
     * </p>
     * 
     * @param listThingGroupsForThingRequest
     * @return A Java Future containing the result of the ListThingGroupsForThing operation returned by the service.
     * @sample AWSIotAsync.ListThingGroupsForThing
     */
    java.util.concurrent.Future<ListThingGroupsForThingResult> listThingGroupsForThingAsync(ListThingGroupsForThingRequest listThingGroupsForThingRequest);

    /**
     * <p>
     * List the thing groups to which the specified thing belongs.
     * </p>
     * 
     * @param listThingGroupsForThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingGroupsForThing operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingGroupsForThing
     */
    java.util.concurrent.Future<ListThingGroupsForThingResult> listThingGroupsForThingAsync(ListThingGroupsForThingRequest listThingGroupsForThingRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingGroupsForThingRequest, ListThingGroupsForThingResult> asyncHandler);

    /**
     * <p>
     * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
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
     * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
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
     * Information about the thing registration tasks.
     * </p>
     * 
     * @param listThingRegistrationTaskReportsRequest
     * @return A Java Future containing the result of the ListThingRegistrationTaskReports operation returned by the
     *         service.
     * @sample AWSIotAsync.ListThingRegistrationTaskReports
     */
    java.util.concurrent.Future<ListThingRegistrationTaskReportsResult> listThingRegistrationTaskReportsAsync(
            ListThingRegistrationTaskReportsRequest listThingRegistrationTaskReportsRequest);

    /**
     * <p>
     * Information about the thing registration tasks.
     * </p>
     * 
     * @param listThingRegistrationTaskReportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingRegistrationTaskReports operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.ListThingRegistrationTaskReports
     */
    java.util.concurrent.Future<ListThingRegistrationTaskReportsResult> listThingRegistrationTaskReportsAsync(
            ListThingRegistrationTaskReportsRequest listThingRegistrationTaskReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingRegistrationTaskReportsRequest, ListThingRegistrationTaskReportsResult> asyncHandler);

    /**
     * <p>
     * List bulk thing provisioning tasks.
     * </p>
     * 
     * @param listThingRegistrationTasksRequest
     * @return A Java Future containing the result of the ListThingRegistrationTasks operation returned by the service.
     * @sample AWSIotAsync.ListThingRegistrationTasks
     */
    java.util.concurrent.Future<ListThingRegistrationTasksResult> listThingRegistrationTasksAsync(
            ListThingRegistrationTasksRequest listThingRegistrationTasksRequest);

    /**
     * <p>
     * List bulk thing provisioning tasks.
     * </p>
     * 
     * @param listThingRegistrationTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingRegistrationTasks operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingRegistrationTasks
     */
    java.util.concurrent.Future<ListThingRegistrationTasksResult> listThingRegistrationTasksAsync(
            ListThingRegistrationTasksRequest listThingRegistrationTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingRegistrationTasksRequest, ListThingRegistrationTasksResult> asyncHandler);

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
     * Lists the things you have added to the given billing group.
     * </p>
     * 
     * @param listThingsInBillingGroupRequest
     * @return A Java Future containing the result of the ListThingsInBillingGroup operation returned by the service.
     * @sample AWSIotAsync.ListThingsInBillingGroup
     */
    java.util.concurrent.Future<ListThingsInBillingGroupResult> listThingsInBillingGroupAsync(ListThingsInBillingGroupRequest listThingsInBillingGroupRequest);

    /**
     * <p>
     * Lists the things you have added to the given billing group.
     * </p>
     * 
     * @param listThingsInBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingsInBillingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingsInBillingGroup
     */
    java.util.concurrent.Future<ListThingsInBillingGroupResult> listThingsInBillingGroupAsync(ListThingsInBillingGroupRequest listThingsInBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingsInBillingGroupRequest, ListThingsInBillingGroupResult> asyncHandler);

    /**
     * <p>
     * Lists the things in the specified group.
     * </p>
     * 
     * @param listThingsInThingGroupRequest
     * @return A Java Future containing the result of the ListThingsInThingGroup operation returned by the service.
     * @sample AWSIotAsync.ListThingsInThingGroup
     */
    java.util.concurrent.Future<ListThingsInThingGroupResult> listThingsInThingGroupAsync(ListThingsInThingGroupRequest listThingsInThingGroupRequest);

    /**
     * <p>
     * Lists the things in the specified group.
     * </p>
     * 
     * @param listThingsInThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThingsInThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.ListThingsInThingGroup
     */
    java.util.concurrent.Future<ListThingsInThingGroupResult> listThingsInThingGroupAsync(ListThingsInThingGroupRequest listThingsInThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListThingsInThingGroupRequest, ListThingsInThingGroupResult> asyncHandler);

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
     * Lists logging levels.
     * </p>
     * 
     * @param listV2LoggingLevelsRequest
     * @return A Java Future containing the result of the ListV2LoggingLevels operation returned by the service.
     * @sample AWSIotAsync.ListV2LoggingLevels
     */
    java.util.concurrent.Future<ListV2LoggingLevelsResult> listV2LoggingLevelsAsync(ListV2LoggingLevelsRequest listV2LoggingLevelsRequest);

    /**
     * <p>
     * Lists logging levels.
     * </p>
     * 
     * @param listV2LoggingLevelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListV2LoggingLevels operation returned by the service.
     * @sample AWSIotAsyncHandler.ListV2LoggingLevels
     */
    java.util.concurrent.Future<ListV2LoggingLevelsResult> listV2LoggingLevelsAsync(ListV2LoggingLevelsRequest listV2LoggingLevelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListV2LoggingLevelsRequest, ListV2LoggingLevelsResult> asyncHandler);

    /**
     * <p>
     * Lists the Device Defender security profile violations discovered during the given time period. You can use
     * filters to limit the results to those alerts issued for a particular security profile, behavior or thing
     * (device).
     * </p>
     * 
     * @param listViolationEventsRequest
     * @return A Java Future containing the result of the ListViolationEvents operation returned by the service.
     * @sample AWSIotAsync.ListViolationEvents
     */
    java.util.concurrent.Future<ListViolationEventsResult> listViolationEventsAsync(ListViolationEventsRequest listViolationEventsRequest);

    /**
     * <p>
     * Lists the Device Defender security profile violations discovered during the given time period. You can use
     * filters to limit the results to those alerts issued for a particular security profile, behavior or thing
     * (device).
     * </p>
     * 
     * @param listViolationEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListViolationEvents operation returned by the service.
     * @sample AWSIotAsyncHandler.ListViolationEvents
     */
    java.util.concurrent.Future<ListViolationEventsResult> listViolationEventsAsync(ListViolationEventsRequest listViolationEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListViolationEventsRequest, ListViolationEventsResult> asyncHandler);

    /**
     * <p>
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
     * can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
     * subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you
     * have more than one CA certificate registered, make sure you pass the CA certificate when you register your device
     * certificates with the RegisterCertificate API.
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
     * subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you
     * have more than one CA certificate registered, make sure you pass the CA certificate when you register your device
     * certificates with the RegisterCertificate API.
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
     * Provisions a thing.
     * </p>
     * 
     * @param registerThingRequest
     * @return A Java Future containing the result of the RegisterThing operation returned by the service.
     * @sample AWSIotAsync.RegisterThing
     */
    java.util.concurrent.Future<RegisterThingResult> registerThingAsync(RegisterThingRequest registerThingRequest);

    /**
     * <p>
     * Provisions a thing.
     * </p>
     * 
     * @param registerThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterThing operation returned by the service.
     * @sample AWSIotAsyncHandler.RegisterThing
     */
    java.util.concurrent.Future<RegisterThingResult> registerThingAsync(RegisterThingRequest registerThingRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterThingRequest, RegisterThingResult> asyncHandler);

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
     * Removes the given thing from the billing group.
     * </p>
     * 
     * @param removeThingFromBillingGroupRequest
     * @return A Java Future containing the result of the RemoveThingFromBillingGroup operation returned by the service.
     * @sample AWSIotAsync.RemoveThingFromBillingGroup
     */
    java.util.concurrent.Future<RemoveThingFromBillingGroupResult> removeThingFromBillingGroupAsync(
            RemoveThingFromBillingGroupRequest removeThingFromBillingGroupRequest);

    /**
     * <p>
     * Removes the given thing from the billing group.
     * </p>
     * 
     * @param removeThingFromBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveThingFromBillingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.RemoveThingFromBillingGroup
     */
    java.util.concurrent.Future<RemoveThingFromBillingGroupResult> removeThingFromBillingGroupAsync(
            RemoveThingFromBillingGroupRequest removeThingFromBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveThingFromBillingGroupRequest, RemoveThingFromBillingGroupResult> asyncHandler);

    /**
     * <p>
     * Remove the specified thing from the specified group.
     * </p>
     * 
     * @param removeThingFromThingGroupRequest
     * @return A Java Future containing the result of the RemoveThingFromThingGroup operation returned by the service.
     * @sample AWSIotAsync.RemoveThingFromThingGroup
     */
    java.util.concurrent.Future<RemoveThingFromThingGroupResult> removeThingFromThingGroupAsync(
            RemoveThingFromThingGroupRequest removeThingFromThingGroupRequest);

    /**
     * <p>
     * Remove the specified thing from the specified group.
     * </p>
     * 
     * @param removeThingFromThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveThingFromThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.RemoveThingFromThingGroup
     */
    java.util.concurrent.Future<RemoveThingFromThingGroupResult> removeThingFromThingGroupAsync(
            RemoveThingFromThingGroupRequest removeThingFromThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveThingFromThingGroupRequest, RemoveThingFromThingGroupResult> asyncHandler);

    /**
     * <p>
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level
     * action. Any user who has permission to create rules will be able to access data processed by the rule.
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
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level
     * action. Any user who has permission to create rules will be able to access data processed by the rule.
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
     * The query search index.
     * </p>
     * 
     * @param searchIndexRequest
     * @return A Java Future containing the result of the SearchIndex operation returned by the service.
     * @sample AWSIotAsync.SearchIndex
     */
    java.util.concurrent.Future<SearchIndexResult> searchIndexAsync(SearchIndexRequest searchIndexRequest);

    /**
     * <p>
     * The query search index.
     * </p>
     * 
     * @param searchIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchIndex operation returned by the service.
     * @sample AWSIotAsyncHandler.SearchIndex
     */
    java.util.concurrent.Future<SearchIndexResult> searchIndexAsync(SearchIndexRequest searchIndexRequest,
            com.amazonaws.handlers.AsyncHandler<SearchIndexRequest, SearchIndexResult> asyncHandler);

    /**
     * <p>
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an
     * authorizer.
     * </p>
     * 
     * @param setDefaultAuthorizerRequest
     * @return A Java Future containing the result of the SetDefaultAuthorizer operation returned by the service.
     * @sample AWSIotAsync.SetDefaultAuthorizer
     */
    java.util.concurrent.Future<SetDefaultAuthorizerResult> setDefaultAuthorizerAsync(SetDefaultAuthorizerRequest setDefaultAuthorizerRequest);

    /**
     * <p>
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an
     * authorizer.
     * </p>
     * 
     * @param setDefaultAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDefaultAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.SetDefaultAuthorizer
     */
    java.util.concurrent.Future<SetDefaultAuthorizerResult> setDefaultAuthorizerAsync(SetDefaultAuthorizerRequest setDefaultAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<SetDefaultAuthorizerRequest, SetDefaultAuthorizerResult> asyncHandler);

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
     * <p>
     * NOTE: use of this command is not recommended. Use <code>SetV2LoggingOptions</code> instead.
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
     * <p>
     * NOTE: use of this command is not recommended. Use <code>SetV2LoggingOptions</code> instead.
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
     * Sets the logging level.
     * </p>
     * 
     * @param setV2LoggingLevelRequest
     * @return A Java Future containing the result of the SetV2LoggingLevel operation returned by the service.
     * @sample AWSIotAsync.SetV2LoggingLevel
     */
    java.util.concurrent.Future<SetV2LoggingLevelResult> setV2LoggingLevelAsync(SetV2LoggingLevelRequest setV2LoggingLevelRequest);

    /**
     * <p>
     * Sets the logging level.
     * </p>
     * 
     * @param setV2LoggingLevelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetV2LoggingLevel operation returned by the service.
     * @sample AWSIotAsyncHandler.SetV2LoggingLevel
     */
    java.util.concurrent.Future<SetV2LoggingLevelResult> setV2LoggingLevelAsync(SetV2LoggingLevelRequest setV2LoggingLevelRequest,
            com.amazonaws.handlers.AsyncHandler<SetV2LoggingLevelRequest, SetV2LoggingLevelResult> asyncHandler);

    /**
     * <p>
     * Sets the logging options for the V2 logging service.
     * </p>
     * 
     * @param setV2LoggingOptionsRequest
     * @return A Java Future containing the result of the SetV2LoggingOptions operation returned by the service.
     * @sample AWSIotAsync.SetV2LoggingOptions
     */
    java.util.concurrent.Future<SetV2LoggingOptionsResult> setV2LoggingOptionsAsync(SetV2LoggingOptionsRequest setV2LoggingOptionsRequest);

    /**
     * <p>
     * Sets the logging options for the V2 logging service.
     * </p>
     * 
     * @param setV2LoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetV2LoggingOptions operation returned by the service.
     * @sample AWSIotAsyncHandler.SetV2LoggingOptions
     */
    java.util.concurrent.Future<SetV2LoggingOptionsResult> setV2LoggingOptionsAsync(SetV2LoggingOptionsRequest setV2LoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<SetV2LoggingOptionsRequest, SetV2LoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Starts an on-demand Device Defender audit.
     * </p>
     * 
     * @param startOnDemandAuditTaskRequest
     * @return A Java Future containing the result of the StartOnDemandAuditTask operation returned by the service.
     * @sample AWSIotAsync.StartOnDemandAuditTask
     */
    java.util.concurrent.Future<StartOnDemandAuditTaskResult> startOnDemandAuditTaskAsync(StartOnDemandAuditTaskRequest startOnDemandAuditTaskRequest);

    /**
     * <p>
     * Starts an on-demand Device Defender audit.
     * </p>
     * 
     * @param startOnDemandAuditTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartOnDemandAuditTask operation returned by the service.
     * @sample AWSIotAsyncHandler.StartOnDemandAuditTask
     */
    java.util.concurrent.Future<StartOnDemandAuditTaskResult> startOnDemandAuditTaskAsync(StartOnDemandAuditTaskRequest startOnDemandAuditTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartOnDemandAuditTaskRequest, StartOnDemandAuditTaskResult> asyncHandler);

    /**
     * <p>
     * Creates a bulk thing provisioning task.
     * </p>
     * 
     * @param startThingRegistrationTaskRequest
     * @return A Java Future containing the result of the StartThingRegistrationTask operation returned by the service.
     * @sample AWSIotAsync.StartThingRegistrationTask
     */
    java.util.concurrent.Future<StartThingRegistrationTaskResult> startThingRegistrationTaskAsync(
            StartThingRegistrationTaskRequest startThingRegistrationTaskRequest);

    /**
     * <p>
     * Creates a bulk thing provisioning task.
     * </p>
     * 
     * @param startThingRegistrationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartThingRegistrationTask operation returned by the service.
     * @sample AWSIotAsyncHandler.StartThingRegistrationTask
     */
    java.util.concurrent.Future<StartThingRegistrationTaskResult> startThingRegistrationTaskAsync(
            StartThingRegistrationTaskRequest startThingRegistrationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartThingRegistrationTaskRequest, StartThingRegistrationTaskResult> asyncHandler);

    /**
     * <p>
     * Cancels a bulk thing provisioning task.
     * </p>
     * 
     * @param stopThingRegistrationTaskRequest
     * @return A Java Future containing the result of the StopThingRegistrationTask operation returned by the service.
     * @sample AWSIotAsync.StopThingRegistrationTask
     */
    java.util.concurrent.Future<StopThingRegistrationTaskResult> stopThingRegistrationTaskAsync(
            StopThingRegistrationTaskRequest stopThingRegistrationTaskRequest);

    /**
     * <p>
     * Cancels a bulk thing provisioning task.
     * </p>
     * 
     * @param stopThingRegistrationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopThingRegistrationTask operation returned by the service.
     * @sample AWSIotAsyncHandler.StopThingRegistrationTask
     */
    java.util.concurrent.Future<StopThingRegistrationTaskResult> stopThingRegistrationTaskAsync(
            StopThingRegistrationTaskRequest stopThingRegistrationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StopThingRegistrationTaskRequest, StopThingRegistrationTaskResult> asyncHandler);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIotAsync.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIotAsyncHandler.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to
     * test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
     * </p>
     * 
     * @param testAuthorizationRequest
     * @return A Java Future containing the result of the TestAuthorization operation returned by the service.
     * @sample AWSIotAsync.TestAuthorization
     */
    java.util.concurrent.Future<TestAuthorizationResult> testAuthorizationAsync(TestAuthorizationRequest testAuthorizationRequest);

    /**
     * <p>
     * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to
     * test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
     * </p>
     * 
     * @param testAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestAuthorization operation returned by the service.
     * @sample AWSIotAsyncHandler.TestAuthorization
     */
    java.util.concurrent.Future<TestAuthorizationResult> testAuthorizationAsync(TestAuthorizationRequest testAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<TestAuthorizationRequest, TestAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the
     * custom authorization behavior of devices that connect to the AWS IoT device gateway.
     * </p>
     * 
     * @param testInvokeAuthorizerRequest
     * @return A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service.
     * @sample AWSIotAsync.TestInvokeAuthorizer
     */
    java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest);

    /**
     * <p>
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the
     * custom authorization behavior of devices that connect to the AWS IoT device gateway.
     * </p>
     * 
     * @param testInvokeAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.TestInvokeAuthorizer
     */
    java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<TestInvokeAuthorizerRequest, TestInvokeAuthorizerResult> asyncHandler);

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
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIotAsync.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIotAsyncHandler.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * 
     * @param updateAccountAuditConfigurationRequest
     * @return A Java Future containing the result of the UpdateAccountAuditConfiguration operation returned by the
     *         service.
     * @sample AWSIotAsync.UpdateAccountAuditConfiguration
     */
    java.util.concurrent.Future<UpdateAccountAuditConfigurationResult> updateAccountAuditConfigurationAsync(
            UpdateAccountAuditConfigurationRequest updateAccountAuditConfigurationRequest);

    /**
     * <p>
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * 
     * @param updateAccountAuditConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountAuditConfiguration operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.UpdateAccountAuditConfiguration
     */
    java.util.concurrent.Future<UpdateAccountAuditConfigurationResult> updateAccountAuditConfigurationAsync(
            UpdateAccountAuditConfigurationRequest updateAccountAuditConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountAuditConfigurationRequest, UpdateAccountAuditConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates an authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @return A Java Future containing the result of the UpdateAuthorizer operation returned by the service.
     * @sample AWSIotAsync.UpdateAuthorizer
     */
    java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest updateAuthorizerRequest);

    /**
     * <p>
     * Updates an authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAuthorizer operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateAuthorizer
     */
    java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest updateAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAuthorizerRequest, UpdateAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Updates information about the billing group.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @return A Java Future containing the result of the UpdateBillingGroup operation returned by the service.
     * @sample AWSIotAsync.UpdateBillingGroup
     */
    java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(UpdateBillingGroupRequest updateBillingGroupRequest);

    /**
     * <p>
     * Updates information about the billing group.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBillingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateBillingGroup
     */
    java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(UpdateBillingGroupRequest updateBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBillingGroupRequest, UpdateBillingGroupResult> asyncHandler);

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
     * Updates a dynamic thing group.
     * </p>
     * 
     * @param updateDynamicThingGroupRequest
     * @return A Java Future containing the result of the UpdateDynamicThingGroup operation returned by the service.
     * @sample AWSIotAsync.UpdateDynamicThingGroup
     */
    java.util.concurrent.Future<UpdateDynamicThingGroupResult> updateDynamicThingGroupAsync(UpdateDynamicThingGroupRequest updateDynamicThingGroupRequest);

    /**
     * <p>
     * Updates a dynamic thing group.
     * </p>
     * 
     * @param updateDynamicThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDynamicThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateDynamicThingGroup
     */
    java.util.concurrent.Future<UpdateDynamicThingGroupResult> updateDynamicThingGroupAsync(UpdateDynamicThingGroupRequest updateDynamicThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDynamicThingGroupRequest, UpdateDynamicThingGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the event configurations.
     * </p>
     * 
     * @param updateEventConfigurationsRequest
     * @return A Java Future containing the result of the UpdateEventConfigurations operation returned by the service.
     * @sample AWSIotAsync.UpdateEventConfigurations
     */
    java.util.concurrent.Future<UpdateEventConfigurationsResult> updateEventConfigurationsAsync(
            UpdateEventConfigurationsRequest updateEventConfigurationsRequest);

    /**
     * <p>
     * Updates the event configurations.
     * </p>
     * 
     * @param updateEventConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventConfigurations operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateEventConfigurations
     */
    java.util.concurrent.Future<UpdateEventConfigurationsResult> updateEventConfigurationsAsync(
            UpdateEventConfigurationsRequest updateEventConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEventConfigurationsRequest, UpdateEventConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Updates the search configuration.
     * </p>
     * 
     * @param updateIndexingConfigurationRequest
     * @return A Java Future containing the result of the UpdateIndexingConfiguration operation returned by the service.
     * @sample AWSIotAsync.UpdateIndexingConfiguration
     */
    java.util.concurrent.Future<UpdateIndexingConfigurationResult> updateIndexingConfigurationAsync(
            UpdateIndexingConfigurationRequest updateIndexingConfigurationRequest);

    /**
     * <p>
     * Updates the search configuration.
     * </p>
     * 
     * @param updateIndexingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIndexingConfiguration operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateIndexingConfiguration
     */
    java.util.concurrent.Future<UpdateIndexingConfigurationResult> updateIndexingConfigurationAsync(
            UpdateIndexingConfigurationRequest updateIndexingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIndexingConfigurationRequest, UpdateIndexingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates supported fields of the specified job.
     * </p>
     * 
     * @param updateJobRequest
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AWSIotAsync.UpdateJob
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest);

    /**
     * <p>
     * Updates supported fields of the specified job.
     * </p>
     * 
     * @param updateJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateJob
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler);

    /**
     * <p>
     * Updates a role alias.
     * </p>
     * 
     * @param updateRoleAliasRequest
     * @return A Java Future containing the result of the UpdateRoleAlias operation returned by the service.
     * @sample AWSIotAsync.UpdateRoleAlias
     */
    java.util.concurrent.Future<UpdateRoleAliasResult> updateRoleAliasAsync(UpdateRoleAliasRequest updateRoleAliasRequest);

    /**
     * <p>
     * Updates a role alias.
     * </p>
     * 
     * @param updateRoleAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoleAlias operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateRoleAlias
     */
    java.util.concurrent.Future<UpdateRoleAliasResult> updateRoleAliasAsync(UpdateRoleAliasRequest updateRoleAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoleAliasRequest, UpdateRoleAliasResult> asyncHandler);

    /**
     * <p>
     * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
     * </p>
     * 
     * @param updateScheduledAuditRequest
     * @return A Java Future containing the result of the UpdateScheduledAudit operation returned by the service.
     * @sample AWSIotAsync.UpdateScheduledAudit
     */
    java.util.concurrent.Future<UpdateScheduledAuditResult> updateScheduledAuditAsync(UpdateScheduledAuditRequest updateScheduledAuditRequest);

    /**
     * <p>
     * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
     * </p>
     * 
     * @param updateScheduledAuditRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateScheduledAudit operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateScheduledAudit
     */
    java.util.concurrent.Future<UpdateScheduledAuditResult> updateScheduledAuditAsync(UpdateScheduledAuditRequest updateScheduledAuditRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateScheduledAuditRequest, UpdateScheduledAuditResult> asyncHandler);

    /**
     * <p>
     * Updates a Device Defender security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return A Java Future containing the result of the UpdateSecurityProfile operation returned by the service.
     * @sample AWSIotAsync.UpdateSecurityProfile
     */
    java.util.concurrent.Future<UpdateSecurityProfileResult> updateSecurityProfileAsync(UpdateSecurityProfileRequest updateSecurityProfileRequest);

    /**
     * <p>
     * Updates a Device Defender security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityProfile operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateSecurityProfile
     */
    java.util.concurrent.Future<UpdateSecurityProfileResult> updateSecurityProfileAsync(UpdateSecurityProfileRequest updateSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityProfileRequest, UpdateSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Updates an existing stream. The stream version will be incremented by one.
     * </p>
     * 
     * @param updateStreamRequest
     * @return A Java Future containing the result of the UpdateStream operation returned by the service.
     * @sample AWSIotAsync.UpdateStream
     */
    java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest updateStreamRequest);

    /**
     * <p>
     * Updates an existing stream. The stream version will be incremented by one.
     * </p>
     * 
     * @param updateStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStream operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateStream
     */
    java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest updateStreamRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStreamRequest, UpdateStreamResult> asyncHandler);

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

    /**
     * <p>
     * Update a thing group.
     * </p>
     * 
     * @param updateThingGroupRequest
     * @return A Java Future containing the result of the UpdateThingGroup operation returned by the service.
     * @sample AWSIotAsync.UpdateThingGroup
     */
    java.util.concurrent.Future<UpdateThingGroupResult> updateThingGroupAsync(UpdateThingGroupRequest updateThingGroupRequest);

    /**
     * <p>
     * Update a thing group.
     * </p>
     * 
     * @param updateThingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThingGroup operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateThingGroup
     */
    java.util.concurrent.Future<UpdateThingGroupResult> updateThingGroupAsync(UpdateThingGroupRequest updateThingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThingGroupRequest, UpdateThingGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the groups to which the thing belongs.
     * </p>
     * 
     * @param updateThingGroupsForThingRequest
     * @return A Java Future containing the result of the UpdateThingGroupsForThing operation returned by the service.
     * @sample AWSIotAsync.UpdateThingGroupsForThing
     */
    java.util.concurrent.Future<UpdateThingGroupsForThingResult> updateThingGroupsForThingAsync(
            UpdateThingGroupsForThingRequest updateThingGroupsForThingRequest);

    /**
     * <p>
     * Updates the groups to which the thing belongs.
     * </p>
     * 
     * @param updateThingGroupsForThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThingGroupsForThing operation returned by the service.
     * @sample AWSIotAsyncHandler.UpdateThingGroupsForThing
     */
    java.util.concurrent.Future<UpdateThingGroupsForThingResult> updateThingGroupsForThingAsync(
            UpdateThingGroupsForThingRequest updateThingGroupsForThingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThingGroupsForThingRequest, UpdateThingGroupsForThingResult> asyncHandler);

    /**
     * <p>
     * Validates a Device Defender security profile behaviors specification.
     * </p>
     * 
     * @param validateSecurityProfileBehaviorsRequest
     * @return A Java Future containing the result of the ValidateSecurityProfileBehaviors operation returned by the
     *         service.
     * @sample AWSIotAsync.ValidateSecurityProfileBehaviors
     */
    java.util.concurrent.Future<ValidateSecurityProfileBehaviorsResult> validateSecurityProfileBehaviorsAsync(
            ValidateSecurityProfileBehaviorsRequest validateSecurityProfileBehaviorsRequest);

    /**
     * <p>
     * Validates a Device Defender security profile behaviors specification.
     * </p>
     * 
     * @param validateSecurityProfileBehaviorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateSecurityProfileBehaviors operation returned by the
     *         service.
     * @sample AWSIotAsyncHandler.ValidateSecurityProfileBehaviors
     */
    java.util.concurrent.Future<ValidateSecurityProfileBehaviorsResult> validateSecurityProfileBehaviorsAsync(
            ValidateSecurityProfileBehaviorsRequest validateSecurityProfileBehaviorsRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateSecurityProfileBehaviorsRequest, ValidateSecurityProfileBehaviorsResult> asyncHandler);

}
