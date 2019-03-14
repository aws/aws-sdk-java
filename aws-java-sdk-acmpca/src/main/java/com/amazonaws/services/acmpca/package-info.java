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

/**
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
package com.amazonaws.services.acmpca;

