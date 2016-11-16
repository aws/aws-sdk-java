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
     */
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
     */
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
     * Attaches the specified policy to the specified principal (certificate or other credential).
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
     * Deletes the specified rule.
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
     * Returns a unique endpoint specific to the AWS account making the call.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @return Result of the DescribeEndpoint operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DescribeEndpoint
     */
    DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest);

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
     * Removes the specified policy from the specified certificate.
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
     * Disables the specified rule.
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
     * Enables the specified rule.
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
     * Gets information about the specified rule.
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
     * Lists certificates that are being transfered but not yet accepted.
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
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
     * can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
     * subject field and public key. This enables you to have up to 10 certificate authorities sign your device
     * certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you
     * register your device certificates with the RegisterCertificate API.
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
     * Replaces the specified rule. You must specify all parameters for the new rule. Creating rules is an
     * administrator-level action. Any user who has permission to create rules will be able to access data processed by
     * the rule.
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
