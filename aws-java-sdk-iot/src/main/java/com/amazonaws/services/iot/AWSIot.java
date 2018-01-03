/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
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
     * Adds a thing to a thing group.
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
     * 
     * @param associateTargetsWithJobRequest
     * @return Result of the AssociateTargetsWithJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         The number of attached entities exceeds the limit.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.AssociateTargetsWithJob
     */
    AssociateTargetsWithJobResult associateTargetsWithJob(AssociateTargetsWithJobRequest associateTargetsWithJobRequest);

    /**
     * <p>
     * Attaches a policy to the specified target.
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
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.AttachPolicy
     */
    AttachPolicyResult attachPolicy(AttachPolicyRequest attachPolicyRequest);

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
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.AttachPrincipalPolicy
     */
    @Deprecated
    AttachPrincipalPolicyResult attachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest);

    /**
     * <p>
     * Attaches the specified principal to the specified thing.
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
     * Cancels a job.
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
     * @sample AWSIot.CancelJob
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Clears the default authorizer.
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
     * Creates an authorizer.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @return Result of the CreateAuthorizer operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         The number of attached entities exceeds the limit.
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
     * Creates a job.
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
     *         The number of attached entities exceeds the limit.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.CreateJob
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

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
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     * </p>
     * 
     * @param createOTAUpdateRequest
     * @return Result of the CreateOTAUpdate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
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
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation creates a policy version with a version
     * identifier of <b>1</b> and sets <b>1</b> as the policy's default version.
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
     * Creates a role alias.
     * </p>
     * 
     * @param createRoleAliasRequest
     * @return Result of the CreateRoleAlias operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         The number of attached entities exceeds the limit.
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
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
     * chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
     * a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be
     * created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted
     * within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     * </p>
     * 
     * @param createStreamRequest
     * @return Result of the CreateStream operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
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
     * Creates a thing record in the thing registry.
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
     * @sample AWSIot.CreateTopicRule
     */
    CreateTopicRuleResult createTopicRule(CreateTopicRuleRequest createTopicRuleRequest);

    /**
     * <p>
     * Deletes an authorizer.
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
     * Deletes a registered CA certificate.
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
     * A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a
     * certificate, first use the <a>DetachPrincipalPolicy</a> API to detach all policies. Next, use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE status.
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
     * Delete an OTA update.
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
     * this API. To delete the default version of a policy, use <a>DeletePolicy</a>. To find out which version of a
     * policy is marked as the default version, use ListPolicyVersions.
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
     * Deletes a CA certificate registration code.
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
     * Deletes a stream.
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
     * Deletes the specified thing.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @return Result of the DeleteThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws VersionConflictException
     *         An exception thrown when the version of a thing passed to a command is different than the version
     *         specified with the --version parameter.
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
     * 
     * @param deleteThingGroupRequest
     * @return Result of the DeleteThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of a thing passed to a command is different than the version
     *         specified with the --version parameter.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThingGroup
     */
    DeleteThingGroupResult deleteThingGroup(DeleteThingGroupRequest deleteThingGroupRequest);

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
     * @sample AWSIot.DeleteTopicRule
     */
    DeleteTopicRuleResult deleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest);

    /**
     * <p>
     * Deletes a logging level.
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
     * Describes an authorizer.
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
     * Describes a registered CA certificate.
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
     * Describes the default authorizer.
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
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * Describes a search index.
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
     * Describes a role alias.
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
     * Gets information about a stream.
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
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.DetachPolicy
     */
    DetachPolicyResult detachPolicy(DetachPolicyRequest detachPolicyRequest);

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
     * Detaches the specified principal from the specified thing.
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
     * @sample AWSIot.DisableTopicRule
     */
    DisableTopicRuleResult disableTopicRule(DisableTopicRuleRequest disableTopicRuleRequest);

    /**
     * <p>
     * Enables the rule.
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
     * @sample AWSIot.EnableTopicRule
     */
    EnableTopicRuleResult enableTopicRule(EnableTopicRuleRequest enableTopicRuleRequest);

    /**
     * <p>
     * Gets effective policies.
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
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.GetEffectivePolicies
     */
    GetEffectivePoliciesResult getEffectivePolicies(GetEffectivePoliciesRequest getEffectivePoliciesRequest);

    /**
     * <p>
     * Gets the search configuration.
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
     * Gets information about the specified policy with the policy document of the default version.
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
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * Gets information about the rule.
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
     * Gets the fine grained logging options.
     * </p>
     * 
     * @param getV2LoggingOptionsRequest
     * @return Result of the GetV2LoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetV2LoggingOptions
     */
    GetV2LoggingOptionsResult getV2LoggingOptions(GetV2LoggingOptionsRequest getV2LoggingOptionsRequest);

    /**
     * <p>
     * Lists the policies attached to the specified thing group.
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
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.ListAttachedPolicies
     */
    ListAttachedPoliciesResult listAttachedPolicies(ListAttachedPoliciesRequest listAttachedPoliciesRequest);

    /**
     * <p>
     * Lists the authorizers registered in your account.
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
     * Lists the CA certificates registered for your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
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
     * Lists the certificates registered in your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
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
     * Lists the search indices.
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
     * Lists jobs.
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
     * Lists OTA updates.
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
     * <b>Note:</b> This API is deprecated. Please use <a>ListTargetsForPolicy</a> instead.
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
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>ListAttachedPolicies</a> instead.
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
     * Lists the things associated with the specified principal.
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
     * Lists the role aliases registered in your account.
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
     * Lists all of the streams in your AWS account.
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
     * List targets for the specified policy.
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
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.ListTargetsForPolicy
     */
    ListTargetsForPolicyResult listTargetsForPolicy(ListTargetsForPolicyRequest listTargetsForPolicyRequest);

    /**
     * <p>
     * List the thing groups in your account.
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
     * @sample AWSIot.ListThingGroups
     */
    ListThingGroupsResult listThingGroups(ListThingGroupsRequest listThingGroupsRequest);

    /**
     * <p>
     * List the thing groups to which the specified thing belongs.
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
     * @sample AWSIot.ListThingGroupsForThing
     */
    ListThingGroupsForThingResult listThingGroupsForThing(ListThingGroupsForThingRequest listThingGroupsForThingRequest);

    /**
     * <p>
     * Lists the principals associated with the specified thing.
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
     * the registry that contain an attribute <b>Color</b> with the value <b>Red</b>.
     * </p>
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
     * Lists the things in the specified group.
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
     * @sample AWSIot.ListThingsInThingGroup
     */
    ListThingsInThingGroupResult listThingsInThingGroup(ListThingsInThingGroupRequest listThingsInThingGroupRequest);

    /**
     * <p>
     * Lists the rules for the specific topic.
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
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
     * can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
     * subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you
     * have more than one CA certificate registered, make sure you pass the CA certificate when you register your device
     * certificates with the RegisterCertificate API.
     * </p>
     * 
     * @param registerCACertificateRequest
     *        The input to the RegisterCACertificate operation.
     * @return Result of the RegisterCACertificate operation returned by the service.
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
     *         The number of attached entities exceeds the limit.
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
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject
     * field, you must specify the CA certificate that was used to sign the device certificate being registered.
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
     * Provisions a thing.
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
     * Remove the specified thing from the specified group.
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
     * @sample AWSIot.ReplaceTopicRule
     */
    ReplaceTopicRuleResult replaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest);

    /**
     * <p>
     * The query search index.
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
     * @sample AWSIot.SetDefaultAuthorizer
     */
    SetDefaultAuthorizerResult setDefaultAuthorizer(SetDefaultAuthorizerRequest setDefaultAuthorizerRequest);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action
     * affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
     * the ListPrincipalPolicy API.
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
     * @sample AWSIot.SetV2LoggingLevel
     */
    SetV2LoggingLevelResult setV2LoggingLevel(SetV2LoggingLevelRequest setV2LoggingLevelRequest);

    /**
     * <p>
     * Sets the logging options for the V2 logging service.
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
     * Creates a bulk thing provisioning task.
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
     * Test custom authorization.
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
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.TestAuthorization
     */
    TestAuthorizationResult testAuthorization(TestAuthorizationRequest testAuthorizationRequest);

    /**
     * <p>
     * Invoke the specified custom authorizer for testing purposes.
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
     * Updates an authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @return Result of the UpdateAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         The number of attached entities exceeds the limit.
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
     * Updates a registered CA certificate.
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
     * Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices,
     * but these devices will be unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
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
     * Updates the event configurations.
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
     * Updates the search configuration.
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
     * Updates a role alias.
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
     * Updates an existing stream. The stream version will be incremented by one.
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
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @return Result of the UpdateThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of a thing passed to a command is different than the version
     *         specified with the --version parameter.
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
     * 
     * @param updateThingGroupRequest
     * @return Result of the UpdateThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of a thing passed to a command is different than the version
     *         specified with the --version parameter.
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
