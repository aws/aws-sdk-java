/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that determines the distribution’s SSL/TLS configuration for communicating with viewers.
 * </p>
 * <p>
 * If the distribution doesn’t use <code>Aliases</code> (also known as alternate domain names or CNAMEs)—that is, if the
 * distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>—set
 * <code>CloudFrontDefaultCertificate</code> to <code>true</code> and leave all other fields empty.
 * </p>
 * <p>
 * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), use the fields in this type to
 * specify the following settings:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Which viewers the distribution accepts HTTPS connections from: only viewers that support <a
 * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a> (recommended), or all
 * viewers including those that don’t support SNI.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To accept HTTPS connections from only viewers that support SNI, set <code>SSLSupportMethod</code> to
 * <code>sni-only</code>. This is recommended. Most browsers and clients released after 2010 support SNI.
 * </p>
 * </li>
 * <li>
 * <p>
 * To accept HTTPS connections from all viewers, including those that don’t support SNI, set
 * <code>SSLSupportMethod</code> to <code>vip</code>. This is not recommended, and results in additional monthly charges
 * from CloudFront.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * The minimum SSL/TLS protocol version that the distribution can use to communicate with viewers. To specify a minimum
 * version, choose a value for <code>MinimumProtocolVersion</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
 * >Security Policy</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The location of the SSL/TLS certificate, <a
 * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS Certificate Manager (ACM)</a>
 * (recommended) or <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS
 * Identity and Access Management (AWS IAM)</a>. You specify the location by setting a value in one of the following
 * fields (not both):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ACMCertificateArn</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IAMCertificateId</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * All distributions support HTTPS connections from viewers. To require viewers to use HTTPS only, or to redirect them
 * from HTTP to HTTPS, use <code>ViewerProtocolPolicy</code> in the <code>CacheBehavior</code> or
 * <code>DefaultCacheBehavior</code>. To specify how CloudFront should use SSL/TLS to communicate with your custom
 * origin, use <code>CustomOriginConfig</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https.html">Using HTTPS with
 * CloudFront</a> and <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-alternate-domain-names.html">
 * Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2019-03-26/ViewerCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewerCertificate implements Serializable, Cloneable {

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, set this
     * field to <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     * <code>false</code> and specify values for the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     */
    private Boolean cloudFrontDefaultCertificate;
    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS
     * Identity and Access Management (AWS IAM)</a>, provide the ID of the IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     */
    private String iAMCertificateId;
    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS Certificate Manager
     * (ACM)</a>, provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM
     * certificates in the US East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     */
    private String aCMCertificateArn;
    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers the
     * distribution accepts HTTPS connections from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     * recommended. Most browsers and clients released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t support
     * SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, don’t set
     * a value for this field.
     * </p>
     */
    private String sSLSupportMethod;
    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security policy
     * that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices that
     * don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must specify
     * <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets the security
     * policy to <code>TLSv1</code> regardless of the value that you set here.
     * </p>
     */
    private String minimumProtocolVersion;
    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     */
    @Deprecated
    private String certificate;
    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     */
    @Deprecated
    private String certificateSource;

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, set this
     * field to <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     * <code>false</code> and specify values for the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param cloudFrontDefaultCertificate
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *        set this field to <code>true</code>.</p>
     *        <p>
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     *        <code>false</code> and specify values for the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MinimumProtocolVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSLSupportMethod</code>
     *        </p>
     *        </li>
     */

    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, set this
     * field to <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     * <code>false</code> and specify values for the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *         set this field to <code>true</code>.</p>
     *         <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     *         <code>false</code> and specify values for the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MinimumProtocolVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSLSupportMethod</code>
     *         </p>
     *         </li>
     */

    public Boolean getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, set this
     * field to <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     * <code>false</code> and specify values for the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param cloudFrontDefaultCertificate
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *        set this field to <code>true</code>.</p>
     *        <p>
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     *        <code>false</code> and specify values for the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MinimumProtocolVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSLSupportMethod</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        setCloudFrontDefaultCertificate(cloudFrontDefaultCertificate);
        return this;
    }

    /**
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, set this
     * field to <code>true</code>.
     * </p>
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     * <code>false</code> and specify values for the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumProtocolVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *         set this field to <code>true</code>.</p>
     *         <p>
     *         If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), set this field to
     *         <code>false</code> and specify values for the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code> or <code>IAMCertificateId</code> (specify a value for one, not both)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MinimumProtocolVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSLSupportMethod</code>
     *         </p>
     *         </li>
     */

    public Boolean isCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS
     * Identity and Access Management (AWS IAM)</a>, provide the ID of the IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     * 
     * @param iAMCertificateId
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS
     *        certificate is stored in <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS Identity and
     *        Access Management (AWS IAM)</a>, provide the ID of the IAM certificate.</p>
     *        <p>
     *        If you specify an IAM certificate ID, you must also specify values for <code>MinimumProtocolVerison</code>
     *        and <code>SSLSupportMethod</code>.
     */

    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS
     * Identity and Access Management (AWS IAM)</a>, provide the ID of the IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     * 
     * @return If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS
     *         certificate is stored in <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS Identity and
     *         Access Management (AWS IAM)</a>, provide the ID of the IAM certificate.</p>
     *         <p>
     *         If you specify an IAM certificate ID, you must also specify values for
     *         <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     */

    public String getIAMCertificateId() {
        return this.iAMCertificateId;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS
     * Identity and Access Management (AWS IAM)</a>, provide the ID of the IAM certificate.
     * </p>
     * <p>
     * If you specify an IAM certificate ID, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     * 
     * @param iAMCertificateId
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS
     *        certificate is stored in <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">AWS Identity and
     *        Access Management (AWS IAM)</a>, provide the ID of the IAM certificate.</p>
     *        <p>
     *        If you specify an IAM certificate ID, you must also specify values for <code>MinimumProtocolVerison</code>
     *        and <code>SSLSupportMethod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        setIAMCertificateId(iAMCertificateId);
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS Certificate Manager
     * (ACM)</a>, provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM
     * certificates in the US East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     * 
     * @param aCMCertificateArn
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS
     *        certificate is stored in <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
     *        Certificate Manager (ACM)</a>, provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront
     *        only supports ACM certificates in the US East (N. Virginia) Region (<code>us-east-1</code>).</p>
     *        <p>
     *        If you specify an ACM certificate ARN, you must also specify values for
     *        <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     */

    public void setACMCertificateArn(String aCMCertificateArn) {
        this.aCMCertificateArn = aCMCertificateArn;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS Certificate Manager
     * (ACM)</a>, provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM
     * certificates in the US East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     * 
     * @return If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS
     *         certificate is stored in <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
     *         Certificate Manager (ACM)</a>, provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront
     *         only supports ACM certificates in the US East (N. Virginia) Region (<code>us-east-1</code>).</p>
     *         <p>
     *         If you specify an ACM certificate ARN, you must also specify values for
     *         <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     */

    public String getACMCertificateArn() {
        return this.aCMCertificateArn;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS certificate is
     * stored in <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS Certificate Manager
     * (ACM)</a>, provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM
     * certificates in the US East (N. Virginia) Region (<code>us-east-1</code>).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify values for <code>MinimumProtocolVerison</code> and
     * <code>SSLSupportMethod</code>.
     * </p>
     * 
     * @param aCMCertificateArn
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs) and the SSL/TLS
     *        certificate is stored in <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
     *        Certificate Manager (ACM)</a>, provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront
     *        only supports ACM certificates in the US East (N. Virginia) Region (<code>us-east-1</code>).</p>
     *        <p>
     *        If you specify an ACM certificate ARN, you must also specify values for
     *        <code>MinimumProtocolVerison</code> and <code>SSLSupportMethod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withACMCertificateArn(String aCMCertificateArn) {
        setACMCertificateArn(aCMCertificateArn);
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers the
     * distribution accepts HTTPS connections from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     * recommended. Most browsers and clients released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t support
     * SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, don’t set
     * a value for this field.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers
     *        the distribution accepts HTTPS connections from.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     *        href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     *        recommended. Most browsers and clients released after 2010 support SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t
     *        support SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *        don’t set a value for this field.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(String sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers the
     * distribution accepts HTTPS connections from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     * recommended. Most browsers and clients released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t support
     * SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, don’t set
     * a value for this field.
     * </p>
     * 
     * @return If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers
     *         the distribution accepts HTTPS connections from.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     *         href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     *         recommended. Most browsers and clients released after 2010 support SNI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t
     *         support SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *         don’t set a value for this field.
     * @see SSLSupportMethod
     */

    public String getSSLSupportMethod() {
        return this.sSLSupportMethod;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers the
     * distribution accepts HTTPS connections from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     * recommended. Most browsers and clients released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t support
     * SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, don’t set
     * a value for this field.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers
     *        the distribution accepts HTTPS connections from.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     *        href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     *        recommended. Most browsers and clients released after 2010 support SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t
     *        support SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *        don’t set a value for this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSLSupportMethod
     */

    public ViewerCertificate withSSLSupportMethod(String sSLSupportMethod) {
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers the
     * distribution accepts HTTPS connections from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     * recommended. Most browsers and clients released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t support
     * SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, don’t set
     * a value for this field.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers
     *        the distribution accepts HTTPS connections from.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     *        href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     *        recommended. Most browsers and clients released after 2010 support SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t
     *        support SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *        don’t set a value for this field.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        withSSLSupportMethod(sSLSupportMethod);
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers the
     * distribution accepts HTTPS connections from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     * href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     * recommended. Most browsers and clients released after 2010 support SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t support
     * SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>, don’t set
     * a value for this field.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify which viewers
     *        the distribution accepts HTTPS connections from.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code> – The distribution accepts HTTPS connections from only viewers that support <a
     *        href="https://en.wikipedia.org/wiki/Server_Name_Indication">server name indication (SNI)</a>. This is
     *        recommended. Most browsers and clients released after 2010 support SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code> – The distribution accepts HTTPS connections from all viewers including those that don’t
     *        support SNI. This is not recommended, and results in additional monthly charges from CloudFront.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>,
     *        don’t set a value for this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSLSupportMethod
     */

    public ViewerCertificate withSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod.toString();
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security policy
     * that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices that
     * don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must specify
     * <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets the security
     * policy to <code>TLSv1</code> regardless of the value that you set here.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security
     *        policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines
     *        two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *        >Security Policy</a> and <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices
     *        that don’t support TLSv1.2.
     *        </p>
     *        <p>
     *        When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must
     *        specify <code>TLSv1</code> or higher.
     *        </p>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>
     *        (you set <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets
     *        the security policy to <code>TLSv1</code> regardless of the value that you set here.
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security policy
     * that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices that
     * don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must specify
     * <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets the security
     * policy to <code>TLSv1</code> regardless of the value that you set here.
     * </p>
     * 
     * @return If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security
     *         policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines
     *         two settings:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *         >Security Policy</a> and <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *         >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     *         Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         On the CloudFront console, this setting is called <b>Security Policy</b>.
     *         </p>
     *         </note>
     *         <p>
     *         We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices
     *         that don’t support TLSv1.2.
     *         </p>
     *         <p>
     *         When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must
     *         specify <code>TLSv1</code> or higher.
     *         </p>
     *         <p>
     *         If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>
     *         (you set <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets
     *         the security policy to <code>TLSv1</code> regardless of the value that you set here.
     * @see MinimumProtocolVersion
     */

    public String getMinimumProtocolVersion() {
        return this.minimumProtocolVersion;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security policy
     * that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices that
     * don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must specify
     * <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets the security
     * policy to <code>TLSv1</code> regardless of the value that you set here.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security
     *        policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines
     *        two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *        >Security Policy</a> and <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices
     *        that don’t support TLSv1.2.
     *        </p>
     *        <p>
     *        When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must
     *        specify <code>TLSv1</code> or higher.
     *        </p>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>
     *        (you set <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets
     *        the security policy to <code>TLSv1</code> regardless of the value that you set here.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(String minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security policy
     * that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices that
     * don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must specify
     * <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets the security
     * policy to <code>TLSv1</code> regardless of the value that you set here.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security
     *        policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines
     *        two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *        >Security Policy</a> and <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices
     *        that don’t support TLSv1.2.
     *        </p>
     *        <p>
     *        When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must
     *        specify <code>TLSv1</code> or higher.
     *        </p>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>
     *        (you set <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets
     *        the security policy to <code>TLSv1</code> regardless of the value that you set here.
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(MinimumProtocolVersion minimumProtocolVersion) {
        withMinimumProtocolVersion(minimumProtocolVersion);
    }

    /**
     * <p>
     * If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security policy
     * that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     * >Security Policy</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices that
     * don’t support TLSv1.2.
     * </p>
     * <p>
     * When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must specify
     * <code>TLSv1</code> or higher.
     * </p>
     * <p>
     * If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code> (you set
     * <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets the security
     * policy to <code>TLSv1</code> regardless of the value that you set here.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), specify the security
     *        policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines
     *        two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy"
     *        >Security Policy</a> and <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        >Supported Protocols and Ciphers Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.2_2018</code> unless your viewers are using browsers or devices
     *        that don’t support TLSv1.2.
     *        </p>
     *        <p>
     *        When you’re using SNI only (you set <code>SSLSupportMethod</code> to <code>sni-only</code>), you must
     *        specify <code>TLSv1</code> or higher.
     *        </p>
     *        <p>
     *        If the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>
     *        (you set <code>CloudFrontDefaultCertificate</code> to <code>true</code>), CloudFront automatically sets
     *        the security policy to <code>TLSv1</code> regardless of the value that you set here.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(MinimumProtocolVersion minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion.toString();
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        This field is deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudFrontDefaultCertificate</code>
     *        </p>
     *        </li>
     */
    @Deprecated
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return This field is deprecated. Use one of the following fields instead:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IAMCertificateId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CloudFrontDefaultCertificate</code>
     *         </p>
     *         </li>
     */
    @Deprecated
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        This field is deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudFrontDefaultCertificate</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ViewerCertificate withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudFrontDefaultCertificate</code>
     *        </p>
     *        </li>
     * @see CertificateSource
     */
    @Deprecated
    public void setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return This field is deprecated. Use one of the following fields instead:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACMCertificateArn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IAMCertificateId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CloudFrontDefaultCertificate</code>
     *         </p>
     *         </li>
     * @see CertificateSource
     */
    @Deprecated
    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudFrontDefaultCertificate</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateSource
     */
    @Deprecated
    public ViewerCertificate withCertificateSource(String certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudFrontDefaultCertificate</code>
     *        </p>
     *        </li>
     * @see CertificateSource
     */
    @Deprecated
    public void setCertificateSource(CertificateSource certificateSource) {
        withCertificateSource(certificateSource);
    }

    /**
     * <p>
     * This field is deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACMCertificateArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudFrontDefaultCertificate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACMCertificateArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudFrontDefaultCertificate</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateSource
     */
    @Deprecated
    public ViewerCertificate withCertificateSource(CertificateSource certificateSource) {
        this.certificateSource = certificateSource.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCloudFrontDefaultCertificate() != null)
            sb.append("CloudFrontDefaultCertificate: ").append(getCloudFrontDefaultCertificate()).append(",");
        if (getIAMCertificateId() != null)
            sb.append("IAMCertificateId: ").append(getIAMCertificateId()).append(",");
        if (getACMCertificateArn() != null)
            sb.append("ACMCertificateArn: ").append(getACMCertificateArn()).append(",");
        if (getSSLSupportMethod() != null)
            sb.append("SSLSupportMethod: ").append(getSSLSupportMethod()).append(",");
        if (getMinimumProtocolVersion() != null)
            sb.append("MinimumProtocolVersion: ").append(getMinimumProtocolVersion()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getCertificateSource() != null)
            sb.append("CertificateSource: ").append(getCertificateSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewerCertificate == false)
            return false;
        ViewerCertificate other = (ViewerCertificate) obj;
        if (other.getCloudFrontDefaultCertificate() == null ^ this.getCloudFrontDefaultCertificate() == null)
            return false;
        if (other.getCloudFrontDefaultCertificate() != null && other.getCloudFrontDefaultCertificate().equals(this.getCloudFrontDefaultCertificate()) == false)
            return false;
        if (other.getIAMCertificateId() == null ^ this.getIAMCertificateId() == null)
            return false;
        if (other.getIAMCertificateId() != null && other.getIAMCertificateId().equals(this.getIAMCertificateId()) == false)
            return false;
        if (other.getACMCertificateArn() == null ^ this.getACMCertificateArn() == null)
            return false;
        if (other.getACMCertificateArn() != null && other.getACMCertificateArn().equals(this.getACMCertificateArn()) == false)
            return false;
        if (other.getSSLSupportMethod() == null ^ this.getSSLSupportMethod() == null)
            return false;
        if (other.getSSLSupportMethod() != null && other.getSSLSupportMethod().equals(this.getSSLSupportMethod()) == false)
            return false;
        if (other.getMinimumProtocolVersion() == null ^ this.getMinimumProtocolVersion() == null)
            return false;
        if (other.getMinimumProtocolVersion() != null && other.getMinimumProtocolVersion().equals(this.getMinimumProtocolVersion()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateSource() == null ^ this.getCertificateSource() == null)
            return false;
        if (other.getCertificateSource() != null && other.getCertificateSource().equals(this.getCertificateSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFrontDefaultCertificate() == null) ? 0 : getCloudFrontDefaultCertificate().hashCode());
        hashCode = prime * hashCode + ((getIAMCertificateId() == null) ? 0 : getIAMCertificateId().hashCode());
        hashCode = prime * hashCode + ((getACMCertificateArn() == null) ? 0 : getACMCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSSLSupportMethod() == null) ? 0 : getSSLSupportMethod().hashCode());
        hashCode = prime * hashCode + ((getMinimumProtocolVersion() == null) ? 0 : getMinimumProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateSource() == null) ? 0 : getCertificateSource().hashCode());
        return hashCode;
    }

    @Override
    public ViewerCertificate clone() {
        try {
            return (ViewerCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
