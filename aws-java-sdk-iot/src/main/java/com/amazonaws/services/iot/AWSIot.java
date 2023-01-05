/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iot.model.*;

/**
 * Interface for accessing AWS IoT.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iot.AbstractAWSIot} instead.
 * </p>
 * <p>
 * <fullname>IoT</fullname>
 * <p>
 * IoT provides secure, bi-directional communication between Internet-connected devices (such as sensors, actuators,
 * embedded devices, or smart appliances) and the Amazon Web Services cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and integration with other services, organize
 * resources associated with each device (Registry), configure logging, and create and manage policies and credentials
 * to authenticate devices.
 * </p>
 * <p>
 * The service endpoints that expose this API are listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html">Amazon Web Services IoT Core Endpoints and
 * Quotas</a>. You must use the endpoint for the region that has the resources you want to access.
 * </p>
 * <p>
 * The service name used by <a href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Amazon Web
 * Services Signature Version 4</a> to sign the request is: <i>execute-api</i>.
 * </p>
 * <p>
 * For more information about how IoT works, see the <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html">Developer Guide</a>.
 * </p>
 * <p>
 * For information about how to use the credentials provider for IoT, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorizing-direct-aws.html">Authorizing Direct Calls to
 * Amazon Web Services Services</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIot {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iot";

    /**
     * Overrides the default endpoint for this client ("https://iot.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "iot.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://iot.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "iot.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://iot.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSIot#setEndpoint(String)}, sets the regional endpoint for this client's service calls.
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AcceptCertificateTransfer</a> action.
     * </p>
     * 
     * @param acceptCertificateTransferRequest
     *        The input for the AcceptCertificateTransfer operation.
     * @return Result of the AcceptCertificateTransfer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because the transfer is already complete.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AcceptCertificateTransfer
     */
    AcceptCertificateTransferResult acceptCertificateTransfer(AcceptCertificateTransferRequest acceptCertificateTransferRequest);

    /**
     * <p>
     * Adds a thing to a billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AddThingToBillingGroup</a> action.
     * </p>
     * 
     * @param addThingToBillingGroupRequest
     * @return Result of the AddThingToBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.AddThingToBillingGroup
     */
    AddThingToBillingGroupResult addThingToBillingGroup(AddThingToBillingGroupRequest addThingToBillingGroupRequest);

    /**
     * <p>
     * Adds a thing to a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AddThingToThingGroup</a> action.
     * </p>
     * 
     * @param addThingToThingGroupRequest
     * @return Result of the AddThingToThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.AddThingToThingGroup
     */
    AddThingToThingGroupResult addThingToThingGroup(AddThingToThingGroupRequest addThingToThingGroupRequest);

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
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AssociateTargetsWithJob</a> action.
     * </p>
     * 
     * @param associateTargetsWithJobRequest
     * @return Result of the AssociateTargetsWithJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.AssociateTargetsWithJob
     */
    AssociateTargetsWithJobResult associateTargetsWithJob(AssociateTargetsWithJobRequest associateTargetsWithJobRequest);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or other credential).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachPolicy</a> action.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return Result of the AttachPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.AttachPolicy
     */
    AttachPolicyResult attachPolicy(AttachPolicyRequest attachPolicyRequest);

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or other credential).
     * </p>
     * <p>
     * <b>Note:</b> This action is deprecated and works as expected for backward compatibility, but we won't add
     * enhancements. Use <a>AttachPolicy</a> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachPrincipalPolicy</a> action.
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @return Result of the AttachPrincipalPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.AttachPrincipalPolicy
     */
    @Deprecated
    AttachPrincipalPolicyResult attachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest);

    /**
     * <p>
     * Associates a Device Defender security profile with a thing group or this account. Each thing group or account can
     * have up to five security profiles associated with it.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachSecurityProfile</a> action.
     * </p>
     * 
     * @param attachSecurityProfileRequest
     * @return Result of the AttachSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AttachSecurityProfile
     */
    AttachSecurityProfileResult attachSecurityProfile(AttachSecurityProfileRequest attachSecurityProfileRequest);

    /**
     * <p>
     * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, Amazon Cognito
     * identities or federated identities.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachThingPrincipal</a> action.
     * </p>
     * 
     * @param attachThingPrincipalRequest
     *        The input for the AttachThingPrincipal operation.
     * @return Result of the AttachThingPrincipal operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AttachThingPrincipal
     */
    AttachThingPrincipalResult attachThingPrincipal(AttachThingPrincipalRequest attachThingPrincipalRequest);

    /**
     * <p>
     * Cancels a mitigation action task that is in progress. If the task is not in progress, an InvalidRequestException
     * occurs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelAuditMitigationActionsTask</a> action.
     * </p>
     * 
     * @param cancelAuditMitigationActionsTaskRequest
     * @return Result of the CancelAuditMitigationActionsTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CancelAuditMitigationActionsTask
     */
    CancelAuditMitigationActionsTaskResult cancelAuditMitigationActionsTask(CancelAuditMitigationActionsTaskRequest cancelAuditMitigationActionsTaskRequest);

    /**
     * <p>
     * Cancels an audit that is in progress. The audit can be either scheduled or on demand. If the audit isn't in
     * progress, an "InvalidRequestException" occurs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelAuditTask</a> action.
     * </p>
     * 
     * @param cancelAuditTaskRequest
     * @return Result of the CancelAuditTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CancelAuditTask
     */
    CancelAuditTaskResult cancelAuditTask(CancelAuditTaskRequest cancelAuditTaskRequest);

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations
     * can use <a>RejectCertificateTransfer</a> instead.) After transfer, IoT returns the certificate to the source
     * account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be
     * cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to
     * INACTIVE.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelCertificateTransfer</a> action.
     * </p>
     * 
     * @param cancelCertificateTransferRequest
     *        The input for the CancelCertificateTransfer operation.
     * @return Result of the CancelCertificateTransfer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because the transfer is already complete.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CancelCertificateTransfer
     */
    CancelCertificateTransferResult cancelCertificateTransfer(CancelCertificateTransferRequest cancelCertificateTransferRequest);

    /**
     * <p>
     * Cancels a Device Defender ML Detect mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelDetectMitigationActionsTask</a> action.
     * </p>
     * 
     * @param cancelDetectMitigationActionsTaskRequest
     * @return Result of the CancelDetectMitigationActionsTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CancelDetectMitigationActionsTask
     */
    CancelDetectMitigationActionsTaskResult cancelDetectMitigationActionsTask(CancelDetectMitigationActionsTaskRequest cancelDetectMitigationActionsTaskRequest);

    /**
     * <p>
     * Cancels a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelJob</a> action.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.CancelJob
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Cancels the execution of a job for a given thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelJobExecution</a> action.
     * </p>
     * 
     * @param cancelJobExecutionRequest
     * @return Result of the CancelJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidStateTransitionException
     *         An attempt was made to change to an invalid state, for example by deleting a job or a job execution which
     *         is "IN_PROGRESS" without setting the <code>force</code> parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @sample AWSIot.CancelJobExecution
     */
    CancelJobExecutionResult cancelJobExecution(CancelJobExecutionRequest cancelJobExecutionRequest);

    /**
     * <p>
     * Clears the default authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ClearDefaultAuthorizer</a> action.
     * </p>
     * 
     * @param clearDefaultAuthorizerRequest
     * @return Result of the ClearDefaultAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ClearDefaultAuthorizer
     */
    ClearDefaultAuthorizerResult clearDefaultAuthorizer(ClearDefaultAuthorizerRequest clearDefaultAuthorizerRequest);

    /**
     * <p>
     * Confirms a topic rule destination. When you create a rule requiring a destination, IoT sends a confirmation
     * message to the endpoint or base address you specify. The message includes a token which you pass back when
     * calling <code>ConfirmTopicRuleDestination</code> to confirm that you own or have access to the endpoint.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ConfirmTopicRuleDestination</a> action.
     * </p>
     * 
     * @param confirmTopicRuleDestinationRequest
     * @return Result of the ConfirmTopicRuleDestination operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.ConfirmTopicRuleDestination
     */
    ConfirmTopicRuleDestinationResult confirmTopicRuleDestination(ConfirmTopicRuleDestinationRequest confirmTopicRuleDestinationRequest);

    /**
     * <p>
     * Creates a Device Defender audit suppression.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateAuditSuppression</a> action.
     * </p>
     * 
     * @param createAuditSuppressionRequest
     * @return Result of the CreateAuditSuppression operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.CreateAuditSuppression
     */
    CreateAuditSuppressionResult createAuditSuppression(CreateAuditSuppressionRequest createAuditSuppressionRequest);

    /**
     * <p>
     * Creates an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateAuthorizer</a> action.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @return Result of the CreateAuthorizer operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateAuthorizer
     */
    CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest createAuthorizerRequest);

    /**
     * <p>
     * Creates a billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateBillingGroup</a> action.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @return Result of the CreateBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateBillingGroup
     */
    CreateBillingGroupResult createBillingGroup(CreateBillingGroupRequest createBillingGroupRequest);

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing request.
     * </p>
     * <p>
     * <b>Note:</b> The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or
     * an ECC key from NIST P-256, NIST P-384, or NIST P-512 curves. For supported certificates, consult <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/x509-client-certs.html#x509-cert-algorithms">
     * Certificate signing algorithms supported by IoT</a>.
     * </p>
     * <p>
     * <b>Note:</b> Reusing the same certificate signing request (CSR) results in a distinct certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateCertificateFromCsr</a> action.
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
     * create-certificate-from-csr Amazon Web Services CLI command to create a certificate for the corresponding CSR.
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
     * @return Result of the CreateCertificateFromCsr operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateCertificateFromCsr
     */
    CreateCertificateFromCsrResult createCertificateFromCsr(CreateCertificateFromCsrRequest createCertificateFromCsrRequest);

    /**
     * <p>
     * Use this API to define a Custom Metric published by your devices to Device Defender.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateCustomMetric</a> action.
     * </p>
     * 
     * @param createCustomMetricRequest
     * @return Result of the CreateCustomMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateCustomMetric
     */
    CreateCustomMetricResult createCustomMetric(CreateCustomMetricRequest createCustomMetricRequest);

    /**
     * <p>
     * Create a dimension that you can use to limit the scope of a metric used in a security profile for IoT Device
     * Defender. For example, using a <code>TOPIC_FILTER</code> dimension, you can narrow down the scope of the metric
     * only to MQTT topics whose name match the pattern specified in the dimension.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateDimension</a> action.
     * </p>
     * 
     * @param createDimensionRequest
     * @return Result of the CreateDimension operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.CreateDimension
     */
    CreateDimensionResult createDimension(CreateDimensionRequest createDimensionRequest);

    /**
     * <p>
     * Creates a domain configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateDomainConfiguration</a> action.
     * </p>
     * 
     * @param createDomainConfigurationRequest
     * @return Result of the CreateDomainConfiguration operation returned by the service.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.CreateDomainConfiguration
     */
    CreateDomainConfigurationResult createDomainConfiguration(CreateDomainConfigurationRequest createDomainConfigurationRequest);

    /**
     * <p>
     * Creates a dynamic thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateDynamicThingGroup</a> action.
     * </p>
     * 
     * @param createDynamicThingGroupRequest
     * @return Result of the CreateDynamicThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.CreateDynamicThingGroup
     */
    CreateDynamicThingGroupResult createDynamicThingGroup(CreateDynamicThingGroupRequest createDynamicThingGroupRequest);

    /**
     * <p>
     * Creates a fleet metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateFleetMetric</a> action.
     * </p>
     * 
     * @param createFleetMetricRequest
     * @return Result of the CreateFleetMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws InvalidAggregationException
     *         The aggregation is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.CreateFleetMetric
     */
    CreateFleetMetricResult createFleetMetric(CreateFleetMetricRequest createFleetMetricRequest);

    /**
     * <p>
     * Creates a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateJob</a> action.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.CreateJob
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates a job template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateJobTemplate</a> action.
     * </p>
     * 
     * @param createJobTemplateRequest
     * @return Result of the CreateJobTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ConflictException
     *         A resource with the same name already exists.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateJobTemplate
     */
    CreateJobTemplateResult createJobTemplate(CreateJobTemplateRequest createJobTemplateRequest);

    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key. You can also call
     * <code>CreateKeysAndCertificate</code> over MQTT from a device, for more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/provision-wo-cert.html#provision-mqtt-api"
     * >Provisioning MQTT API</a>.
     * </p>
     * <p>
     * <b>Note</b> This is the only time IoT issues the private key for this certificate, so it is important to keep it
     * in a secure location.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateKeysAndCertificate</a> action.
     * </p>
     * 
     * @param createKeysAndCertificateRequest
     *        The input for the CreateKeysAndCertificate operation.</p>
     *        <p>
     *        Requires permission to access the <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     *        >CreateKeysAndCertificateRequest</a> action.
     * @return Result of the CreateKeysAndCertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateKeysAndCertificate
     */
    CreateKeysAndCertificateResult createKeysAndCertificate(CreateKeysAndCertificateRequest createKeysAndCertificateRequest);

    /**
     * <p>
     * Defines an action that can be applied to audit findings by using StartAuditMitigationActionsTask. Only certain
     * types of mitigation actions can be applied to specific check names. For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-mitigation-actions.html">Mitigation
     * actions</a>. Each mitigation action can apply only one type of change.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateMitigationAction</a> action.
     * </p>
     * 
     * @param createMitigationActionRequest
     * @return Result of the CreateMitigationAction operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateMitigationAction
     */
    CreateMitigationActionResult createMitigationAction(CreateMitigationActionRequest createMitigationActionRequest);

    /**
     * <p>
     * Creates an IoT OTA update on a target group of things or groups.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateOTAUpdate</a> action.
     * </p>
     * 
     * @param createOTAUpdateRequest
     * @return Result of the CreateOTAUpdate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.CreateOTAUpdate
     */
    CreateOTAUpdateResult createOTAUpdate(CreateOTAUpdateRequest createOTAUpdateRequest);

    /**
     * <p>
     * Creates an IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation creates a policy version with a version
     * identifier of <b>1</b> and sets <b>1</b> as the policy's default version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreatePolicy</a> action.
     * </p>
     * 
     * @param createPolicyRequest
     *        The input for the CreatePolicy operation.
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws MalformedPolicyException
     *         The policy documentation is not valid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreatePolicy
     */
    CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Creates a new version of the specified IoT policy. To update a policy, create a new policy version. A managed
     * policy can have up to five versions. If the policy has five versions, you must use <a>DeletePolicyVersion</a> to
     * delete an existing version before you create a new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version. The default version is the operative
     * version (that is, the version that is in effect for the certificates to which the policy is attached).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreatePolicyVersion</a> action.
     * </p>
     * 
     * @param createPolicyVersionRequest
     *        The input for the CreatePolicyVersion operation.
     * @return Result of the CreatePolicyVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws MalformedPolicyException
     *         The policy documentation is not valid.
     * @throws VersionsLimitExceededException
     *         The number of policy versions exceeds the limit.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreatePolicyVersion
     */
    CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest);

    /**
     * <p>
     * Creates a provisioning claim.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateProvisioningClaim</a> action.
     * </p>
     * 
     * @param createProvisioningClaimRequest
     * @return Result of the CreateProvisioningClaim operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateProvisioningClaim
     */
    CreateProvisioningClaimResult createProvisioningClaim(CreateProvisioningClaimRequest createProvisioningClaimRequest);

    /**
     * <p>
     * Creates a provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateProvisioningTemplate</a> action.
     * </p>
     * 
     * @param createProvisioningTemplateRequest
     * @return Result of the CreateProvisioningTemplate operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIot.CreateProvisioningTemplate
     */
    CreateProvisioningTemplateResult createProvisioningTemplate(CreateProvisioningTemplateRequest createProvisioningTemplateRequest);

    /**
     * <p>
     * Creates a new version of a provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateProvisioningTemplateVersion</a> action.
     * </p>
     * 
     * @param createProvisioningTemplateVersionRequest
     * @return Result of the CreateProvisioningTemplateVersion operation returned by the service.
     * @throws VersionsLimitExceededException
     *         The number of policy versions exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.CreateProvisioningTemplateVersion
     */
    CreateProvisioningTemplateVersionResult createProvisioningTemplateVersion(CreateProvisioningTemplateVersionRequest createProvisioningTemplateVersionRequest);

    /**
     * <p>
     * Creates a role alias.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateRoleAlias</a> action.
     * </p>
     * 
     * @param createRoleAliasRequest
     * @return Result of the CreateRoleAlias operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateRoleAlias
     */
    CreateRoleAliasResult createRoleAlias(CreateRoleAliasRequest createRoleAliasRequest);

    /**
     * <p>
     * Creates a scheduled audit that is run at a specified time interval.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateScheduledAudit</a> action.
     * </p>
     * 
     * @param createScheduledAuditRequest
     * @return Result of the CreateScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.CreateScheduledAudit
     */
    CreateScheduledAuditResult createScheduledAudit(CreateScheduledAuditRequest createScheduledAuditRequest);

    /**
     * <p>
     * Creates a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateSecurityProfile</a> action.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return Result of the CreateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateSecurityProfile
     */
    CreateSecurityProfileResult createSecurityProfile(CreateSecurityProfileRequest createSecurityProfileRequest);

    /**
     * <p>
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
     * chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
     * a stream.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateStream</a> action.
     * </p>
     * 
     * @param createStreamRequest
     * @return Result of the CreateStream operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateStream
     */
    CreateStreamResult createStream(CreateStreamRequest createStreamRequest);

    /**
     * <p>
     * Creates a thing record in the registry. If this call is made multiple times using the same thing name and
     * configuration, the call will succeed. If this call is made with the same thing name but different configuration a
     * <code>ResourceAlreadyExistsException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-authorization.html">Authorization</a> for
     * information about authorizing control plane actions.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateThing</a> action.
     * </p>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @return Result of the CreateThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.CreateThing
     */
    CreateThingResult createThing(CreateThingRequest createThingRequest);

    /**
     * <p>
     * Create a thing group.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-authorization.html">Authorization</a> for
     * information about authorizing control plane actions.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateThingGroup</a> action.
     * </p>
     * 
     * @param createThingGroupRequest
     * @return Result of the CreateThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateThingGroup
     */
    CreateThingGroupResult createThingGroup(CreateThingGroupRequest createThingGroupRequest);

    /**
     * <p>
     * Creates a new thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateThingType</a> action.
     * </p>
     * 
     * @param createThingTypeRequest
     *        The input for the CreateThingType operation.
     * @return Result of the CreateThingType operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIot.CreateThingType
     */
    CreateThingTypeResult createThingType(CreateThingTypeRequest createThingTypeRequest);

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will
     * be able to access data processed by the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateTopicRule</a> action.
     * </p>
     * 
     * @param createTopicRuleRequest
     *        The input for the CreateTopicRule operation.
     * @return Result of the CreateTopicRule operation returned by the service.
     * @throws SqlParseException
     *         The Rule-SQL expression can't be parsed correctly.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.CreateTopicRule
     */
    CreateTopicRuleResult createTopicRule(CreateTopicRuleRequest createTopicRuleRequest);

    /**
     * <p>
     * Creates a topic rule destination. The destination must be confirmed prior to use.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateTopicRuleDestination</a> action.
     * </p>
     * 
     * @param createTopicRuleDestinationRequest
     * @return Result of the CreateTopicRuleDestination operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.CreateTopicRuleDestination
     */
    CreateTopicRuleDestinationResult createTopicRuleDestination(CreateTopicRuleDestinationRequest createTopicRuleDestinationRequest);

    /**
     * <p>
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is
     * deleted and all audit checks are reset to disabled.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteAccountAuditConfiguration</a> action.
     * </p>
     * 
     * @param deleteAccountAuditConfigurationRequest
     * @return Result of the DeleteAccountAuditConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteAccountAuditConfiguration
     */
    DeleteAccountAuditConfigurationResult deleteAccountAuditConfiguration(DeleteAccountAuditConfigurationRequest deleteAccountAuditConfigurationRequest);

    /**
     * <p>
     * Deletes a Device Defender audit suppression.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteAuditSuppression</a> action.
     * </p>
     * 
     * @param deleteAuditSuppressionRequest
     * @return Result of the DeleteAuditSuppression operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteAuditSuppression
     */
    DeleteAuditSuppressionResult deleteAuditSuppression(DeleteAuditSuppressionRequest deleteAuditSuppressionRequest);

    /**
     * <p>
     * Deletes an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteAuthorizer</a> action.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @return Result of the DeleteAuthorizer operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteAuthorizer
     */
    DeleteAuthorizerResult deleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest);

    /**
     * <p>
     * Deletes the billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteBillingGroup</a> action.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @return Result of the DeleteBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteBillingGroup
     */
    DeleteBillingGroupResult deleteBillingGroup(DeleteBillingGroupRequest deleteBillingGroupRequest);

    /**
     * <p>
     * Deletes a registered CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteCACertificate</a> action.
     * </p>
     * 
     * @param deleteCACertificateRequest
     *        Input for the DeleteCACertificate operation.
     * @return Result of the DeleteCACertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DeleteCACertificate
     */
    DeleteCACertificateResult deleteCACertificate(DeleteCACertificateRequest deleteCACertificateRequest);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy or IoT thing attached to it or if its status is set to ACTIVE.
     * To delete a certificate, first use the <a>DetachPolicy</a> action to detach all policies. Next, use the
     * <a>UpdateCertificate</a> action to set the certificate to the INACTIVE status.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteCertificate</a> action.
     * </p>
     * 
     * @param deleteCertificateRequest
     *        The input for the DeleteCertificate operation.
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DeleteCertificate
     */
    DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes a Device Defender detect custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteCustomMetric</a> action.
     * </p>
     * <note>
     * <p>
     * Before you can delete a custom metric, you must first remove the custom metric from all security profiles it's a
     * part of. The security profile associated with the custom metric can be found using the <a
     * href="https://docs.aws.amazon.com/iot/latest/apireference/API_ListSecurityProfiles.html">ListSecurityProfiles</a>
     * API with <code>metricName</code> set to your custom metric name.
     * </p>
     * </note>
     * 
     * @param deleteCustomMetricRequest
     * @return Result of the DeleteCustomMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteCustomMetric
     */
    DeleteCustomMetricResult deleteCustomMetric(DeleteCustomMetricRequest deleteCustomMetricRequest);

    /**
     * <p>
     * Removes the specified dimension from your Amazon Web Services accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteDimension</a> action.
     * </p>
     * 
     * @param deleteDimensionRequest
     * @return Result of the DeleteDimension operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DeleteDimension
     */
    DeleteDimensionResult deleteDimension(DeleteDimensionRequest deleteDimensionRequest);

    /**
     * <p>
     * Deletes the specified domain configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteDomainConfiguration</a> action.
     * </p>
     * 
     * @param deleteDomainConfigurationRequest
     * @return Result of the DeleteDomainConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @sample AWSIot.DeleteDomainConfiguration
     */
    DeleteDomainConfigurationResult deleteDomainConfiguration(DeleteDomainConfigurationRequest deleteDomainConfigurationRequest);

    /**
     * <p>
     * Deletes a dynamic thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteDynamicThingGroup</a> action.
     * </p>
     * 
     * @param deleteDynamicThingGroupRequest
     * @return Result of the DeleteDynamicThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteDynamicThingGroup
     */
    DeleteDynamicThingGroupResult deleteDynamicThingGroup(DeleteDynamicThingGroupRequest deleteDynamicThingGroupRequest);

    /**
     * <p>
     * Deletes the specified fleet metric. Returns successfully with no error if the deletion is successful or you
     * specify a fleet metric that doesn't exist.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteFleetMetric</a> action.
     * </p>
     * 
     * @param deleteFleetMetricRequest
     * @return Result of the DeleteFleetMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @sample AWSIot.DeleteFleetMetric
     */
    DeleteFleetMetricResult deleteFleetMetric(DeleteFleetMetricRequest deleteFleetMetricRequest);

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
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteJob</a> action.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidStateTransitionException
     *         An attempt was made to change to an invalid state, for example by deleting a job or a job execution which
     *         is "IN_PROGRESS" without setting the <code>force</code> parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DeleteJob
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a job execution.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteJobExecution</a> action.
     * </p>
     * 
     * @param deleteJobExecutionRequest
     * @return Result of the DeleteJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidStateTransitionException
     *         An attempt was made to change to an invalid state, for example by deleting a job or a job execution which
     *         is "IN_PROGRESS" without setting the <code>force</code> parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DeleteJobExecution
     */
    DeleteJobExecutionResult deleteJobExecution(DeleteJobExecutionRequest deleteJobExecutionRequest);

    /**
     * <p>
     * Deletes the specified job template.
     * </p>
     * 
     * @param deleteJobTemplateRequest
     * @return Result of the DeleteJobTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteJobTemplate
     */
    DeleteJobTemplateResult deleteJobTemplate(DeleteJobTemplateRequest deleteJobTemplateRequest);

    /**
     * <p>
     * Deletes a defined mitigation action from your Amazon Web Services accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteMitigationAction</a> action.
     * </p>
     * 
     * @param deleteMitigationActionRequest
     * @return Result of the DeleteMitigationAction operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteMitigationAction
     */
    DeleteMitigationActionResult deleteMitigationAction(DeleteMitigationActionRequest deleteMitigationActionRequest);

    /**
     * <p>
     * Delete an OTA update.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteOTAUpdate</a> action.
     * </p>
     * 
     * @param deleteOTAUpdateRequest
     * @return Result of the DeleteOTAUpdate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @sample AWSIot.DeleteOTAUpdate
     */
    DeleteOTAUpdateResult deleteOTAUpdate(DeleteOTAUpdateRequest deleteOTAUpdateRequest);

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions or it is attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, use the <a>DeletePolicyVersion</a> action to delete all non-default versions of the policy;
     * use the <a>DetachPolicy</a> action to detach the policy from any certificate; and then use the DeletePolicy
     * action to delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is deleted with it.
     * </p>
     * <note>
     * <p>
     * Because of the distributed nature of Amazon Web Services, it can take up to five minutes after a policy is
     * detached before it's ready to be deleted.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeletePolicy</a> action.
     * </p>
     * 
     * @param deletePolicyRequest
     *        The input for the DeletePolicy operation.
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeletePolicy
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using
     * this action. To delete the default version of a policy, use <a>DeletePolicy</a>. To find out which version of a
     * policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeletePolicyVersion</a> action.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     *        The input for the DeletePolicyVersion operation.
     * @return Result of the DeletePolicyVersion operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeletePolicyVersion
     */
    DeletePolicyVersionResult deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest);

    /**
     * <p>
     * Deletes a provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteProvisioningTemplate</a> action.
     * </p>
     * 
     * @param deleteProvisioningTemplateRequest
     * @return Result of the DeleteProvisioningTemplate operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.DeleteProvisioningTemplate
     */
    DeleteProvisioningTemplateResult deleteProvisioningTemplate(DeleteProvisioningTemplateRequest deleteProvisioningTemplateRequest);

    /**
     * <p>
     * Deletes a provisioning template version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteProvisioningTemplateVersion</a> action.
     * </p>
     * 
     * @param deleteProvisioningTemplateVersionRequest
     * @return Result of the DeleteProvisioningTemplateVersion operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @sample AWSIot.DeleteProvisioningTemplateVersion
     */
    DeleteProvisioningTemplateVersionResult deleteProvisioningTemplateVersion(DeleteProvisioningTemplateVersionRequest deleteProvisioningTemplateVersionRequest);

    /**
     * <p>
     * Deletes a CA certificate registration code.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteRegistrationCode</a> action.
     * </p>
     * 
     * @param deleteRegistrationCodeRequest
     *        The input for the DeleteRegistrationCode operation.
     * @return Result of the DeleteRegistrationCode operation returned by the service.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteRegistrationCode
     */
    DeleteRegistrationCodeResult deleteRegistrationCode(DeleteRegistrationCodeRequest deleteRegistrationCodeRequest);

    /**
     * <p>
     * Deletes a role alias
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteRoleAlias</a> action.
     * </p>
     * 
     * @param deleteRoleAliasRequest
     * @return Result of the DeleteRoleAlias operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DeleteRoleAlias
     */
    DeleteRoleAliasResult deleteRoleAlias(DeleteRoleAliasRequest deleteRoleAliasRequest);

    /**
     * <p>
     * Deletes a scheduled audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteScheduledAudit</a> action.
     * </p>
     * 
     * @param deleteScheduledAuditRequest
     * @return Result of the DeleteScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteScheduledAudit
     */
    DeleteScheduledAuditResult deleteScheduledAudit(DeleteScheduledAuditRequest deleteScheduledAuditRequest);

    /**
     * <p>
     * Deletes a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteSecurityProfile</a> action.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return Result of the DeleteSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @sample AWSIot.DeleteSecurityProfile
     */
    DeleteSecurityProfileResult deleteSecurityProfile(DeleteSecurityProfileRequest deleteSecurityProfileRequest);

    /**
     * <p>
     * Deletes a stream.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteStream</a> action.
     * </p>
     * 
     * @param deleteStreamRequest
     * @return Result of the DeleteStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteStream
     */
    DeleteStreamResult deleteStream(DeleteStreamRequest deleteStreamRequest);

    /**
     * <p>
     * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a
     * thing that doesn't exist.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThing</a> action.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @return Result of the DeleteThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThing
     */
    DeleteThingResult deleteThing(DeleteThingRequest deleteThingRequest);

    /**
     * <p>
     * Deletes a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingGroup</a> action.
     * </p>
     * 
     * @param deleteThingGroupRequest
     * @return Result of the DeleteThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThingGroup
     */
    DeleteThingGroupResult deleteThingGroup(DeleteThingGroupRequest deleteThingGroupRequest);

    /**
     * <p>
     * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a
     * thing type, first mark it as deprecated by calling <a>DeprecateThingType</a>, then remove any associated things
     * by calling <a>UpdateThing</a> to change the thing type on any associated thing, and finally use
     * <a>DeleteThingType</a> to delete the thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingType</a> action.
     * </p>
     * 
     * @param deleteThingTypeRequest
     *        The input for the DeleteThingType operation.
     * @return Result of the DeleteThingType operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThingType
     */
    DeleteThingTypeResult deleteThingType(DeleteThingTypeRequest deleteThingTypeRequest);

    /**
     * <p>
     * Deletes the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteTopicRule</a> action.
     * </p>
     * 
     * @param deleteTopicRuleRequest
     *        The input for the DeleteTopicRule operation.
     * @return Result of the DeleteTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.DeleteTopicRule
     */
    DeleteTopicRuleResult deleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest);

    /**
     * <p>
     * Deletes a topic rule destination.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteTopicRuleDestination</a> action.
     * </p>
     * 
     * @param deleteTopicRuleDestinationRequest
     * @return Result of the DeleteTopicRuleDestination operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.DeleteTopicRuleDestination
     */
    DeleteTopicRuleDestinationResult deleteTopicRuleDestination(DeleteTopicRuleDestinationRequest deleteTopicRuleDestinationRequest);

    /**
     * <p>
     * Deletes a logging level.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteV2LoggingLevel</a> action.
     * </p>
     * 
     * @param deleteV2LoggingLevelRequest
     * @return Result of the DeleteV2LoggingLevel operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DeleteV2LoggingLevel
     */
    DeleteV2LoggingLevelResult deleteV2LoggingLevel(DeleteV2LoggingLevelRequest deleteV2LoggingLevelRequest);

    /**
     * <p>
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeprecateThingType</a> action.
     * </p>
     * 
     * @param deprecateThingTypeRequest
     *        The input for the DeprecateThingType operation.
     * @return Result of the DeprecateThingType operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeprecateThingType
     */
    DeprecateThingTypeResult deprecateThingType(DeprecateThingTypeRequest deprecateThingTypeRequest);

    /**
     * <p>
     * Gets information about the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAccountAuditConfiguration</a> action.
     * </p>
     * 
     * @param describeAccountAuditConfigurationRequest
     * @return Result of the DescribeAccountAuditConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAccountAuditConfiguration
     */
    DescribeAccountAuditConfigurationResult describeAccountAuditConfiguration(DescribeAccountAuditConfigurationRequest describeAccountAuditConfigurationRequest);

    /**
     * <p>
     * Gets information about a single audit finding. Properties include the reason for noncompliance, the severity of
     * the issue, and the start time when the audit that returned the finding.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAuditFinding</a> action.
     * </p>
     * 
     * @param describeAuditFindingRequest
     * @return Result of the DescribeAuditFinding operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAuditFinding
     */
    DescribeAuditFindingResult describeAuditFinding(DescribeAuditFindingRequest describeAuditFindingRequest);

    /**
     * <p>
     * Gets information about an audit mitigation task that is used to apply mitigation actions to a set of audit
     * findings. Properties include the actions being applied, the audit checks to which they're being applied, the task
     * status, and aggregated task statistics.
     * </p>
     * 
     * @param describeAuditMitigationActionsTaskRequest
     * @return Result of the DescribeAuditMitigationActionsTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAuditMitigationActionsTask
     */
    DescribeAuditMitigationActionsTaskResult describeAuditMitigationActionsTask(
            DescribeAuditMitigationActionsTaskRequest describeAuditMitigationActionsTaskRequest);

    /**
     * <p>
     * Gets information about a Device Defender audit suppression.
     * </p>
     * 
     * @param describeAuditSuppressionRequest
     * @return Result of the DescribeAuditSuppression operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAuditSuppression
     */
    DescribeAuditSuppressionResult describeAuditSuppression(DescribeAuditSuppressionRequest describeAuditSuppressionRequest);

    /**
     * <p>
     * Gets information about a Device Defender audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAuditTask</a> action.
     * </p>
     * 
     * @param describeAuditTaskRequest
     * @return Result of the DescribeAuditTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAuditTask
     */
    DescribeAuditTaskResult describeAuditTask(DescribeAuditTaskRequest describeAuditTaskRequest);

    /**
     * <p>
     * Describes an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAuthorizer</a> action.
     * </p>
     * 
     * @param describeAuthorizerRequest
     * @return Result of the DescribeAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAuthorizer
     */
    DescribeAuthorizerResult describeAuthorizer(DescribeAuthorizerRequest describeAuthorizerRequest);

    /**
     * <p>
     * Returns information about a billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeBillingGroup</a> action.
     * </p>
     * 
     * @param describeBillingGroupRequest
     * @return Result of the DescribeBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeBillingGroup
     */
    DescribeBillingGroupResult describeBillingGroup(DescribeBillingGroupRequest describeBillingGroupRequest);

    /**
     * <p>
     * Describes a registered CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeCACertificate</a> action.
     * </p>
     * 
     * @param describeCACertificateRequest
     *        The input for the DescribeCACertificate operation.
     * @return Result of the DescribeCACertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeCACertificate
     */
    DescribeCACertificateResult describeCACertificate(DescribeCACertificateRequest describeCACertificateRequest);

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeCertificate</a> action.
     * </p>
     * 
     * @param describeCertificateRequest
     *        The input for the DescribeCertificate operation.
     * @return Result of the DescribeCertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeCertificate
     */
    DescribeCertificateResult describeCertificate(DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Gets information about a Device Defender detect custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeCustomMetric</a> action.
     * </p>
     * 
     * @param describeCustomMetricRequest
     * @return Result of the DescribeCustomMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeCustomMetric
     */
    DescribeCustomMetricResult describeCustomMetric(DescribeCustomMetricRequest describeCustomMetricRequest);

    /**
     * <p>
     * Describes the default authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDefaultAuthorizer</a> action.
     * </p>
     * 
     * @param describeDefaultAuthorizerRequest
     * @return Result of the DescribeDefaultAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeDefaultAuthorizer
     */
    DescribeDefaultAuthorizerResult describeDefaultAuthorizer(DescribeDefaultAuthorizerRequest describeDefaultAuthorizerRequest);

    /**
     * <p>
     * Gets information about a Device Defender ML Detect mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDetectMitigationActionsTask</a> action.
     * </p>
     * 
     * @param describeDetectMitigationActionsTaskRequest
     * @return Result of the DescribeDetectMitigationActionsTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeDetectMitigationActionsTask
     */
    DescribeDetectMitigationActionsTaskResult describeDetectMitigationActionsTask(
            DescribeDetectMitigationActionsTaskRequest describeDetectMitigationActionsTaskRequest);

    /**
     * <p>
     * Provides details about a dimension that is defined in your Amazon Web Services accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDimension</a> action.
     * </p>
     * 
     * @param describeDimensionRequest
     * @return Result of the DescribeDimension operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DescribeDimension
     */
    DescribeDimensionResult describeDimension(DescribeDimensionRequest describeDimensionRequest);

    /**
     * <p>
     * Gets summary information about a domain configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDomainConfiguration</a> action.
     * </p>
     * 
     * @param describeDomainConfigurationRequest
     * @return Result of the DescribeDomainConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeDomainConfiguration
     */
    DescribeDomainConfigurationResult describeDomainConfiguration(DescribeDomainConfigurationRequest describeDomainConfigurationRequest);

    /**
     * <p>
     * Returns a unique endpoint specific to the Amazon Web Services account making the call.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeEndpoint</a> action.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @return Result of the DescribeEndpoint operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DescribeEndpoint
     */
    DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest);

    /**
     * <p>
     * Describes event configurations.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeEventConfigurations</a> action.
     * </p>
     * 
     * @param describeEventConfigurationsRequest
     * @return Result of the DescribeEventConfigurations operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DescribeEventConfigurations
     */
    DescribeEventConfigurationsResult describeEventConfigurations(DescribeEventConfigurationsRequest describeEventConfigurationsRequest);

    /**
     * <p>
     * Gets information about the specified fleet metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeFleetMetric</a> action.
     * </p>
     * 
     * @param describeFleetMetricRequest
     * @return Result of the DescribeFleetMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeFleetMetric
     */
    DescribeFleetMetricResult describeFleetMetric(DescribeFleetMetricRequest describeFleetMetricRequest);

    /**
     * <p>
     * Describes a search index.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeIndex</a> action.
     * </p>
     * 
     * @param describeIndexRequest
     * @return Result of the DescribeIndex operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeIndex
     */
    DescribeIndexResult describeIndex(DescribeIndexRequest describeIndexRequest);

    /**
     * <p>
     * Describes a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeJob</a> action.
     * </p>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DescribeJob
     */
    DescribeJobResult describeJob(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Describes a job execution.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeJobExecution</a> action.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @return Result of the DescribeJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DescribeJobExecution
     */
    DescribeJobExecutionResult describeJobExecution(DescribeJobExecutionRequest describeJobExecutionRequest);

    /**
     * <p>
     * Returns information about a job template.
     * </p>
     * 
     * @param describeJobTemplateRequest
     * @return Result of the DescribeJobTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeJobTemplate
     */
    DescribeJobTemplateResult describeJobTemplate(DescribeJobTemplateRequest describeJobTemplateRequest);

    /**
     * <p>
     * View details of a managed job template.
     * </p>
     * 
     * @param describeManagedJobTemplateRequest
     * @return Result of the DescribeManagedJobTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalServerException
     *         Internal error from the service that indicates an unexpected error or that the service is unavailable.
     * @sample AWSIot.DescribeManagedJobTemplate
     */
    DescribeManagedJobTemplateResult describeManagedJobTemplate(DescribeManagedJobTemplateRequest describeManagedJobTemplateRequest);

    /**
     * <p>
     * Gets information about a mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeMitigationAction</a> action.
     * </p>
     * 
     * @param describeMitigationActionRequest
     * @return Result of the DescribeMitigationAction operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeMitigationAction
     */
    DescribeMitigationActionResult describeMitigationAction(DescribeMitigationActionRequest describeMitigationActionRequest);

    /**
     * <p>
     * Returns information about a provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeProvisioningTemplate</a> action.
     * </p>
     * 
     * @param describeProvisioningTemplateRequest
     * @return Result of the DescribeProvisioningTemplate operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.DescribeProvisioningTemplate
     */
    DescribeProvisioningTemplateResult describeProvisioningTemplate(DescribeProvisioningTemplateRequest describeProvisioningTemplateRequest);

    /**
     * <p>
     * Returns information about a provisioning template version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeProvisioningTemplateVersion</a> action.
     * </p>
     * 
     * @param describeProvisioningTemplateVersionRequest
     * @return Result of the DescribeProvisioningTemplateVersion operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.DescribeProvisioningTemplateVersion
     */
    DescribeProvisioningTemplateVersionResult describeProvisioningTemplateVersion(
            DescribeProvisioningTemplateVersionRequest describeProvisioningTemplateVersionRequest);

    /**
     * <p>
     * Describes a role alias.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeRoleAlias</a> action.
     * </p>
     * 
     * @param describeRoleAliasRequest
     * @return Result of the DescribeRoleAlias operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeRoleAlias
     */
    DescribeRoleAliasResult describeRoleAlias(DescribeRoleAliasRequest describeRoleAliasRequest);

    /**
     * <p>
     * Gets information about a scheduled audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeScheduledAudit</a> action.
     * </p>
     * 
     * @param describeScheduledAuditRequest
     * @return Result of the DescribeScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeScheduledAudit
     */
    DescribeScheduledAuditResult describeScheduledAudit(DescribeScheduledAuditRequest describeScheduledAuditRequest);

    /**
     * <p>
     * Gets information about a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeSecurityProfile</a> action.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return Result of the DescribeSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeSecurityProfile
     */
    DescribeSecurityProfileResult describeSecurityProfile(DescribeSecurityProfileRequest describeSecurityProfileRequest);

    /**
     * <p>
     * Gets information about a stream.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeStream</a> action.
     * </p>
     * 
     * @param describeStreamRequest
     * @return Result of the DescribeStream operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeStream
     */
    DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest);

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThing</a> action.
     * </p>
     * 
     * @param describeThingRequest
     *        The input for the DescribeThing operation.
     * @return Result of the DescribeThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeThing
     */
    DescribeThingResult describeThing(DescribeThingRequest describeThingRequest);

    /**
     * <p>
     * Describe a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThingGroup</a> action.
     * </p>
     * 
     * @param describeThingGroupRequest
     * @return Result of the DescribeThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeThingGroup
     */
    DescribeThingGroupResult describeThingGroup(DescribeThingGroupRequest describeThingGroupRequest);

    /**
     * <p>
     * Describes a bulk thing provisioning task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThingRegistrationTask</a> action.
     * </p>
     * 
     * @param describeThingRegistrationTaskRequest
     * @return Result of the DescribeThingRegistrationTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeThingRegistrationTask
     */
    DescribeThingRegistrationTaskResult describeThingRegistrationTask(DescribeThingRegistrationTaskRequest describeThingRegistrationTaskRequest);

    /**
     * <p>
     * Gets information about the specified thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThingType</a> action.
     * </p>
     * 
     * @param describeThingTypeRequest
     *        The input for the DescribeThingType operation.
     * @return Result of the DescribeThingType operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeThingType
     */
    DescribeThingTypeResult describeThingType(DescribeThingTypeRequest describeThingTypeRequest);

    /**
     * <p>
     * Detaches a policy from the specified target.
     * </p>
     * <note>
     * <p>
     * Because of the distributed nature of Amazon Web Services, it can take up to five minutes after a policy is
     * detached before it's ready to be deleted.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachPolicy</a> action.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return Result of the DetachPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.DetachPolicy
     */
    DetachPolicyResult detachPolicy(DetachPolicyRequest detachPolicyRequest);

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * <p>
     * <b>Note:</b> This action is deprecated and works as expected for backward compatibility, but we won't add
     * enhancements. Use <a>DetachPolicy</a> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachPrincipalPolicy</a> action.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @return Result of the DetachPrincipalPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachPrincipalPolicy
     */
    @Deprecated
    DetachPrincipalPolicyResult detachPrincipalPolicy(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest);

    /**
     * <p>
     * Disassociates a Device Defender security profile from a thing group or from this account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachSecurityProfile</a> action.
     * </p>
     * 
     * @param detachSecurityProfileRequest
     * @return Result of the DetachSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachSecurityProfile
     */
    DetachSecurityProfileResult detachSecurityProfile(DetachSecurityProfileRequest detachSecurityProfileRequest);

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
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachThingPrincipal</a> action.
     * </p>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @return Result of the DetachThingPrincipal operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachThingPrincipal
     */
    DetachThingPrincipalResult detachThingPrincipal(DetachThingPrincipalRequest detachThingPrincipalRequest);

    /**
     * <p>
     * Disables the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DisableTopicRule</a> action.
     * </p>
     * 
     * @param disableTopicRuleRequest
     *        The input for the DisableTopicRuleRequest operation.
     * @return Result of the DisableTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.DisableTopicRule
     */
    DisableTopicRuleResult disableTopicRule(DisableTopicRuleRequest disableTopicRuleRequest);

    /**
     * <p>
     * Enables the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >EnableTopicRule</a> action.
     * </p>
     * 
     * @param enableTopicRuleRequest
     *        The input for the EnableTopicRuleRequest operation.
     * @return Result of the EnableTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.EnableTopicRule
     */
    EnableTopicRuleResult enableTopicRule(EnableTopicRuleRequest enableTopicRuleRequest);

    /**
     * <p>
     * Returns a Device Defender's ML Detect Security Profile training model's status.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetBehaviorModelTrainingSummaries</a> action.
     * </p>
     * 
     * @param getBehaviorModelTrainingSummariesRequest
     * @return Result of the GetBehaviorModelTrainingSummaries operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.GetBehaviorModelTrainingSummaries
     */
    GetBehaviorModelTrainingSummariesResult getBehaviorModelTrainingSummaries(GetBehaviorModelTrainingSummariesRequest getBehaviorModelTrainingSummariesRequest);

    /**
     * <p>
     * Aggregates on indexed data with search queries pertaining to particular fields.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetBucketsAggregation</a> action.
     * </p>
     * 
     * @param getBucketsAggregationRequest
     * @return Result of the GetBucketsAggregation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws InvalidAggregationException
     *         The aggregation is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.GetBucketsAggregation
     */
    GetBucketsAggregationResult getBucketsAggregation(GetBucketsAggregationRequest getBucketsAggregationRequest);

    /**
     * <p>
     * Returns the approximate count of unique values that match the query.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetCardinality</a> action.
     * </p>
     * 
     * @param getCardinalityRequest
     * @return Result of the GetCardinality operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws InvalidAggregationException
     *         The aggregation is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.GetCardinality
     */
    GetCardinalityResult getCardinality(GetCardinalityRequest getCardinalityRequest);

    /**
     * <p>
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it
     * connects to the IoT device gateway.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetEffectivePolicies</a> action.
     * </p>
     * 
     * @param getEffectivePoliciesRequest
     * @return Result of the GetEffectivePolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.GetEffectivePolicies
     */
    GetEffectivePoliciesResult getEffectivePolicies(GetEffectivePoliciesRequest getEffectivePoliciesRequest);

    /**
     * <p>
     * Gets the indexing configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetIndexingConfiguration</a> action.
     * </p>
     * 
     * @param getIndexingConfigurationRequest
     * @return Result of the GetIndexingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetIndexingConfiguration
     */
    GetIndexingConfigurationResult getIndexingConfiguration(GetIndexingConfigurationRequest getIndexingConfigurationRequest);

    /**
     * <p>
     * Gets a job document.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetJobDocument</a> action.
     * </p>
     * 
     * @param getJobDocumentRequest
     * @return Result of the GetJobDocument operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetJobDocument
     */
    GetJobDocumentResult getJobDocument(GetJobDocumentRequest getJobDocumentRequest);

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * <p>
     * NOTE: use of this command is not recommended. Use <code>GetV2LoggingOptions</code> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetLoggingOptions</a> action.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     *        The input for the GetLoggingOptions operation.
     * @return Result of the GetLoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetLoggingOptions
     */
    GetLoggingOptionsResult getLoggingOptions(GetLoggingOptionsRequest getLoggingOptionsRequest);

    /**
     * <p>
     * Gets an OTA update.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetOTAUpdate</a> action.
     * </p>
     * 
     * @param getOTAUpdateRequest
     * @return Result of the GetOTAUpdate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.GetOTAUpdate
     */
    GetOTAUpdateResult getOTAUpdate(GetOTAUpdateRequest getOTAUpdateRequest);

    /**
     * <p>
     * Groups the aggregated values that match the query into percentile groupings. The default percentile groupings
     * are: 1,5,25,50,75,95,99, although you can specify your own when you call <code>GetPercentiles</code>. This
     * function returns a value for each percentile group specified (or the default percentile groupings). The
     * percentile group "1" contains the aggregated field value that occurs in approximately one percent of the values
     * that match the query. The percentile group "5" contains the aggregated field value that occurs in approximately
     * five percent of the values that match the query, and so on. The result is an approximation, the more values that
     * match the query, the more accurate the percentile values.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetPercentiles</a> action.
     * </p>
     * 
     * @param getPercentilesRequest
     * @return Result of the GetPercentiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws InvalidAggregationException
     *         The aggregation is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.GetPercentiles
     */
    GetPercentilesResult getPercentiles(GetPercentilesRequest getPercentilesRequest);

    /**
     * <p>
     * Gets information about the specified policy with the policy document of the default version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetPolicy</a> action.
     * </p>
     * 
     * @param getPolicyRequest
     *        The input for the GetPolicy operation.
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetPolicy
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetPolicyVersion</a> action.
     * </p>
     * 
     * @param getPolicyVersionRequest
     *        The input for the GetPolicyVersion operation.
     * @return Result of the GetPolicyVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetPolicyVersion
     */
    GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest);

    /**
     * <p>
     * Gets a registration code used to register a CA certificate with IoT.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetRegistrationCode</a> action.
     * </p>
     * 
     * @param getRegistrationCodeRequest
     *        The input to the GetRegistrationCode operation.
     * @return Result of the GetRegistrationCode operation returned by the service.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @sample AWSIot.GetRegistrationCode
     */
    GetRegistrationCodeResult getRegistrationCode(GetRegistrationCodeRequest getRegistrationCodeRequest);

    /**
     * <p>
     * Returns the count, average, sum, minimum, maximum, sum of squares, variance, and standard deviation for the
     * specified aggregated field. If the aggregation field is of type <code>String</code>, only the count statistic is
     * returned.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetStatistics</a> action.
     * </p>
     * 
     * @param getStatisticsRequest
     * @return Result of the GetStatistics operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws InvalidAggregationException
     *         The aggregation is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.GetStatistics
     */
    GetStatisticsResult getStatistics(GetStatisticsRequest getStatisticsRequest);

    /**
     * <p>
     * Gets information about the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetTopicRule</a> action.
     * </p>
     * 
     * @param getTopicRuleRequest
     *        The input for the GetTopicRule operation.
     * @return Result of the GetTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.GetTopicRule
     */
    GetTopicRuleResult getTopicRule(GetTopicRuleRequest getTopicRuleRequest);

    /**
     * <p>
     * Gets information about a topic rule destination.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetTopicRuleDestination</a> action.
     * </p>
     * 
     * @param getTopicRuleDestinationRequest
     * @return Result of the GetTopicRuleDestination operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.GetTopicRuleDestination
     */
    GetTopicRuleDestinationResult getTopicRuleDestination(GetTopicRuleDestinationRequest getTopicRuleDestinationRequest);

    /**
     * <p>
     * Gets the fine grained logging options.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetV2LoggingOptions</a> action.
     * </p>
     * 
     * @param getV2LoggingOptionsRequest
     * @return Result of the GetV2LoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws NotConfiguredException
     *         The resource is not configured.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetV2LoggingOptions
     */
    GetV2LoggingOptionsResult getV2LoggingOptions(GetV2LoggingOptionsRequest getV2LoggingOptionsRequest);

    /**
     * <p>
     * Lists the active violations for a given Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListActiveViolations</a> action.
     * </p>
     * 
     * @param listActiveViolationsRequest
     * @return Result of the ListActiveViolations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListActiveViolations
     */
    ListActiveViolationsResult listActiveViolations(ListActiveViolationsRequest listActiveViolationsRequest);

    /**
     * <p>
     * Lists the policies attached to the specified thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAttachedPolicies</a> action.
     * </p>
     * 
     * @param listAttachedPoliciesRequest
     * @return Result of the ListAttachedPolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.ListAttachedPolicies
     */
    ListAttachedPoliciesResult listAttachedPolicies(ListAttachedPoliciesRequest listAttachedPoliciesRequest);

    /**
     * <p>
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time
     * period. (Findings are retained for 90 days.)
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditFindings</a> action.
     * </p>
     * 
     * @param listAuditFindingsRequest
     * @return Result of the ListAuditFindings operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuditFindings
     */
    ListAuditFindingsResult listAuditFindings(ListAuditFindingsRequest listAuditFindingsRequest);

    /**
     * <p>
     * Gets the status of audit mitigation action tasks that were executed.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditMitigationActionsExecutions</a> action.
     * </p>
     * 
     * @param listAuditMitigationActionsExecutionsRequest
     * @return Result of the ListAuditMitigationActionsExecutions operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuditMitigationActionsExecutions
     */
    ListAuditMitigationActionsExecutionsResult listAuditMitigationActionsExecutions(
            ListAuditMitigationActionsExecutionsRequest listAuditMitigationActionsExecutionsRequest);

    /**
     * <p>
     * Gets a list of audit mitigation action tasks that match the specified filters.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditMitigationActionsTasks</a> action.
     * </p>
     * 
     * @param listAuditMitigationActionsTasksRequest
     * @return Result of the ListAuditMitigationActionsTasks operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuditMitigationActionsTasks
     */
    ListAuditMitigationActionsTasksResult listAuditMitigationActionsTasks(ListAuditMitigationActionsTasksRequest listAuditMitigationActionsTasksRequest);

    /**
     * <p>
     * Lists your Device Defender audit listings.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditSuppressions</a> action.
     * </p>
     * 
     * @param listAuditSuppressionsRequest
     * @return Result of the ListAuditSuppressions operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuditSuppressions
     */
    ListAuditSuppressionsResult listAuditSuppressions(ListAuditSuppressionsRequest listAuditSuppressionsRequest);

    /**
     * <p>
     * Lists the Device Defender audits that have been performed during a given time period.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditTasks</a> action.
     * </p>
     * 
     * @param listAuditTasksRequest
     * @return Result of the ListAuditTasks operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuditTasks
     */
    ListAuditTasksResult listAuditTasks(ListAuditTasksRequest listAuditTasksRequest);

    /**
     * <p>
     * Lists the authorizers registered in your account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuthorizers</a> action.
     * </p>
     * 
     * @param listAuthorizersRequest
     * @return Result of the ListAuthorizers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuthorizers
     */
    ListAuthorizersResult listAuthorizers(ListAuthorizersRequest listAuthorizersRequest);

    /**
     * <p>
     * Lists the billing groups you have created.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListBillingGroups</a> action.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @return Result of the ListBillingGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListBillingGroups
     */
    ListBillingGroupsResult listBillingGroups(ListBillingGroupsRequest listBillingGroupsRequest);

    /**
     * <p>
     * Lists the CA certificates registered for your Amazon Web Services account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCACertificates</a> action.
     * </p>
     * 
     * @param listCACertificatesRequest
     *        Input for the ListCACertificates operation.
     * @return Result of the ListCACertificates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCACertificates
     */
    ListCACertificatesResult listCACertificates(ListCACertificatesRequest listCACertificatesRequest);

    /**
     * <p>
     * Lists the certificates registered in your Amazon Web Services account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCertificates</a> action.
     * </p>
     * 
     * @param listCertificatesRequest
     *        The input for the ListCertificates operation.
     * @return Result of the ListCertificates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCertificates
     */
    ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * List the device certificates signed by the specified CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCertificatesByCA</a> action.
     * </p>
     * 
     * @param listCertificatesByCARequest
     *        The input to the ListCertificatesByCA operation.
     * @return Result of the ListCertificatesByCA operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCertificatesByCA
     */
    ListCertificatesByCAResult listCertificatesByCA(ListCertificatesByCARequest listCertificatesByCARequest);

    /**
     * <p>
     * Lists your Device Defender detect custom metrics.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCustomMetrics</a> action.
     * </p>
     * 
     * @param listCustomMetricsRequest
     * @return Result of the ListCustomMetrics operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCustomMetrics
     */
    ListCustomMetricsResult listCustomMetrics(ListCustomMetricsRequest listCustomMetricsRequest);

    /**
     * <p>
     * Lists mitigation actions executions for a Device Defender ML Detect Security Profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDetectMitigationActionsExecutions</a> action.
     * </p>
     * 
     * @param listDetectMitigationActionsExecutionsRequest
     * @return Result of the ListDetectMitigationActionsExecutions operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListDetectMitigationActionsExecutions
     */
    ListDetectMitigationActionsExecutionsResult listDetectMitigationActionsExecutions(
            ListDetectMitigationActionsExecutionsRequest listDetectMitigationActionsExecutionsRequest);

    /**
     * <p>
     * List of Device Defender ML Detect mitigation actions tasks.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDetectMitigationActionsTasks</a> action.
     * </p>
     * 
     * @param listDetectMitigationActionsTasksRequest
     * @return Result of the ListDetectMitigationActionsTasks operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListDetectMitigationActionsTasks
     */
    ListDetectMitigationActionsTasksResult listDetectMitigationActionsTasks(ListDetectMitigationActionsTasksRequest listDetectMitigationActionsTasksRequest);

    /**
     * <p>
     * List the set of dimensions that are defined for your Amazon Web Services accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDimensions</a> action.
     * </p>
     * 
     * @param listDimensionsRequest
     * @return Result of the ListDimensions operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListDimensions
     */
    ListDimensionsResult listDimensions(ListDimensionsRequest listDimensionsRequest);

    /**
     * <p>
     * Gets a list of domain configurations for the user. This list is sorted alphabetically by domain configuration
     * name.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDomainConfigurations</a> action.
     * </p>
     * 
     * @param listDomainConfigurationsRequest
     * @return Result of the ListDomainConfigurations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListDomainConfigurations
     */
    ListDomainConfigurationsResult listDomainConfigurations(ListDomainConfigurationsRequest listDomainConfigurationsRequest);

    /**
     * <p>
     * Lists all your fleet metrics.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListFleetMetrics</a> action.
     * </p>
     * 
     * @param listFleetMetricsRequest
     * @return Result of the ListFleetMetrics operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListFleetMetrics
     */
    ListFleetMetricsResult listFleetMetrics(ListFleetMetricsRequest listFleetMetricsRequest);

    /**
     * <p>
     * Lists the search indices.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListIndices</a> action.
     * </p>
     * 
     * @param listIndicesRequest
     * @return Result of the ListIndices operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListIndices
     */
    ListIndicesResult listIndices(ListIndicesRequest listIndicesRequest);

    /**
     * <p>
     * Lists the job executions for a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobExecutionsForJob</a> action.
     * </p>
     * 
     * @param listJobExecutionsForJobRequest
     * @return Result of the ListJobExecutionsForJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListJobExecutionsForJob
     */
    ListJobExecutionsForJobResult listJobExecutionsForJob(ListJobExecutionsForJobRequest listJobExecutionsForJobRequest);

    /**
     * <p>
     * Lists the job executions for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobExecutionsForThing</a> action.
     * </p>
     * 
     * @param listJobExecutionsForThingRequest
     * @return Result of the ListJobExecutionsForThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListJobExecutionsForThing
     */
    ListJobExecutionsForThingResult listJobExecutionsForThing(ListJobExecutionsForThingRequest listJobExecutionsForThingRequest);

    /**
     * <p>
     * Returns a list of job templates.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobTemplates</a> action.
     * </p>
     * 
     * @param listJobTemplatesRequest
     * @return Result of the ListJobTemplates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListJobTemplates
     */
    ListJobTemplatesResult listJobTemplates(ListJobTemplatesRequest listJobTemplatesRequest);

    /**
     * <p>
     * Lists jobs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobs</a> action.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListJobs
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Returns a list of managed job templates.
     * </p>
     * 
     * @param listManagedJobTemplatesRequest
     * @return Result of the ListManagedJobTemplates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalServerException
     *         Internal error from the service that indicates an unexpected error or that the service is unavailable.
     * @sample AWSIot.ListManagedJobTemplates
     */
    ListManagedJobTemplatesResult listManagedJobTemplates(ListManagedJobTemplatesRequest listManagedJobTemplatesRequest);

    /**
     * <p>
     * Lists the values reported for an IoT Device Defender metric (device-side metric, cloud-side metric, or custom
     * metric) by the given thing during the specified time period.
     * </p>
     * 
     * @param listMetricValuesRequest
     * @return Result of the ListMetricValues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListMetricValues
     */
    ListMetricValuesResult listMetricValues(ListMetricValuesRequest listMetricValuesRequest);

    /**
     * <p>
     * Gets a list of all mitigation actions that match the specified filter criteria.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListMitigationActions</a> action.
     * </p>
     * 
     * @param listMitigationActionsRequest
     * @return Result of the ListMitigationActions operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListMitigationActions
     */
    ListMitigationActionsResult listMitigationActions(ListMitigationActionsRequest listMitigationActionsRequest);

    /**
     * <p>
     * Lists OTA updates.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListOTAUpdates</a> action.
     * </p>
     * 
     * @param listOTAUpdatesRequest
     * @return Result of the ListOTAUpdates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListOTAUpdates
     */
    ListOTAUpdatesResult listOTAUpdates(ListOTAUpdatesRequest listOTAUpdatesRequest);

    /**
     * <p>
     * Lists certificates that are being transferred but not yet accepted.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListOutgoingCertificates</a> action.
     * </p>
     * 
     * @param listOutgoingCertificatesRequest
     *        The input to the ListOutgoingCertificates operation.
     * @return Result of the ListOutgoingCertificates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListOutgoingCertificates
     */
    ListOutgoingCertificatesResult listOutgoingCertificates(ListOutgoingCertificatesRequest listOutgoingCertificatesRequest);

    /**
     * <p>
     * Lists your policies.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPolicies</a> action.
     * </p>
     * 
     * @param listPoliciesRequest
     *        The input for the ListPolicies operation.
     * @return Result of the ListPolicies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicies
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Lists the principals associated with the specified policy.
     * </p>
     * <p>
     * <b>Note:</b> This action is deprecated and works as expected for backward compatibility, but we won't add
     * enhancements. Use <a>ListTargetsForPolicy</a> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPolicyPrincipals</a> action.
     * </p>
     * 
     * @param listPolicyPrincipalsRequest
     *        The input for the ListPolicyPrincipals operation.
     * @return Result of the ListPolicyPrincipals operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicyPrincipals
     */
    @Deprecated
    ListPolicyPrincipalsResult listPolicyPrincipals(ListPolicyPrincipalsRequest listPolicyPrincipalsRequest);

    /**
     * <p>
     * Lists the versions of the specified policy and identifies the default version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPolicyVersions</a> action.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     *        The input for the ListPolicyVersions operation.
     * @return Result of the ListPolicyVersions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicyVersions
     */
    ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest);

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in <a
     * href=
     * "https://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * <p>
     * <b>Note:</b> This action is deprecated and works as expected for backward compatibility, but we won't add
     * enhancements. Use <a>ListAttachedPolicies</a> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPrincipalPolicies</a> action.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @return Result of the ListPrincipalPolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPrincipalPolicies
     */
    @Deprecated
    ListPrincipalPoliciesResult listPrincipalPolicies(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest);

    /**
     * <p>
     * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPrincipalThings</a> action.
     * </p>
     * 
     * @param listPrincipalThingsRequest
     *        The input for the ListPrincipalThings operation.
     * @return Result of the ListPrincipalThings operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListPrincipalThings
     */
    ListPrincipalThingsResult listPrincipalThings(ListPrincipalThingsRequest listPrincipalThingsRequest);

    /**
     * <p>
     * A list of provisioning template versions.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListProvisioningTemplateVersions</a> action.
     * </p>
     * 
     * @param listProvisioningTemplateVersionsRequest
     * @return Result of the ListProvisioningTemplateVersions operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.ListProvisioningTemplateVersions
     */
    ListProvisioningTemplateVersionsResult listProvisioningTemplateVersions(ListProvisioningTemplateVersionsRequest listProvisioningTemplateVersionsRequest);

    /**
     * <p>
     * Lists the provisioning templates in your Amazon Web Services account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListProvisioningTemplates</a> action.
     * </p>
     * 
     * @param listProvisioningTemplatesRequest
     * @return Result of the ListProvisioningTemplates operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.ListProvisioningTemplates
     */
    ListProvisioningTemplatesResult listProvisioningTemplates(ListProvisioningTemplatesRequest listProvisioningTemplatesRequest);

    /**
     * <p>
     * The related resources of an Audit finding. The following resources can be returned from calling this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DEVICE_CERTIFICATE
     * </p>
     * </li>
     * <li>
     * <p>
     * CA_CERTIFICATE
     * </p>
     * </li>
     * <li>
     * <p>
     * IOT_POLICY
     * </p>
     * </li>
     * <li>
     * <p>
     * COGNITO_IDENTITY_POOL
     * </p>
     * </li>
     * <li>
     * <p>
     * CLIENT_ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ACCOUNT_SETTINGS
     * </p>
     * </li>
     * <li>
     * <p>
     * ROLE_ALIAS
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE
     * </p>
     * </li>
     * <li>
     * <p>
     * ISSUER_CERTIFICATE
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This API is similar to DescribeAuditFinding's <a
     * href="https://docs.aws.amazon.com/iot/latest/apireference/API_DescribeAuditFinding.html">RelatedResources</a> but
     * provides pagination and is not limited to 10 resources. When calling <a
     * href="https://docs.aws.amazon.com/iot/latest/apireference/API_DescribeAuditFinding.html">DescribeAuditFinding</a>
     * for the intermediate CA revoked for active device certificates check, RelatedResources will not be populated. You
     * must use this API, ListRelatedResourcesForAuditFinding, to list the certificates.
     * </p>
     * </note>
     * 
     * @param listRelatedResourcesForAuditFindingRequest
     * @return Result of the ListRelatedResourcesForAuditFinding operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListRelatedResourcesForAuditFinding
     */
    ListRelatedResourcesForAuditFindingResult listRelatedResourcesForAuditFinding(
            ListRelatedResourcesForAuditFindingRequest listRelatedResourcesForAuditFindingRequest);

    /**
     * <p>
     * Lists the role aliases registered in your account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListRoleAliases</a> action.
     * </p>
     * 
     * @param listRoleAliasesRequest
     * @return Result of the ListRoleAliases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListRoleAliases
     */
    ListRoleAliasesResult listRoleAliases(ListRoleAliasesRequest listRoleAliasesRequest);

    /**
     * <p>
     * Lists all of your scheduled audits.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListScheduledAudits</a> action.
     * </p>
     * 
     * @param listScheduledAuditsRequest
     * @return Result of the ListScheduledAudits operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListScheduledAudits
     */
    ListScheduledAuditsResult listScheduledAudits(ListScheduledAuditsRequest listScheduledAuditsRequest);

    /**
     * <p>
     * Lists the Device Defender security profiles you've created. You can filter security profiles by dimension or
     * custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListSecurityProfiles</a> action.
     * </p>
     * <note>
     * <p>
     * <code>dimensionName</code> and <code>metricName</code> cannot be used in the same request.
     * </p>
     * </note>
     * 
     * @param listSecurityProfilesRequest
     * @return Result of the ListSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListSecurityProfiles
     */
    ListSecurityProfilesResult listSecurityProfiles(ListSecurityProfilesRequest listSecurityProfilesRequest);

    /**
     * <p>
     * Lists the Device Defender security profiles attached to a target (thing group).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListSecurityProfilesForTarget</a> action.
     * </p>
     * 
     * @param listSecurityProfilesForTargetRequest
     * @return Result of the ListSecurityProfilesForTarget operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListSecurityProfilesForTarget
     */
    ListSecurityProfilesForTargetResult listSecurityProfilesForTarget(ListSecurityProfilesForTargetRequest listSecurityProfilesForTargetRequest);

    /**
     * <p>
     * Lists all of the streams in your Amazon Web Services account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListStreams</a> action.
     * </p>
     * 
     * @param listStreamsRequest
     * @return Result of the ListStreams operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListStreams
     */
    ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTagsForResource</a> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List targets for the specified policy.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTargetsForPolicy</a> action.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return Result of the ListTargetsForPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.ListTargetsForPolicy
     */
    ListTargetsForPolicyResult listTargetsForPolicy(ListTargetsForPolicyRequest listTargetsForPolicyRequest);

    /**
     * <p>
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTargetsForSecurityProfile</a> action.
     * </p>
     * 
     * @param listTargetsForSecurityProfileRequest
     * @return Result of the ListTargetsForSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListTargetsForSecurityProfile
     */
    ListTargetsForSecurityProfileResult listTargetsForSecurityProfile(ListTargetsForSecurityProfileRequest listTargetsForSecurityProfileRequest);

    /**
     * <p>
     * List the thing groups in your account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingGroups</a> action.
     * </p>
     * 
     * @param listThingGroupsRequest
     * @return Result of the ListThingGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListThingGroups
     */
    ListThingGroupsResult listThingGroups(ListThingGroupsRequest listThingGroupsRequest);

    /**
     * <p>
     * List the thing groups to which the specified thing belongs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingGroupsForThing</a> action.
     * </p>
     * 
     * @param listThingGroupsForThingRequest
     * @return Result of the ListThingGroupsForThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListThingGroupsForThing
     */
    ListThingGroupsForThingResult listThingGroupsForThing(ListThingGroupsForThingRequest listThingGroupsForThingRequest);

    /**
     * <p>
     * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingPrincipals</a> action.
     * </p>
     * 
     * @param listThingPrincipalsRequest
     *        The input for the ListThingPrincipal operation.
     * @return Result of the ListThingPrincipals operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListThingPrincipals
     */
    ListThingPrincipalsResult listThingPrincipals(ListThingPrincipalsRequest listThingPrincipalsRequest);

    /**
     * <p>
     * Information about the thing registration tasks.
     * </p>
     * 
     * @param listThingRegistrationTaskReportsRequest
     * @return Result of the ListThingRegistrationTaskReports operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThingRegistrationTaskReports
     */
    ListThingRegistrationTaskReportsResult listThingRegistrationTaskReports(ListThingRegistrationTaskReportsRequest listThingRegistrationTaskReportsRequest);

    /**
     * <p>
     * List bulk thing provisioning tasks.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingRegistrationTasks</a> action.
     * </p>
     * 
     * @param listThingRegistrationTasksRequest
     * @return Result of the ListThingRegistrationTasks operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThingRegistrationTasks
     */
    ListThingRegistrationTasksResult listThingRegistrationTasks(ListThingRegistrationTasksRequest listThingRegistrationTasksRequest);

    /**
     * <p>
     * Lists the existing thing types.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingTypes</a> action.
     * </p>
     * 
     * @param listThingTypesRequest
     *        The input for the ListThingTypes operation.
     * @return Result of the ListThingTypes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThingTypes
     */
    ListThingTypesResult listThingTypes(ListThingTypesRequest listThingTypesRequest);

    /**
     * <p>
     * Lists your things. Use the <b>attributeName</b> and <b>attributeValue</b> parameters to filter your things. For
     * example, calling <code>ListThings</code> with attributeName=Color and attributeValue=Red retrieves all things in
     * the registry that contain an attribute <b>Color</b> with the value <b>Red</b>. For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/thing-registry.html#list-things">List Things</a> from
     * the <i>Amazon Web Services IoT Core Developer Guide</i>.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThings</a> action.
     * </p>
     * <note>
     * <p>
     * You will not be charged for calling this API if an <code>Access denied</code> error is returned. You will also
     * not be charged if no attributes or pagination token was provided in request and no pagination token and no
     * results were returned.
     * </p>
     * </note>
     * 
     * @param listThingsRequest
     *        The input for the ListThings operation.
     * @return Result of the ListThings operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThings
     */
    ListThingsResult listThings(ListThingsRequest listThingsRequest);

    /**
     * <p>
     * Lists the things you have added to the given billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingsInBillingGroup</a> action.
     * </p>
     * 
     * @param listThingsInBillingGroupRequest
     * @return Result of the ListThingsInBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListThingsInBillingGroup
     */
    ListThingsInBillingGroupResult listThingsInBillingGroup(ListThingsInBillingGroupRequest listThingsInBillingGroupRequest);

    /**
     * <p>
     * Lists the things in the specified group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingsInThingGroup</a> action.
     * </p>
     * 
     * @param listThingsInThingGroupRequest
     * @return Result of the ListThingsInThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListThingsInThingGroup
     */
    ListThingsInThingGroupResult listThingsInThingGroup(ListThingsInThingGroupRequest listThingsInThingGroupRequest);

    /**
     * <p>
     * Lists all the topic rule destinations in your Amazon Web Services account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTopicRuleDestinations</a> action.
     * </p>
     * 
     * @param listTopicRuleDestinationsRequest
     * @return Result of the ListTopicRuleDestinations operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.ListTopicRuleDestinations
     */
    ListTopicRuleDestinationsResult listTopicRuleDestinations(ListTopicRuleDestinationsRequest listTopicRuleDestinationsRequest);

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTopicRules</a> action.
     * </p>
     * 
     * @param listTopicRulesRequest
     *        The input for the ListTopicRules operation.
     * @return Result of the ListTopicRules operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListTopicRules
     */
    ListTopicRulesResult listTopicRules(ListTopicRulesRequest listTopicRulesRequest);

    /**
     * <p>
     * Lists logging levels.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListV2LoggingLevels</a> action.
     * </p>
     * 
     * @param listV2LoggingLevelsRequest
     * @return Result of the ListV2LoggingLevels operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws NotConfiguredException
     *         The resource is not configured.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListV2LoggingLevels
     */
    ListV2LoggingLevelsResult listV2LoggingLevels(ListV2LoggingLevelsRequest listV2LoggingLevelsRequest);

    /**
     * <p>
     * Lists the Device Defender security profile violations discovered during the given time period. You can use
     * filters to limit the results to those alerts issued for a particular security profile, behavior, or thing
     * (device).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListViolationEvents</a> action.
     * </p>
     * 
     * @param listViolationEventsRequest
     * @return Result of the ListViolationEvents operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListViolationEvents
     */
    ListViolationEventsResult listViolationEvents(ListViolationEventsRequest listViolationEventsRequest);

    /**
     * <p>
     * Set a verification state and provide a description of that verification state on a violation (detect alarm).
     * </p>
     * 
     * @param putVerificationStateOnViolationRequest
     * @return Result of the PutVerificationStateOnViolation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.PutVerificationStateOnViolation
     */
    PutVerificationStateOnViolationResult putVerificationStateOnViolation(PutVerificationStateOnViolationRequest putVerificationStateOnViolationRequest);

    /**
     * <p>
     * Registers a CA certificate with Amazon Web Services IoT Core. There is no limit to the number of CA certificates
     * you can register in your Amazon Web Services account. You can register up to 10 CA certificates with the same
     * <code>CA subject field</code> per Amazon Web Services account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RegisterCACertificate</a> action.
     * </p>
     * 
     * @param registerCACertificateRequest
     *        The input to the RegisterCACertificate operation.
     * @return Result of the RegisterCACertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws RegistrationCodeValidationException
     *         The registration code is invalid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RegisterCACertificate
     */
    RegisterCACertificateResult registerCACertificate(RegisterCACertificateRequest registerCACertificateRequest);

    /**
     * <p>
     * Registers a device certificate with IoT in the same <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     * >certificate mode</a> as the signing CA. If you have more than one CA certificate that has the same subject
     * field, you must specify the CA certificate that was used to sign the device certificate being registered.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RegisterCertificate</a> action.
     * </p>
     * 
     * @param registerCertificateRequest
     *        The input to the RegisterCertificate operation.
     * @return Result of the RegisterCertificate operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws CertificateConflictException
     *         Unable to verify the CA certificate used to sign the device certificate you are attempting to register.
     *         This is happens when you have registered more than one CA certificate that has the same subject field and
     *         public key.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RegisterCertificate
     */
    RegisterCertificateResult registerCertificate(RegisterCertificateRequest registerCertificateRequest);

    /**
     * <p>
     * Register a certificate that does not have a certificate authority (CA). For supported certificates, consult <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/x509-client-certs.html#x509-cert-algorithms">
     * Certificate signing algorithms supported by IoT</a>.
     * </p>
     * 
     * @param registerCertificateWithoutCARequest
     * @return Result of the RegisterCertificateWithoutCA operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RegisterCertificateWithoutCA
     */
    RegisterCertificateWithoutCAResult registerCertificateWithoutCA(RegisterCertificateWithoutCARequest registerCertificateWithoutCARequest);

    /**
     * <p>
     * Provisions a thing in the device registry. RegisterThing calls other IoT control plane APIs. These calls might
     * exceed your account level <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_iot"> IoT Throttling
     * Limits</a> and cause throttle errors. Please contact <a href="https://console.aws.amazon.com/support/home">Amazon
     * Web Services Customer Support</a> to raise your throttling limits if necessary.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RegisterThing</a> action.
     * </p>
     * 
     * @param registerThingRequest
     * @return Result of the RegisterThing operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @throws ResourceRegistrationFailureException
     *         The resource registration failed.
     * @sample AWSIot.RegisterThing
     */
    RegisterThingResult registerThing(RegisterThingRequest registerThingRequest);

    /**
     * <p>
     * Rejects a pending certificate transfer. After IoT rejects a certificate transfer, the certificate status changes
     * from <b>PENDING_TRANSFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After it is called, the certificate will be
     * returned to the source's account in the INACTIVE state.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RejectCertificateTransfer</a> action.
     * </p>
     * 
     * @param rejectCertificateTransferRequest
     *        The input for the RejectCertificateTransfer operation.
     * @return Result of the RejectCertificateTransfer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because the transfer is already complete.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RejectCertificateTransfer
     */
    RejectCertificateTransferResult rejectCertificateTransfer(RejectCertificateTransferRequest rejectCertificateTransferRequest);

    /**
     * <p>
     * Removes the given thing from the billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RemoveThingFromBillingGroup</a> action.
     * </p>
     * <note>
     * <p>
     * This call is asynchronous. It might take several seconds for the detachment to propagate.
     * </p>
     * </note>
     * 
     * @param removeThingFromBillingGroupRequest
     * @return Result of the RemoveThingFromBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.RemoveThingFromBillingGroup
     */
    RemoveThingFromBillingGroupResult removeThingFromBillingGroup(RemoveThingFromBillingGroupRequest removeThingFromBillingGroupRequest);

    /**
     * <p>
     * Remove the specified thing from the specified group.
     * </p>
     * <p>
     * You must specify either a <code>thingGroupArn</code> or a <code>thingGroupName</code> to identify the thing group
     * and either a <code>thingArn</code> or a <code>thingName</code> to identify the thing to remove from the thing
     * group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RemoveThingFromThingGroup</a> action.
     * </p>
     * 
     * @param removeThingFromThingGroupRequest
     * @return Result of the RemoveThingFromThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.RemoveThingFromThingGroup
     */
    RemoveThingFromThingGroupResult removeThingFromThingGroup(RemoveThingFromThingGroupRequest removeThingFromThingGroupRequest);

    /**
     * <p>
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level
     * action. Any user who has permission to create rules will be able to access data processed by the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ReplaceTopicRule</a> action.
     * </p>
     * 
     * @param replaceTopicRuleRequest
     *        The input for the ReplaceTopicRule operation.
     * @return Result of the ReplaceTopicRule operation returned by the service.
     * @throws SqlParseException
     *         The Rule-SQL expression can't be parsed correctly.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.ReplaceTopicRule
     */
    ReplaceTopicRuleResult replaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest);

    /**
     * <p>
     * The query search index.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SearchIndex</a> action.
     * </p>
     * 
     * @param searchIndexRequest
     * @return Result of the SearchIndex operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.SearchIndex
     */
    SearchIndexResult searchIndex(SearchIndexRequest searchIndexRequest);

    /**
     * <p>
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an
     * authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetDefaultAuthorizer</a> action.
     * </p>
     * 
     * @param setDefaultAuthorizerRequest
     * @return Result of the SetDefaultAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIot.SetDefaultAuthorizer
     */
    SetDefaultAuthorizerResult setDefaultAuthorizer(SetDefaultAuthorizerRequest setDefaultAuthorizerRequest);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action
     * affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
     * the <a>ListPrincipalPolicies</a> action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetDefaultPolicyVersion</a> action.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     *        The input for the SetDefaultPolicyVersion operation.
     * @return Result of the SetDefaultPolicyVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.SetDefaultPolicyVersion
     */
    SetDefaultPolicyVersionResult setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest);

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * <p>
     * NOTE: use of this command is not recommended. Use <code>SetV2LoggingOptions</code> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetLoggingOptions</a> action.
     * </p>
     * 
     * @param setLoggingOptionsRequest
     *        The input for the SetLoggingOptions operation.
     * @return Result of the SetLoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.SetLoggingOptions
     */
    SetLoggingOptionsResult setLoggingOptions(SetLoggingOptionsRequest setLoggingOptionsRequest);

    /**
     * <p>
     * Sets the logging level.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetV2LoggingLevel</a> action.
     * </p>
     * 
     * @param setV2LoggingLevelRequest
     * @return Result of the SetV2LoggingLevel operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws NotConfiguredException
     *         The resource is not configured.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.SetV2LoggingLevel
     */
    SetV2LoggingLevelResult setV2LoggingLevel(SetV2LoggingLevelRequest setV2LoggingLevelRequest);

    /**
     * <p>
     * Sets the logging options for the V2 logging service.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetV2LoggingOptions</a> action.
     * </p>
     * 
     * @param setV2LoggingOptionsRequest
     * @return Result of the SetV2LoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.SetV2LoggingOptions
     */
    SetV2LoggingOptionsResult setV2LoggingOptions(SetV2LoggingOptionsRequest setV2LoggingOptionsRequest);

    /**
     * <p>
     * Starts a task that applies a set of mitigation actions to the specified target.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartAuditMitigationActionsTask</a> action.
     * </p>
     * 
     * @param startAuditMitigationActionsTaskRequest
     * @return Result of the StartAuditMitigationActionsTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TaskAlreadyExistsException
     *         This exception occurs if you attempt to start a task with the same task-id as an existing task but with a
     *         different clientRequestToken.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.StartAuditMitigationActionsTask
     */
    StartAuditMitigationActionsTaskResult startAuditMitigationActionsTask(StartAuditMitigationActionsTaskRequest startAuditMitigationActionsTaskRequest);

    /**
     * <p>
     * Starts a Device Defender ML Detect mitigation actions task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartDetectMitigationActionsTask</a> action.
     * </p>
     * 
     * @param startDetectMitigationActionsTaskRequest
     * @return Result of the StartDetectMitigationActionsTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TaskAlreadyExistsException
     *         This exception occurs if you attempt to start a task with the same task-id as an existing task but with a
     *         different clientRequestToken.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.StartDetectMitigationActionsTask
     */
    StartDetectMitigationActionsTaskResult startDetectMitigationActionsTask(StartDetectMitigationActionsTaskRequest startDetectMitigationActionsTaskRequest);

    /**
     * <p>
     * Starts an on-demand Device Defender audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartOnDemandAuditTask</a> action.
     * </p>
     * 
     * @param startOnDemandAuditTaskRequest
     * @return Result of the StartOnDemandAuditTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.StartOnDemandAuditTask
     */
    StartOnDemandAuditTaskResult startOnDemandAuditTask(StartOnDemandAuditTaskRequest startOnDemandAuditTaskRequest);

    /**
     * <p>
     * Creates a bulk thing provisioning task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartThingRegistrationTask</a> action.
     * </p>
     * 
     * @param startThingRegistrationTaskRequest
     * @return Result of the StartThingRegistrationTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.StartThingRegistrationTask
     */
    StartThingRegistrationTaskResult startThingRegistrationTask(StartThingRegistrationTaskRequest startThingRegistrationTaskRequest);

    /**
     * <p>
     * Cancels a bulk thing provisioning task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StopThingRegistrationTask</a> action.
     * </p>
     * 
     * @param stopThingRegistrationTaskRequest
     * @return Result of the StopThingRegistrationTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.StopThingRegistrationTask
     */
    StopThingRegistrationTaskResult stopThingRegistrationTask(StopThingRegistrationTaskRequest stopThingRegistrationTaskRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TagResource</a> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.TagResource
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tests if a specified principal is authorized to perform an IoT action on a specified resource. Use this to test
     * and debug the authorization behavior of devices that connect to the IoT device gateway.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TestAuthorization</a> action.
     * </p>
     * 
     * @param testAuthorizationRequest
     * @return Result of the TestAuthorization operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.TestAuthorization
     */
    TestAuthorizationResult testAuthorization(TestAuthorizationRequest testAuthorizationRequest);

    /**
     * <p>
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the
     * custom authorization behavior of devices that connect to the IoT device gateway.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TestInvokeAuthorizer</a> action.
     * </p>
     * 
     * @param testInvokeAuthorizerRequest
     * @return Result of the TestInvokeAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidResponseException
     *         The response is invalid.
     * @sample AWSIot.TestInvokeAuthorizer
     */
    TestInvokeAuthorizerResult testInvokeAuthorizer(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest);

    /**
     * <p>
     * Transfers the specified certificate to the specified Amazon Web Services account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TransferCertificate</a> action.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer
     * target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. You can use the <a>UpdateCertificate</a>
     * action to deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can use the <a>DetachPolicy</a> action to detach
     * them.
     * </p>
     * 
     * @param transferCertificateRequest
     *        The input for the TransferCertificate operation.
     * @return Result of the TransferCertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws TransferConflictException
     *         You can't transfer the certificate because authorization policies are still attached.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.TransferCertificate
     */
    TransferCertificateResult transferCertificate(TransferCertificateRequest transferCertificateRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UntagResource</a> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.UntagResource
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateAccountAuditConfiguration</a> action.
     * </p>
     * 
     * @param updateAccountAuditConfigurationRequest
     * @return Result of the UpdateAccountAuditConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateAccountAuditConfiguration
     */
    UpdateAccountAuditConfigurationResult updateAccountAuditConfiguration(UpdateAccountAuditConfigurationRequest updateAccountAuditConfigurationRequest);

    /**
     * <p>
     * Updates a Device Defender audit suppression.
     * </p>
     * 
     * @param updateAuditSuppressionRequest
     * @return Result of the UpdateAuditSuppression operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateAuditSuppression
     */
    UpdateAuditSuppressionResult updateAuditSuppression(UpdateAuditSuppressionRequest updateAuditSuppressionRequest);

    /**
     * <p>
     * Updates an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateAuthorizer</a> action.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @return Result of the UpdateAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateAuthorizer
     */
    UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest);

    /**
     * <p>
     * Updates information about the billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateBillingGroup</a> action.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @return Result of the UpdateBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateBillingGroup
     */
    UpdateBillingGroupResult updateBillingGroup(UpdateBillingGroupRequest updateBillingGroupRequest);

    /**
     * <p>
     * Updates a registered CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateCACertificate</a> action.
     * </p>
     * 
     * @param updateCACertificateRequest
     *        The input to the UpdateCACertificate operation.
     * @return Result of the UpdateCACertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateCACertificate
     */
    UpdateCACertificateResult updateCACertificate(UpdateCACertificateRequest updateCACertificateRequest);

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is idempotent.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateCertificate</a> action.
     * </p>
     * <p>
     * Certificates must be in the ACTIVE state to authenticate devices that use a certificate to connect to IoT.
     * </p>
     * <p>
     * Within a few minutes of updating a certificate from the ACTIVE state to any other state, IoT disconnects all
     * devices that used that certificate to connect. Devices cannot use a certificate that is not in the ACTIVE state
     * to reconnect.
     * </p>
     * 
     * @param updateCertificateRequest
     *        The input for the UpdateCertificate operation.
     * @return Result of the UpdateCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateCertificate
     */
    UpdateCertificateResult updateCertificate(UpdateCertificateRequest updateCertificateRequest);

    /**
     * <p>
     * Updates a Device Defender detect custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateCustomMetric</a> action.
     * </p>
     * 
     * @param updateCustomMetricRequest
     * @return Result of the UpdateCustomMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateCustomMetric
     */
    UpdateCustomMetricResult updateCustomMetric(UpdateCustomMetricRequest updateCustomMetricRequest);

    /**
     * <p>
     * Updates the definition for a dimension. You cannot change the type of a dimension after it is created (you can
     * delete it and recreate it).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateDimension</a> action.
     * </p>
     * 
     * @param updateDimensionRequest
     * @return Result of the UpdateDimension operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.UpdateDimension
     */
    UpdateDimensionResult updateDimension(UpdateDimensionRequest updateDimensionRequest);

    /**
     * <p>
     * Updates values stored in the domain configuration. Domain configurations for default endpoints can't be updated.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateDomainConfiguration</a> action.
     * </p>
     * 
     * @param updateDomainConfigurationRequest
     * @return Result of the UpdateDomainConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateDomainConfiguration
     */
    UpdateDomainConfigurationResult updateDomainConfiguration(UpdateDomainConfigurationRequest updateDomainConfigurationRequest);

    /**
     * <p>
     * Updates a dynamic thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateDynamicThingGroup</a> action.
     * </p>
     * 
     * @param updateDynamicThingGroupRequest
     * @return Result of the UpdateDynamicThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @sample AWSIot.UpdateDynamicThingGroup
     */
    UpdateDynamicThingGroupResult updateDynamicThingGroup(UpdateDynamicThingGroupRequest updateDynamicThingGroupRequest);

    /**
     * <p>
     * Updates the event configurations.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateEventConfigurations</a> action.
     * </p>
     * 
     * @param updateEventConfigurationsRequest
     * @return Result of the UpdateEventConfigurations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.UpdateEventConfigurations
     */
    UpdateEventConfigurationsResult updateEventConfigurations(UpdateEventConfigurationsRequest updateEventConfigurationsRequest);

    /**
     * <p>
     * Updates the data for a fleet metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateFleetMetric</a> action.
     * </p>
     * 
     * @param updateFleetMetricRequest
     * @return Result of the UpdateFleetMetric operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws InvalidAggregationException
     *         The aggregation is invalid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.UpdateFleetMetric
     */
    UpdateFleetMetricResult updateFleetMetric(UpdateFleetMetricRequest updateFleetMetricRequest);

    /**
     * <p>
     * Updates the search configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateIndexingConfiguration</a> action.
     * </p>
     * 
     * @param updateIndexingConfigurationRequest
     * @return Result of the UpdateIndexingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateIndexingConfiguration
     */
    UpdateIndexingConfigurationResult updateIndexingConfiguration(UpdateIndexingConfigurationRequest updateIndexingConfigurationRequest);

    /**
     * <p>
     * Updates supported fields of the specified job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateJob</a> action.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.UpdateJob
     */
    UpdateJobResult updateJob(UpdateJobRequest updateJobRequest);

    /**
     * <p>
     * Updates the definition for the specified mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateMitigationAction</a> action.
     * </p>
     * 
     * @param updateMitigationActionRequest
     * @return Result of the UpdateMitigationAction operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateMitigationAction
     */
    UpdateMitigationActionResult updateMitigationAction(UpdateMitigationActionRequest updateMitigationActionRequest);

    /**
     * <p>
     * Updates a provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateProvisioningTemplate</a> action.
     * </p>
     * 
     * @param updateProvisioningTemplateRequest
     * @return Result of the UpdateProvisioningTemplate operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.UpdateProvisioningTemplate
     */
    UpdateProvisioningTemplateResult updateProvisioningTemplate(UpdateProvisioningTemplateRequest updateProvisioningTemplateRequest);

    /**
     * <p>
     * Updates a role alias.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateRoleAlias</a> action.
     * </p>
     * 
     * @param updateRoleAliasRequest
     * @return Result of the UpdateRoleAlias operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateRoleAlias
     */
    UpdateRoleAliasResult updateRoleAlias(UpdateRoleAliasRequest updateRoleAliasRequest);

    /**
     * <p>
     * Updates a scheduled audit, including which checks are performed and how often the audit takes place.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateScheduledAudit</a> action.
     * </p>
     * 
     * @param updateScheduledAuditRequest
     * @return Result of the UpdateScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateScheduledAudit
     */
    UpdateScheduledAuditResult updateScheduledAudit(UpdateScheduledAuditRequest updateScheduledAuditRequest);

    /**
     * <p>
     * Updates a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateSecurityProfile</a> action.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return Result of the UpdateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateSecurityProfile
     */
    UpdateSecurityProfileResult updateSecurityProfile(UpdateSecurityProfileRequest updateSecurityProfileRequest);

    /**
     * <p>
     * Updates an existing stream. The stream version will be incremented by one.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateStream</a> action.
     * </p>
     * 
     * @param updateStreamRequest
     * @return Result of the UpdateStream operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateStream
     */
    UpdateStreamResult updateStream(UpdateStreamRequest updateStreamRequest);

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThing</a> action.
     * </p>
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @return Result of the UpdateThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateThing
     */
    UpdateThingResult updateThing(UpdateThingRequest updateThingRequest);

    /**
     * <p>
     * Update a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingGroup</a> action.
     * </p>
     * 
     * @param updateThingGroupRequest
     * @return Result of the UpdateThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateThingGroup
     */
    UpdateThingGroupResult updateThingGroup(UpdateThingGroupRequest updateThingGroupRequest);

    /**
     * <p>
     * Updates the groups to which the thing belongs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingGroupsForThing</a> action.
     * </p>
     * 
     * @param updateThingGroupsForThingRequest
     * @return Result of the UpdateThingGroupsForThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateThingGroupsForThing
     */
    UpdateThingGroupsForThingResult updateThingGroupsForThing(UpdateThingGroupsForThingRequest updateThingGroupsForThingRequest);

    /**
     * <p>
     * Updates a topic rule destination. You use this to change the status, endpoint URL, or confirmation URL of the
     * destination.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateTopicRuleDestination</a> action.
     * </p>
     * 
     * @param updateTopicRuleDestinationRequest
     * @return Result of the UpdateTopicRuleDestination operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.UpdateTopicRuleDestination
     */
    UpdateTopicRuleDestinationResult updateTopicRuleDestination(UpdateTopicRuleDestinationRequest updateTopicRuleDestinationRequest);

    /**
     * <p>
     * Validates a Device Defender security profile behaviors specification.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ValidateSecurityProfileBehaviors</a> action.
     * </p>
     * 
     * @param validateSecurityProfileBehaviorsRequest
     * @return Result of the ValidateSecurityProfileBehaviors operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ValidateSecurityProfileBehaviors
     */
    ValidateSecurityProfileBehaviorsResult validateSecurityProfileBehaviors(ValidateSecurityProfileBehaviorsRequest validateSecurityProfileBehaviorsRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
