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

import com.amazonaws.services.acmpca.model.*;

/**
 * Interface for accessing ACM-PCA asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.acmpca.AbstractAWSACMPCAAsync} instead.
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
public interface AWSACMPCAAsync extends AWSACMPCA {

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
     * @return A Java Future containing the result of the CreateCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsync.CreateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCertificateAuthorityResult> createCertificateAuthorityAsync(
            CreateCertificateAuthorityRequest createCertificateAuthorityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.CreateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCertificateAuthorityResult> createCertificateAuthorityAsync(
            CreateCertificateAuthorityRequest createCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateCertificateAuthorityAuditReport operation returned by
     *         the service.
     * @sample AWSACMPCAAsync.CreateCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCertificateAuthorityAuditReportResult> createCertificateAuthorityAuditReportAsync(
            CreateCertificateAuthorityAuditReportRequest createCertificateAuthorityAuditReportRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCertificateAuthorityAuditReport operation returned by
     *         the service.
     * @sample AWSACMPCAAsyncHandler.CreateCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCertificateAuthorityAuditReportResult> createCertificateAuthorityAuditReportAsync(
            CreateCertificateAuthorityAuditReportRequest createCertificateAuthorityAuditReportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCertificateAuthorityAuditReportRequest, CreateCertificateAuthorityAuditReportResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreatePermission operation returned by the service.
     * @sample AWSACMPCAAsync.CreatePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreatePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(CreatePermissionRequest createPermissionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePermission operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.CreatePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreatePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(CreatePermissionRequest createPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePermissionRequest, CreatePermissionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsync.DeleteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeleteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateAuthorityResult> deleteCertificateAuthorityAsync(
            DeleteCertificateAuthorityRequest deleteCertificateAuthorityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.DeleteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeleteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateAuthorityResult> deleteCertificateAuthorityAsync(
            DeleteCertificateAuthorityRequest deleteCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeletePermission operation returned by the service.
     * @sample AWSACMPCAAsync.DeletePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeletePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(DeletePermissionRequest deletePermissionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermission operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.DeletePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeletePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(DeletePermissionRequest deletePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionRequest, DeletePermissionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSACMPCAAsync.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeCertificateAuthority operation returned by the
     *         service.
     * @sample AWSACMPCAAsync.DescribeCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateAuthorityResult> describeCertificateAuthorityAsync(
            DescribeCertificateAuthorityRequest describeCertificateAuthorityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificateAuthority operation returned by the
     *         service.
     * @sample AWSACMPCAAsyncHandler.DescribeCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateAuthorityResult> describeCertificateAuthorityAsync(
            DescribeCertificateAuthorityRequest describeCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateAuthorityRequest, DescribeCertificateAuthorityResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeCertificateAuthorityAuditReport operation returned by
     *         the service.
     * @sample AWSACMPCAAsync.DescribeCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateAuthorityAuditReportResult> describeCertificateAuthorityAuditReportAsync(
            DescribeCertificateAuthorityAuditReportRequest describeCertificateAuthorityAuditReportRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificateAuthorityAuditReport operation returned by
     *         the service.
     * @sample AWSACMPCAAsyncHandler.DescribeCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateAuthorityAuditReportResult> describeCertificateAuthorityAuditReportAsync(
            DescribeCertificateAuthorityAuditReportRequest describeCertificateAuthorityAuditReportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateAuthorityAuditReportRequest, DescribeCertificateAuthorityAuditReportResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCertificate operation returned by the service.
     * @sample AWSACMPCAAsync.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest getCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCertificate operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest getCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler);

    /**
     * <p>
     * Retrieves the certificate and certificate chain for your private certificate authority (CA) or one that has been
     * shared with you. Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA
     * certificate. Each certificate in the chain signs the one before it.
     * </p>
     * 
     * @param getCertificateAuthorityCertificateRequest
     * @return A Java Future containing the result of the GetCertificateAuthorityCertificate operation returned by the
     *         service.
     * @sample AWSACMPCAAsync.GetCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateAuthorityCertificateResult> getCertificateAuthorityCertificateAsync(
            GetCertificateAuthorityCertificateRequest getCertificateAuthorityCertificateRequest);

    /**
     * <p>
     * Retrieves the certificate and certificate chain for your private certificate authority (CA) or one that has been
     * shared with you. Both the certificate and the chain are base64 PEM-encoded. The chain does not include the CA
     * certificate. Each certificate in the chain signs the one before it.
     * </p>
     * 
     * @param getCertificateAuthorityCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCertificateAuthorityCertificate operation returned by the
     *         service.
     * @sample AWSACMPCAAsyncHandler.GetCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateAuthorityCertificateResult> getCertificateAuthorityCertificateAsync(
            GetCertificateAuthorityCertificateRequest getCertificateAuthorityCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCertificateAuthorityCertificateRequest, GetCertificateAuthorityCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCertificateAuthorityCsr operation returned by the service.
     * @sample AWSACMPCAAsync.GetCertificateAuthorityCsr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCsr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateAuthorityCsrResult> getCertificateAuthorityCsrAsync(
            GetCertificateAuthorityCsrRequest getCertificateAuthorityCsrRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCertificateAuthorityCsr operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.GetCertificateAuthorityCsr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCsr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateAuthorityCsrResult> getCertificateAuthorityCsrAsync(
            GetCertificateAuthorityCsrRequest getCertificateAuthorityCsrRequest,
            com.amazonaws.handlers.AsyncHandler<GetCertificateAuthorityCsrRequest, GetCertificateAuthorityCsrResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSACMPCAAsync.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the ImportCertificateAuthorityCertificate operation returned by
     *         the service.
     * @sample AWSACMPCAAsync.ImportCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ImportCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateAuthorityCertificateResult> importCertificateAuthorityCertificateAsync(
            ImportCertificateAuthorityCertificateRequest importCertificateAuthorityCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportCertificateAuthorityCertificate operation returned by
     *         the service.
     * @sample AWSACMPCAAsyncHandler.ImportCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ImportCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateAuthorityCertificateResult> importCertificateAuthorityCertificateAsync(
            ImportCertificateAuthorityCertificateRequest importCertificateAuthorityCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the IssueCertificate operation returned by the service.
     * @sample AWSACMPCAAsync.IssueCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/IssueCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<IssueCertificateResult> issueCertificateAsync(IssueCertificateRequest issueCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IssueCertificate operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.IssueCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/IssueCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<IssueCertificateResult> issueCertificateAsync(IssueCertificateRequest issueCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<IssueCertificateRequest, IssueCertificateResult> asyncHandler);

    /**
     * <p>
     * Lists the private certificate authorities that you created by using the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a> action.
     * </p>
     * 
     * @param listCertificateAuthoritiesRequest
     * @return A Java Future containing the result of the ListCertificateAuthorities operation returned by the service.
     * @sample AWSACMPCAAsync.ListCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCertificateAuthoritiesResult> listCertificateAuthoritiesAsync(
            ListCertificateAuthoritiesRequest listCertificateAuthoritiesRequest);

    /**
     * <p>
     * Lists the private certificate authorities that you created by using the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a> action.
     * </p>
     * 
     * @param listCertificateAuthoritiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificateAuthorities operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.ListCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCertificateAuthoritiesResult> listCertificateAuthoritiesAsync(
            ListCertificateAuthoritiesRequest listCertificateAuthoritiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSACMPCAAsync.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSACMPCAAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutPolicy operation returned by the service.
     * @sample AWSACMPCAAsync.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest putPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPolicy operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest putPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutPolicyRequest, PutPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the RestoreCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsync.RestoreCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RestoreCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreCertificateAuthorityResult> restoreCertificateAuthorityAsync(
            RestoreCertificateAuthorityRequest restoreCertificateAuthorityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.RestoreCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RestoreCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreCertificateAuthorityResult> restoreCertificateAuthorityAsync(
            RestoreCertificateAuthorityRequest restoreCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResult> asyncHandler);

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
     * @return A Java Future containing the result of the RevokeCertificate operation returned by the service.
     * @sample AWSACMPCAAsync.RevokeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RevokeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RevokeCertificateResult> revokeCertificateAsync(RevokeCertificateRequest revokeCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeCertificate operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.RevokeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RevokeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RevokeCertificateResult> revokeCertificateAsync(RevokeCertificateRequest revokeCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeCertificateRequest, RevokeCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsync.TagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/TagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagCertificateAuthorityResult> tagCertificateAuthorityAsync(TagCertificateAuthorityRequest tagCertificateAuthorityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.TagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/TagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagCertificateAuthorityResult> tagCertificateAuthorityAsync(TagCertificateAuthorityRequest tagCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<TagCertificateAuthorityRequest, TagCertificateAuthorityResult> asyncHandler);

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
     * @return A Java Future containing the result of the UntagCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsync.UntagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UntagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagCertificateAuthorityResult> untagCertificateAuthorityAsync(
            UntagCertificateAuthorityRequest untagCertificateAuthorityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.UntagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UntagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagCertificateAuthorityResult> untagCertificateAuthorityAsync(
            UntagCertificateAuthorityRequest untagCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<UntagCertificateAuthorityRequest, UntagCertificateAuthorityResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsync.UpdateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UpdateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCertificateAuthorityResult> updateCertificateAuthorityAsync(
            UpdateCertificateAuthorityRequest updateCertificateAuthorityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCertificateAuthority operation returned by the service.
     * @sample AWSACMPCAAsyncHandler.UpdateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UpdateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCertificateAuthorityResult> updateCertificateAuthorityAsync(
            UpdateCertificateAuthorityRequest updateCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCertificateAuthorityRequest, UpdateCertificateAuthorityResult> asyncHandler);

}
