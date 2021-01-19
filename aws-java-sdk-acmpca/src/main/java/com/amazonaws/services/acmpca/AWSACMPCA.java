/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.acmpca;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.services.acmpca.waiters.AWSACMPCAWaiters;

/**
 * Interface for accessing ACM-PCA.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.acmpca.AbstractAWSACMPCA} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>ACM Private CA API Reference</i>. It provides descriptions, syntax, and usage examples for each of the
 * actions and data types involved in creating and managing private certificate authorities (CA) for your organization.
 * </p>
 * <p>
 * The documentation for each action shows the Query API request parameters and the XML response. Alternatively, you can
 * use one of the AWS SDKs to access an API that's tailored to the programming language or platform that you're using.
 * For more information, see <a href="https://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <note>
 * <p>
 * Each ACM Private CA API action has a quota that determines the number of times the action can be called per second.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaLimits.html#PcaLimits-api">API Rate Quotas in ACM
 * Private CA</a> in the ACM Private CA user guide.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSACMPCA {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "acm-pca";

    /**
     * <p>
     * Creates a root or subordinate private certificate authority (CA). You must specify the CA configuration, the
     * certificate revocation list (CRL) configuration, the CA type, and an optional idempotency token to avoid
     * accidental creation of multiple CAs. The CA configuration specifies the name of the algorithm and key size to be
     * used to create the CA private key, the type of signing algorithm that the CA uses, and X.500 subject information.
     * The CRL configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3
     * bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by
     * the CA. If successful, this action returns the Amazon Resource Name (ARN) of the CA.
     * </p>
     * <p>
     * ACM Private CAA assets that are stored in Amazon S3 can be protected with encryption. For more information, see
     * <a href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaCreateCa.html#crl-encryption">Encrypting Your
     * CRLs</a>.
     * </p>
     * <note>
     * <p>
     * Both PCA and the IAM principal must have permission to write to the S3 bucket that you specify. If the IAM
     * principal making the call does not have permission to write to the bucket, then an exception is thrown. For more
     * information, see <a href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaAuthAccess.html">Configure
     * Access to ACM Private CA</a>.
     * </p>
     * </note>
     * 
     * @param createCertificateAuthorityRequest
     * @return Result of the CreateCertificateAuthority operation returned by the service.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws InvalidPolicyException
     *         The resource policy is invalid or is missing a required statement. For general information about IAM
     *         policy and statement structure, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json"
     *         >Overview of JSON Policies</a>.
     * @throws InvalidTagException
     *         The tag associated with the CA is not valid. The invalid argument is contained in the message field.
     * @throws LimitExceededException
     *         An ACM Private CA quota has been exceeded. See the exception message returned to determine the quota that
     *         was exceeded.
     * @sample AWSACMPCA.CreateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCertificateAuthorityResult createCertificateAuthority(CreateCertificateAuthorityRequest createCertificateAuthorityRequest);

    /**
     * <p>
     * Creates an audit report that lists every time that your CA private key is used. The report is saved in the Amazon
     * S3 bucket that you specify on input. The <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_IssueCertificate.html">IssueCertificate</a> and
     * <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_RevokeCertificate.html">RevokeCertificate</a>
     * actions use the private key.
     * </p>
     * <note>
     * <p>
     * Both PCA and the IAM principal must have permission to write to the S3 bucket that you specify. If the IAM
     * principal making the call does not have permission to write to the bucket, then an exception is thrown. For more
     * information, see <a href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaAuthAccess.html">Configure
     * Access to ACM Private CA</a>.
     * </p>
     * </note>
     * <p>
     * ACM Private CAA assets that are stored in Amazon S3 can be protected with encryption. For more information, see
     * <a href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaAuditReport.html#audit-report-encryption">
     * Encrypting Your Audit Reports</a>.
     * </p>
     * 
     * @param createCertificateAuthorityAuditReportRequest
     * @return Result of the CreateCertificateAuthorityAuditReport operation returned by the service.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @sample AWSACMPCA.CreateCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCertificateAuthorityAuditReportResult createCertificateAuthorityAuditReport(
            CreateCertificateAuthorityAuditReportRequest createCertificateAuthorityAuditReportRequest);

    /**
     * <p>
     * Grants one or more permissions on a private CA to the AWS Certificate Manager (ACM) service principal (
     * <code>acm.amazonaws.com</code>). These permissions allow ACM to issue and renew ACM certificates that reside in
     * the same AWS account as the CA.
     * </p>
     * <p>
     * You can list current permissions with the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListPermissions.html">ListPermissions</a>
     * action and revoke them with the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DeletePermission.html">DeletePermission</a>
     * action.
     * </p>
     * <p class="title">
     * <b>About Permissions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the private CA and the certificates it issues reside in the same account, you can use
     * <code>CreatePermission</code> to grant permissions for ACM to carry out automatic certificate renewals.
     * </p>
     * </li>
     * <li>
     * <p>
     * For automatic certificate renewal to succeed, the ACM service principal needs permissions to create, retrieve,
     * and list certificates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the private CA and the ACM certificates reside in different accounts, then permissions cannot be used to
     * enable automatic renewals. Instead, the ACM certificate owner must set up a resource-based policy to enable
     * cross-account issuance and renewals. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-rbp.html">Using a Resource Based Policy with ACM
     * Private CA</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createPermissionRequest
     * @return Result of the CreatePermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws PermissionAlreadyExistsException
     *         The designated permission has already been given to the user.
     * @throws LimitExceededException
     *         An ACM Private CA quota has been exceeded. See the exception message returned to determine the quota that
     *         was exceeded.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @sample AWSACMPCA.CreatePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreatePermission" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePermissionResult createPermission(CreatePermissionRequest createPermissionRequest);

    /**
     * <p>
     * Deletes a private certificate authority (CA). You must provide the Amazon Resource Name (ARN) of the private CA
     * that you want to delete. You can find the ARN by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action.
     * </p>
     * <note>
     * <p>
     * Deleting a CA will invalidate other CAs and certificates below it in your CA hierarchy.
     * </p>
     * </note>
     * <p>
     * Before you can delete a CA that you have created and activated, you must disable it. To do this, call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_UpdateCertificateAuthority.html">
     * UpdateCertificateAuthority</a> action and set the <b>CertificateAuthorityStatus</b> parameter to
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * Additionally, you can delete a CA if you are waiting for it to be created (that is, the status of the CA is
     * <code>CREATING</code>). You can also delete it if the CA has been created but you haven't yet imported the signed
     * certificate into ACM Private CA (that is, the status of the CA is <code>PENDING_CERTIFICATE</code>).
     * </p>
     * <p>
     * When you successfully call <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DeleteCertificateAuthority.html"
     * >DeleteCertificateAuthority</a>, the CA's status changes to <code>DELETED</code>. However, the CA won't be
     * permanently deleted until the restoration period has passed. By default, if you do not set the
     * <code>PermanentDeletionTimeInDays</code> parameter, the CA remains restorable for 30 days. You can set the
     * parameter from 7 to 30 days. The <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DescribeCertificateAuthority.html"
     * >DescribeCertificateAuthority</a> action returns the time remaining in the restoration window of a private CA in
     * the <code>DELETED</code> state. To restore an eligible CA, call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_RestoreCertificateAuthority.html"
     * >RestoreCertificateAuthority</a> action.
     * </p>
     * 
     * @param deleteCertificateAuthorityRequest
     * @return Result of the DeleteCertificateAuthority operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @sample AWSACMPCA.DeleteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeleteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCertificateAuthorityResult deleteCertificateAuthority(DeleteCertificateAuthorityRequest deleteCertificateAuthorityRequest);

    /**
     * <p>
     * Revokes permissions on a private CA granted to the AWS Certificate Manager (ACM) service principal
     * (acm.amazonaws.com).
     * </p>
     * <p>
     * These permissions allow ACM to issue and renew ACM certificates that reside in the same AWS account as the CA. If
     * you revoke these permissions, ACM will no longer renew the affected certificates automatically.
     * </p>
     * <p>
     * Permissions can be granted with the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreatePermission.html">CreatePermission</a>
     * action and listed with the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListPermissions.html">ListPermissions</a>
     * action.
     * </p>
     * <p class="title">
     * <b>About Permissions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the private CA and the certificates it issues reside in the same account, you can use
     * <code>CreatePermission</code> to grant permissions for ACM to carry out automatic certificate renewals.
     * </p>
     * </li>
     * <li>
     * <p>
     * For automatic certificate renewal to succeed, the ACM service principal needs permissions to create, retrieve,
     * and list certificates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the private CA and the ACM certificates reside in different accounts, then permissions cannot be used to
     * enable automatic renewals. Instead, the ACM certificate owner must set up a resource-based policy to enable
     * cross-account issuance and renewals. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-rbp.html">Using a Resource Based Policy with ACM
     * Private CA</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletePermissionRequest
     * @return Result of the DeletePermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @sample AWSACMPCA.DeletePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeletePermission" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePermissionResult deletePermission(DeletePermissionRequest deletePermissionRequest);

    /**
     * <p>
     * Deletes the resource-based policy attached to a private CA. Deletion will remove any access that the policy has
     * granted. If there is no policy attached to the private CA, this action will return successful.
     * </p>
     * <p>
     * If you delete a policy that was applied through AWS Resource Access Manager (RAM), the CA will be removed from
     * all shares in which it was included.
     * </p>
     * <p>
     * The AWS Certificate Manager Service Linked Role that the policy supports is not affected when you delete the
     * policy.
     * </p>
     * <p>
     * The current policy can be shown with <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_GetPolicy.html">GetPolicy</a> and updated with
     * <a href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_PutPolicy.html">PutPolicy</a>.
     * </p>
     * <p class="title">
     * <b>About Policies</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A policy grants access on a private CA to an AWS customer account, to AWS Organizations, or to an AWS
     * Organizations unit. Policies are under the control of a CA administrator. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-rbp.html">Using a Resource Based Policy with ACM
     * Private CA</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A policy permits a user of AWS Certificate Manager (ACM) to issue ACM certificates signed by a CA in another
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ACM to manage automatic renewal of these certificates, the ACM user must configure a Service Linked Role
     * (SLR). The SLR allows the ACM service to assume the identity of the user, subject to confirmation against the ACM
     * Private CA policy. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-slr.html">Using a Service Linked Role with ACM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updates made in AWS Resource Manager (RAM) are reflected in policies. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-ram.html">Attach a Policy for Cross-Account
     * Access</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws LockoutPreventedException
     *         The current action was prevented because it would lock the caller out from performing subsequent actions.
     *         Verify that the specified parameters would not result in the caller being denied access to the resource.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @sample AWSACMPCA.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Lists information about your private certificate authority (CA) or one that has been shared with you. You specify
     * the private CA on input by its ARN (Amazon Resource Name). The output contains the status of your CA. This can be
     * any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - ACM Private CA is creating your private certificate authority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_CERTIFICATE</code> - The certificate is pending. You must use your ACM Private CA-hosted or
     * on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - Your private CA is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Your private CA has been disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - Your private CA certificate has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Your private CA has failed. Your CA can fail because of problems such a network outage or
     * back-end AWS failure or other errors. A failed CA can never return to the pending state. You must create a new
     * CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Your private CA is within the restoration period, after which it is permanently deleted.
     * The length of time remaining in the CA's restoration period is also included in this action's output.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeCertificateAuthorityRequest
     * @return Result of the DescribeCertificateAuthority operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSACMPCA.DescribeCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCertificateAuthorityResult describeCertificateAuthority(DescribeCertificateAuthorityRequest describeCertificateAuthorityRequest);

    /**
     * <p>
     * Lists information about a specific audit report created by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthorityAuditReport.html"
     * >CreateCertificateAuthorityAuditReport</a> action. Audit information is created every time the certificate
     * authority (CA) private key is used. The private key is used when you call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_IssueCertificate.html">IssueCertificate</a>
     * action or the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_RevokeCertificate.html">RevokeCertificate</a>
     * action.
     * </p>
     * 
     * @param describeCertificateAuthorityAuditReportRequest
     * @return Result of the DescribeCertificateAuthorityAuditReport operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @sample AWSACMPCA.DescribeCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCertificateAuthorityAuditReportResult describeCertificateAuthorityAuditReport(
            DescribeCertificateAuthorityAuditReportRequest describeCertificateAuthorityAuditReportRequest);

    /**
     * <p>
     * Retrieves a certificate from your private CA or one that has been shared with you. The ARN of the certificate is
     * returned when you call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_IssueCertificate.html">IssueCertificate</a>
     * action. You must specify both the ARN of your private CA and the ARN of the issued certificate when calling the
     * <b>GetCertificate</b> action. You can retrieve the certificate if it is in the <b>ISSUED</b> state. You can call
     * the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthorityAuditReport.html"
     * >CreateCertificateAuthorityAuditReport</a> action to create a report that contains information about all of the
     * certificates issued and revoked by your private CA.
     * </p>
     * 
     * @param getCertificateRequest
     * @return Result of the GetCertificate operation returned by the service.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @sample AWSACMPCA.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    GetCertificateResult getCertificate(GetCertificateRequest getCertificateRequest);

    /**
     * <p>
     * Retrieves the certificate and certificate chain for your private certificate authority (CA) or one that has been
     * shared with you. Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA
     * certificate. Each certificate in the chain signs the one before it.
     * </p>
     * 
     * @param getCertificateAuthorityCertificateRequest
     * @return Result of the GetCertificateAuthorityCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSACMPCA.GetCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    GetCertificateAuthorityCertificateResult getCertificateAuthorityCertificate(
            GetCertificateAuthorityCertificateRequest getCertificateAuthorityCertificateRequest);

    /**
     * <p>
     * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created
     * when you call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a> action. Sign the CSR with your ACM Private CA-hosted or on-premises root or
     * subordinate CA. Then import the signed certificate back into ACM Private CA by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ImportCertificateAuthorityCertificate.html"
     * >ImportCertificateAuthorityCertificate</a> action. The CSR is returned as a base64 PEM-encoded string.
     * </p>
     * 
     * @param getCertificateAuthorityCsrRequest
     * @return Result of the GetCertificateAuthorityCsr operation returned by the service.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @sample AWSACMPCA.GetCertificateAuthorityCsr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCsr"
     *      target="_top">AWS API Documentation</a>
     */
    GetCertificateAuthorityCsrResult getCertificateAuthorityCsr(GetCertificateAuthorityCsrRequest getCertificateAuthorityCsrRequest);

    /**
     * <p>
     * Retrieves the resource-based policy attached to a private CA. If either the private CA resource or the policy
     * cannot be found, this action returns a <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * The policy can be attached or updated with <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_PutPolicy.html">PutPolicy</a> and removed with
     * <a href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DeletePolicy.html">DeletePolicy</a>.
     * </p>
     * <p class="title">
     * <b>About Policies</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A policy grants access on a private CA to an AWS customer account, to AWS Organizations, or to an AWS
     * Organizations unit. Policies are under the control of a CA administrator. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-rbp.html">Using a Resource Based Policy with ACM
     * Private CA</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A policy permits a user of AWS Certificate Manager (ACM) to issue ACM certificates signed by a CA in another
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ACM to manage automatic renewal of these certificates, the ACM user must configure a Service Linked Role
     * (SLR). The SLR allows the ACM service to assume the identity of the user, subject to confirmation against the ACM
     * Private CA policy. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-slr.html">Using a Service Linked Role with ACM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updates made in AWS Resource Manager (RAM) are reflected in policies. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-ram.html">Attach a Policy for Cross-Account
     * Access</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @sample AWSACMPCA.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Imports a signed private CA certificate into ACM Private CA. This action is used when you are using a chain of
     * trust whose root is located outside ACM Private CA. Before you can call this action, the following preparations
     * must in place:
     * </p>
     * <ol>
     * <li>
     * <p>
     * In ACM Private CA, call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a> action to create the private CA that you plan to back with the imported
     * certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call the <a href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_GetCertificateAuthorityCsr.html">
     * GetCertificateAuthorityCsr</a> action to generate a certificate signing request (CSR).
     * </p>
     * </li>
     * <li>
     * <p>
     * Sign the CSR using a root or intermediate CA hosted by either an on-premises PKI hierarchy or by a commercial CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.
     * </p>
     * </li>
     * </ol>
     * <p>
     * ACM Private CA supports three scenarios for installing a CA certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Installing a certificate for a root CA hosted by ACM Private CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * Installing a subordinate CA certificate whose parent authority is hosted by ACM Private CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * Installing a subordinate CA certificate whose parent authority is externally hosted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following additional requirements apply when you import a CA certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only a self-signed certificate can be imported as a root CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * A self-signed certificate cannot be imported as a subordinate CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your certificate chain must not include the private CA certificate that you are importing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your root CA must be the last certificate in your chain. The subordinate certificate, if any, that your root CA
     * signed must be next to last. The subordinate certificate signed by the preceding subordinate CA must come next,
     * and so on until your chain is built.
     * </p>
     * </li>
     * <li>
     * <p>
     * The chain must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum allowed size of a certificate is 32 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum allowed size of a certificate chain is 2 MB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Enforcement of Critical Constraints</i>
     * </p>
     * <p>
     * ACM Private CA allows the following extensions to be marked critical in the imported CA certificate or chain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Basic constraints (<i>must</i> be marked critical)
     * </p>
     * </li>
     * <li>
     * <p>
     * Subject alternative names
     * </p>
     * </li>
     * <li>
     * <p>
     * Key usage
     * </p>
     * </li>
     * <li>
     * <p>
     * Extended key usage
     * </p>
     * </li>
     * <li>
     * <p>
     * Authority key identifier
     * </p>
     * </li>
     * <li>
     * <p>
     * Subject key identifier
     * </p>
     * </li>
     * <li>
     * <p>
     * Issuer alternative name
     * </p>
     * </li>
     * <li>
     * <p>
     * Subject directory attributes
     * </p>
     * </li>
     * <li>
     * <p>
     * Subject information access
     * </p>
     * </li>
     * <li>
     * <p>
     * Certificate policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Inhibit anyPolicy
     * </p>
     * </li>
     * </ul>
     * <p>
     * ACM Private CA rejects the following extensions when they are marked critical in an imported CA certificate or
     * chain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name constraints
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy constraints
     * </p>
     * </li>
     * <li>
     * <p>
     * CRL distribution points
     * </p>
     * </li>
     * <li>
     * <p>
     * Authority information access
     * </p>
     * </li>
     * <li>
     * <p>
     * Freshest CRL
     * </p>
     * </li>
     * <li>
     * <p>
     * Any other extension
     * </p>
     * </li>
     * </ul>
     * 
     * @param importCertificateAuthorityCertificateRequest
     * @return Result of the ImportCertificateAuthorityCertificate operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidRequestException
     *         The request action cannot be performed or is prohibited.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws MalformedCertificateException
     *         One or more fields in the certificate are invalid.
     * @throws CertificateMismatchException
     *         The certificate authority certificate you are importing does not comply with conditions specified in the
     *         certificate that signed it.
     * @sample AWSACMPCA.ImportCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ImportCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    ImportCertificateAuthorityCertificateResult importCertificateAuthorityCertificate(
            ImportCertificateAuthorityCertificateRequest importCertificateAuthorityCertificateRequest);

    /**
     * <p>
     * Uses your private certificate authority (CA), or one that has been shared with you, to issue a client
     * certificate. This action returns the Amazon Resource Name (ARN) of the certificate. You can retrieve the
     * certificate by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_GetCertificate.html">GetCertificate</a> action
     * and specifying the ARN.
     * </p>
     * <note>
     * <p>
     * You cannot use the ACM <b>ListCertificateAuthorities</b> action to retrieve the ARNs of the certificates that you
     * issue by using ACM Private CA.
     * </p>
     * </note>
     * 
     * @param issueCertificateRequest
     * @return Result of the IssueCertificate operation returned by the service.
     * @throws LimitExceededException
     *         An ACM Private CA quota has been exceeded. See the exception message returned to determine the quota that
     *         was exceeded.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws MalformedCSRException
     *         The certificate signing request is invalid.
     * @sample AWSACMPCA.IssueCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/IssueCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    IssueCertificateResult issueCertificate(IssueCertificateRequest issueCertificateRequest);

    /**
     * <p>
     * Lists the private certificate authorities that you created by using the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a> action.
     * </p>
     * 
     * @param listCertificateAuthoritiesRequest
     * @return Result of the ListCertificateAuthorities operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token specified in the <code>NextToken</code> argument is not valid. Use the token returned from your
     *         previous call to <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *         >ListCertificateAuthorities</a>.
     * @sample AWSACMPCA.ListCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    ListCertificateAuthoritiesResult listCertificateAuthorities(ListCertificateAuthoritiesRequest listCertificateAuthoritiesRequest);

    /**
     * <p>
     * List all permissions on a private CA, if any, granted to the AWS Certificate Manager (ACM) service principal
     * (acm.amazonaws.com).
     * </p>
     * <p>
     * These permissions allow ACM to issue and renew ACM certificates that reside in the same AWS account as the CA.
     * </p>
     * <p>
     * Permissions can be granted with the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreatePermission.html">CreatePermission</a>
     * action and revoked with the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DeletePermission.html">DeletePermission</a>
     * action.
     * </p>
     * <p class="title">
     * <b>About Permissions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the private CA and the certificates it issues reside in the same account, you can use
     * <code>CreatePermission</code> to grant permissions for ACM to carry out automatic certificate renewals.
     * </p>
     * </li>
     * <li>
     * <p>
     * For automatic certificate renewal to succeed, the ACM service principal needs permissions to create, retrieve,
     * and list certificates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the private CA and the ACM certificates reside in different accounts, then permissions cannot be used to
     * enable automatic renewals. Instead, the ACM certificate owner must set up a resource-based policy to enable
     * cross-account issuance and renewals. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-rbp.html">Using a Resource Based Policy with ACM
     * Private CA</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listPermissionsRequest
     * @return Result of the ListPermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidNextTokenException
     *         The token specified in the <code>NextToken</code> argument is not valid. Use the token returned from your
     *         previous call to <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *         >ListCertificateAuthorities</a>.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @sample AWSACMPCA.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    ListPermissionsResult listPermissions(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Lists the tags, if any, that are associated with your private CA or one that has been shared with you. Tags are
     * labels that you can use to identify and organize your CAs. Each tag consists of a key and an optional value. Call
     * the <a href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_TagCertificateAuthority.html">
     * TagCertificateAuthority</a> action to add one or more tags to your CA. Call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_UntagCertificateAuthority.html"
     * >UntagCertificateAuthority</a> action to remove tags.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @sample AWSACMPCA.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Attaches a resource-based policy to a private CA.
     * </p>
     * <p>
     * A policy can also be applied by sharing a private CA through AWS Resource Access Manager (RAM). For more
     * information, see <a href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-ram.html">Attach a Policy for
     * Cross-Account Access</a>.
     * </p>
     * <p>
     * The policy can be displayed with <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_GetPolicy.html">GetPolicy</a> and removed with
     * <a href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DeletePolicy.html">DeletePolicy</a>.
     * </p>
     * <p class="title">
     * <b>About Policies</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A policy grants access on a private CA to an AWS customer account, to AWS Organizations, or to an AWS
     * Organizations unit. Policies are under the control of a CA administrator. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-rbp.html">Using a Resource Based Policy with ACM
     * Private CA</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A policy permits a user of AWS Certificate Manager (ACM) to issue ACM certificates signed by a CA in another
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ACM to manage automatic renewal of these certificates, the ACM user must configure a Service Linked Role
     * (SLR). The SLR allows the ACM service to assume the identity of the user, subject to confirmation against the ACM
     * Private CA policy. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-slr.html">Using a Service Linked Role with ACM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updates made in AWS Resource Manager (RAM) are reflected in policies. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/pca-ram.html">Attach a Policy for Cross-Account
     * Access</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPolicyRequest
     * @return Result of the PutPolicy operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws InvalidPolicyException
     *         The resource policy is invalid or is missing a required statement. For general information about IAM
     *         policy and statement structure, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json"
     *         >Overview of JSON Policies</a>.
     * @throws LockoutPreventedException
     *         The current action was prevented because it would lock the caller out from performing subsequent actions.
     *         Verify that the specified parameters would not result in the caller being denied access to the resource.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @sample AWSACMPCA.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutPolicyResult putPolicy(PutPolicyRequest putPolicyRequest);

    /**
     * <p>
     * Restores a certificate authority (CA) that is in the <code>DELETED</code> state. You can restore a CA during the
     * period that you defined in the <b>PermanentDeletionTimeInDays</b> parameter of the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DeleteCertificateAuthority.html"
     * >DeleteCertificateAuthority</a> action. Currently, you can specify 7 to 30 days. If you did not specify a
     * <b>PermanentDeletionTimeInDays</b> value, by default you can restore the CA at any time in a 30 day period. You
     * can check the time remaining in the restoration period of a private CA in the <code>DELETED</code> state by
     * calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DescribeCertificateAuthority.html"
     * >DescribeCertificateAuthority</a> or <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> actions. The status of a restored CA is set to its pre-deletion status when the
     * <b>RestoreCertificateAuthority</b> action returns. To change its status to <code>ACTIVE</code>, call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_UpdateCertificateAuthority.html"
     * >UpdateCertificateAuthority</a> action. If the private CA was in the <code>PENDING_CERTIFICATE</code> state at
     * deletion, you must use the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ImportCertificateAuthorityCertificate.html"
     * >ImportCertificateAuthorityCertificate</a> action to import a certificate authority into the private CA before it
     * can be activated. You cannot restore a CA after the restoration period has ended.
     * </p>
     * 
     * @param restoreCertificateAuthorityRequest
     * @return Result of the RestoreCertificateAuthority operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSACMPCA.RestoreCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RestoreCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreCertificateAuthorityResult restoreCertificateAuthority(RestoreCertificateAuthorityRequest restoreCertificateAuthorityRequest);

    /**
     * <p>
     * Revokes a certificate that was issued inside ACM Private CA. If you enable a certificate revocation list (CRL)
     * when you create or update your private CA, information about the revoked certificates will be included in the
     * CRL. ACM Private CA writes the CRL to an S3 bucket that you specify. A CRL is typically updated approximately 30
     * minutes after a certificate is revoked. If for any reason the CRL update fails, ACM Private CA attempts makes
     * further attempts every 15 minutes. With Amazon CloudWatch, you can create alarms for the metrics
     * <code>CRLGenerated</code> and <code>MisconfiguredCRLBucket</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaCloudWatch.html">Supported CloudWatch Metrics</a>.
     * </p>
     * <note>
     * <p>
     * Both PCA and the IAM principal must have permission to write to the S3 bucket that you specify. If the IAM
     * principal making the call does not have permission to write to the bucket, then an exception is thrown. For more
     * information, see <a href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaAuthAccess.html">Configure
     * Access to ACM Private CA</a>.
     * </p>
     * </note>
     * <p>
     * ACM Private CA also writes revocation information to the audit report. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthorityAuditReport.html"
     * >CreateCertificateAuthorityAuditReport</a>.
     * </p>
     * <note>
     * <p>
     * You cannot revoke a root CA self-signed certificate.
     * </p>
     * </note>
     * 
     * @param revokeCertificateRequest
     * @return Result of the RevokeCertificate operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidRequestException
     *         The request action cannot be performed or is prohibited.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws LimitExceededException
     *         An ACM Private CA quota has been exceeded. See the exception message returned to determine the quota that
     *         was exceeded.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws RequestAlreadyProcessedException
     *         Your request has already been completed.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @sample AWSACMPCA.RevokeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RevokeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    RevokeCertificateResult revokeCertificate(RevokeCertificateRequest revokeCertificateRequest);

    /**
     * <p>
     * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon
     * Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if
     * you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs
     * if you want to filter for a common relationship among those CAs. To remove one or more tags, use the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_UntagCertificateAuthority.html"
     * >UntagCertificateAuthority</a> action. Call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListTags.html">ListTags</a> action to see what
     * tags are associated with your CA.
     * </p>
     * 
     * @param tagCertificateAuthorityRequest
     * @return Result of the TagCertificateAuthority operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws InvalidTagException
     *         The tag associated with the CA is not valid. The invalid argument is contained in the message field.
     * @throws TooManyTagsException
     *         You can associate up to 50 tags with a private CA. Exception information is contained in the exception
     *         message field.
     * @sample AWSACMPCA.TagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/TagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    TagCertificateAuthorityResult tagCertificateAuthority(TagCertificateAuthorityRequest tagCertificateAuthorityRequest);

    /**
     * <p>
     * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value
     * portion of the tag when calling this action, the tag will be removed regardless of value. If you specify a value,
     * the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_TagCertificateAuthority.html">
     * TagCertificateAuthority</a>. Call the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListTags.html">ListTags</a> action to see what
     * tags are associated with your CA.
     * </p>
     * 
     * @param untagCertificateAuthorityRequest
     * @return Result of the UntagCertificateAuthority operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws InvalidTagException
     *         The tag associated with the CA is not valid. The invalid argument is contained in the message field.
     * @sample AWSACMPCA.UntagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UntagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    UntagCertificateAuthorityResult untagCertificateAuthority(UntagCertificateAuthorityRequest untagCertificateAuthorityRequest);

    /**
     * <p>
     * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the
     * <code>ACTIVE</code> or <code>DISABLED</code> state before you can update it. You can disable a private CA that is
     * in the <code>ACTIVE</code> state or make a CA that is in the <code>DISABLED</code> state active again.
     * </p>
     * <note>
     * <p>
     * Both PCA and the IAM principal must have permission to write to the S3 bucket that you specify. If the IAM
     * principal making the call does not have permission to write to the bucket, then an exception is thrown. For more
     * information, see <a href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaAuthAccess.html">Configure
     * Access to ACM Private CA</a>.
     * </p>
     * </note>
     * 
     * @param updateCertificateAuthorityRequest
     * @return Result of the UpdateCertificateAuthority operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, audit report, or policy cannot be found.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The state of the private CA does not allow this action to occur.
     * @throws InvalidPolicyException
     *         The resource policy is invalid or is missing a required statement. For general information about IAM
     *         policy and statement structure, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json"
     *         >Overview of JSON Policies</a>.
     * @sample AWSACMPCA.UpdateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UpdateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCertificateAuthorityResult updateCertificateAuthority(UpdateCertificateAuthorityRequest updateCertificateAuthorityRequest);

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

    AWSACMPCAWaiters waiters();

}
