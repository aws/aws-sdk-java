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
 * You can use the ACM PCA API to create a private certificate authority (CA). You must first call the
 * <a>CreateCertificateAuthority</a> operation. If successful, the operation returns an Amazon Resource Name (ARN) for
 * your private CA. Use this ARN as input to the <a>GetCertificateAuthorityCsr</a> operation to retrieve the certificate
 * signing request (CSR) for your private CA certificate. Sign the CSR using the root or an intermediate CA in your
 * on-premises PKI hierarchy, and call the <a>ImportCertificateAuthorityCertificate</a> to import your signed private CA
 * certificate into ACM PCA.
 * </p>
 * <p>
 * Use your private CA to issue and revoke certificates. These are private certificates that identify and secure client
 * computers, servers, applications, services, devices, and users over SSLS/TLS connections within your organization.
 * Call the <a>IssueCertificate</a> operation to issue a certificate. Call the <a>RevokeCertificate</a> operation to
 * revoke a certificate.
 * </p>
 * <note>
 * <p>
 * Certificates issued by your private CA can be trusted only within your organization, not publicly.
 * </p>
 * </note>
 * <p>
 * Your private CA can optionally create a certificate revocation list (CRL) to track the certificates you revoke. To
 * create a CRL, you must specify a <a>RevocationConfiguration</a> object when you call the
 * <a>CreateCertificateAuthority</a> operation. ACM PCA writes the CRL to an S3 bucket that you specify. You must
 * specify a bucket policy that grants ACM PCA write permission.
 * </p>
 * <p>
 * You can also call the <a>CreateCertificateAuthorityAuditReport</a> to create an optional audit report, which
 * enumerates all of the issued, valid, expired, and revoked certificates from the CA.
 * </p>
 * <note>
 * <p>
 * Each ACM PCA API operation has a throttling limit which determines the number of times the operation can be called
 * per second. For more information, see <a
 * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaLimits.html#PcaLimits-api">API Rate Limits in ACM
 * PCA</a> in the ACM PCA user guide.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSACMPCAAsync extends AWSACMPCA {

    /**
     * <p>
     * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation
     * configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the
     * algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to
     * sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL
     * expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a
     * CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation
     * returns the Amazon Resource Name (ARN) of the CA.
     * </p>
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
     * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation
     * configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the
     * algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to
     * sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL
     * expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a
     * CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this operation
     * returns the Amazon Resource Name (ARN) of the CA.
     * </p>
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
     * S3 bucket that you specify on input. The <a>IssueCertificate</a> and <a>RevokeCertificate</a> operations use the
     * private key. You can generate a new report every 30 minutes.
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
     * S3 bucket that you specify on input. The <a>IssueCertificate</a> and <a>RevokeCertificate</a> operations use the
     * private key. You can generate a new report every 30 minutes.
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
     * Assigns permissions from a private CA to a designated AWS service. Services are specified by their service
     * principals and can be given permission to create and retrieve certificates on a private CA. Services can also be
     * given permission to list the active permissions that the private CA has granted. For ACM to automatically renew
     * your private CA's certificates, you must assign all possible permissions from the CA to the ACM service
     * principal.
     * </p>
     * <p>
     * At this time, you can only assign permissions to ACM (<code>acm.amazonaws.com</code>). Permissions can be revoked
     * with the <a>DeletePermission</a> operation and listed with the <a>ListPermissions</a> operation.
     * </p>
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
     * Assigns permissions from a private CA to a designated AWS service. Services are specified by their service
     * principals and can be given permission to create and retrieve certificates on a private CA. Services can also be
     * given permission to list the active permissions that the private CA has granted. For ACM to automatically renew
     * your private CA's certificates, you must assign all possible permissions from the CA to the ACM service
     * principal.
     * </p>
     * <p>
     * At this time, you can only assign permissions to ACM (<code>acm.amazonaws.com</code>). Permissions can be revoked
     * with the <a>DeletePermission</a> operation and listed with the <a>ListPermissions</a> operation.
     * </p>
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
     * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA
     * that you want to delete. You can find the ARN by calling the <a>ListCertificateAuthorities</a> operation. Before
     * you can delete a CA, you must disable it. Call the <a>UpdateCertificateAuthority</a> operation and set the
     * <b>CertificateAuthorityStatus</b> parameter to <code>DISABLED</code>.
     * </p>
     * <p>
     * Additionally, you can delete a CA if you are waiting for it to be created (the <b>Status</b> field of the
     * <a>CertificateAuthority</a> is <code>CREATING</code>). You can also delete it if the CA has been created but you
     * haven't yet imported the signed certificate (the <b>Status</b> is <code>PENDING_CERTIFICATE</code>) into ACM PCA.
     * </p>
     * <p>
     * If the CA is in one of the previously mentioned states and you call <a>DeleteCertificateAuthority</a>, the CA's
     * status changes to <code>DELETED</code>. However, the CA won't be permanently deleted until the restoration period
     * has passed. By default, if you do not set the <code>PermanentDeletionTimeInDays</code> parameter, the CA remains
     * restorable for 30 days. You can set the parameter from 7 to 30 days. The <a>DescribeCertificateAuthority</a>
     * operation returns the time remaining in the restoration window of a Private CA in the <code>DELETED</code> state.
     * To restore an eligible CA, call the <a>RestoreCertificateAuthority</a> operation.
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
     * Deletes a private certificate authority (CA). You must provide the ARN (Amazon Resource Name) of the private CA
     * that you want to delete. You can find the ARN by calling the <a>ListCertificateAuthorities</a> operation. Before
     * you can delete a CA, you must disable it. Call the <a>UpdateCertificateAuthority</a> operation and set the
     * <b>CertificateAuthorityStatus</b> parameter to <code>DISABLED</code>.
     * </p>
     * <p>
     * Additionally, you can delete a CA if you are waiting for it to be created (the <b>Status</b> field of the
     * <a>CertificateAuthority</a> is <code>CREATING</code>). You can also delete it if the CA has been created but you
     * haven't yet imported the signed certificate (the <b>Status</b> is <code>PENDING_CERTIFICATE</code>) into ACM PCA.
     * </p>
     * <p>
     * If the CA is in one of the previously mentioned states and you call <a>DeleteCertificateAuthority</a>, the CA's
     * status changes to <code>DELETED</code>. However, the CA won't be permanently deleted until the restoration period
     * has passed. By default, if you do not set the <code>PermanentDeletionTimeInDays</code> parameter, the CA remains
     * restorable for 30 days. You can set the parameter from 7 to 30 days. The <a>DescribeCertificateAuthority</a>
     * operation returns the time remaining in the restoration window of a Private CA in the <code>DELETED</code> state.
     * To restore an eligible CA, call the <a>RestoreCertificateAuthority</a> operation.
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
     * Revokes permissions that a private CA assigned to a designated AWS service. Permissions can be created with the
     * <a>CreatePermission</a> operation and listed with the <a>ListPermissions</a> operation.
     * </p>
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
     * Revokes permissions that a private CA assigned to a designated AWS service. Permissions can be created with the
     * <a>CreatePermission</a> operation and listed with the <a>ListPermissions</a> operation.
     * </p>
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
     * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN
     * (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - ACM PCA is creating your private certificate authority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_CERTIFICATE</code> - The certificate is pending. You must use your on-premises root or subordinate
     * CA to sign your private CA CSR and then import it into PCA.
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
     * backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Your private CA is within the restoration period, after which it is permanently deleted.
     * The length of time remaining in the CA's restoration period is also included in this operation's output.
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
     * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN
     * (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - ACM PCA is creating your private certificate authority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_CERTIFICATE</code> - The certificate is pending. You must use your on-premises root or subordinate
     * CA to sign your private CA CSR and then import it into PCA.
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
     * backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Your private CA is within the restoration period, after which it is permanently deleted.
     * The length of time remaining in the CA's restoration period is also included in this operation's output.
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
     * Lists information about a specific audit report created by calling the
     * <a>CreateCertificateAuthorityAuditReport</a> operation. Audit information is created every time the certificate
     * authority (CA) private key is used. The private key is used when you call the <a>IssueCertificate</a> operation
     * or the <a>RevokeCertificate</a> operation.
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
     * Lists information about a specific audit report created by calling the
     * <a>CreateCertificateAuthorityAuditReport</a> operation. Audit information is created every time the certificate
     * authority (CA) private key is used. The private key is used when you call the <a>IssueCertificate</a> operation
     * or the <a>RevokeCertificate</a> operation.
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
     * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the
     * <a>IssueCertificate</a> operation. You must specify both the ARN of your private CA and the ARN of the issued
     * certificate when calling the <b>GetCertificate</b> operation. You can retrieve the certificate if it is in the
     * <b>ISSUED</b> state. You can call the <a>CreateCertificateAuthorityAuditReport</a> operation to create a report
     * that contains information about all of the certificates issued and revoked by your private CA.
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
     * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the
     * <a>IssueCertificate</a> operation. You must specify both the ARN of your private CA and the ARN of the issued
     * certificate when calling the <b>GetCertificate</b> operation. You can retrieve the certificate if it is in the
     * <b>ISSUED</b> state. You can call the <a>CreateCertificateAuthorityAuditReport</a> operation to create a report
     * that contains information about all of the certificates issued and revoked by your private CA.
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
     * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate
     * and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the
     * chain signs the one before it.
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
     * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate
     * and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the
     * chain signs the one before it.
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
     * when you call the <a>CreateCertificateAuthority</a> operation. Take the CSR to your on-premises X.509
     * infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into
     * ACM PCA by calling the <a>ImportCertificateAuthorityCertificate</a> operation. The CSR is returned as a base64
     * PEM-encoded string.
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
     * when you call the <a>CreateCertificateAuthority</a> operation. Take the CSR to your on-premises X.509
     * infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into
     * ACM PCA by calling the <a>ImportCertificateAuthorityCertificate</a> operation. The CSR is returned as a base64
     * PEM-encoded string.
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
     * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the
     * private certificate authority by calling the <a>CreateCertificateAuthority</a> operation. You must then generate
     * a certificate signing request (CSR) by calling the <a>GetCertificateAuthorityCsr</a> operation. Take the CSR to
     * your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate
     * chain and copy the signed certificate and the certificate chain to your working directory.
     * </p>
     * <note>
     * <p>
     * Your certificate chain must not include the private CA certificate that you are importing.
     * </p>
     * </note> <note>
     * <p>
     * Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any,
     * that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA
     * must come next, and so on until your chain is built.
     * </p>
     * </note> <note>
     * <p>
     * The chain must be PEM-encoded.
     * </p>
     * </note>
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
     * Imports your signed private CA certificate into ACM PCA. Before you can call this operation, you must create the
     * private certificate authority by calling the <a>CreateCertificateAuthority</a> operation. You must then generate
     * a certificate signing request (CSR) by calling the <a>GetCertificateAuthorityCsr</a> operation. Take the CSR to
     * your on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate
     * chain and copy the signed certificate and the certificate chain to your working directory.
     * </p>
     * <note>
     * <p>
     * Your certificate chain must not include the private CA certificate that you are importing.
     * </p>
     * </note> <note>
     * <p>
     * Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any,
     * that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA
     * must come next, and so on until your chain is built.
     * </p>
     * </note> <note>
     * <p>
     * The chain must be PEM-encoded.
     * </p>
     * </note>
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
     * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon
     * Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the <a>GetCertificate</a>
     * operation and specifying the ARN.
     * </p>
     * <note>
     * <p>
     * You cannot use the ACM <b>ListCertificateAuthorities</b> operation to retrieve the ARNs of the certificates that
     * you issue by using ACM PCA.
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
     * Uses your private certificate authority (CA) to issue a client certificate. This operation returns the Amazon
     * Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the <a>GetCertificate</a>
     * operation and specifying the ARN.
     * </p>
     * <note>
     * <p>
     * You cannot use the ACM <b>ListCertificateAuthorities</b> operation to retrieve the ARNs of the certificates that
     * you issue by using ACM PCA.
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
     * Lists the private certificate authorities that you created by using the <a>CreateCertificateAuthority</a>
     * operation.
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
     * Lists the private certificate authorities that you created by using the <a>CreateCertificateAuthority</a>
     * operation.
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
     * Lists all the permissions, if any, that have been assigned by a private CA. Permissions can be granted with the
     * <a>CreatePermission</a> operation and revoked with the <a>DeletePermission</a> operation.
     * </p>
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
     * Lists all the permissions, if any, that have been assigned by a private CA. Permissions can be granted with the
     * <a>CreatePermission</a> operation and revoked with the <a>DeletePermission</a> operation.
     * </p>
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
     * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify
     * and organize your CAs. Each tag consists of a key and an optional value. Call the <a>TagCertificateAuthority</a>
     * operation to add one or more tags to your CA. Call the <a>UntagCertificateAuthority</a> operation to remove tags.
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
     * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify
     * and organize your CAs. Each tag consists of a key and an optional value. Call the <a>TagCertificateAuthority</a>
     * operation to add one or more tags to your CA. Call the <a>UntagCertificateAuthority</a> operation to remove tags.
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
     * Restores a certificate authority (CA) that is in the <code>DELETED</code> state. You can restore a CA during the
     * period that you defined in the <b>PermanentDeletionTimeInDays</b> parameter of the
     * <a>DeleteCertificateAuthority</a> operation. Currently, you can specify 7 to 30 days. If you did not specify a
     * <b>PermanentDeletionTimeInDays</b> value, by default you can restore the CA at any time in a 30 day period. You
     * can check the time remaining in the restoration period of a private CA in the <code>DELETED</code> state by
     * calling the <a>DescribeCertificateAuthority</a> or <a>ListCertificateAuthorities</a> operations. The status of a
     * restored CA is set to its pre-deletion status when the <b>RestoreCertificateAuthority</b> operation returns. To
     * change its status to <code>ACTIVE</code>, call the <a>UpdateCertificateAuthority</a> operation. If the private CA
     * was in the <code>PENDING_CERTIFICATE</code> state at deletion, you must use the
     * <a>ImportCertificateAuthorityCertificate</a> operation to import a certificate authority into the private CA
     * before it can be activated. You cannot restore a CA after the restoration period has ended.
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
     * period that you defined in the <b>PermanentDeletionTimeInDays</b> parameter of the
     * <a>DeleteCertificateAuthority</a> operation. Currently, you can specify 7 to 30 days. If you did not specify a
     * <b>PermanentDeletionTimeInDays</b> value, by default you can restore the CA at any time in a 30 day period. You
     * can check the time remaining in the restoration period of a private CA in the <code>DELETED</code> state by
     * calling the <a>DescribeCertificateAuthority</a> or <a>ListCertificateAuthorities</a> operations. The status of a
     * restored CA is set to its pre-deletion status when the <b>RestoreCertificateAuthority</b> operation returns. To
     * change its status to <code>ACTIVE</code>, call the <a>UpdateCertificateAuthority</a> operation. If the private CA
     * was in the <code>PENDING_CERTIFICATE</code> state at deletion, you must use the
     * <a>ImportCertificateAuthorityCertificate</a> operation to import a certificate authority into the private CA
     * before it can be activated. You cannot restore a CA after the restoration period has ended.
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
     * Revokes a certificate that you issued by calling the <a>IssueCertificate</a> operation. If you enable a
     * certificate revocation list (CRL) when you create or update your private CA, information about the revoked
     * certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more
     * information about revocation, see the <a>CrlConfiguration</a> structure. ACM PCA also writes revocation
     * information to the audit report. For more information, see <a>CreateCertificateAuthorityAuditReport</a>.
     * </p>
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
     * Revokes a certificate that you issued by calling the <a>IssueCertificate</a> operation. If you enable a
     * certificate revocation list (CRL) when you create or update your private CA, information about the revoked
     * certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more
     * information about revocation, see the <a>CrlConfiguration</a> structure. ACM PCA also writes revocation
     * information to the audit report. For more information, see <a>CreateCertificateAuthorityAuditReport</a>.
     * </p>
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
     * if you want to filter for a common relationship among those CAs. To remove one or more tags, use the
     * <a>UntagCertificateAuthority</a> operation. Call the <a>ListTags</a> operation to see what tags are associated
     * with your CA.
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
     * if you want to filter for a common relationship among those CAs. To remove one or more tags, use the
     * <a>UntagCertificateAuthority</a> operation. Call the <a>ListTags</a> operation to see what tags are associated
     * with your CA.
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
     * portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a
     * value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the
     * <a>TagCertificateAuthority</a>. Call the <a>ListTags</a> operation to see what tags are associated with your CA.
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
     * portion of the tag when calling this operation, the tag will be removed regardless of value. If you specify a
     * value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the
     * <a>TagCertificateAuthority</a>. Call the <a>ListTags</a> operation to see what tags are associated with your CA.
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
